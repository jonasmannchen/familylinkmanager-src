package com.google.android.libraries.performance.primes.metriccapture;

import android.content.Context;
import android.content.pm.IPackageStatsObserver;
import android.content.pm.PackageManager;
import android.content.pm.PackageStats;
import android.os.Build;
import android.os.Process;
import flm.dkm;
import flm.dph;
import flm.dpi;
import flm.dpj;
import flm.dpk;
import flm.dsg;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class PackageStatsCapture {
    public static final PackageStatsInvocation[] GETTER_INVOCATIONS = {new dph("getPackageSizeInfo", new Class[]{String.class, IPackageStatsObserver.class}), new dpi("getPackageSizeInfo", new Class[]{String.class, Integer.TYPE, IPackageStatsObserver.class}), new dpj("getPackageSizeInfoAsUser", new Class[]{String.class, Integer.TYPE, IPackageStatsObserver.class})};

    private PackageStatsCapture() {
    }

    /* JADX INFO: compiled from: PG */
    final class PackageStatsCallback extends IPackageStatsObserver.Stub {
        public final Semaphore a = new Semaphore(1);
        public volatile PackageStats b;

        PackageStatsCallback() {
        }

        public final void onGetStatsCompleted(PackageStats packageStats, boolean z) {
            if (z) {
                String strValueOf = String.valueOf(packageStats);
                dkm.a(3, "PackageStatsCapture", new StringBuilder(String.valueOf(strValueOf).length() + 30).append("Success getting PackageStats: ").append(strValueOf).toString(), new Object[0]);
                this.b = packageStats;
            } else {
                dkm.a(5, "PackageStatsCapture", "Failure getting PackageStats", new Object[0]);
            }
            this.a.release();
        }
    }

    private static boolean a() {
        try {
            return !Modifier.isAbstract(PackageStatsCallback.class.getMethod("onGetStatsCompleted", PackageStats.class, Boolean.TYPE).getModifiers());
        } catch (Error | Exception e) {
            dkm.a("PackageStatsCapture", "failure", e, new Object[0]);
            return false;
        }
    }

    /* JADX INFO: compiled from: PG */
    public abstract class PackageStatsInvocation {
        private final String a;
        private final Class[] b;

        public PackageStatsInvocation(String str, Class[] clsArr) {
            this.a = str;
            this.b = clsArr;
        }

        public abstract Object[] a(String str, int i, IPackageStatsObserver iPackageStatsObserver);

        boolean invoke(PackageManager packageManager, String str, int i, IPackageStatsObserver iPackageStatsObserver) {
            try {
                packageManager.getClass().getMethod(this.a, this.b).invoke(packageManager, a(str, i, iPackageStatsObserver));
                return true;
            } catch (Error e) {
                e = e;
                StringBuilder sb = new StringBuilder();
                sb.append(e.getClass().getSimpleName()).append(" for ").append(this.a).append('(').append(Arrays.asList(this.b)).append(") invocation");
                dkm.a(4, "PackageStatsCapture", sb.toString(), new Object[0]);
                return false;
            } catch (NoSuchMethodException e2) {
                dkm.a("PackageStatsCapture", "PackageStats getter not found", e2, new Object[0]);
                return false;
            } catch (Exception e3) {
                e = e3;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(e.getClass().getSimpleName()).append(" for ").append(this.a).append('(').append(Arrays.asList(this.b)).append(") invocation");
                dkm.a(4, "PackageStatsCapture", sb2.toString(), new Object[0]);
                return false;
            }
        }
    }

    static PackageStats getPackageStatsUsingInternalAPI(Context context, long j, PackageStatsInvocation... packageStatsInvocationArr) {
        PackageStats packageStats = null;
        if (!a()) {
            dkm.a(5, "PackageStatsCapture", "Callback implementation stripped by proguard.", new Object[0]);
        } else {
            PackageStatsCallback packageStatsCallback = new PackageStatsCallback();
            try {
                packageStatsCallback.a.acquire();
                PackageManager packageManager = context.getPackageManager();
                String packageName = context.getPackageName();
                int iMyUid = Process.myUid();
                for (PackageStatsInvocation packageStatsInvocation : packageStatsInvocationArr) {
                    if (packageStatsInvocation.invoke(packageManager, packageName, iMyUid, packageStatsCallback)) {
                        dkm.a(4, "PackageStatsCapture", "Success invoking PackageStats capture.", new Object[0]);
                        if (packageStatsCallback.a.tryAcquire(j, TimeUnit.MILLISECONDS)) {
                            packageStats = packageStatsCallback.b;
                        } else {
                            dkm.a(5, "PackageStatsCapture", "Timeout while waiting for PackageStats callback", new Object[0]);
                        }
                    }
                }
                dkm.a(5, "PackageStatsCapture", "Couldn't capture PackageStats.", new Object[0]);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        return packageStats;
    }

    public static PackageStats getPackageStats(Context context) {
        dsg.b();
        if (Build.VERSION.SDK_INT >= 26) {
            return dpk.a(context);
        }
        if (context.getPackageManager().checkPermission("android.permission.GET_PACKAGE_SIZE", context.getPackageName()) == 0 || context.checkCallingOrSelfPermission("android.permission.GET_PACKAGE_SIZE") == 0) {
            return getPackageStatsUsingInternalAPI(context, 15000L, GETTER_INVOCATIONS);
        }
        dkm.a(5, "PackageStatsCapture", "android.permission.GET_PACKAGE_SIZE required", new Object[0]);
        return null;
    }
}

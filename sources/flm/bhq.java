package flm;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Binder;
import android.os.Build;
import android.os.Process;
import android.util.Log;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bhq {
    public static final int a = Process.myUid();
    private static final azl b = azl.a("android_id", (Long) 0L);
    private static boolean c;
    private static volatile String d;
    private static volatile Long e;
    private static Boolean f;
    private static String g;
    private static volatile boolean h;

    public static boolean a() {
        boolean zBooleanValue;
        synchronized (bhq.class) {
            if (f == null) {
                f = Boolean.valueOf("1".equals(biz.a("ro.kernel.qemu", "0")) || Build.HARDWARE.contains("ranchu"));
            }
            zBooleanValue = f.booleanValue();
        }
        return zBooleanValue;
    }

    public static long a(Context context) {
        if (dfj.a(context)) {
            Log.w("AndroidUtils", "getAndroidId is called in direct boot mode.");
            return 0L;
        }
        if (((fou) fot.a.a()).a()) {
            if (e == null || e.longValue() == 0) {
                try {
                    e = Long.valueOf((String) dbp.a(new anm(context).a(0, new ano()), 1000L, TimeUnit.MILLISECONDS));
                } catch (InterruptedException | NumberFormatException | ExecutionException | TimeoutException e2) {
                    if (e2 instanceof InterruptedException) {
                        Thread.currentThread().interrupt();
                    }
                    Log.e("AndroidUtils", "Failed to get Android ID", e2);
                    e = 0L;
                }
            }
            return e.longValue();
        }
        return bab.a(b);
    }

    @TargetApi(24)
    @Deprecated
    public static Context b(Context context) {
        if (biw.b() && !context.isDeviceProtectedStorage()) {
            return context.createDeviceProtectedStorageContext();
        }
        return context;
    }

    public static void a(Context context, String str) {
        int callingUid = Binder.getCallingUid();
        if (callingUid == a || aqw.a(context, callingUid, str)) {
        } else {
            throw new SecurityException(String.format("Unknown calling package name '%s'.", str));
        }
    }

    public static boolean b() {
        return Binder.getCallingUid() == a;
    }

    private bhq() {
    }

    public static void c() {
    }

    public static boolean c(Context context) {
        return context.getPackageManager().hasSystemFeature("org.chromium.arc");
    }

    static {
        new AtomicInteger();
        c = false;
        d = null;
        e = null;
        g = null;
        h = true;
    }
}

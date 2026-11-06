package flm;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Process;
import android.os.StrictMode;
import android.os.UserManager;
import android.util.Log;
import java.util.HashSet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class azl {
    private static Context f;
    private static HashSet g;
    public final String c;
    public final Object d;
    private Object h = null;
    private static final Object e = new Object();
    public static azq a = null;
    public static int b = 0;

    /* JADX WARN: Code duplicated, block: B:31:0x0034 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static void a(Context context, HashSet hashSet) {
        synchronized (e) {
            if (a == null) {
                azr azrVar = new azr(context.getContentResolver());
                synchronized (e) {
                    a = azrVar;
                    g = null;
                    f = null;
                    if (context != null && a(context)) {
                        g = hashSet;
                        f = context.getApplicationContext().createDeviceProtectedStorageContext();
                    }
                }
                if (b == 0) {
                    try {
                        b = context.getPackageManager().getApplicationInfo("com.google.android.gms", 0).uid;
                    } catch (PackageManager.NameNotFoundException e2) {
                        Log.e("GservicesValue", e2.toString());
                    }
                }
            } else if (b == 0) {
                b = context.getPackageManager().getApplicationInfo("com.google.android.gms", 0).uid;
            }
            throw th;
        }
    }

    protected abstract Object a(String str);

    public static boolean a() {
        boolean z;
        synchronized (e) {
            z = a != null;
        }
        return z;
    }

    protected azl(String str, Object obj) {
        this.c = str;
        this.d = obj;
    }

    @TargetApi(24)
    protected Object a(Context context, String str, Object obj) {
        throw new UnsupportedOperationException("The Gservices classes used does not support direct-boot");
    }

    public final Object b() {
        boolean z;
        HashSet hashSet;
        Context context;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        synchronized (e) {
            z = f != null && a(f);
            hashSet = g;
            context = f;
        }
        if (z) {
            if (hashSet != null && !hashSet.contains(this.c)) {
                String strValueOf = String.valueOf(this.c);
                Log.e("GservicesValue", strValueOf.length() != 0 ? "Gservices key not whitelisted for directboot access: ".concat(strValueOf) : new String("Gservices key not whitelisted for directboot access: "));
                return this.d;
            }
            return a(context, this.c, this.d);
        }
        synchronized (e) {
            g = null;
            f = null;
        }
        try {
            try {
                Object objA = a(this.c);
                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                return objA;
            } catch (SecurityException e2) {
                long jClearCallingIdentity = Binder.clearCallingIdentity();
                try {
                    Object objA2 = a(this.c);
                    Binder.restoreCallingIdentity(jClearCallingIdentity);
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                    return objA2;
                } catch (Throwable th) {
                    Binder.restoreCallingIdentity(jClearCallingIdentity);
                    throw th;
                }
            }
        } catch (Throwable th2) {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            throw th2;
        }
    }

    @TargetApi(24)
    private static boolean a(Context context) {
        if (!biw.b()) {
            return false;
        }
        UserManager userManager = (UserManager) context.getSystemService(UserManager.class);
        if (userManager.isUserUnlocked()) {
            return false;
        }
        return userManager.isUserRunning(Process.myUserHandle());
    }

    public static azl a(String str, boolean z) {
        return new azm(str, Boolean.valueOf(z));
    }

    public static azl a(String str, Long l) {
        return new azn(str, l);
    }

    public static azl a(String str, Integer num) {
        return new azo(str, num);
    }

    public static azl a(String str, String str2) {
        return new azp(str, str2);
    }
}

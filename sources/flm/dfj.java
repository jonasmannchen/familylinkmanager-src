package flm;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.os.UserManager;
import android.util.Log;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class dfj {
    private static volatile UserManager a;
    private static volatile boolean b;

    private dfj() {
    }

    public static boolean a() {
        return Build.VERSION.SDK_INT >= 24;
    }

    public static boolean a(Context context) {
        return a() && !d(context);
    }

    public static boolean b(Context context) {
        return !a() || d(context);
    }

    @TargetApi(24)
    private static boolean d(Context context) {
        boolean z;
        boolean z2 = b;
        if (!z2) {
            int i = 1;
            boolean z3 = z2;
            while (true) {
                if (i > 2) {
                    z = z3;
                    break;
                }
                UserManager userManagerE = e(context);
                if (userManagerE == null) {
                    b = true;
                    return true;
                }
                try {
                    z3 = userManagerE.isUserUnlocked() || !userManagerE.isUserRunning(Process.myUserHandle());
                    b = z3;
                    z = z3;
                    break;
                } catch (NullPointerException e) {
                    Log.w("DirectBootUtils", "Failed to check if user is unlocked", e);
                    a = null;
                    i++;
                }
            }
            if (z) {
                a = null;
                return z;
            }
            return z;
        }
        return z2;
    }

    @TargetApi(24)
    private static UserManager e(Context context) {
        UserManager userManager = a;
        if (userManager == null) {
            synchronized (dfj.class) {
                userManager = a;
                if (userManager == null) {
                    userManager = (UserManager) context.getSystemService(UserManager.class);
                    a = userManager;
                }
            }
        }
        return userManager;
    }

    @TargetApi(24)
    public static Context c(Context context) {
        return context.isDeviceProtectedStorage() ? context : context.createDeviceProtectedStorageContext();
    }

    static {
        b = !a();
    }
}

package flm;

import android.annotation.TargetApi;
import android.app.AppOpsManager;
import android.content.pm.PackageInfo;
import android.os.Build;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bsu {
    private static final int[] a = {0, 1, 5, 8, 9, 10, 12, 14, 16};

    public static void a(String str, AppOpsManager appOpsManager, PackageInfo packageInfo, int i) {
        int i2 = packageInfo.applicationInfo.uid;
        String str2 = packageInfo.packageName;
        if (Build.VERSION.SDK_INT >= 28) {
            a(str, appOpsManager, "android:system_alert_window", i2, str2, i);
        } else {
            a(str, appOpsManager, i2, str2, "OP_SYSTEM_ALERT_WINDOW", i);
        }
    }

    public static void a(String str, AppOpsManager appOpsManager, int i, String str2) {
        btv.a(str, "Setting op %s to MODE_ALLOWED", "android:get_usage_stats");
        if (Build.VERSION.SDK_INT >= 28) {
            a(str, appOpsManager, "android:get_usage_stats", i, str2, 0);
        } else {
            a(str, appOpsManager, i, str2, "OP_GET_USAGE_STATS", 0);
        }
    }

    public static boolean a(String str, AppOpsManager appOpsManager, PackageInfo packageInfo) {
        int iB;
        int i = packageInfo.applicationInfo.uid;
        String str2 = packageInfo.packageName;
        if (Build.VERSION.SDK_INT >= 23) {
            iB = appOpsManager.checkOpNoThrow("android:system_alert_window", i, str2);
        } else {
            iB = b(str, appOpsManager, i, str2);
        }
        switch (iB) {
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
                return true;
            case 1:
            case 2:
            default:
                return false;
            case 3:
                String[] strArr = packageInfo.requestedPermissions;
                if (strArr == null) {
                    return false;
                }
                for (int i2 = 0; i2 < strArr.length; i2++) {
                    if ("android.permission.SYSTEM_ALERT_WINDOW".equals(strArr[i2])) {
                        return (packageInfo.requestedPermissionsFlags[i2] & 2) != 0;
                    }
                }
                return false;
        }
    }

    public static void a(String str, boolean z) {
        try {
            Method method = AppOpsManager.class.getMethod("setRestriction", Integer.TYPE, Integer.TYPE, Integer.TYPE, String[].class);
            int i = AppOpsManager.class.getField("OP_VIBRATE").getInt(null);
            int i2 = AppOpsManager.class.getField("OP_PLAY_AUDIO").getInt(null);
            AppOpsManager appOpsManager = (AppOpsManager) ayt.a().getSystemService("appops");
            int i3 = (!z || fra.d()) ? 0 : 1;
            for (int i4 : a) {
                try {
                    method.invoke(appOpsManager, Integer.valueOf(i), Integer.valueOf(i4), Integer.valueOf(i3), null);
                    method.invoke(appOpsManager, Integer.valueOf(i2), Integer.valueOf(i4), Integer.valueOf(i3), null);
                } catch (ReflectiveOperationException e) {
                    btv.a(str, e, "Failed to mute usage=%s", Integer.valueOf(i4));
                }
            }
        } catch (ReflectiveOperationException e2) {
            btv.c(str, e2, "Failed to find muting method", new Object[0]);
            btt.a(str, e2, "Failed to find muting method", new Object[0]);
        }
    }

    @TargetApi(28)
    private static void a(String str, AppOpsManager appOpsManager, String str2, int i, String str3, int i2) {
        try {
            appOpsManager.setMode(str2, i, str3, i2);
        } catch (SecurityException e) {
            btv.c(str, e, "Failed to setMode due to security reason!", new Object[0]);
            btt.a(str, e, "Failed to setMode due to security reason!", new Object[0]);
        }
    }

    @TargetApi(27)
    private static void a(String str, AppOpsManager appOpsManager, int i, String str2, String str3, int i2) {
        try {
            AppOpsManager.class.getMethod("setMode", Integer.TYPE, Integer.TYPE, String.class, Integer.TYPE).invoke(appOpsManager, Integer.valueOf(AppOpsManager.class.getField(str3).getInt(null)), Integer.valueOf(i), str2, Integer.valueOf(i2));
        } catch (ReflectiveOperationException e) {
            btv.c(str, e, "Failed to set SYSTEM_ALERT_WINDOW op for %s", str2);
            btt.a(str, e, "Failed to set SYSTEM_ALERT_WINDOW op for %s", str2);
        }
    }

    @TargetApi(27)
    private static int b(String str, AppOpsManager appOpsManager, int i, String str2) {
        try {
            return ((Integer) dvl.a(AppOpsManager.class.getMethod("checkOpNoThrow", Integer.TYPE, Integer.TYPE, String.class).invoke(appOpsManager, Integer.valueOf(AppOpsManager.class.getField("OP_SYSTEM_ALERT_WINDOW").getInt(null)), Integer.valueOf(i), str2))).intValue();
        } catch (ReflectiveOperationException e) {
            btv.c(str, e, "Failed to check SYSTEM_ALERT_WINDOW op for %s", str2);
            btt.a(str, e, "Failed to check SYSTEM_ALERT_WINDOW op for %s", str2);
            return 2;
        }
    }
}

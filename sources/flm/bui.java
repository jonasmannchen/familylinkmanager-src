package flm;

import android.annotation.TargetApi;
import android.app.admin.DevicePolicyManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PermissionInfo;
import android.os.Build;
import com.google.android.gms.common.app.BaseApplicationContext;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@TargetApi(23)
public final class bui {
    private static final String[] a = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION", "android.permission.PACKAGE_USAGE_STATS", "android.permission.READ_EXTERNAL_STORAGE", "android.permission.READ_PHONE_STATE", "android.permission.SET_TIME_ZONE"};

    public static void a(String str) {
        if (Build.VERSION.SDK_INT < 23) {
            return;
        }
        BaseApplicationContext baseApplicationContextA = ayt.a();
        PackageManager packageManager = baseApplicationContextA.getPackageManager();
        DevicePolicyManager devicePolicyManager = (DevicePolicyManager) baseApplicationContextA.getSystemService("device_policy");
        for (String str2 : a) {
            a(str, (Context) baseApplicationContextA, packageManager, devicePolicyManager, str2);
        }
        a(str, "com.google.android.apps.kids.familylinkmanager", "android.permission-group.PHONE", true, true);
    }

    public static boolean a(String str, String str2) {
        if (Build.VERSION.SDK_INT < 23) {
            return true;
        }
        BaseApplicationContext baseApplicationContextA = ayt.a();
        if (baseApplicationContextA.checkSelfPermission(str2) == 0) {
            btv.a(str, "Self permission granted already:%s", str2);
            return true;
        }
        a(str, (Context) baseApplicationContextA, baseApplicationContextA.getPackageManager(), (DevicePolicyManager) baseApplicationContextA.getSystemService("device_policy"), str2);
        return baseApplicationContextA.checkSelfPermission(str2) == 0;
    }

    private static void a(String str, Context context, PackageManager packageManager, DevicePolicyManager devicePolicyManager, String str2) {
        try {
            PermissionInfo permissionInfo = packageManager.getPermissionInfo(str2, 0);
            if (permissionInfo.group == null) {
                devicePolicyManager.setPermissionGrantState(btb.a, context.getPackageName(), str2, 1);
            } else {
                a(str, context.getPackageName(), permissionInfo.group, true, true);
            }
        } catch (PackageManager.NameNotFoundException e) {
            btv.d(str, "Permission not found: %s", str2);
        }
    }

    static boolean a(String str, String str2, String str3, boolean z, boolean z2) {
        if (Build.VERSION.SDK_INT < 23) {
            return true;
        }
        try {
            return a(str, Collections.singletonList(ayt.a().getPackageManager().getPackageInfo(str2, 4096)), str3, z ? 1 : 2, z2);
        } catch (PackageManager.NameNotFoundException e) {
            btv.d(str, "Can't find package to grant permission: %s", str2);
            return false;
        }
    }

    public static boolean a(String str, List list, String str2, boolean z) {
        return a(str, list, str2, 3, z);
    }

    private static boolean a(String str, List list, String str2, int i, boolean z) {
        String[] strArr;
        int i2;
        if (Build.VERSION.SDK_INT < 23) {
            return true;
        }
        BaseApplicationContext baseApplicationContextA = ayt.a();
        DevicePolicyManager devicePolicyManager = (DevicePolicyManager) baseApplicationContextA.getSystemService("device_policy");
        Set setA = a(str, baseApplicationContextA.getPackageManager(), str2);
        if (setA.isEmpty()) {
            return true;
        }
        Iterator it = list.iterator();
        boolean permissionGrantState = true;
        while (it.hasNext()) {
            PackageInfo packageInfo = (PackageInfo) it.next();
            if (packageInfo.applicationInfo.targetSdkVersion >= 23 && (strArr = packageInfo.requestedPermissions) != null && strArr.length != 0) {
                HashSet<String> hashSet = new HashSet();
                boolean z2 = false;
                for (int i3 = 0; i3 < strArr.length; i3++) {
                    String str3 = strArr[i3];
                    if (setA.contains(str3)) {
                        hashSet.add(str3);
                        if ((packageInfo.requestedPermissionsFlags[i3] & 2) == 2) {
                            z2 = true;
                        }
                    }
                }
                String str4 = packageInfo.packageName;
                for (String str5 : hashSet) {
                    switch (i) {
                        case 1:
                            permissionGrantState &= devicePolicyManager.setPermissionGrantState(btb.a, str4, str5, 1);
                            break;
                        case 2:
                            permissionGrantState &= devicePolicyManager.setPermissionGrantState(btb.a, str4, str5, 2);
                            break;
                        case 3:
                            ComponentName componentName = btb.a;
                            if (z2) {
                                i2 = 1;
                            } else {
                                i2 = 2;
                            }
                            permissionGrantState &= devicePolicyManager.setPermissionGrantState(componentName, str4, str5, i2);
                            break;
                        default:
                            btv.d(str, "Unknown target permission state mode:%s", Integer.valueOf(i));
                            return false;
                    }
                    if (!z) {
                        permissionGrantState &= devicePolicyManager.setPermissionGrantState(btb.a, str4, str5, 0);
                    }
                }
            }
        }
        if (!permissionGrantState) {
            btv.e(str, "Failed to set permission state of permission group %s to mode %s", str2, Integer.valueOf(i));
            return permissionGrantState;
        }
        return permissionGrantState;
    }

    private static Set a(String str, PackageManager packageManager, String str2) {
        HashSet hashSet = new HashSet();
        try {
            Iterator<PermissionInfo> it = packageManager.queryPermissionsByGroup(str2, 0).iterator();
            while (it.hasNext()) {
                hashSet.add(it.next().name);
            }
            return hashSet;
        } catch (PackageManager.NameNotFoundException e) {
            btv.d(str, "Unknown permission group:%s", str2);
            return hashSet;
        }
    }
}

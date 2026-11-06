package flm;

import android.app.admin.DevicePolicyManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PermissionInfo;
import android.os.UserManager;
import android.telephony.TelephonyManager;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class bxl {
    public final Context a = ayt.a();
    public final PackageManager b = this.a.getPackageManager();
    public final TelephonyManager c = (TelephonyManager) this.a.getSystemService("phone");
    public final DevicePolicyManager d = (DevicePolicyManager) this.a.getSystemService("device_policy");
    public final UserManager e = (UserManager) this.a.getSystemService("user");
    private final Map f = new HashMap();

    bxl() {
    }

    final List a() {
        int i;
        try {
            PackageInfo packageInfo = this.b.getPackageInfo(this.a.getPackageName(), 0);
            ewy ewyVar = (ewy) ((fio) ewx.d.a(dp.au, (Object) null));
            exx exxVar = (exx) ((fio) exw.f.a(dp.au, (Object) null));
            String str = packageInfo.versionName;
            exxVar.c();
            exw exwVar = (exw) exxVar.a;
            if (str == null) {
                throw new NullPointerException();
            }
            exwVar.a |= 1;
            exwVar.b = str;
            int i2 = packageInfo.versionCode;
            exxVar.c();
            exw exwVar2 = (exw) exxVar.a;
            exwVar2.a |= 2;
            exwVar2.c = i2;
            long jA = bip.a(packageInfo.versionName);
            exxVar.c();
            exw exwVar3 = (exw) exxVar.a;
            exwVar3.a |= 4;
            exwVar3.d = jA;
            long jB = bip.b(packageInfo.versionName);
            if (jB == -1) {
                i = -1;
            } else {
                i = (int) (jB / 10000);
            }
            exxVar.c();
            exw exwVar4 = (exw) exxVar.a;
            exwVar4.a |= 8;
            exwVar4.e = i;
            ewyVar.c();
            ewx ewxVar = (ewx) ewyVar.a;
            ewxVar.c = (fin) exxVar.h();
            ewxVar.b = 2;
            return Collections.singletonList((ewx) ((fin) ewyVar.h()));
        } catch (PackageManager.NameNotFoundException e) {
            btv.c("Report", e, "Can't get self package info!", new Object[0]);
            btt.a("Report", e, "Can't get self package info!", new Object[0]);
            return Collections.emptyList();
        }
    }

    static MessageDigest b() {
        try {
            return MessageDigest.getInstance("SHA-1");
        } catch (NoSuchAlgorithmException e) {
            btv.c("Report", e, "Can't find MessageDigest", new Object[0]);
            return null;
        }
    }

    final Map a(PackageInfo packageInfo) {
        PermissionInfo permissionInfo;
        PermissionInfo permissionInfo2;
        HashMap map = new HashMap();
        if (packageInfo.requestedPermissions == null || packageInfo.requestedPermissions.length == 0) {
            return map;
        }
        for (int i = 0; i < packageInfo.requestedPermissions.length; i++) {
            String str = packageInfo.requestedPermissions[i];
            boolean zBooleanValue = (packageInfo.requestedPermissionsFlags[i] & 2) == 2;
            if (this.f.containsKey(str)) {
                permissionInfo2 = (PermissionInfo) this.f.get(str);
            } else {
                try {
                    permissionInfo = this.b.getPermissionInfo(str, 0);
                    try {
                        if (permissionInfo.protectionLevel != 1) {
                            permissionInfo = null;
                        }
                    } catch (PackageManager.NameNotFoundException e) {
                        btv.a("Report", "Unknown permission %s requested by %s", str, packageInfo.packageName);
                    }
                } catch (PackageManager.NameNotFoundException e2) {
                    permissionInfo = null;
                }
                this.f.put(str, permissionInfo);
                permissionInfo2 = permissionInfo;
            }
            if (permissionInfo2 != null) {
                if (permissionInfo2.group == null) {
                    btv.d("Report", "Permission group is null: %s/%s with protection level %s", packageInfo.packageName, str, Integer.valueOf(permissionInfo2.protectionLevel));
                }
                if (map.containsKey(permissionInfo2.group)) {
                    zBooleanValue |= ((Boolean) map.get(permissionInfo2.group)).booleanValue();
                }
                map.put(permissionInfo2.group, Boolean.valueOf(zBooleanValue));
            }
        }
        return map;
    }
}

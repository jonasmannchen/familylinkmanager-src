package flm;

import android.app.AppOpsManager;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.provider.Settings;
import com.google.android.chimeraresources.R;
import com.google.android.gms.common.app.BaseApplicationContext;
import com.google.android.gms.kids.database.SupervisionDatabase;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class byz {
    public static final int a = R.drawable.quantum_ic_schedule_white_24;

    public static Intent a() {
        return new Intent().setAction("android.intent.action.MAIN").addCategory("android.intent.category.HOME").addFlags(268435456);
    }

    public static IntentFilter b() {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.MAIN");
        intentFilter.addCategory("android.intent.category.DEFAULT");
        intentFilter.addCategory("android.intent.category.HOME");
        return intentFilter;
    }

    public static void a(boolean z) {
        boolean z2;
        if (Build.VERSION.SDK_INT >= 23) {
            boolean z3 = z & (!fra.c());
            AppOpsManager appOpsManager = (AppOpsManager) ayt.a().getSystemService(AppOpsManager.class);
            if (appOpsManager != null) {
                buy buyVarJ = SupervisionDatabase.h().j();
                BaseApplicationContext baseApplicationContextA = ayt.a();
                PackageManager packageManager = baseApplicationContextA.getPackageManager();
                String packageName = baseApplicationContextA.getPackageName();
                List<PackageInfo> installedPackages = packageManager.getInstalledPackages(4096);
                ArrayList<PackageInfo> arrayList = new ArrayList();
                for (PackageInfo packageInfo : installedPackages) {
                    if ((packageInfo.applicationInfo.flags & bbv.DEFAULT_BIND_FLAGS) == 0 && !packageName.equals(packageInfo.packageName)) {
                        String[] strArr = packageInfo.requestedPermissions;
                        if (strArr == null) {
                            z2 = false;
                        } else {
                            int length = strArr.length;
                            int i = 0;
                            while (true) {
                                if (i < length) {
                                    if ("android.permission.SYSTEM_ALERT_WINDOW".equals(strArr[i])) {
                                        z2 = true;
                                        break;
                                    }
                                    i++;
                                } else {
                                    z2 = false;
                                    break;
                                }
                            }
                        }
                        if (z2) {
                            arrayList.add(packageInfo);
                        }
                    }
                }
                btv.a("TimeLimit", "disabled(%s) system alert for %s", Boolean.valueOf(z3), arrayList);
                if (z3) {
                    for (PackageInfo packageInfo2 : arrayList) {
                        boolean zA = bsu.a("TimeLimit", appOpsManager, packageInfo2);
                        bsu.a("TimeLimit", appOpsManager, packageInfo2, 1);
                        if (zA) {
                            buyVarJ.a(packageInfo2.packageName, 8L, 0L);
                            btv.a("TimeLimit", "disabled system alert for %s", packageInfo2.packageName);
                        }
                    }
                    return;
                }
                List listA = buyVarJ.a(8L);
                for (PackageInfo packageInfo3 : arrayList) {
                    String str = packageInfo3.packageName;
                    if (listA.contains(str)) {
                        bsu.a("TimeLimit", appOpsManager, packageInfo3, 0);
                        buyVarJ.a(str, 0L, 8L);
                        btv.a("TimeLimit", "restore system alert to allowed %s", packageInfo3.packageName);
                    } else {
                        bsu.a("TimeLimit", appOpsManager, packageInfo3, 3);
                        btv.a("TimeLimit", "restore system alert to default %s", packageInfo3.packageName);
                    }
                }
            }
        }
    }

    public static void a(Context context, SupervisionDatabase supervisionDatabase, boolean z) {
        ContentResolver contentResolver = context.getContentResolver();
        bwj bwjVarP = supervisionDatabase.p();
        Long lB = bwjVarP.b("user_preferred_lock_screen_notification_setting");
        if (z) {
            if (lB == null) {
                bwjVarP.a("user_preferred_lock_screen_notification_setting", Settings.Secure.getInt(contentResolver, "lock_screen_show_notifications", 1));
            }
            Settings.Secure.putInt(contentResolver, "lock_screen_show_notifications", 0);
        } else if (lB != null) {
            Settings.Secure.putInt(contentResolver, "lock_screen_show_notifications", (int) lB.longValue());
            bwjVarP.a("user_preferred_lock_screen_notification_setting", (String) null);
        }
    }
}

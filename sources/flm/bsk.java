package flm;

import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bsk {
    public static String a;

    public static boolean a(PackageManager packageManager) {
        Iterator<ResolveInfo> it = packageManager.queryIntentServices(new Intent("com.google.android.c2dm.intent.REGISTER"), 0).iterator();
        while (it.hasNext()) {
            if (a(packageManager, it.next().serviceInfo.packageName, "com.google.android.c2dm.intent.REGISTER")) {
                return true;
            }
        }
        return false;
    }

    public static boolean b(PackageManager packageManager) {
        Iterator<ResolveInfo> it = packageManager.queryBroadcastReceivers(new Intent("com.google.iid.TOKEN_REQUEST"), 0).iterator();
        while (it.hasNext()) {
            if (a(packageManager, it.next().activityInfo.packageName, "com.google.iid.TOKEN_REQUEST")) {
                return true;
            }
        }
        return false;
    }

    private static boolean a(PackageManager packageManager, String str, String str2) {
        if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", str) == 0) {
            return a(packageManager, str);
        }
        Log.w("InstanceID", new StringBuilder(String.valueOf(str).length() + 56 + String.valueOf(str2).length()).append("Possible malicious package ").append(str).append(" declares ").append(str2).append(" without permission").toString());
        return false;
    }

    public static boolean a(PackageManager packageManager, String str) {
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 0);
            a = applicationInfo.packageName;
            int i = applicationInfo.uid;
            return true;
        } catch (PackageManager.NameNotFoundException e) {
            return false;
        }
    }

    static {
        bsl.a().a("gcm_iid_use_messenger_ipc", true);
        a = null;
    }
}

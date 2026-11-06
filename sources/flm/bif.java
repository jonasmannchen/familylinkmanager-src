package flm;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Process;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bif {
    public static int a(Context context, String str) {
        Bundle bundle;
        PackageInfo packageInfoC = c(context, str);
        if (packageInfoC == null || packageInfoC.applicationInfo == null || (bundle = packageInfoC.applicationInfo.metaData) == null) {
            return -1;
        }
        return bundle.getInt("com.google.android.gms.version", -1);
    }

    private static PackageInfo c(Context context, String str) {
        try {
            return bjj.a.a(context).b(str, 128);
        } catch (PackageManager.NameNotFoundException e) {
            return null;
        }
    }

    public static boolean b(Context context, String str) {
        if ("com.google.android.gms".equals(str) && a()) {
            return false;
        }
        try {
            return (bjj.a.a(context).a(str, 0).flags & 2097152) != 0;
        } catch (PackageManager.NameNotFoundException e) {
            return false;
        }
    }

    public static boolean a() {
        return bav.IS_PACKAGE_SIDE && azl.a() && azl.b == Process.myUid();
    }
}

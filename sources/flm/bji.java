package flm;

import android.annotation.TargetApi;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class bji {
    public final Context a;

    public bji(Context context) {
        this.a = context;
    }

    public ApplicationInfo a(String str, int i) {
        return this.a.getPackageManager().getApplicationInfo(str, i);
    }

    public PackageInfo b(String str, int i) {
        return this.a.getPackageManager().getPackageInfo(str, i);
    }

    public PackageInfo a(String str, int i, int i2) {
        return this.a.getPackageManager().getPackageInfo(str, 64);
    }

    public String[] a(int i) {
        return this.a.getPackageManager().getPackagesForUid(i);
    }

    @TargetApi(19)
    public boolean a(int i, String str) {
        try {
            ((AppOpsManager) this.a.getSystemService("appops")).checkPackage(i, str);
            return true;
        } catch (SecurityException e) {
            return false;
        }
    }

    public int a(String str, int i, int i2, String str2) {
        return oy.a(this.a, str, i, i2, str2);
    }

    public int a(String str) {
        return this.a.checkCallingOrSelfPermission(str);
    }

    public int a(String str, String str2) {
        return this.a.getPackageManager().checkPermission(str, str2);
    }

    public CharSequence b(String str) {
        return this.a.getPackageManager().getApplicationLabel(this.a.getPackageManager().getApplicationInfo(str, 0));
    }

    public boolean c(String str, int i) {
        return true;
    }
}

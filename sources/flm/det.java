package flm;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Bundle;
import android.os.RemoteException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class det extends bji {
    private static final dxx b = dxx.a(4, "com.android.vending", "com.google.android.gms", "com.google.android.apps.work.core", "com.google.android.apps.auth.test.support");

    public det(Context context) {
        super(context);
    }

    @Override // flm.bji
    public final PackageInfo b(String str, int i) throws PackageManager.NameNotFoundException {
        try {
            return super.b(str, i);
        } catch (PackageManager.NameNotFoundException e) {
            PackageInfo packageInfoD = d(str, i);
            if (packageInfoD == null) {
                throw e;
            }
            return packageInfoD;
        }
    }

    @Override // flm.bji
    public final PackageInfo a(String str, int i, int i2) {
        return !dev.a(i2) ? super.b(str, 64) : b(str, 64);
    }

    @Override // flm.bji
    public final ApplicationInfo a(String str, int i) throws PackageManager.NameNotFoundException {
        try {
            return super.a(str, i);
        } catch (PackageManager.NameNotFoundException e) {
            ApplicationInfo applicationInfoE = e(str, i);
            if (applicationInfoE == null) {
                throw e;
            }
            return applicationInfoE;
        }
    }

    @Override // flm.bji
    public final String[] a(int i) {
        return dev.a(i) ? b(i) : super.a(i);
    }

    @Override // flm.bji
    public final boolean a(int i, String str) {
        return dev.a(i) ? c(i, str) : super.a(i, str);
    }

    @Override // flm.bji
    public final int a(String str, int i, int i2, String str2) {
        if (dev.a(i2)) {
            if (b(i2, str)) {
                return 0;
            }
            return -1;
        }
        return super.a(str, i, i2, str2);
    }

    @Override // flm.bji
    public final int a(String str) {
        if (dev.a(Binder.getCallingUid())) {
            if (b(Binder.getCallingUid(), str)) {
                return 0;
            }
            return -1;
        }
        return super.a(str);
    }

    @Override // flm.bji
    public final int a(String str, String str2) {
        int iA = super.a(str, str2);
        if (iA != 0 && b(str2, str)) {
            return 0;
        }
        return iA;
    }

    @Override // flm.bji
    public final CharSequence b(String str) throws PackageManager.NameNotFoundException {
        try {
            return super.b(str);
        } catch (PackageManager.NameNotFoundException e) {
            String strC = c(str);
            if (strC != null) {
                return strC;
            }
            throw e;
        }
    }

    @Override // flm.bji
    public final boolean c(String str, int i) {
        if (dev.a(Binder.getCallingUid())) {
            return a(Binder.getCallingUid(), str, i);
        }
        return true;
    }

    private final String c(String str) {
        deo deoVarA = a();
        if (deoVarA == null) {
            return null;
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putString("packageName", str);
            return deoVarA.a("getApplicationLabel", bundle).getString("result");
        } catch (RemoteException e) {
            return null;
        }
    }

    private final boolean b(int i, String str) {
        deo deoVarA = a();
        if (deoVarA == null) {
            return false;
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putInt("uid", i);
            bundle.putString("permissionName", str);
            return deoVarA.a("hasPermission", bundle).getBoolean("result");
        } catch (RemoteException e) {
            return false;
        }
    }

    private final boolean b(String str, String str2) {
        deo deoVarA;
        if (d(str) || (deoVarA = a()) == null) {
            return false;
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putString("packageName", str);
            bundle.putString("permissionName", str2);
            return deoVarA.a("packageHasPermission", bundle).getBoolean("result");
        } catch (RemoteException e) {
            return false;
        }
    }

    private final boolean c(int i, String str) {
        deo deoVarA = a();
        if (deoVarA == null) {
            return false;
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putInt("uid", i);
            bundle.putString("packageName", str);
            return deoVarA.a("checkAppPackage", bundle).getBoolean("result");
        } catch (RemoteException e) {
            return false;
        }
    }

    private final String[] b(int i) {
        deo deoVarA = a();
        if (deoVarA == null) {
            return null;
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putInt("uid", i);
            String string = deoVarA.a("getAppPackageForUid", bundle).getString("result");
            if (string != null) {
                return new String[]{string};
            }
            return null;
        } catch (RemoteException e) {
            return null;
        }
    }

    private final PackageInfo d(String str, int i) {
        deo deoVarA;
        if (!d(str) && (deoVarA = a()) != null) {
            try {
                Bundle bundle = new Bundle();
                bundle.putString("packageName", str);
                bundle.putInt("flags", i);
                return (PackageInfo) deoVarA.a("getWHPackageInfo", bundle).getParcelable("result");
            } catch (RemoteException e) {
                return null;
            }
        }
        return null;
    }

    private final ApplicationInfo e(String str, int i) {
        deo deoVarA;
        if (!d(str) && (deoVarA = a()) != null) {
            try {
                Bundle bundle = new Bundle();
                bundle.putString("packageName", str);
                bundle.putInt("flags", i);
                return (ApplicationInfo) deoVarA.a("getWHApplicationInfo", bundle).getParcelable("result");
            } catch (RemoteException e) {
                return null;
            }
        }
        return null;
    }

    private final boolean a(int i, String str, int i2) {
        deo deoVarA = a();
        if (deoVarA == null) {
            return true;
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putInt("uid", i);
            bundle.putString("packageName", str);
            bundle.putInt("serviceId", i2);
            return deoVarA.a("allowApiAccess", bundle).getBoolean("result");
        } catch (RemoteException e) {
            return true;
        }
    }

    private final deo a() {
        if (!den.a()) {
            deo.a();
            return null;
        }
        return deo.a(this.a);
    }

    private static boolean d(String str) {
        eau eauVar = (eau) b.iterator();
        while (eauVar.hasNext()) {
            if (((String) eauVar.next()).equals(str)) {
                return true;
            }
        }
        return false;
    }
}

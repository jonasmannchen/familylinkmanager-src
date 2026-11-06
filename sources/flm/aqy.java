package flm;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class aqy {
    private static aqy b;
    public final Context a;
    private volatile String c;

    private aqy(Context context) {
        this.a = context.getApplicationContext();
    }

    public static aqy a(Context context) {
        bdi.checkNotNull(context);
        synchronized (aqy.class) {
            if (b == null) {
                aqg.a(context);
                b = new aqy(context);
            }
        }
        return b;
    }

    @Deprecated
    public void verifyUidIsGoogleSigned(PackageManager packageManager, int i) {
        a(i);
    }

    public final void a(int i) {
        try {
            b(i).b();
        } catch (SecurityException e) {
            b(i).b();
            Log.e("GoogleSignatureVerifier", "flaky result", e);
        }
    }

    @Deprecated
    public void verifyPackageIsGoogleSigned(PackageManager packageManager, String str) {
        a(str);
    }

    public final void a(String str) {
        try {
            c(str).b();
        } catch (SecurityException e) {
            c(str).b();
            Log.e("GoogleSignatureVerifier", "flaky result", e);
        }
    }

    public final boolean b(String str) {
        return c(str).b;
    }

    public final boolean a(PackageInfo packageInfo, boolean z) {
        aqi aqiVarA;
        if (packageInfo != null && packageInfo.signatures != null) {
            if (z) {
                aqiVarA = a(packageInfo, aql.a);
            } else {
                aqiVarA = a(packageInfo, aql.a[0]);
            }
            if (aqiVarA != null) {
                return true;
            }
        }
        return false;
    }

    private final aqs b(int i) {
        String[] strArrA = bjj.a.a(this.a).a(i);
        if (strArrA == null || strArrA.length == 0) {
            return aqs.a("no pkgs");
        }
        aqs aqsVarA = null;
        for (String str : strArrA) {
            aqsVarA = a(str, i);
            if (aqsVarA.b) {
                return aqsVarA;
            }
        }
        return aqsVarA;
    }

    private final aqs a(String str, int i) {
        aqs aqsVarA;
        try {
            PackageInfo packageInfoA = bjj.a.a(this.a).a(str, 64, i);
            boolean zC = aqx.c(this.a);
            if (packageInfoA == null) {
                aqsVarA = aqs.a("null pkg");
            } else if (packageInfoA.signatures.length != 1) {
                aqsVarA = aqs.a("single cert required");
            } else {
                aqj aqjVar = new aqj(packageInfoA.signatures[0].toByteArray());
                String str2 = packageInfoA.packageName;
                aqsVarA = aqg.a(str2, aqjVar, zC, false);
                if (aqsVarA.b && packageInfoA.applicationInfo != null && (packageInfoA.applicationInfo.flags & 2) != 0 && aqg.a(str2, aqjVar, false, true).b) {
                    aqsVarA = aqs.a("debuggable release cert app rejected");
                }
            }
            return aqsVarA;
        } catch (PackageManager.NameNotFoundException e) {
            String strValueOf = String.valueOf(str);
            return aqs.a(strValueOf.length() != 0 ? "no pkg ".concat(strValueOf) : new String("no pkg "));
        }
    }

    private final aqs c(String str) {
        aqs aqsVarA;
        if (str == null) {
            return aqs.a("null pkg");
        }
        if (str.equals(this.c)) {
            return aqs.a;
        }
        try {
            PackageInfo packageInfoB = bjj.a.a(this.a).b(str, 64);
            boolean zC = aqx.c(this.a);
            if (packageInfoB == null) {
                aqsVarA = aqs.a("null pkg");
            } else if (packageInfoB.signatures.length != 1) {
                aqsVarA = aqs.a("single cert required");
            } else {
                aqj aqjVar = new aqj(packageInfoB.signatures[0].toByteArray());
                String str2 = packageInfoB.packageName;
                aqsVarA = aqg.a(str2, aqjVar, zC, false);
                if (aqsVarA.b && packageInfoB.applicationInfo != null && (packageInfoB.applicationInfo.flags & 2) != 0 && aqg.a(str2, aqjVar, false, true).b) {
                    aqsVarA = aqs.a("debuggable release cert app rejected");
                }
            }
            if (aqsVarA.b) {
                this.c = str;
                return aqsVarA;
            }
            return aqsVarA;
        } catch (PackageManager.NameNotFoundException e) {
            String strValueOf = String.valueOf(str);
            return aqs.a(strValueOf.length() != 0 ? "no pkg ".concat(strValueOf) : new String("no pkg "));
        }
    }

    private static aqi a(PackageInfo packageInfo, aqi... aqiVarArr) {
        if (packageInfo.signatures == null) {
            return null;
        }
        if (packageInfo.signatures.length != 1) {
            Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
            return null;
        }
        aqj aqjVar = new aqj(packageInfo.signatures[0].toByteArray());
        for (int i = 0; i < aqiVarArr.length; i++) {
            if (aqiVarArr[i].equals(aqjVar)) {
                return aqiVarArr[i];
            }
        }
        return null;
    }
}

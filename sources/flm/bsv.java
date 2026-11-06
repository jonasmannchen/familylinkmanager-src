package flm;

import android.content.pm.PackageInfo;
import android.os.Build;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bsv {
    public static void a(String str, List list, String str2, fce fceVar) throws bxi {
        if (Build.VERSION.SDK_INT < 23) {
            btv.c(str, "No need to grant permission before M, ignore", new Object[0]);
            return;
        }
        eto etoVarA = eto.a(fceVar.b);
        if (etoVarA == null) {
            etoVarA = eto.APP_PERMISSION_CONTROL_UNKNOWN;
        }
        boolean zA = a(etoVarA);
        fjf fjfVar = fceVar.c;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            PackageInfo packageInfo = (PackageInfo) it.next();
            if (!fjfVar.contains(packageInfo.packageName)) {
                arrayList.add(packageInfo);
            }
        }
        bui.a(str, arrayList, str2, zA);
    }

    public static void a(String str, String str2, fcc fccVar) throws bxi {
        boolean z;
        if (Build.VERSION.SDK_INT < 23) {
            btv.c(str, "No need to grant permission before M, ignore", new Object[0]);
            return;
        }
        eto etoVarA = eto.a(fccVar.c);
        if (etoVarA == null) {
            etoVarA = eto.APP_PERMISSION_CONTROL_UNKNOWN;
        }
        boolean zA = a(etoVarA);
        etq etqVarA = etq.a(fccVar.b);
        if (etqVarA == null) {
            etqVarA = etq.STATE_UNKNOWN;
        }
        switch (etqVarA.ordinal()) {
            case 1:
            case 4:
                Object[] objArr = new Object[1];
                etq etqVarA2 = etq.a(fccVar.b);
                if (etqVarA2 == null) {
                    etqVarA2 = etq.STATE_UNKNOWN;
                }
                objArr[0] = etqVarA2;
                btv.d(str, "Unexpected grant state:%s", objArr);
                Object[] objArr2 = new Object[1];
                etq etqVarA3 = etq.a(fccVar.b);
                if (etqVarA3 == null) {
                    etqVarA3 = etq.STATE_UNKNOWN;
                }
                objArr2[0] = etqVarA3;
                btt.a(str, "", "unexpected grant state:%s", objArr2);
                return;
            case 2:
                z = true;
                break;
            case 3:
                z = false;
                break;
            default:
                throw new bxi("Unknown app permission grant state");
        }
        String[] strArrSplit = str2.split("\\|");
        if (strArrSplit.length < 2) {
            throw new bxi("Invalid subKey format as PermissionGroupGrantStatePolicy");
        }
        String str3 = strArrSplit[0];
        String str4 = strArrSplit[1];
        if (!bui.a(str, str4, str3, z, zA)) {
            Object[] objArr3 = new Object[4];
            objArr3[0] = zA ? "enforce" : "release";
            objArr3[1] = str3;
            objArr3[2] = str4;
            objArr3[3] = z ? "granted" : "rejected";
            throw new bxi(String.format("Failed to %s permission group of %s for app %s to be %s", objArr3));
        }
    }

    private static boolean a(eto etoVar) throws bxi {
        switch (etoVar.ordinal()) {
            case 1:
                return false;
            case 2:
                return true;
            default:
                String strValueOf = String.valueOf(etoVar);
                throw new bxi(new StringBuilder(String.valueOf(strValueOf).length() + 37).append("Unknown app permission control mode: ").append(strValueOf).toString());
        }
    }
}

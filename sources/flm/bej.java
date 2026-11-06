package flm;

import android.text.TextUtils;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class bej {
    public static final bej a = new bej();

    bej() {
    }

    static boolean a(String str) {
        String strA = ((fpe) fpd.a.a()).a();
        if (TextUtils.isEmpty(strA)) {
            return true;
        }
        String[] strArrSplit = strA.split(bdp.WHITELIST_DELIMITER);
        for (String str2 : strArrSplit) {
            if (str2.trim().equals(str)) {
                return false;
            }
        }
        return true;
    }
}

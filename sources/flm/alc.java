package flm;

import android.util.Log;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class alc {
    private static boolean a = false;

    public static String a(String str, String str2) {
        if (!a(6)) {
            return "";
        }
        String strA = a(str, str2, new Object[0]);
        Log.e("ctxmgr", strA);
        return strA;
    }

    public static String a(String str, String str2, Object... objArr) {
        if (objArr.length == 0) {
            return String.format("[%s]%s", str, str2);
        }
        String strValueOf = String.valueOf(String.format("[%s]", str));
        String strValueOf2 = String.valueOf(String.format(str2, objArr));
        return strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new String(strValueOf);
    }

    public static boolean a(int i) {
        return Log.isLoggable("ctxmgr", i);
    }
}

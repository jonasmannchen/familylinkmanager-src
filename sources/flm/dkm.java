package flm;

import android.util.Log;
import java.util.Locale;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dkm {
    static String a(String str, Object... objArr) {
        return objArr.length == 0 ? str : String.format(Locale.US, str, objArr);
    }

    public static void a(int i, String str, String str2, Object... objArr) {
        if (Log.isLoggable(str, i)) {
            Log.println(i, str, a(str2, objArr));
        }
    }

    private static void a(int i, String str, Throwable th, String str2, Object... objArr) {
        if (Log.isLoggable(str, i)) {
            switch (i) {
                case 2:
                    a(str2, objArr);
                    break;
                case 3:
                    a(str2, objArr);
                    break;
                case 4:
                    a(str2, objArr);
                    break;
                case 5:
                    Log.w(str, a(str2, objArr), th);
                    break;
                case 6:
                    Log.e(str, a(str2, objArr), th);
                    break;
                default:
                    a(5, "PrimesLog", "unexpected priority: %d for log %s: %s", Integer.valueOf(i), str, a(str2, objArr));
                    break;
            }
        }
    }

    public static void a(String str, String str2, Throwable th, Object... objArr) {
        a(3, str, th, str2, objArr);
    }

    public static void b(String str, String str2, Throwable th, Object... objArr) {
        a(5, str, th, str2, objArr);
    }

    public static void a(String str, String str2, Object... objArr) {
        a(6, str, str2, objArr);
    }

    public static void c(String str, String str2, Throwable th, Object... objArr) {
        a(6, str, th, str2, objArr);
    }
}

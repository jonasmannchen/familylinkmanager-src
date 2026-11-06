package flm;

import android.util.Log;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class btv {
    private static final boolean a = bav.APK_BUILD_VERSION_NAME.contains("eng");
    private static final bca b = new bca("Kids");

    private static String f(String str, String str2, Object... objArr) {
        String str3 = objArr.length == 0 ? str2 : String.format(str2, objArr);
        return str != null ? new StringBuilder(String.valueOf(str).length() + 3 + String.valueOf(str3).length()).append("[").append(str).append("] ").append(str3).toString() : str3;
    }

    private static boolean a(int i) {
        return a || Log.isLoggable("Kids", i);
    }

    public static void a(String str, String str2, Object... objArr) {
        if (a(2)) {
            f(str, str2, objArr);
        }
    }

    public static void a(String str, Throwable th, String str2, Object... objArr) {
        if (a(2)) {
            f(str, str2, objArr);
        }
    }

    public static void b(String str, String str2, Object... objArr) {
        if (a(3)) {
            f(str, str2, objArr);
        }
    }

    public static void c(String str, String str2, Object... objArr) {
        if (b.canLog(4)) {
            b.i("Kids", f(str, str2, objArr));
        }
    }

    public static void d(String str, String str2, Object... objArr) {
        if (b.canLog(5)) {
            b.w("Kids", f(str, str2, objArr));
        }
    }

    public static void b(String str, Throwable th, String str2, Object... objArr) {
        if (b.canLog(5)) {
            b.w("Kids", f(str, str2, objArr), th);
        }
    }

    public static void e(String str, String str2, Object... objArr) {
        if (b.canLog(6)) {
            b.e("Kids", f(str, str2, objArr));
        }
    }

    public static void c(String str, Throwable th, String str2, Object... objArr) {
        if (b.canLog(6)) {
            b.e("Kids", f(str, str2, objArr), th);
        }
    }
}

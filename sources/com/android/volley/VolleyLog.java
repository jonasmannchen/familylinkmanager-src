package com.android.volley;

import android.util.Log;
import java.util.Locale;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class VolleyLog {
    public static String TAG = "Volley";
    public static boolean DEBUG = false;
    private static final String a = VolleyLog.class.getName();

    public static void v(String str, Object... objArr) {
        if (DEBUG) {
            a(str, objArr);
        }
    }

    public static void d(String str, Object... objArr) {
        a(str, objArr);
    }

    public static void e(String str, Object... objArr) {
        Log.e(TAG, a(str, objArr));
    }

    public static void e(Throwable th, String str, Object... objArr) {
        Log.e(TAG, a(str, objArr), th);
    }

    public static void wtf(String str, Object... objArr) {
        Log.wtf(TAG, a(str, objArr));
    }

    private static String a(String str, Object... objArr) {
        String string;
        if (objArr != null) {
            str = String.format(Locale.US, str, objArr);
        }
        StackTraceElement[] stackTrace = new Throwable().fillInStackTrace().getStackTrace();
        for (int i = 2; i < stackTrace.length; i++) {
            if (!stackTrace[i].getClassName().equals(a)) {
                String className = stackTrace[i].getClassName();
                String strSubstring = className.substring(className.lastIndexOf(46) + 1);
                String strSubstring2 = strSubstring.substring(strSubstring.lastIndexOf(36) + 1);
                String methodName = stackTrace[i].getMethodName();
                string = new StringBuilder(String.valueOf(strSubstring2).length() + 1 + String.valueOf(methodName).length()).append(strSubstring2).append(".").append(methodName).toString();
                return String.format(Locale.US, "[%d] %s: %s", Long.valueOf(Thread.currentThread().getId()), string, str);
            }
        }
        string = "<unknown>";
        return String.format(Locale.US, "[%d] %s: %s", Long.valueOf(Thread.currentThread().getId()), string, str);
    }
}

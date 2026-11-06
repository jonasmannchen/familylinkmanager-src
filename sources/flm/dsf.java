package flm;

import android.util.Log;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dsf {
    private static final Method a;

    public static String a(String str, String str2) {
        try {
            return (String) a.invoke(null, str, str2);
        } catch (Exception e) {
            Log.e("SystemProperties", "get error", e);
            return str2;
        }
    }

    static {
        Method method = null;
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            method = cls.getMethod("get", String.class, String.class);
            cls.getMethod("getInt", String.class, Integer.TYPE);
            cls.getMethod("getLong", String.class, Long.TYPE);
        } catch (Exception e) {
            ehh.a.a(e);
        } finally {
            a = method;
        }
    }
}

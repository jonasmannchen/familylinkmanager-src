package flm;

import java.util.ServiceConfigurationError;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fuz {
    public static boolean a(ClassLoader classLoader) {
        try {
            Class.forName("android.app.Application", false, classLoader);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    static Object a(Class cls, Class cls2) {
        try {
            return cls2.asSubclass(cls).getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Throwable th) {
            throw new ServiceConfigurationError(String.format("Provider %s could not be instantiated %s", cls2.getName(), th), th);
        }
    }
}

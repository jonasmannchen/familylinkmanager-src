package flm;

import java.util.ServiceConfigurationError;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gkv {
    public static Object a(Class cls, Class cls2) {
        try {
            return cls.asSubclass(cls2).getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception e) {
            String name = cls.getName();
            throw new ServiceConfigurationError(new StringBuilder(String.valueOf(name).length() + 36).append("Provider ").append(name).append(" could not be instantiated.").toString(), e);
        }
    }
}

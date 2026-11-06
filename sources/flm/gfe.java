package flm;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gfe implements gcy {
    public static final RuntimeException a;
    private static final Logger b = Logger.getLogger(gfe.class.getName());
    private static final Constructor c;
    private static final Method d;
    private final Object e;

    gfe() {
        if (a != null) {
            throw a;
        }
        try {
            this.e = c.newInstance(new Object[0]);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    @Override // flm.gcy
    public final void a(long j) {
        try {
            d.invoke(this.e, 1L);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    static {
        Method method;
        Method method2;
        Constructor<?> constructor;
        try {
            Class<?> cls = Class.forName("java.util.concurrent.atomic.LongAdder");
            method2 = cls.getMethod("add", Long.TYPE);
            try {
                cls.getMethod("sum", new Class[0]);
                Constructor<?>[] constructors = cls.getConstructors();
                int length = constructors.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        th = null;
                        constructor = null;
                        break;
                    } else {
                        constructor = constructors[i];
                        if (constructor.getParameterTypes().length == 0) {
                            th = null;
                            break;
                        }
                        i++;
                    }
                }
            } catch (Throwable th) {
                th = th;
                method = method2;
                b.logp(Level.FINE, "io.grpc.internal.ReflectionLongAdderCounter", "<clinit>", "LongAdder can not be found via reflection, this is normal for JDK7 and below", th);
                method2 = method;
                constructor = null;
            }
        } catch (Throwable th2) {
            th = th2;
            method = null;
        }
        if (th == null && constructor != null) {
            c = constructor;
            d = method2;
            a = null;
        } else {
            c = null;
            d = null;
            a = new RuntimeException(th);
        }
    }
}

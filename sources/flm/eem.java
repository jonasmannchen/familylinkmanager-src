package flm;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class eem {
    private final Object a;
    private final Method b;
    private final Method c;

    public static eem a() {
        try {
            Object objInvoke = Class.forName("sun.misc.SharedSecrets").getMethod("getJavaLangAccess", new Class[0]).invoke(null, new Object[0]);
            Method method = Class.forName("sun.misc.JavaLangAccess").getMethod("getStackTraceElement", Throwable.class, Integer.TYPE);
            Method method2 = Class.forName("sun.misc.JavaLangAccess").getMethod("getStackTraceDepth", Throwable.class);
            method.invoke(objInvoke, new Throwable(), 0);
            ((Integer) method2.invoke(objInvoke, new Throwable())).intValue();
            return new eem(objInvoke, method, method2);
        } catch (ThreadDeath e) {
            throw e;
        } catch (Throwable th) {
            return null;
        }
    }

    private eem(Object obj, Method method, Method method2) {
        this.a = obj;
        this.b = method;
        this.c = method2;
    }

    public final StackTraceElement a(Throwable th, int i) {
        try {
            return (StackTraceElement) this.b.invoke(this.a, th, Integer.valueOf(i));
        } catch (IllegalAccessException e) {
            throw new AssertionError(e);
        } catch (InvocationTargetException e2) {
            if (e2.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e2.getCause());
            }
            if (e2.getCause() instanceof Error) {
                throw ((Error) e2.getCause());
            }
            throw new RuntimeException(e2.getCause());
        }
    }

    public final int a(Throwable th) {
        try {
            return ((Integer) this.c.invoke(this.a, th)).intValue();
        } catch (IllegalAccessException e) {
            throw new AssertionError(e);
        } catch (InvocationTargetException e2) {
            if (e2.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e2.getCause());
            }
            if (e2.getCause() instanceof Error) {
                throw ((Error) e2.getCause());
            }
            throw new RuntimeException(e2.getCause());
        }
    }
}

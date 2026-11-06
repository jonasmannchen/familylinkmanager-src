package flm;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gjj {
    private final Class a;
    private final String b;
    private final Class[] c;

    public gjj(Class cls, String str, Class... clsArr) {
        this.a = cls;
        this.b = str;
        this.c = clsArr;
    }

    public final boolean a(Object obj) {
        return a((Class) obj.getClass()) != null;
    }

    private final Object c(Object obj, Object... objArr) {
        Method methodA = a((Class) obj.getClass());
        if (methodA == null) {
            return null;
        }
        try {
            return methodA.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            return null;
        }
    }

    public final Object a(Object obj, Object... objArr) {
        try {
            return c(obj, objArr);
        } catch (InvocationTargetException e) {
            Throwable targetException = e.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }

    private final Object d(Object obj, Object... objArr) {
        Method methodA = a((Class) obj.getClass());
        if (methodA == null) {
            String str = this.b;
            String strValueOf = String.valueOf(obj);
            throw new AssertionError(new StringBuilder(String.valueOf(str).length() + 33 + String.valueOf(strValueOf).length()).append("Method ").append(str).append(" not supported for object ").append(strValueOf).toString());
        }
        try {
            return methodA.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            String strValueOf2 = String.valueOf(methodA);
            AssertionError assertionError = new AssertionError(new StringBuilder(String.valueOf(strValueOf2).length() + 29).append("Unexpectedly could not call: ").append(strValueOf2).toString());
            assertionError.initCause(e);
            throw assertionError;
        }
    }

    public final Object b(Object obj, Object... objArr) {
        try {
            return d(obj, objArr);
        } catch (InvocationTargetException e) {
            Throwable targetException = e.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }

    private final Method a(Class cls) {
        if (this.b == null) {
            return null;
        }
        Method methodA = a(cls, this.b, this.c);
        if (methodA == null || this.a == null || this.a.isAssignableFrom(methodA.getReturnType())) {
            return methodA;
        }
        return null;
    }

    private static Method a(Class cls, String str, Class[] clsArr) {
        Method methodA = null;
        if (cls != null) {
            try {
                if ((cls.getModifiers() & 1) == 0) {
                    methodA = a(cls.getSuperclass(), str, clsArr);
                } else {
                    Method method = cls.getMethod(str, clsArr);
                    try {
                        if ((method.getModifiers() & 1) != 0) {
                            methodA = method;
                        }
                    } catch (NoSuchMethodException e) {
                        methodA = method;
                    }
                }
            } catch (NoSuchMethodException e2) {
            }
        }
        return methodA;
    }
}

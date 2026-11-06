package flm;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dwe {
    private static final Object a;

    public static void a(Throwable th) {
        dvl.a(th);
        if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        }
        if (th instanceof Error) {
            throw ((Error) th);
        }
    }

    @Deprecated
    public static RuntimeException b(Throwable th) {
        a(th);
        throw new RuntimeException(th);
    }

    public static String c(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        ehh.a(th, new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    private static Object a() {
        try {
            return Class.forName("sun.misc.SharedSecrets", false, null).getMethod("getJavaLangAccess", new Class[0]).invoke(null, new Object[0]);
        } catch (ThreadDeath e) {
            throw e;
        } catch (Throwable th) {
            return null;
        }
    }

    private static Method b() {
        try {
            Method methodA = a("getStackTraceDepth", Throwable.class);
            if (methodA == null) {
                return null;
            }
            methodA.invoke(a(), new Throwable());
            return methodA;
        } catch (IllegalAccessException e) {
            return null;
        } catch (UnsupportedOperationException e2) {
            return null;
        } catch (InvocationTargetException e3) {
            return null;
        }
    }

    private static Method a(String str, Class... clsArr) {
        try {
            return Class.forName("sun.misc.JavaLangAccess", false, null).getMethod(str, clsArr);
        } catch (ThreadDeath e) {
            throw e;
        } catch (Throwable th) {
            return null;
        }
    }

    static {
        Object objA = a();
        a = objA;
        if (objA != null) {
            a("getStackTraceElement", Throwable.class, Integer.TYPE);
        }
        if (a != null) {
            b();
        }
    }
}

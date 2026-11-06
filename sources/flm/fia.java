package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class fia {
    private static final Class a = c();

    private static Class c() {
        try {
            return Class.forName("com.google.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException e) {
            return null;
        }
    }

    public static fib a() {
        if (a != null) {
            try {
                return a("getEmptyRegistry");
            } catch (Exception e) {
            }
        }
        return fib.a;
    }

    static fib b() {
        fib fibVarA = null;
        if (a != null) {
            try {
                fibVarA = a("loadGeneratedRegistry");
            } catch (Exception e) {
            }
        }
        if (fibVarA == null) {
            fibVarA = fib.c();
        }
        return fibVarA == null ? a() : fibVarA;
    }

    private static final fib a(String str) {
        return (fib) a.getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0]);
    }
}

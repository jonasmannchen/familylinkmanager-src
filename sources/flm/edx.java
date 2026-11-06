package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class edx extends ecm {
    public static final ecm a = new edx();

    @Override // flm.ecm
    public final String a(Class cls) {
        StackTraceElement stackTraceElementA = eek.a(cls, new Throwable(), 1);
        if (stackTraceElementA != null) {
            return stackTraceElementA.getClassName();
        }
        String strValueOf = String.valueOf(cls.getName());
        throw new IllegalStateException(strValueOf.length() != 0 ? "no caller found on the stack for: ".concat(strValueOf) : new String("no caller found on the stack for: "));
    }

    @Override // flm.ecm
    public final ebj a(Class cls, int i) {
        StackTraceElement stackTraceElementA = eek.a(cls, new Throwable(), i + 1);
        return stackTraceElementA != null ? new een(stackTraceElementA) : ebj.a;
    }

    public final String toString() {
        return "Default stack-based caller finder";
    }

    private edx() {
    }
}

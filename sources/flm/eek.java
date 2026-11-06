package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class eek {
    private static final eem a = eem.a();

    public static StackTraceElement a(Class cls, Throwable th, int i) {
        eel.a(cls, "target");
        eel.a(th, "throwable");
        if (i < 0) {
            throw new IllegalArgumentException(new StringBuilder(42).append("skip count cannot be negative: ").append(i).toString());
        }
        StackTraceElement[] stackTrace = a != null ? null : th.getStackTrace();
        boolean z = false;
        while (true) {
            try {
                StackTraceElement stackTraceElementA = a != null ? a.a(th, i) : stackTrace[i];
                if (cls.getName().equals(stackTraceElementA.getClassName())) {
                    z = true;
                } else if (z) {
                    return stackTraceElementA;
                }
                i++;
            } catch (Exception e) {
                return null;
            }
        }
    }

    public static StackTraceElement[] b(Class cls, Throwable th, int i) {
        StackTraceElement[] stackTrace;
        int length;
        StackTraceElement stackTraceElementA;
        boolean z;
        eel.a(cls, "target");
        eel.a(th, "throwable");
        if (i <= 0 && i != -1) {
            throw new IllegalArgumentException(new StringBuilder(34).append("invalid maximum depth: ").append(i).toString());
        }
        if (a != null) {
            stackTrace = null;
            length = a.a(th);
        } else {
            stackTrace = th.getStackTrace();
            length = stackTrace.length;
        }
        int i2 = 0;
        boolean z2 = false;
        while (i2 < length) {
            StackTraceElement stackTraceElementA2 = a != null ? a.a(th, i2) : stackTrace[i2];
            if (cls.getName().equals(stackTraceElementA2.getClassName())) {
                z = true;
            } else {
                if (z2) {
                    int i3 = length - i2;
                    if (i <= 0 || i >= i3) {
                        i = i3;
                    }
                    StackTraceElement[] stackTraceElementArr = new StackTraceElement[i];
                    stackTraceElementArr[0] = stackTraceElementA2;
                    for (int i4 = 1; i4 < i; i4++) {
                        if (a != null) {
                            stackTraceElementA = a.a(th, i2 + i4);
                        } else {
                            stackTraceElementA = stackTrace[i2 + i4];
                        }
                        stackTraceElementArr[i4] = stackTraceElementA;
                    }
                    return stackTraceElementArr;
                }
                z = z2;
            }
            i2++;
            z2 = z;
        }
        return new StackTraceElement[0];
    }
}

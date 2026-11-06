package flm;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ecl {
    public static final eck a = a(eck.d);

    private static eck a(String[] strArr) {
        StringBuilder sb = new StringBuilder();
        eck eckVarA = null;
        try {
            eckVarA = ecn.a();
        } catch (NoClassDefFoundError e) {
        }
        if (eckVarA == null) {
            for (String str : strArr) {
                try {
                    eckVarA = (eck) Class.forName(str).getConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Throwable th) {
                    th = th;
                    if (th instanceof InvocationTargetException) {
                        th = th.getCause();
                    }
                    sb.append('\n').append(str).append(": ").append(th);
                }
            }
            throw new IllegalStateException(sb.insert(0, "No logging platforms found:").toString());
        }
        return eckVarA;
    }
}

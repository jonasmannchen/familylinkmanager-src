package flm;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class fib {
    public static final fib a;
    private static volatile boolean b = false;
    private static volatile fib c;
    private final Map d;

    private static Class d() {
        try {
            return Class.forName("com.google.protobuf.Extension");
        } catch (ClassNotFoundException e) {
            return null;
        }
    }

    public static fib a() {
        return fia.a();
    }

    public static fib b() {
        fib fibVarB = c;
        if (fibVarB == null) {
            synchronized (fib.class) {
                fibVarB = c;
                if (fibVarB == null) {
                    fibVarB = fia.b();
                    c = fibVarB;
                }
            }
        }
        return fibVarB;
    }

    static fib c() {
        return fil.a(fib.class);
    }

    public fit a(fke fkeVar, int i) {
        return (fit) this.d.get(new fic(fkeVar, i));
    }

    fib() {
        this.d = new HashMap();
    }

    fib(byte b2) {
        this.d = Collections.emptyMap();
    }

    static {
        d();
        a = new fib((byte) 0);
    }
}

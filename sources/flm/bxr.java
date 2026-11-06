package flm;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class bxr {
    private static volatile bxr e;
    public final bxt a = new bxt();
    public final bxp b = new bxp();
    public final ExecutorService c = bur.b;
    public Future d;

    public static bxr a() {
        bxr bxrVar;
        if (e != null) {
            return e;
        }
        synchronized (bxr.class) {
            if (e == null) {
                e = new bxr();
            }
            bxrVar = e;
        }
        return bxrVar;
    }

    private bxr() {
    }
}

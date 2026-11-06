package flm;

import java.util.HashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bfp {
    private static bfp b;
    public final HashMap a = new HashMap();

    private bfp() {
    }

    public static bfp a() {
        bfp bfpVar;
        synchronized (bfp.class) {
            if (b == null) {
                b = new bfp();
            }
            bfpVar = b;
        }
        return bfpVar;
    }

    public final void a(String str) {
        synchronized (this.a) {
            if (!this.a.containsKey(str)) {
                this.a.put(str, Long.valueOf(System.currentTimeMillis()));
            }
        }
    }
}

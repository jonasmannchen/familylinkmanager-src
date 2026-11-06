package flm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dla {
    public static final List a = Collections.emptyList();
    public static final List b = Collections.emptyList();
    public static volatile dla c = new dla();
    public volatile boolean d;
    public volatile long e;
    public volatile long f;
    public volatile long g;
    public volatile long h;
    public volatile long i;
    public volatile long j;
    public volatile long k;
    public volatile dim l;
    private final List q = new ArrayList();
    public volatile List m = a;
    public volatile List n = b;
    public final Object o = new Object();
    public final Object p = new Object();

    dla() {
    }

    final dlb[] a() {
        dlb[] dlbVarArr;
        synchronized (this.q) {
            dlbVarArr = (dlb[]) this.q.toArray(new dlb[this.q.size()]);
        }
        return dlbVarArr;
    }
}

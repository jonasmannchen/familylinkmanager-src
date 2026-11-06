package flm;

import java.util.ArrayDeque;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dpx {
    public final ArrayDeque a = new ArrayDeque();
    private final long b;
    private final dps c;

    dpx(long j, dps dpsVar) {
        this.b = j;
        this.c = dpsVar;
        dkm.a(3, "TraceData", "Instantiate thread-data, thread:%d name:%s", Long.valueOf(this.b), this.c.a);
    }
}

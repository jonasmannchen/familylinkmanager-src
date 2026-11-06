package flm;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class buy {
    public abstract List a(long j);

    public abstract void a(bux buxVar);

    abstract void a(bve bveVar);

    abstract int b(String str, long j, long j2);

    public abstract long d(String str);

    public abstract long e(String str);

    public abstract void f(String str);

    public final void a(String str) {
        b(str, 0L, 16L);
    }

    public final boolean b(String str) {
        long jD = d(str);
        return (4 & jD) != 0 && (jD & 3) == 0;
    }

    public final void a(String str, long j, long j2) {
        if (b(str, j, j2) == 0) {
            a(new bve(str, j));
        }
    }

    public final long c(String str) {
        return d(str) & 7;
    }
}

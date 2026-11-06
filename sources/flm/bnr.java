package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bnr {
    private long a;
    private long b;

    public bnr() {
        this(-1L);
    }

    private bnr(long j) {
        this.a = -1L;
        this.b = -1L;
    }

    public final bnr a() {
        this.b = b();
        return this;
    }

    private final long b() {
        if (this.a == -1) {
            return System.nanoTime();
        }
        try {
            return this.a;
        } finally {
            this.a = -1L;
        }
    }
}

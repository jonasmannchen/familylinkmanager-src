package flm;

import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fsl implements Comparable {
    private static final fsm b = new fsm();
    private static final long c;
    private static final long d;
    public final long a;
    private final fsn e;
    private volatile boolean f;

    public static fsl a(long j, TimeUnit timeUnit) {
        fsm fsmVar = b;
        if (timeUnit == null) {
            throw new NullPointerException(String.valueOf("units"));
        }
        return new fsl(fsmVar, timeUnit.toNanos(j), true);
    }

    private fsl(fsn fsnVar, long j, boolean z) {
        this(fsnVar, fsnVar.a(), j, true);
    }

    private fsl(fsn fsnVar, long j, long j2, boolean z) {
        this.e = fsnVar;
        long jMin = Math.min(c, Math.max(d, j2));
        this.a = j + jMin;
        this.f = z && jMin <= 0;
    }

    public final boolean a() {
        if (this.f) {
            return true;
        }
        if (this.a - this.e.a() <= 0) {
            this.f = true;
            return true;
        }
        return false;
    }

    public final long a(TimeUnit timeUnit) {
        long jA = this.e.a();
        if (!this.f && this.a - jA <= 0) {
            this.f = true;
        }
        return timeUnit.convert(this.a - jA, TimeUnit.NANOSECONDS);
    }

    public final String toString() {
        return new StringBuilder(32).append(a(TimeUnit.NANOSECONDS)).append(" ns from now").toString();
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(fsl fslVar) {
        long j = this.a - fslVar.a;
        if (j < 0) {
            return -1;
        }
        if (j > 0) {
            return 1;
        }
        return 0;
    }

    static {
        long nanos = TimeUnit.DAYS.toNanos(36500L);
        c = nanos;
        d = -nanos;
    }
}

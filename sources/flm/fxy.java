package flm;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.logging.Level;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class fxy extends frt {
    private static final AtomicLongFieldUpdater g;
    private static final AtomicLongFieldUpdater h;
    private static final AtomicLongFieldUpdater i;
    private static final AtomicLongFieldUpdater j;
    private static final AtomicLongFieldUpdater k;
    private static final AtomicLongFieldUpdater l;
    public volatile long a;
    public volatile long b;
    public volatile long c;
    public volatile long d;
    public volatile long e;
    public volatile long f;

    fxy() {
    }

    @Override // flm.fvi
    public final void a(long j2) {
        if (i != null) {
            i.getAndAdd(this, j2);
        } else {
            this.c += j2;
        }
    }

    @Override // flm.fvi
    public final void c(long j2) {
        if (j != null) {
            j.getAndAdd(this, j2);
        } else {
            this.d += j2;
        }
    }

    @Override // flm.fvi
    public final void b(long j2) {
        if (k != null) {
            k.getAndAdd(this, j2);
        } else {
            this.e += j2;
        }
    }

    @Override // flm.fvi
    public final void d(long j2) {
        if (l != null) {
            l.getAndAdd(this, j2);
        } else {
            this.f += j2;
        }
    }

    @Override // flm.fvi
    public final void c() {
        if (h != null) {
            h.getAndIncrement(this);
        } else {
            this.b++;
        }
    }

    @Override // flm.fvi
    public final void b() {
        if (g != null) {
            g.getAndIncrement(this);
        } else {
            this.a++;
        }
    }

    static {
        AtomicLongFieldUpdater atomicLongFieldUpdaterNewUpdater;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        AtomicLongFieldUpdater atomicLongFieldUpdater2;
        AtomicLongFieldUpdater atomicLongFieldUpdater3;
        AtomicLongFieldUpdater atomicLongFieldUpdater4;
        AtomicLongFieldUpdater atomicLongFieldUpdater5 = null;
        try {
            AtomicLongFieldUpdater atomicLongFieldUpdaterNewUpdater2 = AtomicLongFieldUpdater.newUpdater(fxy.class, "a");
            AtomicLongFieldUpdater atomicLongFieldUpdaterNewUpdater3 = AtomicLongFieldUpdater.newUpdater(fxy.class, "b");
            AtomicLongFieldUpdater atomicLongFieldUpdaterNewUpdater4 = AtomicLongFieldUpdater.newUpdater(fxy.class, "c");
            AtomicLongFieldUpdater atomicLongFieldUpdaterNewUpdater5 = AtomicLongFieldUpdater.newUpdater(fxy.class, "d");
            AtomicLongFieldUpdater atomicLongFieldUpdaterNewUpdater6 = AtomicLongFieldUpdater.newUpdater(fxy.class, "e");
            atomicLongFieldUpdaterNewUpdater = AtomicLongFieldUpdater.newUpdater(fxy.class, "f");
            atomicLongFieldUpdater5 = atomicLongFieldUpdaterNewUpdater6;
            atomicLongFieldUpdater = atomicLongFieldUpdaterNewUpdater5;
            atomicLongFieldUpdater2 = atomicLongFieldUpdaterNewUpdater4;
            atomicLongFieldUpdater3 = atomicLongFieldUpdaterNewUpdater3;
            atomicLongFieldUpdater4 = atomicLongFieldUpdaterNewUpdater2;
        } catch (Throwable th) {
            fxv.a.logp(Level.SEVERE, "io.grpc.internal.CensusStatsModule$ClientTracer", "<clinit>", "Creating atomic field updaters failed", th);
            atomicLongFieldUpdaterNewUpdater = null;
            atomicLongFieldUpdater = null;
            atomicLongFieldUpdater2 = null;
            atomicLongFieldUpdater3 = null;
            atomicLongFieldUpdater4 = null;
        }
        g = atomicLongFieldUpdater4;
        h = atomicLongFieldUpdater3;
        i = atomicLongFieldUpdater2;
        j = atomicLongFieldUpdater;
        k = atomicLongFieldUpdater5;
        l = atomicLongFieldUpdaterNewUpdater;
    }
}

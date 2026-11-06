package flm;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gcp {
    private static final gcv j = new gcv();
    public final ScheduledExecutorService a;
    public final gcw b;
    public final gcu c;
    public long d;
    public ScheduledFuture e;
    public ScheduledFuture f;
    public final Runnable g;
    public final Runnable h;
    public long i;
    private final boolean k;
    private int l;
    private long m;

    public gcp(gcu gcuVar, ScheduledExecutorService scheduledExecutorService, long j2, long j3, boolean z) {
        this(gcuVar, scheduledExecutorService, j, j2, j3, z);
    }

    private gcp(gcu gcuVar, ScheduledExecutorService scheduledExecutorService, gcw gcwVar, long j2, long j3, boolean z) {
        this.l = dp.aO;
        this.g = new gcx(new gcq(this));
        this.h = new gcx(new gcr(this));
        this.c = (gcu) dvl.a(gcuVar, "keepAlivePinger");
        this.a = (ScheduledExecutorService) dvl.a(scheduledExecutorService, "scheduler");
        this.b = (gcw) dvl.a(gcwVar, "ticker");
        this.m = j2;
        this.i = j3;
        this.k = z;
        this.d = gcwVar.a() + j2;
    }

    public final synchronized void a() {
        if (this.k) {
            c();
        }
    }

    public final synchronized void b() {
        synchronized (this) {
            this.d = this.b.a() + this.m;
            if (this.l == dp.aP) {
                this.l = dp.aQ;
            } else if (this.l == dp.aR || this.l == dp.aS) {
                if (this.e != null) {
                    this.e.cancel(false);
                }
                if (this.l == dp.aS) {
                    this.l = dp.aO;
                } else {
                    this.l = dp.aP;
                    dvl.b(this.f == null, "There should be no outstanding pingFuture");
                    this.f = this.a.schedule(this.h, this.m, TimeUnit.NANOSECONDS);
                }
            }
        }
    }

    public final synchronized void c() {
        if (this.l == dp.aO) {
            this.l = dp.aP;
            if (this.f == null) {
                this.f = this.a.schedule(this.h, this.d - this.b.a(), TimeUnit.NANOSECONDS);
            }
        } else if (this.l == dp.aS) {
            this.l = dp.aR;
        }
    }

    public final synchronized void d() {
        if (!this.k) {
            if (this.l == dp.aP || this.l == dp.aQ) {
                this.l = dp.aO;
            }
            if (this.l == dp.aR) {
                this.l = dp.aS;
            }
        }
    }

    public final synchronized void e() {
        if (this.l != dp.aT) {
            this.l = dp.aT;
            if (this.e != null) {
                this.e.cancel(false);
            }
            if (this.f != null) {
                this.f.cancel(false);
                this.f = null;
            }
        }
    }

    static {
        TimeUnit.SECONDS.toNanos(10L);
        TimeUnit.MILLISECONDS.toNanos(10L);
    }
}

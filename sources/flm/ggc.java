package flm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ggc implements fza {
    public final ggg a;
    public final /* synthetic */ gfi b;

    ggc(gfi gfiVar, ggg gggVar) {
        this.b = gfiVar;
        this.a = gggVar;
    }

    @Override // flm.fza
    public final void a(ftv ftvVar) {
        int i;
        Runnable runnableA = this.b.a(this.a);
        if (runnableA != null) {
            runnableA.run();
        }
        if (this.b.m.d == this.a) {
            this.b.p.a(ftvVar);
            if (this.b.l != null) {
                ggh gghVar = this.b.l;
                do {
                    i = gghVar.d.get();
                    if (i != gghVar.a) {
                    } else {
                        return;
                    }
                } while (!gghVar.d.compareAndSet(i, Math.min(gghVar.c + i, gghVar.a)));
            }
        }
    }

    @Override // flm.fza
    public final void b(fvc fvcVar, ftv ftvVar) {
        a(fvcVar, dp.aK, ftvVar);
    }

    @Override // flm.fza
    public final void a(fvc fvcVar, int i, ftv ftvVar) {
        ggb ggbVar;
        synchronized (this.b.h) {
            gfi gfiVar = this.b;
            ggb ggbVar2 = this.b.m;
            ggg gggVar = this.a;
            gggVar.b = true;
            if (ggbVar2.c.contains(gggVar)) {
                ArrayList arrayList = new ArrayList(ggbVar2.c);
                arrayList.remove(gggVar);
                ggbVar = new ggb(ggbVar2.b, Collections.unmodifiableCollection(arrayList), ggbVar2.d, ggbVar2.e, ggbVar2.a);
            } else {
                ggbVar = ggbVar2;
            }
            gfiVar.m = ggbVar;
        }
        if (this.a.c) {
            Runnable runnableA = this.b.a(this.a);
            if (runnableA != null) {
                runnableA.run();
            }
            if (this.b.m.d == this.a) {
                this.b.p.b(fvcVar, ftvVar);
                return;
            }
            return;
        }
        if (this.b.m.d == null) {
            if (i == dp.aL && !this.b.n) {
                this.b.n = true;
                this.b.d.execute(new ggd(this));
                return;
            }
            if (i != dp.aM) {
                this.b.n = true;
                if (this.b.g == null) {
                    this.b.g = this.b.f.a();
                    this.b.r = this.b.g.b;
                }
                gga ggaVarA = a(this.b.g, fvcVar, ftvVar);
                if (ggaVarA.a) {
                    this.b.q = this.b.e.schedule(new gge(this), ggaVarA.b, TimeUnit.NANOSECONDS);
                    return;
                }
            }
        }
        gfi.c();
        Runnable runnableA2 = this.b.a(this.a);
        if (runnableA2 != null) {
            runnableA2.run();
        }
        if (this.b.m.d == this.a) {
            this.b.p.b(fvcVar, ftvVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00aa  */
    private final gga a(ggi ggiVar, fvc fvcVar, ftv ftvVar) {
        Integer numValueOf;
        boolean z;
        long nanos;
        boolean z2;
        boolean z3 = false;
        boolean zContains = ggiVar.e.contains(fvcVar.m);
        String str = (String) ftvVar.a(gfi.a);
        if (str == null) {
            numValueOf = null;
        } else {
            try {
                numValueOf = Integer.valueOf(str);
            } catch (NumberFormatException e) {
                numValueOf = -1;
            }
        }
        if (this.b.l == null || (!zContains && (numValueOf == null || numValueOf.intValue() >= 0))) {
            z = false;
        } else {
            ggh gghVar = this.b.l;
            while (true) {
                int i = gghVar.d.get();
                if (i == 0) {
                    z2 = false;
                    break;
                }
                int i2 = i - 1000;
                if (gghVar.d.compareAndSet(i, Math.max(i2, 0))) {
                    if (i2 <= gghVar.b) {
                        z2 = false;
                        break;
                    }
                    z2 = true;
                    break;
                }
            }
            z = !z2;
        }
        if (ggiVar.a <= this.a.d + 1 || z) {
            nanos = 0;
        } else if (numValueOf == null) {
            if (!zContains) {
                nanos = 0;
            } else {
                nanos = (long) (this.b.r * gfi.s.nextDouble());
                this.b.r = Math.min((long) (this.b.r * ggiVar.d), ggiVar.c);
                z3 = true;
            }
        } else if (numValueOf.intValue() < 0) {
            nanos = 0;
        } else {
            nanos = TimeUnit.MILLISECONDS.toNanos(numValueOf.intValue());
            this.b.r = ggiVar.b;
            z3 = true;
        }
        return new gga(z3, nanos);
    }

    @Override // flm.ghf
    public final void a(ghg ghgVar) {
        ggb ggbVar = this.b.m;
        dvl.b(ggbVar.d != null, "Headers should be received prior to messages.");
        if (ggbVar.d == this.a) {
            this.b.p.a(ghgVar);
        }
    }

    @Override // flm.ghf
    public final void a() {
        if (this.b.m.c.contains(this.a)) {
            this.b.p.a();
        }
    }
}

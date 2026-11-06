package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class gfy extends frt {
    private final ggg a;
    private long b;
    private final /* synthetic */ gfi c;

    gfy(gfi gfiVar, ggg gggVar) {
        this.c = gfiVar;
        this.a = gggVar;
    }

    @Override // flm.fvi
    public final void a(long j) {
        if (this.c.m.d == null) {
            Runnable runnableA = null;
            synchronized (this.c.h) {
                if (this.c.m.d == null && !this.a.b) {
                    this.b += j;
                    if (this.b > this.c.o) {
                        if (this.b > this.c.j) {
                            this.a.c = true;
                        } else {
                            long jA = this.c.i.a(this.b - this.c.o);
                            this.c.o = this.b;
                            if (jA > this.c.k) {
                                this.a.c = true;
                            }
                        }
                        if (this.a.c) {
                            runnableA = this.c.a(this.a);
                        }
                        if (runnableA != null) {
                            runnableA.run();
                        }
                    }
                }
            }
        }
    }
}

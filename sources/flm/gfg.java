package flm;

import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class gfg implements Runnable {
    private final /* synthetic */ gff a;

    gfg(gff gffVar) {
        this.a = gffVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.a.e) {
            this.a.f = null;
            return;
        }
        long jA = this.a.a();
        if (this.a.d - jA > 0) {
            this.a.f = this.a.a.schedule(new gfh(this.a), this.a.d - jA, TimeUnit.NANOSECONDS);
        } else {
            this.a.e = false;
            this.a.f = null;
            this.a.c.run();
        }
    }
}

package flm;

import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class gcr implements Runnable {
    private final /* synthetic */ gcp a;

    gcr(gcp gcpVar) {
        this.a = gcpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.f = null;
        boolean z = false;
        synchronized (this.a) {
            if (this.a.l == dp.aP) {
                z = true;
                this.a.l = dp.aR;
                this.a.e = this.a.a.schedule(this.a.g, this.a.i, TimeUnit.NANOSECONDS);
            } else if (this.a.l == dp.aQ) {
                this.a.f = this.a.a.schedule(this.a.h, this.a.d - this.a.b.a(), TimeUnit.NANOSECONDS);
                this.a.l = dp.aP;
            }
        }
        if (z) {
            this.a.c.a();
        }
    }
}

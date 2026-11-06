package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class gcq implements Runnable {
    private final /* synthetic */ gcp a;

    gcq(gcp gcpVar) {
        this.a = gcpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z = false;
        synchronized (this.a) {
            if (this.a.l != dp.aT) {
                this.a.l = dp.aT;
                z = true;
            }
        }
        if (z) {
            this.a.c.b();
        }
    }
}

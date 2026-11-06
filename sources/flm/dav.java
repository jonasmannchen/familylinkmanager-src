package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dav implements Runnable {
    private final /* synthetic */ dau a;

    dav(dau dauVar) {
        this.a = dauVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.a.a) {
            if (this.a.b != null) {
                this.a.b.a();
            }
        }
    }
}

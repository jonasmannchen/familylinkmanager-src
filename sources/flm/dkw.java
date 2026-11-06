package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dkw implements Runnable {
    private final /* synthetic */ Runnable a;
    private final /* synthetic */ dkv b;

    dkw(dkv dkvVar, Runnable runnable) {
        this.b = dkvVar;
        this.a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.a.run();
        } catch (Throwable th) {
            this.b.a.a(th);
            throw th;
        }
    }
}

package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class fxd implements Runnable {
    private final /* synthetic */ Throwable a;
    private final /* synthetic */ fww b;

    fxd(fww fwwVar, Throwable th) {
        this.b = fwwVar;
        this.a = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.a.a(this.a);
    }
}

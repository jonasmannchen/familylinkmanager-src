package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class fxc implements Runnable {
    private final /* synthetic */ boolean a;
    private final /* synthetic */ fww b;

    fxc(fww fwwVar, boolean z) {
        this.b = fwwVar;
        this.a = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.a.a(this.a);
    }
}

package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class fxb implements Runnable {
    private final /* synthetic */ int a;
    private final /* synthetic */ fww b;

    fxb(fww fwwVar, int i) {
        this.b = fwwVar;
        this.a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.a.a(this.a);
    }
}

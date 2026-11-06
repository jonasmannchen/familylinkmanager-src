package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class gaf implements Runnable {
    private final /* synthetic */ fzu a;

    gaf(fzu fzuVar) {
        this.a = fzuVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.b.f();
    }
}

package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class gag implements Runnable {
    private final /* synthetic */ fvc a;
    private final /* synthetic */ fzu b;

    gag(fzu fzuVar, fvc fvcVar) {
        this.b = fzuVar;
        this.a = fvcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.b.b(this.a);
    }
}

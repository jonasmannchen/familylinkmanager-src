package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class fzz implements Runnable {
    private final /* synthetic */ fsp a;
    private final /* synthetic */ fzu b;

    fzz(fzu fzuVar, fsp fspVar) {
        this.b = fzuVar;
        this.a = fspVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.b.a(this.a);
    }
}

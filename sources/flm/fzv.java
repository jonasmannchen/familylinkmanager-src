package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class fzv implements Runnable {
    private final /* synthetic */ int a;
    private final /* synthetic */ fzu b;

    fzv(fzu fzuVar, int i) {
        this.b = fzuVar;
        this.a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.b.b(this.a);
    }
}

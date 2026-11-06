package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class fzx implements Runnable {
    private final /* synthetic */ fry a;
    private final /* synthetic */ fzu b;

    fzx(fzu fzuVar, fry fryVar) {
        this.b = fzuVar;
        this.a = fryVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.b.a(this.a);
    }
}

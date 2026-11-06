package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class fzy implements Runnable {
    private final /* synthetic */ boolean a;
    private final /* synthetic */ fzu b;

    fzy(fzu fzuVar, boolean z) {
        this.b = fzuVar;
        this.a = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.b.a(this.a);
    }
}

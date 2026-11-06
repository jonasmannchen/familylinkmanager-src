package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class gad implements Runnable {
    private final /* synthetic */ fza a;
    private final /* synthetic */ fzu b;

    gad(fzu fzuVar, fza fzaVar) {
        this.b = fzuVar;
        this.a = fzaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.b.a(this.a);
    }
}

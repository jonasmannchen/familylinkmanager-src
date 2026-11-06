package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class fzs implements Runnable {
    private final /* synthetic */ fzt a;
    private final /* synthetic */ fzb b;

    fzs(fzt fztVar, fzb fzbVar) {
        this.a = fztVar;
        this.b = fzbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.a(this.b);
    }
}

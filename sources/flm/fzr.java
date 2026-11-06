package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class fzr implements Runnable {
    private final /* synthetic */ fvc a;
    private final /* synthetic */ fzn b;

    fzr(fzn fznVar, fvc fvcVar) {
        this.b = fznVar;
        this.a = fvcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.e.a(this.a);
    }
}

package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class fwo implements Runnable {
    private final /* synthetic */ fvc a;
    private final /* synthetic */ int b;
    private final /* synthetic */ ftv c;
    private final /* synthetic */ fwn d;

    fwo(fwn fwnVar, fvc fvcVar, int i, ftv ftvVar) {
        this.d = fwnVar;
        this.a = fvcVar;
        this.b = i;
        this.c = ftvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.d.a(this.a, this.b, this.c);
    }
}

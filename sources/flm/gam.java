package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class gam implements Runnable {
    private final /* synthetic */ fvc a;
    private final /* synthetic */ ftv b;
    private final /* synthetic */ gai c;

    gam(gai gaiVar, fvc fvcVar, ftv ftvVar) {
        this.c = gaiVar;
        this.a = fvcVar;
        this.b = ftvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.a.b(this.a, this.b);
    }
}

package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class gal implements Runnable {
    private final /* synthetic */ ftv a;
    private final /* synthetic */ gai b;

    gal(gai gaiVar, ftv ftvVar) {
        this.b = gaiVar;
        this.a = ftvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.a.a(this.a);
    }
}

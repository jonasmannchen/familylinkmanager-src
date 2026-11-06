package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class gan implements Runnable {
    private final /* synthetic */ fvc a;
    private final /* synthetic */ int b;
    private final /* synthetic */ ftv c;
    private final /* synthetic */ gai d;

    gan(gai gaiVar, fvc fvcVar, int i, ftv ftvVar) {
        this.d = gaiVar;
        this.a = fvcVar;
        this.b = i;
        this.c = ftvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.d.a.a(this.a, this.b, this.c);
    }
}

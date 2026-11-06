package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class pm implements Runnable {
    private final /* synthetic */ int a;
    private final /* synthetic */ pk b;

    pm(pk pkVar, int i) {
        this.b = pkVar;
        this.a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.a(this.a);
    }
}

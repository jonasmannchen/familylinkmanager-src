package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class rf implements Runnable {
    private final /* synthetic */ Object a;
    private final /* synthetic */ re b;

    rf(re reVar, Object obj) {
        this.b = reVar;
        this.a = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.a.a(this.a);
    }
}

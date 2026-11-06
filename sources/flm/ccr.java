package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ccr implements Runnable {
    private final /* synthetic */ cco a;

    ccr(cco ccoVar) {
        this.a = ccoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        btv.a("TimeLimit", "Observer:pulling callback", new Object[0]);
        this.a.b();
    }
}

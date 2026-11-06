package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class cbp implements Runnable {
    private final /* synthetic */ int a;
    private final /* synthetic */ boolean b;
    private final /* synthetic */ cbn c;

    cbp(cbn cbnVar, int i, boolean z) {
        this.c = cbnVar;
        this.a = i;
        this.b = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.a(this.a, this.b ? 0 : 1);
    }
}

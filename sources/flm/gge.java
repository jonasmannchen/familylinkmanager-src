package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class gge implements Runnable {
    public final /* synthetic */ ggc a;

    gge(ggc ggcVar) {
        this.a = ggcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.b.q = null;
        this.a.b.d.execute(new ggf(this));
    }
}

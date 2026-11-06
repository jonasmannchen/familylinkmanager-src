package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class gdu implements Runnable {
    public boolean a;
    private final /* synthetic */ gda b;

    gdu(gda gdaVar) {
        this.b = gdaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a) {
            return;
        }
        this.b.S = null;
        this.b.T = null;
        if (this.b.t != null) {
            this.b.t.c();
        }
    }
}

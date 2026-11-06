package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class wc implements Runnable {
    private final /* synthetic */ wb a;

    wc(wb wbVar) {
        this.a = wbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if ((this.a.p & 1) != 0) {
            this.a.e(0);
        }
        if ((this.a.p & 4096) != 0) {
            this.a.e(108);
        }
        this.a.o = false;
        this.a.p = 0;
    }
}

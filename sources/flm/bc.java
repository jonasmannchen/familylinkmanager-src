package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class bc implements Runnable {
    private final ag a;
    private final y b;
    private boolean c = false;

    bc(ag agVar, y yVar) {
        this.a = agVar;
        this.b = yVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.c) {
            this.a.a(this.b);
            this.c = true;
        }
    }
}

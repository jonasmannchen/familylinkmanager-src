package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class fwx implements Runnable {
    private final /* synthetic */ int a;
    private final /* synthetic */ fww b;

    fwx(fww fwwVar, int i) {
        this.b = fwwVar;
        this.a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b.b.b()) {
            return;
        }
        try {
            this.b.b.c(this.a);
        } catch (Throwable th) {
            this.b.a.a(th);
            this.b.b.close();
        }
    }
}

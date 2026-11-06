package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class fwy implements Runnable {
    private final /* synthetic */ gez a;
    private final /* synthetic */ fww b;

    fwy(fww fwwVar, gez gezVar) {
        this.b = fwwVar;
        this.a = gezVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.b.b.a(this.a);
        } catch (Throwable th) {
            this.b.a(th);
            this.b.b.close();
        }
    }
}

package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class fxa implements Runnable {
    private final /* synthetic */ fww a;

    fxa(fww fwwVar) {
        this.a = fwwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.b.close();
    }
}

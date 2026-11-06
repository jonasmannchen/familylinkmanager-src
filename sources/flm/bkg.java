package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class bkg implements Runnable {
    private final /* synthetic */ bjk a;
    private final /* synthetic */ bke b;

    bkg(bke bkeVar, bjk bjkVar) {
        this.b = bkeVar;
        this.a = bjkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bke bkeVar = this.b;
        bjk bjkVar = this.a;
        synchronized (bkeVar.d) {
            if (bkeVar.b == null) {
                return;
            }
            bkeVar.b.a(bjkVar);
        }
    }
}

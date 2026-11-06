package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dbe implements Runnable {
    private final /* synthetic */ dbh a;
    private final /* synthetic */ dbd b;

    dbe(dbd dbdVar, dbh dbhVar) {
        this.b = dbdVar;
        this.a = dbhVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.b.a) {
            if (this.b.b != null) {
                this.b.b.a(this.a.d());
            }
        }
    }
}

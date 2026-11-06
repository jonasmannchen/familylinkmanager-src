package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class day implements Runnable {
    private final /* synthetic */ dbh a;
    private final /* synthetic */ dax b;

    day(dax daxVar, dbh dbhVar) {
        this.b = daxVar;
        this.a = dbhVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.b.a) {
            if (this.b.b != null) {
                this.b.b.a(this.a);
            }
        }
    }
}

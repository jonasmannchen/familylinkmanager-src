package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dbb implements Runnable {
    private final /* synthetic */ dbh a;
    private final /* synthetic */ dba b;

    dbb(dba dbaVar, dbh dbhVar) {
        this.b = dbaVar;
        this.a = dbhVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.b.a) {
            if (this.b.b != null) {
                this.b.b.a(this.a.e());
            }
        }
    }
}

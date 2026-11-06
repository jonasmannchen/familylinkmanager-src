package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dat implements Runnable {
    private final /* synthetic */ dbh a;
    private final /* synthetic */ das b;

    dat(das dasVar, dbh dbhVar) {
        this.b = dasVar;
        this.a = dbhVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            dbh dbhVar = (dbh) this.b.a.a(this.a);
            if (dbhVar == null) {
                this.b.a((Exception) new NullPointerException("Continuation returned null"));
                return;
            }
            dbhVar.a(dbl.b, (dbf) this.b);
            dbhVar.a(dbl.b, (dbc) this.b);
            dbhVar.a(dbl.b, (daw) this.b);
        } catch (dbg e) {
            if (e.getCause() instanceof Exception) {
                this.b.b.a((Exception) e.getCause());
            } else {
                this.b.b.a((Exception) e);
            }
        } catch (Exception e2) {
            this.b.b.a(e2);
        }
    }
}

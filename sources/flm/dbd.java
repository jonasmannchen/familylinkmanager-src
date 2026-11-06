package flm;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dbd implements dbi {
    public final Object a = new Object();
    public dbf b;
    private final Executor c;

    public dbd(Executor executor, dbf dbfVar) {
        this.c = executor;
        this.b = dbfVar;
    }

    @Override // flm.dbi
    public final void a(dbh dbhVar) {
        if (dbhVar.b()) {
            synchronized (this.a) {
                if (this.b != null) {
                    this.c.execute(new dbe(this, dbhVar));
                }
            }
        }
    }
}

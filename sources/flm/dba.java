package flm;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dba implements dbi {
    public final Object a = new Object();
    public dbc b;
    private final Executor c;

    public dba(Executor executor, dbc dbcVar) {
        this.c = executor;
        this.b = dbcVar;
    }

    @Override // flm.dbi
    public final void a(dbh dbhVar) {
        if (!dbhVar.b() && !dbhVar.c()) {
            synchronized (this.a) {
                if (this.b != null) {
                    this.c.execute(new dbb(this, dbhVar));
                }
            }
        }
    }
}

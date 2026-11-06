package flm;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class das implements daw, dbc, dbf, dbi {
    public final dap a;
    public final dbo b;
    private final Executor c;

    public das(Executor executor, dap dapVar, dbo dboVar) {
        this.c = executor;
        this.a = dapVar;
        this.b = dboVar;
    }

    @Override // flm.dbi
    public final void a(dbh dbhVar) {
        this.c.execute(new dat(this, dbhVar));
    }

    @Override // flm.dbf
    public final void a(Object obj) {
        this.b.a(obj);
    }

    @Override // flm.dbc
    public final void a(Exception exc) {
        this.b.a(exc);
    }

    @Override // flm.daw
    public final void a() {
        this.b.f();
    }
}

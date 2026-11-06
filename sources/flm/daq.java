package flm;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class daq implements dbi {
    public final dap a;
    public final dbo b;
    private final Executor c;

    public daq(Executor executor, dap dapVar, dbo dboVar) {
        this.c = executor;
        this.a = dapVar;
        this.b = dboVar;
    }

    @Override // flm.dbi
    public final void a(dbh dbhVar) {
        this.c.execute(new dar(this, dbhVar));
    }
}

package flm;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dax implements dbi {
    public final Object a = new Object();
    public daz b;
    private final Executor c;

    public dax(Executor executor, daz dazVar) {
        this.c = executor;
        this.b = dazVar;
    }

    @Override // flm.dbi
    public final void a(dbh dbhVar) {
        synchronized (this.a) {
            if (this.b != null) {
                this.c.execute(new day(this, dbhVar));
            }
        }
    }
}

package flm;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dau implements dbi {
    public final Object a = new Object();
    public daw b;
    private final Executor c;

    public dau(Executor executor, daw dawVar) {
        this.c = executor;
        this.b = dawVar;
    }

    @Override // flm.dbi
    public final void a(dbh dbhVar) {
        if (dbhVar.c()) {
            synchronized (this.a) {
                if (this.b != null) {
                    this.c.execute(new dav(this));
                }
            }
        }
    }
}

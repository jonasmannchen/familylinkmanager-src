package flm;

import java.util.ArrayDeque;
import java.util.Queue;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dbj {
    private final Object a = new Object();
    private Queue b;
    private boolean c;

    dbj() {
    }

    public final void a(dbi dbiVar) {
        synchronized (this.a) {
            if (this.b == null) {
                this.b = new ArrayDeque();
            }
            this.b.add(dbiVar);
        }
    }

    public final void a(dbh dbhVar) {
        dbi dbiVar;
        synchronized (this.a) {
            if (this.b != null && !this.c) {
                this.c = true;
                while (true) {
                    synchronized (this.a) {
                        dbiVar = (dbi) this.b.poll();
                        if (dbiVar == null) {
                            this.c = false;
                            return;
                        }
                    }
                    dbiVar.a(dbhVar);
                }
            }
        }
    }
}

package flm;

import java.lang.ref.ReferenceQueue;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dox {
    public doy a;
    public dow b;
    private final dpb c;
    private boolean d;

    public dox(boolean z) {
        this(new dpb(z));
    }

    private dox(dpb dpbVar) {
        this.d = false;
        this.c = (dpb) dse.a(dpbVar);
    }

    public final synchronized void a(Object obj, String str) {
        if (this.d) {
            if (this.a == null) {
                this.a = new doy(new ReferenceQueue(), new dpa(), this.b, this.c.a);
                this.a.start();
                dkm.a(3, "LeakWatcher", "Starting leak watcher thread.", new Object[0]);
            }
            doy doyVar = this.a;
            dse.a(str);
            dse.a(obj);
            dkm.a(3, "LeakWatcherThread", "Watching %s", str);
            dou douVarA = doyVar.d.a(obj, str, doyVar.a);
            synchronized (doyVar.c) {
                douVarA.a(doyVar.c);
            }
        }
    }

    public final synchronized void a() {
        this.d = true;
    }

    public final synchronized void b() {
        if (this.d) {
            this.d = false;
            if (this.a != null) {
                this.a.interrupt();
                this.a = null;
            }
            dkm.a(3, "LeakWatcher", "Stopping leak watcher thread.", new Object[0]);
        }
    }
}

package flm;

import java.util.Iterator;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dsi implements Runnable {
    private final /* synthetic */ dsh a;

    public dsi(dsh dshVar) {
        this.a = dshVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        while (!this.a.c.isShutdown()) {
            try {
                ((dsk) this.a.b.remove()).a.a((Object) null);
            } catch (InterruptedException e) {
                try {
                    this.a.c.execute(this);
                    return;
                } catch (RejectedExecutionException e2) {
                    Iterator it = dsh.a.keySet().iterator();
                    while (it.hasNext()) {
                        ((dsk) it.next()).a.a((Throwable) e2);
                    }
                    return;
                }
            } catch (Throwable th) {
                try {
                    this.a.c.execute(this);
                    throw th;
                } catch (RejectedExecutionException e3) {
                    Iterator it2 = dsh.a.keySet().iterator();
                    while (it2.hasNext()) {
                        ((dsk) it2.next()).a.a((Throwable) e3);
                    }
                    throw th;
                }
            }
        }
        try {
            this.a.c.execute(this);
        } catch (RejectedExecutionException e4) {
            Iterator it3 = dsh.a.keySet().iterator();
            while (it3.hasNext()) {
                ((dsk) it3.next()).a.a((Throwable) e4);
            }
        }
    }
}

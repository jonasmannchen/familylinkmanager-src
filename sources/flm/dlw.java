package flm;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class dlw {
    public volatile boolean a;
    private final List b = new ArrayList();

    public abstract void a(Context context, dmb dmbVar);

    public final synchronized void a() {
        if (!this.a) {
            this.a = true;
            dkm.a(3, "PrimesShutdown", "Shutdown ...", new Object[0]);
            synchronized (this.b) {
                Iterator it = this.b.iterator();
                while (it.hasNext()) {
                    try {
                        ((dlx) it.next()).g_();
                    } catch (RuntimeException e) {
                        dkm.a("PrimesShutdown", "ShutdownListener crashed", e, new Object[0]);
                    }
                }
                this.b.clear();
                dkm.a(3, "PrimesShutdown", "All ShutdownListeners notified.", new Object[0]);
            }
        }
    }

    public final void a(dmb dmbVar) {
        if (!this.a && ((Boolean) dmbVar.a()).booleanValue()) {
            a();
        }
    }

    public final boolean a(dlx dlxVar) {
        boolean z;
        synchronized (this.b) {
            if (this.a) {
                z = false;
            } else {
                this.b.add((dlx) dse.a(dlxVar));
                z = true;
            }
        }
        return z;
    }
}

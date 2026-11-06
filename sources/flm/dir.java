package flm;

import android.os.SystemClock;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dir implements diw {
    public volatile dgo a;
    public final AtomicReference b = new AtomicReference();
    public final AtomicReference c = new AtomicReference();
    public final Queue d = new ConcurrentLinkedQueue();
    public final dvi e;

    dir(boolean z) {
        this.e = z ? dvi.b(new ConcurrentHashMap()) : dur.a;
    }

    private final void a(diu diuVar) {
        synchronized (this.d) {
            if (this.a == null) {
                this.d.add(diuVar);
            } else {
                diuVar.a(this.a);
            }
        }
    }

    final void a(dgo dgoVar) {
        diu diuVar = (diu) this.d.poll();
        while (diuVar != null) {
            diuVar.a(dgoVar);
            diuVar = (diu) this.d.poll();
        }
    }

    @Override // flm.diw
    public final void a(dmm dmmVar, String str, boolean z, long j, long j2, gpr gprVar) {
        a(new dit(dmmVar, str, z, j, j2, gprVar));
    }

    @Override // flm.diw
    public final dme c() {
        return this.e.a() ? new dme() : dme.d;
    }

    @Override // flm.diw
    public final void a(dme dmeVar, String str, boolean z, int i) {
        if (dmeVar != null && dmeVar != dme.d) {
            dmeVar.b = SystemClock.elapsedRealtime();
            a(new dis(dmeVar, str, z, null, i));
        }
    }

    @Override // flm.diw
    public final void a(dmd dmdVar, grh grhVar, gpr gprVar) {
    }

    @Override // flm.diw
    public final void b() {
        this.d.clear();
    }
}

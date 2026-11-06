package flm;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class fxx extends fru {
    public static final AtomicIntegerFieldUpdater a;
    private static final AtomicReferenceFieldUpdater h;
    public final fxv b;
    public final dvw c;
    public volatile fxy d;
    public volatile int e;
    public final glv f;
    public final boolean g;
    private final glv i;

    fxx(fxv fxvVar, glv glvVar, String str, boolean z, boolean z2) {
        this.b = fxvVar;
        this.i = (glv) dvl.a(glvVar);
        this.f = fxvVar.d.a(glvVar).a(gku.b, gly.a(str)).a();
        this.c = ((dvw) fxvVar.f.a()).a();
        this.g = z2;
        if (z) {
            fxvVar.e.a().a().a(this.f);
        }
    }

    @Override // flm.fru
    public final frt a(ftv ftvVar) {
        fxy fxyVar = new fxy();
        if (h != null) {
            dvl.b(h.compareAndSet(this, null, fxyVar), "Are you creating multiple streams per call? This class doesn't yet support this case");
        } else {
            dvl.b(this.d == null, "Are you creating multiple streams per call? This class doesn't yet support this case");
            this.d = fxyVar;
        }
        if (this.b.h) {
            ftvVar.b(this.b.g);
            if (!this.b.d.a().equals(this.i)) {
                ftvVar.a(this.b.g, this.i);
            }
        }
        return fxyVar;
    }

    static {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdaterNewUpdater;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = null;
        try {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdaterNewUpdater = AtomicReferenceFieldUpdater.newUpdater(fxx.class, fxy.class, "d");
            atomicIntegerFieldUpdaterNewUpdater = AtomicIntegerFieldUpdater.newUpdater(fxx.class, "e");
            atomicReferenceFieldUpdater = atomicReferenceFieldUpdaterNewUpdater;
        } catch (Throwable th) {
            fxv.a.logp(Level.SEVERE, "io.grpc.internal.CensusStatsModule$ClientCallTracer", "<clinit>", "Creating atomic field updaters failed", th);
            atomicIntegerFieldUpdaterNewUpdater = null;
        }
        h = atomicReferenceFieldUpdater;
        a = atomicIntegerFieldUpdaterNewUpdater;
    }
}

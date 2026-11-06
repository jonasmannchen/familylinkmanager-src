package flm;

import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dtc extends dsv {
    public final AtomicInteger d;
    private final dtd e;
    private final drr f;
    private final long g;
    private final AtomicInteger h;
    private final long i;
    private final int j;

    dtc(UUID uuid, dtd dtdVar, drr drrVar, String str, long j, dtn dtnVar, AtomicInteger atomicInteger, boolean z) {
        super(str, uuid, dtnVar);
        this.j = 0;
        this.h = atomicInteger;
        this.g = j;
        this.e = dtdVar;
        this.f = drrVar;
        this.i = 0L;
        this.d = z ? new AtomicInteger() : null;
    }

    private dtc(String str, dtc dtcVar, int i, long j, dtn dtnVar) {
        super(str, dtcVar, dtnVar);
        this.j = i;
        this.e = dtcVar.e;
        this.f = dtcVar.f;
        this.g = dtcVar.g;
        this.h = dtcVar.h;
        this.i = j;
        this.d = dtcVar.d != null ? new AtomicInteger() : null;
    }

    @Override // flm.dtq
    public final dtq a(String str, dtn dtnVar) {
        return new dtc(str, this, this.h.incrementAndGet(), this.f.b() - this.g, dtnVar);
    }

    @Override // flm.dtq
    public final void a(boolean z) {
        long jB = (this.f.b() - this.i) - this.g;
        dtg dtgVar = (dtg) ((fio) dtf.i.a(dp.au, (Object) null));
        dtgVar.a(this.b);
        dtgVar.a(((dtc) this.a).j);
        int i = this.j;
        dtgVar.c();
        dtf dtfVar = (dtf) dtgVar.a;
        dtfVar.a |= 2;
        dtfVar.c = i;
        dtgVar.a(this.i);
        dtgVar.b(jB);
        dtgVar.c();
        dtf dtfVar2 = (dtf) dtgVar.a;
        dtfVar2.a |= 64;
        dtfVar2.h = z;
        this.e.a(dtgVar, ((dsv) this).c, this.d);
    }

    @Override // flm.dtq
    public final void a(int i) {
        this.d.addAndGet(i);
    }

    @Override // flm.dtq
    public final boolean e() {
        return this.d != null;
    }
}

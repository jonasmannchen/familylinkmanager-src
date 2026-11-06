package flm;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dub implements dtd {
    public final long a;
    private final duf d;
    private final List f;
    private final List e = new ArrayList();
    public final SparseArray b = new SparseArray();
    public final ehb c = new ehb();
    private int g = 0;

    dub(duf dufVar, long j, boolean z) {
        this.d = dufVar;
        this.a = j;
        this.f = z ? new ArrayList() : null;
    }

    final duf a() {
        duf dufVar = this.d;
        fio fioVar = (fio) dufVar.a(dp.au, (Object) null);
        fioVar.a((fin) dufVar);
        dug dugVar = (dug) fioVar;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= this.e.size()) {
                break;
            }
            dtg dtgVar = (dtg) this.e.get(i2);
            if (this.f != null) {
                int i3 = ((AtomicInteger) this.f.get(i2)).get();
                dtgVar.c();
                dtf dtfVar = (dtf) dtgVar.a;
                dtfVar.a |= 32;
                dtfVar.g = i3;
            }
            dugVar.c();
            duf dufVar2 = (duf) dugVar.a;
            if (!dufVar2.d.a()) {
                dufVar2.d = fin.a(dufVar2.d);
            }
            dufVar2.d.add((dtf) ((fin) dtgVar.h()));
            i = i2 + 1;
        }
        if (this.g != 0) {
            dsn dsnVar = (dsn) ((fio) dsm.d.a(dp.au, (Object) null));
            dsr dsrVar = (dsr) ((fio) dsq.c.a(dp.au, (Object) null));
            int i4 = this.g;
            dsrVar.c();
            dsq dsqVar = (dsq) dsrVar.a;
            dsqVar.a |= 1;
            dsqVar.b = i4;
            dsq dsqVar2 = (dsq) ((fin) dsrVar.h());
            dsnVar.c();
            dsm dsmVar = (dsm) dsnVar.a;
            if (dsqVar2 == null) {
                throw new NullPointerException();
            }
            dsmVar.b = dsqVar2;
            dsmVar.a |= 1;
            dugVar.a((dsm) ((fin) dsnVar.h()));
        }
        return (duf) ((fin) dugVar.h());
    }

    @Override // flm.dtd
    public final synchronized void a(dtg dtgVar, dtn dtnVar, AtomicInteger atomicInteger) {
        if (this.e.size() >= 100) {
            this.g++;
        } else {
            this.e.add(dtgVar);
            if (this.f != null) {
                this.f.add(atomicInteger);
            }
            this.b.put(((dtf) dtgVar.a).c, dtnVar);
        }
    }
}

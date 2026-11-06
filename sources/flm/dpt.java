package flm;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dpt {
    private final dps a;
    private final List b = new ArrayList();
    private long c = 1;

    public dpt(dps dpsVar) {
        this.a = dpsVar;
    }

    private final void a(dps dpsVar, long j) {
        grl grlVar;
        List list = dpsVar.g;
        dpsVar.g = dpr.a;
        if (!dpsVar.a() || !list.isEmpty()) {
            long j2 = this.c;
            this.c = 1 + j2;
            grk grkVar = (grk) ((fio) grj.l.a(dp.au, (Object) null));
            if (dpsVar.b == dp.R) {
                grkVar.a(dpsVar.a);
            } else {
                grkVar.b(dpsVar.a);
            }
            grk grkVarD = grkVar.c(dpsVar.c).d(dpsVar.d == -1 ? -1L : dpsVar.d - dpsVar.c);
            long j3 = dpsVar.e;
            grkVarD.c();
            grj grjVar = (grj) grkVarD.a;
            grjVar.a |= 256;
            grjVar.j = j3;
            grk grkVarB = grkVarD.a(j2).b(j);
            if (dpsVar.f == dp.V) {
                grlVar = grl.TRACE;
            } else {
                grlVar = grl.NONE;
            }
            grkVarB.c();
            grj grjVar2 = (grj) grkVarB.a;
            if (grlVar == null) {
                throw new NullPointerException();
            }
            grjVar2.a |= 512;
            grjVar2.k = grlVar.c;
            grj grjVar3 = (grj) ((fin) grkVarB.h());
            fio fioVar = (fio) grjVar3.a(dp.au, (Object) null);
            fioVar.a((fin) grjVar3);
            grk grkVar2 = (grk) fioVar;
            if (dpsVar.a()) {
                grkVar2.d(((dps) list.get(list.size() - 1)).d - dpsVar.c);
            }
            this.b.add((grj) ((fin) grkVar2.h()));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                a((dps) it.next(), ((grj) grkVar2.a).e);
            }
        }
    }

    public final grj[] a() {
        a(this.a, 0L);
        if (this.b.size() != 1) {
            return (grj[]) this.b.toArray(new grj[this.b.size()]);
        }
        dkm.a(3, "TraceDataToProto", "No other span except for root span. Dropping trace...", new Object[0]);
        return null;
    }
}

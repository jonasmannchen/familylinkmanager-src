package flm;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dki implements dke, dpz {
    private final dmb b;
    private final BlockingQueue c;

    dki(dmb dmbVar) {
        this(dmbVar, new ArrayBlockingQueue(5));
    }

    private dki(dmb dmbVar, BlockingQueue blockingQueue) {
        this.b = dmbVar;
        this.c = blockingQueue;
    }

    @Override // flm.dpz
    public final void a(gtr gtrVar) {
        dmb dmbVar;
        if (!((gtrVar.a & 8388608) == 8388608) && (dmbVar = (dmb) this.c.poll()) != null) {
            fio fioVar = (fio) gtrVar.a(dp.au, (Object) null);
            fioVar.a((fin) gtrVar);
            gts gtsVar = (gts) fioVar;
            gsx gsxVar = (gsx) dmbVar.a();
            if (gsxVar != null) {
                gtsVar.c();
                gtr gtrVar2 = (gtr) gtsVar.a;
                if (gsxVar == null) {
                    throw new NullPointerException();
                }
                gtrVar2.w = gsxVar;
                gtrVar2.a |= 8388608;
            }
            gtrVar = (gtr) ((fin) gtsVar.h());
        }
        ((dpz) dse.a((dpz) this.b.a())).a(gtrVar);
    }

    @Override // flm.dke
    public final void a(dmb dmbVar) {
        if (!this.c.offer(dmbVar)) {
            dkm.a(5, "PrimesForPrimes", "Queue overflow", new Object[0]);
        }
    }
}

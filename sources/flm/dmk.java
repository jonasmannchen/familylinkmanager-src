package flm;

import java.util.Arrays;
import java.util.UUID;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dmk implements Runnable {
    private final /* synthetic */ dpu a;
    private final /* synthetic */ dmj b;

    dmk(dmj dmjVar, dpu dpuVar) {
        this.b = dmjVar;
        this.a = dpuVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dmj dmjVar = this.b;
        grj[] grjVarArrA = dpy.a(dlo.a, this.a);
        if (grjVarArrA == null || grjVarArrA.length <= 0) {
            return;
        }
        grh grhVar = (grh) ((fin) ((gri) ((fio) grh.d.a(dp.au, (Object) null))).a(UUID.randomUUID().getLeastSignificantBits()).a(Arrays.asList(grjVarArrA)).h());
        gtr gtrVar = (gtr) ((fin) ((gts) ((fio) gtr.y.a(dp.au, (Object) null))).a(grhVar).h());
        Object[] objArr = new Object[2];
        objArr[0] = (grhVar.a & 1) == 1 ? Long.valueOf(grhVar.b) : null;
        objArr[1] = ((grj) grhVar.c.get(0)).b;
        dkm.a(3, "TraceMetricService", "Recording trace %d: %s", objArr);
        dmjVar.a(gtrVar);
    }
}

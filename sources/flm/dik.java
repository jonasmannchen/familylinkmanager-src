package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dik implements Runnable {
    private final /* synthetic */ dij a;

    dik(dij dijVar) {
        this.a = dijVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.a.c.b(this.a.a.i);
        if (this.a.a.f.getBoolean("primes.miniheapdump.isCalibrated", false)) {
            return;
        }
        dkm.a(3, "MiniHeapDumpMetric", "Logging calibration status", new Object[0]);
        gtc gtcVar = (gtc) ((fio) gtb.d.a(dp.au, (Object) null));
        int size = this.a.a.e.a.size();
        gtcVar.c();
        gtb gtbVar = (gtb) gtcVar.a;
        gtbVar.a |= 1;
        gtbVar.b = size;
        this.a.a.a((gtb) ((fin) gtcVar.h()));
    }
}

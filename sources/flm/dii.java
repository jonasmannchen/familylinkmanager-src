package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dii implements Runnable {
    private final /* synthetic */ dih a;

    dii(dih dihVar) {
        this.a = dihVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int iA = dpg.a(this.a.a.a);
        dkm.a(3, "MiniHeapDumpMetric", new StringBuilder(36).append("Background total pss kb: ").append(iA).toString(), new Object[0]);
        this.a.a.a(iA);
        dig digVar = this.a.a;
        if (digVar.e.a()) {
            digVar.f.edit().putBoolean("primes.miniheapdump.isCalibrated", true).apply();
            gtc gtcVar = (gtc) ((fio) gtb.d.a(dp.au, (Object) null));
            float fB = (float) digVar.e.b(iA);
            gtcVar.c();
            gtb gtbVar = (gtb) gtcVar.a;
            gtbVar.a |= 2;
            gtbVar.c = fB;
            digVar.a((gtb) ((fin) gtcVar.h()));
        }
    }
}

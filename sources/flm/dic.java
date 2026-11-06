package flm;

import android.os.SystemClock;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dic {
    public final dpp a;
    public final dmb b;
    public final int c;
    private final dpz d;
    private final dmb e;

    dic(dpz dpzVar, dmb dmbVar, dmb dmbVar2, int i, int i2) {
        this.d = (dpz) dse.a(dpzVar);
        this.e = (dmb) dse.a(dmbVar);
        this.b = dmbVar2;
        this.c = i;
        this.a = new dpp(i2);
    }

    final void a(String str, boolean z, gtr gtrVar, gpr gprVar, String str2) {
        if (gtrVar == null) {
            String strValueOf = String.valueOf(str);
            dkm.a(5, "MetricRecorder", strValueOf.length() != 0 ? "metric is null, skipping recorded metric for event: ".concat(strValueOf) : new String("metric is null, skipping recorded metric for event: "), new Object[0]);
            return;
        }
        gtr gtrVarA = ((die) this.e.a()).a(gtrVar);
        fio fioVar = (fio) gtrVarA.a(dp.au, (Object) null);
        fioVar.a((fin) gtrVarA);
        gts gtsVar = (gts) fioVar;
        if (z) {
            if (str != null) {
                gtsVar.c();
                gtr gtrVar2 = (gtr) gtsVar.a;
                if (str == null) {
                    throw new NullPointerException();
                }
                gtrVar2.a |= 65536;
                gtrVar2.q = str;
            } else {
                gtsVar.n();
            }
        } else if (str != null) {
            gtsVar.a(str);
        } else {
            gtsVar.a();
        }
        if (gprVar != null) {
            gtsVar.a(gprVar);
        }
        if (str2 != null) {
            gtsVar.a(((gru) ((fio) grt.c.a(dp.au, (Object) null))).a(str2));
        }
        this.d.a((gtr) ((fin) gtsVar.h()));
        dpp dppVar = this.a;
        synchronized (dppVar.a) {
            dppVar.b++;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (jElapsedRealtime - dppVar.c > 1000) {
                dppVar.b = 0;
                dppVar.c = jElapsedRealtime;
            }
        }
    }
}

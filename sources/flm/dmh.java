package flm;

import android.app.Application;
import android.text.TextUtils;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dmh extends dmf {
    private final dmj e;

    dmh(dpz dpzVar, Application application, dmb dmbVar, dmb dmbVar2, dmj dmjVar, dpq dpqVar, int i, dvi dviVar, ConcurrentHashMap concurrentHashMap) {
        super(dpzVar, application, dmbVar, dmbVar2, dpqVar, i, dviVar, concurrentHashMap);
        this.e = dmjVar;
    }

    @Override // flm.dmf
    final synchronized dme e() {
        dme dmeVarE;
        boolean zA;
        dmeVarE = super.e();
        if (!dme.a(dmeVarE)) {
            dmj dmjVar = this.e;
            if (dmjVar.c.a()) {
                zA = dpy.a(dlo.a, "", dmjVar.d, dmjVar.e);
            } else {
                zA = false;
            }
            if (zA) {
                dmeVarE.e = true;
            }
        }
        return dmeVarE;
    }

    @Override // flm.dmf
    final synchronized void a(dme dmeVar, String str, boolean z, gpr gprVar) {
        super.a(dmeVar, str, z, gprVar);
        if (!dme.a(dmeVar)) {
            if (dmeVar.e) {
                dmj dmjVar = this.e;
                dlo dloVar = dlo.a;
                if (!TextUtils.isEmpty(str)) {
                }
                dpu dpuVarA = dpy.a(dloVar, str);
                if (dpuVarA != null && dpuVarA != null) {
                    dmjVar.c().submit(new dmk(dmjVar, dpuVarA));
                }
            } else {
                long j = dmeVar.a;
                long jA = dmeVar.a();
                if (!TextUtils.isEmpty(str) && jA > 0) {
                    dpy.a(dlo.a, str, j, jA);
                }
            }
        }
    }

    @Override // flm.dmf, flm.dfm
    final void d() {
        super.d();
        dpy.a(dlo.a);
    }
}

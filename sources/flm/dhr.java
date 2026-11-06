package flm;

import android.app.Application;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dhr implements dmb {
    private final /* synthetic */ djl a;
    private final /* synthetic */ Application b;
    private final /* synthetic */ dmb c;
    private final /* synthetic */ dvi d;
    private final /* synthetic */ dhn e;

    dhr(dhn dhnVar, djl djlVar, Application application, dmb dmbVar, dvi dviVar) {
        this.e = dhnVar;
        this.a = djlVar;
        this.b = application;
        this.c = dmbVar;
        this.d = dviVar;
    }

    @Override // flm.dmb
    public final /* synthetic */ Object a() {
        dlx dmfVar;
        if (this.a.d().a() && ((dln) this.a.d().b()).a) {
            dhn dhnVar = this.e;
            dhn dhnVar2 = this.e;
            if (dhnVar2.d.j().a() && ((dlp) dhnVar2.d.j().b()).a) {
                dpz dpzVarA = this.e.a();
                Application application = this.b;
                dmb dmbVar = this.e.b;
                dmb dmbVar2 = this.c;
                dmj dmjVarI = this.e.i();
                dln dlnVar = (dln) this.a.d().b();
                dmfVar = new dmh(dpzVarA, application, dmbVar, dmbVar2, dmjVarI, new dpq(dlnVar.b), dlnVar.c, dlnVar.d, (ConcurrentHashMap) this.d.a(new ConcurrentHashMap()));
            } else {
                dpz dpzVarA2 = this.e.a();
                Application application2 = this.b;
                dmb dmbVar3 = this.e.b;
                dmb dmbVar4 = this.c;
                dln dlnVar2 = (dln) this.a.d().b();
                dmfVar = new dmf(dpzVarA2, application2, dmbVar3, dmbVar4, new dpq(dlnVar2.b), dlnVar2.c, dlnVar2.d, (ConcurrentHashMap) this.d.a(new ConcurrentHashMap()));
            }
            return dvi.b((dmf) dhnVar.a(dmfVar));
        }
        return dur.a;
    }
}

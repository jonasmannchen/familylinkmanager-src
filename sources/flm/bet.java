package flm;

import android.app.Application;
import android.content.Context;
import android.util.Log;
import com.google.android.gms.common.app.BaseApplicationContext;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bet {
    private static final dll a;

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public static void a(final BaseApplicationContext baseApplicationContext) {
        dll dllVar;
        boolean z;
        djm djmVar = new djm();
        if (fpg.b()) {
            if (!dfj.b(baseApplicationContext)) {
                z = true;
            } else {
                z = baseApplicationContext.getSharedPreferences("usagereporting", 0).getBoolean("OptInUsageReporting", false);
            }
            if (z) {
                djmVar.g = dvi.c(new dkr(((fph) fpg.a.a()).b(), true));
                djmVar.d = dvi.c(new dln(((fph) fpg.a.a()).c(), (int) ((fph) fpg.a.a()).i()));
                dlm dlmVarA = dll.a();
                dlmVarA.a = ((fph) fpg.a.a()).d();
                dlmVarA.b = (int) ((fph) fpg.a.a()).j();
                dlmVarA.c = Math.min(0.1f, (float) ((fph) fpg.a.a()).k());
                dlmVarA.d = false;
                djmVar.i = dvi.c(dlmVarA.a());
            }
        }
        dqf dqfVar = new dqf();
        for (dpz dpzVar : Arrays.asList(new ber(baseApplicationContext, new bes(new dfi(), (int) ((fph) fpg.a.a()).g(), (int) ((fph) fpg.a.a()).f(), (int) ((fph) fpg.a.a()).h()), (int) ((fph) fpg.a.a()).e(), new dvz(baseApplicationContext) { // from class: flm.bev
            private final Context a;

            {
                this.a = baseApplicationContext;
            }

            @Override // flm.dvz
            public final Object a() {
                return Boolean.valueOf(bid.a(this.a));
            }
        }))) {
            dse.a(dpzVar);
            dqfVar.b.add(dpzVar);
        }
        dse.b(dqfVar.a.size() > 0 || dqfVar.b.size() > 0);
        djmVar.a = new dqe(dqfVar.a, dqfVar.b).a();
        final djl djlVarA = djl.a(new djn(djmVar.a, djmVar.b, djmVar.c, djmVar.d, djmVar.e, djmVar.f, djmVar.g, djmVar.h, djmVar.i, djmVar.j, djmVar.k, djmVar.l, djmVar.m, djmVar.n, djmVar.o, djmVar.p));
        if ((djlVarA.g().a() && ((dkr) djlVarA.g().b()).a) || (djlVarA.d().a() && ((dln) djlVarA.d().b()).a) || ((djlVarA.i().a() && ((dll) djlVarA.i().b()).a) || ((djlVarA.c().a() && ((dkn) djlVarA.c().b()).a) || ((djlVarA.l().a() && (((dkp) djlVarA.l().b()).a || ((dkp) djlVarA.l().b()).b)) || (djlVarA.f().a() && ((dkq) djlVarA.f().b()).a))))) {
            Context baseContext = baseApplicationContext.getBaseContext();
            if (baseContext instanceof Application) {
                Application application = (Application) baseContext;
                djp djpVar = new djp(djlVarA) { // from class: flm.beu
                    private final djl a;

                    {
                        this.a = djlVarA;
                    }

                    @Override // flm.djp
                    public final djl a() {
                        return bet.a(this.a);
                    }
                };
                dlj dljVarA = dlh.a();
                dhd dhdVar = dhd.a;
                bhc bhcVarB = bgy.b(2, 10);
                if (dhdVar == null) {
                    throw new NullPointerException("token should not be null");
                }
                dljVarA.a = bhcVarB;
                div.a(dje.a(application, djpVar, dljVarA.a()));
            } else {
                Log.e("PrimesHelper", "The base Context of BaseApplicationContext should be an Application.");
            }
            if (djlVarA.i().a()) {
                dllVar = (dll) djlVarA.i().b();
            } else {
                dllVar = a;
            }
            bpj.a(dllVar);
            return;
        }
        bpj.a(a);
    }

    static final /* synthetic */ djl a(djl djlVar) {
        return djlVar;
    }

    static {
        dlm dlmVarA = dll.a();
        dlmVarA.a = false;
        a = dlmVarA.a();
    }
}

package flm;

import android.app.Application;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dje {
    public static dfn a(Application application, djp djpVar, dlh dlhVar) {
        Application application2 = (Application) dse.a(application);
        djf djfVar = new djf(application2);
        djfVar.c = new dnk();
        djfVar.b = new dfo();
        djfVar.c = new dnm(application2);
        djfVar.f = (djp) dse.a(djpVar);
        djfVar.g = (dlh) dse.a(dlhVar);
        dfs dfsVar = (dfs) dse.a(djfVar.b);
        Application application3 = (Application) dse.a(djfVar.a);
        djp djpVar2 = (djp) dse.a(djfVar.f);
        dmb dmbVar = (dmb) dse.a(djfVar.c);
        dmb dmbVar2 = djfVar.d;
        djg djgVar = new djg(djfVar);
        dlh dlhVarA = djfVar.g == null ? dlh.a().a() : djfVar.g;
        dmb dmbVar3 = djfVar.e;
        return dfsVar.a(application3, djpVar2, dmbVar, djgVar, dlhVarA, new djh());
    }

    static {
        new AtomicInteger();
    }
}

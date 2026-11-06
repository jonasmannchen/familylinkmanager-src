package flm;

import android.app.Application;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
class dmf extends dfm {
    private static final Set e = new HashSet(Arrays.asList("Cold startup", "Cold startup interactive", "Cold startup interactive before onDraw", "Warm startup", "Warm startup interactive", "Warm startup interactive before onDraw", "Warm startup activity onStart"));
    public final dpq c;
    public final dvi d;
    private final ConcurrentHashMap f;

    static gtr a(dme dmeVar) {
        return a(dmeVar, null);
    }

    static gtr a(dme dmeVar, String str) {
        gts gtsVar = (gts) ((fio) gtr.y.a(dp.au, (Object) null));
        gtu gtuVar = (gtu) ((fio) gtt.d.a(dp.au, (Object) null));
        long jA = dmeVar.a();
        gtuVar.c();
        gtt gttVar = (gtt) gtuVar.a;
        gttVar.a |= 1;
        gttVar.b = jA;
        grf grfVarA = dp.a(dmeVar.c);
        gtuVar.c();
        gtt gttVar2 = (gtt) gtuVar.a;
        if (grfVarA == null) {
            throw new NullPointerException();
        }
        gttVar2.a |= 2;
        gttVar2.c = grfVarA.e;
        gtt gttVar3 = (gtt) ((fin) gtuVar.h());
        gtsVar.c();
        gtr gtrVar = (gtr) gtsVar.a;
        if (gttVar3 == null) {
            throw new NullPointerException();
        }
        gtrVar.e = gttVar3;
        gtrVar.a |= 8;
        if (str != null) {
            gtsVar.a(((gru) ((fio) grt.c.a(dp.au, (Object) null))).a(str));
        }
        return (gtr) ((fin) gtsVar.h());
    }

    dmf(dpz dpzVar, Application application, dmb dmbVar, dmb dmbVar2, dpq dpqVar, int i, dvi dviVar, ConcurrentHashMap concurrentHashMap) {
        super(dpzVar, application, dmbVar, dmbVar2, dp.J, i);
        this.c = dpqVar;
        this.f = concurrentHashMap;
        this.d = dviVar;
    }

    dme e() {
        return (this.c.a() && h_()) ? new dme() : dme.d;
    }

    void a(dme dmeVar, String str, boolean z, gpr gprVar) {
        if (dmeVar == null || dmeVar == dme.d || str == null || str.isEmpty()) {
            dkm.a(3, "TimerMetricService", "Can't record an event that was never started or has been stopped already", new Object[0]);
        } else if (e.contains(str)) {
            dkm.a(5, "TimerMetricService", "%s is reserved event. Dropping timer.", str);
        } else if (h_()) {
            b(str, z, a(dmeVar, null), gprVar);
        }
    }

    final void b(String str, boolean z, gtr gtrVar, gpr gprVar) {
        c().submit(new dmg(this, str, z, gtrVar, gprVar));
    }

    @Override // flm.dfm
    void d() {
        this.f.clear();
    }
}

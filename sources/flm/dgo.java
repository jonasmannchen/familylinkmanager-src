package flm;

import android.os.Build;
import android.os.StrictMode;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dgo implements diw {
    private final String a;
    private final dhn b;

    dgo(dhn dhnVar, String str) {
        this.b = dhnVar;
        this.a = str;
    }

    /* JADX WARN: Code duplicated, block: B:74:0x01c4  */
    final List a() {
        boolean z;
        dvi dviVarJ;
        ArrayList arrayList = new ArrayList();
        dhn dhnVar = this.b;
        if (dhnVar.d.e().a() && ((djr) dhnVar.d.e().b()).a) {
            arrayList.add(this.b.g());
        } else {
            Object[] objArr = new Object[0];
        }
        dhn dhnVar2 = this.b;
        boolean z2 = Build.VERSION.SDK_INT >= 28 && StrictMode.ThreadPolicy.LAX.equals(StrictMode.getThreadPolicy()) && StrictMode.VmPolicy.LAX.equals(StrictMode.getVmPolicy()) && dhnVar2.d.m().a() && ((djy) dhnVar2.d.m().b()).b.a() && ((dlg) ((djy) dhnVar2.d.m().b()).b.b()).a;
        if (z2) {
            arrayList.add(this.b.n());
        } else {
            Object[] objArr2 = new Object[0];
        }
        dhn dhnVar3 = this.b;
        if ((dhnVar3.d.g().a() && ((dkr) dhnVar3.d.g().b()).a) && !((dkr) dhnVar3.d.g().b()).b) {
            dhn dhnVar4 = this.b;
            arrayList.add((dip) dhnVar4.a(dip.a(dhnVar4.a(), dhnVar4.a, dhnVar4.b, dhnVar4.c, dhnVar4.f, ((dkr) dhnVar4.d.g().b()).c)));
            Object[] objArr3 = new Object[0];
        }
        dhn dhnVar5 = this.b;
        if (Build.VERSION.SDK_INT >= 24 && dhnVar5.d.k().a() && ((dji) dhnVar5.d.k().b()).b) {
            arrayList.add(this.b.m());
            Object[] objArr4 = new Object[0];
        } else {
            Object[] objArr5 = new Object[0];
        }
        if (this.b.e.c) {
            arrayList.add(this.b.d());
        } else {
            Object[] objArr6 = new Object[0];
        }
        dhn dhnVar6 = this.b;
        if (Build.VERSION.SDK_INT < 24 || !dhnVar6.d.h().a()) {
            z = false;
        } else {
            dhnVar6.d.h().b();
            if (dkk.a()) {
                dhnVar6.d.h().b();
                if (dkk.c()) {
                    z = false;
                } else {
                    z = true;
                }
            } else {
                z = false;
            }
        }
        if (z) {
            arrayList.add(this.b.f());
        }
        dhn dhnVar7 = this.b;
        if (dhnVar7.d.n().a()) {
            dhnVar7.d.n().b();
            throw new NoSuchMethodError();
        }
        Object[] objArr7 = new Object[0];
        dhn dhnVar8 = this.b;
        if (dhnVar8.d.m().a() && ((djy) dhnVar8.d.m().b()).a.a() && ((dkt) ((djy) dhnVar8.d.m().b()).a.b()).a) {
            arrayList.add(this.b.c());
        } else {
            Object[] objArr8 = new Object[0];
        }
        if (this.b.j() && dla.c.e > 0) {
            dhn dhnVar9 = this.b;
            dge dgeVarA = dge.a(dhnVar9.a);
            dhs dhsVar = new dhs(dhnVar9);
            dht dhtVar = new dht(dhnVar9);
            if (dhnVar9.e.e) {
                dviVarJ = dhnVar9.d.j();
            } else {
                dviVarJ = dur.a;
            }
        } else {
            Object[] objArr9 = new Object[0];
        }
        dhn dhnVar10 = this.b;
        if ((dhnVar10.d.l().a() && ((dkp) dhnVar10.d.l().b()).a) || dhnVar10.e.a || dhnVar10.e.b) {
            dhw dhwVarL = this.b.l();
            synchronized (dhwVarL) {
                dhwVarL.e.a();
                dhwVarL.c.a(dhwVarL);
            }
        } else {
            Object[] objArr10 = new Object[0];
        }
        dhn dhnVar11 = this.b;
        if (dhnVar11.d.o().a()) {
            dhnVar11.d.o().b();
            throw new NoSuchMethodError();
        }
        Object[] objArr11 = new Object[0];
        return arrayList;
    }

    @Override // flm.diw
    public final void b() {
        this.b.g.a();
    }

    @Override // flm.diw
    public final void a(dmm dmmVar, String str, boolean z, long j, long j2, gpr gprVar) {
        dse.a(dmmVar);
        if (this.b.j()) {
            dmf dmfVarK = this.b.k();
            if (dmfVarK.c.a() && dmfVarK.h_()) {
                if (j > j2) {
                    dkm.a(5, "TimerMetricService", "Skip timer event: end time %d is before start time %d", Long.valueOf(j2), Long.valueOf(j));
                } else {
                    dmfVarK.b(str, z, dmf.a(new dme(j, j2)), gprVar);
                }
            }
        }
    }

    @Override // flm.diw
    public final dme c() {
        return !this.b.j() ? dme.d : this.b.k().e();
    }

    @Override // flm.diw
    public final void a(dme dmeVar, String str, boolean z, int i) {
        a(dmeVar, str, z, null, i);
    }

    public final void a(dme dmeVar, String str, boolean z, gpr gprVar, int i) {
        if (!dme.a(dmeVar) && this.b.j()) {
            dmeVar.b = SystemClock.elapsedRealtime();
            dmeVar.c = i;
            this.b.k().a(dmeVar, str, z, gprVar);
        }
    }

    @Override // flm.diw
    public final void a(dmd dmdVar, grh grhVar, gpr gprVar) {
        dse.a(dmdVar);
        if (grhVar == null || grhVar.c.size() == 0) {
            dkm.a(5, "Primes", "Invalid traces were logged.", new Object[0]);
            return;
        }
        if (this.b.h()) {
            dmj dmjVarI = this.b.i();
            if (dmjVarI.h_()) {
                gtr gtrVar = (gtr) ((fin) ((gts) ((fio) gtr.y.a(dp.au, (Object) null))).a(grhVar).h());
                Object[] objArr = new Object[2];
                objArr[0] = (grhVar.a & 1) == 1 ? Long.valueOf(grhVar.b) : null;
                objArr[1] = ((grj) grhVar.c.get(0)).b;
                dkm.a(3, "TraceMetricService", "Recording trace %d: %s", objArr);
                dmjVarI.a((String) null, true, gtrVar, gprVar, (String) null);
            }
        }
    }
}

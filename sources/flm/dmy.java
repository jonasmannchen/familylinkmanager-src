package flm;

import android.os.health.HealthStats;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dmy extends dmz {
    public static final dmy a = new dmy();

    private dmy() {
    }

    @Override // flm.dmz
    final /* synthetic */ String a(fke fkeVar) {
        goq goqVar;
        gou gouVar = (gou) fkeVar;
        if (gouVar.h == null) {
            goqVar = goq.d;
        } else {
            goqVar = gouVar.h;
        }
        return goqVar.c;
    }

    @Override // flm.dmz
    final /* synthetic */ fke a(fke fkeVar, fke fkeVar2) {
        goq goqVar;
        gou gouVar = (gou) fkeVar;
        gou gouVar2 = (gou) fkeVar2;
        if (gouVar == null || gouVar2 == null) {
            return gouVar;
        }
        gov govVar = (gov) ((fio) gou.i.a(dp.au, (Object) null));
        if (gouVar.h == null) {
            goqVar = goq.d;
        } else {
            goqVar = gouVar.h;
        }
        gov govVarA = govVar.a(goqVar);
        Long lA = dmv.a((gouVar.a & 1) == 1 ? Long.valueOf(gouVar.b) : null, (gouVar2.a & 1) == 1 ? Long.valueOf(gouVar2.b) : null);
        if (lA != null) {
            govVarA.a(lA.longValue());
        }
        Long lA2 = dmv.a((gouVar.a & 2) == 2 ? Long.valueOf(gouVar.c) : null, (gouVar2.a & 2) == 2 ? Long.valueOf(gouVar2.c) : null);
        if (lA2 != null) {
            govVarA.b(lA2.longValue());
        }
        Long lA3 = dmv.a((gouVar.a & 4) == 4 ? Long.valueOf(gouVar.d) : null, (gouVar2.a & 4) == 4 ? Long.valueOf(gouVar2.d) : null);
        if (lA3 != null) {
            govVarA.c(lA3.longValue());
        }
        Long lA4 = dmv.a((gouVar.a & 8) == 8 ? Long.valueOf(gouVar.e) : null, (gouVar2.a & 8) == 8 ? Long.valueOf(gouVar2.e) : null);
        if (lA4 != null) {
            govVarA.d(lA4.longValue());
        }
        Long lA5 = dmv.a((gouVar.a & 16) == 16 ? Long.valueOf(gouVar.f) : null, (gouVar2.a & 16) == 16 ? Long.valueOf(gouVar2.f) : null);
        if (lA5 != null) {
            govVarA.e(lA5.longValue());
        }
        Long lA6 = dmv.a((gouVar.a & 32) == 32 ? Long.valueOf(gouVar.g) : null, (gouVar2.a & 32) == 32 ? Long.valueOf(gouVar2.g) : null);
        if (lA6 != null) {
            govVarA.f(lA6.longValue());
        }
        gou gouVar3 = (gou) ((fin) govVarA.h());
        if (dmv.a(gouVar3)) {
            return null;
        }
        return gouVar3;
    }

    @Override // flm.dmz
    final /* synthetic */ fke a(String str, Object obj) {
        HealthStats healthStats = (HealthStats) obj;
        gov govVar = (gov) ((fio) gou.i.a(dp.au, (Object) null));
        Long lA = dmv.a(healthStats, 30001);
        if (lA != null) {
            govVar.a(lA.longValue());
        }
        Long lA2 = dmv.a(healthStats, 30002);
        if (lA2 != null) {
            govVar.b(lA2.longValue());
        }
        Long lA3 = dmv.a(healthStats, 30003);
        if (lA3 != null) {
            govVar.c(lA3.longValue());
        }
        Long lA4 = dmv.a(healthStats, 30004);
        if (lA4 != null) {
            govVar.d(lA4.longValue());
        }
        Long lA5 = dmv.a(healthStats, 30005);
        if (lA5 != null) {
            govVar.e(lA5.longValue());
        }
        Long lA6 = dmv.a(healthStats, 30006);
        if (lA6 != null) {
            govVar.f(lA6.longValue());
        }
        goq goqVarA = dmv.a(str);
        if (goqVarA != null) {
            govVar.a(goqVarA);
        }
        gou gouVar = (gou) ((fin) govVar.h());
        if (dmv.a(gouVar)) {
            return null;
        }
        return gouVar;
    }
}

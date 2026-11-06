package flm;

import android.os.health.HealthStats;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dna extends dmz {
    public static final dna a = new dna();

    private dna() {
    }

    @Override // flm.dmz
    final /* synthetic */ String a(fke fkeVar) {
        goq goqVar;
        gow gowVar = (gow) fkeVar;
        if (gowVar.d == null) {
            goqVar = goq.d;
        } else {
            goqVar = gowVar.d;
        }
        return goqVar.c;
    }

    @Override // flm.dmz
    final /* synthetic */ fke a(fke fkeVar, fke fkeVar2) {
        goq goqVar;
        gow gowVar = (gow) fkeVar;
        gow gowVar2 = (gow) fkeVar2;
        if (gowVar == null || gowVar2 == null) {
            return gowVar;
        }
        gox goxVar = (gox) ((fio) gow.e.a(dp.au, (Object) null));
        if (gowVar.d == null) {
            goqVar = goq.d;
        } else {
            goqVar = gowVar.d;
        }
        gox goxVarA = goxVar.a(goqVar);
        Integer numA = dmv.a((gowVar.a & 1) == 1 ? Integer.valueOf(gowVar.b) : null, (gowVar2.a & 1) == 1 ? Integer.valueOf(gowVar2.b) : null);
        if (numA != null) {
            goxVarA.a(numA.intValue());
        }
        Integer numA2 = dmv.a((gowVar.a & 2) == 2 ? Integer.valueOf(gowVar.c) : null, (gowVar2.a & 2) == 2 ? Integer.valueOf(gowVar2.c) : null);
        if (numA2 != null) {
            goxVarA.b(numA2.intValue());
        }
        gow gowVar3 = (gow) ((fin) goxVarA.h());
        if (dmv.a(gowVar3)) {
            return null;
        }
        return gowVar3;
    }

    @Override // flm.dmz
    final /* synthetic */ fke a(String str, Object obj) {
        HealthStats healthStats = (HealthStats) obj;
        gox goxVar = (gox) ((fio) gow.e.a(dp.au, (Object) null));
        Integer numA = dmv.a(dmv.a(healthStats, 50001));
        if (numA != null) {
            goxVar.a(numA.intValue());
        }
        Integer numA2 = dmv.a(dmv.a(healthStats, 50002));
        if (numA2 != null) {
            goxVar.b(numA2.intValue());
        }
        goq goqVarA = dmv.a(str);
        if (goqVarA != null) {
            goxVar.a(goqVarA);
        }
        gow gowVar = (gow) ((fin) goxVar.h());
        if (dmv.a(gowVar)) {
            return null;
        }
        return gowVar;
    }
}

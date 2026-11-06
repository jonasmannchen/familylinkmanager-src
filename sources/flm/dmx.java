package flm;

import android.os.health.HealthStats;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dmx extends dmz {
    public static final dmx a = new dmx();

    private dmx() {
    }

    @Override // flm.dmz
    final /* synthetic */ String a(fke fkeVar) {
        goq goqVar;
        gos gosVar = (gos) fkeVar;
        if (gosVar.d == null) {
            goqVar = goq.d;
        } else {
            goqVar = gosVar.d;
        }
        return goqVar.c;
    }

    @Override // flm.dmz
    final /* synthetic */ fke a(fke fkeVar, fke fkeVar2) {
        goq goqVar;
        gos gosVar = (gos) fkeVar;
        gos gosVar2 = (gos) fkeVar2;
        if (gosVar == null || gosVar2 == null) {
            return gosVar;
        }
        got gotVar = (got) ((fio) gos.e.a(dp.au, (Object) null));
        if (gosVar.d == null) {
            goqVar = goq.d;
        } else {
            goqVar = gosVar.d;
        }
        gos gosVar3 = (gos) ((fin) gotVar.a(goqVar).a(dna.a.a(gosVar.b, gosVar2.b)).b(dmw.a.a(gosVar.c, gosVar2.c)).h());
        if (dmv.a(gosVar3)) {
            return null;
        }
        return gosVar3;
    }

    @Override // flm.dmz
    final /* synthetic */ fke a(String str, Object obj) {
        HealthStats healthStats = (HealthStats) obj;
        got gotVarB = ((got) ((fio) gos.e.a(dp.au, (Object) null))).a(dna.a.a(dmv.d(healthStats, 40001))).b(dmw.a.a((healthStats == null || !healthStats.hasMeasurements(40002)) ? null : healthStats.getMeasurements(40002)));
        goq goqVarA = dmv.a(str);
        if (goqVarA != null) {
            gotVarB.a(goqVarA);
        }
        if (dmv.a((gos) ((fin) gotVarB.h()))) {
            return null;
        }
        return (gos) ((fin) gotVarB.h());
    }
}

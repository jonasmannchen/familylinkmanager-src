package flm;

import android.os.health.TimerStat;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dnb extends dmz {
    public static final dnb a = new dnb();

    private dnb() {
    }

    @Override // flm.dmz
    final /* synthetic */ String a(fke fkeVar) {
        goq goqVar;
        goq goqVar2;
        goq goqVar3;
        goy goyVar = (goy) fkeVar;
        if (goyVar.d == null) {
            goqVar = goq.d;
        } else {
            goqVar = goyVar.d;
        }
        if ((goqVar.a & 2) == 2) {
            if (goyVar.d == null) {
                goqVar3 = goq.d;
            } else {
                goqVar3 = goyVar.d;
            }
            return goqVar3.c;
        }
        if (goyVar.d == null) {
            goqVar2 = goq.d;
        } else {
            goqVar2 = goyVar.d;
        }
        return Long.toHexString(goqVar2.b);
    }

    @Override // flm.dmz
    final /* synthetic */ fke a(fke fkeVar, fke fkeVar2) {
        return dmv.a((goy) fkeVar, (goy) fkeVar2);
    }

    @Override // flm.dmz
    final /* synthetic */ fke a(String str, Object obj) {
        return dmv.a(str, (TimerStat) obj);
    }
}

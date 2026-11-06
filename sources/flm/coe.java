package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class coe {
    static eju a(eka ekaVar, String str) {
        ejv ejvVar = (ejv) ((fio) eju.d.a(dp.au, (Object) null));
        ejvVar.c();
        eju ejuVar = (eju) ejvVar.a;
        if (ekaVar == null) {
            throw new NullPointerException();
        }
        ejuVar.a |= 1;
        ejuVar.b = ekaVar.c;
        ejx ejxVar = (ejx) ((fio) ejw.c.a(dp.au, (Object) null));
        ejz ejzVar = (ejz) ((fio) ejy.c.a(dp.au, (Object) null));
        ejzVar.c();
        ejy ejyVar = (ejy) ejzVar.a;
        if (str == null) {
            throw new NullPointerException();
        }
        ejyVar.a |= 1;
        ejyVar.b = str;
        ejxVar.c();
        ejw ejwVar = (ejw) ejxVar.a;
        ejwVar.b = (ejy) ((fin) ejzVar.h());
        ejwVar.a |= 1;
        ejvVar.c();
        eju ejuVar2 = (eju) ejvVar.a;
        ejuVar2.c = (ejw) ((fin) ejxVar.h());
        ejuVar2.a |= 2;
        return (eju) ((fin) ejvVar.h());
    }
}

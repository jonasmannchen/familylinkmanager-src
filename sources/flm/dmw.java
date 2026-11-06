package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dmw extends dmz {
    public static final dmw a = new dmw();

    private dmw() {
    }

    @Override // flm.dmz
    final /* synthetic */ String a(fke fkeVar) {
        goq goqVar;
        goo gooVar = (goo) fkeVar;
        if (gooVar.c == null) {
            goqVar = goq.d;
        } else {
            goqVar = gooVar.c;
        }
        return goqVar.c;
    }

    @Override // flm.dmz
    final /* synthetic */ fke a(fke fkeVar, fke fkeVar2) {
        goq goqVar;
        goo gooVar = (goo) fkeVar;
        goo gooVar2 = (goo) fkeVar2;
        if (gooVar == null || gooVar2 == null) {
            return gooVar;
        }
        gop gopVar = (gop) ((fio) goo.d.a(dp.au, (Object) null));
        if (gooVar.c == null) {
            goqVar = goq.d;
        } else {
            goqVar = gooVar.c;
        }
        gop gopVarA = gopVar.a(goqVar);
        Integer numA = dmv.a((gooVar.a & 1) == 1 ? Integer.valueOf(gooVar.b) : null, (gooVar2.a & 1) == 1 ? Integer.valueOf(gooVar2.b) : null);
        if (numA != null) {
            gopVarA.a(numA.intValue());
        }
        goo gooVar3 = (goo) ((fin) gopVarA.h());
        if (dmv.a(gooVar3)) {
            return null;
        }
        return gooVar3;
    }

    @Override // flm.dmz
    final /* synthetic */ fke a(String str, Object obj) {
        gop gopVarA = ((gop) ((fio) goo.d.a(dp.au, (Object) null))).a(((Long) obj).intValue());
        goq goqVarA = dmv.a(str);
        if (goqVarA != null) {
            gopVarA.a(goqVarA);
        }
        goo gooVar = (goo) ((fin) gopVarA.h());
        if (dmv.a(gooVar)) {
            return null;
        }
        return gooVar;
    }
}

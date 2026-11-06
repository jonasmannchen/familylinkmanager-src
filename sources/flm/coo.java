package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class coo {
    private static final dxs a = new dxt().a(cia.OUT_OF_BOX_FLOW, epd.OOB_SIGN_IN).a(cia.SYNC_TAIL_FLOW, epd.OOB_TAIL).a(cia.ADD_ACCOUNT_FLOW, epd.SIGN_IN).a(cia.SIGN_OUT_FLOW, epd.SIGN_OUT).a(cia.AUTH_ADD_FLOW, epd.AUTH_SIGN_IN).a(cia.SECONDARY_SIGN_IN_FLOW, epd.SECONDARY_SIGN_IN).a(cia.SECONDARY_SIGN_OUT_FLOW, epd.SECONDARY_SIGN_OUT).a(cia.GELLER_FLOW, epd.MEMBER_SV_ONBOARDING).a();

    public static dvi a(cij cijVar, epf epfVar) {
        dxs dxsVar = a;
        cia ciaVarA = cia.a(cijVar.b);
        if (ciaVarA == null) {
            ciaVarA = cia.UNSPECIFIED;
        }
        if (!dxsVar.containsKey(ciaVarA)) {
            return dur.a;
        }
        dxs dxsVar2 = a;
        cia ciaVarA2 = cia.a(cijVar.b);
        if (ciaVarA2 == null) {
            ciaVarA2 = cia.UNSPECIFIED;
        }
        epd epdVar = (epd) dxsVar2.get(ciaVarA2);
        ema emaVar = (ema) ((fio) elz.e.a(dp.au, (Object) null));
        if (epdVar == epd.MEMBER_SV_ONBOARDING) {
            emaVar.a(((emi) ((fio) emh.h.a(dp.au, (Object) null))).a(epdVar).a(cijVar.d).a(((elg) ((fio) elf.c.a(dp.au, (Object) null))).a(epfVar)));
        } else {
            elv elvVar = (elv) ((fio) elu.e.a(dp.au, (Object) null));
            elvVar.c();
            elu eluVar = (elu) elvVar.a;
            if (epdVar == null) {
                throw new NullPointerException();
            }
            eluVar.a |= 1;
            eluVar.b = epdVar.j;
            String str = cijVar.d;
            elvVar.c();
            elu eluVar2 = (elu) elvVar.a;
            if (str == null) {
                throw new NullPointerException();
            }
            eluVar2.a |= 2;
            eluVar2.c = str;
            elg elgVarA = ((elg) ((fio) elf.c.a(dp.au, (Object) null))).a(epfVar);
            elvVar.c();
            elu eluVar3 = (elu) elvVar.a;
            eluVar3.d = (elf) ((fin) elgVarA.h());
            eluVar3.a |= 4;
            emaVar.c();
            elz elzVar = (elz) emaVar.a;
            elzVar.c = (fin) elvVar.h();
            elzVar.b = 2;
        }
        return dvi.b((elz) ((fin) emaVar.h()));
    }

    public static dvi a(cia ciaVar) {
        return dvi.c((epd) a.get(ciaVar));
    }
}

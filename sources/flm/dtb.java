package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dtb implements dtv {
    dtb() {
    }

    @Override // flm.dtv
    public final dtq a(String str, dtn dtnVar, long j, long j2) {
        dtq dtqVarB = duj.b();
        if (dtqVarB != null) {
            duj.a(dtqVarB, str);
        }
        dtq dtqVarB2 = dta.b(str, dtnVar);
        duj.a(dtqVarB2);
        return dtqVarB2;
    }
}

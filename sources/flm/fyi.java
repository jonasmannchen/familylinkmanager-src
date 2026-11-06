package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class fyi implements fro {
    private final /* synthetic */ fyc a;

    fyi(fyc fycVar) {
        this.a = fycVar;
    }

    @Override // flm.fro
    public final frm a(fuf fufVar, frj frjVar, frl frlVar) {
        Object objA;
        fyc fycVar = this.a;
        fsh fshVar = gnz.a;
        fuq fuqVar = fsc.a().e;
        if (fuqVar.a == null) {
            objA = null;
        } else {
            fur furVar = fuqVar.a;
            fshVar.hashCode();
            objA = furVar.a();
        }
        if (objA == null) {
            objA = fshVar.a;
        }
        fye fyeVar = new fye(fycVar, (gmx) objA, fufVar);
        return new fyj(frlVar.a(fufVar, frjVar.a(fyeVar)), fyeVar);
    }
}

package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class crf extends axv {
    private final /* synthetic */ csx b;
    private final /* synthetic */ axp c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public crf(axp axpVar, csx csxVar, axp axpVar2) {
        super(axpVar);
        this.b = csxVar;
        this.c = axpVar2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.axv
    public final /* synthetic */ void a(asy asyVar, dbk dbkVar) {
        csw cswVar = (csw) asyVar;
        cri criVar = new cri(dbkVar);
        csx csxVar = this.b;
        axp axpVar = this.c;
        synchronized (cswVar.b) {
            csq csqVar = cswVar.b;
            csqVar.a(csxVar);
            csqVar.a.a();
            ((csn) csqVar.a.b()).a(new csz(1, csxVar, null, null, csqVar.a(axpVar).asBinder(), criVar != null ? criVar.asBinder() : null));
        }
    }
}

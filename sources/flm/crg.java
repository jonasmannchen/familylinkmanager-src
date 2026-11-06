package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class crg extends ays {
    private final /* synthetic */ cre b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public crg(cre creVar, axr axrVar) {
        super(axrVar);
        this.b = creVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.ays
    public final /* synthetic */ void a(asy asyVar, dbk dbkVar) {
        csw cswVar = (csw) asyVar;
        cre creVar = this.b;
        crh crhVar = new crh(dbkVar);
        try {
            cswVar.b.a(this.a, crhVar);
        } catch (RuntimeException e) {
            dbkVar.b(e);
        }
    }
}

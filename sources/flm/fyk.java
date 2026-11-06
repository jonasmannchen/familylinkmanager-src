package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class fyk extends fsx {
    private final /* synthetic */ fyj a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    fyk(fyj fyjVar, frn frnVar) {
        super(frnVar);
        this.a = fyjVar;
    }

    @Override // flm.fsw, flm.fup, flm.frn
    public final void a(fvc fvcVar, ftv ftvVar) {
        fye fyeVar = this.a.a;
        if (fyc.b != null) {
            if (fyc.b.getAndSet(fyeVar, 1) == 0) {
                fyeVar.c.a(fyc.a(fvcVar, fyeVar.b));
            }
        } else if (fyeVar.a == 0) {
            fyeVar.a = 1;
            fyeVar.c.a(fyc.a(fvcVar, fyeVar.b));
        }
        super.a(fvcVar, ftvVar);
    }
}

package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class fvt extends frr {
    public final /* synthetic */ fvs a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    fvt(fvs fvsVar, frm frmVar) {
        super(frmVar);
        this.a = fvsVar;
    }

    @Override // flm.frr
    public final void b(frn frnVar, ftv ftvVar) {
        String str;
        fuc fucVar = fvs.a;
        String strValueOf = String.valueOf(this.a.b);
        if (strValueOf.length() != 0) {
            str = "Bearer ".concat(strValueOf);
        } else {
            str = new String("Bearer ");
        }
        ftvVar.a(fucVar, str);
        b().a(new fvu(this, frnVar), ftvVar);
    }
}

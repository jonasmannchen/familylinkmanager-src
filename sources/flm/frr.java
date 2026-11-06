package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class frr extends fsu {
    private frm a;

    public frr(frm frmVar) {
        this.a = frmVar;
    }

    public abstract void b(frn frnVar, ftv ftvVar);

    @Override // flm.fsu, flm.fuo
    public final frm b() {
        return this.a;
    }

    @Override // flm.fsu, flm.frm
    public final void a(frn frnVar, ftv ftvVar) {
        try {
            b(frnVar, ftvVar);
        } catch (Exception e) {
            this.a = frp.a;
            frnVar.a(fvc.a(e), new ftv());
        }
    }
}

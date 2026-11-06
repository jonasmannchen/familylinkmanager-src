package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class eaq extends dwk {
    private dws a;
    private final /* synthetic */ dws b;
    private final /* synthetic */ dzp c;
    private final /* synthetic */ eao d;

    eaq(eao eaoVar, dws dwsVar, dzp dzpVar) {
        this.d = eaoVar;
        this.b = dwsVar;
        this.c = dzpVar;
        this.a = this.b;
    }

    @Override // flm.dwk
    protected final /* synthetic */ Object a() {
        if (this.a == dwv.b) {
            b();
            return null;
        }
        if (this.c.hasNext()) {
            dzq dzqVar = (dzq) this.c.next();
            dzq dzqVarA = dzq.a(dzqVar.c, this.a);
            this.a = dzqVar.b;
            if (this.d.a.b.a((Comparable) dzqVarA.b)) {
                return dyz.a(dzqVarA.b, dzqVarA);
            }
        } else if (this.d.a.b.a((Comparable) dwv.b)) {
            dzq dzqVarA2 = dzq.a((dws) dwv.b, this.a);
            this.a = dwv.b;
            return dyz.a(dwv.b, dzqVarA2);
        }
        b();
        return null;
    }
}

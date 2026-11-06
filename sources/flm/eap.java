package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class eap extends dwk {
    private dws a;
    private final /* synthetic */ dws b;
    private final /* synthetic */ dzp c;
    private final /* synthetic */ eao d;

    eap(eao eaoVar, dws dwsVar, dzp dzpVar) {
        this.d = eaoVar;
        this.b = dwsVar;
        this.c = dzpVar;
        this.a = this.b;
    }

    @Override // flm.dwk
    protected final /* synthetic */ Object a() {
        dzq dzqVarA;
        if (this.d.a.c.a((Comparable) this.a) || this.a == dwt.b) {
            b();
            return null;
        }
        if (this.c.hasNext()) {
            dzq dzqVar = (dzq) this.c.next();
            dzq dzqVarA2 = dzq.a(this.a, dzqVar.b);
            this.a = dzqVar.c;
            dzqVarA = dzqVarA2;
        } else {
            dzqVarA = dzq.a(this.a, (dws) dwt.b);
            this.a = dwt.b;
        }
        return dyz.a(dzqVarA.b, dzqVarA);
    }
}

package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class eat extends dwk {
    private final /* synthetic */ dzp a;
    private final /* synthetic */ ear b;

    eat(ear earVar, dzp dzpVar) {
        this.b = earVar;
        this.a = dzpVar;
    }

    @Override // flm.dwk
    protected final /* synthetic */ Object a() {
        if (!this.a.hasNext()) {
            b();
            return null;
        }
        dzq dzqVar = (dzq) this.a.next();
        if (this.b.a.b.a((Comparable) dzqVar.c)) {
            return dyz.a(dzqVar.c, dzqVar);
        }
        b();
        return null;
    }
}

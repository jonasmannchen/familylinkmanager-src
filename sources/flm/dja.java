package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dja implements dmb {
    private final /* synthetic */ djl a;
    private final /* synthetic */ dix b;

    dja(dix dixVar, djl djlVar) {
        this.b = dixVar;
        this.a = djlVar;
    }

    @Override // flm.dmb
    public final /* synthetic */ Object a() {
        if (this.a.p().a()) {
            this.a.p().b();
            if (dku.a()) {
                dix dixVar = this.b;
                dmb dmbVar = this.b.a;
                return dvi.b(new dlr(dixVar, dmbVar, new dpq(dku.b()), dku.d(), dku.c(), dku.e()));
            }
        }
        return dur.a;
    }
}

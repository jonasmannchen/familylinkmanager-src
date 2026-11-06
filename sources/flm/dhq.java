package flm;

import android.app.Application;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dhq implements dmb {
    private final /* synthetic */ djl a;
    private final /* synthetic */ Application b;
    private final /* synthetic */ dmb c;
    private final /* synthetic */ dhn d;

    dhq(dhn dhnVar, djl djlVar, Application application, dmb dmbVar) {
        this.d = dhnVar;
        this.a = djlVar;
        this.b = application;
        this.c = dmbVar;
    }

    @Override // flm.dmb
    public final /* synthetic */ Object a() {
        if (this.a.p().a()) {
            this.a.p().b();
            if (dku.a()) {
                return dvi.b((dls) this.d.a(dls.a(this.d.a(), this.b, this.d.b, this.c, (dku) this.a.p().b())));
            }
        }
        return dur.a;
    }
}

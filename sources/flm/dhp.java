package flm;

import android.app.Application;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dhp implements dmb {
    private final /* synthetic */ Application a;
    private final /* synthetic */ djl b;

    dhp(Application application, djl djlVar) {
        this.a = application;
        this.b = djlVar;
    }

    @Override // flm.dmb
    public final /* synthetic */ Object a() {
        dif difVar = new dif();
        difVar.a = this.a;
        if (this.b.b().a()) {
            this.b.b().b();
            throw new NoSuchMethodError();
        }
        return die.a(difVar.a, difVar.b);
    }
}

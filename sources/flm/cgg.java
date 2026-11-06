package flm;

import com.google.android.gms.kids.setup.viewmodel.KidSetupViewModel;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cgg extends cep {
    public cgg(KidSetupViewModel kidSetupViewModel) {
        super(kidSetupViewModel);
    }

    @Override // flm.cep
    protected final String a() {
        return "InitializeSupervisionTask";
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // flm.cep
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final Void b() {
        if (!((this.b.d().a & 524288) == 524288)) {
            final eyy eyyVar = (eyy) btc.a(this.b.b().initializeSupervision(this.b.d().f, this.b.d().k), cgh.a);
            this.b.a(new coy(eyyVar) { // from class: flm.cgi
                private final eyy a;

                {
                    this.a = eyyVar;
                }

                @Override // flm.coy
                public final Object a(Object obj) {
                    return cgg.a(this.a, (cij) obj);
                }
            });
            return null;
        }
        return null;
    }

    static final /* synthetic */ cij a(eyy eyyVar, cij cijVar) {
        fio fioVar = (fio) cijVar.a(dp.au, (Object) null);
        fioVar.a((fin) cijVar);
        cik cikVar = (cik) fioVar;
        cikVar.c();
        cij cijVar2 = (cij) cikVar.a;
        if (eyyVar == null) {
            throw new NullPointerException();
        }
        cijVar2.u = eyyVar;
        cijVar2.a |= 524288;
        return (cij) ((fin) cikVar.b(2).h());
    }
}

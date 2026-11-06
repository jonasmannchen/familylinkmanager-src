package flm;

import com.google.android.gms.kids.setup.viewmodel.KidSetupViewModel;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cfe extends cep {
    public cfe(KidSetupViewModel kidSetupViewModel) {
        super(kidSetupViewModel);
    }

    @Override // flm.cep
    protected final String a() {
        return "FetchConsentInfoForSecondaryAccountTask";
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // flm.cep
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final Void b() {
        if (!((this.b.d().a & 67108864) == 67108864)) {
            final eye eyeVar = (eye) btc.a(this.b.b().fetchConsentInfoForSecondaryAccount(this.b.d().f), cff.a);
            this.b.a(new coy(eyeVar) { // from class: flm.cfg
                private final eye a;

                {
                    this.a = eyeVar;
                }

                @Override // flm.coy
                public final Object a(Object obj) {
                    return cfe.a(this.a, (cij) obj);
                }
            });
            return null;
        }
        return null;
    }

    static final /* synthetic */ cij a(eye eyeVar, cij cijVar) {
        fio fioVar = (fio) cijVar.a(dp.au, (Object) null);
        fioVar.a((fin) cijVar);
        cik cikVar = (cik) fioVar;
        cikVar.c();
        cij cijVar2 = (cij) cikVar.a;
        if (eyeVar == null) {
            throw new NullPointerException();
        }
        cijVar2.B = eyeVar;
        cijVar2.a |= 67108864;
        return (cij) ((fin) cikVar.h());
    }
}

package flm;

import android.text.TextUtils;
import com.google.android.gms.kids.setup.viewmodel.KidSetupViewModel;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class chn extends cep {
    private final String c;

    public chn(KidSetupViewModel kidSetupViewModel, String str) {
        super(kidSetupViewModel);
        this.c = str;
    }

    @Override // flm.cep
    protected final String a() {
        return "VerifyPairingCodeTask";
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // flm.cep
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final Boolean b() throws Throwable {
        dvl.a(!TextUtils.isEmpty(this.c), "Pairing code is not set.");
        a(ekw.STARTED);
        final dvi dviVarC = dvi.c(this.b.b().acceptPairing(this.c, this.b.d().e));
        if (dviVarC.a()) {
            this.b.a(new coy(dviVarC) { // from class: flm.cho
                private final dvi a;

                {
                    this.a = dviVarC;
                }

                @Override // flm.coy
                public final Object a(Object obj) {
                    return chn.b(this.a, (cij) obj);
                }
            });
            final dvi dviVarB = new cfp(this.b).b();
            if (dviVarB.a()) {
                a(ekw.SUCCEEDED);
                this.b.a(new coy(dviVarB) { // from class: flm.chp
                    private final dvi a;

                    {
                        this.a = dviVarB;
                    }

                    @Override // flm.coy
                    public final Object a(Object obj) {
                        return chn.a(this.a, (cij) obj);
                    }
                });
                return true;
            }
        }
        a(ekw.FAILED_RECOVERABLE);
        return false;
    }

    private final void a(ekw ekwVar) throws Throwable {
        a((elz) ((fin) ((ema) ((fio) elz.e.a(dp.au, (Object) null))).a(((emi) ((fio) emh.h.a(dp.au, (Object) null))).a(epd.MEMBER_SV_ONBOARDING).a(this.b.d().d).a(((ela) ((fio) ekz.d.a(dp.au, (Object) null))).a(eku.VERIFY_PAIRING_CODE).a(ekwVar))).h()));
    }

    static final /* synthetic */ cij a(dvi dviVar, cij cijVar) {
        faw fawVar;
        fio fioVar = (fio) cijVar.a(dp.au, (Object) null);
        fioVar.a((fin) cijVar);
        cik cikVar = (cik) fioVar;
        eyi eyiVar = (eyi) dviVar.b();
        if (eyiVar.c == null) {
            fawVar = faw.f;
        } else {
            fawVar = eyiVar.c;
        }
        cikVar.c();
        cij cijVar2 = (cij) cikVar.a;
        if (fawVar == null) {
            throw new NullPointerException();
        }
        cijVar2.q = fawVar;
        cijVar2.a |= 32768;
        return (cij) ((fin) cikVar.h());
    }

    static final /* synthetic */ cij b(dvi dviVar, cij cijVar) {
        fio fioVar = (fio) cijVar.a(dp.au, (Object) null);
        fioVar.a((fin) cijVar);
        cik cikVar = (cik) fioVar;
        String str = (String) dviVar.b();
        cikVar.c();
        cij cijVar2 = (cij) cikVar.a;
        if (str == null) {
            throw new NullPointerException();
        }
        cijVar2.a |= 16384;
        cijVar2.p = str;
        return (cij) ((fin) cikVar.h());
    }
}

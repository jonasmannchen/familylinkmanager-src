package flm;

import android.database.CursorWindow;
import android.text.TextUtils;
import com.google.android.gms.kids.setup.viewmodel.KidSetupViewModel;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cfp extends cep {
    public cfp(KidSetupViewModel kidSetupViewModel) {
        super(kidSetupViewModel);
    }

    @Override // flm.cep
    protected final String a() {
        return "GetOnboardingInitiatorTask";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.cep
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final dvi b() throws Throwable {
        fas fasVar;
        fas fasVar2;
        a(ekw.STARTED);
        CursorWindow onboardingInitiator = this.b.b().getOnboardingInitiator(this.b.d().p, this.b.d().e);
        if (onboardingInitiator == null) {
            a(ekw.FAILED_RECOVERABLE);
            return dur.a;
        }
        a(ekw.SUCCEEDED);
        eyi eyiVar = (eyi) btc.a(onboardingInitiator, cfq.a);
        fau fauVarA = fau.a(eyiVar.b);
        if (fauVarA == null) {
            fauVarA = fau.UNKNOWN_INITIATOR_STATE;
        }
        if (fauVarA == fau.CONFIRMED_ACCEPTOR) {
            if (eyiVar.d == null) {
                fasVar = fas.d;
            } else {
                fasVar = eyiVar.d;
            }
            if (!fasVar.b) {
                if (eyiVar.d == null) {
                    fasVar2 = fas.d;
                } else {
                    fasVar2 = eyiVar.d;
                }
                final String str = fasVar2.c;
                dvl.b(!TextUtils.isEmpty(str));
                this.b.a(new coy(str) { // from class: flm.cfr
                    private final String a;

                    {
                        this.a = str;
                    }

                    @Override // flm.coy
                    public final Object a(Object obj) {
                        return cfp.a(this.a, (cij) obj);
                    }
                });
            }
        }
        return dvi.b(eyiVar);
    }

    private final void a(ekw ekwVar) throws Throwable {
        cij cijVarD = this.b.d();
        emi emiVarA = ((emi) ((fio) emh.h.a(dp.au, (Object) null))).a(epd.MEMBER_SV_ONBOARDING).a(cijVarD.d).a(((ela) ((fio) ekz.d.a(dp.au, (Object) null))).a(eku.CHECK_INITIATOR).a(ekwVar));
        if ((cijVarD.a & 16384) == 16384) {
            emiVarA.a(((emo) ((fio) emn.c.a(dp.au, (Object) null))).a(cijVarD.p));
        }
        a((elz) ((fin) ((ema) ((fio) elz.e.a(dp.au, (Object) null))).a(emiVarA).h()));
    }

    static final /* synthetic */ cij a(String str, cij cijVar) {
        fio fioVar = (fio) cijVar.a(dp.au, (Object) null);
        fioVar.a((fin) cijVar);
        cik cikVar = (cik) fioVar;
        cikVar.c();
        cij cijVar2 = (cij) cikVar.a;
        if (str == null) {
            throw new NullPointerException();
        }
        cijVar2.a |= 65536;
        cijVar2.r = str;
        return (cij) ((fin) cikVar.h());
    }
}

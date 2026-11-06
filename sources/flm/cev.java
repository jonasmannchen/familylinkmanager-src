package flm;

import com.google.android.gms.kids.setup.viewmodel.KidSetupViewModel;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cev extends cep {
    public cev(KidSetupViewModel kidSetupViewModel) {
        super(kidSetupViewModel);
    }

    @Override // flm.cep
    protected final String a() {
        return "CancelOnboardingTask";
    }

    private final void a(ekw ekwVar) throws Throwable {
        cij cijVarD = this.b.d();
        emi emiVarA = ((emi) ((fio) emh.h.a(dp.au, (Object) null))).a(epd.MEMBER_SV_ONBOARDING).a(cijVarD.d).a(((ela) ((fio) ekz.d.a(dp.au, (Object) null))).a(eku.CANCEL_ONBOARDING).a(ekwVar));
        if ((cijVarD.a & 16384) == 16384) {
            emiVarA.a(((emo) ((fio) emn.c.a(dp.au, (Object) null))).a(cijVarD.p));
        }
        a((elz) ((fin) ((ema) ((fio) elz.e.a(dp.au, (Object) null))).a(emiVarA).h()));
    }

    @Override // flm.cep
    protected final /* synthetic */ Object b() throws Throwable {
        cij cijVarD = this.b.d();
        if ((cijVarD.a & 16384) == 16384) {
            a(ekw.STARTED);
            this.b.b().cancelOnboarding(cijVarD.p, cijVarD.e);
            a(ekw.SUCCEEDED);
            this.b.a(cor.a);
            return null;
        }
        return null;
    }
}

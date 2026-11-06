package flm;

import android.text.TextUtils;
import com.google.android.gms.kids.setup.viewmodel.KidSetupViewModel;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cht extends cep {
    private final String c;

    public cht(KidSetupViewModel kidSetupViewModel, String str) {
        super(kidSetupViewModel);
        dvl.a(!TextUtils.isEmpty(str), "Password is not set.");
        this.c = str;
    }

    @Override // flm.cep
    protected final String a() {
        return "VerifySelfTask";
    }

    private final void a(ekw ekwVar) throws Throwable {
        cij cijVarD = this.b.d();
        cia ciaVarA = cia.a(cijVarD.b);
        if (ciaVarA == null) {
            ciaVarA = cia.UNSPECIFIED;
        }
        dvi dviVarA = coo.a(ciaVarA);
        if (dviVarA.a()) {
            emi emiVarA = ((emi) ((fio) emh.h.a(dp.au, (Object) null))).a((epd) dviVarA.b()).a(cijVarD.d).a(((ela) ((fio) ekz.d.a(dp.au, (Object) null))).a(eku.VERIFY_PASSWORD).a(ekwVar));
            if ((cijVarD.a & 16384) == 16384) {
                btv.d("MemberSpvsn", "No pairing session ID found during VerifySelfTask", new Object[0]);
                emiVarA.a(((emo) ((fio) emn.c.a(dp.au, (Object) null))).a(cijVarD.p));
            }
            a((elz) ((fin) ((ema) ((fio) elz.e.a(dp.au, (Object) null))).a(emiVarA).h()));
        }
    }

    @Override // flm.cep
    protected final /* synthetic */ Object b() throws Throwable {
        ekw ekwVar;
        a(ekw.STARTED);
        dvi dviVarC = dvi.c(this.b.b().reauth(this.b.d().e, this.c));
        if (dviVarC.a()) {
            ekwVar = ekw.SUCCEEDED;
        } else {
            ekwVar = ekw.FAILED_RECOVERABLE;
        }
        a(ekwVar);
        return dviVarC;
    }
}

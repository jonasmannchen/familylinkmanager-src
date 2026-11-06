package flm;

import com.google.android.gms.kids.setup.viewmodel.KidSetupViewModel;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cgz extends cep {
    public cgz(KidSetupViewModel kidSetupViewModel) {
        super(kidSetupViewModel);
    }

    @Override // flm.cep
    protected final String a() {
        return "SavePartialConsentForSecondaryAccountSignInTask";
    }

    @Override // flm.cep
    protected final /* synthetic */ Object b() {
        eye eyeVar;
        evl evlVar;
        evn evnVar;
        cij cijVarD = this.b.d();
        if (cijVarD.B == null) {
            eyeVar = eye.c;
        } else {
            eyeVar = cijVarD.B;
        }
        if (eyeVar.b == null) {
            evlVar = evl.f;
        } else {
            evlVar = eyeVar.b;
        }
        if (evlVar.e == null) {
            evnVar = evn.c;
        } else {
            evnVar = evlVar.e;
        }
        this.b.b().savePartialConsentForSecondaryAccountSignIn(cijVarD.m, cijVarD.n, evnVar.b);
        return null;
    }
}

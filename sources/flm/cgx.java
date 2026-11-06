package flm;

import com.google.android.gms.kids.setup.viewmodel.KidSetupViewModel;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cgx extends cep {
    public cgx(KidSetupViewModel kidSetupViewModel) {
        super(kidSetupViewModel);
    }

    @Override // flm.cep
    protected final String a() {
        return "RemoveSecondaryAccountTask";
    }

    @Override // flm.cep
    protected final /* synthetic */ Object b() {
        cij cijVarD = this.b.d();
        this.b.b().removeSecondaryAccount(cijVarD.l, cijVarD.m, cijVarD.n);
        return null;
    }
}

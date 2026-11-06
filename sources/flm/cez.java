package flm;

import com.google.android.gms.kids.setup.viewmodel.KidSetupViewModel;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cez extends cep {
    public cez(KidSetupViewModel kidSetupViewModel) {
        super(kidSetupViewModel);
    }

    @Override // flm.cep
    protected final String a() {
        return "EnableGoogleServicesTask";
    }

    @Override // flm.cep
    protected final /* synthetic */ Object b() {
        this.b.b().setGoogleServicesActivityEnabled(true);
        return new cfa(this.b.b().getSupervisedAccount(), this.b.b().isSupervisedAccountNonUnicorn());
    }
}

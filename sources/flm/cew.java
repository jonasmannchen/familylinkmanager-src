package flm;

import com.google.android.gms.kids.aidl.IKidsInternalService;
import com.google.android.gms.kids.setup.viewmodel.KidSetupViewModel;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cew extends cep {
    public cew(KidSetupViewModel kidSetupViewModel) {
        super(kidSetupViewModel);
    }

    @Override // flm.cep
    protected final String a() {
        return "CheckExperimentFlagsTask";
    }

    @Override // flm.cep
    protected final /* synthetic */ Object b() {
        IKidsInternalService iKidsInternalServiceB = this.b.b();
        return new ceo(iKidsInternalServiceB.isSecondaryAccountSignInEnabled(), iKidsInternalServiceB.isNativeAccountManagementEnabled());
    }
}

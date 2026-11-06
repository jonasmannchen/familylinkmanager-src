package flm;

import com.google.android.gms.kids.setup.viewmodel.KidSetupViewModel;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cfm extends cep {
    public cfm(KidSetupViewModel kidSetupViewModel) {
        super(kidSetupViewModel);
    }

    @Override // flm.cep
    protected final String a() {
        return "FinishSetupTask";
    }

    @Override // flm.cep
    protected final /* synthetic */ Object b() {
        this.b.b().finishDeviceSetup();
        return null;
    }
}

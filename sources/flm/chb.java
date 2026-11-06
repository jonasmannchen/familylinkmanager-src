package flm;

import com.google.android.gms.kids.setup.viewmodel.KidSetupViewModel;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class chb extends cep {
    public chb(KidSetupViewModel kidSetupViewModel) {
        super(kidSetupViewModel);
    }

    @Override // flm.cep
    protected final String a() {
        return "StartGellerSignOutTask";
    }

    @Override // flm.cep
    protected final /* synthetic */ Object b() {
        btv.c("KidSetup", "Setting supervision exit countdown", new Object[0]);
        this.b.b().setMemberSvExitState(1);
        this.b.b().startService("com.google.android.gms.kids.features.timelimit.TimeLimitCheckingIntentOperation", "com.google.android.gms.kids.features.timelimit.ACTION_CHECK");
        return null;
    }
}

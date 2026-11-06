package flm;

import com.google.android.gms.kids.setup.viewmodel.KidSetupViewModel;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cfo extends cep {
    public cfo(KidSetupViewModel kidSetupViewModel) {
        super(kidSetupViewModel);
    }

    @Override // flm.cep
    protected final String a() {
        return "GetDeviceAccountsTask";
    }

    @Override // flm.cep
    protected final /* synthetic */ Object b() {
        return bug.a(this.a);
    }
}

package flm;

import android.accounts.AccountManager;
import android.content.Intent;
import com.google.android.gms.kids.setup.viewmodel.KidSetupViewModel;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cfn extends cep {
    public cfn(KidSetupViewModel kidSetupViewModel) {
        super(kidSetupViewModel);
    }

    @Override // flm.cep
    protected final String a() {
        return "GetAddAccountIntentTask";
    }

    @Override // flm.cep
    protected final /* synthetic */ Object b() {
        return (Intent) dvl.a((Intent) AccountManager.get(this.a).addAccount("com.google", null, null, null, null, null, null).getResult().getParcelable("intent"));
    }
}

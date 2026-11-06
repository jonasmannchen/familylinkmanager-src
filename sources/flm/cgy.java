package flm;

import android.accounts.Account;
import android.os.DeadObjectException;
import com.google.android.gms.kids.setup.viewmodel.KidSetupViewModel;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cgy extends cep {
    private final boolean c;

    public cgy(KidSetupViewModel kidSetupViewModel, boolean z) {
        super(kidSetupViewModel);
        this.c = z;
    }

    @Override // flm.cep
    protected final String a() {
        return "RemoveSupervisedAccountTask";
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // flm.cep
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final Void b() {
        Account supervisedAccount = this.b.b().getSupervisedAccount();
        if (supervisedAccount != null) {
            this.b.b().removeSupervisedAccount(supervisedAccount.name, this.c);
        }
        try {
            this.b.b().revokeSupervision();
            return null;
        } catch (DeadObjectException e) {
            btv.d("KidSetup", "Supervision service died when revoking policies, retrying...", new Object[0]);
            this.b.c();
            this.b.b().revokeSupervision();
            return null;
        }
    }
}

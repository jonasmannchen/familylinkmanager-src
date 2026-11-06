package flm;

import android.os.DeadObjectException;
import com.google.android.gms.kids.setup.viewmodel.KidSetupViewModel;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cey extends cep {
    public cey(KidSetupViewModel kidSetupViewModel) {
        super(kidSetupViewModel);
    }

    @Override // flm.cep
    protected final String a() {
        return "ContinueSupervisionTask";
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // flm.cep
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final Void b() {
        try {
            this.b.b().applyAllButHideAppPolicies();
            return null;
        } catch (DeadObjectException e) {
            btv.d("KidSetup", "Supervision service died when applying rest of the policies, retrying...", new Object[0]);
            this.b.c();
            this.b.b().applyAllButHideAppPolicies();
            return null;
        }
    }
}

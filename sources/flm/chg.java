package flm;

import android.os.DeadObjectException;
import com.google.android.gms.kids.setup.viewmodel.KidSetupViewModel;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class chg extends cep {
    public chg(KidSetupViewModel kidSetupViewModel) {
        super(kidSetupViewModel);
    }

    @Override // flm.cep
    protected final String a() {
        return "SyncSupervisionTask";
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // flm.cep
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final List b() {
        List listApplyHideAppPolicies;
        this.b.b().setPolicyLevel(2);
        this.b.a(chh.a);
        this.b.b().turnOffFamilyLinkSupervision();
        this.b.b().syncPolicies();
        try {
            listApplyHideAppPolicies = this.b.b().applyHideAppPolicies();
        } catch (DeadObjectException e) {
            btv.d("KidSetup", "Supervision service died when applying hide app policies, retrying...", new Object[0]);
            this.b.c();
            listApplyHideAppPolicies = this.b.b().applyHideAppPolicies();
        }
        if (listApplyHideAppPolicies.isEmpty()) {
            try {
                this.b.b().applyAllButHideAppPolicies();
            } catch (DeadObjectException e2) {
                btv.d("KidSetup", "Supervision service died when applying rest of the policies, retrying...", new Object[0]);
                this.b.c();
                this.b.b().applyAllButHideAppPolicies();
            }
            return Arrays.asList(new String[0]);
        }
        return listApplyHideAppPolicies;
    }

    static final /* synthetic */ cij a(cij cijVar) {
        fio fioVar = (fio) cijVar.a(dp.au, (Object) null);
        fioVar.a((fin) cijVar);
        return (cij) ((fin) ((cik) fioVar).a(2).h());
    }
}

package flm;

import android.content.ComponentName;
import android.content.IntentFilter;
import com.google.android.gms.kids.setup.viewmodel.KidSetupViewModel;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cgt extends cep {
    public cgt(KidSetupViewModel kidSetupViewModel) {
        super(kidSetupViewModel);
    }

    @Override // flm.cep
    protected final String a() {
        return "PrepareForSyncTailFlowTask";
    }

    @Override // flm.cep
    protected final /* synthetic */ Object b() {
        if (!this.b.b().isSupervisedAccountNonUnicorn()) {
            if (biw.c()) {
                this.b.b().setGoogleServicesActivityEnabled(false);
            }
            this.b.b().disableBlacklistedApps();
        }
        col.a(this.a, this.b.d());
        ComponentName componentName = new ComponentName(this.a.getPackageName(), "com.google.android.gms.kids.SyncTailTrapperActivity");
        this.a.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
        IntentFilter intentFilter = new IntentFilter("android.intent.action.MAIN");
        intentFilter.addCategory("android.intent.category.DEFAULT");
        intentFilter.addCategory("android.intent.category.HOME");
        this.b.b().addPersistentPreferredActivity(intentFilter, componentName);
        return null;
    }
}

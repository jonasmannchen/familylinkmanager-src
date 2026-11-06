package flm;

import android.content.ComponentName;
import android.content.Context;
import com.google.android.gms.kids.setup.viewmodel.KidSetupViewModel;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class chi extends cep {
    private final boolean c;

    public chi(KidSetupViewModel kidSetupViewModel, boolean z) {
        super(kidSetupViewModel);
        this.c = z;
    }

    @Override // flm.cep
    protected final String a() {
        return "SyncTailFlowCleanupTask";
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // flm.cep
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final Void b() {
        if (this.c) {
            try {
                this.b.b().scheduleFinishDeviceSetupJob();
            } catch (Exception e) {
                btv.c("KidSetup", e, "Failed to schedule finishing job.", new Object[0]);
            }
        }
        try {
            col.b(this.a);
        } catch (Exception e2) {
            btv.c("KidSetup", e2, "Failed to clean up saved states.", new Object[0]);
        }
        try {
            this.b.b().setStatusBarEnabled(true);
        } catch (Exception e3) {
            btv.c("KidSetup", e3, "Failed to enable status bar.", new Object[0]);
        }
        try {
            Context context = this.a;
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context.getPackageName(), "com.google.android.gms.kids.SyncTailTrapperActivity"), 0, 1);
            return null;
        } catch (Exception e4) {
            btv.c("KidSetup", e4, "Failed to restore default home launcher.", new Object[0]);
            return null;
        }
    }
}

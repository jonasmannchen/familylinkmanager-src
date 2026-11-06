package flm;

import android.app.admin.DevicePolicyManager;
import android.os.Build;
import com.google.android.gms.common.app.BaseApplicationContext;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cds extends cdc {
    @Override // flm.cdc
    public final int a(bwg bwgVar, cdb cdbVar) {
        BaseApplicationContext baseApplicationContextA = ayt.a();
        if (bhp.b(baseApplicationContextA)) {
            fcs fcsVar = (fcs) fin.b(fcs.c, bwgVar.f);
            DevicePolicyManager devicePolicyManager = (DevicePolicyManager) baseApplicationContextA.getSystemService("device_policy");
            if (fcsVar.b) {
                bte.a(devicePolicyManager);
            }
            devicePolicyManager.clearUserRestriction(btb.a, "no_factory_reset");
            if (Build.VERSION.SDK_INT < 26) {
                try {
                    Thread.sleep(TimeUnit.SECONDS.toMillis(5L));
                } catch (InterruptedException e) {
                    btv.c("Policy", e, "Interrupted", new Object[0]);
                }
            }
            bte.h(devicePolicyManager);
        } else {
            btv.d("Policy", "Not primary profile, skip wipe data", new Object[0]);
        }
        return 4;
    }

    @Override // flm.cdc
    public final void a(bwg bwgVar) {
    }
}

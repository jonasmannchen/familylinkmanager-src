package flm;

import android.app.Notification;
import android.app.admin.DevicePolicyManager;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.google.android.chimeraresources.R;
import com.google.android.gms.common.app.BaseApplicationContext;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cdj extends cdc {
    @Override // flm.cdc
    public final int a(bwg bwgVar, cdb cdbVar) {
        switch (bwgVar.a.ordinal()) {
            case 9:
                if (cdbVar.e) {
                    btv.c("Policy", "skip applying location mode settings when NO_UI", new Object[0]);
                } else {
                    fbs fbsVar = (fbs) fin.b(fbs.c, bwgVar.f);
                    fae faeVarA = fae.a(fbsVar.b);
                    if (faeVarA == null) {
                        faeVarA = fae.LOCATION_MODE_UNSPECIFIED;
                    }
                    btw.a(faeVarA);
                    Object[] objArr = new Object[1];
                    fae faeVarA2 = fae.a(fbsVar.b);
                    if (faeVarA2 == null) {
                        faeVarA2 = fae.LOCATION_MODE_UNSPECIFIED;
                    }
                    objArr[0] = faeVarA2;
                    btv.c("Policy", "Set location mode to %s", objArr);
                }
                return 2;
            case 10:
            default:
                btv.d("Policy", "Unknown location policy type:%s", bwgVar.a);
                return 2;
            case 11:
                fby fbyVar = (fby) fin.b(fby.c, bwgVar.f);
                if (cdbVar.e) {
                    btv.d("Policy", "Don't need to show location notifications when NO_UI", new Object[0]);
                } else if (TextUtils.isEmpty(fbyVar.b)) {
                    btv.d("Policy", "location notification message is empty", new Object[0]);
                } else {
                    String str = bwgVar.b;
                    String str2 = fbyVar.b;
                    BaseApplicationContext baseApplicationContextA = ayt.a();
                    Notification.Builder style = buc.a(baseApplicationContextA, R.drawable.quantum_ic_location_on_white_24).setContentTitle(baseApplicationContextA.getString(R.string.kids_location_change_title)).setContentText(str2).setGroup("com.google.android.gms.kids.POLICY_UPDATES").setStyle(new Notification.BigTextStyle().bigText(str2));
                    bto.a(baseApplicationContextA, style);
                    bel.a((Context) baseApplicationContextA).a(str, R.id.kids_location_change_notification_id, style.build());
                }
                return 2;
        }
    }

    @Override // flm.cdc
    public final void a(bwg bwgVar) {
        switch (bwgVar.a.ordinal()) {
            case 9:
                DevicePolicyManager devicePolicyManager = (DevicePolicyManager) dvl.a(ayt.a().getSystemService("device_policy"));
                devicePolicyManager.clearUserRestriction(btb.a, "no_share_location");
                if (Build.VERSION.SDK_INT >= 28) {
                    devicePolicyManager.clearUserRestriction(btb.a, "no_config_location");
                }
                break;
            case 10:
            default:
                btv.d("Policy", "Unknown location policy type:%s", bwgVar.a);
                break;
            case 11:
                break;
        }
    }
}

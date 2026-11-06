package flm;

import android.app.admin.DevicePolicyManager;
import android.content.Context;
import com.google.android.chimeraresources.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cdp extends cdc {
    /* JADX WARN: Type inference failed for: r0v4, types: [android.content.Context, flm.ayt] */
    @Override // flm.cdc
    public final int a(bwg bwgVar, cdb cdbVar) throws bxi {
        DevicePolicyManager devicePolicyManager = (DevicePolicyManager) dvl.a(ayt.a().getSystemService("device_policy"));
        fci fciVar = (fci) fin.b(fci.c, bwgVar.f);
        btv.a("Policy", "reset password", new Object[0]);
        if (buf.b()) {
            byte[] bArrA = buf.a();
            if (bArrA == null) {
                btv.d("Policy", "cannot generate reset token. retry.", new Object[0]);
                return 1;
            }
            if (!devicePolicyManager.isResetPasswordTokenActive(btb.a)) {
                btv.d("Policy", "reset password token is not active, wait for retry", new Object[0]);
                btt.a("Policy", "PasswordTokenNotActive", "password reset token not active when applying change password policy,", new Object[0]);
                a(devicePolicyManager);
                return 1;
            }
            try {
                bte.a(devicePolicyManager, fciVar.b, bArrA);
            } catch (IllegalStateException e) {
                btv.d("Policy", "Somehow having a wrong token. reset.", new Object[0]);
                devicePolicyManager.setResetPasswordToken(btb.a, bArrA);
                a(devicePolicyManager);
                return 1;
            }
        } else {
            bte.a(devicePolicyManager, fciVar.b);
        }
        a(devicePolicyManager);
        ?? A = ayt.a();
        bel.a((Context) A).a(R.id.kids_set_screen_lock_notification_id, buc.a(A, R.drawable.ic_familylink_notification_white_24).setContentTitle(A.getString(R.string.kids_set_screen_lock_notification_title)).setContentText(A.getString(R.string.kids_set_screen_lock_notification_body)).setGroup("com.google.android.gms.kids.POLICY_UPDATES").build());
        btt.h();
        return 4;
    }

    private static void a(DevicePolicyManager devicePolicyManager) {
        try {
            devicePolicyManager.lockNow();
        } catch (SecurityException e) {
            btv.b("Policy", e, "Lock screen refresh failed, ignore", new Object[0]);
        }
    }

    @Override // flm.cdc
    public final void a(bwg bwgVar) {
    }
}

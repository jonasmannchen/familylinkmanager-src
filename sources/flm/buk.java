package flm;

import android.accounts.Account;
import android.app.admin.DevicePolicyManager;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.google.android.gms.common.app.BaseApplicationContext;
import com.google.android.gms.kids.database.SupervisionDatabase;
import com.google.android.gms.kids.features.timelimit.TimeLimitCheckingIntentOperation;
import com.google.android.gms.kids.persistent.SupervisionChimeraService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class buk {
    public static void a(euz euzVar) {
        Account account;
        new Object[1][0] = euzVar;
        BaseApplicationContext baseApplicationContextA = ayt.a();
        DevicePolicyManager devicePolicyManager = (DevicePolicyManager) dvl.a(baseApplicationContextA.getSystemService("device_policy"), "Failed to get device policy manager.");
        dvl.b(bte.f(devicePolicyManager), "Device profile owner is not set.");
        bvp bvpVarK = SupervisionDatabase.h().k();
        Account accountC = bts.c();
        boolean z = bvpVarK.d("key_in_gl_sign_out") == 3;
        if (accountC == null && z) {
            String strA = bvpVarK.a("key_supervised_account");
            dvl.b(!TextUtils.isEmpty(strA), "Last supervised account not found.");
            Account account2 = new Account(strA, "com.google");
            dvl.b(bhp.a((Context) baseApplicationContextA, account2, baseApplicationContextA.getPackageName()), "Last supervised account no longer exists on device.");
            account = account2;
        } else {
            account = accountC;
        }
        dvl.a(account);
        new Object[1][0] = account;
        bvpVarK.a("key_policy_level", 0L);
        bvpVarK.a("key_supervised_account", account.name);
        if (bts.a(account)) {
            bvp bvpVarK2 = SupervisionDatabase.h().k();
            long jLongValue = ((Long) buw.f.b()).longValue();
            long jB = bvpVarK2.b("key_onboarded_disclaimer_notification_start_time_millis");
            long j = jB + jLongValue;
            long jB2 = btj.b();
            if (jB == 0) {
                bvpVarK2.a("key_onboarded_disclaimer_notification_start_time_millis", jB2);
                bue.a(baseApplicationContextA, jLongValue);
            } else if (jB2 < j) {
                bue.a(baseApplicationContextA, j - jB2);
            } else {
                bue.a(baseApplicationContextA);
            }
        }
        bui.a("Policy");
        bsy.b();
        bte.b(devicePolicyManager, true);
        bte.b(devicePolicyManager, new String[]{account.name});
        bte.a(account);
        bte.a(devicePolicyManager, true);
        bte.c(devicePolicyManager);
        boolean zB = fql.b();
        devicePolicyManager.setAccountManagementDisabled(btb.a, "com.google", !zB);
        btt.a(zB);
        if (bhp.b(ayt.a())) {
            devicePolicyManager.addUserRestriction(btb.a, "no_add_user");
            if (Build.VERSION.SDK_INT >= 23) {
                devicePolicyManager.addUserRestriction(btb.a, "no_safe_boot");
            }
        }
        if (Build.VERSION.SDK_INT >= 28) {
            devicePolicyManager.addUserRestriction(btb.a, "no_config_date_time");
        }
        if (Build.VERSION.SDK_INT >= 26) {
            devicePolicyManager.setAutoTimeRequired(btb.a, true);
            if (buf.b()) {
                buf.a();
            }
        }
        bte.a((Context) ayt.a(), true);
        baseApplicationContextA.startService(SupervisionChimeraService.getPersistentServiceIntent(baseApplicationContextA));
        caw.a();
        cav.b(euzVar);
        if (cav.a("REPORT_DEVICE_STATES", caw.f(euzVar))) {
            caw.b(euzVar);
        }
    }

    public static void a() throws Throwable {
        BaseApplicationContext baseApplicationContextA = ayt.a();
        Account accountC = bts.c();
        bvp bvpVarK = SupervisionDatabase.h().k();
        dvl.b(accountC == null || bvpVarK.d("key_in_gl_sign_out") == 3, "Device should have no supervised account or be in lockdown state prior to revoking.");
        bue.a(baseApplicationContextA);
        SupervisionDatabase.h().k().a("key_onboarded_disclaimer_notification_start_time_millis", 0L);
        bvpVarK.a("key_policy_level", 1L);
        bvpVarK.a("key_supervised_account", (String) null);
        bvpVarK.a("key_in_gl_sign_out", 0L);
        bvpVarK.a("key_supervision_exit_lock_start_timestamp", 0L);
        DevicePolicyManager devicePolicyManager = (DevicePolicyManager) dvl.a(baseApplicationContextA.getSystemService("device_policy"), "Failed to get device policy manager.");
        if (bte.f(devicePolicyManager)) {
            bte.b(devicePolicyManager, false);
            bte.e(devicePolicyManager);
            bte.c();
            bte.a(devicePolicyManager, false);
            bte.d(devicePolicyManager);
            devicePolicyManager.setAccountManagementDisabled(btb.a, "com.google", false);
            btt.a(true);
            if (bhp.b(ayt.a())) {
                devicePolicyManager.clearUserRestriction(btb.a, "no_add_user");
                if (Build.VERSION.SDK_INT >= 23) {
                    devicePolicyManager.clearUserRestriction(btb.a, "no_safe_boot");
                }
            }
            if (Build.VERSION.SDK_INT >= 26) {
                devicePolicyManager.setAutoTimeRequired(btb.a, false);
            }
            if (Build.VERSION.SDK_INT >= 28) {
                devicePolicyManager.clearUserRestriction(btb.a, "no_config_date_time");
            }
        }
        try {
            ccx.a();
        } catch (bxi e) {
            btv.c("Policy", e, "Failed to revoke policies", new Object[0]);
            btt.a("Policy", e, "Failed to revoke policies", new Object[0]);
        }
        caw.e();
        SupervisionDatabase.i();
        bte.g(devicePolicyManager);
        baseApplicationContextA.startService(TimeLimitCheckingIntentOperation.a("revoking"));
        baseApplicationContextA.startService(SupervisionChimeraService.getPersistentServiceIntent(baseApplicationContextA));
    }
}

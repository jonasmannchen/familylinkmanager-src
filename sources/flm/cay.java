package flm;

import android.accounts.Account;
import android.app.admin.DevicePolicyManager;
import android.os.Bundle;
import com.google.android.gms.common.app.BaseApplicationContext;
import com.google.android.gms.kids.database.SupervisionDatabase;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cay implements cat {
    @Override // flm.cat
    public final void a(Bundle bundle) throws Throwable {
        BaseApplicationContext baseApplicationContextA = ayt.a();
        String string = bundle.getString("key_supervised_account_email", "");
        Account accountC = bts.c();
        DevicePolicyManager devicePolicyManager = (DevicePolicyManager) baseApplicationContextA.getSystemService("device_policy");
        if (SupervisionDatabase.h().k().d("key_policy_level") == 0) {
            btv.c("Job", "Policy level is already set to normal.", new Object[0]);
            a(eml.NO_OP);
            return;
        }
        if (accountC == null) {
            btv.c("Job", "Revoking supervision for an unsupervised account.", new Object[0]);
            a(eml.UNSUPERVISED_ACCOUNT);
            buk.a();
        } else {
            if (!accountC.name.equals(string)) {
                btv.e("Job", "Account passed in from job parameter does not match current account.", new Object[0]);
                btt.a("Job", "safetyNet", "Account passed in from job parameter does not match current account.", new Object[0]);
                throw new bxi("Invalid job parameter: wrong account name.");
            }
            if (!bte.f(devicePolicyManager)) {
                btv.d("Job", "Profile owner is not granted, aborting setup flow.", new Object[0]);
                a(eml.MISSING_PROFILE_OWNER);
                bts.b(accountC);
            } else {
                btv.c("Job", "Profile owner is set, advancing policy level to normal.", new Object[0]);
                a(eml.FINISH_SETUP);
                caw.a(bundle.getInt("key_supervision_setup_state"), bundle.getString("key_child_gaia_id"), bundle.getString("key_child_device_name"));
                btt.c();
            }
        }
    }

    private static void a(eml emlVar) {
        eoi eoiVar = eoi.JOB_IN_PROGRESS;
        elq elqVarA = ((elq) ((fio) elp.i.a(dp.au, (Object) null))).a("DEVICE_SETUP_SAFETY_NET");
        emk emkVar = (emk) ((fio) emj.c.a(dp.au, (Object) null));
        emkVar.c();
        emj emjVar = (emj) emkVar.a;
        if (emlVar == null) {
            throw new NullPointerException();
        }
        emjVar.a |= 1;
        emjVar.b = emlVar.e;
        elqVarA.c();
        elp elpVar = (elp) elqVarA.a;
        elpVar.c = (fin) emkVar.h();
        elpVar.b = 4;
        btt.a(eoiVar, (elp) ((fin) elqVarA.h()));
    }
}

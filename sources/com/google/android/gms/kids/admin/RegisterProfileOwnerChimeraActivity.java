package com.google.android.gms.kids.admin;

import android.app.admin.DevicePolicyManager;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.chimera.Activity;
import com.google.android.chimeraresources.R;
import flm.bsn;
import flm.btb;
import flm.bte;
import flm.btv;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class RegisterProfileOwnerChimeraActivity extends Activity {
    public static Intent getDebugIntent(Context context) {
        return new Intent("com.google.android.gms.kids.admin.ACTION_DEBUG").setComponent(new ComponentName(context, "com.google.android.gms.kids.chimera.RegisterProfileOwnerActivityProxy"));
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if ("com.google.android.gms.kids.admin.ACTION_DEBUG".equals(getIntent().getAction())) {
            setTheme(R.style.Theme_AppCompat_Light);
            if (bundle == null) {
                getFragmentManager().beginTransaction().replace(android.R.id.content, new bsn()).commitNow();
                return;
            }
            return;
        }
        if (bundle == null) {
            getPackageManager().setComponentEnabledSetting(btb.a, 1, 1);
            bte.g((DevicePolicyManager) getSystemService("device_policy"));
            try {
                startActivityForResult(new Intent("android.app.action.SET_PROFILE_OWNER").putExtra("android.app.extra.DEVICE_ADMIN", btb.a).putExtra("android.app.extra.ADD_EXPLANATION", getString(R.string.kids_admin_desc)).putExtra("android.app.extra.PROFILE_OWNER_NAME", getString(R.string.kids_admin_app_title)), 1);
            } catch (ActivityNotFoundException e) {
                btv.c("Admin", e, "Error starting activity for ACTION_SET_PROFILE_OWNER", new Object[0]);
                setResult(0);
                finish();
            }
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        btv.a("Admin", "onActivityResult: %s, %s", Integer.valueOf(i2), Integer.valueOf(i));
        if (i == 1) {
            setResult(bte.f((DevicePolicyManager) getSystemService("device_policy")) ? -1 : 0);
            finish();
        }
    }
}

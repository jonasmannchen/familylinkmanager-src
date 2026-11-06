package com.google.android.gms.kids.admin;

import android.app.admin.DevicePolicyManager;
import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.DeviceAdminReceiver;
import flm.ayt;
import flm.bte;
import flm.btv;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class ProfileOwnerChimeraReceiver extends DeviceAdminReceiver {
    public void onEnabled(Context context, Intent intent) {
        btv.c("Admin", "onEnabled: intent = %s", intent);
        DevicePolicyManager devicePolicyManager = (DevicePolicyManager) context.getSystemService("device_policy");
        if (bte.f(devicePolicyManager)) {
            bte.a((Context) ayt.a(), true);
            bte.b(devicePolicyManager, true);
        }
    }
}

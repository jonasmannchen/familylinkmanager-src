package com.google.android.gms.kids.service;

import android.content.Intent;
import android.util.Base64;
import flm.ayu;
import flm.btt;
import flm.btv;
import flm.bum;
import flm.buw;
import flm.cav;
import flm.caw;
import flm.ccx;
import flm.dvj;
import flm.euz;
import flm.fcy;
import flm.fib;
import flm.fin;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class GcmReceiverChimeraService extends ayu {
    private static final List a = Arrays.asList("tl", "ri");

    public GcmReceiverChimeraService() {
        super("GcmReceiverChimeraService");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.bgv
    public void onHandleIntent(Intent intent) {
        String stringExtra = intent.getStringExtra("v");
        String stringExtra2 = intent.getStringExtra("t");
        if ("on".equals(stringExtra2)) {
            btv.c("Policy", "GCM event: type: %s", stringExtra2);
            btt.a();
            sendBroadcast(new Intent().setAction("com.google.android.gms.kids.common.ACTION_REFRESH_SUPERVISION_ONBOARDING_STATE").setPackage("com.google.android.gms"));
            sendBroadcast(new Intent().setAction("com.google.android.gms.kids.common.ACTION_REFRESH_SUPERVISION_ONBOARDING_STATE").setPackage("com.google.android.apps.kids.familylinkmanager"));
            return;
        }
        if (!bum.a()) {
            caw.c(euz.SERVER_CHANGE);
            return;
        }
        btv.c("Policy", "GCM event: type: %s", stringExtra2);
        btt.a();
        if (!a(stringExtra2, stringExtra)) {
            if ("gd".equals(stringExtra2)) {
                caw.a(euz.SERVER_CHANGE, ((Integer) buw.a.b()).intValue());
            } else {
                cav.b(euz.SERVER_CHANGE);
            }
        }
    }

    private static boolean a(String str, String str2) {
        if (a.contains(str) && !dvj.a(str2)) {
            try {
                ccx.a((fcy) fin.b(fcy.e, Base64.decode(str2, 1), fib.b()));
                return true;
            } catch (Exception e) {
                btv.b("Policy", e, "Process high priority payload failed", new Object[0]);
            }
        }
        return false;
    }
}

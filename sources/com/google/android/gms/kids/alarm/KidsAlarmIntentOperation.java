package com.google.android.gms.kids.alarm;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import flm.btv;
import flm.bum;
import flm.cav;
import flm.euz;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class KidsAlarmIntentOperation extends IntentOperation {
    public final void onHandleIntent(Intent intent) {
        if (bum.a()) {
            String action = intent.getAction();
            btv.c("Alarm", "Handle action: %s", action);
            if (action != null) {
                switch (action) {
                    case "com.google.android.gms.kids.alarm.APPLY_POLICY":
                        cav.c(euz.LOCAL_CHANGE);
                        break;
                    default:
                        btv.d("Alarm", "Unknown action:%s", action);
                        break;
                }
            }
        }
    }
}

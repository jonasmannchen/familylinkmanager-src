package com.google.android.gms.kids.features.timelimit;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.kids.database.SupervisionDatabase;
import flm.btv;
import flm.bum;
import flm.bzb;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class UsageCheckingIntentOperation extends IntentOperation {
    public final void onHandleIntent(Intent intent) {
        if (bum.a()) {
            btv.c("TimeLimit", "Handle usage intent:%s", intent.getAction());
            if (intent.getAction() != null) {
                switch (intent.getAction()) {
                    case "android.intent.action.BOOT_COMPLETED":
                    case "android.intent.action.USER_PRESENT":
                    case "android.intent.action.USER_FOREGROUND":
                        SupervisionDatabase.h().p().a("is_shutting_down", false);
                        new bzb().a();
                        startService(TimeLimitCheckingIntentOperation.a("system"));
                        break;
                    case "android.intent.action.ACTION_SHUTDOWN":
                        SupervisionDatabase.h().p().a("is_shutting_down", true);
                        new bzb().a();
                        break;
                    case "android.intent.action.SCREEN_OFF":
                    case "android.intent.action.USER_BACKGROUND":
                        new bzb().a();
                        break;
                    default:
                        btv.d("TimeLimit", "Unknown action:%s", intent.getAction());
                        break;
                }
            }
        }
    }
}

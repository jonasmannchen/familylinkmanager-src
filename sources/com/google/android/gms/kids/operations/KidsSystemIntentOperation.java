package com.google.android.gms.kids.operations;

import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.widget.Toast;
import com.google.android.chimera.IntentOperation;
import com.google.android.chimeraresources.R;
import com.google.android.gms.common.app.BaseApplicationContext;
import com.google.android.gms.kids.database.SupervisionDatabase;
import flm.ayt;
import flm.bhp;
import flm.btj;
import flm.btt;
import flm.btv;
import flm.btw;
import flm.buk;
import flm.bum;
import flm.bwg;
import flm.caw;
import flm.cqr;
import flm.euz;
import flm.fae;
import flm.fbs;
import flm.fdc;
import flm.fib;
import flm.fin;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class KidsSystemIntentOperation extends IntentOperation {
    /* JADX WARN: Multi-variable type inference failed */
    public final void onHandleIntent(Intent intent) {
        if (bum.a() && intent != null) {
            btv.c("System", "Handle system action:%s", intent.getAction());
            if (intent.getAction() != null) {
                long jB = btj.b();
                SupervisionDatabase supervisionDatabaseH = SupervisionDatabase.h();
                switch (intent.getAction()) {
                    case "android.intent.action.USER_PRESENT":
                    case "android.intent.action.SCREEN_OFF":
                    case "android.intent.action.USER_BACKGROUND":
                    case "android.intent.action.ACTION_SHUTDOWN":
                        break;
                    case "android.intent.action.USER_FOREGROUND":
                        if (!bhp.b(this)) {
                            buk.a(euz.USER_SWITCH);
                            break;
                        }
                        break;
                    case "android.intent.action.DATE_CHANGED":
                        btj.e();
                        supervisionDatabaseH.m().a(6, jB);
                        caw.a(euz.DATE_TIME_CHANGED);
                        break;
                    case "android.intent.action.TIME_SET":
                        btj.e();
                        supervisionDatabaseH.m().a(7, jB);
                        caw.a(euz.DATE_TIME_CHANGED);
                        break;
                    case "android.intent.action.TIMEZONE_CHANGED":
                        btj.e();
                        supervisionDatabaseH.m().a(5, jB);
                        caw.a(euz.DATE_TIME_CHANGED);
                        break;
                    case "android.location.MODE_CHANGED":
                        bwg bwgVarB = SupervisionDatabase.h().l().b(fdc.TYPE_LOCATION, "");
                        if (bwgVarB != null) {
                            supervisionDatabaseH.m().a(8, jB);
                            caw.a(euz.LOCAL_CHANGE);
                            try {
                                fbs fbsVar = (fbs) fin.b(fbs.c, bwgVarB.f, fib.b());
                                final BaseApplicationContext baseApplicationContextA = ayt.a();
                                fae faeVarA = fae.a(fbsVar.b);
                                if (faeVarA == null) {
                                    faeVarA = fae.LOCATION_MODE_UNSPECIFIED;
                                }
                                if (btw.a(faeVarA)) {
                                    Object[] objArr = new Object[1];
                                    fae faeVarA2 = fae.a(fbsVar.b);
                                    if (faeVarA2 == null) {
                                        faeVarA2 = fae.LOCATION_MODE_UNSPECIFIED;
                                    }
                                    objArr[0] = faeVarA2;
                                    btv.c("System", "Set location mode back to %s", objArr);
                                    final String string = baseApplicationContextA.getResources().getString(R.string.kids_location_settings_locked);
                                    new cqr(Looper.getMainLooper()).post(new Runnable(baseApplicationContextA, string) { // from class: flm.ccj
                                        private final Context a;
                                        private final String b;

                                        {
                                            this.a = baseApplicationContextA;
                                            this.b = string;
                                        }

                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            Toast.makeText(this.a, this.b, 0).show();
                                        }
                                    });
                                }
                            } catch (Exception e) {
                                btv.c("System", e, "Can't parse location mode policy", new Object[0]);
                                btt.a("System", e, "Can't parse location mode policy", new Object[0]);
                                return;
                            }
                            break;
                        }
                        break;
                    case "com.google.android.gms.gcm.REGISTERED":
                        supervisionDatabaseH.m().a(15, jB);
                        caw.a(euz.LOCAL_CHANGE);
                        break;
                    default:
                        btv.d("System", "Unknown action:%s", intent.getAction());
                        break;
                }
            }
        }
    }
}

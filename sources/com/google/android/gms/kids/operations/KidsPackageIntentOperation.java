package com.google.android.gms.kids.operations;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.kids.database.SupervisionDatabase;
import flm.alt;
import flm.ayt;
import flm.bsv;
import flm.bsy;
import flm.bte;
import flm.btj;
import flm.bts;
import flm.btt;
import flm.btv;
import flm.bum;
import flm.bvj;
import flm.bvn;
import flm.bwb;
import flm.bwg;
import flm.bxi;
import flm.cav;
import flm.caw;
import flm.dp;
import flm.etc;
import flm.etd;
import flm.euz;
import flm.ewr;
import flm.ews;
import flm.fcc;
import flm.fce;
import flm.fdc;
import flm.fin;
import flm.fio;
import flm.fjg;
import java.io.IOException;
import java.util.Collections;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class KidsPackageIntentOperation extends IntentOperation {
    private final SupervisionDatabase a = SupervisionDatabase.h();

    /* JADX WARN: Multi-variable type inference failed */
    public void onHandleIntent(Intent intent) {
        bsy.b();
        if (bum.a()) {
            String action = intent.getAction();
            if (action == null) {
                btv.d("System", "Dropping package intent, no action", new Object[0]);
                return;
            }
            Uri data = intent.getData();
            String schemeSpecificPart = data != null ? data.getSchemeSpecificPart() : null;
            if (TextUtils.isEmpty(schemeSpecificPart)) {
                btv.d("System", "Dropping %s Intent with missing package name", action);
                return;
            }
            boolean booleanExtra = intent.getBooleanExtra("android.intent.extra.REPLACING", false);
            btv.b("System", "Handling package intent %s, %s", action, Boolean.valueOf(booleanExtra));
            switch (action) {
                case "android.intent.action.PACKAGE_ADDED":
                    if (booleanExtra) {
                        this.a.m().a(2, btj.b(), schemeSpecificPart);
                        caw.a(euz.PACKAGE_CHANGED);
                        bwb bwbVarL = this.a.l();
                        bwbVarL.a(fdc.TYPE_HIDE_APP, schemeSpecificPart);
                        bwbVarL.a(fdc.TYPE_APP_MIN_VERSION, schemeSpecificPart);
                        a(schemeSpecificPart);
                        cav.c(euz.PACKAGE_CHANGED);
                        break;
                    } else {
                        Collections.singletonList(schemeSpecificPart);
                        btt.j();
                        long jB = btj.b();
                        if ((this.a.j().d(schemeSpecificPart) & 16) != 0) {
                            this.a.m().a(1, jB, schemeSpecificPart);
                            this.a.j().a(schemeSpecificPart);
                        } else {
                            bvj bvjVarM = this.a.m();
                            etd etdVar = (etd) ((fio) etc.c.a(dp.au, (Object) null));
                            etdVar.c();
                            etc etcVar = (etc) etdVar.a;
                            if (schemeSpecificPart == null) {
                                throw new NullPointerException();
                            }
                            etcVar.a |= 1;
                            etcVar.b = schemeSpecificPart;
                            etc etcVar2 = (etc) ((fin) etdVar.h());
                            ews ewsVar = (ews) ((fio) ewr.d.a(dp.au, (Object) null));
                            ewsVar.c();
                            ewr ewrVar = (ewr) ewsVar.a;
                            if (etcVar2 == null) {
                                throw new NullPointerException();
                            }
                            ewrVar.c = etcVar2;
                            ewrVar.b = 2;
                            bvjVarM.a(new bvn(1, jB, schemeSpecificPart, ((ewr) ((fin) ewsVar.h())).b()));
                        }
                        caw.a(euz.PACKAGE_CHANGED);
                        bwb bwbVarL2 = this.a.l();
                        bwbVarL2.a(fdc.TYPE_HIDE_APP, schemeSpecificPart);
                        bwbVarL2.a(fdc.TYPE_APP_MIN_VERSION, schemeSpecificPart);
                        a(schemeSpecificPart);
                        cav.c(euz.PACKAGE_CHANGED);
                        if (schemeSpecificPart.equals("com.google.android.apps.kids.familylink")) {
                            bte.a((Context) this, true);
                            try {
                                sendBroadcast(new Intent("com.google.android.apps.kids.kidsetup.action.SETUP_SUPERVISION").setPackage("com.google.android.apps.kids.familylink").putExtra("extra_account_name", bts.b()).putExtra("extra_gaia_id", bts.a(bts.b())));
                            } catch (alt | IOException e) {
                                btv.c("System", e, "Failed to get kid account name or id for broadcast", new Object[0]);
                                btt.a("System", e, "Failed to get kid account name or id for broadcast", new Object[0]);
                            }
                        }
                        break;
                    }
                    break;
                case "android.intent.action.PACKAGE_REMOVED":
                    if (!booleanExtra) {
                        Collections.singletonList(schemeSpecificPart);
                        btt.k();
                        this.a.m().a(3, btj.b(), schemeSpecificPart);
                        caw.a(euz.PACKAGE_CHANGED);
                        this.a.l().a(fdc.TYPE_APP_MIN_VERSION, schemeSpecificPart);
                        cav.c(euz.PACKAGE_CHANGED);
                        break;
                    }
                    break;
                default:
                    btv.d("System", "Unknown package intent: %s", action);
                    break;
            }
            bsy.a(schemeSpecificPart);
        }
    }

    private final void a(String str) {
        bwb bwbVarL = this.a.l();
        try {
            PackageInfo packageInfo = ayt.a().getPackageManager().getPackageInfo(str, 4096);
            for (bwg bwgVar : bwbVarL.c(fdc.TYPE_APP_PERMISSION_CONTROL_MODE)) {
                try {
                    bsv.a("System", Collections.singletonList(packageInfo), bwgVar.b, (fce) fin.b(fce.d, bwgVar.f));
                } catch (bxi | fjg e) {
                    btv.c("System", e, "Failed to apply permission group control mode policy", new Object[0]);
                    btt.a("System", e, "Failed to apply permission group control mode policy", new Object[0]);
                }
            }
            fdc fdcVar = fdc.TYPE_APP_PERMISSION_GRANT_STATE;
            String strValueOf = String.valueOf(str);
            bwg[] bwgVarArrC = bwbVarL.c(fdcVar, strValueOf.length() != 0 ? "%|".concat(strValueOf) : new String("%|"));
            for (bwg bwgVar2 : bwgVarArrC) {
                try {
                    bsv.a("System", bwgVar2.b, (fcc) fin.b(fcc.d, bwgVar2.f));
                } catch (bxi | fjg e2) {
                    btv.c("System", e2, "Failed to apply permission group grant state policy", new Object[0]);
                    btt.a("System", e2, "Failed to apply permission group grant state policy", new Object[0]);
                }
            }
            btv.c("System", "Applied app permission policies", new Object[0]);
        } catch (PackageManager.NameNotFoundException e3) {
            btv.d("System", "Can't get package info to check app permission", new Object[0]);
        }
    }
}

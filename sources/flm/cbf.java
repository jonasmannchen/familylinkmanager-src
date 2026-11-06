package flm;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.text.TextUtils;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cbf implements cat {
    @Override // flm.cat
    public final void a(Bundle bundle) throws bxi {
        String str;
        String string;
        int i = bundle.getInt("key_supervision_setup_state", 0);
        btv.c("Job", "Finish device setup state: %s", Integer.valueOf(i));
        switch (i) {
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
                a(eld.INIT_SETUP);
                String string2 = bundle.getString("key_child_gaia_id");
                if (TextUtils.isEmpty(string2)) {
                    throw new bxi("Initialize device setup requested but child Gaia Id is not set.");
                }
                eys eysVar = (eys) ((fin) ((eyt) ((fio) eys.d.a(dp.au, (Object) null))).a(string2).b(btl.a()).h());
                try {
                    a(eysVar, cal.c());
                    break;
                } catch (alt e) {
                    btv.c("Job", e, "Auth error occurred while making gRPC calls to initialize device setup, retrying", new Object[0]);
                    try {
                        a(eysVar, cal.d());
                    } catch (alt e2) {
                        btv.c("Job", e2, "Error occurred while making gRPC calls to initialize device setup.", new Object[0]);
                        throw new bxj(e2.getMessage());
                    }
                    break;
                }
                cav.a(1, bundle.getString("key_child_gaia_id"), bundle.getString("key_child_device_name"));
                return;
            case 1:
                a(eld.INIT_SUPERVISION);
                String string3 = bundle.getString("key_child_gaia_id");
                if (TextUtils.isEmpty(string3)) {
                    throw new bxi("Initialize supervision is requested but child Gaia Id is not set.");
                }
                String string4 = bundle.getString("key_child_device_name");
                if (TextUtils.isEmpty(string4)) {
                    if (Build.MODEL.startsWith(Build.MANUFACTURER)) {
                        string = Build.MODEL;
                    } else {
                        String str2 = Build.MODEL;
                        String str3 = Build.MANUFACTURER;
                        string = new StringBuilder(String.valueOf(str2).length() + 1 + String.valueOf(str3).length()).append(str2).append(" ").append(str3).toString();
                    }
                    str = string;
                } else {
                    str = string4;
                }
                eyw eywVar = (eyw) ((fin) ((eyx) ((fio) eyw.f.a(dp.au, (Object) null))).a(string3).b(btl.a()).c(str).a(btw.a(Settings.Secure.getInt(ayt.a().getContentResolver(), "location_mode", 0)).f).h());
                try {
                    a(eywVar, cal.c());
                    break;
                } catch (alt e3) {
                    btv.c("Job", e3, "Auth error occurred while making gRPC call to initialize supervision, retrying.", new Object[0]);
                    try {
                        a(eywVar, cal.d());
                    } catch (alt e4) {
                        btv.c("Job", e4, "Error occurred while making gRPC call to initialize supervision.", new Object[0]);
                        btt.a("Job", e4, "Error occurred while making gRPC call to initialize supervision.", new Object[0]);
                        throw new bxj(e4.getMessage());
                    }
                    break;
                }
                cav.a(2, bundle.getString("key_child_gaia_id"), bundle.getString("key_child_device_name"));
                return;
            default:
                a(eld.ENFORCE_SUPERVISION);
                buk.a(euz.FORCED_SYNC);
                ayt aytVarA = ayt.a();
                aytVarA.sendBroadcast(new Intent("com.google.android.gms.kids.action.FINISH_DEVICE_SETUP").setPackage("com.google.android.apps.kids.familylinkmanager"));
                aytVarA.sendBroadcast(new Intent("com.google.android.gms.kids.action.FINISH_DEVICE_SETUP").setPackage("com.google.android.gms"));
                return;
        }
    }

    private static void a(eys eysVar, baw bawVar) throws bxj {
        try {
            cal.a().a(bawVar, eysVar);
        } catch (fvg e) {
            btv.c("Job", e, "Error occurred while making gRPC calls to initialize device setup.", new Object[0]);
            throw new bxj(e.getMessage());
        }
    }

    private static void a(eyw eywVar, baw bawVar) throws bxj {
        try {
            cal.a().a(bawVar, eywVar);
        } catch (fvg e) {
            btv.c("Job", e, "Error occurred while making gRPC call to initialize supervision.", new Object[0]);
            btt.a("Job", e, "Error occurred while making gRPC call to initialize supervision.", new Object[0]);
            throw new bxj(e.getMessage());
        }
    }

    private static void a(eld eldVar) {
        eoi eoiVar = eoi.JOB_IN_PROGRESS;
        elq elqVarA = ((elq) ((fio) elp.i.a(dp.au, (Object) null))).a("FINISH_DEVICE_SETUP");
        elc elcVar = (elc) ((fio) elb.c.a(dp.au, (Object) null));
        elcVar.c();
        elb elbVar = (elb) elcVar.a;
        if (eldVar == null) {
            throw new NullPointerException();
        }
        elbVar.a |= 1;
        elbVar.b = eldVar.d;
        elqVarA.c();
        elp elpVar = (elp) elqVarA.a;
        elpVar.c = (fin) elcVar.h();
        elpVar.b = 5;
        btt.a(eoiVar, (elp) ((fin) elqVarA.h()));
    }
}

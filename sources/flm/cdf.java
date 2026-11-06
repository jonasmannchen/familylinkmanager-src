package flm;

import android.app.admin.DevicePolicyManager;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cdf extends cdc {
    private ayt a = ayt.a();
    private DevicePolicyManager b = (DevicePolicyManager) this.a.getSystemService("device_policy");

    @Override // flm.cdc
    public final int a(bwg bwgVar, cdb cdbVar) {
        switch (bwgVar.a.ordinal()) {
            case 3:
                if (!bhp.b(this.a)) {
                    btv.d("Policy", "Not primary profile, skip disallow factory reset", new Object[0]);
                } else {
                    a("no_factory_reset", ((fbk) fin.b(fbk.c, bwgVar.f)).b);
                }
                return 2;
            case 4:
                a("no_install_unknown_sources", ((fbd) fin.b(fbd.c, bwgVar.f)).b);
                return 2;
            case 5:
                a("no_debugging_features", ((fbi) fin.b(fbi.c, bwgVar.f)).b);
                return 2;
            case 12:
                if (!bhp.b(this.a)) {
                    btv.d("Policy", "Not primary profile, skip disallow add/remove user", new Object[0]);
                } else {
                    a("no_add_user", ((fcq) fin.b(fcq.c, bwgVar.f)).b);
                }
                return 2;
            case 22:
                bte.a(this.b, (String[]) ((fbm) fin.b(fbm.b, bwgVar.f)).a.toArray(new String[0]));
                return 2;
            default:
                btv.d("Policy", "Unknown device policy type:%s", Integer.valueOf(bwgVar.a.z));
                return 2;
        }
    }

    @Override // flm.cdc
    public final void a(bwg bwgVar) {
        switch (bwgVar.a.ordinal()) {
            case 3:
                if (!bhp.b(this.a)) {
                    btv.d("Policy", "Not primary profile, skip disallow factory reset", new Object[0]);
                } else {
                    a("no_factory_reset", false);
                }
                break;
            case 4:
                a("no_install_unknown_sources", false);
                break;
            case 5:
                a("no_debugging_features", false);
                break;
            case 12:
                if (!bhp.b(this.a)) {
                    btv.d("Policy", "Not primary profile, skip enable add/remove user", new Object[0]);
                } else {
                    a("no_add_user", false);
                }
                break;
            case 22:
                bte.a(this.b, new String[0]);
                break;
            default:
                btv.d("Policy", "Unknown device policy type:%s", Integer.valueOf(bwgVar.a.z));
                break;
        }
    }

    private final void a(String str, boolean z) {
        if (z) {
            this.b.addUserRestriction(btb.a, str);
        } else {
            this.b.clearUserRestriction(btb.a, str);
        }
        btv.c("Policy", "set user restriction:%s, %s", str, Boolean.valueOf(z));
        btt.a(str);
    }
}

package flm;

import android.content.pm.PackageManager;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cde extends cdc {
    private final PackageManager a = ayt.a().getPackageManager();

    @Override // flm.cdc
    public final int a(bwg bwgVar, cdb cdbVar) throws bxi {
        switch (bwgVar.a.ordinal()) {
            case 15:
                bsv.a("Policy", this.a.getInstalledPackages(4096), bwgVar.b, (fce) fin.b(fce.d, bwgVar.f));
                btv.b("Policy", "Apply permission mode enforcement of %s", bwgVar.b);
                break;
            case 16:
                bsv.a("Policy", bwgVar.b, (fcc) fin.b(fcc.d, bwgVar.f));
                btv.b("Policy", "Apply permission group grant state of %s", bwgVar.b);
                break;
            default:
                btv.d("Policy", "Unknown policy type:%s", Integer.valueOf(bwgVar.a.z));
                break;
        }
        return 2;
    }

    @Override // flm.cdc
    public final void a(bwg bwgVar) {
        switch (bwgVar.a.ordinal()) {
            case 15:
                String str = bwgVar.b;
                bui.a("Policy", this.a.getInstalledPackages(4096), str, false);
                btv.b("Policy", "Revoke permission mode enforcement of %s", str);
                break;
            case 16:
                break;
            default:
                btv.d("Policy", "Unknown policy type:%s", Integer.valueOf(bwgVar.a.z));
                break;
        }
    }
}

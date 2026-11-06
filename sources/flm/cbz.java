package flm;

import android.content.Context;
import android.os.Bundle;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@ccg(a = "navigation")
public final class cbz extends ccf {
    private Context a;

    public cbz(Context context) {
        this.a = context;
    }

    @Override // flm.ccf
    public final boolean a() {
        return false;
    }

    @Override // flm.ccf
    public final /* synthetic */ void a(cbw cbwVar, Bundle bundle, ccc cccVar) {
        cbx cbxVar = (cbx) cbwVar;
        int i = cbxVar.b;
        if (i == 0) {
            String strValueOf = String.valueOf(cbxVar.e != 0 ? this.a.getResources().getResourceName(cbxVar.e) : "the root navigation");
            throw new IllegalStateException(strValueOf.length() != 0 ? "no start destination defined via app:startDestination for ".concat(strValueOf) : new String("no start destination defined via app:startDestination for "));
        }
        cbw cbwVarA = cbxVar.a(i, false);
        if (cbwVarA == null) {
            String resourceName = this.a.getResources().getResourceName(i);
            throw new IllegalArgumentException(new StringBuilder(String.valueOf(resourceName).length() + 62).append("navigation destination ").append(resourceName).append(" is not a direct child of this NavGraph").toString());
        }
        a(cbxVar.e, 1);
        cbwVarA.a(bundle, cccVar);
    }

    @Override // flm.ccf
    public final /* synthetic */ cbw b() {
        return new cbx(this);
    }
}

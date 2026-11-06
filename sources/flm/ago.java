package flm;

import android.os.Bundle;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ago extends su {
    private final agn b;

    public ago(agn agnVar) {
        this.b = agnVar;
    }

    @Override // flm.su
    public final void a(View view, ua uaVar) {
        super.a(view, uaVar);
        if (!this.b.b.n() && this.b.b.k != null) {
            this.b.b.k.a(view, uaVar);
        }
    }

    @Override // flm.su
    public final boolean a(View view, int i, Bundle bundle) {
        if (super.a(view, i, bundle)) {
            return true;
        }
        if (this.b.b.n() || this.b.b.k == null) {
            return false;
        }
        afw afwVar = this.b.b.k;
        agf agfVar = afwVar.f.d;
        agk agkVar = afwVar.f.C;
        return false;
    }
}

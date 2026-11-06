package flm;

import android.os.Bundle;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ew extends su {
    private final /* synthetic */ eu b;

    ew(eu euVar) {
        this.b = euVar;
    }

    @Override // flm.su
    public final void a(View view, ua uaVar) {
        super.a(view, uaVar);
        if (!this.b.a) {
            uaVar.e(false);
        } else {
            uaVar.a(1048576);
            uaVar.e(true);
        }
    }

    @Override // flm.su
    public final boolean a(View view, int i, Bundle bundle) {
        if (i != 1048576 || !this.b.a) {
            return super.a(view, i, bundle);
        }
        this.b.cancel();
        return true;
    }
}

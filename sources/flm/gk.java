package flm;

import android.os.Bundle;
import android.support.design.snackbar.BaseTransientBottomBar;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gk extends su {
    private final /* synthetic */ BaseTransientBottomBar b;

    public gk(BaseTransientBottomBar baseTransientBottomBar) {
        this.b = baseTransientBottomBar;
    }

    @Override // flm.su
    public final void a(View view, ua uaVar) {
        super.a(view, uaVar);
        uaVar.a(1048576);
        uaVar.e(true);
    }

    @Override // flm.su
    public final boolean a(View view, int i, Bundle bundle) {
        if (i != 1048576) {
            return super.a(view, i, bundle);
        }
        this.b.f();
        return true;
    }
}

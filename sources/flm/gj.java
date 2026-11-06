package flm;

import android.support.design.snackbar.BaseTransientBottomBar;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gj implements th {
    private final /* synthetic */ BaseTransientBottomBar a;

    public gj(BaseTransientBottomBar baseTransientBottomBar) {
        this.a = baseTransientBottomBar;
    }

    @Override // flm.th
    public final tz a(View view, tz tzVar) {
        this.a.f = tzVar.d();
        this.a.a();
        return tzVar;
    }
}

package flm;

import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class xj implements ty {
    private final /* synthetic */ xg a;

    xj(xg xgVar) {
        this.a = xgVar;
    }

    @Override // flm.ty
    public final void a() {
        ((View) this.a.c.getParent()).invalidate();
    }
}

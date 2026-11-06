package flm;

import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class wl extends tx {
    private final /* synthetic */ wk a;

    wl(wk wkVar) {
        this.a = wkVar;
    }

    @Override // flm.tx, flm.tw
    public final void b(View view) {
        this.a.a.g.setVisibility(8);
        if (this.a.a.h != null) {
            this.a.a.h.dismiss();
        } else if (this.a.a.g.getParent() instanceof View) {
            ti.o((View) this.a.a.g.getParent());
        }
        this.a.a.g.removeAllViews();
        this.a.a.j.a((tw) null);
        this.a.a.j = null;
    }
}

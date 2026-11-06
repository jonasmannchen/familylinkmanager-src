package flm;

import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class wh extends tx {
    private final /* synthetic */ wb a;

    wh(wb wbVar) {
        this.a = wbVar;
    }

    @Override // flm.tx, flm.tw
    public final void a(View view) {
        this.a.g.setVisibility(0);
        this.a.g.sendAccessibilityEvent(32);
        if (this.a.g.getParent() instanceof View) {
            ti.o((View) this.a.g.getParent());
        }
    }

    @Override // flm.tx, flm.tw
    public final void b(View view) {
        this.a.g.setAlpha(1.0f);
        this.a.j.a((tw) null);
        this.a.j = null;
    }
}

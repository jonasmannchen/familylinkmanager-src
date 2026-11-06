package flm;

import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class xh extends tx {
    private final /* synthetic */ xg a;

    xh(xg xgVar) {
        this.a = xgVar;
    }

    @Override // flm.tx, flm.tw
    public final void b(View view) {
        if (this.a.j && this.a.f != null) {
            this.a.f.setTranslationY(0.0f);
            this.a.c.setTranslationY(0.0f);
        }
        this.a.c.setVisibility(8);
        this.a.c.a(false);
        this.a.m = null;
        xg xgVar = this.a;
        if (xgVar.i != null) {
            xgVar.i.a(xgVar.h);
            xgVar.h = null;
            xgVar.i = null;
        }
        if (this.a.b != null) {
            ti.o(this.a.b);
        }
    }
}

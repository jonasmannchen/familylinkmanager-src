package flm;

import android.view.Menu;
import android.view.MenuItem;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class wk implements yh {
    public final /* synthetic */ wb a;
    private yh b;

    public wk(wb wbVar, yh yhVar) {
        this.a = wbVar;
        this.b = yhVar;
    }

    @Override // flm.yh
    public final boolean a(yg ygVar, Menu menu) {
        return this.b.a(ygVar, menu);
    }

    @Override // flm.yh
    public final boolean b(yg ygVar, Menu menu) {
        return this.b.b(ygVar, menu);
    }

    @Override // flm.yh
    public final boolean a(yg ygVar, MenuItem menuItem) {
        return this.b.a(ygVar, menuItem);
    }

    @Override // flm.yh
    public final void a(yg ygVar) {
        this.b.a(ygVar);
        if (this.a.h != null) {
            this.a.c.getDecorView().removeCallbacks(this.a.i);
        }
        if (this.a.g != null) {
            this.a.m();
            this.a.j = ti.l(this.a.g).a(0.0f);
            this.a.j.a(new wl(this));
        }
        if (this.a.d != null) {
            this.a.d.onSupportActionModeFinished(this.a.f);
        }
        this.a.f = null;
    }
}

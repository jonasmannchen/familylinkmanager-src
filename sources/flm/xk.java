package flm;

import android.content.Context;
import android.support.v7.widget.ActionBarContextView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class xk extends yg implements zj {
    private final Context c;
    private final zi d;
    private yh e;
    private WeakReference f;
    private final /* synthetic */ xg g;

    public xk(xg xgVar, Context context, yh yhVar) {
        this.g = xgVar;
        this.c = context;
        this.e = yhVar;
        zi ziVar = new zi(context);
        ziVar.e = 1;
        this.d = ziVar;
        this.d.a(this);
    }

    @Override // flm.yg
    public final MenuInflater a() {
        return new yn(this.c);
    }

    @Override // flm.yg
    public final Menu b() {
        return this.d;
    }

    @Override // flm.yg
    public final void c() {
        if (this.g.g == this) {
            if (!xg.a(this.g.k, this.g.l, false)) {
                this.g.h = this;
                this.g.i = this.e;
            } else {
                this.e.a(this);
            }
            this.e = null;
            this.g.i(false);
            ActionBarContextView actionBarContextView = this.g.e;
            if (actionBarContextView.h == null) {
                actionBarContextView.b();
            }
            this.g.d.a().sendAccessibilityEvent(32);
            this.g.b.a(this.g.n);
            this.g.g = null;
        }
    }

    @Override // flm.yg
    public final void d() {
        if (this.g.g == this) {
            this.d.e();
            try {
                this.e.b(this, this.d);
            } finally {
                this.d.f();
            }
        }
    }

    public final boolean e() {
        this.d.e();
        try {
            return this.e.a(this, this.d);
        } finally {
            this.d.f();
        }
    }

    @Override // flm.yg
    public final void a(View view) {
        this.g.e.a(view);
        this.f = new WeakReference(view);
    }

    @Override // flm.yg
    public final void a(CharSequence charSequence) {
        this.g.e.b(charSequence);
    }

    @Override // flm.yg
    public final void b(CharSequence charSequence) {
        this.g.e.a(charSequence);
    }

    @Override // flm.yg
    public final void a(int i) {
        b(this.g.a.getResources().getString(i));
    }

    @Override // flm.yg
    public final void b(int i) {
        a(this.g.a.getResources().getString(i));
    }

    @Override // flm.yg
    public final CharSequence f() {
        return this.g.e.f;
    }

    @Override // flm.yg
    public final CharSequence g() {
        return this.g.e.g;
    }

    @Override // flm.yg
    public final void a(boolean z) {
        super.a(z);
        this.g.e.a(z);
    }

    @Override // flm.yg
    public final boolean h() {
        return this.g.e.i;
    }

    @Override // flm.yg
    public final View i() {
        if (this.f != null) {
            return (View) this.f.get();
        }
        return null;
    }

    @Override // flm.zj
    public final boolean a(zi ziVar, MenuItem menuItem) {
        if (this.e != null) {
            return this.e.a(this, menuItem);
        }
        return false;
    }

    @Override // flm.zj
    public final void a(zi ziVar) {
        if (this.e != null) {
            d();
            this.g.e.a();
        }
    }
}

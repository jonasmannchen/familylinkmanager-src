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
public final class yk extends yg implements zj {
    private Context c;
    private ActionBarContextView d;
    private yh e;
    private WeakReference f;
    private boolean g;
    private zi h;

    public yk(Context context, ActionBarContextView actionBarContextView, yh yhVar, boolean z) {
        this.c = context;
        this.d = actionBarContextView;
        this.e = yhVar;
        zi ziVar = new zi(actionBarContextView.getContext());
        ziVar.e = 1;
        this.h = ziVar;
        this.h.a(this);
    }

    @Override // flm.yg
    public final void b(CharSequence charSequence) {
        this.d.a(charSequence);
    }

    @Override // flm.yg
    public final void a(CharSequence charSequence) {
        this.d.b(charSequence);
    }

    @Override // flm.yg
    public final void a(int i) {
        b(this.c.getString(i));
    }

    @Override // flm.yg
    public final void b(int i) {
        a(this.c.getString(i));
    }

    @Override // flm.yg
    public final void a(boolean z) {
        super.a(z);
        this.d.a(z);
    }

    @Override // flm.yg
    public final boolean h() {
        return this.d.i;
    }

    @Override // flm.yg
    public final void a(View view) {
        this.d.a(view);
        this.f = view != null ? new WeakReference(view) : null;
    }

    @Override // flm.yg
    public final void d() {
        this.e.b(this, this.h);
    }

    @Override // flm.yg
    public final void c() {
        if (!this.g) {
            this.g = true;
            this.d.sendAccessibilityEvent(32);
            this.e.a(this);
        }
    }

    @Override // flm.yg
    public final Menu b() {
        return this.h;
    }

    @Override // flm.yg
    public final CharSequence f() {
        return this.d.f;
    }

    @Override // flm.yg
    public final CharSequence g() {
        return this.d.g;
    }

    @Override // flm.yg
    public final View i() {
        if (this.f != null) {
            return (View) this.f.get();
        }
        return null;
    }

    @Override // flm.yg
    public final MenuInflater a() {
        return new yn(this.d.getContext());
    }

    @Override // flm.zj
    public final boolean a(zi ziVar, MenuItem menuItem) {
        return this.e.a(this, menuItem);
    }

    @Override // flm.zj
    public final void a(zi ziVar) {
        d();
        this.d.a();
    }
}

package flm;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class aai extends zi implements SubMenu {
    public zi k;
    private zm l;

    public aai(Context context, zi ziVar, zm zmVar) {
        super(context);
        this.k = ziVar;
        this.l = zmVar;
    }

    @Override // flm.zi, android.view.Menu
    public final void setQwertyMode(boolean z) {
        this.k.setQwertyMode(z);
    }

    @Override // flm.zi
    public final boolean c() {
        return this.k.c();
    }

    @Override // flm.zi
    public final boolean d() {
        return this.k.d();
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.l;
    }

    @Override // flm.zi
    public final void a(zj zjVar) {
        this.k.a(zjVar);
    }

    @Override // flm.zi
    public final zi l() {
        return this.k.l();
    }

    @Override // flm.zi
    final boolean a(zi ziVar, MenuItem menuItem) {
        return super.a(ziVar, menuItem) || this.k.a(ziVar, menuItem);
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.l.setIcon(drawable);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i) {
        this.l.setIcon(i);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        super.a(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i) {
        super.a(0, null, i, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        super.a(0, charSequence, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i) {
        super.a(i, null, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        super.a(0, null, 0, null, view);
        return this;
    }

    @Override // flm.zi
    public final boolean a(zm zmVar) {
        return this.k.a(zmVar);
    }

    @Override // flm.zi
    public final boolean b(zm zmVar) {
        return this.k.b(zmVar);
    }

    @Override // flm.zi
    public final String a() {
        int itemId = this.l != null ? this.l.getItemId() : 0;
        if (itemId == 0) {
            return null;
        }
        return super.a() + ":" + itemId;
    }

    @Override // flm.zi, android.view.Menu
    public final void setGroupDividerEnabled(boolean z) {
        this.k.setGroupDividerEnabled(z);
    }

    @Override // flm.zi
    public final boolean b() {
        return this.k.b();
    }
}

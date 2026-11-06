package flm;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class aaj extends aad implements SubMenu {
    aaj(Context context, qk qkVar) {
        super(context, qkVar);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i) {
        ((qk) this.d).setHeaderTitle(i);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        ((qk) this.d).setHeaderTitle(charSequence);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i) {
        ((qk) this.d).setHeaderIcon(i);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        ((qk) this.d).setHeaderIcon(drawable);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        ((qk) this.d).setHeaderView(view);
        return this;
    }

    @Override // android.view.SubMenu
    public final void clearHeader() {
        ((qk) this.d).clearHeader();
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i) {
        ((qk) this.d).setIcon(i);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        ((qk) this.d).setIcon(drawable);
        return this;
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return a(((qk) this.d).getItem());
    }
}

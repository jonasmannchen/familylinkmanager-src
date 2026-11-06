package flm;

import android.view.MenuItem;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class zr extends yy implements MenuItem.OnActionExpandListener {
    private final /* synthetic */ zo a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zr(zo zoVar, MenuItem.OnActionExpandListener onActionExpandListener) {
        super(onActionExpandListener);
        this.a = zoVar;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return ((MenuItem.OnActionExpandListener) this.d).onMenuItemActionExpand(this.a.a(menuItem));
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return ((MenuItem.OnActionExpandListener) this.d).onMenuItemActionCollapse(this.a.a(menuItem));
    }
}

package flm;

import android.view.MenuItem;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class zs extends yy implements MenuItem.OnMenuItemClickListener {
    private final /* synthetic */ zo a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zs(zo zoVar, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        super(onMenuItemClickListener);
        this.a = zoVar;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        return ((MenuItem.OnMenuItemClickListener) this.d).onMenuItemClick(this.a.a(menuItem));
    }
}

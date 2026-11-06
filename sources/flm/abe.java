package flm;

import android.support.v7.widget.ActionMenuView;
import android.view.MenuItem;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class abe implements zj {
    private final /* synthetic */ ActionMenuView a;

    public abe(ActionMenuView actionMenuView) {
        this.a = actionMenuView;
    }

    @Override // flm.zj
    public final boolean a(zi ziVar, MenuItem menuItem) {
        return this.a.e != null && this.a.e.a(menuItem);
    }

    @Override // flm.zj
    public final void a(zi ziVar) {
        if (this.a.d != null) {
            this.a.d.a(ziVar);
        }
    }
}

package flm;

import android.content.Context;
import android.view.ActionProvider;
import android.view.MenuItem;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class zu extends zp implements ActionProvider.VisibilityListener {
    private sy d;

    public zu(zt ztVar, Context context, ActionProvider actionProvider) {
        super(ztVar, context, actionProvider);
    }

    @Override // flm.sw
    public final View a(MenuItem menuItem) {
        return this.c.onCreateActionView(menuItem);
    }

    @Override // flm.sw
    public final boolean b() {
        return this.c.overridesItemVisibility();
    }

    @Override // flm.sw
    public final boolean c() {
        return this.c.isVisible();
    }

    @Override // flm.sw
    public final void a(sy syVar) {
        this.d = syVar;
        this.c.setVisibilityListener(this);
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z) {
        if (this.d != null) {
            this.d.a();
        }
    }
}

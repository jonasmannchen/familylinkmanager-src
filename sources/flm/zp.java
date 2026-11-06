package flm;

import android.content.Context;
import android.view.ActionProvider;
import android.view.SubMenu;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
class zp extends sw {
    public final ActionProvider c;
    private final /* synthetic */ zo d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zp(zo zoVar, Context context, ActionProvider actionProvider) {
        super(context);
        this.d = zoVar;
        this.c = actionProvider;
    }

    @Override // flm.sw
    public final View a() {
        return this.c.onCreateActionView();
    }

    @Override // flm.sw
    public final boolean d() {
        return this.c.onPerformDefaultAction();
    }

    @Override // flm.sw
    public final boolean e() {
        return this.c.hasSubMenu();
    }

    @Override // flm.sw
    public final void a(SubMenu subMenu) {
        this.c.onPrepareSubMenu(this.d.a(subMenu));
    }
}

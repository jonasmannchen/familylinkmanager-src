package flm;

import android.support.v7.view.menu.ActionMenuItemView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class yu extends adx {
    private final /* synthetic */ ActionMenuItemView c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yu(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.c = actionMenuItemView;
    }

    @Override // flm.adx
    public final aae a() {
        if (this.c.d != null) {
            return this.c.d.a();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.adx
    public final boolean b() {
        aae aaeVarA;
        return this.c.c != null && this.c.c.a(this.c.b) && (aaeVarA = a()) != null && aaeVarA.d();
    }
}

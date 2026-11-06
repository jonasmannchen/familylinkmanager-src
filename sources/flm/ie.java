package flm;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ie extends Drawable.ConstantState {
    private final Drawable.ConstantState a;

    public ie(Drawable.ConstantState constantState) {
        this.a = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        ib ibVar = new ib();
        ibVar.b = this.a.newDrawable();
        ibVar.b.setCallback(ibVar.a);
        return ibVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        ib ibVar = new ib();
        ibVar.b = this.a.newDrawable(resources);
        ibVar.b.setCallback(ibVar.a);
        return ibVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        ib ibVar = new ib();
        ibVar.b = this.a.newDrawable(resources, theme);
        ibVar.b.setCallback(ibVar.a);
        return ibVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.a.getChangingConfigurations();
    }
}

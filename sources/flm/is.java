package flm;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class is extends Drawable.ConstantState {
    private final Drawable.ConstantState a;

    public is(Drawable.ConstantState constantState) {
        this.a = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        ik ikVar = new ik();
        ikVar.b = (VectorDrawable) this.a.newDrawable();
        return ikVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        ik ikVar = new ik();
        ikVar.b = (VectorDrawable) this.a.newDrawable(resources);
        return ikVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        ik ikVar = new ik();
        ikVar.b = (VectorDrawable) this.a.newDrawable(resources, theme);
        return ikVar;
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

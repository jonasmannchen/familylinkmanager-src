package flm;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ajo extends LayerDrawable {
    public ColorStateList a;

    public static ajo a(Drawable drawable) {
        return drawable instanceof ajo ? (ajo) drawable : new ajo(drawable.mutate());
    }

    private ajo(Drawable drawable) {
        super(new Drawable[]{drawable});
        this.a = null;
    }

    @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setState(int[] iArr) {
        return super.setState(iArr) || a();
    }

    public final boolean a() {
        if (this.a == null) {
            return false;
        }
        setColorFilter(this.a.getColorForState(getState(), 0), PorterDuff.Mode.SRC_IN);
        return true;
    }
}

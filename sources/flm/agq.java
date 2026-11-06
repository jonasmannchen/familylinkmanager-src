package flm;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class agq extends Drawable {
    public float a;
    public float b;
    private final RectF f;
    private final Rect g;
    private ColorStateList h;
    private PorterDuffColorFilter i;
    private ColorStateList j;
    public boolean c = false;
    public boolean d = true;
    private PorterDuff.Mode k = PorterDuff.Mode.SRC_IN;
    private final Paint e = new Paint(5);

    agq(ColorStateList colorStateList, float f) {
        this.a = f;
        this.h = colorStateList == null ? ColorStateList.valueOf(0) : colorStateList;
        this.e.setColor(this.h.getColorForState(getState(), this.h.getDefaultColor()));
        this.f = new RectF();
        this.g = new Rect();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z;
        Paint paint = this.e;
        if (this.i != null && paint.getColorFilter() == null) {
            paint.setColorFilter(this.i);
            z = true;
        } else {
            z = false;
        }
        canvas.drawRoundRect(this.f, this.a, this.a, paint);
        if (z) {
            paint.setColorFilter(null);
        }
    }

    final void a(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        this.f.set(rect.left, rect.top, rect.right, rect.bottom);
        this.g.set(rect);
        if (this.c) {
            this.g.inset((int) Math.ceil(agr.b(this.b, this.a, this.d)), (int) Math.ceil(agr.a(this.b, this.a, this.d)));
            this.f.set(this.g);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        a(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        outline.setRoundRect(this.g, this.a);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.e.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.e.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.j = colorStateList;
        this.i = a(this.j, this.k);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        this.k = mode;
        this.i = a(this.j, this.k);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    protected final boolean onStateChange(int[] iArr) {
        int colorForState = this.h.getColorForState(iArr, this.h.getDefaultColor());
        boolean z = colorForState != this.e.getColor();
        if (z) {
            this.e.setColor(colorForState);
        }
        if (this.j == null || this.k == null) {
            return z;
        }
        this.i = a(this.j, this.k);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return (this.j != null && this.j.isStateful()) || (this.h != null && this.h.isStateful()) || super.isStateful();
    }

    private final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }
}

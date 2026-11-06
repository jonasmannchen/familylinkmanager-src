package flm;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class agr extends Drawable {
    public static ags b;
    private static final double g = Math.cos(Math.toRadians(45.0d));
    public final int a;
    public float c;
    public float d;
    public boolean e;
    public boolean f;
    private Paint h;
    private Paint i;
    private Paint j;
    private final RectF k;
    private Path l;
    private float m;
    private float n;
    private ColorStateList o;
    private final int p;
    private final int q;

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.h.setAlpha(i);
        this.i.setAlpha(i);
        this.j.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    protected final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.e = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        int iCeil = (int) Math.ceil(a(this.d, this.c, this.f));
        int iCeil2 = (int) Math.ceil(b(this.d, this.c, this.f));
        rect.set(iCeil2, iCeil, iCeil2, iCeil);
        return true;
    }

    static float a(float f, float f2, boolean z) {
        return z ? (float) (((double) (1.5f * f)) + ((1.0d - g) * ((double) f2))) : 1.5f * f;
    }

    static float b(float f, float f2, boolean z) {
        if (z) {
            return (float) (((double) f) + ((1.0d - g) * ((double) f2)));
        }
        return f;
    }

    @Override // android.graphics.drawable.Drawable
    protected final boolean onStateChange(int[] iArr) {
        int colorForState = this.o.getColorForState(iArr, this.o.getDefaultColor());
        if (this.h.getColor() == colorForState) {
            return false;
        }
        this.h.setColor(colorForState);
        this.e = true;
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return (this.o != null && this.o.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.h.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.e) {
            Rect bounds = getBounds();
            float f = this.d * 1.5f;
            this.k.set(bounds.left + this.d, bounds.top + f, bounds.right - this.d, bounds.bottom - f);
            RectF rectF = new RectF(-this.c, -this.c, this.c, this.c);
            RectF rectF2 = new RectF(rectF);
            rectF2.inset(-this.m, -this.m);
            if (this.l == null) {
                this.l = new Path();
            } else {
                this.l.reset();
            }
            this.l.setFillType(Path.FillType.EVEN_ODD);
            this.l.moveTo(-this.c, 0.0f);
            this.l.rLineTo(-this.m, 0.0f);
            this.l.arcTo(rectF2, 180.0f, 90.0f, false);
            this.l.arcTo(rectF, 270.0f, -90.0f, false);
            this.l.close();
            this.i.setShader(new RadialGradient(0.0f, 0.0f, this.c + this.m, new int[]{this.p, this.p, this.q}, new float[]{0.0f, this.c / (this.c + this.m), 1.0f}, Shader.TileMode.CLAMP));
            this.j.setShader(new LinearGradient(0.0f, (-this.c) + this.m, 0.0f, (-this.c) - this.m, new int[]{this.p, this.p, this.q}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP));
            this.j.setAntiAlias(false);
            this.e = false;
        }
        canvas.translate(0.0f, this.n / 2.0f);
        float f2 = (-this.c) - this.m;
        float f3 = this.c + this.a + (this.n / 2.0f);
        boolean z = this.k.width() - (f3 * 2.0f) > 0.0f;
        boolean z2 = this.k.height() - (f3 * 2.0f) > 0.0f;
        int iSave = canvas.save();
        canvas.translate(this.k.left + f3, this.k.top + f3);
        canvas.drawPath(this.l, this.i);
        if (z) {
            canvas.drawRect(0.0f, f2, this.k.width() - (f3 * 2.0f), -this.c, this.j);
        }
        canvas.restoreToCount(iSave);
        int iSave2 = canvas.save();
        canvas.translate(this.k.right - f3, this.k.bottom - f3);
        canvas.rotate(180.0f);
        canvas.drawPath(this.l, this.i);
        if (z) {
            canvas.drawRect(0.0f, f2, this.k.width() - (f3 * 2.0f), this.m + (-this.c), this.j);
        }
        canvas.restoreToCount(iSave2);
        int iSave3 = canvas.save();
        canvas.translate(this.k.left + f3, this.k.bottom - f3);
        canvas.rotate(270.0f);
        canvas.drawPath(this.l, this.i);
        if (z2) {
            canvas.drawRect(0.0f, f2, this.k.height() - (f3 * 2.0f), -this.c, this.j);
        }
        canvas.restoreToCount(iSave3);
        int iSave4 = canvas.save();
        canvas.translate(this.k.right - f3, this.k.top + f3);
        canvas.rotate(90.0f);
        canvas.drawPath(this.l, this.i);
        if (z2) {
            canvas.drawRect(0.0f, f2, this.k.height() - (f3 * 2.0f), -this.c, this.j);
        }
        canvas.restoreToCount(iSave4);
        canvas.translate(0.0f, (-this.n) / 2.0f);
        b.a(canvas, this.k, this.c, this.h);
    }
}

package flm;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class fm extends aei {
    private Drawable a;
    private final Rect b;
    private final Rect c;
    private int d;
    private boolean e;
    private boolean j;

    public fm(Context context) {
        this(context, null);
    }

    public fm(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public fm(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = new Rect();
        this.c = new Rect();
        this.d = 119;
        this.e = true;
        this.j = false;
        TypedArray typedArrayA = fp.a(context, attributeSet, fo.a, i, 0, new int[0]);
        this.d = typedArrayA.getInt(fo.c, this.d);
        Drawable drawable = typedArrayA.getDrawable(fo.b);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.e = typedArrayA.getBoolean(fo.d, true);
        typedArrayA.recycle();
    }

    @Override // android.view.View
    public int getForegroundGravity() {
        return this.d;
    }

    @Override // android.view.View
    public void setForegroundGravity(int i) {
        if (this.d != i) {
            int i2 = (8388615 & i) == 0 ? 8388611 | i : i;
            if ((i2 & 112) == 0) {
                i2 |= 48;
            }
            this.d = i2;
            if (this.d == 119 && this.a != null) {
                this.a.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.a;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        if (this.a != null) {
            this.a.jumpToCurrentState();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.a != null && this.a.isStateful()) {
            this.a.setState(getDrawableState());
        }
    }

    @Override // android.view.View
    public void setForeground(Drawable drawable) {
        if (this.a != drawable) {
            if (this.a != null) {
                this.a.setCallback(null);
                unscheduleDrawable(this.a);
            }
            this.a = drawable;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.d == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public Drawable getForeground() {
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.aei, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.j |= z;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.j = true;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.a != null) {
            Drawable drawable = this.a;
            if (this.j) {
                this.j = false;
                Rect rect = this.b;
                Rect rect2 = this.c;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                if (this.e) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                Gravity.apply(this.d, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    @TargetApi(21)
    public void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        if (this.a != null) {
            this.a.setHotspot(f, f2);
        }
    }
}

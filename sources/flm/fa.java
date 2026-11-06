package flm;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.support.v7.widget.AppCompatButton;
import android.util.AttributeSet;
import com.google.android.chimeraresources.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fa extends AppCompatButton {
    private final fc b;
    private int c;
    private PorterDuff.Mode d;
    private ColorStateList e;
    private Drawable f;
    private int g;
    private int h;
    private int i;

    public fa(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialButtonStyle);
    }

    private fa(Context context, AttributeSet attributeSet, int i) {
        int colorForState;
        Drawable drawableA;
        int resourceId;
        Drawable drawableB;
        super(context, attributeSet, i);
        TypedArray typedArrayA = fp.a(context, attributeSet, fd.a, i, R.style.Widget_MaterialComponents_Button, new int[0]);
        this.c = typedArrayA.getDimensionPixelSize(fd.k, 0);
        this.d = fq.a(typedArrayA.getInt(fd.n, -1), PorterDuff.Mode.SRC_IN);
        this.e = fw.a(getContext(), typedArrayA, fd.m);
        Context context2 = getContext();
        int i2 = fd.i;
        this.f = (!typedArrayA.hasValue(i2) || (resourceId = typedArrayA.getResourceId(i2, 0)) == 0 || (drawableB = xn.b(context2, resourceId)) == null) ? typedArrayA.getDrawable(i2) : drawableB;
        this.i = typedArrayA.getInteger(fd.j, 1);
        this.g = typedArrayA.getDimensionPixelSize(fd.l, 0);
        this.b = new fc(this);
        fc fcVar = this.b;
        fcVar.c = typedArrayA.getDimensionPixelOffset(fd.c, 0);
        fcVar.d = typedArrayA.getDimensionPixelOffset(fd.d, 0);
        fcVar.e = typedArrayA.getDimensionPixelOffset(fd.e, 0);
        fcVar.f = typedArrayA.getDimensionPixelOffset(fd.b, 0);
        fcVar.g = typedArrayA.getDimensionPixelSize(fd.h, 0);
        fcVar.h = typedArrayA.getDimensionPixelSize(fd.q, 0);
        fcVar.i = fq.a(typedArrayA.getInt(fd.g, -1), PorterDuff.Mode.SRC_IN);
        fcVar.j = fw.a(fcVar.b.getContext(), typedArrayA, fd.f);
        fcVar.k = fw.a(fcVar.b.getContext(), typedArrayA, fd.p);
        fcVar.l = fw.a(fcVar.b.getContext(), typedArrayA, fd.o);
        fcVar.m.setStyle(Paint.Style.STROKE);
        fcVar.m.setStrokeWidth(fcVar.h);
        Paint paint = fcVar.m;
        if (fcVar.k != null) {
            colorForState = fcVar.k.getColorForState(fcVar.b.getDrawableState(), 0);
        } else {
            colorForState = 0;
        }
        paint.setColor(colorForState);
        int iH = ti.h(fcVar.b);
        int paddingTop = fcVar.b.getPaddingTop();
        int i3 = ti.i(fcVar.b);
        int paddingBottom = fcVar.b.getPaddingBottom();
        fa faVar = fcVar.b;
        if (fc.a) {
            fcVar.r = new GradientDrawable();
            fcVar.r.setCornerRadius(fcVar.g + 1.0E-5f);
            fcVar.r.setColor(-1);
            fcVar.a();
            fcVar.s = new GradientDrawable();
            fcVar.s.setCornerRadius(fcVar.g + 1.0E-5f);
            fcVar.s.setColor(0);
            fcVar.s.setStroke(fcVar.h, fcVar.k);
            InsetDrawable insetDrawableA = fcVar.a(new LayerDrawable(new Drawable[]{fcVar.r, fcVar.s}));
            fcVar.t = new GradientDrawable();
            fcVar.t.setCornerRadius(fcVar.g + 1.0E-5f);
            fcVar.t.setColor(-1);
            drawableA = new fb(gb.a(fcVar.l), insetDrawableA, fcVar.t);
        } else {
            fcVar.n = new GradientDrawable();
            fcVar.n.setCornerRadius(fcVar.g + 1.0E-5f);
            fcVar.n.setColor(-1);
            fcVar.o = qc.e(fcVar.n);
            qc.a(fcVar.o, fcVar.j);
            if (fcVar.i != null) {
                qc.a(fcVar.o, fcVar.i);
            }
            fcVar.p = new GradientDrawable();
            fcVar.p.setCornerRadius(fcVar.g + 1.0E-5f);
            fcVar.p.setColor(-1);
            fcVar.q = qc.e(fcVar.p);
            qc.a(fcVar.q, gb.a(fcVar.l));
            drawableA = fcVar.a(new LayerDrawable(new Drawable[]{fcVar.o, fcVar.q}));
        }
        super.setBackgroundDrawable(drawableA);
        ti.a(fcVar.b, iH + fcVar.c, paddingTop + fcVar.e, i3 + fcVar.d, fcVar.f + paddingBottom);
        typedArrayA.recycle();
        setCompoundDrawablePadding(this.c);
        c();
    }

    @Override // android.widget.TextView, android.view.View
    protected final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override // android.support.v7.widget.AppCompatButton
    public final void a(ColorStateList colorStateList) {
        if (d()) {
            fc fcVar = this.b;
            if (fcVar.j != colorStateList) {
                fcVar.j = colorStateList;
                if (fc.a) {
                    fcVar.a();
                    return;
                } else {
                    if (fcVar.o != null) {
                        qc.a(fcVar.o, fcVar.j);
                        return;
                    }
                    return;
                }
            }
            return;
        }
        if (this.b != null) {
            super.a(colorStateList);
        }
    }

    @Override // android.support.v7.widget.AppCompatButton
    public final ColorStateList a() {
        return d() ? this.b.j : super.a();
    }

    @Override // android.support.v7.widget.AppCompatButton
    public final void a(PorterDuff.Mode mode) {
        if (d()) {
            fc fcVar = this.b;
            if (fcVar.i != mode) {
                fcVar.i = mode;
                if (fc.a) {
                    fcVar.a();
                    return;
                } else {
                    if (fcVar.o != null && fcVar.i != null) {
                        qc.a(fcVar.o, fcVar.i);
                        return;
                    }
                    return;
                }
            }
            return;
        }
        if (this.b != null) {
            super.a(mode);
        }
    }

    @Override // android.support.v7.widget.AppCompatButton
    public final PorterDuff.Mode b() {
        return d() ? this.b.i : super.b();
    }

    @Override // android.view.View
    public final void setBackgroundTintList(ColorStateList colorStateList) {
        a(colorStateList);
    }

    @Override // android.view.View
    public final ColorStateList getBackgroundTintList() {
        return a();
    }

    @Override // android.view.View
    public final void setBackgroundTintMode(PorterDuff.Mode mode) {
        a(mode);
    }

    @Override // android.view.View
    public final PorterDuff.Mode getBackgroundTintMode() {
        return b();
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i) {
        if (d()) {
            fc fcVar = this.b;
            if (fc.a && fcVar.r != null) {
                fcVar.r.setColor(i);
                return;
            } else {
                if (!fc.a && fcVar.n != null) {
                    fcVar.n.setColor(i);
                    return;
                }
                return;
            }
        }
        super.setBackgroundColor(i);
    }

    @Override // android.view.View
    public final void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.support.v7.widget.AppCompatButton, android.view.View
    public final void setBackgroundResource(int i) {
        Drawable drawableB = null;
        if (i != 0) {
            drawableB = xn.b(getContext(), i);
        }
        setBackgroundDrawable(drawableB);
    }

    @Override // android.support.v7.widget.AppCompatButton, android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        if (d()) {
            if (drawable != getBackground()) {
                fc fcVar = this.b;
                fcVar.u = true;
                fcVar.b.a(fcVar.j);
                fcVar.b.a(fcVar.i);
                super.setBackgroundDrawable(drawable);
                return;
            }
            getBackground().setState(drawable.getState());
            return;
        }
        super.setBackgroundDrawable(drawable);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v7.widget.AppCompatButton, android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (Build.VERSION.SDK_INT == 21 && this.b != null) {
            fc fcVar = this.b;
            int i5 = i4 - i2;
            int i6 = i3 - i;
            if (fcVar.t != null) {
                fcVar.t.setBounds(fcVar.c, fcVar.e, i6 - fcVar.d, i5 - fcVar.f);
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f != null && this.i == 2) {
            int measuredWidth = (((((getMeasuredWidth() - Math.min((int) getPaint().measureText(getText().toString()), getLayout().getWidth())) - ti.i(this)) - (this.g == 0 ? this.f.getIntrinsicWidth() : this.g)) - this.c) - ti.h(this)) / 2;
            if (ti.f(this) == 1) {
                measuredWidth = -measuredWidth;
            }
            if (this.h != measuredWidth) {
                this.h = measuredWidth;
                c();
            }
        }
    }

    private final void c() {
        if (this.f != null) {
            this.f = qc.e(this.f).mutate();
            qc.a(this.f, this.e);
            if (this.d != null) {
                qc.a(this.f, this.d);
            }
            this.f.setBounds(this.h, 0, (this.g != 0 ? this.g : this.f.getIntrinsicWidth()) + this.h, this.g != 0 ? this.g : this.f.getIntrinsicHeight());
        }
        vc.a(this, this.f, null, null, null);
    }

    private final boolean d() {
        return (this.b == null || this.b.u) ? false : true;
    }
}

package com.android.setupwizardlib.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import flm.aio;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class Illustration extends FrameLayout {
    public float a;
    private float b;
    private Drawable c;
    private Drawable d;
    private final Rect e;
    private final Rect f;
    private float g;

    public Illustration(Context context) {
        super(context);
        this.e = new Rect();
        this.f = new Rect();
        this.g = 1.0f;
        this.a = 0.0f;
        a((AttributeSet) null, 0);
    }

    public Illustration(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = new Rect();
        this.f = new Rect();
        this.g = 1.0f;
        this.a = 0.0f;
        a(attributeSet, 0);
    }

    @TargetApi(11)
    public Illustration(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.e = new Rect();
        this.f = new Rect();
        this.g = 1.0f;
        this.a = 0.0f;
        a(attributeSet, i);
    }

    private final void a(AttributeSet attributeSet, int i) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, aio.B, i, 0);
            this.a = typedArrayObtainStyledAttributes.getFloat(aio.C, 0.0f);
            typedArrayObtainStyledAttributes.recycle();
        }
        this.b = getResources().getDisplayMetrics().density * 8.0f;
        setWillNotDraw(false);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable != this.c) {
            this.c = drawable;
            invalidate();
            requestLayout();
        }
    }

    public final void a(Drawable drawable) {
        if (drawable != this.d) {
            this.d = drawable;
            invalidate();
            requestLayout();
        }
    }

    @Override // android.view.View
    @Deprecated
    public void setForeground(Drawable drawable) {
        a(drawable);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        if (this.a != 0.0f) {
            int size = (int) (View.MeasureSpec.getSize(i) / this.a);
            setPadding(0, (int) (size - (size % this.b)), 0, 0);
        }
        setOutlineProvider(ViewOutlineProvider.BOUNDS);
        super.onMeasure(i, i2);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = i3 - i;
        int i6 = i4 - i2;
        if (this.d != null) {
            int intrinsicWidth = this.d.getIntrinsicWidth();
            int intrinsicHeight = this.d.getIntrinsicHeight();
            this.e.set(0, 0, i5, i6);
            if (this.a != 0.0f) {
                this.g = i5 / intrinsicWidth;
                intrinsicHeight = (int) (intrinsicHeight * this.g);
                intrinsicWidth = i5;
            }
            Gravity.apply(55, intrinsicWidth, intrinsicHeight, this.e, this.f);
            this.d.setBounds(this.f);
        }
        if (this.c != null) {
            this.c.setBounds(0, 0, (int) Math.ceil(i5 / this.g), (int) Math.ceil((i6 - this.f.height()) / this.g));
        }
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (this.c != null) {
            canvas.save();
            canvas.translate(0.0f, this.f.height());
            canvas.scale(this.g, this.g, 0.0f, 0.0f);
            if (a(this.c, getLayoutDirection())) {
                canvas.scale(-1.0f, 1.0f);
                canvas.translate(-this.c.getBounds().width(), 0.0f);
            }
            this.c.draw(canvas);
            canvas.restore();
        }
        if (this.d != null) {
            canvas.save();
            if (a(this.d, getLayoutDirection())) {
                canvas.scale(-1.0f, 1.0f);
                canvas.translate(-this.f.width(), 0.0f);
            }
            this.d.draw(canvas);
            canvas.restore();
        }
        super.onDraw(canvas);
    }

    private final boolean a(Drawable drawable, int i) {
        if (i == 1) {
            return drawable.isAutoMirrored();
        }
        return false;
    }
}

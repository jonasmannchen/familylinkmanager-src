package flm;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class acr extends FrameLayout {
    private static final int[] g = {R.attr.colorBackground};
    private static final acv h = new act();
    public boolean a;
    public boolean b;
    public int c;
    public int d;
    public final Rect e;
    public final Rect f;
    private final acu i;

    public acr(Context context) {
        this(context, null);
    }

    private acr(Context context, AttributeSet attributeSet) {
        this(context, null, com.google.android.chimeraresources.R.attr.cardViewStyle);
    }

    private acr(Context context, AttributeSet attributeSet, int i) {
        int color;
        ColorStateList colorStateListValueOf;
        super(context, attributeSet, i);
        this.e = new Rect();
        this.f = new Rect();
        this.i = new acs(this);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, xm.a, i, com.google.android.chimeraresources.R.style.CardView);
        if (typedArrayObtainStyledAttributes.hasValue(xm.d)) {
            colorStateListValueOf = typedArrayObtainStyledAttributes.getColorStateList(xm.d);
        } else {
            TypedArray typedArrayObtainStyledAttributes2 = getContext().obtainStyledAttributes(g);
            int color2 = typedArrayObtainStyledAttributes2.getColor(0, 0);
            typedArrayObtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color2, fArr);
            if (fArr[2] > 0.5f) {
                color = getResources().getColor(com.google.android.chimeraresources.R.color.cardview_light_background);
            } else {
                color = getResources().getColor(com.google.android.chimeraresources.R.color.cardview_dark_background);
            }
            colorStateListValueOf = ColorStateList.valueOf(color);
        }
        float dimension = typedArrayObtainStyledAttributes.getDimension(xm.e, 0.0f);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(xm.f, 0.0f);
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(xm.g, 0.0f);
        this.a = typedArrayObtainStyledAttributes.getBoolean(xm.i, false);
        this.b = typedArrayObtainStyledAttributes.getBoolean(xm.h, true);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(xm.j, 0);
        this.e.left = typedArrayObtainStyledAttributes.getDimensionPixelSize(xm.l, dimensionPixelSize);
        this.e.top = typedArrayObtainStyledAttributes.getDimensionPixelSize(xm.n, dimensionPixelSize);
        this.e.right = typedArrayObtainStyledAttributes.getDimensionPixelSize(xm.m, dimensionPixelSize);
        this.e.bottom = typedArrayObtainStyledAttributes.getDimensionPixelSize(xm.k, dimensionPixelSize);
        dimension3 = dimension2 > dimension3 ? dimension2 : dimension3;
        this.c = typedArrayObtainStyledAttributes.getDimensionPixelSize(xm.c, 0);
        this.d = typedArrayObtainStyledAttributes.getDimensionPixelSize(xm.b, 0);
        typedArrayObtainStyledAttributes.recycle();
        h.a(this.i, context, colorStateListValueOf, dimension, dimension2, dimension3);
    }

    @Override // android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public void setPaddingRelative(int i, int i2, int i3, int i4) {
    }

    public final void a(boolean z) {
        if (!this.a) {
            this.a = true;
            h.c(this.i);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        if (!(h instanceof act)) {
            int mode = View.MeasureSpec.getMode(i);
            switch (mode) {
                case Integer.MIN_VALUE:
                case 1073741824:
                    i = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(h.a(this.i)), View.MeasureSpec.getSize(i)), mode);
                    break;
            }
            int mode2 = View.MeasureSpec.getMode(i2);
            switch (mode2) {
                case Integer.MIN_VALUE:
                case 1073741824:
                    i2 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(h.b(this.i)), View.MeasureSpec.getSize(i2)), mode2);
                    break;
            }
            super.onMeasure(i, i2);
            return;
        }
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i) {
        this.c = i;
        super.setMinimumWidth(i);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i) {
        this.d = i;
        super.setMinimumHeight(i);
    }

    public final void a(float f) {
        h.a(this.i, f);
    }

    public final void b(float f) {
        h.b(this.i, f);
    }
}

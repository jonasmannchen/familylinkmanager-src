package com.android.setupwizardlib.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import flm.aio;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class IntrinsicSizeFrameLayout extends FrameLayout {
    private int a;
    private int b;

    public IntrinsicSizeFrameLayout(Context context) {
        super(context);
        this.a = 0;
        this.b = 0;
        a(context, null, 0);
    }

    public IntrinsicSizeFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = 0;
        this.b = 0;
        a(context, attributeSet, 0);
    }

    @TargetApi(11)
    public IntrinsicSizeFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = 0;
        this.b = 0;
        a(context, attributeSet, i);
    }

    private final void a(Context context, AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, aio.D, i, 0);
        this.a = typedArrayObtainStyledAttributes.getDimensionPixelSize(aio.E, 0);
        this.b = typedArrayObtainStyledAttributes.getDimensionPixelSize(aio.F, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(a(i, this.b), a(i2, this.a));
    }

    private final int a(int i, int i2) {
        if (i2 > 0) {
            int mode = View.MeasureSpec.getMode(i);
            int size = View.MeasureSpec.getSize(i);
            if (mode == 0) {
                return View.MeasureSpec.makeMeasureSpec(this.a, 1073741824);
            }
            if (mode == Integer.MIN_VALUE) {
                return View.MeasureSpec.makeMeasureSpec(Math.min(size, this.a), 1073741824);
            }
            return i;
        }
        return i;
    }
}

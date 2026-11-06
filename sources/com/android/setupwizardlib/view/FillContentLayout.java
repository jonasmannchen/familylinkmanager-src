package com.android.setupwizardlib.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.chimeraresources.R;
import flm.aio;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class FillContentLayout extends FrameLayout {
    private int a;
    private int b;

    public FillContentLayout(Context context) {
        this(context, null);
    }

    public FillContentLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.suwFillContentLayoutStyle);
    }

    public FillContentLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, aio.l, i, 0);
        this.b = typedArrayObtainStyledAttributes.getDimensionPixelSize(aio.m, -1);
        this.a = typedArrayObtainStyledAttributes.getDimensionPixelSize(aio.n, -1);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        setMeasuredDimension(getDefaultSize(getSuggestedMinimumWidth(), i), getDefaultSize(getSuggestedMinimumHeight(), i2));
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
            childAt.measure(a(Math.min(this.a, measuredWidth), getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin, marginLayoutParams.width), a(Math.min(this.b, measuredHeight), getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height));
        }
    }

    private static int a(int i, int i2, int i3) {
        int iMax = Math.max(0, i - i2);
        if (i3 >= 0) {
            return View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
        }
        if (i3 == -1) {
            return View.MeasureSpec.makeMeasureSpec(iMax, 1073741824);
        }
        if (i3 == -2) {
            return View.MeasureSpec.makeMeasureSpec(iMax, Integer.MIN_VALUE);
        }
        return 0;
    }
}

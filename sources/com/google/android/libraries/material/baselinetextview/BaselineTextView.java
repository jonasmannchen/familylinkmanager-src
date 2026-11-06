package com.google.android.libraries.material.baselinetextview;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;
import flm.dfl;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class BaselineTextView extends TextView {
    public BaselineTextView(Context context) {
        super(context);
    }

    public BaselineTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    public BaselineTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attributeSet, dfl.a, 0, 0);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(dfl.c, -1);
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(dfl.b, -1);
        int dimensionPixelSize3 = typedArrayObtainStyledAttributes.getDimensionPixelSize(dfl.d, -1);
        typedArrayObtainStyledAttributes.recycle();
        int fontMetricsInt = getPaint().getFontMetricsInt(null);
        if (dimensionPixelSize3 >= 0 && dimensionPixelSize3 != fontMetricsInt) {
            setLineSpacing(dimensionPixelSize3 - fontMetricsInt, 1.0f);
        }
        a(dimensionPixelSize, dimensionPixelSize2);
    }

    public final void a(int i, int i2) {
        int i3;
        boolean z;
        int i4;
        boolean z2 = true;
        int iRound = getPaint().getFontMetricsInt().top;
        int iRound2 = getPaint().getFontMetricsInt().bottom;
        if (!getIncludeFontPadding()) {
            iRound = getPaint().getFontMetricsInt().ascent;
            iRound2 = getPaint().getFontMetricsInt().descent;
        }
        float f = getContext().getResources().getDisplayMetrics().density / getContext().getResources().getDisplayMetrics().scaledDensity;
        if (f != 1.0f) {
            iRound = Math.round(iRound * f);
            iRound2 = Math.round(iRound2 * f);
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        if (i <= Math.abs(iRound)) {
            i3 = paddingTop;
            z = false;
        } else {
            i3 = i - (-iRound);
            z = true;
        }
        if (i2 > Math.abs(iRound2)) {
            i4 = i2 - iRound2;
        } else {
            i4 = paddingBottom;
            z2 = z;
        }
        if (z2) {
            setPadding(getPaddingLeft(), i3, getPaddingRight(), i4);
        }
    }
}

package com.android.setupwizardlib.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.chimeraresources.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class ButtonBarLayout extends LinearLayout {
    private boolean a;
    private int b;
    private int c;

    public ButtonBarLayout(Context context) {
        super(context);
        this.a = false;
    }

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = false;
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        boolean z;
        int iMakeMeasureSpec;
        boolean z2 = true;
        int size = View.MeasureSpec.getSize(i);
        a(false);
        if (View.MeasureSpec.getMode(i) == 1073741824) {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            z = true;
        } else {
            z = false;
            iMakeMeasureSpec = i;
        }
        super.onMeasure(iMakeMeasureSpec, i2);
        if (getMeasuredWidth() > size) {
            a(true);
        } else {
            z2 = z;
        }
        if (z2) {
            super.onMeasure(i, i2);
        }
    }

    private final void a(boolean z) {
        if (this.a != z) {
            this.a = z;
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = getChildAt(i);
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
                if (z) {
                    childAt.setTag(R.id.suw_original_weight, Float.valueOf(layoutParams.weight));
                    layoutParams.weight = 0.0f;
                } else {
                    Float f = (Float) childAt.getTag(R.id.suw_original_weight);
                    if (f != null) {
                        layoutParams.weight = f.floatValue();
                    }
                }
                childAt.setLayoutParams(layoutParams);
            }
            setOrientation(z ? 1 : 0);
            for (int i2 = childCount - 1; i2 >= 0; i2--) {
                bringChildToFront(getChildAt(i2));
            }
            if (z) {
                this.b = getPaddingLeft();
                this.c = getPaddingRight();
                int iMax = Math.max(this.b, this.c);
                setPadding(iMax, getPaddingTop(), iMax, getPaddingBottom());
                return;
            }
            setPadding(this.b, getPaddingTop(), this.c, getPaddingBottom());
        }
    }
}

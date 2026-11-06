package android.support.design.snackbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.chimeraresources.R;
import flm.gx;
import flm.gy;
import flm.ti;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class SnackbarContentLayout extends LinearLayout implements gx {
    public TextView a;
    private Button b;
    private int c;
    private int d;

    public SnackbarContentLayout(Context context) {
        this(context, null);
    }

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, gy.a);
        this.c = typedArrayObtainStyledAttributes.getDimensionPixelSize(gy.b, -1);
        this.d = typedArrayObtainStyledAttributes.getDimensionPixelSize(gy.e, -1);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.a = (TextView) findViewById(R.id.snackbar_text);
        this.b = (Button) findViewById(R.id.snackbar_action);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x006c  */
    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        boolean z;
        super.onMeasure(i, i2);
        if (this.c > 0 && getMeasuredWidth() > this.c) {
            i = View.MeasureSpec.makeMeasureSpec(this.c, 1073741824);
            super.onMeasure(i, i2);
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical_2lines);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical);
        boolean z2 = this.a.getLayout().getLineCount() > 1;
        if (z2 && this.d > 0 && this.b.getMeasuredWidth() > this.d) {
            if (a(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
                z = true;
            } else {
                z = false;
            }
        } else {
            if (!z2) {
                dimensionPixelSize = dimensionPixelSize2;
            }
            if (a(0, dimensionPixelSize, dimensionPixelSize)) {
                z = true;
            } else {
                z = false;
            }
        }
        if (z) {
            super.onMeasure(i, i2);
        }
    }

    private final boolean a(int i, int i2, int i3) {
        boolean z = false;
        if (i != getOrientation()) {
            setOrientation(i);
            z = true;
        }
        if (this.a.getPaddingTop() != i2 || this.a.getPaddingBottom() != i3) {
            TextView textView = this.a;
            if (ti.r(textView)) {
                ti.a(textView, ti.h(textView), i2, ti.i(textView), i3);
            } else {
                textView.setPadding(textView.getPaddingLeft(), i2, textView.getPaddingRight(), i3);
            }
            return true;
        }
        return z;
    }

    @Override // flm.gx
    public final void a(int i, int i2) {
        this.a.setAlpha(0.0f);
        this.a.animate().alpha(1.0f).setDuration(180L).setStartDelay(70L).start();
        if (this.b.getVisibility() == 0) {
            this.b.setAlpha(0.0f);
            this.b.animate().alpha(1.0f).setDuration(180L).setStartDelay(70L).start();
        }
    }

    @Override // flm.gx
    public final void b(int i, int i2) {
        this.a.setAlpha(1.0f);
        this.a.animate().alpha(0.0f).setDuration(180L).setStartDelay(0L).start();
        if (this.b.getVisibility() == 0) {
            this.b.setAlpha(1.0f);
            this.b.animate().alpha(0.0f).setDuration(180L).setStartDelay(0L).start();
        }
    }
}

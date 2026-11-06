package flm;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class gv extends FrameLayout {
    private static final View.OnTouchListener d = new gw();
    public gu a;
    public gt b;
    public int c;

    public gv(Context context) {
        this(context, null);
    }

    public gv(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, gy.a);
        if (typedArrayObtainStyledAttributes.hasValue(gy.d)) {
            ti.a(this, typedArrayObtainStyledAttributes.getDimensionPixelSize(gy.d, 0));
        }
        this.c = typedArrayObtainStyledAttributes.getInt(gy.c, 0);
        typedArrayObtainStyledAttributes.recycle();
        setOnTouchListener(d);
        setFocusable(true);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        setOnTouchListener(onClickListener != null ? null : d);
        super.setOnClickListener(onClickListener);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.a != null) {
            this.a.a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.b != null) {
            this.b.a();
        }
        ti.o(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.b != null) {
            this.b.b();
        }
    }
}

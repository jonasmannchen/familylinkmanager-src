package com.android.setupwizardlib.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import flm.aio;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class StatusBarBackgroundLayout extends FrameLayout {
    private Drawable a;
    private Object b;

    public StatusBarBackgroundLayout(Context context) {
        super(context);
        a(context, null, 0);
    }

    public StatusBarBackgroundLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context, attributeSet, 0);
    }

    @TargetApi(11)
    public StatusBarBackgroundLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context, attributeSet, i);
    }

    private final void a(Context context, AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, aio.V, i, 0);
        a(typedArrayObtainStyledAttributes.getDrawable(aio.W));
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.b == null) {
            requestApplyInsets();
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        int systemWindowInsetTop;
        super.onDraw(canvas);
        if (this.b != null && (systemWindowInsetTop = ((WindowInsets) this.b).getSystemWindowInsetTop()) > 0) {
            this.a.setBounds(0, 0, getWidth(), systemWindowInsetTop);
            this.a.draw(canvas);
        }
    }

    public final void a(Drawable drawable) {
        this.a = drawable;
        setWillNotDraw(drawable == null);
        setFitsSystemWindows(drawable != null);
        invalidate();
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        this.b = windowInsets;
        return super.onApplyWindowInsets(windowInsets);
    }
}

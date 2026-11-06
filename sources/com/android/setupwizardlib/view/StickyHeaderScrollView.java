package com.android.setupwizardlib.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class StickyHeaderScrollView extends BottomScrollView {
    private View a;
    private View b;
    private int c;

    public StickyHeaderScrollView(Context context) {
        super(context);
        this.c = 0;
    }

    public StickyHeaderScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = 0;
    }

    public StickyHeaderScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = 0;
    }

    @Override // com.android.setupwizardlib.view.BottomScrollView, android.widget.ScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.a == null) {
            this.a = findViewWithTag("sticky");
            this.b = findViewWithTag("stickyContainer");
        }
        a();
    }

    private final void a() {
        if (this.a != null) {
            View view = this.b != null ? this.b : this.a;
            int top = this.b != null ? this.a.getTop() : 0;
            if ((view.getTop() - getScrollY()) + top < this.c || !view.isShown()) {
                view.setTranslationY(getScrollY() - top);
            } else {
                view.setTranslationY(0.0f);
            }
        }
    }

    @Override // com.android.setupwizardlib.view.BottomScrollView, android.view.View
    protected void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        a();
    }

    @Override // android.view.View
    @TargetApi(21)
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        if (getFitsSystemWindows()) {
            this.c = windowInsets.getSystemWindowInsetTop();
            return windowInsets.replaceSystemWindowInsets(windowInsets.getSystemWindowInsetLeft(), 0, windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return windowInsets;
    }
}

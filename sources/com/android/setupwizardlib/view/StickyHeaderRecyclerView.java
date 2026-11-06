package com.android.setupwizardlib.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class StickyHeaderRecyclerView extends HeaderRecyclerView {
    private View N;
    private int O;
    private final RectF P;

    public StickyHeaderRecyclerView(Context context) {
        super(context);
        this.O = 0;
        this.P = new RectF();
    }

    public StickyHeaderRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.O = 0;
        this.P = new RectF();
    }

    public StickyHeaderRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.O = 0;
        this.P = new RectF();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v7.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View view;
        View view2;
        super.onLayout(z, i, i2, i3, i4);
        if (this.N == null && (view2 = this.M) != null) {
            this.N = view2.findViewWithTag("sticky");
        }
        if (this.N != null && (view = this.M) != null && view.getHeight() == 0) {
            view.layout(0, -view.getMeasuredHeight(), view.getMeasuredWidth(), 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v7.widget.RecyclerView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.N != null) {
            measureChild(this.M, i, i2);
        }
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.N != null) {
            View view = this.M;
            int iSave = canvas.save();
            View view2 = view != null ? view : this.N;
            int top = view != null ? this.N.getTop() : 0;
            if (view2.getTop() + top < this.O || !view2.isShown()) {
                this.P.set(0.0f, (-top) + this.O, view2.getWidth(), (view2.getHeight() - top) + this.O);
                canvas.translate(0.0f, this.P.top);
                canvas.clipRect(0, 0, view2.getWidth(), view2.getHeight());
                view2.draw(canvas);
            } else {
                this.P.setEmpty();
            }
            canvas.restoreToCount(iSave);
        }
    }

    @Override // android.view.View
    @TargetApi(21)
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        if (getFitsSystemWindows()) {
            this.O = windowInsets.getSystemWindowInsetTop();
            windowInsets.replaceSystemWindowInsets(windowInsets.getSystemWindowInsetLeft(), 0, windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!this.P.contains(motionEvent.getX(), motionEvent.getY())) {
            return super.dispatchTouchEvent(motionEvent);
        }
        motionEvent.offsetLocation(-this.P.left, -this.P.top);
        return this.M.dispatchTouchEvent(motionEvent);
    }
}

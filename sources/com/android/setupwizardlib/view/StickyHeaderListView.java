package com.android.setupwizardlib.view;

import android.R;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.widget.ListView;
import flm.aio;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class StickyHeaderListView extends ListView {
    private View a;
    private View b;
    private int c;
    private final RectF d;

    public StickyHeaderListView(Context context) {
        super(context);
        this.c = 0;
        this.d = new RectF();
        a(null, R.attr.listViewStyle);
    }

    public StickyHeaderListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = 0;
        this.d = new RectF();
        a(attributeSet, R.attr.listViewStyle);
    }

    public StickyHeaderListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = 0;
        this.d = new RectF();
        a(attributeSet, i);
    }

    private final void a(AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, aio.X, i, 0);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(aio.Y, 0);
        if (resourceId != 0) {
            addHeaderView(LayoutInflater.from(getContext()).inflate(resourceId, (ViewGroup) this, false), null, false);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.a == null) {
            this.a = findViewWithTag("sticky");
            this.b = findViewWithTag("stickyContainer");
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!this.d.contains(motionEvent.getX(), motionEvent.getY())) {
            return super.dispatchTouchEvent(motionEvent);
        }
        motionEvent.offsetLocation(-this.d.left, -this.d.top);
        return this.b.dispatchTouchEvent(motionEvent);
    }

    @Override // android.widget.AbsListView, android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.a != null) {
            int iSave = canvas.save();
            View view = this.b != null ? this.b : this.a;
            int top = this.b != null ? this.a.getTop() : 0;
            if (view.getTop() + top < this.c || !view.isShown()) {
                this.d.set(0.0f, (-top) + this.c, view.getWidth(), (view.getHeight() - top) + this.c);
                canvas.translate(0.0f, this.d.top);
                canvas.clipRect(0, 0, view.getWidth(), view.getHeight());
                view.draw(canvas);
            } else {
                this.d.setEmpty();
            }
            canvas.restoreToCount(iSave);
        }
    }

    @Override // android.view.View
    @TargetApi(21)
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        if (getFitsSystemWindows()) {
            this.c = windowInsets.getSystemWindowInsetTop();
            windowInsets.replaceSystemWindowInsets(windowInsets.getSystemWindowInsetLeft(), 0, windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return windowInsets;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        int i = this.a != null ? 1 : 0;
        accessibilityEvent.setItemCount(accessibilityEvent.getItemCount() - i);
        accessibilityEvent.setFromIndex(Math.max(accessibilityEvent.getFromIndex() - i, 0));
        accessibilityEvent.setToIndex(Math.max(accessibilityEvent.getToIndex() - i, 0));
    }
}

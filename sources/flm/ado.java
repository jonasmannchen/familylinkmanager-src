package flm;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.google.android.chimeraresources.R;
import java.lang.reflect.Field;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
class ado extends ListView {
    public boolean a;
    public adq b;
    private final Rect c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private Field i;
    private adp j;
    private boolean k;
    private boolean l;
    private uv m;

    ado(Context context, boolean z) {
        super(context, null, R.attr.dropDownListViewStyle);
        this.c = new Rect();
        this.d = 0;
        this.e = 0;
        this.f = 0;
        this.g = 0;
        this.k = z;
        setCacheColorHint(0);
        try {
            this.i = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            this.i.setAccessible(true);
        } catch (NoSuchFieldException e) {
            ehh.a.a(e);
        }
    }

    @Override // android.view.View
    public boolean isInTouchMode() {
        return (this.k && this.a) || super.isInTouchMode();
    }

    @Override // android.view.View
    public boolean hasWindowFocus() {
        return this.k || super.hasWindowFocus();
    }

    @Override // android.view.View
    public boolean isFocused() {
        return this.k || super.isFocused();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean hasFocus() {
        return this.k || super.hasFocus();
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        this.j = drawable != null ? new adp(drawable) : null;
        super.setSelector(this.j);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.d = rect.left;
        this.e = rect.top;
        this.f = rect.right;
        this.g = rect.bottom;
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        if (this.b == null) {
            super.drawableStateChanged();
            a(true);
            a();
        }
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        Drawable selector;
        if (!this.c.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(this.c);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (motionEvent.getAction()) {
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
                this.h = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
                break;
        }
        if (this.b != null) {
            adq adqVar = this.b;
            adqVar.a.b = null;
            adqVar.a.removeCallbacks(adqVar);
        }
        return super.onTouchEvent(motionEvent);
    }

    public int a(int i, int i2, int i3, int i4, int i5) {
        View view;
        int iMakeMeasureSpec;
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        getListPaddingLeft();
        getListPaddingRight();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int measuredHeight = listPaddingBottom + listPaddingTop;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int i6 = 0;
        View view2 = null;
        int i7 = 0;
        int count = adapter.getCount();
        int i8 = 0;
        while (i8 < count) {
            int itemViewType = adapter.getItemViewType(i8);
            if (itemViewType != i7) {
                view = null;
                i7 = itemViewType;
            } else {
                view = view2;
            }
            view2 = adapter.getView(i8, view, this);
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view2.setLayoutParams(layoutParams);
            }
            if (layoutParams.height > 0) {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(layoutParams.height, 1073741824);
            } else {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            }
            view2.measure(i, iMakeMeasureSpec);
            view2.forceLayout();
            measuredHeight = view2.getMeasuredHeight() + (i8 > 0 ? measuredHeight + dividerHeight : measuredHeight);
            if (measuredHeight >= i4) {
                return (i5 < 0 || i8 <= i5 || i6 <= 0 || measuredHeight == i4) ? i4 : i6;
            }
            int i9 = (i5 < 0 || i8 < i5) ? i6 : measuredHeight;
            i8++;
            i6 = i9;
        }
        return measuredHeight;
    }

    private final void a(boolean z) {
        if (this.j != null) {
            this.j.b = z;
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        if (Build.VERSION.SDK_INT < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.b == null) {
            this.b = new adq(this);
            adq adqVar = this.b;
            adqVar.a.post(adqVar);
        }
        boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (iPointToPosition != -1 && iPointToPosition != getSelectedItemPosition()) {
                View childAt = getChildAt(iPointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    setSelectionFromTop(iPointToPosition, childAt.getTop() - getTop());
                }
                a();
                return zOnHoverEvent;
            }
            return zOnHoverEvent;
        }
        setSelection(-1);
        return zOnHoverEvent;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        this.b = null;
        super.onDetachedFromWindow();
    }

    /* JADX WARN: Code duplicated, block: B:20:0x004a  */
    /* JADX WARN: Code duplicated, block: B:21:0x004d  */
    /* JADX WARN: Code duplicated, block: B:23:0x005d  */
    /* JADX WARN: Code duplicated, block: B:24:0x0060  */
    /* JADX WARN: Code duplicated, block: B:26:0x0077  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:46:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:56:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:57:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:58:0x00fd  */
    public boolean a(MotionEvent motionEvent, int i) {
        boolean z;
        int iFindPointerIndex;
        int x;
        int y;
        int iPointToPosition;
        View childAt;
        float f;
        float f2;
        Drawable selector;
        boolean z2;
        Drawable selector2;
        boolean z3;
        View childAt2;
        boolean z4;
        boolean z5;
        int actionMasked = motionEvent.getActionMasked();
        switch (actionMasked) {
            case 1:
                z = false;
                iFindPointerIndex = motionEvent.findPointerIndex(i);
                if (iFindPointerIndex < 0) {
                    x = (int) motionEvent.getX(iFindPointerIndex);
                    y = (int) motionEvent.getY(iFindPointerIndex);
                    iPointToPosition = pointToPosition(x, y);
                    if (iPointToPosition == -1) {
                        childAt = getChildAt(iPointToPosition - getFirstVisiblePosition());
                        f = x;
                        f2 = y;
                        this.l = true;
                        drawableHotspotChanged(f, f2);
                        if (!isPressed()) {
                            setPressed(true);
                        }
                        layoutChildren();
                        if (this.h != -1 && (childAt2 = getChildAt(this.h - getFirstVisiblePosition())) != null && childAt2 != childAt && childAt2.isPressed()) {
                            childAt2.setPressed(false);
                        }
                        this.h = iPointToPosition;
                        childAt.drawableHotspotChanged(f - childAt.getLeft(), f2 - childAt.getTop());
                        if (!childAt.isPressed()) {
                            childAt.setPressed(true);
                        }
                        selector = getSelector();
                        if (selector != null || iPointToPosition == -1) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        if (z2) {
                            selector.setVisible(false, false);
                        }
                        a(iPointToPosition, childAt);
                        if (z2) {
                            Rect rect = this.c;
                            float fExactCenterX = rect.exactCenterX();
                            float fExactCenterY = rect.exactCenterY();
                            if (getVisibility() == 0) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            selector.setVisible(z3, false);
                            qc.a(selector, fExactCenterX, fExactCenterY);
                        }
                        selector2 = getSelector();
                        if (selector2 != null && iPointToPosition != -1) {
                            qc.a(selector2, f, f2);
                        }
                        a(false);
                        refreshDrawableState();
                        if (actionMasked == 1) {
                            performItemClick(childAt, iPointToPosition, getItemIdAtPosition(iPointToPosition));
                        }
                        z5 = false;
                        z4 = true;
                    } else {
                        z4 = z;
                        z5 = true;
                    }
                } else {
                    z5 = false;
                    z4 = false;
                }
                break;
            case 2:
                z = true;
                iFindPointerIndex = motionEvent.findPointerIndex(i);
                if (iFindPointerIndex < 0) {
                    x = (int) motionEvent.getX(iFindPointerIndex);
                    y = (int) motionEvent.getY(iFindPointerIndex);
                    iPointToPosition = pointToPosition(x, y);
                    if (iPointToPosition == -1) {
                        childAt = getChildAt(iPointToPosition - getFirstVisiblePosition());
                        f = x;
                        f2 = y;
                        this.l = true;
                        drawableHotspotChanged(f, f2);
                        if (!isPressed()) {
                            setPressed(true);
                        }
                        layoutChildren();
                        if (this.h != -1) {
                            childAt2.setPressed(false);
                        }
                        this.h = iPointToPosition;
                        childAt.drawableHotspotChanged(f - childAt.getLeft(), f2 - childAt.getTop());
                        if (!childAt.isPressed()) {
                            childAt.setPressed(true);
                        }
                        selector = getSelector();
                        if (selector != null) {
                            z2 = false;
                        } else {
                            z2 = false;
                        }
                        if (z2) {
                            selector.setVisible(false, false);
                        }
                        a(iPointToPosition, childAt);
                        if (z2) {
                            Rect rect2 = this.c;
                            float fExactCenterX2 = rect2.exactCenterX();
                            float fExactCenterY2 = rect2.exactCenterY();
                            if (getVisibility() == 0) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            selector.setVisible(z3, false);
                            qc.a(selector, fExactCenterX2, fExactCenterY2);
                        }
                        selector2 = getSelector();
                        if (selector2 != null) {
                            qc.a(selector2, f, f2);
                        }
                        a(false);
                        refreshDrawableState();
                        if (actionMasked == 1) {
                            performItemClick(childAt, iPointToPosition, getItemIdAtPosition(iPointToPosition));
                        }
                        z5 = false;
                        z4 = true;
                    } else {
                        z4 = z;
                        z5 = true;
                    }
                } else {
                    z5 = false;
                    z4 = false;
                }
                break;
            case 3:
                z5 = false;
                z4 = false;
                break;
            default:
                z5 = false;
                z4 = true;
                break;
        }
        if (!z4 || z5) {
            this.l = false;
            setPressed(false);
            drawableStateChanged();
            View childAt3 = getChildAt(this.h - getFirstVisiblePosition());
            if (childAt3 != null) {
                childAt3.setPressed(false);
            }
        }
        if (z4) {
            if (this.m == null) {
                this.m = new uv(this);
            }
            this.m.a(true);
            this.m.onTouch(this, motionEvent);
        } else if (this.m != null) {
            this.m.a(false);
        }
        return z4;
    }

    private final void a() {
        Drawable selector = getSelector();
        if (selector != null && this.l && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    private final void a(int i, View view) {
        Rect rect = this.c;
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        rect.left -= this.d;
        rect.top -= this.e;
        rect.right += this.f;
        rect.bottom += this.g;
        try {
            boolean z = this.i.getBoolean(this);
            if (view.isEnabled() != z) {
                this.i.set(this, Boolean.valueOf(!z));
                if (i != -1) {
                    refreshDrawableState();
                }
            }
        } catch (IllegalAccessException e) {
            ehh.a.a(e);
        }
    }
}

package android.support.v4.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import flm.bbx;
import flm.td;
import flm.tf;
import flm.tg;
import flm.ti;
import flm.uq;
import flm.uw;
import flm.ux;
import flm.uy;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements tf {
    private static final uw x = new uw();
    private static final int[] y = {R.attr.fillViewport};
    private final td A;
    private float B;
    public ux a;
    private long b;
    private final Rect c;
    private OverScroller d;
    private EdgeEffect e;
    private EdgeEffect f;
    private int g;
    private boolean h;
    private boolean i;
    private View j;
    private boolean k;
    private VelocityTracker l;
    private boolean m;
    private boolean n;
    private int o;
    private int p;
    private int q;
    private int r;
    private final int[] s;
    private final int[] t;
    private int u;
    private int v;
    private uy w;
    private final tg z;

    public NestedScrollView(Context context) {
        this(context, null);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = new Rect();
        this.h = true;
        this.i = false;
        this.j = null;
        this.k = false;
        this.n = true;
        this.r = -1;
        this.s = new int[2];
        this.t = new int[2];
        this.d = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.o = viewConfiguration.getScaledTouchSlop();
        this.p = viewConfiguration.getScaledMinimumFlingVelocity();
        this.q = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, y, i, 0);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(0, false);
        if (z != this.m) {
            this.m = z;
            requestLayout();
        }
        typedArrayObtainStyledAttributes.recycle();
        this.z = new tg();
        this.A = new td(this);
        setNestedScrollingEnabled(true);
        ti.a(this, x);
    }

    private final void a(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        this.A.a(0, i2, 0, i4, iArr, i5, iArr2);
    }

    private final boolean b(int i, int i2) {
        return this.A.a(i, i2);
    }

    public final void a(int i) {
        this.A.b(i);
    }

    private final boolean b(int i) {
        return this.A.a(i);
    }

    private final boolean a(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return this.A.a(i, i2, iArr, iArr2, i3);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        this.A.a(z);
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.A.a;
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i) {
        return b(i, 0);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        a(0);
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return b(0);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.A.a(i, i2, i3, i4, iArr);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return a(i, i2, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.A.a(f, f2, z);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f, float f2) {
        return this.A.a(f, f2);
    }

    @Override // flm.tf
    public final void a(int i, int i2, int[] iArr) {
        b(i, i2, iArr);
    }

    private final void b(int i, int i2, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.A.a(0, scrollY2, 0, i - scrollY2, null, i2, iArr);
    }

    @Override // flm.te
    public final boolean a(View view, View view2, int i, int i2) {
        return (i & 2) != 0;
    }

    @Override // flm.te
    public final void b(View view, View view2, int i, int i2) {
        this.z.a(i, i2);
        b(2, i2);
    }

    @Override // flm.te
    public final void b(View view, int i) {
        this.z.a(i);
        a(i);
    }

    @Override // flm.te
    public final void a(View view, int i, int i2, int i3, int i4, int i5) {
        b(i4, i5, (int[]) null);
    }

    @Override // flm.te
    public final void a(View view, int i, int i2, int[] iArr, int i3) {
        a(i, i2, iArr, (int[]) null, i3);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i) {
        return a(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i) {
        b(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        b(view, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        b(i4, 0, (int[]) null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        a(view, i, i2, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (z) {
            return false;
        }
        dispatchNestedFling(0.0f, f2, true);
        f((int) f2);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.z.a();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    protected float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    @Override // android.view.View
    protected float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((layoutParams.bottomMargin + childAt.getBottom()) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, i);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, layoutParams);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, i, layoutParams);
    }

    @Override // android.view.View
    protected void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        if (this.a != null) {
            this.a.a(this);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.m && View.MeasureSpec.getMode(i2) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || a(keyEvent);
    }

    public final boolean a(KeyEvent keyEvent) {
        boolean z;
        this.c.setEmpty();
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            z = layoutParams.bottomMargin + (childAt.getHeight() + layoutParams.topMargin) > (getHeight() - getPaddingTop()) - getPaddingBottom();
        } else {
            z = false;
        }
        if (!z) {
            if (!isFocused() || keyEvent.getKeyCode() == 4) {
                return false;
            }
            View viewFindFocus = findFocus();
            if (viewFindFocus == this) {
                viewFindFocus = null;
            }
            View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, 130);
            return (viewFindNextFocus == null || viewFindNextFocus == this || !viewFindNextFocus.requestFocus(130)) ? false : true;
        }
        if (keyEvent.getAction() != 0) {
            return false;
        }
        switch (keyEvent.getKeyCode()) {
            case 19:
                if (!keyEvent.isAltPressed()) {
                    return d(33);
                }
                return c(33);
            case 20:
                if (!keyEvent.isAltPressed()) {
                    return d(130);
                }
                return c(130);
            case 62:
                int i = keyEvent.isShiftPressed() ? 33 : 130;
                boolean z2 = i == 130;
                int height = getHeight();
                if (z2) {
                    this.c.top = getScrollY() + height;
                    int childCount = getChildCount();
                    if (childCount > 0) {
                        View childAt2 = getChildAt(childCount - 1);
                        int bottom = ((FrameLayout.LayoutParams) childAt2.getLayoutParams()).bottomMargin + childAt2.getBottom() + getPaddingBottom();
                        if (this.c.top + height > bottom) {
                            this.c.top = bottom - height;
                        }
                    }
                } else {
                    this.c.top = getScrollY() - height;
                    if (this.c.top < 0) {
                        this.c.top = 0;
                    }
                }
                this.c.bottom = height + this.c.top;
                a(i, this.c.top, this.c.bottom);
                return false;
            default:
                return false;
        }
    }

    private final void b() {
        if (this.l == null) {
            this.l = VelocityTracker.obtain();
        }
    }

    private final void c() {
        if (this.l != null) {
            this.l.recycle();
            this.l = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (z) {
            c();
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        int action = motionEvent.getAction();
        if (action == 2 && this.k) {
            return true;
        }
        switch (action & 255) {
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
                int y2 = (int) motionEvent.getY();
                int x2 = (int) motionEvent.getX();
                if (getChildCount() > 0) {
                    int scrollY = getScrollY();
                    View childAt = getChildAt(0);
                    z = y2 >= childAt.getTop() - scrollY && y2 < childAt.getBottom() - scrollY && x2 >= childAt.getLeft() && x2 < childAt.getRight();
                } else {
                    z = false;
                }
                if (!z) {
                    this.k = false;
                    c();
                } else {
                    this.g = y2;
                    this.r = motionEvent.getPointerId(0);
                    if (this.l == null) {
                        this.l = VelocityTracker.obtain();
                    } else {
                        this.l.clear();
                    }
                    this.l.addMovement(motionEvent);
                    this.d.computeScrollOffset();
                    this.k = this.d.isFinished() ? false : true;
                    b(2, 0);
                }
                break;
            case 1:
            case 3:
                this.k = false;
                this.r = -1;
                c();
                if (this.d.springBack(getScrollX(), getScrollY(), 0, 0, 0, a())) {
                    ti.d(this);
                }
                a(0);
                break;
            case 2:
                int i = this.r;
                if (i != -1) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(i);
                    if (iFindPointerIndex == -1) {
                        Log.e("NestedScrollView", "Invalid pointerId=" + i + " in onInterceptTouchEvent");
                    } else {
                        int y3 = (int) motionEvent.getY(iFindPointerIndex);
                        if (Math.abs(y3 - this.g) > this.o && (getNestedScrollAxes() & 2) == 0) {
                            this.k = true;
                            this.g = y3;
                            b();
                            this.l.addMovement(motionEvent);
                            this.u = 0;
                            ViewParent parent = getParent();
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                            }
                        }
                    }
                }
                break;
            case 6:
                a(motionEvent);
                break;
        }
        return this.k;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        b();
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.u = 0;
        }
        motionEventObtain.offsetLocation(0.0f, this.u);
        switch (actionMasked) {
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
                if (getChildCount() == 0) {
                    return false;
                }
                boolean z = !this.d.isFinished();
                this.k = z;
                if (z && (parent = getParent()) != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                if (!this.d.isFinished()) {
                    d();
                }
                this.g = (int) motionEvent.getY();
                this.r = motionEvent.getPointerId(0);
                b(2, 0);
                break;
                break;
            case 1:
                VelocityTracker velocityTracker = this.l;
                velocityTracker.computeCurrentVelocity(1000, this.q);
                int yVelocity = (int) velocityTracker.getYVelocity(this.r);
                if (Math.abs(yVelocity) > this.p) {
                    if (!dispatchNestedPreFling(0.0f, -yVelocity)) {
                        dispatchNestedFling(0.0f, -yVelocity, true);
                        f(-yVelocity);
                    }
                } else if (this.d.springBack(getScrollX(), getScrollY(), 0, 0, 0, a())) {
                    ti.d(this);
                }
                this.r = -1;
                e();
                break;
            case 2:
                int iFindPointerIndex = motionEvent.findPointerIndex(this.r);
                if (iFindPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + this.r + " in onTouchEvent");
                } else {
                    int y2 = (int) motionEvent.getY(iFindPointerIndex);
                    int i = this.g - y2;
                    if (a(0, i, this.t, this.s, 0)) {
                        i -= this.t[1];
                        motionEventObtain.offsetLocation(0.0f, this.s[1]);
                        this.u += this.s[1];
                    }
                    if (!this.k && Math.abs(i) > this.o) {
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.k = true;
                        if (i > 0) {
                            i -= this.o;
                        } else {
                            i += this.o;
                        }
                    }
                    if (this.k) {
                        this.g = y2 - this.s[1];
                        int scrollY = getScrollY();
                        int iA = a();
                        int overScrollMode = getOverScrollMode();
                        boolean z2 = overScrollMode == 0 || (overScrollMode == 1 && iA > 0);
                        if (a(0, i, 0, getScrollY(), 0, iA, 0, 0) && !b(0)) {
                            this.l.clear();
                        }
                        int scrollY2 = getScrollY() - scrollY;
                        this.t[1] = 0;
                        a(0, scrollY2, 0, i - scrollY2, this.s, 0, this.t);
                        this.g -= this.s[1];
                        motionEventObtain.offsetLocation(0.0f, this.s[1]);
                        this.u += this.s[1];
                        if (z2) {
                            int i2 = i - this.t[1];
                            f();
                            int i3 = scrollY + i2;
                            if (i3 < 0) {
                                uq.a(this.e, i2 / getHeight(), motionEvent.getX(iFindPointerIndex) / getWidth());
                                if (!this.f.isFinished()) {
                                    this.f.onRelease();
                                }
                            } else if (i3 > iA) {
                                uq.a(this.f, i2 / getHeight(), 1.0f - (motionEvent.getX(iFindPointerIndex) / getWidth()));
                                if (!this.e.isFinished()) {
                                    this.e.onRelease();
                                }
                            }
                            if (this.e != null && (!this.e.isFinished() || !this.f.isFinished())) {
                                ti.d(this);
                            }
                        }
                    }
                }
                break;
            case 3:
                if (this.k && getChildCount() > 0 && this.d.springBack(getScrollX(), getScrollY(), 0, 0, 0, a())) {
                    ti.d(this);
                }
                this.r = -1;
                e();
                break;
            case 5:
                int actionIndex = motionEvent.getActionIndex();
                this.g = (int) motionEvent.getY(actionIndex);
                this.r = motionEvent.getPointerId(actionIndex);
                break;
            case 6:
                a(motionEvent);
                this.g = (int) motionEvent.getY(motionEvent.findPointerIndex(this.r));
                break;
        }
        if (this.l != null) {
            this.l.addMovement(motionEventObtain);
        }
        motionEventObtain.recycle();
        return true;
    }

    private final void a(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.r) {
            int i = actionIndex == 0 ? 1 : 0;
            this.g = (int) motionEvent.getY(i);
            this.r = motionEvent.getPointerId(i);
            if (this.l != null) {
                this.l.clear();
            }
        }
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) == 0) {
            return false;
        }
        switch (motionEvent.getAction()) {
            case 8:
                if (this.k) {
                    return false;
                }
                float axisValue = motionEvent.getAxisValue(9);
                if (axisValue == 0.0f) {
                    return false;
                }
                if (this.B == 0.0f) {
                    TypedValue typedValue = new TypedValue();
                    Context context = getContext();
                    if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                        throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
                    }
                    this.B = typedValue.getDimension(context.getResources().getDisplayMetrics());
                }
                int i = (int) (axisValue * this.B);
                int iA = a();
                int scrollY = getScrollY();
                int i2 = scrollY - i;
                if (i2 < 0) {
                    iA = 0;
                } else if (i2 <= iA) {
                    iA = i2;
                }
                if (iA == scrollY) {
                    return false;
                }
                super.scrollTo(getScrollX(), iA);
                return true;
            default:
                return false;
        }
    }

    @Override // android.view.View
    protected void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        super.scrollTo(i, i2);
    }

    private final boolean a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        boolean z;
        int i9;
        boolean z2;
        getOverScrollMode();
        computeHorizontalScrollRange();
        computeHorizontalScrollExtent();
        computeVerticalScrollRange();
        computeVerticalScrollExtent();
        int i10 = i4 + i2;
        int i11 = i6 + 0;
        if (i3 <= 0 && i3 >= 0) {
            z = false;
            i9 = i3;
        } else {
            i9 = 0;
            z = true;
        }
        if (i10 > i11) {
            z2 = true;
        } else if (i10 >= 0) {
            z2 = false;
            i11 = i10;
        } else {
            i11 = 0;
            z2 = true;
        }
        if (z2 && !b(1)) {
            this.d.springBack(i9, i11, 0, 0, 0, a());
        }
        onOverScrolled(i9, i11, z, z2);
        return z || z2;
    }

    public final int a() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, (layoutParams.bottomMargin + (childAt.getHeight() + layoutParams.topMargin)) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    private final boolean c(int i) {
        int childCount;
        boolean z = i == 130;
        int height = getHeight();
        this.c.top = 0;
        this.c.bottom = height;
        if (z && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            this.c.bottom = ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + childAt.getBottom() + getPaddingBottom();
            this.c.top = this.c.bottom - height;
        }
        return a(i, this.c.top, this.c.bottom);
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00a2  */
    private final boolean a(int i, int i2, int i3) {
        boolean z;
        boolean z2;
        View view;
        int height = getHeight();
        int scrollY = getScrollY();
        int i4 = scrollY + height;
        boolean z3 = i == 33;
        ArrayList focusables = getFocusables(2);
        View view2 = null;
        boolean z4 = false;
        int size = focusables.size();
        int i5 = 0;
        while (i5 < size) {
            View view3 = (View) focusables.get(i5);
            int top = view3.getTop();
            int bottom = view3.getBottom();
            if (i2 >= bottom || top >= i3) {
                z2 = z4;
                view = view2;
            } else {
                boolean z5 = i2 < top && bottom < i3;
                if (view2 == null) {
                    boolean z6 = z5;
                    view = view3;
                    z2 = z6;
                } else {
                    boolean z7 = (z3 && top < view2.getTop()) || (!z3 && bottom > view2.getBottom());
                    if (z4) {
                        if (z5 && z7) {
                            view = view3;
                            z2 = z4;
                        } else {
                            z2 = z4;
                            view = view2;
                        }
                    } else if (z5) {
                        view = view3;
                        z2 = true;
                    } else if (z7) {
                        view = view3;
                        z2 = z4;
                    } else {
                        z2 = z4;
                        view = view2;
                    }
                }
            }
            i5++;
            view2 = view;
            z4 = z2;
        }
        if (view2 == null) {
            view2 = this;
        }
        if (i2 >= scrollY && i3 <= i4) {
            z = false;
        } else {
            e(z3 ? i2 - scrollY : i3 - i4);
            z = true;
        }
        if (view2 != findFocus()) {
            view2.requestFocus(i);
        }
        return z;
    }

    private final boolean d(int i) {
        int iMin;
        View viewFindFocus = findFocus();
        View view = viewFindFocus == this ? null : viewFindFocus;
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, view, i);
        int height = (int) (0.5f * getHeight());
        if (viewFindNextFocus != null && a(viewFindNextFocus, height, getHeight())) {
            viewFindNextFocus.getDrawingRect(this.c);
            offsetDescendantRectToMyCoords(viewFindNextFocus, this.c);
            e(a(this.c));
            viewFindNextFocus.requestFocus(i);
        } else {
            if (i == 33 && getScrollY() < height) {
                iMin = getScrollY();
            } else if (i != 130 || getChildCount() <= 0) {
                iMin = height;
            } else {
                View childAt = getChildAt(0);
                iMin = Math.min((((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + childAt.getBottom()) - ((getScrollY() + getHeight()) - getPaddingBottom()), height);
            }
            if (iMin == 0) {
                return false;
            }
            if (i != 130) {
                iMin = -iMin;
            }
            e(iMin);
        }
        if (view != null && view.isFocused() && a(view)) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    private final boolean a(View view) {
        return !a(view, 0, getHeight());
    }

    private final boolean a(View view, int i, int i2) {
        view.getDrawingRect(this.c);
        offsetDescendantRectToMyCoords(view, this.c);
        return this.c.bottom + i >= getScrollY() && this.c.top - i <= getScrollY() + i2;
    }

    private final void e(int i) {
        if (i != 0) {
            if (this.n) {
                c(0, i);
            } else {
                scrollBy(0, i);
            }
        }
    }

    private final void c(int i, int i2) {
        if (getChildCount() != 0) {
            if (AnimationUtils.currentAnimationTimeMillis() - this.b > 250) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int height = layoutParams.bottomMargin + childAt.getHeight() + layoutParams.topMargin;
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int scrollY = getScrollY();
                this.d.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(scrollY + i2, Math.max(0, height - height2))) - scrollY);
                a(false);
            } else {
                if (!this.d.isFinished()) {
                    d();
                }
                scrollBy(i, i2);
            }
            this.b = AnimationUtils.currentAnimationTimeMillis();
        }
    }

    public final void a(int i, int i2) {
        c(0 - getScrollX(), i2 - getScrollY());
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int bottom = layoutParams.bottomMargin + childAt.getBottom();
        int scrollY = getScrollY();
        int iMax = Math.max(0, bottom - height);
        if (scrollY < 0) {
            return bottom - scrollY;
        }
        if (scrollY > iMax) {
            return bottom + (scrollY - iMax);
        }
        return bottom;
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.ViewGroup
    protected void measureChild(View view, int i, int i2) {
        view.measure(getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight(), view.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    protected void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.bottomMargin + marginLayoutParams.topMargin, 0));
    }

    @Override // android.view.View
    public void computeScroll() {
        if (!this.d.isFinished()) {
            this.d.computeScrollOffset();
            int currY = this.d.getCurrY();
            int i = currY - this.v;
            this.v = currY;
            this.t[1] = 0;
            a(0, i, this.t, (int[]) null, 1);
            int i2 = i - this.t[1];
            int iA = a();
            if (i2 != 0) {
                int scrollY = getScrollY();
                a(0, i2, getScrollX(), scrollY, 0, iA, 0, 0);
                int scrollY2 = getScrollY() - scrollY;
                int i3 = i2 - scrollY2;
                this.t[1] = 0;
                a(0, scrollY2, 0, i3, this.s, 1, this.t);
                i2 = i3 - this.t[1];
            }
            if (i2 != 0) {
                int overScrollMode = getOverScrollMode();
                if (overScrollMode == 0 || (overScrollMode == 1 && iA > 0)) {
                    f();
                    if (i2 < 0) {
                        if (this.e.isFinished()) {
                            this.e.onAbsorb((int) this.d.getCurrVelocity());
                        }
                    } else if (this.f.isFinished()) {
                        this.f.onAbsorb((int) this.d.getCurrVelocity());
                    }
                }
                d();
            }
            if (!this.d.isFinished()) {
                ti.d(this);
            }
        }
    }

    private final void a(boolean z) {
        if (z) {
            b(2, 1);
        } else {
            a(1);
        }
        this.v = getScrollY();
        ti.d(this);
    }

    private final void d() {
        this.d.abortAnimation();
        a(1);
    }

    private final void b(View view) {
        view.getDrawingRect(this.c);
        offsetDescendantRectToMyCoords(view, this.c);
        int iA = a(this.c);
        if (iA != 0) {
            scrollBy(0, iA);
        }
    }

    private final int a(Rect rect) {
        int iMax;
        int i;
        int i2;
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i3 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int i4 = rect.top > 0 ? scrollY + verticalFadingEdgeLength : scrollY;
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i5 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i3 - verticalFadingEdgeLength : i3;
        if (rect.bottom > i5 && rect.top > i4) {
            if (rect.height() > height) {
                i2 = (rect.top - i4) + 0;
            } else {
                i2 = (rect.bottom - i5) + 0;
            }
            iMax = Math.min(i2, (layoutParams.bottomMargin + childAt.getBottom()) - i3);
        } else if (rect.top >= i4 || rect.bottom >= i5) {
            iMax = 0;
        } else {
            if (rect.height() > height) {
                i = 0 - (i5 - rect.bottom);
            } else {
                i = 0 - (i4 - rect.top);
            }
            iMax = Math.max(i, -getScrollY());
        }
        return iMax;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (!this.h) {
            b(view2);
        } else {
            this.j = view2;
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i, Rect rect) {
        View viewFindNextFocusFromRect;
        if (i == 2) {
            i = 130;
        } else if (i == 1) {
            i = 33;
        }
        if (rect == null) {
            viewFindNextFocusFromRect = FocusFinder.getInstance().findNextFocus(this, null, i);
        } else {
            viewFindNextFocusFromRect = FocusFinder.getInstance().findNextFocusFromRect(this, rect, i);
        }
        if (viewFindNextFocusFromRect == null || a(viewFindNextFocusFromRect)) {
            return false;
        }
        return viewFindNextFocusFromRect.requestFocus(i, rect);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int iA = a(rect);
        boolean z2 = iA != 0;
        if (z2) {
            if (z) {
                scrollBy(0, iA);
            } else {
                c(0, iA);
            }
        }
        return z2;
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.h = true;
        super.requestLayout();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredHeight = 0;
        super.onLayout(z, i, i2, i3, i4);
        this.h = false;
        if (this.j != null && a(this.j, this)) {
            b(this.j);
        }
        this.j = null;
        if (!this.i) {
            if (this.w != null) {
                scrollTo(getScrollX(), this.w.a);
                this.w = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                measuredHeight = layoutParams.bottomMargin + childAt.getMeasuredHeight() + layoutParams.topMargin;
            }
            int paddingTop = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int iB = b(scrollY, paddingTop, measuredHeight);
            if (iB != scrollY) {
                scrollTo(getScrollX(), iB);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.i = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.i = false;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        View viewFindFocus = findFocus();
        if (viewFindFocus != null && this != viewFindFocus && a(viewFindFocus, 0, i4)) {
            viewFindFocus.getDrawingRect(this.c);
            offsetDescendantRectToMyCoords(viewFindFocus, this.c);
            e(a(this.c));
        }
    }

    private static boolean a(View view, View view2) {
        if (view == view2) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && a((View) parent, view2);
    }

    private final void f(int i) {
        if (getChildCount() > 0) {
            this.d.fling(getScrollX(), getScrollY(), 0, i, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            a(true);
        }
    }

    private final void e() {
        this.k = false;
        c();
        a(0);
        if (this.e != null) {
            this.e.onRelease();
            this.f.onRelease();
        }
    }

    @Override // android.view.View
    public void scrollTo(int i, int i2) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = layoutParams.bottomMargin + childAt.getHeight() + layoutParams.topMargin;
            int iB = b(i, width, width2);
            int iB2 = b(i2, height, height2);
            if (iB != getScrollX() || iB2 != getScrollY()) {
                super.scrollTo(iB, iB2);
            }
        }
    }

    private final void f() {
        if (getOverScrollMode() != 2) {
            if (this.e == null) {
                Context context = getContext();
                this.e = new EdgeEffect(context);
                this.f = new EdgeEffect(context);
                return;
            }
            return;
        }
        this.e = null;
        this.f = null;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int paddingLeft;
        int paddingLeft2;
        int paddingLeft3 = 0;
        super.draw(canvas);
        if (this.e != null) {
            int scrollY = getScrollY();
            if (!this.e.isFinished()) {
                int iSave = canvas.save();
                int width = getWidth();
                int height = getHeight();
                int iMin = Math.min(0, scrollY);
                if (getClipToPadding()) {
                    paddingLeft = width - (getPaddingLeft() + getPaddingRight());
                    paddingLeft2 = getPaddingLeft() + 0;
                } else {
                    paddingLeft = width;
                    paddingLeft2 = 0;
                }
                if (getClipToPadding()) {
                    height -= getPaddingTop() + getPaddingBottom();
                    iMin += getPaddingTop();
                }
                canvas.translate(paddingLeft2, iMin);
                this.e.setSize(paddingLeft, height);
                if (this.e.draw(canvas)) {
                    ti.d(this);
                }
                canvas.restoreToCount(iSave);
            }
            if (!this.f.isFinished()) {
                int iSave2 = canvas.save();
                int width2 = getWidth();
                int height2 = getHeight();
                int iMax = Math.max(a(), scrollY) + height2;
                if (getClipToPadding()) {
                    width2 -= getPaddingLeft() + getPaddingRight();
                    paddingLeft3 = getPaddingLeft() + 0;
                }
                if (getClipToPadding()) {
                    height2 -= getPaddingTop() + getPaddingBottom();
                    iMax -= getPaddingBottom();
                }
                canvas.translate(paddingLeft3 - width2, iMax);
                canvas.rotate(180.0f, width2, 0.0f);
                this.f.setSize(width2, height2);
                if (this.f.draw(canvas)) {
                    ti.d(this);
                }
                canvas.restoreToCount(iSave2);
            }
        }
    }

    private static int b(int i, int i2, int i3) {
        if (i2 >= i3 || i < 0) {
            return 0;
        }
        if (i2 + i > i3) {
            return i3 - i2;
        }
        return i;
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof uy)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        uy uyVar = (uy) parcelable;
        super.onRestoreInstanceState(uyVar.getSuperState());
        this.w = uyVar;
        requestLayout();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        uy uyVar = new uy(super.onSaveInstanceState());
        uyVar.a = getScrollY();
        return uyVar;
    }
}

package flm;

import android.content.Context;
import android.support.design.widget.CoordinatorLayout;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class ee extends ei {
    private Runnable a;
    public OverScroller b;
    private boolean c;
    private int d;
    private int e;
    private int f;
    private VelocityTracker g;

    public ee() {
        this.d = -1;
        this.f = -1;
    }

    public ee(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = -1;
        this.f = -1;
    }

    @Override // flm.hs
    public final boolean a(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int iFindPointerIndex;
        if (this.f < 0) {
            this.f = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getAction() == 2 && this.c) {
            return true;
        }
        switch (motionEvent.getActionMasked()) {
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
                this.c = false;
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                if (c(view) && coordinatorLayout.a(view, x, y)) {
                    this.e = y;
                    this.d = motionEvent.getPointerId(0);
                    c();
                }
                break;
            case 1:
            case 3:
                this.c = false;
                this.d = -1;
                if (this.g != null) {
                    this.g.recycle();
                    this.g = null;
                }
                break;
            case 2:
                int i = this.d;
                if (i != -1 && (iFindPointerIndex = motionEvent.findPointerIndex(i)) != -1) {
                    int y2 = (int) motionEvent.getY(iFindPointerIndex);
                    if (Math.abs(y2 - this.e) > this.f) {
                        this.c = true;
                        this.e = y2;
                    }
                }
                break;
        }
        if (this.g != null) {
            this.g.addMovement(motionEvent);
        }
        return this.c;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:9:0x001d  */
    @Override // flm.hs
    public final boolean b(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (this.f < 0) {
            this.f = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        switch (motionEvent.getActionMasked()) {
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                if (coordinatorLayout.a(view, x, y) && c(view)) {
                    this.e = y;
                    this.d = motionEvent.getPointerId(0);
                    c();
                    if (this.g != null) {
                        this.g.addMovement(motionEvent);
                    }
                    return true;
                }
                return false;
            case 1:
                if (this.g != null) {
                    this.g.addMovement(motionEvent);
                    this.g.computeCurrentVelocity(1000);
                    float yVelocity = this.g.getYVelocity(this.d);
                    int i = -a(view);
                    if (this.a != null) {
                        view.removeCallbacks(this.a);
                        this.a = null;
                    }
                    if (this.b == null) {
                        this.b = new OverScroller(view.getContext());
                    }
                    this.b.fling(0, b(), 0, Math.round(yVelocity), 0, 0, i, 0);
                    if (this.b.computeScrollOffset()) {
                        this.a = new ef(this, coordinatorLayout, view);
                        ti.a(view, this.a);
                    } else {
                        a(coordinatorLayout, view);
                    }
                }
                break;
            case 2:
                int iFindPointerIndex = motionEvent.findPointerIndex(this.d);
                if (iFindPointerIndex == -1) {
                    return false;
                }
                int y2 = (int) motionEvent.getY(iFindPointerIndex);
                int i2 = this.e - y2;
                if (!this.c && Math.abs(i2) > this.f) {
                    this.c = true;
                    i2 = i2 > 0 ? i2 - this.f : i2 + this.f;
                }
                if (this.c) {
                    this.e = y2;
                    b(coordinatorLayout, view, i2, b(view), 0);
                }
                if (this.g != null) {
                    this.g.addMovement(motionEvent);
                }
                return true;
            case 3:
                break;
            default:
                if (this.g != null) {
                    this.g.addMovement(motionEvent);
                }
                return true;
        }
        this.c = false;
        this.d = -1;
        if (this.g != null) {
            this.g.recycle();
            this.g = null;
        }
        if (this.g != null) {
            this.g.addMovement(motionEvent);
        }
        return true;
    }

    final int a_(CoordinatorLayout coordinatorLayout, View view, int i) {
        return a(coordinatorLayout, view, i, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public int a(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        int iA;
        int iB = b();
        if (i2 == 0 || iB < i2 || iB > i3 || iB == (iA = ql.a(i, i2, i3))) {
            return 0;
        }
        a_(iA);
        return iB - iA;
    }

    public int a() {
        return b();
    }

    final int b(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        return a(coordinatorLayout, view, a() - i, i2, i3);
    }

    public void a(CoordinatorLayout coordinatorLayout, View view) {
    }

    public boolean c(View view) {
        return false;
    }

    public int b(View view) {
        return -view.getHeight();
    }

    public int a(View view) {
        return view.getHeight();
    }

    private final void c() {
        if (this.g == null) {
            this.g = VelocityTracker.obtain();
        }
    }
}

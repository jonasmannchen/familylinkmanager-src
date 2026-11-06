package flm;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ve {
    private static final Interpolator u = new vf();
    public int a;
    private int b;
    private float[] d;
    private float[] e;
    private float[] f;
    private float[] g;
    private int[] h;
    private int[] i;
    private int[] j;
    private int k;
    private VelocityTracker l;
    private float m;
    private float n;
    private int o;
    private OverScroller p;
    private final vh q;
    private View r;
    private boolean s;
    private final ViewGroup t;
    private int c = -1;
    private final Runnable v = new vg(this);

    public static ve a(ViewGroup viewGroup, vh vhVar) {
        return new ve(viewGroup.getContext(), viewGroup, vhVar);
    }

    private ve(Context context, ViewGroup viewGroup, vh vhVar) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        }
        if (vhVar == null) {
            throw new IllegalArgumentException("Callback may not be null");
        }
        this.t = viewGroup;
        this.q = vhVar;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.o = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.a = viewConfiguration.getScaledTouchSlop();
        this.m = viewConfiguration.getScaledMaximumFlingVelocity();
        this.n = viewConfiguration.getScaledMinimumFlingVelocity();
        this.p = new OverScroller(context, u);
    }

    public final void a(View view, int i) {
        if (view.getParent() != this.t) {
            throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.t + ")");
        }
        this.r = view;
        this.c = i;
        this.q.b(view, i);
        a(1);
    }

    private final void a() {
        this.c = -1;
        if (this.d != null) {
            Arrays.fill(this.d, 0.0f);
            Arrays.fill(this.e, 0.0f);
            Arrays.fill(this.f, 0.0f);
            Arrays.fill(this.g, 0.0f);
            Arrays.fill(this.h, 0);
            Arrays.fill(this.i, 0);
            Arrays.fill(this.j, 0);
            this.k = 0;
        }
        if (this.l != null) {
            this.l.recycle();
            this.l = null;
        }
    }

    public final boolean a(View view, int i, int i2) {
        this.r = view;
        this.c = -1;
        boolean zA = a(i, i2, 0, 0);
        if (!zA && this.b == 0 && this.r != null) {
            this.r = null;
        }
        return zA;
    }

    public final boolean a(int i, int i2) {
        if (!this.s) {
            throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
        }
        return a(i, i2, (int) this.l.getXVelocity(this.c), (int) this.l.getYVelocity(this.c));
    }

    private final boolean a(int i, int i2, int i3, int i4) {
        int left = this.r.getLeft();
        int top = this.r.getTop();
        int i5 = i - left;
        int i6 = i2 - top;
        if (i5 == 0 && i6 == 0) {
            this.p.abortAnimation();
            a(0);
            return false;
        }
        View view = this.r;
        int iB = b(i3, (int) this.n, (int) this.m);
        int iB2 = b(i4, (int) this.n, (int) this.m);
        int iAbs = Math.abs(i5);
        int iAbs2 = Math.abs(i6);
        int iAbs3 = Math.abs(iB);
        int iAbs4 = Math.abs(iB2);
        int i7 = iAbs3 + iAbs4;
        int i8 = iAbs + iAbs2;
        this.p.startScroll(left, top, i5, i6, (int) (((iB2 != 0 ? iAbs4 / i7 : iAbs2 / i8) * a(i6, iB2, this.q.a())) + ((iB != 0 ? iAbs3 / i7 : iAbs / i8) * a(i5, iB, this.q.a(view)))));
        a(2);
        return true;
    }

    private final int a(int i, int i2, int i3) {
        int iAbs;
        if (i == 0) {
            return 0;
        }
        int width = this.t.getWidth();
        int i4 = width / 2;
        float fSin = (((float) Math.sin((Math.min(1.0f, Math.abs(i) / width) - 0.5f) * 0.47123894f)) * i4) + i4;
        int iAbs2 = Math.abs(i2);
        if (iAbs2 > 0) {
            iAbs = Math.round(Math.abs(fSin / iAbs2) * 1000.0f) * 4;
        } else {
            iAbs = (int) (((Math.abs(i) / i3) + 1.0f) * 256.0f);
        }
        return Math.min(iAbs, 600);
    }

    private static int b(int i, int i2, int i3) {
        int iAbs = Math.abs(i);
        if (iAbs < i2) {
            return 0;
        }
        if (iAbs > i3) {
            return i <= 0 ? -i3 : i3;
        }
        return i;
    }

    private static float a(float f, float f2, float f3) {
        float fAbs = Math.abs(f);
        if (fAbs < f2) {
            return 0.0f;
        }
        if (fAbs > f3) {
            return f <= 0.0f ? -f3 : f3;
        }
        return f;
    }

    public final boolean a(boolean z) {
        if (this.b == 2) {
            boolean zComputeScrollOffset = this.p.computeScrollOffset();
            int currX = this.p.getCurrX();
            int currY = this.p.getCurrY();
            int left = currX - this.r.getLeft();
            int top = currY - this.r.getTop();
            if (left != 0) {
                ti.e(this.r, left);
            }
            if (top != 0) {
                ti.d(this.r, top);
            }
            if (left != 0 || top != 0) {
                this.q.a(this.r, currX, currY);
            }
            if (zComputeScrollOffset && currX == this.p.getFinalX() && currY == this.p.getFinalY()) {
                this.p.abortAnimation();
                zComputeScrollOffset = false;
            }
            if (!zComputeScrollOffset) {
                this.t.post(this.v);
            }
        }
        return this.b == 2;
    }

    private final void a(float f, float f2) {
        this.s = true;
        this.q.a(this.r, f, f2);
        this.s = false;
        if (this.b == 1) {
            a(0);
        }
    }

    private final void b(int i) {
        if (this.d != null && c(i)) {
            this.d[i] = 0.0f;
            this.e[i] = 0.0f;
            this.f[i] = 0.0f;
            this.g[i] = 0.0f;
            this.h[i] = 0;
            this.i[i] = 0;
            this.j[i] = 0;
            this.k &= (1 << i) ^ (-1);
        }
    }

    private final void a(float f, float f2, int i) {
        if (this.d == null || this.d.length <= i) {
            float[] fArr = new float[i + 1];
            float[] fArr2 = new float[i + 1];
            float[] fArr3 = new float[i + 1];
            float[] fArr4 = new float[i + 1];
            int[] iArr = new int[i + 1];
            int[] iArr2 = new int[i + 1];
            int[] iArr3 = new int[i + 1];
            if (this.d != null) {
                System.arraycopy(this.d, 0, fArr, 0, this.d.length);
                System.arraycopy(this.e, 0, fArr2, 0, this.e.length);
                System.arraycopy(this.f, 0, fArr3, 0, this.f.length);
                System.arraycopy(this.g, 0, fArr4, 0, this.g.length);
                System.arraycopy(this.h, 0, iArr, 0, this.h.length);
                System.arraycopy(this.i, 0, iArr2, 0, this.i.length);
                System.arraycopy(this.j, 0, iArr3, 0, this.j.length);
            }
            this.d = fArr;
            this.e = fArr2;
            this.f = fArr3;
            this.g = fArr4;
            this.h = iArr;
            this.i = iArr2;
            this.j = iArr3;
        }
        float[] fArr5 = this.d;
        this.f[i] = f;
        fArr5[i] = f;
        float[] fArr6 = this.e;
        this.g[i] = f2;
        fArr6[i] = f2;
        int[] iArr4 = this.h;
        int i2 = (int) f;
        int i3 = (int) f2;
        int i4 = i2 < this.t.getLeft() + this.o ? 1 : 0;
        if (i3 < this.t.getTop() + this.o) {
            i4 |= 4;
        }
        if (i2 > this.t.getRight() - this.o) {
            i4 |= 2;
        }
        if (i3 > this.t.getBottom() - this.o) {
            i4 |= 8;
        }
        iArr4[i] = i4;
        this.k |= 1 << i;
    }

    private final void c(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if (d(pointerId)) {
                float x = motionEvent.getX(i);
                float y = motionEvent.getY(i);
                this.f[pointerId] = x;
                this.g[pointerId] = y;
            }
        }
    }

    private final boolean c(int i) {
        return (this.k & (1 << i)) != 0;
    }

    final void a(int i) {
        this.t.removeCallbacks(this.v);
        if (this.b != i) {
            this.b = i;
            this.q.a(i);
            if (this.b == 0) {
                this.r = null;
            }
        }
    }

    private final boolean b(View view, int i) {
        if (view == this.r && this.c == i) {
            return true;
        }
        if (view != null && this.q.a(view, i)) {
            this.c = i;
            a(view, i);
            return true;
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00e2  */
    public final boolean a(MotionEvent motionEvent) {
        View viewB;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        if (this.l == null) {
            this.l = VelocityTracker.obtain();
        }
        this.l.addMovement(motionEvent);
        switch (actionMasked) {
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                int pointerId = motionEvent.getPointerId(0);
                a(x, y, pointerId);
                View viewB2 = b((int) x, (int) y);
                if (viewB2 == this.r && this.b == 2) {
                    b(viewB2, pointerId);
                }
                int i = this.h[pointerId];
                break;
            case 1:
            case 3:
                a();
                break;
            case 2:
                if (this.d != null && this.e != null) {
                    int pointerCount = motionEvent.getPointerCount();
                    for (int i2 = 0; i2 < pointerCount; i2++) {
                        int pointerId2 = motionEvent.getPointerId(i2);
                        if (d(pointerId2)) {
                            float x2 = motionEvent.getX(i2);
                            float y2 = motionEvent.getY(i2);
                            float f = x2 - this.d[pointerId2];
                            float f2 = y2 - this.e[pointerId2];
                            View viewB3 = b((int) x2, (int) y2);
                            boolean z = viewB3 != null && a(viewB3, f, f2);
                            if (z) {
                                int left = viewB3.getLeft();
                                int iC = this.q.c(viewB3, ((int) f) + left);
                                int top = viewB3.getTop();
                                int iD = this.q.d(viewB3, ((int) f2) + top);
                                int iA = this.q.a(viewB3);
                                int iA2 = this.q.a();
                                if ((iA != 0 && (iA <= 0 || iC != left)) || (iA2 != 0 && (iA2 <= 0 || iD != top))) {
                                    b(f, f2, pointerId2);
                                    if (this.b != 1 || (z && b(viewB3, pointerId2))) {
                                    }
                                }
                                c(motionEvent);
                            } else {
                                b(f, f2, pointerId2);
                                if (this.b != 1) {
                                }
                                c(motionEvent);
                            }
                            break;
                        }
                    }
                    c(motionEvent);
                }
                break;
            case 5:
                int pointerId3 = motionEvent.getPointerId(actionIndex);
                float x3 = motionEvent.getX(actionIndex);
                float y3 = motionEvent.getY(actionIndex);
                a(x3, y3, pointerId3);
                if (this.b != 0 && this.b == 2 && (viewB = b((int) x3, (int) y3)) == this.r) {
                    b(viewB, pointerId3);
                }
                break;
            case 6:
                b(motionEvent.getPointerId(actionIndex));
                break;
        }
        return this.b == 1;
    }

    public final void b(MotionEvent motionEvent) {
        int i;
        int i2 = 0;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        if (this.l == null) {
            this.l = VelocityTracker.obtain();
        }
        this.l.addMovement(motionEvent);
        switch (actionMasked) {
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                int pointerId = motionEvent.getPointerId(0);
                View viewB = b((int) x, (int) y);
                a(x, y, pointerId);
                b(viewB, pointerId);
                int i3 = this.h[pointerId];
                break;
            case 1:
                if (this.b == 1) {
                    b();
                }
                a();
                break;
            case 2:
                if (this.b == 1) {
                    if (d(this.c)) {
                        int iFindPointerIndex = motionEvent.findPointerIndex(this.c);
                        float x2 = motionEvent.getX(iFindPointerIndex);
                        float y2 = motionEvent.getY(iFindPointerIndex);
                        int i4 = (int) (x2 - this.f[this.c]);
                        int i5 = (int) (y2 - this.g[this.c]);
                        int left = this.r.getLeft() + i4;
                        int top = this.r.getTop() + i5;
                        int left2 = this.r.getLeft();
                        int top2 = this.r.getTop();
                        if (i4 != 0) {
                            left = this.q.c(this.r, left);
                            ti.e(this.r, left - left2);
                        }
                        if (i5 != 0) {
                            top = this.q.d(this.r, top);
                            ti.d(this.r, top - top2);
                        }
                        if (i4 != 0 || i5 != 0) {
                            this.q.a(this.r, left, top);
                        }
                        c(motionEvent);
                    }
                } else {
                    int pointerCount = motionEvent.getPointerCount();
                    while (i2 < pointerCount) {
                        int pointerId2 = motionEvent.getPointerId(i2);
                        if (d(pointerId2)) {
                            float x3 = motionEvent.getX(i2);
                            float y3 = motionEvent.getY(i2);
                            float f = x3 - this.d[pointerId2];
                            float f2 = y3 - this.e[pointerId2];
                            b(f, f2, pointerId2);
                            if (this.b != 1) {
                                View viewB2 = b((int) x3, (int) y3);
                                if (!a(viewB2, f, f2) || !b(viewB2, pointerId2)) {
                                }
                            }
                            c(motionEvent);
                            break;
                        }
                        i2++;
                    }
                    c(motionEvent);
                }
                break;
            case 3:
                if (this.b == 1) {
                    a(0.0f, 0.0f);
                }
                a();
                break;
            case 5:
                int pointerId3 = motionEvent.getPointerId(actionIndex);
                float x4 = motionEvent.getX(actionIndex);
                float y4 = motionEvent.getY(actionIndex);
                a(x4, y4, pointerId3);
                if (this.b == 0) {
                    b(b((int) x4, (int) y4), pointerId3);
                } else {
                    int i6 = (int) x4;
                    int i7 = (int) y4;
                    View view = this.r;
                    if (view != null && i6 >= view.getLeft() && i6 < view.getRight() && i7 >= view.getTop() && i7 < view.getBottom()) {
                        i2 = 1;
                    }
                    if (i2 != 0) {
                        b(this.r, pointerId3);
                    }
                }
                break;
            case 6:
                int pointerId4 = motionEvent.getPointerId(actionIndex);
                if (this.b == 1 && pointerId4 == this.c) {
                    int pointerCount2 = motionEvent.getPointerCount();
                    while (true) {
                        if (i2 >= pointerCount2) {
                            i = -1;
                        } else {
                            int pointerId5 = motionEvent.getPointerId(i2);
                            if (pointerId5 != this.c) {
                                if (b((int) motionEvent.getX(i2), (int) motionEvent.getY(i2)) == this.r && b(this.r, pointerId5)) {
                                    i = this.c;
                                }
                            }
                            i2++;
                        }
                    }
                    if (i == -1) {
                        b();
                    }
                }
                b(pointerId4);
                break;
        }
    }

    private final void b(float f, float f2, int i) {
        int i2 = a(f, f2, i, 1) ? 1 : 0;
        if (a(f2, f, i, 4)) {
            i2 |= 4;
        }
        if (a(f, f2, i, 2)) {
            i2 |= 2;
        }
        if (a(f2, f, i, 8)) {
            i2 |= 8;
        }
        if (i2 != 0) {
            int[] iArr = this.i;
            iArr[i] = i2 | iArr[i];
        }
    }

    private final boolean a(float f, float f2, int i, int i2) {
        float fAbs = Math.abs(f);
        float fAbs2 = Math.abs(f2);
        if ((this.h[i] & i2) != i2 || (i2 & 0) == 0 || (this.j[i] & i2) == i2 || (this.i[i] & i2) == i2) {
            return false;
        }
        return (fAbs > ((float) this.a) || fAbs2 > ((float) this.a)) && (this.i[i] & i2) == 0 && fAbs > ((float) this.a);
    }

    private final boolean a(View view, float f, float f2) {
        if (view == null) {
            return false;
        }
        boolean z = this.q.a(view) > 0;
        boolean z2 = this.q.a() > 0;
        if (z && z2) {
            return (f * f) + (f2 * f2) > ((float) (this.a * this.a));
        }
        if (z) {
            return Math.abs(f) > ((float) this.a);
        }
        return z2 && Math.abs(f2) > ((float) this.a);
    }

    private final void b() {
        this.l.computeCurrentVelocity(1000, this.m);
        a(a(this.l.getXVelocity(this.c), this.n, this.m), a(this.l.getYVelocity(this.c), this.n, this.m));
    }

    private final View b(int i, int i2) {
        for (int childCount = this.t.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.t.getChildAt(childCount);
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    private final boolean d(int i) {
        if (c(i)) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }
}

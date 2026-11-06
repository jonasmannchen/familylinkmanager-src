package android.support.design.bottomsheet;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcelable;
import android.support.design.widget.CoordinatorLayout;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.chimeraresources.R;
import flm.bbx;
import flm.ep;
import flm.eq;
import flm.er;
import flm.et;
import flm.ez;
import flm.hs;
import flm.ti;
import flm.ve;
import flm.vh;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class BottomSheetBehavior extends hs {
    public boolean a;
    public int b;
    public int c;
    public int d;
    public boolean e;
    public int f;
    public ve g;
    public int h;
    public WeakReference i;
    public WeakReference j;
    public eq k;
    public int l;
    public boolean m;
    private float n;
    private int o;
    private boolean p;
    private int q;
    private int r;
    private boolean s;
    private boolean t;
    private int u;
    private boolean v;
    private VelocityTracker w;
    private int x;
    private Map y;
    private final vh z;

    public BottomSheetBehavior() {
        this.a = true;
        this.f = 4;
        this.z = new ep(this);
    }

    /* JADX WARN: Code duplicated, block: B:56:0x00df  */
    /* JADX WARN: Code duplicated, block: B:57:0x00e1  */
    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        boolean z;
        View view;
        boolean z2;
        View view2;
        super(context, attributeSet);
        this.a = true;
        this.f = 4;
        this.z = new ep(this);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ez.a);
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(ez.d);
        if (typedValuePeekValue != null && typedValuePeekValue.data == -1) {
            int i = typedValuePeekValue.data;
            if (i == -1) {
                if (this.p) {
                    z2 = false;
                } else {
                    this.p = true;
                    z2 = true;
                }
            } else if (this.p || this.o != i) {
                this.p = false;
                this.o = Math.max(0, i);
                this.d = this.h - i;
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2 && this.f == 4 && this.i != null && (view2 = (View) this.i.get()) != null) {
                view2.requestLayout();
            }
        } else {
            int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(ez.d, -1);
            if (dimensionPixelSize == -1) {
                if (this.p) {
                    z = false;
                } else {
                    this.p = true;
                    z = true;
                }
            } else if (this.p || this.o != dimensionPixelSize) {
                this.p = false;
                this.o = Math.max(0, dimensionPixelSize);
                this.d = this.h - dimensionPixelSize;
                z = true;
            } else {
                z = false;
            }
            if (z && this.f == 4 && this.i != null && (view = (View) this.i.get()) != null) {
                view.requestLayout();
            }
        }
        this.e = typedArrayObtainStyledAttributes.getBoolean(ez.c, false);
        boolean z3 = typedArrayObtainStyledAttributes.getBoolean(ez.b, true);
        if (this.a != z3) {
            this.a = z3;
            if (this.i != null) {
                b();
            }
            b((this.a && this.f == 6) ? 3 : this.f);
        }
        this.s = typedArrayObtainStyledAttributes.getBoolean(ez.e, false);
        typedArrayObtainStyledAttributes.recycle();
        this.n = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    @Override // flm.hs
    public final Parcelable b(CoordinatorLayout coordinatorLayout, View view) {
        return new er(super.b(coordinatorLayout, view), this.f);
    }

    @Override // flm.hs
    public final void a(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
        er erVar = (er) parcelable;
        super.a(coordinatorLayout, view, erVar.e);
        if (erVar.a == 1 || erVar.a == 2) {
            this.f = 4;
        } else {
            this.f = erVar.a;
        }
    }

    @Override // flm.hs
    public final boolean a(CoordinatorLayout coordinatorLayout, View view, int i) {
        if (ti.p(coordinatorLayout) && !ti.p(view)) {
            view.setFitsSystemWindows(true);
        }
        int top = view.getTop();
        coordinatorLayout.a(view, i);
        this.h = coordinatorLayout.getHeight();
        if (this.p) {
            if (this.q == 0) {
                this.q = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.design_bottom_sheet_peek_height_min);
            }
            this.r = Math.max(this.q, this.h - ((coordinatorLayout.getWidth() * 9) / 16));
        } else {
            this.r = this.o;
        }
        this.b = Math.max(0, this.h - view.getHeight());
        this.c = this.h / 2;
        b();
        if (this.f == 3) {
            ti.d(view, a());
        } else if (this.f == 6) {
            ti.d(view, this.c);
        } else if (this.e && this.f == 5) {
            ti.d(view, this.h);
        } else if (this.f == 4) {
            ti.d(view, this.d);
        } else if (this.f == 1 || this.f == 2) {
            ti.d(view, top - view.getTop());
        }
        if (this.g == null) {
            this.g = ve.a(coordinatorLayout, this.z);
        }
        this.i = new WeakReference(view);
        this.j = new WeakReference(b(view));
        return true;
    }

    @Override // flm.hs
    public final boolean a(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            this.t = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            c();
        }
        if (this.w == null) {
            this.w = VelocityTracker.obtain();
        }
        this.w.addMovement(motionEvent);
        switch (actionMasked) {
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
                int x = (int) motionEvent.getX();
                this.x = (int) motionEvent.getY();
                View view2 = this.j != null ? (View) this.j.get() : null;
                if (view2 != null && coordinatorLayout.a(view2, x, this.x)) {
                    this.l = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.m = true;
                }
                this.t = this.l == -1 && !coordinatorLayout.a(view, x, this.x);
                break;
            case 1:
            case 3:
                this.m = false;
                this.l = -1;
                if (this.t) {
                    this.t = false;
                    return false;
                }
                break;
        }
        if (!this.t && this.g != null && this.g.a(motionEvent)) {
            return true;
        }
        View view3 = this.j != null ? (View) this.j.get() : null;
        return (actionMasked != 2 || view3 == null || this.t || this.f == 1 || coordinatorLayout.a(view3, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.g == null || Math.abs(((float) this.x) - motionEvent.getY()) <= ((float) this.g.a)) ? false : true;
    }

    @Override // flm.hs
    public final boolean b(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f == 1 && actionMasked == 0) {
            return true;
        }
        if (this.g != null) {
            this.g.b(motionEvent);
        }
        if (actionMasked == 0) {
            c();
        }
        if (this.w == null) {
            this.w = VelocityTracker.obtain();
        }
        this.w.addMovement(motionEvent);
        if (actionMasked == 2 && !this.t && Math.abs(this.x - motionEvent.getY()) > this.g.a) {
            this.g.a(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.t;
    }

    @Override // flm.hs
    public final boolean a(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
        this.u = 0;
        this.v = false;
        return (i & 2) != 0;
    }

    @Override // flm.hs
    public final void a(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
        if (i3 != 1) {
            if (view2 == (this.j != null ? (View) this.j.get() : null)) {
                int top = view.getTop();
                int i4 = top - i2;
                if (i2 > 0) {
                    if (i4 < a()) {
                        iArr[1] = top - a();
                        ti.d(view, -iArr[1]);
                        b(3);
                    } else {
                        iArr[1] = i2;
                        ti.d(view, -i2);
                        b(1);
                    }
                } else if (i2 < 0 && !view2.canScrollVertically(-1)) {
                    if (i4 <= this.d || this.e) {
                        iArr[1] = i2;
                        ti.d(view, -i2);
                        b(1);
                    } else {
                        iArr[1] = top - this.d;
                        ti.d(view, -iArr[1]);
                        b(4);
                    }
                }
                c(view.getTop());
                this.u = i2;
                this.v = true;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x006d  */
    /* JADX WARN: Code duplicated, block: B:30:0x0071  */
    /* JADX WARN: Code duplicated, block: B:32:0x0079  */
    /* JADX WARN: Code duplicated, block: B:34:0x008a  */
    /* JADX WARN: Code duplicated, block: B:35:0x0090  */
    /* JADX WARN: Code duplicated, block: B:36:0x0095  */
    /* JADX WARN: Code duplicated, block: B:38:0x0099  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:44:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:46:0x00c8  */
    @Override // flm.hs
    public final void a(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
        int iA;
        int i2;
        int top;
        float yVelocity;
        if (view.getTop() == a()) {
            b(3);
            return;
        }
        if (this.j != null && view2 == this.j.get() && this.v) {
            if (this.u > 0) {
                iA = a();
                i2 = 3;
            } else if (this.e) {
                if (this.w == null) {
                    yVelocity = 0.0f;
                } else {
                    this.w.computeCurrentVelocity(1000, this.n);
                    yVelocity = this.w.getYVelocity(this.l);
                }
                if (a(view, yVelocity)) {
                    iA = this.h;
                    i2 = 5;
                } else if (this.u == 0) {
                    top = view.getTop();
                    if (this.a) {
                        if (Math.abs(top - this.b) < Math.abs(top - this.d)) {
                            iA = this.b;
                            i2 = 3;
                        } else {
                            iA = this.d;
                            i2 = 4;
                        }
                    } else if (top < this.c) {
                        if (top < Math.abs(top - this.d)) {
                            i2 = 3;
                            iA = 0;
                        } else {
                            iA = this.c;
                            i2 = 6;
                        }
                    } else if (Math.abs(top - this.c) < Math.abs(top - this.d)) {
                        iA = this.c;
                        i2 = 6;
                    } else {
                        iA = this.d;
                        i2 = 4;
                    }
                } else {
                    iA = this.d;
                    i2 = 4;
                }
            } else if (this.u == 0) {
                top = view.getTop();
                if (this.a) {
                    if (Math.abs(top - this.b) < Math.abs(top - this.d)) {
                        iA = this.b;
                        i2 = 3;
                    } else {
                        iA = this.d;
                        i2 = 4;
                    }
                } else if (top < this.c) {
                    if (top < Math.abs(top - this.d)) {
                        i2 = 3;
                        iA = 0;
                    } else {
                        iA = this.c;
                        i2 = 6;
                    }
                } else if (Math.abs(top - this.c) < Math.abs(top - this.d)) {
                    iA = this.c;
                    i2 = 6;
                } else {
                    iA = this.d;
                    i2 = 4;
                }
            } else {
                iA = this.d;
                i2 = 4;
            }
            if (this.g.a(view, view.getLeft(), iA)) {
                b(2);
                ti.a(view, new et(this, view, i2));
            } else {
                b(i2);
            }
            this.v = false;
        }
    }

    @Override // flm.hs
    public final boolean a(CoordinatorLayout coordinatorLayout, View view, View view2, float f, float f2) {
        if (this.j == null || view2 != this.j.get()) {
            return false;
        }
        return this.f != 3 || super.a(coordinatorLayout, view, view2, f, f2);
    }

    public final void b(int i) {
        if (this.f != i) {
            this.f = i;
            if (i == 6 || i == 3) {
                a(true);
            } else if (i == 5 || i == 4) {
                a(false);
            }
            if (this.i != null && ((View) this.i.get()) != null && this.k != null) {
                this.k.a(i);
            }
        }
    }

    private final void b() {
        if (this.a) {
            this.d = Math.max(this.h - this.r, this.b);
        } else {
            this.d = this.h - this.r;
        }
    }

    private final void c() {
        this.l = -1;
        if (this.w != null) {
            this.w.recycle();
            this.w = null;
        }
    }

    public final boolean a(View view, float f) {
        if (this.s) {
            return true;
        }
        return view.getTop() >= this.d && Math.abs((((float) view.getTop()) + (0.1f * f)) - ((float) this.d)) / ((float) this.o) > 0.5f;
    }

    private final View b(View view) {
        if (!ti.u(view)) {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View viewB = b(viewGroup.getChildAt(i));
                    if (viewB != null) {
                        return viewB;
                    }
                }
            }
            return null;
        }
        return view;
    }

    public final int a() {
        if (this.a) {
            return this.b;
        }
        return 0;
    }

    public final void b(View view, int i) {
        int iA;
        if (i == 4) {
            iA = this.d;
        } else if (i == 6) {
            iA = this.c;
            if (this.a && iA <= this.b) {
                iA = this.b;
                i = 3;
            }
        } else if (i == 3) {
            iA = a();
        } else if (this.e && i == 5) {
            iA = this.h;
        } else {
            throw new IllegalArgumentException(new StringBuilder(35).append("Illegal state argument: ").append(i).toString());
        }
        if (this.g.a(view, view.getLeft(), iA)) {
            b(2);
            ti.a(view, new et(this, view, i));
        } else {
            b(i);
        }
    }

    public final void c(int i) {
        if (((View) this.i.get()) != null && this.k != null) {
            if (i > this.d) {
                this.k.a();
            } else {
                this.k.a();
            }
        }
    }

    private final void a(boolean z) {
        if (this.i != null) {
            ViewParent parent = ((View) this.i.get()).getParent();
            if (parent instanceof CoordinatorLayout) {
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
                int childCount = coordinatorLayout.getChildCount();
                if (z) {
                    if (this.y == null) {
                        this.y = new HashMap(childCount);
                    } else {
                        return;
                    }
                }
                for (int i = 0; i < childCount; i++) {
                    View childAt = coordinatorLayout.getChildAt(i);
                    if (childAt != this.i.get()) {
                        if (!z) {
                            if (this.y != null && this.y.containsKey(childAt)) {
                                ti.b(childAt, ((Integer) this.y.get(childAt)).intValue());
                            }
                        } else {
                            if (Build.VERSION.SDK_INT >= 16) {
                                this.y.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                            }
                            ti.b(childAt, 4);
                        }
                    }
                }
                if (!z) {
                    this.y = null;
                }
            }
        }
    }
}

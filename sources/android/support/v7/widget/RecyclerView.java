package android.support.v7.widget;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import flm.abg;
import flm.abi;
import flm.acw;
import flm.adc;
import flm.adr;
import flm.aea;
import flm.aec;
import flm.afg;
import flm.afh;
import flm.afi;
import flm.afj;
import flm.afk;
import flm.afl;
import flm.afm;
import flm.afp;
import flm.afq;
import flm.afs;
import flm.aft;
import flm.afu;
import flm.afv;
import flm.afw;
import flm.aga;
import flm.agb;
import flm.agc;
import flm.agd;
import flm.age;
import flm.agf;
import flm.agg;
import flm.agh;
import flm.agi;
import flm.agk;
import flm.agl;
import flm.agm;
import flm.agn;
import flm.ahz;
import flm.aia;
import flm.aib;
import flm.bbx;
import flm.qs;
import flm.td;
import flm.ti;
import flm.tr;
import flm.uq;
import flm.yd;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class RecyclerView extends ViewGroup {
    public static final Interpolator L;
    private static final boolean O;
    private static final boolean P;
    private static final Class[] Q;
    public static final boolean b;
    public static final boolean c;
    public aea A;
    public aec B;
    public final agk C;
    public List D;
    public boolean E;
    public boolean F;
    public afs G;
    public boolean H;
    public agn I;
    public final int[] J;
    public final int[] K;
    private final agh R;
    private agi S;
    private boolean T;
    private final Rect U;
    private boolean V;
    private int W;
    private final aib aA;
    private boolean aa;
    private int ab;
    private final AccessibilityManager ac;
    private boolean ad;
    private int ae;
    private int af;
    private afp ag;
    private int ah;
    private int ai;
    private VelocityTracker aj;
    private int ak;
    private int al;
    private int am;
    private int an;
    private int ao;
    private final int ap;
    private final int aq;
    private float ar;
    private float as;
    private boolean at;
    private final int[] au;
    private td av;
    private final int[] aw;
    private final int[] ax;
    private final List ay;
    private Runnable az;
    public final agf d;
    public abg e;
    public acw f;
    public final ahz g;
    public final Rect h;
    public final RectF i;
    public afm j;
    public afw k;
    public agg l;
    public final ArrayList m;
    public final ArrayList n;
    public agb o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public EdgeEffect u;
    public EdgeEffect v;
    public EdgeEffect w;
    public EdgeEffect x;
    public afq y;
    public final agl z;
    private static final int[] M = {R.attr.nestedScrollingEnabled};
    private static final int[] N = {R.attr.clipToPadding};
    public static final boolean a = false;

    public RecyclerView(Context context) {
        this(context, null);
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i) throws NoSuchMethodException {
        String str;
        ClassLoader classLoader;
        Constructor constructor;
        Object[] objArr;
        super(context, attributeSet, i);
        this.R = new agh(this);
        this.d = new agf(this);
        this.g = new ahz();
        new afg(this);
        this.h = new Rect();
        this.U = new Rect();
        this.i = new RectF();
        this.m = new ArrayList();
        this.n = new ArrayList();
        this.W = 0;
        this.t = false;
        this.ad = false;
        this.ae = 0;
        this.af = 0;
        this.ag = new afp();
        this.y = new adc();
        this.ah = 0;
        this.ai = -1;
        this.ar = Float.MIN_VALUE;
        this.as = Float.MIN_VALUE;
        this.at = true;
        this.z = new agl(this);
        this.B = c ? new aec() : null;
        this.C = new agk();
        this.E = false;
        this.F = false;
        this.G = new afu(this);
        this.H = false;
        this.au = new int[2];
        this.aw = new int[2];
        this.J = new int[2];
        this.ax = new int[2];
        this.K = new int[2];
        this.ay = new ArrayList();
        this.az = new afh(this);
        this.aA = new afj(this);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, N, i, 0);
            this.T = typedArrayObtainStyledAttributes.getBoolean(0, true);
            typedArrayObtainStyledAttributes.recycle();
        } else {
            this.T = true;
        }
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.ao = viewConfiguration.getScaledTouchSlop();
        this.ar = tr.a(viewConfiguration, context);
        this.as = tr.b(viewConfiguration, context);
        this.ap = viewConfiguration.getScaledMinimumFlingVelocity();
        this.aq = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.y.h = this.G;
        this.e = new abg(new afl(this));
        this.f = new acw(new afk(this));
        if (ti.a(this) == 0) {
            ti.a((View) this, 8);
        }
        if (ti.e(this) == 0) {
            ti.b(this, 1);
        }
        this.ac = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.I = new agn(this);
        ti.a(this, this.I);
        boolean z = true;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, yd.a, i, 0);
            String string = typedArrayObtainStyledAttributes2.getString(yd.h);
            if (typedArrayObtainStyledAttributes2.getInt(yd.b, -1) == -1) {
                setDescendantFocusability(262144);
            }
            this.V = typedArrayObtainStyledAttributes2.getBoolean(yd.c, false);
            if (this.V) {
                StateListDrawable stateListDrawable = (StateListDrawable) typedArrayObtainStyledAttributes2.getDrawable(yd.f);
                Drawable drawable = typedArrayObtainStyledAttributes2.getDrawable(yd.g);
                StateListDrawable stateListDrawable2 = (StateListDrawable) typedArrayObtainStyledAttributes2.getDrawable(yd.d);
                Drawable drawable2 = typedArrayObtainStyledAttributes2.getDrawable(yd.e);
                if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
                    throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + a());
                }
                Resources resources = getContext().getResources();
                new adr(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(com.google.android.chimeraresources.R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(com.google.android.chimeraresources.R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(com.google.android.chimeraresources.R.dimen.fastscroll_margin));
            }
            typedArrayObtainStyledAttributes2.recycle();
            if (string != null) {
                String strTrim = string.trim();
                if (!strTrim.isEmpty()) {
                    if (strTrim.charAt(0) == '.') {
                        str = context.getPackageName() + strTrim;
                    } else {
                        str = strTrim.contains(".") ? strTrim : RecyclerView.class.getPackage().getName() + '.' + strTrim;
                    }
                    try {
                        if (isInEditMode()) {
                            classLoader = getClass().getClassLoader();
                        } else {
                            classLoader = context.getClassLoader();
                        }
                        Class<? extends U> clsAsSubclass = classLoader.loadClass(str).asSubclass(afw.class);
                        try {
                            Constructor constructor2 = clsAsSubclass.getConstructor(Q);
                            objArr = new Object[]{context, attributeSet, Integer.valueOf(i), 0};
                            constructor = constructor2;
                        } catch (NoSuchMethodException e) {
                            try {
                                constructor = clsAsSubclass.getConstructor(new Class[0]);
                                objArr = null;
                            } catch (NoSuchMethodException e2) {
                                e2.initCause(e);
                                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + str, e2);
                            }
                        }
                        constructor.setAccessible(true);
                        a((afw) constructor.newInstance(objArr));
                    } catch (ClassCastException e3) {
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + str, e3);
                    } catch (ClassNotFoundException e4) {
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + str, e4);
                    } catch (IllegalAccessException e5) {
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + str, e5);
                    } catch (InstantiationException e6) {
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + str, e6);
                    } catch (InvocationTargetException e7) {
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + str, e7);
                    }
                }
            }
            TypedArray typedArrayObtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, M, i, 0);
            z = typedArrayObtainStyledAttributes3.getBoolean(0, true);
            typedArrayObtainStyledAttributes3.recycle();
        } else {
            setDescendantFocusability(262144);
        }
        setNestedScrollingEnabled(z);
    }

    public final String a() {
        return " " + super.toString() + ", adapter:" + this.j + ", layout:" + this.k + ", context:" + getContext();
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z) {
        if (z != this.T) {
            s();
        }
        this.T = z;
        super.setClipToPadding(z);
        if (this.q) {
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.T;
    }

    public void a(afm afmVar) {
        if (this.s) {
            a("Do not setLayoutFrozen in layout or scroll");
            this.s = false;
            if (this.r && this.k != null && this.j != null) {
                requestLayout();
            }
            this.r = false;
        }
        if (this.j != null) {
            this.j.a.unregisterObserver(this.R);
        }
        b();
        this.e.a();
        afm afmVar2 = this.j;
        this.j = afmVar;
        if (afmVar != null) {
            afmVar.a(this.R);
        }
        agf agfVar = this.d;
        afm afmVar3 = this.j;
        agfVar.a();
        agd agdVarD = agfVar.d();
        if (afmVar2 != null) {
            agdVarD.b--;
        }
        if (agdVarD.b == 0) {
            for (int i = 0; i < agdVarD.a.size(); i++) {
                ((age) agdVarD.a.valueAt(i)).a.clear();
            }
        }
        if (afmVar3 != null) {
            agdVarD.b++;
        }
        this.C.f = true;
        c(false);
        requestLayout();
    }

    public final void b() {
        if (this.y != null) {
            this.y.d();
        }
        if (this.k != null) {
            this.k.b(this.d);
            this.k.a(this.d);
        }
        this.d.a();
    }

    @Override // android.view.View
    public int getBaseline() {
        if (this.k != null) {
            return -1;
        }
        return super.getBaseline();
    }

    public void a(afw afwVar) {
        if (afwVar != this.k) {
            q();
            if (this.k != null) {
                if (this.y != null) {
                    this.y.d();
                }
                this.k.b(this.d);
                this.k.a(this.d);
                this.d.a();
                if (this.p) {
                    this.k.a(this, this.d);
                }
                this.k.a((RecyclerView) null);
                this.k = null;
            } else {
                this.d.a();
            }
            acw acwVar = this.f;
            acwVar.b.a();
            for (int size = acwVar.c.size() - 1; size >= 0; size--) {
                acwVar.a.d((View) acwVar.c.get(size));
                acwVar.c.remove(size);
            }
            acwVar.a.b();
            this.k = afwVar;
            if (afwVar != null) {
                if (afwVar.f != null) {
                    throw new IllegalArgumentException("LayoutManager " + afwVar + " is already attached to a RecyclerView:" + afwVar.f.a());
                }
                this.k.a(this);
            }
            this.d.b();
            requestLayout();
        }
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        agi agiVar = new agi(super.onSaveInstanceState());
        if (this.S != null) {
            agiVar.a = this.S.a;
        } else if (this.k != null) {
            agiVar.a = this.k.h();
        } else {
            agiVar.a = null;
        }
        return agiVar;
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof agi)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        this.S = (agi) parcelable;
        super.onRestoreInstanceState(this.S.e);
        if (this.k != null && this.S.a != null) {
            this.k.a(this.S.a);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    public final void a(agm agmVar) {
        View view = agmVar.a;
        boolean z = view.getParent() == this;
        this.d.b(a(view));
        if (agmVar.n()) {
            this.f.a(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (!z) {
            this.f.a(view, -1, true);
            return;
        }
        acw acwVar = this.f;
        int iA = acwVar.a.a(view);
        if (iA < 0) {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
        acwVar.b.a(iA);
        acwVar.a(view);
    }

    public final void a(int i) {
        if (i != this.ah) {
            this.ah = i;
            if (i != 2) {
                r();
            }
            if (this.D != null) {
                for (int size = this.D.size() - 1; size >= 0; size--) {
                    this.D.get(size);
                }
            }
        }
    }

    @Override // android.view.View
    public void scrollTo(int i, int i2) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View
    public void scrollBy(int i, int i2) {
        if (this.k == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (!this.s) {
            boolean zI = this.k.i();
            boolean zJ = this.k.j();
            if (zI || zJ) {
                if (!zI) {
                    i = 0;
                }
                if (!zJ) {
                    i2 = 0;
                }
                a(i, i2, (MotionEvent) null);
            }
        }
    }

    public final void a(int i, int i2, int[] iArr) {
        d();
        i();
        qs.a("RV Scroll");
        a(this.C);
        int iA = i != 0 ? this.k.a(i, this.d, this.C) : 0;
        int iB = i2 != 0 ? this.k.b(i2, this.d, this.C) : 0;
        Trace.endSection();
        int iA2 = this.f.a();
        for (int i3 = 0; i3 < iA2; i3++) {
            View viewB = this.f.b(i3);
            agm agmVarA = a(viewB);
            if (agmVarA != null && agmVarA.i != null) {
                View view = agmVarA.i.a;
                int left = viewB.getLeft();
                int top = viewB.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        b(true);
        a(false);
        if (iArr != null) {
            iArr[0] = iA;
            iArr[1] = iB;
        }
    }

    public final void c() {
        boolean z = false;
        if (!this.q || this.t) {
            qs.a("RV FullInvalidate");
            w();
            Trace.endSection();
            return;
        }
        if (this.e.d()) {
            if (this.e.a(4) && !this.e.a(11)) {
                qs.a("RV PartialInvalidate");
                d();
                i();
                this.e.b();
                if (!this.r) {
                    int iA = this.f.a();
                    for (int i = 0; i < iA; i++) {
                        agm agmVarC = c(this.f.b(i));
                        if (agmVarC != null && !agmVarC.b() && agmVarC.s()) {
                            z = true;
                            break;
                        }
                    }
                    if (z) {
                        w();
                    } else {
                        this.e.c();
                    }
                }
                a(true);
                b(true);
                Trace.endSection();
                return;
            }
            if (this.e.d()) {
                qs.a("RV FullInvalidate");
                w();
                Trace.endSection();
            }
        }
    }

    private final boolean a(int i, int i2, MotionEvent motionEvent) {
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        c();
        if (this.j != null) {
            a(i, i2, this.K);
            i5 = this.K[0];
            i6 = this.K[1];
            i3 = i - i5;
            i4 = i2 - i6;
        }
        if (!this.m.isEmpty()) {
            invalidate();
        }
        if (a(i5, i6, i3, i4, this.aw, 0)) {
            this.am -= this.aw[0];
            this.an -= this.aw[1];
            if (motionEvent != null) {
                motionEvent.offsetLocation(this.aw[0], this.aw[1]);
            }
            int[] iArr = this.ax;
            iArr[0] = iArr[0] + this.aw[0];
            int[] iArr2 = this.ax;
            iArr2[1] = iArr2[1] + this.aw[1];
        } else if (getOverScrollMode() != 2) {
            if (motionEvent != null) {
                if (!((motionEvent.getSource() & 8194) == 8194)) {
                    float x = motionEvent.getX();
                    float f = i3;
                    float y = motionEvent.getY();
                    float f2 = i4;
                    boolean z = false;
                    if (f < 0.0f) {
                        e();
                        uq.a(this.u, (-f) / getWidth(), 1.0f - (y / getHeight()));
                        z = true;
                    } else if (f > 0.0f) {
                        f();
                        uq.a(this.w, f / getWidth(), y / getHeight());
                        z = true;
                    }
                    if (f2 < 0.0f) {
                        g();
                        uq.a(this.v, (-f2) / getHeight(), x / getWidth());
                        z = true;
                    } else if (f2 > 0.0f) {
                        h();
                        uq.a(this.x, f2 / getHeight(), 1.0f - (x / getWidth()));
                        z = true;
                    }
                    if (z || f != 0.0f || f2 != 0.0f) {
                        ti.d(this);
                    }
                }
            }
            b(i, i2);
        }
        if (i5 != 0 || i6 != 0) {
            d(i5, i6);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (i5 == 0 && i6 == 0) ? false : true;
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        if (this.k != null && this.k.i()) {
            return this.k.b(this.C);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        if (this.k != null && this.k.i()) {
            return this.k.d(this.C);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        if (this.k != null && this.k.i()) {
            return this.k.f(this.C);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        if (this.k != null && this.k.j()) {
            return this.k.c(this.C);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        if (this.k != null && this.k.j()) {
            return this.k.e(this.C);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        if (this.k != null && this.k.j()) {
            return this.k.g(this.C);
        }
        return 0;
    }

    public final void d() {
        this.W++;
        if (this.W == 1 && !this.s) {
            this.r = false;
        }
    }

    public final void a(boolean z) {
        if (this.W <= 0) {
            this.W = 1;
        }
        if (!z && !this.s) {
            this.r = false;
        }
        if (this.W == 1) {
            if (z && this.r && !this.s && this.k != null && this.j != null) {
                w();
            }
            if (!this.s) {
                this.r = false;
            }
        }
        this.W--;
    }

    public final void a(int i, int i2) {
        if (this.k == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (!this.s) {
            if (!this.k.i()) {
                i = 0;
            }
            if (!this.k.j()) {
                i2 = 0;
            }
            if (i != 0 || i2 != 0) {
                agl aglVar = this.z;
                aglVar.a(i, i2, aglVar.a(i, i2, 0, 0), 0 == 0 ? L : null);
            }
        }
    }

    private final void q() {
        a(0);
        r();
    }

    private final void r() {
        this.z.b();
        if (this.k != null) {
            afw afwVar = this.k;
        }
    }

    public final void b(int i, int i2) {
        boolean zIsFinished = false;
        if (this.u != null && !this.u.isFinished() && i > 0) {
            this.u.onRelease();
            zIsFinished = this.u.isFinished();
        }
        if (this.w != null && !this.w.isFinished() && i < 0) {
            this.w.onRelease();
            zIsFinished |= this.w.isFinished();
        }
        if (this.v != null && !this.v.isFinished() && i2 > 0) {
            this.v.onRelease();
            zIsFinished |= this.v.isFinished();
        }
        if (this.x != null && !this.x.isFinished() && i2 < 0) {
            this.x.onRelease();
            zIsFinished |= this.x.isFinished();
        }
        if (zIsFinished) {
            ti.d(this);
        }
    }

    public final void e() {
        if (this.u == null) {
            this.u = afp.a(this);
            if (this.T) {
                this.u.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
            } else {
                this.u.setSize(getMeasuredHeight(), getMeasuredWidth());
            }
        }
    }

    public final void f() {
        if (this.w == null) {
            this.w = afp.a(this);
            if (this.T) {
                this.w.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
            } else {
                this.w.setSize(getMeasuredHeight(), getMeasuredWidth());
            }
        }
    }

    public final void g() {
        if (this.v == null) {
            this.v = afp.a(this);
            if (this.T) {
                this.v.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
            } else {
                this.v.setSize(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    public final void h() {
        if (this.x == null) {
            this.x = afp.a(this);
            if (this.T) {
                this.x.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
            } else {
                this.x.setSize(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    private final void s() {
        this.x = null;
        this.v = null;
        this.w = null;
        this.u = null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public View focusSearch(View view, int i) {
        View viewFindNextFocus;
        int i2;
        boolean z;
        byte b2 = -1;
        boolean z2 = false;
        boolean z3 = (this.j == null || this.k == null || k() || this.s) ? false : true;
        FocusFinder focusFinder = FocusFinder.getInstance();
        if (z3 && (i == 2 || i == 1)) {
            if (this.k.j()) {
                z = focusFinder.findNextFocus(this, view, i == 2 ? 130 : 33) == null;
            } else {
                z = false;
            }
            if (!z && this.k.i()) {
                z = focusFinder.findNextFocus(this, view, (i == 2) ^ (ti.f(this.k.f) == 1) ? 66 : 17) == null;
            }
            if (z) {
                c();
                if (b(view) == null) {
                    return null;
                }
                d();
                this.k.a(view, i, this.d, this.C);
                a(false);
            }
            viewFindNextFocus = focusFinder.findNextFocus(this, view, i);
        } else {
            viewFindNextFocus = focusFinder.findNextFocus(this, view, i);
            if (viewFindNextFocus == null && z3) {
                c();
                if (b(view) == null) {
                    return null;
                }
                d();
                viewFindNextFocus = this.k.a(view, i, this.d, this.C);
                a(false);
            }
        }
        if (viewFindNextFocus != null && !viewFindNextFocus.hasFocusable()) {
            if (getFocusedChild() == null) {
                return super.focusSearch(view, i);
            }
            a(viewFindNextFocus, (View) null);
            return view;
        }
        if (viewFindNextFocus != null && viewFindNextFocus != this && b(viewFindNextFocus) != null) {
            if (view == null || b(view) == null) {
                z2 = true;
            } else {
                this.h.set(0, 0, view.getWidth(), view.getHeight());
                this.U.set(0, 0, viewFindNextFocus.getWidth(), viewFindNextFocus.getHeight());
                offsetDescendantRectToMyCoords(view, this.h);
                offsetDescendantRectToMyCoords(viewFindNextFocus, this.U);
                int i3 = ti.f(this.k.f) == 1 ? -1 : 1;
                if ((this.h.left < this.U.left || this.h.right <= this.U.left) && this.h.right < this.U.right) {
                    i2 = 1;
                } else {
                    i2 = ((this.h.right > this.U.right || this.h.left >= this.U.right) && this.h.left > this.U.left) ? -1 : 0;
                }
                if ((this.h.top < this.U.top || this.h.bottom <= this.U.top) && this.h.bottom < this.U.bottom) {
                    b2 = 1;
                } else if ((this.h.bottom <= this.U.bottom && this.h.top < this.U.bottom) || this.h.top <= this.U.top) {
                    b2 = 0;
                }
                switch (i) {
                    case 1:
                        if (b2 < 0 || (b2 == 0 && i3 * i2 <= 0)) {
                            z2 = true;
                        }
                        break;
                    case 2:
                        if (b2 > 0 || (b2 == 0 && i3 * i2 >= 0)) {
                            z2 = true;
                        }
                        break;
                    case 17:
                        if (i2 < 0) {
                            z2 = true;
                        }
                        break;
                    case 33:
                        if (b2 < 0) {
                            z2 = true;
                        }
                        break;
                    case 66:
                        if (i2 > 0) {
                            z2 = true;
                        }
                        break;
                    case 130:
                        if (b2 > 0) {
                            z2 = true;
                        }
                        break;
                    default:
                        throw new IllegalArgumentException("Invalid direction: " + i + a());
                }
            }
        }
        return z2 ? viewFindNextFocus : super.focusSearch(view, i);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        afw afwVar = this.k;
        if (!(k()) && view2 != null) {
            a(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    private final void a(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        this.h.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof aga) {
            aga agaVar = (aga) layoutParams;
            if (!agaVar.e) {
                Rect rect = agaVar.d;
                this.h.left -= rect.left;
                this.h.right += rect.right;
                this.h.top -= rect.top;
                Rect rect2 = this.h;
                rect2.bottom = rect.bottom + rect2.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.h);
            offsetRectIntoDescendantCoords(view, this.h);
        }
        this.k.a(this, view, this.h, !this.q, view2 == null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.k.a(this, view, rect, z, false);
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (k()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0063  */
    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        float refreshRate;
        super.onAttachedToWindow();
        this.ae = 0;
        this.p = true;
        this.q = this.q && !isLayoutRequested();
        this.H = false;
        if (c) {
            this.A = (aea) aea.a.get();
            if (this.A == null) {
                this.A = new aea();
                Display displayB = ti.B(this);
                if (isInEditMode() || displayB == null) {
                    refreshRate = 60.0f;
                } else {
                    refreshRate = displayB.getRefreshRate();
                    if (refreshRate < 30.0f) {
                        refreshRate = 60.0f;
                    }
                }
                this.A.c = (long) (1.0E9f / refreshRate);
                aea.a.set(this.A);
            }
            this.A.b.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.y != null) {
            this.y.d();
        }
        q();
        this.p = false;
        if (this.k != null) {
            this.k.a(this, this.d);
        }
        this.ay.clear();
        removeCallbacks(this.az);
        while (aia.d.a() != null) {
        }
        if (c && this.A != null) {
            this.A.b.remove(this);
            this.A = null;
        }
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return this.p;
    }

    public final void a(String str) {
        if (k()) {
            if (str == null) {
                throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + a());
            }
            throw new IllegalStateException(str);
        }
        if (this.af > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(a()));
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        if (this.s) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 3 || action == 0) {
            this.o = null;
        }
        int size = this.n.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                z = false;
                break;
            }
            agb agbVar = (agb) this.n.get(i);
            if (agbVar.a(motionEvent) && action != 3) {
                this.o = agbVar;
                z = true;
                break;
            }
            i++;
        }
        if (z) {
            u();
            return true;
        }
        if (this.k == null) {
            return false;
        }
        boolean zI = this.k.i();
        boolean zJ = this.k.j();
        if (this.aj == null) {
            this.aj = VelocityTracker.obtain();
        }
        this.aj.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        switch (actionMasked) {
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
                if (this.aa) {
                    this.aa = false;
                }
                this.ai = motionEvent.getPointerId(0);
                int x = (int) (motionEvent.getX() + 0.5f);
                this.am = x;
                this.ak = x;
                int y = (int) (motionEvent.getY() + 0.5f);
                this.an = y;
                this.al = y;
                if (this.ah == 2) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                    a(1);
                }
                int[] iArr = this.ax;
                this.ax[1] = 0;
                iArr[0] = 0;
                int i2 = zI ? 1 : 0;
                if (zJ) {
                    i2 |= 2;
                }
                e(i2, 0);
                break;
            case 1:
                this.aj.clear();
                b(0);
                break;
            case 2:
                int iFindPointerIndex = motionEvent.findPointerIndex(this.ai);
                if (iFindPointerIndex < 0) {
                    Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.ai + " not found. Did any MotionEvents get skipped?");
                    return false;
                }
                int x2 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
                int y2 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
                if (this.ah != 1) {
                    int i3 = x2 - this.ak;
                    int i4 = y2 - this.al;
                    if (!zI || Math.abs(i3) <= this.ao) {
                        z2 = false;
                    } else {
                        this.am = x2;
                        z2 = true;
                    }
                    if (zJ && Math.abs(i4) > this.ao) {
                        this.an = y2;
                        z2 = true;
                    }
                    if (z2) {
                        a(1);
                    }
                }
                break;
                break;
            case 3:
                u();
                break;
            case 5:
                this.ai = motionEvent.getPointerId(actionIndex);
                int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                this.am = x3;
                this.ak = x3;
                int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                this.an = y3;
                this.al = y3;
                break;
            case 6:
                a(motionEvent);
                break;
        }
        return this.ah == 1;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        int size = this.n.size();
        for (int i = 0; i < size; i++) {
            ((agb) this.n.get(i)).a();
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    /* JADX WARN: Code duplicated, block: B:107:0x0237  */
    /* JADX WARN: Code duplicated, block: B:13:0x0019  */
    /* JADX WARN: Code duplicated, block: B:140:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:144:0x0031 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:145:0x004f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:15:0x0023  */
    /* JADX WARN: Code duplicated, block: B:26:0x004b A[LOOP:0: B:14:0x0021->B:26:0x004b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:27:0x004f A[EDGE_INSN: B:27:0x004f->B:18:0x0034 BREAK  A[LOOP:0: B:14:0x0021->B:26:0x004b]] */
    /* JADX WARN: Code duplicated, block: B:41:0x009c  */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        int size;
        int i;
        agb agbVar;
        boolean z2;
        boolean z3;
        int i2;
        int i3;
        if (this.s || this.aa) {
            return false;
        }
        int action = motionEvent.getAction();
        if (this.o != null) {
            if (action == 0) {
                this.o = null;
                if (action != 0) {
                    size = this.n.size();
                    i = 0;
                    while (true) {
                        if (i < size) {
                            agbVar = (agb) this.n.get(i);
                            if (agbVar.a(motionEvent)) {
                                this.o = agbVar;
                                z = true;
                                break;
                            }
                            i++;
                        } else {
                            z = false;
                            break;
                        }
                    }
                } else {
                    z = false;
                    break;
                }
            } else {
                this.o.b(motionEvent);
                if (action == 3 || action == 1) {
                    this.o = null;
                }
                z = true;
            }
        } else if (action != 0) {
            size = this.n.size();
            i = 0;
            while (true) {
                if (i < size) {
                    agbVar = (agb) this.n.get(i);
                    if (agbVar.a(motionEvent)) {
                        this.o = agbVar;
                        z = true;
                        break;
                    }
                    i++;
                } else {
                    z = false;
                    break;
                }
            }
        } else {
            z = false;
            break;
        }
        if (z) {
            u();
            return true;
        }
        if (this.k == null) {
            return false;
        }
        boolean zI = this.k.i();
        boolean zJ = this.k.j();
        if (this.aj == null) {
            this.aj = VelocityTracker.obtain();
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            int[] iArr = this.ax;
            this.ax[1] = 0;
            iArr[0] = 0;
        }
        motionEventObtain.offsetLocation(this.ax[0], this.ax[1]);
        switch (actionMasked) {
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
                this.ai = motionEvent.getPointerId(0);
                int x = (int) (motionEvent.getX() + 0.5f);
                this.am = x;
                this.ak = x;
                int y = (int) (motionEvent.getY() + 0.5f);
                this.an = y;
                this.al = y;
                int i4 = 0;
                if (zI) {
                    i4 = 1;
                }
                if (zJ) {
                    i4 |= 2;
                }
                e(i4, 0);
                z3 = false;
                if (!z3) {
                    this.aj.addMovement(motionEventObtain);
                }
                motionEventObtain.recycle();
                return true;
            case 1:
                this.aj.addMovement(motionEventObtain);
                this.aj.computeCurrentVelocity(1000, this.aq);
                float f = zI ? -this.aj.getXVelocity(this.ai) : 0.0f;
                float f2 = zJ ? -this.aj.getYVelocity(this.ai) : 0.0f;
                if (f != 0.0f || f2 != 0.0f) {
                    int i5 = (int) f;
                    int i6 = (int) f2;
                    if (this.k == null) {
                        Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                        z2 = false;
                    } else if (this.s) {
                        z2 = false;
                    } else {
                        boolean zI2 = this.k.i();
                        boolean zJ2 = this.k.j();
                        int i7 = (!zI2 || Math.abs(i5) < this.ap) ? 0 : i5;
                        int i8 = (!zJ2 || Math.abs(i6) < this.ap) ? 0 : i6;
                        if ((i7 != 0 || i8 != 0) && !dispatchNestedPreFling(i7, i8)) {
                            boolean z4 = zI2 || zJ2;
                            dispatchNestedFling(i7, i8, z4);
                            if (z4) {
                                int i9 = 0;
                                if (zI2) {
                                    i9 = 1;
                                }
                                if (zJ2) {
                                    i9 |= 2;
                                }
                                e(i9, 1);
                                int iMax = Math.max(-this.aq, Math.min(i7, this.aq));
                                int iMax2 = Math.max(-this.aq, Math.min(i8, this.aq));
                                agl aglVar = this.z;
                                aglVar.d.a(2);
                                aglVar.b = 0;
                                aglVar.a = 0;
                                aglVar.c.fling(0, 0, iMax, iMax2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
                                aglVar.a();
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                        } else {
                            z2 = false;
                        }
                    }
                    if (!z2) {
                        a(0);
                    }
                } else {
                    a(0);
                }
                t();
                z3 = true;
                if (!z3) {
                    this.aj.addMovement(motionEventObtain);
                }
                motionEventObtain.recycle();
                return true;
            case 2:
                int iFindPointerIndex = motionEvent.findPointerIndex(this.ai);
                if (iFindPointerIndex < 0) {
                    Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.ai + " not found. Did any MotionEvents get skipped?");
                    return false;
                }
                int x2 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
                int y2 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
                int i10 = this.am - x2;
                int i11 = this.an - y2;
                if (a(i10, i11, this.J, this.aw, 0)) {
                    i10 -= this.J[0];
                    i11 -= this.J[1];
                    motionEventObtain.offsetLocation(this.aw[0], this.aw[1]);
                    int[] iArr2 = this.ax;
                    iArr2[0] = iArr2[0] + this.aw[0];
                    int[] iArr3 = this.ax;
                    iArr3[1] = iArr3[1] + this.aw[1];
                }
                if (this.ah != 1) {
                    boolean z5 = false;
                    if (zI && Math.abs(i10) > this.ao) {
                        if (i10 > 0) {
                            i3 = i10 - this.ao;
                        } else {
                            i3 = this.ao + i10;
                        }
                        i10 = i3;
                        z5 = true;
                    }
                    if (zJ && Math.abs(i11) > this.ao) {
                        if (i11 > 0) {
                            i2 = i11 - this.ao;
                        } else {
                            i2 = this.ao + i11;
                        }
                        i11 = i2;
                        z5 = true;
                    }
                    if (z5) {
                        a(1);
                    }
                }
                if (this.ah == 1) {
                    this.am = x2 - this.aw[0];
                    this.an = y2 - this.aw[1];
                    if (a(zI ? i10 : 0, zJ ? i11 : 0, motionEventObtain)) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    if (this.A != null && (i10 != 0 || i11 != 0)) {
                        this.A.a(this, i10, i11);
                    }
                }
                z3 = false;
                if (!z3) {
                    this.aj.addMovement(motionEventObtain);
                }
                motionEventObtain.recycle();
                return true;
            case 3:
                u();
            case 4:
            default:
                z3 = false;
                if (!z3) {
                    this.aj.addMovement(motionEventObtain);
                }
                motionEventObtain.recycle();
                return true;
            case 5:
                this.ai = motionEvent.getPointerId(actionIndex);
                int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                this.am = x3;
                this.ak = x3;
                int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                this.an = y3;
                this.al = y3;
                z3 = false;
                if (!z3) {
                    this.aj.addMovement(motionEventObtain);
                }
                motionEventObtain.recycle();
                return true;
            case 6:
                a(motionEvent);
                z3 = false;
                if (!z3) {
                    this.aj.addMovement(motionEventObtain);
                }
                motionEventObtain.recycle();
                return true;
        }
    }

    private final void t() {
        boolean zIsFinished = false;
        if (this.aj != null) {
            this.aj.clear();
        }
        b(0);
        if (this.u != null) {
            this.u.onRelease();
            zIsFinished = this.u.isFinished();
        }
        if (this.v != null) {
            this.v.onRelease();
            zIsFinished |= this.v.isFinished();
        }
        if (this.w != null) {
            this.w.onRelease();
            zIsFinished |= this.w.isFinished();
        }
        if (this.x != null) {
            this.x.onRelease();
            zIsFinished |= this.x.isFinished();
        }
        if (zIsFinished) {
            ti.d(this);
        }
    }

    private final void u() {
        t();
        a(0);
    }

    private final void a(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.ai) {
            int i = actionIndex == 0 ? 1 : 0;
            this.ai = motionEvent.getPointerId(i);
            int x = (int) (motionEvent.getX(i) + 0.5f);
            this.am = x;
            this.ak = x;
            int y = (int) (motionEvent.getY(i) + 0.5f);
            this.an = y;
            this.al = y;
        }
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float axisValue;
        float f;
        if (this.k != null && !this.s && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                float f2 = this.k.j() ? -motionEvent.getAxisValue(9) : 0.0f;
                if (this.k.i()) {
                    f = f2;
                    axisValue = motionEvent.getAxisValue(10);
                } else {
                    f = f2;
                    axisValue = 0.0f;
                }
            } else if ((motionEvent.getSource() & 4194304) != 0) {
                axisValue = motionEvent.getAxisValue(26);
                if (this.k.j()) {
                    f = -axisValue;
                    axisValue = 0.0f;
                } else if (this.k.i()) {
                    f = 0.0f;
                } else {
                    axisValue = 0.0f;
                    f = 0.0f;
                }
            } else {
                axisValue = 0.0f;
                f = 0.0f;
            }
            if (f != 0.0f || axisValue != 0.0f) {
                a((int) (axisValue * this.ar), (int) (this.as * f), motionEvent);
            }
        }
        return false;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        boolean z = false;
        if (this.k == null) {
            c(i, i2);
            return;
        }
        if (this.k.g()) {
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.k.c(i, i2);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z = true;
            }
            if (!z && this.j != null) {
                if (this.C.d == 1) {
                    y();
                }
                this.k.a(i, i2);
                this.C.i = true;
                z();
                this.k.b(i, i2);
                if (this.k.m()) {
                    this.k.a(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                    this.C.i = true;
                    z();
                    this.k.b(i, i2);
                    return;
                }
                return;
            }
            return;
        }
        if (this.C.k) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        if (this.j != null) {
            this.C.e = this.j.a();
        } else {
            this.C.e = 0;
        }
        d();
        this.k.c(i, i2);
        a(false);
        this.C.g = false;
    }

    public final void c(int i, int i2) {
        setMeasuredDimension(afw.a(i, getPaddingLeft() + getPaddingRight(), ti.j(this)), afw.a(i2, getPaddingTop() + getPaddingBottom(), ti.k(this)));
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3 || i2 != i4) {
            s();
        }
    }

    public final void i() {
        this.ae++;
    }

    public final void b(boolean z) {
        int i;
        this.ae--;
        if (this.ae <= 0) {
            this.ae = 0;
            if (z) {
                int i2 = this.ab;
                this.ab = 0;
                if (i2 != 0 && j()) {
                    AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                    accessibilityEventObtain.setEventType(2048);
                    accessibilityEventObtain.setContentChangeTypes(i2);
                    sendAccessibilityEventUnchecked(accessibilityEventObtain);
                }
                for (int size = this.ay.size() - 1; size >= 0; size--) {
                    agm agmVar = (agm) this.ay.get(size);
                    if (agmVar.a.getParent() == this && !agmVar.b() && (i = agmVar.n) != -1) {
                        ti.b(agmVar.a, i);
                        agmVar.n = -1;
                    }
                }
                this.ay.clear();
            }
        }
    }

    public final boolean j() {
        return this.ac != null && this.ac.isEnabled();
    }

    public final boolean k() {
        return this.ae > 0;
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        int i = 0;
        if (k()) {
            int contentChangeTypes = accessibilityEvent != null ? accessibilityEvent.getContentChangeTypes() : 0;
            this.ab = (contentChangeTypes != 0 ? contentChangeTypes : 0) | this.ab;
            i = 1;
        }
        if (i == 0) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        }
    }

    public final void l() {
        if (!this.H && this.p) {
            ti.a(this, this.az);
            this.H = true;
        }
    }

    private final boolean v() {
        return this.y != null && this.k.f();
    }

    /* JADX WARN: Code duplicated, block: B:125:0x0312  */
    /* JADX WARN: Code duplicated, block: B:133:0x0331  */
    /* JADX WARN: Code duplicated, block: B:140:0x0347  */
    /* JADX WARN: Code duplicated, block: B:142:0x034f  */
    /* JADX WARN: Code duplicated, block: B:144:0x0356  */
    /* JADX WARN: Code duplicated, block: B:147:0x0363  */
    /* JADX WARN: Code duplicated, block: B:149:0x0369  */
    /* JADX WARN: Code duplicated, block: B:154:0x0376  */
    /* JADX WARN: Code duplicated, block: B:173:0x03cb  */
    /* JADX WARN: Code duplicated, block: B:174:0x03cd A[LOOP:4: B:146:0x0361->B:174:0x03cd, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:177:0x03d8  */
    /* JADX WARN: Code duplicated, block: B:180:0x03e0  */
    /* JADX WARN: Code duplicated, block: B:183:0x03eb A[LOOP:5: B:176:0x03d6->B:183:0x03eb, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:186:0x03f3  */
    /* JADX WARN: Code duplicated, block: B:212:0x03d0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:213:0x03d0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:214:0x0371 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:215:0x03ee A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:216:0x03de A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:217:0x03e8 A[SYNTHETIC] */
    private final void w() {
        agm agmVarC;
        View view;
        int i;
        int iA;
        int i2;
        int iMin;
        View view2;
        agm agmVarC2;
        agm agmVarC3;
        View viewFindViewById;
        if (this.j == null) {
            Log.e("RecyclerView", "No adapter attached; skipping layout");
            return;
        }
        if (this.k == null) {
            Log.e("RecyclerView", "No layout manager attached; skipping layout");
            return;
        }
        this.C.i = false;
        if (this.C.d == 1) {
            y();
            this.k.b(this);
            z();
        } else {
            abg abgVar = this.e;
            if (((abgVar.b.isEmpty() || abgVar.a.isEmpty()) ? false : true) || this.k.p != getWidth() || this.k.q != getHeight()) {
                this.k.b(this);
                z();
            } else {
                this.k.b(this);
            }
        }
        this.C.a(4);
        d();
        i();
        this.C.d = 1;
        if (this.C.j) {
            for (int iA2 = this.f.a() - 1; iA2 >= 0; iA2--) {
                agm agmVarC4 = c(this.f.b(iA2));
                if (!agmVarC4.b()) {
                    long jD = d(agmVarC4);
                    afq afqVar = this.y;
                    aft aftVar = new aft();
                    View view3 = agmVarC4.a;
                    aftVar.a = view3.getLeft();
                    aftVar.b = view3.getTop();
                    view3.getRight();
                    view3.getBottom();
                    agm agmVar = (agm) this.g.b.a(jD, null);
                    if (agmVar != null && !agmVar.b()) {
                        boolean zA = this.g.a(agmVar);
                        boolean zA2 = this.g.a(agmVarC4);
                        if (zA && agmVar == agmVarC4) {
                            this.g.b(agmVarC4, aftVar);
                        } else {
                            aft aftVarA = this.g.a(agmVar, 4);
                            this.g.b(agmVarC4, aftVar);
                            aft aftVarA2 = this.g.a(agmVarC4, 8);
                            if (aftVarA == null) {
                                int iA3 = this.f.a();
                                for (int i3 = 0; i3 < iA3; i3++) {
                                    agm agmVarC5 = c(this.f.b(i3));
                                    if (agmVarC5 != agmVarC4 && d(agmVarC5) == jD) {
                                        if (this.j != null && this.j.b) {
                                            throw new IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + agmVarC5 + " \n View Holder 2:" + agmVarC4 + a());
                                        }
                                        throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + agmVarC5 + " \n View Holder 2:" + agmVarC4 + a());
                                    }
                                }
                                Log.e("RecyclerView", "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + agmVar + " cannot be found but it is necessary for " + agmVarC4 + a());
                            } else {
                                agmVar.a(false);
                                if (zA) {
                                    a(agmVar);
                                }
                                if (agmVar != agmVarC4) {
                                    if (zA2) {
                                        a(agmVarC4);
                                    }
                                    agmVar.h = agmVarC4;
                                    a(agmVar);
                                    this.d.b(agmVar);
                                    agmVarC4.a(false);
                                    agmVarC4.i = agmVar;
                                }
                                if (this.y.a(agmVar, agmVarC4, aftVarA, aftVarA2)) {
                                    l();
                                }
                            }
                        }
                    } else {
                        this.g.b(agmVarC4, aftVar);
                    }
                }
            }
            ahz ahzVar = this.g;
            aib aibVar = this.aA;
            for (int size = ahzVar.a.size() - 1; size >= 0; size--) {
                agm agmVar2 = (agm) ahzVar.a.b(size);
                aia aiaVar = (aia) ahzVar.a.d(size);
                if ((aiaVar.a & 3) == 3) {
                    aibVar.a(agmVar2);
                } else if ((aiaVar.a & 1) != 0) {
                    if (aiaVar.b == null) {
                        aibVar.a(agmVar2);
                    } else {
                        aibVar.a(agmVar2, aiaVar.b, aiaVar.c);
                    }
                } else if ((aiaVar.a & 14) == 14) {
                    aibVar.b(agmVar2, aiaVar.b, aiaVar.c);
                } else if ((aiaVar.a & 12) == 12) {
                    aibVar.c(agmVar2, aiaVar.b, aiaVar.c);
                } else if ((aiaVar.a & 4) != 0) {
                    aibVar.a(agmVar2, aiaVar.b, null);
                } else if ((aiaVar.a & 8) != 0) {
                    aibVar.b(agmVar2, aiaVar.b, aiaVar.c);
                } else {
                    int i4 = aiaVar.a;
                }
                aia.a(aiaVar);
            }
        }
        this.k.a(this.d);
        this.C.b = this.C.e;
        this.t = false;
        this.ad = false;
        this.C.j = false;
        this.C.k = false;
        this.k.i = false;
        if (this.d.b != null) {
            this.d.b.clear();
        }
        if (this.k.m) {
            this.k.l = 0;
            this.k.m = false;
            this.d.b();
        }
        this.k.a(this.C);
        b(true);
        a(false);
        this.g.a();
        int i5 = this.au[0];
        int i6 = this.au[1];
        a(this.au);
        if ((this.au[0] == i5 && this.au[1] == i6) ? false : true) {
            d(0, 0);
        }
        if (this.at && this.j != null && hasFocus() && getDescendantFocusability() != 393216 && (getDescendantFocusability() != 131072 || !isFocused())) {
            if (!isFocused()) {
                if (this.f.d(getFocusedChild())) {
                    agmVarC = null;
                    if (this.C.m != -1 && this.j.b) {
                        long j = this.C.m;
                        if (this.j != null || !this.j.b) {
                            agmVarC = null;
                        } else {
                            int iB = this.f.b();
                            agm agmVar3 = null;
                            int i7 = 0;
                            while (true) {
                                if (i7 >= iB) {
                                    agmVarC = agmVar3;
                                    break;
                                }
                                agmVarC = c(this.f.c(i7));
                                if (agmVarC != null && !agmVarC.m() && agmVarC.e == j) {
                                    if (!this.f.d(agmVarC.a)) {
                                        break;
                                    }
                                } else {
                                    agmVarC = agmVar3;
                                }
                                i7++;
                                agmVar3 = agmVarC;
                            }
                        }
                    }
                    view = null;
                    if (agmVarC != null || this.f.d(agmVarC.a) || !agmVarC.a.hasFocusable()) {
                        if (this.f.a() > 0) {
                            if (this.C.l != -1) {
                                i = this.C.l;
                            } else {
                                i = 0;
                            }
                            iA = this.C.a();
                            i2 = i;
                            while (true) {
                                if (i2 < iA) {
                                    agmVarC3 = c(i2);
                                    if (agmVarC3 != null) {
                                        if (agmVarC3.a.hasFocusable()) {
                                            view2 = agmVarC3.a;
                                        } else {
                                            i2++;
                                        }
                                    }
                                    view = view2;
                                }
                                iMin = Math.min(iA, i) - 1;
                                while (true) {
                                    if (iMin >= 0) {
                                        agmVarC2 = c(iMin);
                                        if (agmVarC2 == null) {
                                            view2 = null;
                                            break;
                                        } else {
                                            if (agmVarC2.a.hasFocusable()) {
                                                view2 = agmVarC2.a;
                                                break;
                                            }
                                            iMin--;
                                        }
                                    } else {
                                        view2 = null;
                                        break;
                                    }
                                }
                                view = view2;
                            }
                        }
                    } else {
                        view = agmVarC.a;
                    }
                    if (view != null) {
                        if (this.C.n != -1 || (viewFindViewById = view.findViewById(this.C.n)) == null || !viewFindViewById.isFocusable()) {
                            viewFindViewById = view;
                        }
                        viewFindViewById.requestFocus();
                    }
                }
            } else {
                agmVarC = null;
                if (this.C.m != -1) {
                    long j2 = this.C.m;
                    if (this.j != null) {
                        agmVarC = null;
                    } else {
                        agmVarC = null;
                    }
                }
                view = null;
                if (agmVarC != null) {
                    if (this.f.a() > 0) {
                        if (this.C.l != -1) {
                            i = this.C.l;
                        } else {
                            i = 0;
                        }
                        iA = this.C.a();
                        i2 = i;
                        while (true) {
                            if (i2 < iA) {
                                agmVarC3 = c(i2);
                                if (agmVarC3 != null) {
                                    if (agmVarC3.a.hasFocusable()) {
                                        view2 = agmVarC3.a;
                                    } else {
                                        i2++;
                                    }
                                }
                                view = view2;
                            }
                            iMin = Math.min(iA, i) - 1;
                            while (true) {
                                if (iMin >= 0) {
                                    agmVarC2 = c(iMin);
                                    if (agmVarC2 == null) {
                                        view2 = null;
                                        break;
                                    } else {
                                        if (agmVarC2.a.hasFocusable()) {
                                            view2 = agmVarC2.a;
                                            break;
                                        }
                                        iMin--;
                                    }
                                } else {
                                    view2 = null;
                                    break;
                                }
                            }
                            view = view2;
                        }
                    }
                } else if (this.f.a() > 0) {
                    if (this.C.l != -1) {
                        i = this.C.l;
                    } else {
                        i = 0;
                    }
                    iA = this.C.a();
                    i2 = i;
                    while (true) {
                        if (i2 < iA) {
                            agmVarC3 = c(i2);
                            if (agmVarC3 != null) {
                                if (agmVarC3.a.hasFocusable()) {
                                    view2 = agmVarC3.a;
                                } else {
                                    i2++;
                                }
                            }
                            view = view2;
                        }
                        iMin = Math.min(iA, i) - 1;
                        while (true) {
                            if (iMin >= 0) {
                                agmVarC2 = c(iMin);
                                if (agmVarC2 == null) {
                                    view2 = null;
                                    break;
                                } else {
                                    if (agmVarC2.a.hasFocusable()) {
                                        view2 = agmVarC2.a;
                                        break;
                                    }
                                    iMin--;
                                }
                            } else {
                                view2 = null;
                                break;
                            }
                        }
                        view = view2;
                    }
                }
                if (view != null) {
                    if (this.C.n != -1) {
                        viewFindViewById = view;
                    } else {
                        viewFindViewById = view;
                    }
                    viewFindViewById.requestFocus();
                }
            }
        }
        x();
    }

    private final void x() {
        this.C.m = -1L;
        this.C.l = -1;
        this.C.n = -1;
    }

    private final void a(agk agkVar) {
        if (this.ah == 2) {
            OverScroller overScroller = this.z.c;
            overScroller.getFinalX();
            overScroller.getCurrX();
            overScroller.getFinalY();
            overScroller.getCurrY();
        }
    }

    private final void y() {
        View viewB;
        long j;
        int iD;
        this.C.a(1);
        a(this.C);
        this.C.i = false;
        d();
        this.g.a();
        i();
        if (this.t) {
            this.e.a();
            if (this.ad) {
                this.k.b();
            }
        }
        if (v()) {
            this.e.b();
        } else {
            this.e.e();
        }
        boolean z = this.E || this.F;
        this.C.j = this.q && this.y != null && (this.t || z) && (!this.t || this.j.b);
        this.C.k = this.C.j && z && !this.t && v();
        View focusedChild = (this.at && hasFocus() && this.j != null) ? getFocusedChild() : null;
        agm agmVarA = (focusedChild == null || (viewB = b(focusedChild)) == null) ? null : a(viewB);
        if (agmVarA == null) {
            x();
        } else {
            agk agkVar = this.C;
            if (this.j.b) {
                j = agmVarA.e;
            } else {
                j = -1;
            }
            agkVar.m = j;
            agk agkVar2 = this.C;
            if (this.t) {
                iD = -1;
            } else {
                iD = agmVarA.m() ? agmVarA.d : agmVarA.d();
            }
            agkVar2.l = iD;
            agk agkVar3 = this.C;
            View view = agmVarA.a;
            View view2 = view;
            int id = view.getId();
            while (!view2.isFocused() && (view2 instanceof ViewGroup) && view2.hasFocus()) {
                View focusedChild2 = ((ViewGroup) view2).getFocusedChild();
                id = focusedChild2.getId() != -1 ? focusedChild2.getId() : id;
                view2 = focusedChild2;
            }
            agkVar3.n = id;
        }
        this.C.h = this.C.j && this.F;
        this.F = false;
        this.E = false;
        this.C.g = this.C.k;
        this.C.e = this.j.a();
        a(this.au);
        if (this.C.j) {
            int iA = this.f.a();
            for (int i = 0; i < iA; i++) {
                agm agmVarC = c(this.f.b(i));
                if (!agmVarC.b() && (!agmVarC.j() || this.j.b)) {
                    afq afqVar = this.y;
                    afq.e(agmVarC);
                    agmVarC.p();
                    aft aftVar = new aft();
                    View view3 = agmVarC.a;
                    aftVar.a = view3.getLeft();
                    aftVar.b = view3.getTop();
                    view3.getRight();
                    view3.getBottom();
                    this.g.a(agmVarC, aftVar);
                    if (this.C.h && agmVarC.s() && !agmVarC.m() && !agmVarC.b() && !agmVarC.j()) {
                        this.g.a(d(agmVarC), agmVarC);
                    }
                }
            }
        }
        if (this.C.k) {
            int iB = this.f.b();
            for (int i2 = 0; i2 < iB; i2++) {
                agm agmVarC2 = c(this.f.c(i2));
                if (!agmVarC2.b() && agmVarC2.d == -1) {
                    agmVarC2.d = agmVarC2.c;
                }
            }
            boolean z2 = this.C.f;
            this.C.f = false;
            this.k.c(this.d, this.C);
            this.C.f = z2;
            for (int i3 = 0; i3 < this.f.a(); i3++) {
                agm agmVarC3 = c(this.f.b(i3));
                if (!agmVarC3.b()) {
                    aia aiaVar = (aia) this.g.a.get(agmVarC3);
                    if (!((aiaVar == null || (aiaVar.a & 4) == 0) ? false : true)) {
                        afq.e(agmVarC3);
                        boolean zA = agmVarC3.a(8192);
                        afq afqVar2 = this.y;
                        agmVarC3.p();
                        aft aftVar2 = new aft();
                        View view4 = agmVarC3.a;
                        aftVar2.a = view4.getLeft();
                        aftVar2.b = view4.getTop();
                        view4.getRight();
                        view4.getBottom();
                        if (zA) {
                            a(agmVarC3, aftVar2);
                        } else {
                            ahz ahzVar = this.g;
                            aia aiaVarA = (aia) ahzVar.a.get(agmVarC3);
                            if (aiaVarA == null) {
                                aiaVarA = aia.a();
                                ahzVar.a.put(agmVarC3, aiaVarA);
                            }
                            aiaVarA.a |= 2;
                            aiaVarA.b = aftVar2;
                        }
                    }
                }
            }
            A();
        } else {
            A();
        }
        b(true);
        a(false);
        this.C.d = 2;
    }

    private final void z() {
        d();
        i();
        this.C.a(6);
        this.e.e();
        this.C.e = this.j.a();
        this.C.c = 0;
        this.C.g = false;
        this.k.c(this.d, this.C);
        this.C.f = false;
        this.S = null;
        this.C.j = this.C.j && this.y != null;
        this.C.d = 4;
        b(true);
        a(false);
    }

    public final void a(agm agmVar, aft aftVar) {
        agmVar.a(0, 8192);
        if (this.C.h && agmVar.s() && !agmVar.m() && !agmVar.b()) {
            this.g.a(d(agmVar), agmVar);
        }
        this.g.a(agmVar, aftVar);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003d A[PHI: r2
  0x003d: PHI (r2v2 int) = (r2v1 int), (r2v6 int) binds: [B:9:0x0026, B:13:0x002f] A[DONT_GENERATE, DONT_INLINE]] */
    private final void a(int[] iArr) {
        int iC;
        int iA = this.f.a();
        if (iA == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MIN_VALUE;
        int i3 = 0;
        while (i3 < iA) {
            agm agmVarC = c(this.f.b(i3));
            if (agmVarC.b()) {
                iC = i2;
            } else {
                iC = agmVarC.c();
                if (iC < i) {
                    i = iC;
                }
                if (iC <= i2) {
                    iC = i2;
                }
            }
            i3++;
            i = i;
            i2 = iC;
        }
        iArr[0] = i;
        iArr[1] = i2;
    }

    @Override // android.view.ViewGroup
    public void removeDetachedView(View view, boolean z) {
        agm agmVarC = c(view);
        if (agmVarC != null) {
            if (agmVarC.n()) {
                agmVarC.i();
            } else if (!agmVarC.b()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + agmVarC + a());
            }
        }
        view.clearAnimation();
        c(view);
        super.removeDetachedView(view, z);
    }

    private final long d(agm agmVar) {
        return this.j.b ? agmVar.e : agmVar.c;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        qs.a("RV OnLayout");
        w();
        Trace.endSection();
        this.q = true;
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.W == 0 && !this.s) {
            super.requestLayout();
        } else {
            this.r = true;
        }
    }

    public final void m() {
        int iB = this.f.b();
        for (int i = 0; i < iB; i++) {
            ((aga) this.f.c(i).getLayoutParams()).e = true;
        }
        agf agfVar = this.d;
        int size = agfVar.c.size();
        for (int i2 = 0; i2 < size; i2++) {
            aga agaVar = (aga) ((agm) agfVar.c.get(i2)).a.getLayoutParams();
            if (agaVar != null) {
                agaVar.e = true;
            }
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        boolean z;
        boolean z2 = false;
        super.draw(canvas);
        int size = this.m.size();
        for (int i = 0; i < size; i++) {
            ((afv) this.m.get(i)).a(canvas, this);
        }
        if (this.u == null || this.u.isFinished()) {
            z = false;
        } else {
            int iSave = canvas.save();
            int paddingBottom = this.T ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate(paddingBottom + (-getHeight()), 0.0f);
            z = this.u != null && this.u.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        if (this.v != null && !this.v.isFinished()) {
            int iSave2 = canvas.save();
            if (this.T) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            z |= this.v != null && this.v.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        if (this.w != null && !this.w.isFinished()) {
            int iSave3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.T ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(-paddingTop, -width);
            z |= this.w != null && this.w.draw(canvas);
            canvas.restoreToCount(iSave3);
        }
        if (this.x != null && !this.x.isFinished()) {
            int iSave4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.T) {
                canvas.translate((-getWidth()) + getPaddingRight(), (-getHeight()) + getPaddingBottom());
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            if (this.x != null && this.x.draw(canvas)) {
                z2 = true;
            }
            z |= z2;
            canvas.restoreToCount(iSave4);
        }
        if ((z || this.y == null || this.m.size() <= 0 || !this.y.b()) ? z : true) {
            ti.d(this);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.m.size();
        for (int i = 0; i < size; i++) {
            this.m.get(i);
        }
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof aga) && this.k.a((aga) layoutParams);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        if (this.k == null) {
            throw new IllegalStateException("RecyclerView has no LayoutManager" + a());
        }
        return this.k.e();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        if (this.k == null) {
            throw new IllegalStateException("RecyclerView has no LayoutManager" + a());
        }
        return this.k.a(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (this.k == null) {
            throw new IllegalStateException("RecyclerView has no LayoutManager" + a());
        }
        return this.k.a(layoutParams);
    }

    private final void A() {
        int iB = this.f.b();
        for (int i = 0; i < iB; i++) {
            agm agmVarC = c(this.f.c(i));
            if (!agmVarC.b()) {
                agmVarC.a();
            }
        }
        agf agfVar = this.d;
        int size = agfVar.c.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((agm) agfVar.c.get(i2)).a();
        }
        int size2 = agfVar.a.size();
        for (int i3 = 0; i3 < size2; i3++) {
            ((agm) agfVar.a.get(i3)).a();
        }
        if (agfVar.b != null) {
            int size3 = agfVar.b.size();
            for (int i4 = 0; i4 < size3; i4++) {
                ((agm) agfVar.b.get(i4)).a();
            }
        }
    }

    public final void a(int i, int i2, boolean z) {
        int i3 = i + i2;
        int iB = this.f.b();
        for (int i4 = 0; i4 < iB; i4++) {
            agm agmVarC = c(this.f.c(i4));
            if (agmVarC != null && !agmVarC.b()) {
                if (agmVarC.c >= i3) {
                    agmVarC.a(-i2, z);
                    this.C.f = true;
                } else if (agmVarC.c >= i) {
                    agmVarC.b(8);
                    agmVarC.a(-i2, z);
                    agmVarC.c = i - 1;
                    this.C.f = true;
                }
            }
        }
        agf agfVar = this.d;
        int i5 = i + i2;
        for (int size = agfVar.c.size() - 1; size >= 0; size--) {
            agm agmVar = (agm) agfVar.c.get(size);
            if (agmVar != null) {
                if (agmVar.c >= i5) {
                    agmVar.a(-i2, z);
                } else if (agmVar.c >= i) {
                    agmVar.b(8);
                    agfVar.b(size);
                }
            }
        }
        requestLayout();
    }

    public final void c(boolean z) {
        this.ad |= z;
        this.t = true;
        int iB = this.f.b();
        for (int i = 0; i < iB; i++) {
            agm agmVarC = c(this.f.c(i));
            if (agmVarC != null && !agmVarC.b()) {
                agmVarC.b(6);
            }
        }
        m();
        agf agfVar = this.d;
        int size = agfVar.c.size();
        for (int i2 = 0; i2 < size; i2++) {
            agm agmVar = (agm) agfVar.c.get(i2);
            if (agmVar != null) {
                agmVar.b(6);
                agmVar.a((Object) null);
            }
        }
        if (agfVar.e.j == null || !agfVar.e.j.b) {
            agfVar.c();
        }
    }

    public final agm a(View view) {
        ViewParent parent = view.getParent();
        if (parent != null && parent != this) {
            throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
        }
        return c(view);
    }

    public final View b(View view) {
        Object parent = view.getParent();
        View view2 = view;
        while (parent != null && parent != this && (parent instanceof View)) {
            View view3 = (View) parent;
            view2 = view3;
            parent = view3.getParent();
        }
        if (parent == this) {
            return view2;
        }
        return null;
    }

    public static agm c(View view) {
        if (view == null) {
            return null;
        }
        return ((aga) view.getLayoutParams()).c;
    }

    private final agm c(int i) {
        if (this.t) {
            return null;
        }
        int iB = this.f.b();
        int i2 = 0;
        agm agmVar = null;
        while (i2 < iB) {
            agm agmVarC = c(this.f.c(i2));
            if (agmVarC == null || agmVarC.m() || c(agmVarC) != i) {
                agmVarC = agmVar;
            } else if (!this.f.d(agmVarC.a)) {
                return agmVarC;
            }
            i2++;
            agmVar = agmVarC;
        }
        return agmVar;
    }

    public static void a(View view, Rect rect) {
        aga agaVar = (aga) view.getLayoutParams();
        Rect rect2 = agaVar.d;
        rect.set((view.getLeft() - rect2.left) - agaVar.leftMargin, (view.getTop() - rect2.top) - agaVar.topMargin, view.getRight() + rect2.right + agaVar.rightMargin, agaVar.bottomMargin + rect2.bottom + view.getBottom());
    }

    public final Rect d(View view) {
        aga agaVar = (aga) view.getLayoutParams();
        if (!agaVar.e) {
            return agaVar.d;
        }
        if (this.C.g && (agaVar.c.s() || agaVar.c.j())) {
            return agaVar.d;
        }
        Rect rect = agaVar.d;
        rect.set(0, 0, 0, 0);
        int size = this.m.size();
        for (int i = 0; i < size; i++) {
            this.h.set(0, 0, 0, 0);
            Rect rect2 = this.h;
            ((aga) view.getLayoutParams()).c.c();
            rect2.set(0, 0, 0, 0);
            rect.left += this.h.left;
            rect.top += this.h.top;
            rect.right += this.h.right;
            rect.bottom += this.h.bottom;
        }
        agaVar.e = false;
        return rect;
    }

    public final void d(int i, int i2) {
        this.af++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX, scrollY);
        if (this.D != null) {
            for (int size = this.D.size() - 1; size >= 0; size--) {
                ((agc) this.D.get(size)).a(this);
            }
        }
        this.af--;
    }

    public final boolean n() {
        return !this.q || this.t || this.e.d();
    }

    public static RecyclerView e(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            RecyclerView recyclerViewE = e(viewGroup.getChildAt(i));
            if (recyclerViewE != null) {
                return recyclerViewE;
            }
        }
        return null;
    }

    public static void b(agm agmVar) {
        if (agmVar.b != null) {
            View view = (View) agmVar.b.get();
            while (view != null) {
                if (view != agmVar.a) {
                    Object parent = view.getParent();
                    view = parent instanceof View ? (View) parent : null;
                } else {
                    return;
                }
            }
            agmVar.b = null;
        }
    }

    public static long o() {
        if (c) {
            return System.nanoTime();
        }
        return 0L;
    }

    public final boolean a(agm agmVar, int i) {
        if (k()) {
            agmVar.n = i;
            this.ay.add(agmVar);
            return false;
        }
        ti.b(agmVar.a, i);
        return true;
    }

    public final int c(agm agmVar) {
        if (agmVar.a(524) || !agmVar.l()) {
            return -1;
        }
        abg abgVar = this.e;
        int i = agmVar.c;
        int size = abgVar.a.size();
        for (int i2 = 0; i2 < size; i2++) {
            abi abiVar = (abi) abgVar.a.get(i2);
            switch (abiVar.a) {
                case 1:
                    if (abiVar.b <= i) {
                        i += abiVar.d;
                    }
                    break;
                case 2:
                    if (abiVar.b > i) {
                        continue;
                    } else {
                        if (abiVar.b + abiVar.d > i) {
                            return -1;
                        }
                        i -= abiVar.d;
                    }
                    break;
                case 8:
                    if (abiVar.b == i) {
                        i = abiVar.d;
                    } else {
                        if (abiVar.b < i) {
                            i--;
                        }
                        if (abiVar.d <= i) {
                            i++;
                        }
                    }
                    break;
            }
        }
        return i;
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        p().a(z);
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return p().a;
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i) {
        return p().a(i, 0);
    }

    private final boolean e(int i, int i2) {
        return p().a(i, i2);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        p().b(0);
    }

    public final void b(int i) {
        p().b(i);
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return p().a(0);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return p().a(i, i2, i3, i4, iArr);
    }

    public final boolean a(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        return p().b(i, i2, i3, i4, iArr, i5, null);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return p().a(i, i2, iArr, iArr2, 0);
    }

    public final boolean a(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return p().a(i, i2, iArr, iArr2, i3);
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return p().a(f, f2, z);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f, float f2) {
        return p().a(f, f2);
    }

    public final td p() {
        if (this.av == null) {
            this.av = new td(this);
        }
        return this.av;
    }

    static {
        b = Build.VERSION.SDK_INT >= 23;
        c = true;
        O = false;
        P = false;
        Q = new Class[]{Context.class, AttributeSet.class, Integer.TYPE, Integer.TYPE};
        L = new afi();
    }
}

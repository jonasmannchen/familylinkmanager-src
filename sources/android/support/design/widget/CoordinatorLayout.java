package android.support.design.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.chimeraresources.R;
import com.google.android.gms.kids.aidl.IKidsInternalService;
import flm.bbx;
import flm.dy;
import flm.hq;
import flm.hr;
import flm.hs;
import flm.ht;
import flm.hu;
import flm.hv;
import flm.hw;
import flm.hx;
import flm.hz;
import flm.sk;
import flm.sm;
import flm.sz;
import flm.te;
import flm.tg;
import flm.th;
import flm.ti;
import flm.tz;
import flm.up;
import flm.vi;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements te {
    private static final String f;
    private static final Class[] g;
    private static final ThreadLocal h;
    private static final Comparator i;
    private static final sk j;
    public final up a;
    public final List b;
    public tz c;
    public boolean d;
    public ViewGroup.OnHierarchyChangeListener e;
    private final List k;
    private final List l;
    private final int[] m;
    private boolean n;
    private boolean o;
    private int[] p;
    private View q;
    private View r;
    private hw s;
    private boolean t;
    private Drawable u;
    private th v;
    private final tg w;

    private static Rect a() {
        Rect rect = (Rect) j.a();
        return rect == null ? new Rect() : rect;
    }

    private static void a(Rect rect) {
        rect.setEmpty();
        j.a(rect);
    }

    public CoordinatorLayout(Context context) {
        this(context, null);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.coordinatorLayoutStyle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoordinatorLayout(Context context, AttributeSet attributeSet, int i2) {
        TypedArray typedArrayObtainStyledAttributes;
        super(context, attributeSet, i2);
        this.k = new ArrayList();
        this.a = new up();
        this.l = new ArrayList();
        this.b = new ArrayList();
        this.m = new int[2];
        this.w = new tg();
        if (i2 == 0) {
            typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, dy.a, 0, R.style.Widget_Support_CoordinatorLayout);
        } else {
            typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, dy.a, i2, 0);
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(dy.j, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            this.p = resources.getIntArray(resourceId);
            float f2 = resources.getDisplayMetrics().density;
            int length = this.p.length;
            for (int i3 = 0; i3 < length; i3++) {
                this.p[i3] = (int) (this.p[i3] * f2);
            }
        }
        this.u = typedArrayObtainStyledAttributes.getDrawable(dy.k);
        typedArrayObtainStyledAttributes.recycle();
        b();
        super.setOnHierarchyChangeListener(new hu(this));
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.e = onHierarchyChangeListener;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        a(false);
        if (this.t) {
            if (this.s == null) {
                this.s = new hw(this);
            }
            getViewTreeObserver().addOnPreDrawListener(this.s);
        }
        if (this.c == null && ti.p(this)) {
            ti.o(this);
        }
        this.o = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a(false);
        if (this.t && this.s != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.s);
        }
        if (this.r != null) {
            onStopNestedScroll(this.r);
        }
        this.o = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        boolean state = false;
        Drawable drawable = this.u;
        if (drawable != null && drawable.isStateful()) {
            state = drawable.setState(drawableState) | false;
        }
        if (state) {
            invalidate();
        }
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.u;
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
        super.setVisibility(i2);
        boolean z = i2 == 0;
        if (this.u != null && this.u.isVisible() != z) {
            this.u.setVisible(z, false);
        }
    }

    private final void a(boolean z) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            hs hsVar = ((hv) childAt.getLayoutParams()).a;
            if (hsVar != null) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z) {
                    hsVar.a(this, childAt, motionEventObtain);
                } else {
                    hsVar.b(this, childAt, motionEventObtain);
                }
                motionEventObtain.recycle();
            }
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            ((hv) getChildAt(i3).getLayoutParams()).m = false;
        }
        this.q = null;
        this.n = false;
    }

    private final boolean a(MotionEvent motionEvent, int i2) {
        boolean z;
        MotionEvent motionEventObtain;
        boolean z2;
        boolean z3;
        boolean zB = false;
        boolean z4 = false;
        int actionMasked = motionEvent.getActionMasked();
        List list = this.l;
        list.clear();
        boolean zIsChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i3 = childCount - 1; i3 >= 0; i3--) {
            list.add(getChildAt(zIsChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i3) : i3));
        }
        if (i != null) {
            Collections.sort(list, i);
        }
        int size = list.size();
        int i4 = 0;
        MotionEvent motionEvent2 = null;
        while (i4 < size) {
            View view = (View) list.get(i4);
            hv hvVar = (hv) view.getLayoutParams();
            hs hsVar = hvVar.a;
            if ((zB || z4) && actionMasked != 0) {
                if (hsVar != null) {
                    if (motionEvent2 == null) {
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    } else {
                        motionEventObtain = motionEvent2;
                    }
                    switch (i2) {
                        case bbx.MSG_UNBIND_SERVICE /* 0 */:
                            hsVar.a(this, view, motionEventObtain);
                            z2 = z4;
                            z = zB;
                            continue;
                        case 1:
                            hsVar.b(this, view, motionEventObtain);
                            break;
                    }
                    z2 = z4;
                    z = zB;
                } else {
                    motionEventObtain = motionEvent2;
                    z = zB;
                    z2 = z4;
                }
            } else {
                if (!zB && hsVar != null) {
                    switch (i2) {
                        case bbx.MSG_UNBIND_SERVICE /* 0 */:
                            zB = hsVar.a(this, view, motionEvent);
                            break;
                        case 1:
                            zB = hsVar.b(this, view, motionEvent);
                            break;
                    }
                    if (zB) {
                        this.q = view;
                    }
                }
                z = zB;
                if (hvVar.a == null) {
                    hvVar.m = false;
                }
                boolean z5 = hvVar.m;
                if (hvVar.m) {
                    z3 = true;
                } else {
                    boolean z6 = hvVar.m;
                    if (hvVar.a != null) {
                        hs hsVar2 = hvVar.a;
                    }
                    z3 = z6 | false;
                    hvVar.m = z3;
                }
                boolean z7 = z3 && !z5;
                if (z3 && !z7) {
                    list.clear();
                    return z;
                }
                MotionEvent motionEvent3 = motionEvent2;
                z2 = z7;
                motionEventObtain = motionEvent3;
            }
            i4++;
            z4 = z2;
            zB = z;
            motionEvent2 = motionEventObtain;
        }
        z = zB;
        list.clear();
        return z;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            a(true);
        }
        boolean zA = a(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            a(true);
        }
        return zA;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002b  */
    /* JADX WARN: Code duplicated, block: B:14:0x0033  */
    /* JADX WARN: Code duplicated, block: B:17:0x003a  */
    /* JADX WARN: Code duplicated, block: B:19:0x003e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:20:0x0040  */
    /* JADX WARN: Code duplicated, block: B:21:0x004e  */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean zOnTouchEvent;
        MotionEvent motionEventObtain;
        int actionMasked = motionEvent.getActionMasked();
        if (this.q == null) {
            boolean zA = a(motionEvent, 1);
            if (zA) {
                z = zA;
            } else {
                z = zA;
                zOnTouchEvent = false;
            }
            if (this.q == null) {
                zOnTouchEvent |= super.onTouchEvent(motionEvent);
                motionEventObtain = null;
            } else if (z) {
                motionEventObtain = null;
            } else {
                long jUptimeMillis = SystemClock.uptimeMillis();
                motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                super.onTouchEvent(motionEventObtain);
            }
            if (motionEventObtain != null) {
                motionEventObtain.recycle();
            }
            if (actionMasked != 1 || actionMasked == 3) {
                a(false);
            }
            return zOnTouchEvent;
        }
        z = false;
        hs hsVar = ((hv) this.q.getLayoutParams()).a;
        zOnTouchEvent = hsVar != null ? hsVar.b(this, this.q, motionEvent) : false;
        if (this.q == null) {
            zOnTouchEvent |= super.onTouchEvent(motionEvent);
            motionEventObtain = null;
        } else if (z) {
            motionEventObtain = null;
        } else {
            long jUptimeMillis2 = SystemClock.uptimeMillis();
            motionEventObtain = MotionEvent.obtain(jUptimeMillis2, jUptimeMillis2, 3, 0.0f, 0.0f, 0);
            super.onTouchEvent(motionEventObtain);
        }
        if (motionEventObtain != null) {
            motionEventObtain.recycle();
        }
        if (actionMasked != 1) {
            a(false);
        } else {
            a(false);
        }
        return zOnTouchEvent;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (z && !this.n) {
            a(false);
            this.n = true;
        }
    }

    private final int b(int i2) {
        if (this.p == null) {
            Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + i2);
            return 0;
        }
        if (i2 < 0 || i2 >= this.p.length) {
            Log.e("CoordinatorLayout", "Keyline index " + i2 + " out of range for " + this);
            return 0;
        }
        return this.p[i2];
    }

    public static hs a(Context context, AttributeSet attributeSet, String str) {
        Map map;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith(".")) {
            str = context.getPackageName() + str;
        } else if (str.indexOf(46) < 0 && !TextUtils.isEmpty(f)) {
            str = f + '.' + str;
        }
        try {
            Map map2 = (Map) h.get();
            if (map2 == null) {
                HashMap map3 = new HashMap();
                h.set(map3);
                map = map3;
            } else {
                map = map2;
            }
            Constructor<?> constructor = (Constructor) map.get(str);
            if (constructor == null) {
                constructor = context.getClassLoader().loadClass(str).getConstructor(g);
                constructor.setAccessible(true);
                map.put(str, constructor);
            }
            return (hs) constructor.newInstance(context, attributeSet);
        } catch (Exception e) {
            throw new RuntimeException("Could not inflate Behavior subclass " + str, e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static hv b(View view) {
        hv hvVar = (hv) view.getLayoutParams();
        if (!hvVar.b) {
            if (view instanceof hr) {
                hs hsVarA = ((hr) view).a();
                if (hsVarA == null) {
                    Log.e("CoordinatorLayout", "Attached behavior class is null");
                }
                hvVar.a(hsVarA);
                hvVar.b = true;
            } else {
                ht htVar = null;
                for (Class<?> superclass = view.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                    htVar = (ht) superclass.getAnnotation(ht.class);
                    if (htVar != null) {
                        break;
                    }
                }
                ht htVar2 = htVar;
                if (htVar2 != null) {
                    try {
                        hvVar.a((hs) htVar2.a().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                    } catch (Exception e) {
                        Log.e("CoordinatorLayout", "Default behavior class " + htVar2.a().getName() + " could not be instantiated. Did you forget a default constructor?", e);
                    }
                }
                hvVar.b = true;
            }
        }
        return hvVar;
    }

    @Override // android.view.View
    protected int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    @Override // android.view.View
    protected int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    public final void a(View view, int i2, int i3, int i4, int i5) {
        measureChildWithMargins(view, i2, i3, i4, i5);
    }

    /* JADX WARN: Code duplicated, block: B:184:0x011a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:47:0x00de  */
    /* JADX WARN: Code duplicated, block: B:49:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:66:0x0122  */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:68:0x012c
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    @Override // android.view.View
    protected void onMeasure(int r26, int r27) {
        /*
            Method dump skipped, instruction units count: 982
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    public final void a(View view, int i2) {
        int i3;
        int i4;
        hv hvVar = (hv) view.getLayoutParams();
        if (hvVar.k == null && hvVar.f != -1) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        if (hvVar.k != null) {
            View view2 = hvVar.k;
            Rect rectA = a();
            Rect rectA2 = a();
            try {
                vi.a(this, view2, rectA);
                hv hvVar2 = (hv) view.getLayoutParams();
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                a(i2, rectA, rectA2, hvVar2, measuredWidth, measuredHeight);
                a(hvVar2, rectA2, measuredWidth, measuredHeight);
                view.layout(rectA2.left, rectA2.top, rectA2.right, rectA2.bottom);
                return;
            } finally {
                a(rectA);
                a(rectA2);
            }
        }
        if (hvVar.e >= 0) {
            int i5 = hvVar.e;
            hv hvVar3 = (hv) view.getLayoutParams();
            int iA = sz.a(d(hvVar3.c), i2);
            int i6 = iA & 7;
            int i7 = iA & 112;
            int width = getWidth();
            int height = getHeight();
            int measuredWidth2 = view.getMeasuredWidth();
            int measuredHeight2 = view.getMeasuredHeight();
            if (i2 == 1) {
                i5 = width - i5;
            }
            int iB = b(i5) - measuredWidth2;
            switch (i6) {
                case 1:
                    i3 = iB + (measuredWidth2 / 2);
                    break;
                case 5:
                    i3 = iB + measuredWidth2;
                    break;
                default:
                    i3 = iB;
                    break;
            }
            switch (i7) {
                case 16:
                    i4 = (measuredHeight2 / 2) + 0;
                    break;
                case 80:
                    i4 = measuredHeight2 + 0;
                    break;
                default:
                    i4 = 0;
                    break;
            }
            int iMax = Math.max(getPaddingLeft() + hvVar3.leftMargin, Math.min(i3, ((width - getPaddingRight()) - measuredWidth2) - hvVar3.rightMargin));
            int iMax2 = Math.max(getPaddingTop() + hvVar3.topMargin, Math.min(i4, ((height - getPaddingBottom()) - measuredHeight2) - hvVar3.bottomMargin));
            view.layout(iMax, iMax2, iMax + measuredWidth2, iMax2 + measuredHeight2);
            return;
        }
        hv hvVar4 = (hv) view.getLayoutParams();
        Rect rectA3 = a();
        rectA3.set(getPaddingLeft() + hvVar4.leftMargin, getPaddingTop() + hvVar4.topMargin, (getWidth() - getPaddingRight()) - hvVar4.rightMargin, (getHeight() - getPaddingBottom()) - hvVar4.bottomMargin);
        if (this.c != null && ti.p(this) && !ti.p(view)) {
            rectA3.left += this.c.a();
            rectA3.top += this.c.b();
            rectA3.right -= this.c.c();
            rectA3.bottom -= this.c.d();
        }
        Rect rectA4 = a();
        sz.a(c(hvVar4.c), view.getMeasuredWidth(), view.getMeasuredHeight(), rectA3, rectA4, i2);
        view.layout(rectA4.left, rectA4.top, rectA4.right, rectA4.bottom);
        a(rectA3);
        a(rectA4);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        hs hsVar;
        int iF = ti.f(this);
        int size = this.k.size();
        for (int i6 = 0; i6 < size; i6++) {
            View view = (View) this.k.get(i6);
            if (view.getVisibility() != 8 && ((hsVar = ((hv) view.getLayoutParams()).a) == null || !hsVar.a(this, view, iF))) {
                a(view, iF);
            }
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.d && this.u != null) {
            int iB = this.c != null ? this.c.b() : 0;
            if (iB > 0) {
                this.u.setBounds(0, 0, getWidth(), iB);
                this.u.draw(canvas);
            }
        }
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        b();
    }

    private final void a(View view, boolean z, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z) {
            vi.a(this, view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    private static void a(int i2, Rect rect, Rect rect2, hv hvVar, int i3, int i4) {
        int iWidth;
        int iHeight;
        int i5 = hvVar.c;
        if (i5 == 0) {
            i5 = 17;
        }
        int iA = sz.a(i5, i2);
        int iA2 = sz.a(c(hvVar.d), i2);
        int i6 = iA & 7;
        int i7 = iA & 112;
        int i8 = iA2 & 112;
        switch (iA2 & 7) {
            case 1:
                iWidth = (rect.width() / 2) + rect.left;
                break;
            case 5:
                iWidth = rect.right;
                break;
            default:
                iWidth = rect.left;
                break;
        }
        switch (i8) {
            case 16:
                iHeight = rect.top + (rect.height() / 2);
                break;
            case 80:
                iHeight = rect.bottom;
                break;
            default:
                iHeight = rect.top;
                break;
        }
        switch (i6) {
            case 1:
                iWidth -= i3 / 2;
                break;
            case 5:
                break;
            default:
                iWidth -= i3;
                break;
        }
        switch (i7) {
            case 16:
                iHeight -= i4 / 2;
                break;
            case 80:
                break;
            default:
                iHeight -= i4;
                break;
        }
        rect2.set(iWidth, iHeight, iWidth + i3, iHeight + i4);
    }

    private final void a(hv hvVar, Rect rect, int i2, int i3) {
        int width = getWidth();
        int height = getHeight();
        int iMax = Math.max(getPaddingLeft() + hvVar.leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i2) - hvVar.rightMargin));
        int iMax2 = Math.max(getPaddingTop() + hvVar.topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i3) - hvVar.bottomMargin));
        rect.set(iMax, iMax2, iMax + i2, iMax2 + i3);
    }

    private static int c(int i2) {
        int i3 = (i2 & 7) == 0 ? 8388611 | i2 : i2;
        if ((i3 & 112) == 0) {
            return i3 | 48;
        }
        return i3;
    }

    private static int d(int i2) {
        if (i2 == 0) {
            return 8388661;
        }
        return i2;
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j2) {
        view.getLayoutParams();
        return super.drawChild(canvas, view, j2);
    }

    /* JADX WARN: Code duplicated, block: B:115:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:56:0x0136  */
    public final void a(int i2) {
        int i3;
        hs hsVar;
        boolean zA;
        boolean z;
        int i4;
        int height;
        int i5;
        hs hsVar2;
        int iF = ti.f(this);
        int size = this.k.size();
        Rect rectA = a();
        Rect rectA2 = a();
        Rect rectA3 = a();
        for (int i6 = 0; i6 < size; i6++) {
            View view = (View) this.k.get(i6);
            hv hvVar = (hv) view.getLayoutParams();
            if (i2 != 0 || view.getVisibility() != 8) {
                for (int i7 = 0; i7 < i6; i7++) {
                    if (hvVar.l == ((View) this.k.get(i7))) {
                        hv hvVar2 = (hv) view.getLayoutParams();
                        if (hvVar2.k != null) {
                            Rect rectA4 = a();
                            Rect rectA5 = a();
                            Rect rectA6 = a();
                            vi.a(this, hvVar2.k, rectA4);
                            a(view, false, rectA5);
                            int measuredWidth = view.getMeasuredWidth();
                            int measuredHeight = view.getMeasuredHeight();
                            a(iF, rectA4, rectA6, hvVar2, measuredWidth, measuredHeight);
                            boolean z2 = (rectA6.left == rectA5.left && rectA6.top == rectA5.top) ? false : true;
                            a(hvVar2, rectA6, measuredWidth, measuredHeight);
                            int i8 = rectA6.left - rectA5.left;
                            int i9 = rectA6.top - rectA5.top;
                            if (i8 != 0) {
                                ti.e(view, i8);
                            }
                            if (i9 != 0) {
                                ti.d(view, i9);
                            }
                            if (z2 && (hsVar2 = hvVar2.a) != null) {
                                hsVar2.a(this, view, hvVar2.k);
                            }
                            a(rectA4);
                            a(rectA5);
                            a(rectA6);
                        }
                    }
                }
                a(view, true, rectA2);
                if (hvVar.g != 0 && !rectA2.isEmpty()) {
                    int iA = sz.a(hvVar.g, iF);
                    switch (iA & 112) {
                        case IKidsInternalService.Stub.TRANSACTION_getMemberSvExitState /* 48 */:
                            rectA.top = Math.max(rectA.top, rectA2.bottom);
                            break;
                        case 80:
                            rectA.bottom = Math.max(rectA.bottom, getHeight() - rectA2.top);
                            break;
                    }
                    switch (iA & 7) {
                        case 3:
                            rectA.left = Math.max(rectA.left, rectA2.right);
                            break;
                        case 5:
                            rectA.right = Math.max(rectA.right, getWidth() - rectA2.left);
                            break;
                    }
                }
                if (hvVar.h != 0 && view.getVisibility() == 0 && ti.w(view) && view.getWidth() > 0 && view.getHeight() > 0) {
                    hv hvVar3 = (hv) view.getLayoutParams();
                    hs hsVar3 = hvVar3.a;
                    Rect rectA7 = a();
                    Rect rectA8 = a();
                    rectA8.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                    if (hsVar3 != null && hsVar3.a(this, view, rectA7)) {
                        if (!rectA8.contains(rectA7)) {
                            throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + rectA7.toShortString() + " | Bounds:" + rectA8.toShortString());
                        }
                    } else {
                        rectA7.set(rectA8);
                    }
                    a(rectA8);
                    if (rectA7.isEmpty()) {
                        a(rectA7);
                    } else {
                        int iA2 = sz.a(hvVar3.h, iF);
                        boolean z3 = false;
                        if ((iA2 & 48) == 48 && (i5 = (rectA7.top - hvVar3.topMargin) - hvVar3.j) < rectA.top) {
                            d(view, rectA.top - i5);
                            z3 = true;
                        }
                        if ((iA2 & 80) == 80 && (height = ((getHeight() - rectA7.bottom) - hvVar3.bottomMargin) + hvVar3.j) < rectA.bottom) {
                            d(view, height - rectA.bottom);
                            z3 = true;
                        }
                        if (!z3) {
                            d(view, 0);
                        }
                        boolean z4 = false;
                        if ((iA2 & 3) == 3 && (i4 = (rectA7.left - hvVar3.leftMargin) - hvVar3.i) < rectA.left) {
                            c(view, rectA.left - i4);
                            z4 = true;
                        }
                        if ((iA2 & 5) == 5) {
                            int width = hvVar3.i + ((getWidth() - rectA7.right) - hvVar3.rightMargin);
                            if (width < rectA.right) {
                                c(view, width - rectA.right);
                                z = true;
                            } else {
                                z = z4;
                            }
                        } else {
                            z = z4;
                        }
                        if (!z) {
                            c(view, 0);
                        }
                        a(rectA7);
                    }
                }
                if (i2 != 2) {
                    rectA3.set(((hv) view.getLayoutParams()).o);
                    if (!rectA3.equals(rectA2)) {
                        ((hv) view.getLayoutParams()).o.set(rectA2);
                        for (i3 = i6 + 1; i3 < size; i3++) {
                            View view2 = (View) this.k.get(i3);
                            hv hvVar4 = (hv) view2.getLayoutParams();
                            hsVar = hvVar4.a;
                            if (hsVar == null && hsVar.a_(view)) {
                                if (i2 == 0 && hvVar4.n) {
                                    hvVar4.n = false;
                                } else {
                                    switch (i2) {
                                        case 2:
                                            zA = true;
                                            break;
                                        default:
                                            zA = hsVar.a(this, view2, view);
                                            break;
                                    }
                                    if (i2 == 1) {
                                        hvVar4.n = zA;
                                    }
                                }
                            }
                        }
                    }
                } else {
                    while (i3 < size) {
                        View view3 = (View) this.k.get(i3);
                        hv hvVar5 = (hv) view3.getLayoutParams();
                        hsVar = hvVar5.a;
                        if (hsVar == null) {
                        }
                    }
                }
            }
        }
        a(rectA);
        a(rectA2);
        a(rectA3);
    }

    private static void c(View view, int i2) {
        hv hvVar = (hv) view.getLayoutParams();
        if (hvVar.i != i2) {
            ti.e(view, i2 - hvVar.i);
            hvVar.i = i2;
        }
    }

    private static void d(View view, int i2) {
        hv hvVar = (hv) view.getLayoutParams();
        if (hvVar.j != i2) {
            ti.d(view, i2 - hvVar.j);
            hvVar.j = i2;
        }
    }

    public final List a(View view) {
        up upVar = this.a;
        ArrayList arrayList = null;
        int size = upVar.b.size();
        for (int i2 = 0; i2 < size; i2++) {
            ArrayList arrayList2 = (ArrayList) upVar.b.c(i2);
            if (arrayList2 != null && arrayList2.contains(view)) {
                ArrayList arrayList3 = arrayList == null ? new ArrayList() : arrayList;
                arrayList3.add(upVar.b.b(i2));
                arrayList = arrayList3;
            }
        }
        this.b.clear();
        if (arrayList != null) {
            this.b.addAll(arrayList);
        }
        return this.b;
    }

    public final boolean a(View view, int i2, int i3) {
        Rect rectA = a();
        vi.a(this, view, rectA);
        try {
            return rectA.contains(i2, i3);
        } finally {
            a(rectA);
        }
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof hv) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i2) {
        return a(view, view2, i2, 0);
    }

    @Override // flm.te
    public final boolean a(View view, View view2, int i2, int i3) {
        boolean z;
        boolean z2 = false;
        int childCount = getChildCount();
        int i4 = 0;
        while (i4 < childCount) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() == 8) {
                z = z2;
            } else {
                hv hvVar = (hv) childAt.getLayoutParams();
                hs hsVar = hvVar.a;
                if (hsVar != null) {
                    boolean zA = hsVar.a(this, childAt, view, view2, i2, i3);
                    z = z2 | zA;
                    hvVar.a(i3, zA);
                } else {
                    hvVar.a(i3, false);
                    z = z2;
                }
            }
            i4++;
            z2 = z;
        }
        return z2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i2) {
        b(view, view2, i2, 0);
    }

    @Override // flm.te
    public final void b(View view, View view2, int i2, int i3) {
        this.w.a(i2, i3);
        this.r = view2;
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            getChildAt(i4).getLayoutParams();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        b(view, 0);
    }

    @Override // flm.te
    public final void b(View view, int i2) {
        this.w.a(i2);
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            hv hvVar = (hv) childAt.getLayoutParams();
            if (hvVar.a(i2)) {
                hs hsVar = hvVar.a;
                if (hsVar != null) {
                    hsVar.a(this, childAt, view, i2);
                }
                hvVar.a(i2, false);
                hvVar.n = false;
            }
        }
        this.r = null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        a(view, i2, i3, i4, i5, 0);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0041  */
    @Override // flm.te
    public final void a(View view, int i2, int i3, int i4, int i5, int i6) {
        boolean z;
        hs hsVar;
        int childCount = getChildCount();
        boolean z2 = false;
        int i7 = 0;
        while (i7 < childCount) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                hv hvVar = (hv) childAt.getLayoutParams();
                if (!hvVar.a(i6) || (hsVar = hvVar.a) == null) {
                    z = z2;
                } else {
                    hsVar.a(this, childAt, view, i2, i3, i4, i5, i6);
                    z = true;
                }
            } else {
                z = z2;
            }
            i7++;
            z2 = z;
        }
        if (z2) {
            a(1);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
        a(view, i2, i3, iArr, 0);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0083  */
    @Override // flm.te
    public final void a(View view, int i2, int i3, int[] iArr, int i4) {
        boolean z;
        int iMax;
        int iMax2;
        hs hsVar;
        int i5 = 0;
        int i6 = 0;
        boolean z2 = false;
        int childCount = getChildCount();
        int i7 = 0;
        while (i7 < childCount) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                hv hvVar = (hv) childAt.getLayoutParams();
                if (!hvVar.a(i4) || (hsVar = hvVar.a) == null) {
                    z = z2;
                    iMax = i5;
                    iMax2 = i6;
                } else {
                    int[] iArr2 = this.m;
                    this.m[1] = 0;
                    iArr2[0] = 0;
                    hsVar.a(this, childAt, view, i2, i3, this.m, i4);
                    iMax = i2 > 0 ? Math.max(i5, this.m[0]) : Math.min(i5, this.m[0]);
                    iMax2 = i3 > 0 ? Math.max(i6, this.m[1]) : Math.min(i6, this.m[1]);
                    z = true;
                }
            } else {
                z = z2;
                iMax = i5;
                iMax2 = i6;
            }
            i7++;
            i6 = iMax2;
            i5 = iMax;
            z2 = z;
        }
        iArr[0] = i5;
        iArr[1] = i6;
        if (z2) {
            a(1);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f2, float f3, boolean z) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                childAt.getLayoutParams();
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0034  */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f2, float f3) {
        boolean zA;
        hs hsVar;
        int childCount = getChildCount();
        int i2 = 0;
        boolean z = false;
        while (i2 < childCount) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                hv hvVar = (hv) childAt.getLayoutParams();
                if (!hvVar.a(0) || (hsVar = hvVar.a) == null) {
                    zA = z;
                } else {
                    zA = hsVar.a(this, childAt, view, f2, f3) | z;
                }
            } else {
                zA = z;
            }
            i2++;
            z = zA;
        }
        return z;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.w.a();
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof hx)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        hx hxVar = (hx) parcelable;
        super.onRestoreInstanceState(hxVar.e);
        SparseArray sparseArray = hxVar.a;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            int id = childAt.getId();
            hs hsVar = b(childAt).a;
            if (id != -1 && hsVar != null && (parcelable2 = (Parcelable) sparseArray.get(id)) != null) {
                hsVar.a(this, childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        Parcelable parcelableB;
        hx hxVar = new hx(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            int id = childAt.getId();
            hs hsVar = ((hv) childAt.getLayoutParams()).a;
            if (id != -1 && hsVar != null && (parcelableB = hsVar.b(this, childAt)) != null) {
                sparseArray.append(id, parcelableB);
            }
        }
        hxVar.a = sparseArray;
        return hxVar;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        hs hsVar = ((hv) view.getLayoutParams()).a;
        if (hsVar == null || !hsVar.a(this, view, rect, z)) {
            return super.requestChildRectangleOnScreen(view, rect, z);
        }
        return true;
    }

    private final void b() {
        if (ti.p(this)) {
            if (this.v == null) {
                this.v = new hq(this);
            }
            ti.a(this, this.v);
            setSystemUiVisibility(1280);
            return;
        }
        ti.a(this, (th) null);
    }

    @Override // android.view.ViewGroup
    protected /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new hv(-2, -2);
    }

    @Override // android.view.ViewGroup
    protected /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof hv) {
            return new hv((hv) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new hv((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new hv(layoutParams);
    }

    @Override // android.view.ViewGroup
    public /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new hv(getContext(), attributeSet);
    }

    static {
        Package r0 = CoordinatorLayout.class.getPackage();
        f = r0 != null ? r0.getName() : null;
        i = new hz();
        g = new Class[]{Context.class, AttributeSet.class};
        h = new ThreadLocal();
        j = new sm(12);
    }
}

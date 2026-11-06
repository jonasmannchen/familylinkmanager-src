package android.support.v7.widget;

import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.widget.OverScroller;
import com.google.android.chimeraresources.R;
import flm.aao;
import flm.aap;
import flm.aaq;
import flm.aar;
import flm.aas;
import flm.ada;
import flm.adb;
import flm.aic;
import flm.tg;
import flm.ti;
import flm.zz;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements ada {
    private static final int[] A = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};
    private final tg B;
    public int a;
    public ActionBarContainer b;
    public boolean c;
    public boolean d;
    public boolean e;
    public int f;
    public aar g;
    public ViewPropertyAnimator h;
    public final AnimatorListenerAdapter i;
    private int j;
    private ContentFrameLayout k;
    private adb l;
    private Drawable m;
    private boolean n;
    private boolean o;
    private int p;
    private final Rect q;
    private final Rect r;
    private final Rect s;
    private final Rect t;
    private final Rect u;
    private final Rect v;
    private final Rect w;
    private OverScroller x;
    private final Runnable y;
    private final Runnable z;

    public ActionBarOverlayLayout(Context context) {
        this(context, null);
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = 0;
        this.q = new Rect();
        this.r = new Rect();
        this.s = new Rect();
        this.t = new Rect();
        this.u = new Rect();
        this.v = new Rect();
        this.w = new Rect();
        this.i = new aao(this);
        this.y = new aap(this);
        this.z = new aaq(this);
        a(context);
        this.B = new tg();
    }

    private final void a(Context context) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(A);
        this.j = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.m = typedArrayObtainStyledAttributes.getDrawable(1);
        setWillNotDraw(this.m == null);
        typedArrayObtainStyledAttributes.recycle();
        this.n = context.getApplicationInfo().targetSdkVersion < 19;
        this.x = new OverScroller(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b();
    }

    public static void a() {
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        a(getContext());
        ti.o(this);
    }

    @Override // android.view.View
    public void onWindowSystemUiVisibilityChanged(int i) {
        super.onWindowSystemUiVisibilityChanged(i);
        j();
        int i2 = this.f ^ i;
        this.f = i;
        boolean z = (i & 4) == 0;
        boolean z2 = (i & 256) != 0;
        if (this.g != null) {
            this.g.h(z2 ? false : true);
            if (z || !z2) {
                this.g.h();
            } else {
                this.g.i();
            }
        }
        if ((i2 & 256) != 0 && this.g != null) {
            ti.o(this);
        }
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.a = i;
        if (this.g != null) {
            this.g.a(i);
        }
    }

    private static boolean a(View view, Rect rect, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5 = false;
        aas aasVar = (aas) view.getLayoutParams();
        if (aasVar.leftMargin != rect.left) {
            aasVar.leftMargin = rect.left;
            z5 = true;
        }
        if (aasVar.topMargin != rect.top) {
            aasVar.topMargin = rect.top;
            z5 = true;
        }
        if (aasVar.rightMargin != rect.right) {
            aasVar.rightMargin = rect.right;
            z5 = true;
        }
        if (!z3 || aasVar.bottomMargin == rect.bottom) {
            return z5;
        }
        aasVar.bottomMargin = rect.bottom;
        return true;
    }

    @Override // android.view.View
    protected boolean fitSystemWindows(Rect rect) {
        j();
        ti.n(this);
        boolean zA = a(this.b, rect, true, true, false, true);
        this.t.set(rect);
        aic.a(this, this.t, this.q);
        if (!this.u.equals(this.t)) {
            this.u.set(this.t);
            zA = true;
        }
        if (!this.r.equals(this.q)) {
            this.r.set(this.q);
            zA = true;
        }
        if (zA) {
            requestLayout();
        }
        return true;
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new aas(layoutParams);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof aas;
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int measuredHeight;
        j();
        measureChildWithMargins(this.b, i, 0, i2, 0);
        aas aasVar = (aas) this.b.getLayoutParams();
        int iMax = Math.max(0, this.b.getMeasuredWidth() + aasVar.leftMargin + aasVar.rightMargin);
        int iMax2 = Math.max(0, aasVar.bottomMargin + this.b.getMeasuredHeight() + aasVar.topMargin);
        int iCombineMeasuredStates = View.combineMeasuredStates(0, this.b.getMeasuredState());
        boolean z = (ti.n(this) & 256) != 0;
        if (z) {
            measuredHeight = this.j;
            if (this.d && this.b.a != null) {
                measuredHeight += this.j;
            }
        } else {
            measuredHeight = this.b.getVisibility() != 8 ? this.b.getMeasuredHeight() : 0;
        }
        this.s.set(this.q);
        this.v.set(this.t);
        if (!this.c && !z) {
            Rect rect = this.s;
            rect.top = measuredHeight + rect.top;
            Rect rect2 = this.s;
            rect2.bottom = rect2.bottom;
        } else {
            Rect rect3 = this.v;
            rect3.top = measuredHeight + rect3.top;
            Rect rect4 = this.v;
            rect4.bottom = rect4.bottom;
        }
        a(this.k, this.s, true, true, true, true);
        if (!this.w.equals(this.v)) {
            this.w.set(this.v);
            this.k.a(this.v);
        }
        measureChildWithMargins(this.k, i, 0, i2, 0);
        aas aasVar2 = (aas) this.k.getLayoutParams();
        int iMax3 = Math.max(iMax, this.k.getMeasuredWidth() + aasVar2.leftMargin + aasVar2.rightMargin);
        int iMax4 = Math.max(iMax2, aasVar2.bottomMargin + this.k.getMeasuredHeight() + aasVar2.topMargin);
        int iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.k.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(iMax3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i, iCombineMeasuredStates2), View.resolveSizeAndState(Math.max(iMax4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i2, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        getPaddingRight();
        int paddingTop = getPaddingTop();
        getPaddingBottom();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                aas aasVar = (aas) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = aasVar.leftMargin + paddingLeft;
                int i7 = aasVar.topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.m != null && !this.n) {
            int bottom = this.b.getVisibility() == 0 ? (int) (this.b.getBottom() + this.b.getTranslationY() + 0.5f) : 0;
            this.m.setBounds(0, bottom, getWidth(), this.m.getIntrinsicHeight() + bottom);
            this.m.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.b.getVisibility() != 0) {
            return false;
        }
        return this.o;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.B.a(i, 0);
        this.p = this.b != null ? -((int) this.b.getTranslationY()) : 0;
        b();
        if (this.g != null) {
            this.g.j();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        this.p += i2;
        b(this.p);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        if (this.o && !this.e) {
            if (this.p <= this.b.getHeight()) {
                b();
                postDelayed(this.y, 600L);
            } else {
                b();
                postDelayed(this.z, 600L);
            }
        }
        if (this.g != null) {
            this.g.k();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.o || !z) {
            return false;
        }
        this.x.fling(0, 0, 0, (int) f2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.x.getFinalY() > this.b.getHeight()) {
            b();
            this.z.run();
        } else {
            b();
            this.y.run();
        }
        this.e = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.B.a();
    }

    private final void j() {
        adb adbVarI;
        if (this.k == null) {
            this.k = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.b = (ActionBarContainer) findViewById(R.id.action_bar_container);
            KeyEvent.Callback callbackFindViewById = findViewById(R.id.action_bar);
            if (callbackFindViewById instanceof adb) {
                adbVarI = (adb) callbackFindViewById;
            } else if (callbackFindViewById instanceof Toolbar) {
                adbVarI = ((Toolbar) callbackFindViewById).i();
            } else {
                throw new IllegalStateException("Can't make a decor toolbar out of " + callbackFindViewById.getClass().getSimpleName());
            }
            this.l = adbVarI;
        }
    }

    public final void a(boolean z) {
        if (z != this.o) {
            this.o = z;
            if (!z) {
                b();
                b(0);
            }
        }
    }

    private final void b(int i) {
        b();
        this.b.setTranslationY(-Math.max(0, Math.min(i, this.b.getHeight())));
    }

    public final void b() {
        removeCallbacks(this.y);
        removeCallbacks(this.z);
        if (this.h != null) {
            this.h.cancel();
        }
    }

    @Override // flm.ada
    public final void a(Window.Callback callback) {
        j();
        this.l.a(callback);
    }

    @Override // flm.ada
    public final void a(CharSequence charSequence) {
        j();
        this.l.a(charSequence);
    }

    @Override // flm.ada
    public final void a(int i) {
        j();
        switch (i) {
            case 2:
                this.l.e();
                break;
            case 5:
                this.l.f();
                break;
            case 109:
                this.c = true;
                this.n = getContext().getApplicationInfo().targetSdkVersion < 19;
                break;
        }
    }

    @Override // flm.ada
    public final boolean c() {
        j();
        return this.l.g();
    }

    @Override // flm.ada
    public final boolean d() {
        j();
        return this.l.h();
    }

    @Override // flm.ada
    public final boolean e() {
        j();
        return this.l.i();
    }

    @Override // flm.ada
    public final boolean f() {
        j();
        return this.l.j();
    }

    @Override // flm.ada
    public final boolean g() {
        j();
        return this.l.k();
    }

    @Override // flm.ada
    public final void h() {
        j();
        this.l.l();
    }

    @Override // flm.ada
    public final void a(Menu menu, zz zzVar) {
        j();
        this.l.a(menu, zzVar);
    }

    @Override // flm.ada
    public final void i() {
        j();
        this.l.m();
    }

    @Override // android.view.ViewGroup
    protected /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new aas(-1, -1);
    }

    @Override // android.view.ViewGroup
    public /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new aas(getContext(), attributeSet);
    }
}

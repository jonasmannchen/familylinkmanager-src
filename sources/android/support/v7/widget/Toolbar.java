package android.support.v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.chimeraresources.R;
import com.google.android.gms.kids.aidl.IKidsInternalService;
import flm.aat;
import flm.abf;
import flm.abw;
import flm.aby;
import flm.acp;
import flm.adb;
import flm.agt;
import flm.ahe;
import flm.ahf;
import flm.ahg;
import flm.ahi;
import flm.ahj;
import flm.ahk;
import flm.ahl;
import flm.ahn;
import flm.aic;
import flm.sz;
import flm.ti;
import flm.vk;
import flm.xl;
import flm.zi;
import flm.zj;
import flm.zm;
import flm.zz;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class Toolbar extends ViewGroup {
    private int A;
    private int B;
    private int C;
    private int D;
    private int E;
    private int F;
    private int G;
    private int H;
    private boolean I;
    private boolean J;
    private final ArrayList K;
    private final int[] L;
    private final abf M;
    private ahn N;
    private final Runnable O;
    public ActionMenuView a;
    public TextView b;
    public TextView c;
    public Drawable d;
    public CharSequence e;
    public ImageButton f;
    public View g;
    public Context h;
    public int i;
    public int j;
    public int k;
    public int l;
    public agt m;
    public CharSequence n;
    public CharSequence o;
    public final ArrayList p;
    public ahk q;
    public aat r;
    public ahi s;
    public zz t;
    public zj u;
    public boolean v;
    private ImageButton w;
    private ImageView x;
    private int y;
    private int z;

    public Toolbar(Context context) {
        this(context, null);
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.toolbarStyle);
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.F = 8388627;
        this.K = new ArrayList();
        this.p = new ArrayList();
        this.L = new int[2];
        this.M = new ahf(this);
        this.O = new ahg(this);
        ahe aheVarA = ahe.a(getContext(), attributeSet, xl.cQ, i, 0);
        this.j = aheVarA.g(xl.dr, 0);
        this.k = aheVarA.g(xl.di, 0);
        this.F = aheVarA.c(xl.cR, this.F);
        this.l = aheVarA.c(xl.cS, 48);
        int iD = aheVarA.d(xl.dl, 0);
        iD = aheVarA.f(xl.dq) ? aheVarA.d(xl.dq, iD) : iD;
        this.C = iD;
        this.B = iD;
        this.A = iD;
        this.z = iD;
        int iD2 = aheVarA.d(xl.f1do, -1);
        if (iD2 >= 0) {
            this.z = iD2;
        }
        int iD3 = aheVarA.d(xl.dn, -1);
        if (iD3 >= 0) {
            this.A = iD3;
        }
        int iD4 = aheVarA.d(xl.dp, -1);
        if (iD4 >= 0) {
            this.B = iD4;
        }
        int iD5 = aheVarA.d(xl.dm, -1);
        if (iD5 >= 0) {
            this.C = iD5;
        }
        this.y = aheVarA.e(xl.dd, -1);
        int iD6 = aheVarA.d(xl.cZ, Integer.MIN_VALUE);
        int iD7 = aheVarA.d(xl.cV, Integer.MIN_VALUE);
        int iE = aheVarA.e(xl.cX, 0);
        int iE2 = aheVarA.e(xl.cY, 0);
        j();
        agt agtVar = this.m;
        agtVar.h = false;
        if (iE != Integer.MIN_VALUE) {
            agtVar.e = iE;
            agtVar.a = iE;
        }
        if (iE2 != Integer.MIN_VALUE) {
            agtVar.f = iE2;
            agtVar.b = iE2;
        }
        if (iD6 != Integer.MIN_VALUE || iD7 != Integer.MIN_VALUE) {
            this.m.a(iD6, iD7);
        }
        this.D = aheVarA.d(xl.da, Integer.MIN_VALUE);
        this.E = aheVarA.d(xl.cW, Integer.MIN_VALUE);
        this.d = aheVarA.a(xl.cU);
        this.e = aheVarA.c(xl.cT);
        CharSequence charSequenceC = aheVarA.c(xl.dk);
        if (!TextUtils.isEmpty(charSequenceC)) {
            a(charSequenceC);
        }
        CharSequence charSequenceC2 = aheVarA.c(xl.dh);
        if (!TextUtils.isEmpty(charSequenceC2)) {
            b(charSequenceC2);
        }
        this.h = getContext();
        a(aheVarA.g(xl.dg, 0));
        Drawable drawableA = aheVarA.a(xl.df);
        if (drawableA != null) {
            b(drawableA);
        }
        CharSequence charSequenceC3 = aheVarA.c(xl.de);
        if (!TextUtils.isEmpty(charSequenceC3)) {
            c(charSequenceC3);
        }
        Drawable drawableA2 = aheVarA.a(xl.db);
        if (drawableA2 != null) {
            a(drawableA2);
        }
        CharSequence charSequenceC4 = aheVarA.c(xl.dc);
        if (!TextUtils.isEmpty(charSequenceC4)) {
            if (!TextUtils.isEmpty(charSequenceC4)) {
                a();
            }
            if (this.x != null) {
                this.x.setContentDescription(charSequenceC4);
            }
        }
        if (aheVarA.f(xl.ds)) {
            int iB = aheVarA.b(xl.ds, -1);
            this.G = iB;
            if (this.b != null) {
                this.b.setTextColor(iB);
            }
        }
        if (aheVarA.f(xl.dj)) {
            int iB2 = aheVarA.b(xl.dj, -1);
            this.H = iB2;
            if (this.c != null) {
                this.c.setTextColor(iB2);
            }
        }
        aheVarA.b.recycle();
    }

    public final void a(int i) {
        if (this.i != i) {
            this.i = i;
            if (i == 0) {
                this.h = getContext();
            } else {
                this.h = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        j();
        agt agtVar = this.m;
        boolean z = i == 1;
        if (z != agtVar.g) {
            agtVar.g = z;
            if (agtVar.h) {
                if (z) {
                    agtVar.a = agtVar.d != Integer.MIN_VALUE ? agtVar.d : agtVar.e;
                    agtVar.b = agtVar.c != Integer.MIN_VALUE ? agtVar.c : agtVar.f;
                    return;
                } else {
                    agtVar.a = agtVar.c != Integer.MIN_VALUE ? agtVar.c : agtVar.e;
                    agtVar.b = agtVar.d != Integer.MIN_VALUE ? agtVar.d : agtVar.f;
                    return;
                }
            }
            agtVar.a = agtVar.e;
            agtVar.b = agtVar.f;
        }
    }

    public final boolean b() {
        if (this.a != null) {
            ActionMenuView actionMenuView = this.a;
            if (actionMenuView.c != null && actionMenuView.c.f()) {
                return true;
            }
        }
        return false;
    }

    public final boolean c() {
        if (this.a != null) {
            ActionMenuView actionMenuView = this.a;
            if (actionMenuView.c != null && actionMenuView.c.b()) {
                return true;
            }
        }
        return false;
    }

    public final void a(Drawable drawable) {
        if (drawable != null) {
            a();
            if (!d(this.x)) {
                a((View) this.x, true);
            }
        } else if (this.x != null && d(this.x)) {
            removeView(this.x);
            this.p.remove(this.x);
        }
        if (this.x != null) {
            this.x.setImageDrawable(drawable);
        }
    }

    private final void a() {
        if (this.x == null) {
            this.x = new aby(getContext());
        }
    }

    public final void d() {
        zm zmVar = this.s == null ? null : this.s.a;
        if (zmVar != null) {
            zmVar.collapseActionView();
        }
    }

    public void a(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.b == null) {
                Context context = getContext();
                this.b = new acp(context);
                this.b.setSingleLine();
                this.b.setEllipsize(TextUtils.TruncateAt.END);
                if (this.j != 0) {
                    this.b.setTextAppearance(context, this.j);
                }
                if (this.G != 0) {
                    this.b.setTextColor(this.G);
                }
            }
            if (!d(this.b)) {
                a((View) this.b, true);
            }
        } else if (this.b != null && d(this.b)) {
            removeView(this.b);
            this.p.remove(this.b);
        }
        if (this.b != null) {
            this.b.setText(charSequence);
        }
        this.n = charSequence;
    }

    public void b(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.c == null) {
                Context context = getContext();
                this.c = new acp(context);
                this.c.setSingleLine();
                this.c.setEllipsize(TextUtils.TruncateAt.END);
                if (this.k != 0) {
                    this.c.setTextAppearance(context, this.k);
                }
                if (this.H != 0) {
                    this.c.setTextColor(this.H);
                }
            }
            if (!d(this.c)) {
                a((View) this.c, true);
            }
        } else if (this.c != null && d(this.c)) {
            removeView(this.c);
            this.p.remove(this.c);
        }
        if (this.c != null) {
            this.c.setText(charSequence);
        }
        this.o = charSequence;
    }

    public final CharSequence e() {
        if (this.w != null) {
            return this.w.getContentDescription();
        }
        return null;
    }

    public final void c(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            o();
        }
        if (this.w != null) {
            this.w.setContentDescription(charSequence);
        }
    }

    public final void b(Drawable drawable) {
        if (drawable != null) {
            o();
            if (!d(this.w)) {
                a((View) this.w, true);
            }
        } else if (this.w != null && d(this.w)) {
            removeView(this.w);
            this.p.remove(this.w);
        }
        if (this.w != null) {
            this.w.setImageDrawable(drawable);
        }
    }

    public final Drawable f() {
        if (this.w != null) {
            return this.w.getDrawable();
        }
        return null;
    }

    public final void a(View.OnClickListener onClickListener) {
        o();
        this.w.setOnClickListener(onClickListener);
    }

    public final void g() {
        if (this.a == null) {
            this.a = new ActionMenuView(getContext());
            this.a.a(this.i);
            this.a.e = this.M;
            this.a.a(this.t, this.u);
            ahj ahjVarH = h();
            ahjVarH.a = 8388613 | (this.l & 112);
            this.a.setLayoutParams(ahjVarH);
            a((View) this.a, false);
        }
    }

    private final int k() {
        if (this.m == null) {
            return 0;
        }
        agt agtVar = this.m;
        return agtVar.g ? agtVar.b : agtVar.a;
    }

    private final int l() {
        if (this.m == null) {
            return 0;
        }
        agt agtVar = this.m;
        return agtVar.g ? agtVar.a : agtVar.b;
    }

    private final int m() {
        return f() != null ? Math.max(k(), Math.max(this.D, 0)) : k();
    }

    private final int n() {
        zi ziVar;
        boolean z = (this.a == null || (ziVar = this.a.a) == null || !ziVar.hasVisibleItems()) ? false : true;
        if (z) {
            return Math.max(l(), Math.max(this.E, 0));
        }
        return l();
    }

    private final void o() {
        if (this.w == null) {
            this.w = new abw(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            ahj ahjVarH = h();
            ahjVarH.a = 8388611 | (this.l & 112);
            this.w.setLayoutParams(ahjVarH);
        }
    }

    private final void a(View view, boolean z) {
        ahj ahjVarA;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            ahjVarA = h();
        } else if (!checkLayoutParams(layoutParams)) {
            ahjVarA = a(layoutParams);
        } else {
            ahjVarA = (ahj) layoutParams;
        }
        ahjVarA.b = 1;
        if (z && this.g != null) {
            view.setLayoutParams(ahjVarA);
            this.p.add(view);
        } else {
            addView(view, ahjVarA);
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        ahl ahlVar = new ahl(super.onSaveInstanceState());
        if (this.s != null && this.s.a != null) {
            ahlVar.a = this.s.a.getItemId();
        }
        ahlVar.b = b();
        return ahlVar;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        zi ziVar;
        MenuItem menuItemFindItem;
        if (!(parcelable instanceof ahl)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ahl ahlVar = (ahl) parcelable;
        super.onRestoreInstanceState(ahlVar.e);
        if (this.a != null) {
            ziVar = this.a.a;
        } else {
            ziVar = null;
        }
        if (ahlVar.a != 0 && this.s != null && ziVar != null && (menuItemFindItem = ziVar.findItem(ahlVar.a)) != null) {
            menuItemFindItem.expandActionView();
        }
        if (ahlVar.b) {
            removeCallbacks(this.O);
            post(this.O);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.O);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.I = false;
        }
        if (!this.I) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.I = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.I = false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.J = false;
        }
        if (!this.J) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.J = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.J = false;
        }
        return true;
    }

    private final void a(View view, int i, int i2, int i3, int i4, int i5) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int childMeasureSpec2 = getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i5 >= 0) {
            if (mode != 0) {
                i5 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i5);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    private final int a(View view, int i, int i2, int i3, int i4, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int iMax = Math.max(0, i5) + Math.max(0, i6);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + iMax + i2, marginLayoutParams.width), getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + iMax;
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        char c;
        char c2;
        int iCombineMeasuredStates;
        int iMax;
        boolean z;
        int iCombineMeasuredStates2;
        int i3;
        int[] iArr = this.L;
        if (aic.a(this)) {
            c = 0;
            c2 = 1;
        } else {
            c = 1;
            c2 = 0;
        }
        int measuredWidth = 0;
        if (!a(this.w)) {
            iCombineMeasuredStates = 0;
            iMax = 0;
        } else {
            a(this.w, i, 0, i2, 0, this.y);
            measuredWidth = this.w.getMeasuredWidth() + b(this.w);
            int iMax2 = Math.max(0, this.w.getMeasuredHeight() + c(this.w));
            iCombineMeasuredStates = View.combineMeasuredStates(0, this.w.getMeasuredState());
            iMax = iMax2;
        }
        if (a(this.f)) {
            a(this.f, i, 0, i2, 0, this.y);
            measuredWidth = this.f.getMeasuredWidth() + b(this.f);
            iMax = Math.max(iMax, this.f.getMeasuredHeight() + c(this.f));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f.getMeasuredState());
        }
        int iM = m();
        int iMax3 = Math.max(iM, measuredWidth) + 0;
        iArr[c2] = Math.max(0, iM - measuredWidth);
        int measuredWidth2 = 0;
        if (a(this.a)) {
            a(this.a, i, iMax3, i2, 0, this.y);
            measuredWidth2 = this.a.getMeasuredWidth() + b(this.a);
            iMax = Math.max(iMax, this.a.getMeasuredHeight() + c(this.a));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.a.getMeasuredState());
        }
        int iN = n();
        int iMax4 = iMax3 + Math.max(iN, measuredWidth2);
        iArr[c] = Math.max(0, iN - measuredWidth2);
        if (a(this.g)) {
            iMax4 += a(this.g, i, iMax4, i2, 0, iArr);
            iMax = Math.max(iMax, this.g.getMeasuredHeight() + c(this.g));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.g.getMeasuredState());
        }
        if (a(this.x)) {
            iMax4 += a(this.x, i, iMax4, i2, 0, iArr);
            iMax = Math.max(iMax, this.x.getMeasuredHeight() + c(this.x));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.x.getMeasuredState());
        }
        int childCount = getChildCount();
        int i4 = 0;
        int i5 = iMax;
        int iCombineMeasuredStates3 = iCombineMeasuredStates;
        while (i4 < childCount) {
            View childAt = getChildAt(i4);
            if (((ahj) childAt.getLayoutParams()).b == 0 && a(childAt)) {
                iMax4 += a(childAt, i, iMax4, i2, 0, iArr);
                int iMax5 = Math.max(i5, childAt.getMeasuredHeight() + c(childAt));
                iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates3, childAt.getMeasuredState());
                i3 = iMax5;
            } else {
                iCombineMeasuredStates2 = iCombineMeasuredStates3;
                i3 = i5;
            }
            i4++;
            iCombineMeasuredStates3 = iCombineMeasuredStates2;
            i5 = i3;
        }
        int iMax6 = 0;
        int measuredHeight = 0;
        int i6 = this.B + this.C;
        int i7 = this.z + this.A;
        if (a(this.b)) {
            a(this.b, i, iMax4 + i7, i2, i6, iArr);
            iMax6 = b(this.b) + this.b.getMeasuredWidth();
            measuredHeight = this.b.getMeasuredHeight() + c(this.b);
            iCombineMeasuredStates3 = View.combineMeasuredStates(iCombineMeasuredStates3, this.b.getMeasuredState());
        }
        if (a(this.c)) {
            iMax6 = Math.max(iMax6, a(this.c, i, iMax4 + i7, i2, i6 + measuredHeight, iArr));
            measuredHeight += this.c.getMeasuredHeight() + c(this.c);
            iCombineMeasuredStates3 = View.combineMeasuredStates(iCombineMeasuredStates3, this.c.getMeasuredState());
        }
        int iMax7 = Math.max(i5, measuredHeight);
        int paddingLeft = iMax6 + iMax4 + getPaddingLeft() + getPaddingRight();
        int paddingTop = iMax7 + getPaddingTop() + getPaddingBottom();
        int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingLeft, getSuggestedMinimumWidth()), i, (-16777216) & iCombineMeasuredStates3);
        int iResolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingTop, getSuggestedMinimumHeight()), i2, iCombineMeasuredStates3 << 16);
        if (this.v) {
            int childCount2 = getChildCount();
            int i8 = 0;
            while (true) {
                if (i8 < childCount2) {
                    View childAt2 = getChildAt(i8);
                    if (a(childAt2) && childAt2.getMeasuredWidth() > 0 && childAt2.getMeasuredHeight() > 0) {
                        z = false;
                        break;
                    }
                    i8++;
                } else {
                    z = true;
                    break;
                }
            }
        } else {
            z = false;
        }
        if (z) {
            iResolveSizeAndState2 = 0;
        }
        setMeasuredDimension(iResolveSizeAndState, iResolveSizeAndState2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int iB;
        int iA;
        int iM;
        int iN;
        int iMin;
        int iMax;
        int measuredHeight;
        int paddingTop;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int iMax2;
        boolean z2 = ti.f(this) == 1;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop2 = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i10 = width - paddingRight;
        int[] iArr = this.L;
        iArr[1] = 0;
        iArr[0] = 0;
        int iK = ti.k(this);
        int iMin2 = iK >= 0 ? Math.min(iK, i4 - i2) : 0;
        if (!a(this.w)) {
            iB = i10;
            iA = paddingLeft;
        } else if (z2) {
            iB = b(this.w, i10, iArr, iMin2);
            iA = paddingLeft;
        } else {
            iA = a(this.w, paddingLeft, iArr, iMin2);
            iB = i10;
        }
        if (a(this.f)) {
            if (z2) {
                iB = b(this.f, iB, iArr, iMin2);
            } else {
                iA = a(this.f, iA, iArr, iMin2);
            }
        }
        if (a(this.a)) {
            if (z2) {
                iA = a(this.a, iA, iArr, iMin2);
            } else {
                iB = b(this.a, iB, iArr, iMin2);
            }
        }
        if (ti.f(this) == 1) {
            iM = n();
        } else {
            iM = m();
        }
        if (ti.f(this) == 1) {
            iN = m();
        } else {
            iN = n();
        }
        iArr[0] = Math.max(0, iM - iA);
        iArr[1] = Math.max(0, iN - ((width - paddingRight) - iB));
        int iMax3 = Math.max(iA, iM);
        int iMin3 = Math.min(iB, (width - paddingRight) - iN);
        if (a(this.g)) {
            if (z2) {
                iMin3 = b(this.g, iMin3, iArr, iMin2);
            } else {
                iMax3 = a(this.g, iMax3, iArr, iMin2);
            }
        }
        if (!a(this.x)) {
            iMin = iMin3;
            iMax = iMax3;
        } else if (z2) {
            iMin = b(this.x, iMin3, iArr, iMin2);
            iMax = iMax3;
        } else {
            iMin = iMin3;
            iMax = a(this.x, iMax3, iArr, iMin2);
        }
        boolean zA = a(this.b);
        boolean zA2 = a(this.c);
        int measuredHeight2 = 0;
        if (zA) {
            ahj ahjVar = (ahj) this.b.getLayoutParams();
            measuredHeight2 = ahjVar.bottomMargin + ahjVar.topMargin + this.b.getMeasuredHeight() + 0;
        }
        if (zA2) {
            ahj ahjVar2 = (ahj) this.c.getLayoutParams();
            measuredHeight = ahjVar2.bottomMargin + ahjVar2.topMargin + this.c.getMeasuredHeight() + measuredHeight2;
        } else {
            measuredHeight = measuredHeight2;
        }
        if (zA || zA2) {
            TextView textView = zA ? this.b : this.c;
            TextView textView2 = zA2 ? this.c : this.b;
            ahj ahjVar3 = (ahj) textView.getLayoutParams();
            ahj ahjVar4 = (ahj) textView2.getLayoutParams();
            boolean z3 = (zA && this.b.getMeasuredWidth() > 0) || (zA2 && this.c.getMeasuredWidth() > 0);
            switch (this.F & 112) {
                case IKidsInternalService.Stub.TRANSACTION_getMemberSvExitState /* 48 */:
                    paddingTop = ahjVar3.topMargin + getPaddingTop() + this.B;
                    break;
                case 80:
                    paddingTop = (((height - paddingBottom) - ahjVar4.bottomMargin) - this.C) - measuredHeight;
                    break;
                default:
                    int i11 = (((height - paddingTop2) - paddingBottom) - measuredHeight) / 2;
                    if (i11 < ahjVar3.topMargin + this.B) {
                        iMax2 = ahjVar3.topMargin + this.B;
                    } else {
                        int i12 = (((height - paddingBottom) - measuredHeight) - i11) - paddingTop2;
                        iMax2 = i12 < ahjVar3.bottomMargin + this.C ? Math.max(0, i11 - ((ahjVar4.bottomMargin + this.C) - i12)) : i11;
                    }
                    paddingTop = paddingTop2 + iMax2;
                    break;
            }
            if (z2) {
                int i13 = (z3 ? this.z : 0) - iArr[1];
                int iMax4 = iMin - Math.max(0, i13);
                iArr[1] = Math.max(0, -i13);
                if (zA) {
                    ahj ahjVar5 = (ahj) this.b.getLayoutParams();
                    int measuredWidth = iMax4 - this.b.getMeasuredWidth();
                    int measuredHeight3 = this.b.getMeasuredHeight() + paddingTop;
                    this.b.layout(measuredWidth, paddingTop, iMax4, measuredHeight3);
                    int i14 = measuredWidth - this.A;
                    paddingTop = measuredHeight3 + ahjVar5.bottomMargin;
                    i8 = i14;
                } else {
                    i8 = iMax4;
                }
                if (zA2) {
                    ahj ahjVar6 = (ahj) this.c.getLayoutParams();
                    int i15 = ahjVar6.topMargin + paddingTop;
                    this.c.layout(iMax4 - this.c.getMeasuredWidth(), i15, iMax4, this.c.getMeasuredHeight() + i15);
                    int i16 = iMax4 - this.A;
                    int i17 = ahjVar6.bottomMargin;
                    i9 = i16;
                } else {
                    i9 = iMax4;
                }
                iMin = z3 ? Math.min(i8, i9) : iMax4;
            } else {
                int i18 = (z3 ? this.z : 0) - iArr[0];
                iMax += Math.max(0, i18);
                iArr[0] = Math.max(0, -i18);
                if (zA) {
                    ahj ahjVar7 = (ahj) this.b.getLayoutParams();
                    int measuredWidth2 = this.b.getMeasuredWidth() + iMax;
                    int measuredHeight4 = this.b.getMeasuredHeight() + paddingTop;
                    this.b.layout(iMax, paddingTop, measuredWidth2, measuredHeight4);
                    int i19 = measuredWidth2 + this.A;
                    int i20 = ahjVar7.bottomMargin + measuredHeight4;
                    i5 = i19;
                    i6 = i20;
                } else {
                    i5 = iMax;
                    i6 = paddingTop;
                }
                if (zA2) {
                    ahj ahjVar8 = (ahj) this.c.getLayoutParams();
                    int i21 = i6 + ahjVar8.topMargin;
                    int measuredWidth3 = this.c.getMeasuredWidth() + iMax;
                    this.c.layout(iMax, i21, measuredWidth3, this.c.getMeasuredHeight() + i21);
                    int i22 = this.A + measuredWidth3;
                    int i23 = ahjVar8.bottomMargin;
                    i7 = i22;
                } else {
                    i7 = iMax;
                }
                if (z3) {
                    iMax = Math.max(i5, i7);
                }
            }
        }
        a(this.K, 3);
        int size = this.K.size();
        int iA2 = iMax;
        for (int i24 = 0; i24 < size; i24++) {
            iA2 = a((View) this.K.get(i24), iA2, iArr, iMin2);
        }
        a(this.K, 5);
        int size2 = this.K.size();
        int i25 = 0;
        int i26 = iMin;
        while (i25 < size2) {
            int iB2 = b((View) this.K.get(i25), i26, iArr, iMin2);
            i25++;
            i26 = iB2;
        }
        a(this.K, 1);
        ArrayList arrayList = this.K;
        int i27 = iArr[0];
        int i28 = iArr[1];
        int size3 = arrayList.size();
        int iMax5 = i28;
        int iMax6 = i27;
        int i29 = 0;
        int measuredWidth4 = 0;
        while (i29 < size3) {
            View view = (View) arrayList.get(i29);
            ahj ahjVar9 = (ahj) view.getLayoutParams();
            int i30 = ahjVar9.leftMargin - iMax6;
            int i31 = ahjVar9.rightMargin - iMax5;
            int iMax7 = Math.max(0, i30);
            int iMax8 = Math.max(0, i31);
            iMax6 = Math.max(0, -i30);
            iMax5 = Math.max(0, -i31);
            i29++;
            measuredWidth4 += view.getMeasuredWidth() + iMax7 + iMax8;
        }
        int i32 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (measuredWidth4 / 2);
        int i33 = i32 + measuredWidth4;
        if (i32 < iA2) {
            i32 = iA2;
        } else if (i33 > i26) {
            i32 -= i33 - i26;
        }
        int size4 = this.K.size();
        int iA3 = i32;
        for (int i34 = 0; i34 < size4; i34++) {
            iA3 = a((View) this.K.get(i34), iA3, iArr, iMin2);
        }
        this.K.clear();
    }

    private final int a(View view, int i, int[] iArr, int i2) {
        ahj ahjVar = (ahj) view.getLayoutParams();
        int i3 = ahjVar.leftMargin - iArr[0];
        int iMax = Math.max(0, i3) + i;
        iArr[0] = Math.max(0, -i3);
        int iA = a(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax, iA, iMax + measuredWidth, view.getMeasuredHeight() + iA);
        return ahjVar.rightMargin + measuredWidth + iMax;
    }

    private final int b(View view, int i, int[] iArr, int i2) {
        ahj ahjVar = (ahj) view.getLayoutParams();
        int i3 = ahjVar.rightMargin - iArr[1];
        int iMax = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int iA = a(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax - measuredWidth, iA, iMax, view.getMeasuredHeight() + iA);
        return iMax - (ahjVar.leftMargin + measuredWidth);
    }

    private final int a(View view, int i) {
        int iMax;
        ahj ahjVar = (ahj) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int i3 = ahjVar.a & 112;
        switch (i3) {
            case 16:
            case IKidsInternalService.Stub.TRANSACTION_getMemberSvExitState /* 48 */:
            case 80:
                break;
            default:
                i3 = this.F & 112;
                break;
        }
        switch (i3) {
            case IKidsInternalService.Stub.TRANSACTION_getMemberSvExitState /* 48 */:
                return getPaddingTop() - i2;
            case 80:
                return (((getHeight() - getPaddingBottom()) - measuredHeight) - ahjVar.bottomMargin) - i2;
            default:
                int paddingTop = getPaddingTop();
                int paddingBottom = getPaddingBottom();
                int height = getHeight();
                int i4 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
                if (i4 < ahjVar.topMargin) {
                    iMax = ahjVar.topMargin;
                } else {
                    int i5 = (((height - paddingBottom) - measuredHeight) - i4) - paddingTop;
                    iMax = i5 < ahjVar.bottomMargin ? Math.max(0, i4 - (ahjVar.bottomMargin - i5)) : i4;
                }
                return iMax + paddingTop;
        }
    }

    private final void a(List list, int i) {
        boolean z = ti.f(this) == 1;
        int childCount = getChildCount();
        int iA = sz.a(i, ti.f(this));
        list.clear();
        if (z) {
            for (int i2 = childCount - 1; i2 >= 0; i2--) {
                View childAt = getChildAt(i2);
                ahj ahjVar = (ahj) childAt.getLayoutParams();
                if (ahjVar.b == 0 && a(childAt) && b(ahjVar.a) == iA) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt2 = getChildAt(i3);
            ahj ahjVar2 = (ahj) childAt2.getLayoutParams();
            if (ahjVar2.b == 0 && a(childAt2) && b(ahjVar2.a) == iA) {
                list.add(childAt2);
            }
        }
    }

    private final int b(int i) {
        int iF = ti.f(this);
        int iA = sz.a(i, iF) & 7;
        switch (iA) {
            case 1:
            case 3:
            case 5:
                return iA;
            case 2:
            case 4:
            default:
                return iF == 1 ? 5 : 3;
        }
    }

    private final boolean a(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    private static int b(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart();
    }

    private static int c(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.bottomMargin + marginLayoutParams.topMargin;
    }

    private static ahj a(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ahj) {
            return new ahj((ahj) layoutParams);
        }
        if (layoutParams instanceof vk) {
            return new ahj((vk) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new ahj((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new ahj(layoutParams);
    }

    public static ahj h() {
        return new ahj(-2, -2);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof ahj);
    }

    public final adb i() {
        if (this.N == null) {
            this.N = new ahn(this, true);
        }
        return this.N;
    }

    private final boolean d(View view) {
        return view.getParent() == this || this.p.contains(view);
    }

    public final void j() {
        if (this.m == null) {
            this.m = new agt();
        }
    }

    @Override // android.view.ViewGroup
    protected /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return h();
    }

    @Override // android.view.ViewGroup
    protected /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return a(layoutParams);
    }

    @Override // android.view.ViewGroup
    public /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ahj(getContext(), attributeSet);
    }
}

package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.support.v7.view.menu.ActionMenuItemView;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import flm.aaa;
import flm.aat;
import flm.abb;
import flm.abc;
import flm.abd;
import flm.abe;
import flm.abf;
import flm.aei;
import flm.aej;
import flm.aic;
import flm.zi;
import flm.zj;
import flm.zk;
import flm.zm;
import flm.zy;
import flm.zz;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class ActionMenuView extends aei implements aaa, zk {
    public zi a;
    public boolean b;
    public aat c;
    public zj d;
    public abf e;
    private Context j;
    private int k;
    private zz l;
    private boolean m;
    private int n;
    private int o;
    private int p;

    public ActionMenuView(Context context) {
        this(context, null);
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f = false;
        float f = context.getResources().getDisplayMetrics().density;
        this.o = (int) (56.0f * f);
        this.p = (int) (f * 4.0f);
        this.j = context;
        this.k = 0;
    }

    public final void a(int i) {
        if (this.k != i) {
            this.k = i;
            if (i == 0) {
                this.j = getContext();
            } else {
                this.j = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public final void a(aat aatVar) {
        this.c = aatVar;
        this.c.a(this);
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.c != null) {
            this.c.a(false);
            if (this.c.f()) {
                this.c.c();
                this.c.b();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code duplicated, block: B:186:0x03cb A[PHI: r7
  0x03cb: PHI (r7v14 float) = (r7v13 float), (r7v22 float), (r7v22 float) binds: [B:130:0x02c0, B:137:0x02e9, B:139:0x02fb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:188:0x03d1  */
    @Override // flm.aei, android.view.View
    public void onMeasure(int i, int i2) {
        boolean z;
        float f;
        boolean z2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        long j;
        boolean z3 = this.m;
        this.m = View.MeasureSpec.getMode(i) == 1073741824;
        if (z3 != this.m) {
            this.n = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (this.m && this.a != null && size != this.n) {
            this.n = size;
            this.a.b(true);
        }
        int childCount = getChildCount();
        if (this.m && childCount > 0) {
            int mode = View.MeasureSpec.getMode(i2);
            int size2 = View.MeasureSpec.getSize(i);
            int size3 = View.MeasureSpec.getSize(i2);
            int paddingLeft = getPaddingLeft() + getPaddingRight();
            int paddingTop = getPaddingTop() + getPaddingBottom();
            int childMeasureSpec = getChildMeasureSpec(i2, paddingTop, -2);
            int i9 = size2 - paddingLeft;
            int i10 = i9 / this.o;
            int i11 = i9 % this.o;
            if (i10 == 0) {
                setMeasuredDimension(i9, 0);
                return;
            }
            int i12 = this.o + (i11 / i10);
            int i13 = 0;
            int i14 = 0;
            int i15 = 0;
            int i16 = 0;
            boolean z4 = false;
            long j2 = 0;
            int childCount2 = getChildCount();
            int i17 = 0;
            while (i17 < childCount2) {
                View childAt = getChildAt(i17);
                if (childAt.getVisibility() != 8) {
                    boolean z5 = childAt instanceof ActionMenuItemView;
                    int i18 = i16 + 1;
                    if (z5) {
                        childAt.setPadding(this.p, 0, this.p, 0);
                    }
                    abd abdVar = (abd) childAt.getLayoutParams();
                    abdVar.f = false;
                    abdVar.c = 0;
                    abdVar.b = 0;
                    abdVar.d = false;
                    abdVar.leftMargin = 0;
                    abdVar.rightMargin = 0;
                    abdVar.e = z5 && ((ActionMenuItemView) childAt).c();
                    int i19 = abdVar.a ? 1 : i10;
                    abd abdVar2 = (abd) childAt.getLayoutParams();
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - paddingTop, View.MeasureSpec.getMode(childMeasureSpec));
                    ActionMenuItemView actionMenuItemView = childAt instanceof ActionMenuItemView ? (ActionMenuItemView) childAt : null;
                    boolean z6 = actionMenuItemView != null && actionMenuItemView.c();
                    int i20 = 0;
                    if (i19 > 0 && (!z6 || i19 >= 2)) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(i12 * i19, Integer.MIN_VALUE), iMakeMeasureSpec);
                        int measuredWidth = childAt.getMeasuredWidth();
                        i20 = measuredWidth / i12;
                        if (measuredWidth % i12 != 0) {
                            i20++;
                        }
                        if (z6 && i20 < 2) {
                            i20 = 2;
                        }
                    }
                    abdVar2.d = !abdVar2.a && z6;
                    abdVar2.b = i20;
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i20 * i12, 1073741824), iMakeMeasureSpec);
                    int iMax = Math.max(i14, i20);
                    int i21 = abdVar.d ? i15 + 1 : i15;
                    boolean z7 = abdVar.a ? true : z4;
                    int i22 = i10 - i20;
                    int iMax2 = Math.max(i13, childAt.getMeasuredHeight());
                    if (i20 == 1) {
                        z4 = z7;
                        i6 = i18;
                        i7 = iMax;
                        i8 = iMax2;
                        i10 = i22;
                        i15 = i21;
                        j = ((long) (1 << i17)) | j2;
                    } else {
                        z4 = z7;
                        i6 = i18;
                        i7 = iMax;
                        i8 = iMax2;
                        i10 = i22;
                        i15 = i21;
                        j = j2;
                    }
                } else {
                    i6 = i16;
                    i7 = i14;
                    i8 = i13;
                    j = j2;
                }
                i17++;
                i14 = i7;
                i13 = i8;
                j2 = j;
                i16 = i6;
            }
            boolean z8 = z4 && i16 == 2;
            long j3 = j2;
            int i23 = i10;
            boolean z9 = false;
            while (i15 > 0 && i23 > 0) {
                int i24 = Integer.MAX_VALUE;
                long j4 = 0;
                int i25 = 0;
                int i26 = 0;
                while (i26 < childCount2) {
                    abd abdVar3 = (abd) getChildAt(i26).getLayoutParams();
                    if (!abdVar3.d) {
                        i4 = i25;
                        i5 = i24;
                    } else if (abdVar3.b < i24) {
                        i5 = abdVar3.b;
                        j4 = 1 << i26;
                        i4 = 1;
                    } else if (abdVar3.b == i24) {
                        j4 |= 1 << i26;
                        i4 = i25 + 1;
                        i5 = i24;
                    } else {
                        i4 = i25;
                        i5 = i24;
                    }
                    i26++;
                    i24 = i5;
                    i25 = i4;
                }
                j3 |= j4;
                if (i25 > i23) {
                    break;
                }
                int i27 = i24 + 1;
                long j5 = j3;
                int i28 = i23;
                int i29 = 0;
                while (i29 < childCount2) {
                    View childAt2 = getChildAt(i29);
                    abd abdVar4 = (abd) childAt2.getLayoutParams();
                    if ((((long) (1 << i29)) & j4) == 0) {
                        if (abdVar4.b == i27) {
                            j5 |= (long) (1 << i29);
                            i3 = i28;
                        } else {
                            i3 = i28;
                        }
                    } else {
                        if (z8 && abdVar4.e && i28 == 1) {
                            childAt2.setPadding(this.p + i12, 0, this.p, 0);
                        }
                        abdVar4.b++;
                        abdVar4.f = true;
                        i3 = i28 - 1;
                    }
                    i29++;
                    i28 = i3;
                }
                j3 = j5;
                i23 = i28;
                z9 = true;
            }
            long j6 = j3;
            boolean z10 = !z4 && i16 == 1;
            if (i23 <= 0 || j6 == 0 || (i23 >= i16 - 1 && !z10 && i14 <= 1)) {
                z = z9;
            } else {
                float fBitCount = Long.bitCount(j6);
                if (z10) {
                    f = fBitCount;
                } else {
                    if ((1 & j6) != 0 && !((abd) getChildAt(0).getLayoutParams()).e) {
                        fBitCount -= 0.5f;
                    }
                    if ((((long) (1 << (childCount2 - 1))) & j6) == 0 || ((abd) getChildAt(childCount2 - 1).getLayoutParams()).e) {
                        f = fBitCount;
                    } else {
                        f = fBitCount - 0.5f;
                    }
                }
                int i30 = f > 0.0f ? (int) ((i23 * i12) / f) : 0;
                int i31 = 0;
                z = z9;
                while (i31 < childCount2) {
                    if ((((long) (1 << i31)) & j6) != 0) {
                        View childAt3 = getChildAt(i31);
                        abd abdVar5 = (abd) childAt3.getLayoutParams();
                        if (childAt3 instanceof ActionMenuItemView) {
                            abdVar5.c = i30;
                            abdVar5.f = true;
                            if (i31 == 0 && !abdVar5.e) {
                                abdVar5.leftMargin = (-i30) / 2;
                            }
                            z2 = true;
                        } else if (abdVar5.a) {
                            abdVar5.c = i30;
                            abdVar5.f = true;
                            abdVar5.rightMargin = (-i30) / 2;
                            z2 = true;
                        } else {
                            if (i31 != 0) {
                                abdVar5.leftMargin = i30 / 2;
                            }
                            if (i31 != childCount2 - 1) {
                                abdVar5.rightMargin = i30 / 2;
                            }
                            z2 = z;
                        }
                    } else {
                        z2 = z;
                    }
                    i31++;
                    z = z2;
                }
            }
            if (z) {
                int i32 = 0;
                while (true) {
                    int i33 = i32;
                    if (i33 >= childCount2) {
                        break;
                    }
                    View childAt4 = getChildAt(i33);
                    abd abdVar6 = (abd) childAt4.getLayoutParams();
                    if (abdVar6.f) {
                        childAt4.measure(View.MeasureSpec.makeMeasureSpec(abdVar6.c + (abdVar6.b * i12), 1073741824), childMeasureSpec);
                    }
                    i32 = i33 + 1;
                }
            }
            if (mode == 1073741824) {
                i13 = size3;
            }
            setMeasuredDimension(i9, i13);
            return;
        }
        for (int i34 = 0; i34 < childCount; i34++) {
            abd abdVar7 = (abd) getChildAt(i34).getLayoutParams();
            abdVar7.rightMargin = 0;
            abdVar7.leftMargin = 0;
        }
        super.onMeasure(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.aei, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        boolean z2;
        int i7;
        int i8;
        int width;
        int paddingLeft;
        if (!this.m) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i9 = (i4 - i2) / 2;
        int i10 = this.i;
        int i11 = 0;
        int paddingRight = ((i3 - i) - getPaddingRight()) - getPaddingLeft();
        boolean z3 = false;
        boolean zA = aic.a(this);
        int i12 = 0;
        while (i12 < childCount) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                abd abdVar = (abd) childAt.getLayoutParams();
                if (abdVar.a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (d(i12)) {
                        measuredWidth += i10;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (zA) {
                        paddingLeft = abdVar.leftMargin + getPaddingLeft();
                        width = paddingLeft + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - abdVar.rightMargin;
                        paddingLeft = width - measuredWidth;
                    }
                    int i13 = i9 - (measuredHeight / 2);
                    childAt.layout(paddingLeft, i13, width, measuredHeight + i13);
                    i8 = paddingRight - measuredWidth;
                    z2 = true;
                    i7 = i11;
                } else {
                    int measuredWidth2 = paddingRight - (abdVar.rightMargin + (childAt.getMeasuredWidth() + abdVar.leftMargin));
                    d(i12);
                    i7 = i11 + 1;
                    boolean z4 = z3;
                    i8 = measuredWidth2;
                    z2 = z4;
                }
            } else {
                z2 = z3;
                i7 = i11;
                i8 = paddingRight;
            }
            i12++;
            i11 = i7;
            paddingRight = i8;
            z3 = z2;
        }
        if (childCount == 1 && !z3) {
            View childAt2 = getChildAt(0);
            int measuredWidth3 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i14 = ((i3 - i) / 2) - (measuredWidth3 / 2);
            int i15 = i9 - (measuredHeight2 / 2);
            childAt2.layout(i14, i15, measuredWidth3 + i14, measuredHeight2 + i15);
            return;
        }
        int i16 = i11 - (z3 ? 0 : 1);
        int iMax = Math.max(0, i16 > 0 ? paddingRight / i16 : 0);
        if (zA) {
            int width2 = getWidth() - getPaddingRight();
            int i17 = 0;
            while (i17 < childCount) {
                View childAt3 = getChildAt(i17);
                abd abdVar2 = (abd) childAt3.getLayoutParams();
                if (childAt3.getVisibility() == 8 || abdVar2.a) {
                    i6 = width2;
                } else {
                    int i18 = width2 - abdVar2.rightMargin;
                    int measuredWidth4 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i19 = i9 - (measuredHeight3 / 2);
                    childAt3.layout(i18 - measuredWidth4, i19, i18, measuredHeight3 + i19);
                    i6 = i18 - ((abdVar2.leftMargin + measuredWidth4) + iMax);
                }
                i17++;
                width2 = i6;
            }
            return;
        }
        int paddingLeft2 = getPaddingLeft();
        int i20 = 0;
        while (i20 < childCount) {
            View childAt4 = getChildAt(i20);
            abd abdVar3 = (abd) childAt4.getLayoutParams();
            if (childAt4.getVisibility() == 8 || abdVar3.a) {
                i5 = paddingLeft2;
            } else {
                int i21 = paddingLeft2 + abdVar3.leftMargin;
                int measuredWidth5 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i22 = i9 - (measuredHeight4 / 2);
                childAt4.layout(i21, i22, i21 + measuredWidth5, measuredHeight4 + i22);
                i5 = abdVar3.rightMargin + measuredWidth5 + iMax + i21;
            }
            i20++;
            paddingLeft2 = i5;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c();
    }

    public static abd a() {
        abd abdVar = new abd(-2, -2);
        abdVar.h = 16;
        return abdVar;
    }

    @Override // flm.aei, android.view.ViewGroup
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final abd generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams != null) {
            abd abdVar = layoutParams instanceof abd ? new abd((abd) layoutParams) : new abd(layoutParams);
            if (abdVar.h <= 0) {
                abdVar.h = 16;
                return abdVar;
            }
            return abdVar;
        }
        return a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.aei, android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams != null && (layoutParams instanceof abd);
    }

    @Override // flm.zk
    public final boolean a(zm zmVar) {
        return this.a.a(zmVar, (zy) null, 0);
    }

    @Override // flm.aaa
    public final void a(zi ziVar) {
        this.a = ziVar;
    }

    public final Menu b() {
        if (this.a == null) {
            Context context = getContext();
            this.a = new zi(context);
            this.a.a(new abe(this));
            this.c = new aat(context);
            this.c.b(true);
            this.c.d = this.l != null ? this.l : new abc();
            this.a.a(this.c, this.j);
            this.c.a(this);
        }
        return this.a;
    }

    public final void a(zz zzVar, zj zjVar) {
        this.l = zzVar;
        this.d = zjVar;
    }

    public final void c() {
        if (this.c != null) {
            this.c.d();
        }
    }

    private final boolean d(int i) {
        boolean zE = false;
        if (i == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i - 1);
        KeyEvent.Callback childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof abb)) {
            zE = ((abb) childAt).e() | false;
        }
        return (i <= 0 || !(childAt2 instanceof abb)) ? zE : ((abb) childAt2).d() | zE;
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.aei
    /* JADX INFO: renamed from: d */
    public final /* synthetic */ aej generateDefaultLayoutParams() {
        return a();
    }

    @Override // flm.aei
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ aej generateLayoutParams(AttributeSet attributeSet) {
        return (abd) generateLayoutParams(attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.aei, android.view.ViewGroup
    public /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return a();
    }

    @Override // flm.aei, android.view.ViewGroup
    public /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new abd(getContext(), attributeSet);
    }
}

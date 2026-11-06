package flm;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.gms.kids.aidl.IKidsInternalService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class aei extends ViewGroup {
    private int a;
    private int b;
    private int c;
    private int d;
    private float e;
    public boolean f;
    public int g;
    public Drawable h;
    public int i;
    private boolean j;
    private int[] k;
    private int[] l;
    private int m;
    private int n;
    private int o;

    public aei(Context context) {
        this(context, null);
    }

    public aei(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public aei(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f = true;
        this.a = -1;
        this.b = 0;
        this.g = 8388659;
        ahe aheVarA = ahe.a(context, attributeSet, xl.aW, i, 0);
        int iA = aheVarA.a(xl.bd, -1);
        if (iA >= 0) {
            c(iA);
        }
        int iA2 = aheVarA.a(xl.bc, -1);
        if (iA2 >= 0 && this.g != iA2) {
            iA2 = (8388615 & iA2) == 0 ? iA2 | 8388611 : iA2;
            this.g = (iA2 & 112) == 0 ? iA2 | 48 : iA2;
            requestLayout();
        }
        boolean zA = aheVarA.a(xl.ba, true);
        if (!zA) {
            this.f = zA;
        }
        this.e = aheVarA.b.getFloat(xl.be, -1.0f);
        this.a = aheVarA.a(xl.bb, -1);
        this.j = aheVarA.a(xl.bh, false);
        Drawable drawableA = aheVarA.a(xl.bf);
        if (drawableA != this.h) {
            this.h = drawableA;
            if (drawableA != null) {
                this.i = drawableA.getIntrinsicWidth();
                this.m = drawableA.getIntrinsicHeight();
            } else {
                this.i = 0;
                this.m = 0;
            }
            setWillNotDraw(drawableA == null);
            requestLayout();
        }
        this.n = aheVarA.a(xl.bi, 0);
        this.o = aheVarA.e(xl.bg, 0);
        aheVarA.b.recycle();
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        int right;
        int left;
        int bottom;
        if (this.h != null) {
            if (this.c == 1) {
                int childCount = getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = getChildAt(i);
                    if (childAt != null && childAt.getVisibility() != 8 && b(i)) {
                        a(canvas, (childAt.getTop() - ((aej) childAt.getLayoutParams()).topMargin) - this.m);
                    }
                }
                if (b(childCount)) {
                    View childAt2 = getChildAt(childCount - 1);
                    if (childAt2 == null) {
                        bottom = (getHeight() - getPaddingBottom()) - this.m;
                    } else {
                        bottom = ((aej) childAt2.getLayoutParams()).bottomMargin + childAt2.getBottom();
                    }
                    a(canvas, bottom);
                    return;
                }
                return;
            }
            int childCount2 = getChildCount();
            boolean zA = aic.a(this);
            for (int i2 = 0; i2 < childCount2; i2++) {
                View childAt3 = getChildAt(i2);
                if (childAt3 != null && childAt3.getVisibility() != 8 && b(i2)) {
                    aej aejVar = (aej) childAt3.getLayoutParams();
                    if (zA) {
                        left = aejVar.rightMargin + childAt3.getRight();
                    } else {
                        left = (childAt3.getLeft() - aejVar.leftMargin) - this.i;
                    }
                    b(canvas, left);
                }
            }
            if (b(childCount2)) {
                View childAt4 = getChildAt(childCount2 - 1);
                if (childAt4 == null) {
                    if (zA) {
                        right = getPaddingLeft();
                    } else {
                        right = (getWidth() - getPaddingRight()) - this.i;
                    }
                } else {
                    aej aejVar2 = (aej) childAt4.getLayoutParams();
                    if (zA) {
                        right = (childAt4.getLeft() - aejVar2.leftMargin) - this.i;
                    } else {
                        right = aejVar2.rightMargin + childAt4.getRight();
                    }
                }
                b(canvas, right);
            }
        }
    }

    private final void a(Canvas canvas, int i) {
        this.h.setBounds(getPaddingLeft() + this.o, i, (getWidth() - getPaddingRight()) - this.o, this.m + i);
        this.h.draw(canvas);
    }

    private final void b(Canvas canvas, int i) {
        this.h.setBounds(i, getPaddingTop() + this.o, this.i + i, (getHeight() - getPaddingBottom()) - this.o);
        this.h.draw(canvas);
    }

    @Override // android.view.View
    public int getBaseline() {
        int bottom;
        int i;
        if (this.a < 0) {
            return super.getBaseline();
        }
        if (getChildCount() <= this.a) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(this.a);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.a != 0) {
                throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
            }
            return -1;
        }
        int i2 = this.b;
        if (this.c == 1 && (i = this.g & 112) != 48) {
            switch (i) {
                case 16:
                    bottom = i2 + (((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.d) / 2);
                    break;
                case 80:
                    bottom = ((getBottom() - getTop()) - getPaddingBottom()) - this.d;
                    break;
                default:
                    bottom = i2;
                    break;
            }
        } else {
            bottom = i2;
        }
        return ((aej) childAt.getLayoutParams()).topMargin + bottom + baseline;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        float f;
        int i5;
        int i6;
        int i7;
        boolean z;
        int i8;
        int iCombineMeasuredStates;
        float f2;
        int baseline;
        int iMax;
        boolean z2;
        boolean z3;
        int iMax2;
        int iMax3;
        boolean z4;
        int i9;
        float f3;
        int i10;
        int i11;
        boolean z5;
        int baseline2;
        int i12;
        int i13;
        float f4;
        int i14;
        int i15;
        int i16;
        int iCombineMeasuredStates2;
        boolean z6;
        int iMax4;
        boolean z7;
        boolean z8;
        int iMax5;
        int iMax6;
        boolean z9;
        int i17;
        float f5;
        int i18;
        int i19;
        boolean z10;
        if (this.c == 1) {
            this.d = 0;
            int i20 = 0;
            int i21 = 0;
            int i22 = 0;
            int i23 = 0;
            boolean z11 = true;
            float f6 = 0.0f;
            int childCount = getChildCount();
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            boolean z12 = false;
            boolean z13 = false;
            int i24 = this.a;
            boolean z14 = this.j;
            int i25 = 0;
            int i26 = 0;
            while (i26 < childCount) {
                View childAt = getChildAt(i26);
                if (childAt == null) {
                    this.d = this.d;
                    i18 = i25;
                    f5 = f6;
                    z9 = z11;
                    i19 = i21;
                    i17 = i20;
                    z10 = z13;
                } else if (childAt.getVisibility() == 8) {
                    i18 = i25;
                    f5 = f6;
                    z9 = z11;
                    i19 = i21;
                    i17 = i20;
                    z10 = z13;
                } else {
                    if (b(i26)) {
                        this.d += this.m;
                    }
                    aej aejVar = (aej) childAt.getLayoutParams();
                    float f7 = f6 + aejVar.g;
                    if (mode2 == 1073741824 && aejVar.height == 0 && aejVar.g > 0.0f) {
                        int i27 = this.d;
                        this.d = Math.max(i27, aejVar.topMargin + i27 + aejVar.bottomMargin);
                        iMax4 = i25;
                        z7 = true;
                    } else {
                        int i28 = Integer.MIN_VALUE;
                        if (aejVar.height == 0 && aejVar.g > 0.0f) {
                            i28 = 0;
                            aejVar.height = -2;
                        }
                        int i29 = i28;
                        a(childAt, i, 0, i2, f7 == 0.0f ? this.d : 0);
                        if (i29 != Integer.MIN_VALUE) {
                            aejVar.height = i29;
                        }
                        int measuredHeight = childAt.getMeasuredHeight();
                        int i30 = this.d;
                        this.d = Math.max(i30, i30 + measuredHeight + aejVar.topMargin + aejVar.bottomMargin);
                        if (z14) {
                            iMax4 = Math.max(measuredHeight, i25);
                            z7 = z13;
                        } else {
                            iMax4 = i25;
                            z7 = z13;
                        }
                    }
                    if (i24 >= 0 && i24 == i26 + 1) {
                        this.b = this.d;
                    }
                    if (i26 < i24 && aejVar.g > 0.0f) {
                        throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                    }
                    boolean z15 = false;
                    if (mode == 1073741824 || aejVar.width != -1) {
                        z8 = z12;
                    } else {
                        z8 = true;
                        z15 = true;
                    }
                    int i31 = aejVar.leftMargin + aejVar.rightMargin;
                    int measuredWidth = childAt.getMeasuredWidth() + i31;
                    int iMax7 = Math.max(i20, measuredWidth);
                    int iCombineMeasuredStates3 = View.combineMeasuredStates(i21, childAt.getMeasuredState());
                    boolean z16 = z11 && aejVar.width == -1;
                    if (aejVar.g > 0.0f) {
                        iMax6 = Math.max(i23, z15 ? i31 : measuredWidth);
                        iMax5 = i22;
                    } else {
                        if (!z15) {
                            i31 = measuredWidth;
                        }
                        iMax5 = Math.max(i22, i31);
                        iMax6 = i23;
                    }
                    z9 = z16;
                    i23 = iMax6;
                    i22 = iMax5;
                    i17 = iMax7;
                    f5 = f7;
                    i18 = iMax4;
                    i19 = iCombineMeasuredStates3;
                    z12 = z8;
                    z10 = z7;
                }
                i26++;
                i25 = i18;
                z13 = z10;
                z11 = z9;
                i21 = i19;
                i20 = i17;
                f6 = f5;
            }
            if (this.d > 0 && b(childCount)) {
                this.d += this.m;
            }
            if (z14 && (mode2 == Integer.MIN_VALUE || mode2 == 0)) {
                this.d = 0;
                for (int i32 = 0; i32 < childCount; i32++) {
                    View childAt2 = getChildAt(i32);
                    if (childAt2 == null) {
                        this.d = this.d;
                    } else if (childAt2.getVisibility() != 8) {
                        aej aejVar2 = (aej) childAt2.getLayoutParams();
                        int i33 = this.d;
                        this.d = Math.max(i33, aejVar2.bottomMargin + i33 + i25 + aejVar2.topMargin);
                    }
                }
            }
            this.d += getPaddingTop() + getPaddingBottom();
            int iResolveSizeAndState = View.resolveSizeAndState(Math.max(this.d, getSuggestedMinimumHeight()), i2, 0);
            int i34 = (16777215 & iResolveSizeAndState) - this.d;
            if (z13 || (i34 != 0 && f6 > 0.0f)) {
                if (this.e > 0.0f) {
                    f6 = this.e;
                }
                this.d = 0;
                int i35 = 0;
                boolean z17 = z11;
                int i36 = i22;
                int i37 = i21;
                int i38 = i20;
                while (i35 < childCount) {
                    View childAt3 = getChildAt(i35);
                    if (childAt3.getVisibility() != 8) {
                        aej aejVar3 = (aej) childAt3.getLayoutParams();
                        float f8 = aejVar3.g;
                        if (f8 > 0.0f) {
                            int i39 = (int) ((i34 * f8) / f6);
                            float f9 = f6 - f8;
                            int i40 = i34 - i39;
                            int childMeasureSpec = getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + aejVar3.leftMargin + aejVar3.rightMargin, aejVar3.width);
                            if (aejVar3.height != 0 || mode2 != 1073741824) {
                                int measuredHeight2 = i39 + childAt3.getMeasuredHeight();
                                if (measuredHeight2 < 0) {
                                    measuredHeight2 = 0;
                                }
                                childAt3.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
                            } else {
                                if (i39 <= 0) {
                                    i39 = 0;
                                }
                                childAt3.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(i39, 1073741824));
                            }
                            i16 = i40;
                            iCombineMeasuredStates2 = View.combineMeasuredStates(i37, childAt3.getMeasuredState() & (-256));
                            f4 = f9;
                        } else {
                            f4 = f6;
                            i16 = i34;
                            iCombineMeasuredStates2 = i37;
                        }
                        int i41 = aejVar3.leftMargin + aejVar3.rightMargin;
                        int measuredWidth2 = childAt3.getMeasuredWidth() + i41;
                        int iMax8 = Math.max(i38, measuredWidth2);
                        if (!(mode != 1073741824 && aejVar3.width == -1)) {
                            i41 = measuredWidth2;
                        }
                        int iMax9 = Math.max(i36, i41);
                        z6 = z17 && aejVar3.width == -1;
                        int i42 = this.d;
                        this.d = Math.max(i42, aejVar3.bottomMargin + childAt3.getMeasuredHeight() + i42 + aejVar3.topMargin);
                        i14 = iMax9;
                        i15 = iMax8;
                    } else {
                        f4 = f6;
                        i14 = i36;
                        i15 = i38;
                        i16 = i34;
                        iCombineMeasuredStates2 = i37;
                        z6 = z17;
                    }
                    i35++;
                    i36 = i14;
                    i38 = i15;
                    z17 = z6;
                    i37 = iCombineMeasuredStates2;
                    i34 = i16;
                    f6 = f4;
                }
                this.d += getPaddingTop() + getPaddingBottom();
                z11 = z17;
                i12 = i36;
                i21 = i37;
                i13 = i38;
            } else {
                int iMax10 = Math.max(i22, i23);
                if (z14 && mode2 != 1073741824) {
                    int i43 = 0;
                    while (true) {
                        int i44 = i43;
                        if (i44 >= childCount) {
                            break;
                        }
                        View childAt4 = getChildAt(i44);
                        if (childAt4 != null && childAt4.getVisibility() != 8 && ((aej) childAt4.getLayoutParams()).g > 0.0f) {
                            childAt4.measure(View.MeasureSpec.makeMeasureSpec(childAt4.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(i25, 1073741824));
                        }
                        i43 = i44 + 1;
                    }
                }
                i12 = iMax10;
                i13 = i20;
            }
            if (z11 || mode == 1073741824) {
                i12 = i13;
            }
            setMeasuredDimension(View.resolveSizeAndState(Math.max(i12 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i, i21), iResolveSizeAndState);
            if (z12) {
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
                int i45 = 0;
                while (true) {
                    int i46 = i45;
                    if (i46 < childCount) {
                        View childAt5 = getChildAt(i46);
                        if (childAt5.getVisibility() != 8) {
                            aej aejVar4 = (aej) childAt5.getLayoutParams();
                            if (aejVar4.width == -1) {
                                int i47 = aejVar4.height;
                                aejVar4.height = childAt5.getMeasuredHeight();
                                measureChildWithMargins(childAt5, iMakeMeasureSpec, 0, i2, 0);
                                aejVar4.height = i47;
                            }
                        }
                        i45 = i46 + 1;
                    } else {
                        return;
                    }
                }
            }
        } else {
            this.d = 0;
            int i48 = 0;
            int i49 = 0;
            int i50 = 0;
            int i51 = 0;
            boolean z18 = true;
            float f10 = 0.0f;
            int childCount2 = getChildCount();
            int mode3 = View.MeasureSpec.getMode(i);
            int mode4 = View.MeasureSpec.getMode(i2);
            boolean z19 = false;
            boolean z20 = false;
            if (this.k == null || this.l == null) {
                this.k = new int[4];
                this.l = new int[4];
            }
            int[] iArr = this.k;
            int[] iArr2 = this.l;
            iArr[3] = -1;
            iArr[2] = -1;
            iArr[1] = -1;
            iArr[0] = -1;
            iArr2[3] = -1;
            iArr2[2] = -1;
            iArr2[1] = -1;
            iArr2[0] = -1;
            boolean z21 = this.f;
            boolean z22 = this.j;
            boolean z23 = mode3 == 1073741824;
            int i52 = 0;
            int i53 = 0;
            while (i53 < childCount2) {
                View childAt6 = getChildAt(i53);
                if (childAt6 == null) {
                    this.d = this.d;
                    i10 = i52;
                    f3 = f10;
                    z4 = z18;
                    i11 = i49;
                    i9 = i48;
                    z5 = z20;
                } else if (childAt6.getVisibility() == 8) {
                    i10 = i52;
                    f3 = f10;
                    z4 = z18;
                    i11 = i49;
                    i9 = i48;
                    z5 = z20;
                } else {
                    if (b(i53)) {
                        this.d += this.i;
                    }
                    aej aejVar5 = (aej) childAt6.getLayoutParams();
                    float f11 = f10 + aejVar5.g;
                    if (mode3 == 1073741824 && aejVar5.width == 0 && aejVar5.g > 0.0f) {
                        if (z23) {
                            this.d += aejVar5.leftMargin + aejVar5.rightMargin;
                        } else {
                            int i54 = this.d;
                            this.d = Math.max(i54, aejVar5.leftMargin + i54 + aejVar5.rightMargin);
                        }
                        if (z21) {
                            int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
                            childAt6.measure(iMakeMeasureSpec2, iMakeMeasureSpec2);
                            iMax = i52;
                            z2 = z20;
                        } else {
                            iMax = i52;
                            z2 = true;
                        }
                    } else {
                        int i55 = Integer.MIN_VALUE;
                        if (aejVar5.width == 0 && aejVar5.g > 0.0f) {
                            i55 = 0;
                            aejVar5.width = -2;
                        }
                        int i56 = i55;
                        a(childAt6, i, f11 == 0.0f ? this.d : 0, i2, 0);
                        if (i56 != Integer.MIN_VALUE) {
                            aejVar5.width = i56;
                        }
                        int measuredWidth3 = childAt6.getMeasuredWidth();
                        if (z23) {
                            this.d += aejVar5.leftMargin + measuredWidth3 + aejVar5.rightMargin;
                        } else {
                            int i57 = this.d;
                            this.d = Math.max(i57, i57 + measuredWidth3 + aejVar5.leftMargin + aejVar5.rightMargin);
                        }
                        if (z22) {
                            iMax = Math.max(measuredWidth3, i52);
                            z2 = z20;
                        } else {
                            iMax = i52;
                            z2 = z20;
                        }
                    }
                    boolean z24 = false;
                    if (mode4 == 1073741824 || aejVar5.height != -1) {
                        z3 = z19;
                    } else {
                        z3 = true;
                        z24 = true;
                    }
                    int i58 = aejVar5.topMargin + aejVar5.bottomMargin;
                    int measuredHeight3 = childAt6.getMeasuredHeight() + i58;
                    int iCombineMeasuredStates4 = View.combineMeasuredStates(i49, childAt6.getMeasuredState());
                    if (z21 && (baseline2 = childAt6.getBaseline()) != -1) {
                        int i59 = ((((aejVar5.h < 0 ? this.g : aejVar5.h) & 112) >> 4) & (-2)) >> 1;
                        iArr[i59] = Math.max(iArr[i59], baseline2);
                        iArr2[i59] = Math.max(iArr2[i59], measuredHeight3 - baseline2);
                    }
                    int iMax11 = Math.max(i48, measuredHeight3);
                    boolean z25 = z18 && aejVar5.height == -1;
                    if (aejVar5.g > 0.0f) {
                        iMax3 = Math.max(i51, z24 ? i58 : measuredHeight3);
                        iMax2 = i50;
                    } else {
                        if (!z24) {
                            i58 = measuredHeight3;
                        }
                        iMax2 = Math.max(i50, i58);
                        iMax3 = i51;
                    }
                    z4 = z25;
                    i51 = iMax3;
                    i50 = iMax2;
                    i9 = iMax11;
                    f3 = f11;
                    i10 = iMax;
                    i11 = iCombineMeasuredStates4;
                    z19 = z3;
                    z5 = z2;
                }
                i53++;
                i52 = i10;
                z20 = z5;
                z18 = z4;
                i49 = i11;
                i48 = i9;
                f10 = f3;
            }
            if (this.d > 0 && b(childCount2)) {
                this.d += this.i;
            }
            int iMax12 = (iArr[1] == -1 && iArr[0] == -1 && iArr[2] == -1 && iArr[3] == -1) ? i48 : Math.max(i48, Math.max(iArr[3], Math.max(iArr[0], Math.max(iArr[1], iArr[2]))) + Math.max(iArr2[3], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))));
            if (z22 && (mode3 == Integer.MIN_VALUE || mode3 == 0)) {
                this.d = 0;
                for (int i60 = 0; i60 < childCount2; i60++) {
                    View childAt7 = getChildAt(i60);
                    if (childAt7 == null) {
                        this.d = this.d;
                    } else if (childAt7.getVisibility() != 8) {
                        aej aejVar6 = (aej) childAt7.getLayoutParams();
                        if (z23) {
                            this.d = aejVar6.rightMargin + aejVar6.leftMargin + i52 + this.d;
                        } else {
                            int i61 = this.d;
                            this.d = Math.max(i61, aejVar6.rightMargin + i61 + i52 + aejVar6.leftMargin);
                        }
                    }
                }
            }
            this.d += getPaddingLeft() + getPaddingRight();
            int iResolveSizeAndState2 = View.resolveSizeAndState(Math.max(this.d, getSuggestedMinimumWidth()), i, 0);
            int i62 = (16777215 & iResolveSizeAndState2) - this.d;
            if (z20 || (i62 != 0 && f10 > 0.0f)) {
                if (this.e > 0.0f) {
                    f10 = this.e;
                }
                iArr[3] = -1;
                iArr[2] = -1;
                iArr[1] = -1;
                iArr[0] = -1;
                iArr2[3] = -1;
                iArr2[2] = -1;
                iArr2[1] = -1;
                iArr2[0] = -1;
                int iMax13 = -1;
                this.d = 0;
                int i63 = 0;
                boolean z26 = z18;
                int i64 = i50;
                int i65 = i49;
                while (i63 < childCount2) {
                    View childAt8 = getChildAt(i63);
                    if (childAt8 == null || childAt8.getVisibility() == 8) {
                        f = f10;
                        i5 = i62;
                        i6 = iMax13;
                        i7 = i64;
                        z = z26;
                    } else {
                        aej aejVar7 = (aej) childAt8.getLayoutParams();
                        float f12 = aejVar7.g;
                        if (f12 > 0.0f) {
                            int i66 = (int) ((i62 * f12) / f10);
                            float f13 = f10 - f12;
                            i8 = i62 - i66;
                            int childMeasureSpec2 = getChildMeasureSpec(i2, getPaddingTop() + getPaddingBottom() + aejVar7.topMargin + aejVar7.bottomMargin, aejVar7.height);
                            if (aejVar7.width != 0 || mode3 != 1073741824) {
                                int measuredWidth4 = i66 + childAt8.getMeasuredWidth();
                                if (measuredWidth4 < 0) {
                                    measuredWidth4 = 0;
                                }
                                childAt8.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth4, 1073741824), childMeasureSpec2);
                            } else {
                                if (i66 <= 0) {
                                    i66 = 0;
                                }
                                childAt8.measure(View.MeasureSpec.makeMeasureSpec(i66, 1073741824), childMeasureSpec2);
                            }
                            iCombineMeasuredStates = View.combineMeasuredStates(i65, childAt8.getMeasuredState() & (-16777216));
                            f2 = f13;
                        } else {
                            i8 = i62;
                            iCombineMeasuredStates = i65;
                            f2 = f10;
                        }
                        if (z23) {
                            this.d += childAt8.getMeasuredWidth() + aejVar7.leftMargin + aejVar7.rightMargin;
                        } else {
                            int i67 = this.d;
                            this.d = Math.max(i67, childAt8.getMeasuredWidth() + i67 + aejVar7.leftMargin + aejVar7.rightMargin);
                        }
                        boolean z27 = mode4 != 1073741824 && aejVar7.height == -1;
                        int i68 = aejVar7.topMargin + aejVar7.bottomMargin;
                        int measuredHeight4 = childAt8.getMeasuredHeight() + i68;
                        int iMax14 = Math.max(iMax13, measuredHeight4);
                        int iMax15 = Math.max(i64, z27 ? i68 : measuredHeight4);
                        boolean z28 = z26 && aejVar7.height == -1;
                        if (z21 && (baseline = childAt8.getBaseline()) != -1) {
                            int i69 = ((((aejVar7.h < 0 ? this.g : aejVar7.h) & 112) >> 4) & (-2)) >> 1;
                            iArr[i69] = Math.max(iArr[i69], baseline);
                            iArr2[i69] = Math.max(iArr2[i69], measuredHeight4 - baseline);
                        }
                        f = f2;
                        i7 = iMax15;
                        z = z28;
                        i65 = iCombineMeasuredStates;
                        i5 = i8;
                        i6 = iMax14;
                    }
                    i63++;
                    i64 = i7;
                    iMax13 = i6;
                    z26 = z;
                    i62 = i5;
                    f10 = f;
                }
                this.d += getPaddingLeft() + getPaddingRight();
                if (iArr[1] != -1 || iArr[0] != -1 || iArr[2] != -1 || iArr[3] != -1) {
                    iMax13 = Math.max(iMax13, Math.max(iArr[3], Math.max(iArr[0], Math.max(iArr[1], iArr[2]))) + Math.max(iArr2[3], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))));
                }
                z18 = z26;
                i3 = i64;
                i49 = i65;
                i4 = iMax13;
            } else {
                int iMax16 = Math.max(i50, i51);
                if (z22 && mode3 != 1073741824) {
                    int i70 = 0;
                    while (true) {
                        int i71 = i70;
                        if (i71 >= childCount2) {
                            break;
                        }
                        View childAt9 = getChildAt(i71);
                        if (childAt9 != null && childAt9.getVisibility() != 8 && ((aej) childAt9.getLayoutParams()).g > 0.0f) {
                            childAt9.measure(View.MeasureSpec.makeMeasureSpec(i52, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt9.getMeasuredHeight(), 1073741824));
                        }
                        i70 = i71 + 1;
                    }
                }
                i3 = iMax16;
                i4 = iMax12;
            }
            if (z18 || mode4 == 1073741824) {
                i3 = i4;
            }
            setMeasuredDimension(((-16777216) & i49) | iResolveSizeAndState2, View.resolveSizeAndState(Math.max(i3 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i2, i49 << 16));
            if (z19) {
                int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
                int i72 = 0;
                while (true) {
                    int i73 = i72;
                    if (i73 < childCount2) {
                        View childAt10 = getChildAt(i73);
                        if (childAt10.getVisibility() != 8) {
                            aej aejVar8 = (aej) childAt10.getLayoutParams();
                            if (aejVar8.height == -1) {
                                int i74 = aejVar8.width;
                                aejVar8.width = childAt10.getMeasuredWidth();
                                measureChildWithMargins(childAt10, i, 0, iMakeMeasureSpec3, 0);
                                aejVar8.width = i74;
                            }
                        }
                        i72 = i73 + 1;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public final boolean b(int i) {
        if (i == 0) {
            return (this.n & 1) != 0;
        }
        if (i == getChildCount()) {
            return (this.n & 4) != 0;
        }
        if ((this.n & 2) == 0) {
            return false;
        }
        for (int i2 = i - 1; i2 >= 0; i2--) {
            if (getChildAt(i2).getVisibility() != 8) {
                return true;
            }
        }
        return false;
    }

    private final void a(View view, int i, int i2, int i3, int i4) {
        measureChildWithMargins(view, i, i2, i3, i4);
    }

    /* JADX WARN: Code duplicated, block: B:69:0x01cb A[PHI: r7
  0x01cb: PHI (r7v7 int) = (r7v4 int), (r7v9 int) binds: [B:65:0x01b7, B:61:0x0195] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingLeft;
        int i5;
        int i6;
        int i7;
        int measuredHeight;
        int paddingTop;
        int i8;
        if (this.c == 1) {
            int paddingLeft2 = getPaddingLeft();
            int i9 = i3 - i;
            int paddingRight = i9 - getPaddingRight();
            int paddingRight2 = (i9 - paddingLeft2) - getPaddingRight();
            int childCount = getChildCount();
            int i10 = this.g & 112;
            int i11 = 8388615 & this.g;
            switch (i10) {
                case 16:
                    paddingTop = getPaddingTop() + (((i4 - i2) - this.d) / 2);
                    break;
                case 80:
                    paddingTop = ((getPaddingTop() + i4) - i2) - this.d;
                    break;
                default:
                    paddingTop = getPaddingTop();
                    break;
            }
            int i12 = paddingTop;
            for (int i13 = 0; i13 < childCount; i13++) {
                View childAt = getChildAt(i13);
                if (childAt != null && childAt.getVisibility() != 8) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight2 = childAt.getMeasuredHeight();
                    aej aejVar = (aej) childAt.getLayoutParams();
                    int i14 = aejVar.h;
                    if (i14 < 0) {
                        i14 = i11;
                    }
                    switch (sz.a(i14, ti.f(this)) & 7) {
                        case 1:
                            i8 = ((((paddingRight2 - measuredWidth) / 2) + paddingLeft2) + aejVar.leftMargin) - aejVar.rightMargin;
                            break;
                        case 5:
                            i8 = (paddingRight - measuredWidth) - aejVar.rightMargin;
                            break;
                        default:
                            i8 = aejVar.leftMargin + paddingLeft2;
                            break;
                    }
                    if (b(i13)) {
                        i12 += this.m;
                    }
                    int i15 = i12 + aejVar.topMargin;
                    b(childAt, i8, i15, measuredWidth, measuredHeight2);
                    i12 = i15 + aejVar.bottomMargin + measuredHeight2;
                }
            }
            return;
        }
        boolean zA = aic.a(this);
        int paddingTop2 = getPaddingTop();
        int i16 = i4 - i2;
        int paddingBottom = i16 - getPaddingBottom();
        int paddingBottom2 = (i16 - paddingTop2) - getPaddingBottom();
        int childCount2 = getChildCount();
        int i17 = this.g & 8388615;
        int i18 = this.g & 112;
        boolean z2 = this.f;
        int[] iArr = this.k;
        int[] iArr2 = this.l;
        switch (sz.a(i17, ti.f(this))) {
            case 1:
                paddingLeft = getPaddingLeft() + (((i3 - i) - this.d) / 2);
                break;
            case 5:
                paddingLeft = ((getPaddingLeft() + i3) - i) - this.d;
                break;
            default:
                paddingLeft = getPaddingLeft();
                break;
        }
        if (!zA) {
            i5 = 0;
            i6 = 1;
        } else {
            i5 = childCount2 - 1;
            i6 = -1;
        }
        for (int i19 = 0; i19 < childCount2; i19++) {
            int i20 = i5 + (i6 * i19);
            View childAt2 = getChildAt(i20);
            if (childAt2 != null && childAt2.getVisibility() != 8) {
                int measuredWidth2 = childAt2.getMeasuredWidth();
                int measuredHeight3 = childAt2.getMeasuredHeight();
                int baseline = -1;
                aej aejVar2 = (aej) childAt2.getLayoutParams();
                if (z2 && aejVar2.height != -1) {
                    baseline = childAt2.getBaseline();
                }
                int i21 = aejVar2.h;
                if (i21 < 0) {
                    i21 = i18;
                }
                switch (i21 & 112) {
                    case 16:
                        measuredHeight = ((((paddingBottom2 - measuredHeight3) / 2) + paddingTop2) + aejVar2.topMargin) - aejVar2.bottomMargin;
                        break;
                    case IKidsInternalService.Stub.TRANSACTION_getMemberSvExitState /* 48 */:
                        i7 = aejVar2.topMargin + paddingTop2;
                        if (baseline != -1) {
                            measuredHeight = (iArr[1] - baseline) + i7;
                        } else {
                            measuredHeight = i7;
                        }
                        break;
                    case 80:
                        i7 = (paddingBottom - measuredHeight3) - aejVar2.bottomMargin;
                        if (baseline != -1) {
                            measuredHeight = i7 - (iArr2[2] - (childAt2.getMeasuredHeight() - baseline));
                        } else {
                            measuredHeight = i7;
                        }
                        break;
                    default:
                        measuredHeight = paddingTop2;
                        break;
                }
                int i22 = (b(i20) ? this.i + paddingLeft : paddingLeft) + aejVar2.leftMargin;
                b(childAt2, i22, measuredHeight, measuredWidth2, measuredHeight3);
                paddingLeft = i22 + aejVar2.rightMargin + measuredWidth2;
            }
        }
    }

    private static void b(View view, int i, int i2, int i3, int i4) {
        view.layout(i, i2, i + i3, i2 + i4);
    }

    public final void c(int i) {
        if (this.c != i) {
            this.c = i;
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public aej generateLayoutParams(AttributeSet attributeSet) {
        return new aej(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public aej generateDefaultLayoutParams() {
        if (this.c == 0) {
            return new aej(-2, -2);
        }
        if (this.c == 1) {
            return new aej(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public aej generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new aej(layoutParams);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof aej;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(aei.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(aei.class.getName());
    }
}

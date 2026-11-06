package flm;

import android.content.Context;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class aee extends aek {
    private boolean r;
    private int s;
    private int[] t;
    private View[] u;
    private final SparseIntArray v;
    private final SparseIntArray w;
    private aeh x;
    private final Rect y;

    public aee(Context context, int i) {
        super(context);
        this.r = false;
        this.s = -1;
        this.v = new SparseIntArray();
        this.w = new SparseIntArray();
        this.x = new aef();
        this.y = new Rect();
        if (i != this.s) {
            this.r = true;
            if (i <= 0) {
                throw new IllegalArgumentException("Span count should be at least 1. Provided " + i);
            }
            this.s = i;
            this.x.a.clear();
            n();
        }
    }

    @Override // flm.afw
    public final int a(agf agfVar, agk agkVar) {
        if (this.a == 0) {
            return this.s;
        }
        if (agkVar.a() <= 0) {
            return 0;
        }
        return a(agfVar, agkVar, agkVar.a() - 1) + 1;
    }

    @Override // flm.afw
    public final int b(agf agfVar, agk agkVar) {
        if (this.a == 1) {
            return this.s;
        }
        if (agkVar.a() <= 0) {
            return 0;
        }
        return a(agfVar, agkVar, agkVar.a() - 1) + 1;
    }

    @Override // flm.afw
    public final void a(agf agfVar, agk agkVar, View view, ua uaVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof aeg)) {
            super.a(view, uaVar);
            return;
        }
        aeg aegVar = (aeg) layoutParams;
        int iA = a(agfVar, agkVar, aegVar.c.c());
        if (this.a == 0) {
            uaVar.a(uc.a(aegVar.a, aegVar.b, iA, 1, this.s > 1 && aegVar.b == this.s, false));
        } else {
            uaVar.a(uc.a(iA, 1, aegVar.a, aegVar.b, this.s > 1 && aegVar.b == this.s, false));
        }
    }

    @Override // flm.aek, flm.afw
    public final void c(agf agfVar, agk agkVar) {
        if (agkVar.g) {
            int iO = o();
            for (int i = 0; i < iO; i++) {
                aeg aegVar = (aeg) e(i).getLayoutParams();
                int iC = aegVar.c.c();
                this.v.put(iC, aegVar.b);
                this.w.put(iC, aegVar.a);
            }
        }
        super.c(agfVar, agkVar);
        this.v.clear();
        this.w.clear();
    }

    @Override // flm.aek, flm.afw
    public final void a(agk agkVar) {
        super.a(agkVar);
        this.r = false;
    }

    @Override // flm.afw
    public final void a() {
        this.x.a.clear();
    }

    @Override // flm.afw
    public final void b() {
        this.x.a.clear();
    }

    @Override // flm.afw
    public final void c() {
        this.x.a.clear();
    }

    @Override // flm.afw
    public final void a(RecyclerView recyclerView, int i, int i2) {
        this.x.a.clear();
    }

    @Override // flm.afw
    public final void d() {
        this.x.a.clear();
    }

    @Override // flm.aek, flm.afw
    public final aga e() {
        return this.a == 0 ? new aeg(-2, -1) : new aeg(-1, -2);
    }

    @Override // flm.afw
    public final aga a(Context context, AttributeSet attributeSet) {
        return new aeg(context, attributeSet);
    }

    @Override // flm.afw
    public final aga a(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new aeg((ViewGroup.MarginLayoutParams) layoutParams) : new aeg(layoutParams);
    }

    @Override // flm.afw
    public final boolean a(aga agaVar) {
        return agaVar instanceof aeg;
    }

    private final void u() {
        int iS;
        if (((aek) this).a == 1) {
            iS = (this.p - r()) - p();
        } else {
            iS = (this.q - s()) - q();
        }
        f(iS);
    }

    @Override // flm.afw
    public final void a(Rect rect, int i, int i2) {
        int iA;
        int iA2;
        if (this.t == null) {
            super.a(rect, i, i2);
        }
        int iR = r() + p();
        int iQ = q() + s();
        if (this.a == 1) {
            iA2 = a(i2, iQ + rect.height(), ti.k(this.f));
            iA = a(i, iR + this.t[this.t.length - 1], ti.j(this.f));
        } else {
            iA = a(i, iR + rect.width(), ti.j(this.f));
            iA2 = a(i2, iQ + this.t[this.t.length - 1], ti.k(this.f));
        }
        d(iA, iA2);
    }

    private final void f(int i) {
        int i2;
        int i3 = 0;
        int[] iArr = this.t;
        int i4 = this.s;
        if (iArr == null || iArr.length != i4 + 1 || iArr[iArr.length - 1] != i) {
            iArr = new int[i4 + 1];
        }
        iArr[0] = 0;
        int i5 = i / i4;
        int i6 = i % i4;
        int i7 = 0;
        for (int i8 = 1; i8 <= i4; i8++) {
            i3 += i6;
            if (i3 <= 0 || i4 - i3 >= i6) {
                i2 = i5;
            } else {
                i2 = i5 + 1;
                i3 -= i4;
            }
            i7 += i2;
            iArr[i8] = i7;
        }
        this.t = iArr;
    }

    private final int e(int i, int i2) {
        return (this.a == 1 && k()) ? this.t[this.s - i] - this.t[(this.s - i) - i2] : this.t[i + i2] - this.t[i];
    }

    @Override // flm.aek
    final void a(agf agfVar, agk agkVar, ael aelVar, int i) {
        super.a(agfVar, agkVar, aelVar, i);
        u();
        if (agkVar.a() > 0 && !agkVar.g) {
            boolean z = i == 1;
            int iB = b(agfVar, agkVar, aelVar.b);
            if (z) {
                while (iB > 0 && aelVar.b > 0) {
                    aelVar.b--;
                    iB = b(agfVar, agkVar, aelVar.b);
                }
            } else {
                int iA = agkVar.a() - 1;
                int i2 = aelVar.b;
                int i3 = iB;
                while (i2 < iA) {
                    int iB2 = b(agfVar, agkVar, i2 + 1);
                    if (iB2 <= i3) {
                        break;
                    }
                    i2++;
                    i3 = iB2;
                }
                aelVar.b = i2;
            }
        }
        v();
    }

    private final void v() {
        if (this.u == null || this.u.length != this.s) {
            this.u = new View[this.s];
        }
    }

    @Override // flm.aek, flm.afw
    public final int a(int i, agf agfVar, agk agkVar) {
        u();
        v();
        return super.a(i, agfVar, agkVar);
    }

    @Override // flm.aek, flm.afw
    public final int b(int i, agf agfVar, agk agkVar) {
        u();
        v();
        return super.b(i, agfVar, agkVar);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x005c  */
    @Override // flm.aek
    final View a(agf agfVar, agk agkVar, int i, int i2, int i3) {
        View view;
        View view2 = null;
        l();
        int iB = this.b.b();
        int iC = this.b.c();
        int i4 = i2 > i ? 1 : -1;
        View view3 = null;
        while (i != i2) {
            View viewE = e(i);
            int iA = a(viewE);
            if (iA < 0 || iA >= i3 || b(agfVar, agkVar, iA) != 0) {
                view = view2;
                viewE = view3;
            } else if (((aga) viewE.getLayoutParams()).c.m()) {
                if (view3 == null) {
                    view = view2;
                } else {
                    view = view2;
                    viewE = view3;
                }
            } else {
                if (this.b.a(viewE) < iC && this.b.b(viewE) >= iB) {
                    return viewE;
                }
                if (view2 == null) {
                    view = viewE;
                    viewE = view3;
                } else {
                    view = view2;
                    viewE = view3;
                }
            }
            i += i4;
            view2 = view;
            view3 = viewE;
        }
        return view2 != null ? view2 : view3;
    }

    private final int a(agf agfVar, agk agkVar, int i) {
        if (!agkVar.g) {
            return this.x.b(i, this.s);
        }
        int iA = agfVar.a(i);
        if (iA == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i);
            return 0;
        }
        return this.x.b(iA, this.s);
    }

    private final int b(agf agfVar, agk agkVar, int i) {
        if (!agkVar.g) {
            return this.x.a(i, this.s);
        }
        int i2 = this.w.get(i, -1);
        if (i2 == -1) {
            int iA = agfVar.a(i);
            if (iA == -1) {
                Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
                return 0;
            }
            return this.x.a(iA, this.s);
        }
        return i2;
    }

    private final int c(agf agfVar, agk agkVar, int i) {
        if (!agkVar.g) {
            return 1;
        }
        int i2 = this.v.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        if (agfVar.a(i) != -1) {
            return 1;
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 1;
    }

    @Override // flm.aek
    final void a(agk agkVar, aen aenVar, afz afzVar) {
        int i = this.s;
        for (int i2 = 0; i2 < this.s && aenVar.a(agkVar) && i > 0; i2++) {
            afzVar.a(aenVar.d, Math.max(0, aenVar.g));
            i--;
            aenVar.d += aenVar.e;
        }
    }

    @Override // flm.aek
    final void a(agf agfVar, agk agkVar, aen aenVar, aem aemVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int iMakeMeasureSpec;
        int iA;
        View viewA;
        int iH = this.b.h();
        boolean z = iH != 1073741824;
        int i8 = o() > 0 ? this.t[this.s] : 0;
        if (z) {
            u();
        }
        boolean z2 = aenVar.e == 1;
        int i9 = 0;
        int iB = this.s;
        if (!z2) {
            iB = b(agfVar, agkVar, aenVar.d) + c(agfVar, agkVar, aenVar.d);
        }
        while (i9 < this.s && aenVar.a(agkVar) && iB > 0) {
            int i10 = aenVar.d;
            int iC = c(agfVar, agkVar, i10);
            if (iC > this.s) {
                throw new IllegalArgumentException("Item at position " + i10 + " requires " + iC + " spans but GridLayoutManager has only " + this.s + " spans.");
            }
            iB -= iC;
            if (iB < 0 || (viewA = aenVar.a(agfVar)) == null) {
                break;
            }
            this.u[i9] = viewA;
            i9++;
        }
        if (i9 == 0) {
            aemVar.b = true;
            return;
        }
        if (z2) {
            i2 = i9;
            i = 0;
            i3 = 1;
        } else {
            i = i9 - 1;
            i2 = -1;
            i3 = -1;
        }
        int i11 = 0;
        for (int i12 = i; i12 != i2; i12 += i3) {
            View view = this.u[i12];
            aeg aegVar = (aeg) view.getLayoutParams();
            aegVar.b = c(agfVar, agkVar, a(view));
            aegVar.a = i11;
            i11 += aegVar.b;
        }
        float f = 0.0f;
        int i13 = 0;
        int i14 = 0;
        while (i14 < i9) {
            View view2 = this.u[i14];
            if (aenVar.j == null) {
                if (z2) {
                    super.a(view2, -1, false);
                } else {
                    super.a(view2, 0, false);
                }
            } else if (z2) {
                super.a(view2, -1, true);
            } else {
                super.a(view2, 0, true);
            }
            Rect rect = this.y;
            if (this.f == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(this.f.d(view2));
            }
            b(view2, iH, false);
            int iE = this.b.e(view2);
            if (iE > i13) {
                i13 = iE;
            }
            float f2 = (this.b.f(view2) * 1.0f) / ((aeg) view2.getLayoutParams()).b;
            if (f2 <= f) {
                f2 = f;
            }
            i14++;
            f = f2;
        }
        if (z) {
            f(Math.max(Math.round(this.s * f), i8));
            i4 = 0;
            int i15 = 0;
            while (i15 < i9) {
                View view3 = this.u[i15];
                b(view3, 1073741824, true);
                int iE2 = this.b.e(view3);
                if (iE2 <= i4) {
                    iE2 = i4;
                }
                i15++;
                i4 = iE2;
            }
        } else {
            i4 = i13;
        }
        for (int i16 = 0; i16 < i9; i16++) {
            View view4 = this.u[i16];
            if (this.b.e(view4) != i4) {
                aeg aegVar2 = (aeg) view4.getLayoutParams();
                Rect rect2 = aegVar2.d;
                int i17 = rect2.top + rect2.bottom + aegVar2.topMargin + aegVar2.bottomMargin;
                int i18 = rect2.right + rect2.left + aegVar2.leftMargin + aegVar2.rightMargin;
                int iE3 = e(aegVar2.a, aegVar2.b);
                if (this.a == 1) {
                    iMakeMeasureSpec = a(iE3, 1073741824, i18, aegVar2.width, false);
                    iA = View.MeasureSpec.makeMeasureSpec(i4 - i17, 1073741824);
                } else {
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i4 - i18, 1073741824);
                    iA = a(iE3, 1073741824, i17, aegVar2.height, false);
                }
                a(view4, iMakeMeasureSpec, iA, true);
            }
        }
        aemVar.a = i4;
        int i19 = 0;
        if (this.a == 1) {
            if (aenVar.f == -1) {
                i19 = aenVar.b;
                i7 = i19 - i4;
                i6 = 0;
                i5 = 0;
            } else {
                int i20 = aenVar.b;
                i19 = i20 + i4;
                i7 = i20;
                i6 = 0;
                i5 = 0;
            }
        } else if (aenVar.f == -1) {
            int i21 = aenVar.b;
            i6 = i21;
            i5 = i21 - i4;
            i7 = 0;
        } else {
            i5 = aenVar.b;
            i6 = i4 + i5;
            i7 = 0;
        }
        int iP = i5;
        int iF = i6;
        int iQ = i7;
        int iF2 = i19;
        for (int i22 = 0; i22 < i9; i22++) {
            View view5 = this.u[i22];
            aeg aegVar3 = (aeg) view5.getLayoutParams();
            if (this.a == 1) {
                if (k()) {
                    iF = p() + this.t[this.s - aegVar3.a];
                    iP = iF - this.b.f(view5);
                } else {
                    iP = this.t[aegVar3.a] + p();
                    iF = this.b.f(view5) + iP;
                }
            } else {
                iQ = this.t[aegVar3.a] + q();
                iF2 = this.b.f(view5) + iQ;
            }
            a(view5, iP, iQ, iF, iF2);
            if (aegVar3.c.m() || aegVar3.c.s()) {
                aemVar.c = true;
            }
            aemVar.d |= view5.hasFocusable();
        }
        Arrays.fill(this.u, (Object) null);
    }

    private final void b(View view, int i, boolean z) {
        int iA;
        int iA2;
        aeg aegVar = (aeg) view.getLayoutParams();
        Rect rect = aegVar.d;
        int i2 = rect.top + rect.bottom + aegVar.topMargin + aegVar.bottomMargin;
        int i3 = aegVar.rightMargin + rect.right + rect.left + aegVar.leftMargin;
        int iE = e(aegVar.a, aegVar.b);
        if (this.a == 1) {
            iA = a(iE, i, i3, aegVar.width, false);
            iA2 = a(this.b.e(), this.o, i2, aegVar.height, true);
        } else {
            int iA3 = a(iE, i, i2, aegVar.height, false);
            iA = a(this.b.e(), this.n, i3, aegVar.width, true);
            iA2 = iA3;
        }
        a(view, iA, iA2, z);
    }

    private final void a(View view, int i, int i2, boolean z) {
        boolean zA;
        aga agaVar = (aga) view.getLayoutParams();
        if (z) {
            zA = (this.j && afw.b(view.getMeasuredWidth(), i, agaVar.width) && afw.b(view.getMeasuredHeight(), i2, agaVar.height)) ? false : true;
        } else {
            zA = a(view, i, i2, agaVar);
        }
        if (zA) {
            view.measure(i, i2);
        }
    }

    @Override // flm.aek, flm.afw
    public final View a(View view, int i, agf agfVar, agk agkVar) {
        View viewB;
        int iO;
        int i2;
        int iO2;
        int i3;
        int iMin;
        View view2;
        int iMin2;
        int i4;
        View view3;
        View view4 = (this.f == null || (viewB = this.f.b(view)) == null || this.e.d(viewB)) ? null : viewB;
        if (view4 == null) {
            return null;
        }
        aeg aegVar = (aeg) view4.getLayoutParams();
        int i5 = aegVar.a;
        int i6 = aegVar.a + aegVar.b;
        if (super.a(view, i, agfVar, agkVar) == null) {
            return null;
        }
        if ((b(i) == 1) != this.c) {
            iO = o() - 1;
            i2 = -1;
            iO2 = -1;
        } else {
            iO = 0;
            i2 = 1;
            iO2 = o();
        }
        boolean z = this.a == 1 && k();
        View view5 = null;
        int i7 = -1;
        int i8 = 0;
        View view6 = null;
        int i9 = -1;
        int i10 = 0;
        int iA = a(agfVar, agkVar, iO);
        int i11 = iO;
        while (i11 != iO2) {
            int iA2 = a(agfVar, agkVar, i11);
            View viewE = e(i11);
            if (viewE == view4) {
                break;
            }
            if (viewE.hasFocusable() && iA2 != iA) {
                if (view5 != null) {
                    break;
                }
            } else {
                aeg aegVar2 = (aeg) viewE.getLayoutParams();
                int i12 = aegVar2.a;
                int i13 = aegVar2.a + aegVar2.b;
                if (!viewE.hasFocusable() || i12 != i5 || i13 != i6) {
                    boolean z2 = false;
                    if ((viewE.hasFocusable() && view5 == null) || (!viewE.hasFocusable() && view6 == null)) {
                        z2 = true;
                    } else {
                        int iMin3 = Math.min(i13, i6) - Math.max(i12, i5);
                        if (viewE.hasFocusable()) {
                            if (iMin3 > i8) {
                                z2 = true;
                            } else if (iMin3 == i8) {
                                if (z == (i12 > i7)) {
                                    z2 = true;
                                }
                            }
                        } else if (view5 == null) {
                            if (!(this.g.a(viewE, 24579) && this.h.a(viewE, 24579))) {
                                if (iMin3 > i10) {
                                    z2 = true;
                                } else if (iMin3 == i10) {
                                    if (z == (i12 > i9)) {
                                        z2 = true;
                                    }
                                }
                            }
                        }
                    }
                    if (z2) {
                        if (viewE.hasFocusable()) {
                            int i14 = aegVar2.a;
                            int i15 = i10;
                            i3 = i9;
                            view2 = view6;
                            iMin2 = Math.min(i13, i6) - Math.max(i12, i5);
                            iMin = i15;
                            view3 = viewE;
                            i4 = i14;
                        } else {
                            i3 = aegVar2.a;
                            iMin = Math.min(i13, i6) - Math.max(i12, i5);
                            view2 = viewE;
                            iMin2 = i8;
                            i4 = i7;
                            view3 = view5;
                        }
                    }
                    i11 += i2;
                    view5 = view3;
                    i8 = iMin2;
                    i7 = i4;
                    view6 = view2;
                    i9 = i3;
                    i10 = iMin;
                } else {
                    return viewE;
                }
            }
            iMin = i10;
            i4 = i7;
            i3 = i9;
            view2 = view6;
            iMin2 = i8;
            view3 = view5;
            i11 += i2;
            view5 = view3;
            i8 = iMin2;
            i7 = i4;
            view6 = view2;
            i9 = i3;
            i10 = iMin;
        }
        return view5 != null ? view5 : view6;
    }

    @Override // flm.aek, flm.afw
    public final boolean f() {
        return this.d == null && !this.r;
    }
}

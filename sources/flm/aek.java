package flm;

import android.content.Context;
import android.graphics.Rect;
import android.os.Parcelable;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class aek extends afw {
    private int A;
    public int a;
    public afd b;
    public boolean c;
    public aeo d;
    private aen r;
    private boolean s;
    private boolean t;
    private boolean u;
    private boolean v;
    private int w;
    private int x;
    private final ael y;
    private final aem z;

    public aek(Context context) {
        this(1, false);
    }

    public aek(int i, boolean z) {
        afd affVar;
        this.a = 1;
        this.t = false;
        this.c = false;
        this.u = false;
        this.v = true;
        this.w = -1;
        this.x = Integer.MIN_VALUE;
        this.d = null;
        this.y = new ael();
        this.z = new aem();
        this.A = 2;
        a((String) null);
        if (1 != this.a || this.b == null) {
            switch (1) {
                case bbx.MSG_UNBIND_SERVICE /* 0 */:
                    affVar = new afe(this);
                    break;
                case 1:
                    affVar = new aff(this);
                    break;
                default:
                    throw new IllegalArgumentException("invalid orientation");
            }
            this.b = affVar;
            this.y.a = this.b;
            this.a = 1;
            n();
        }
        a((String) null);
        if (false != this.t) {
            this.t = false;
            n();
        }
    }

    @Override // flm.afw
    public final boolean g() {
        return true;
    }

    @Override // flm.afw
    public aga e() {
        return new aga(-2, -2);
    }

    @Override // flm.afw
    public final void a(AccessibilityEvent accessibilityEvent) {
        super.a(accessibilityEvent);
        if (o() > 0) {
            View viewA = a(0, o(), false, true);
            accessibilityEvent.setFromIndex(viewA == null ? -1 : a(viewA));
            View viewA2 = a(o() - 1, -1, false, true);
            accessibilityEvent.setToIndex(viewA2 != null ? a(viewA2) : -1);
        }
    }

    @Override // flm.afw
    public final Parcelable h() {
        if (this.d != null) {
            return new aeo(this.d);
        }
        aeo aeoVar = new aeo();
        if (o() > 0) {
            l();
            boolean z = this.s ^ this.c;
            aeoVar.c = z;
            if (z) {
                View viewX = x();
                aeoVar.b = this.b.c() - this.b.b(viewX);
                aeoVar.a = a(viewX);
                return aeoVar;
            }
            View viewW = w();
            aeoVar.a = a(viewW);
            aeoVar.b = this.b.a(viewW) - this.b.b();
            return aeoVar;
        }
        aeoVar.a = -1;
        return aeoVar;
    }

    @Override // flm.afw
    public final void a(Parcelable parcelable) {
        if (parcelable instanceof aeo) {
            this.d = (aeo) parcelable;
            n();
        }
    }

    @Override // flm.afw
    public final boolean i() {
        return this.a == 0;
    }

    @Override // flm.afw
    public final boolean j() {
        return this.a == 1;
    }

    private final void u() {
        if (this.a == 1 || !k()) {
            this.c = this.t;
        } else {
            this.c = this.t ? false : true;
        }
    }

    @Override // flm.afw
    public final View a(int i) {
        int iO = o();
        if (iO == 0) {
            return null;
        }
        int iA = i - a(e(0));
        if (iA >= 0 && iA < iO) {
            View viewE = e(iA);
            if (a(viewE) == i) {
                return viewE;
            }
        }
        return super.a(i);
    }

    private final int h(agk agkVar) {
        if (agkVar.a != -1) {
            return this.b.e();
        }
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:128:0x023e  */
    /* JADX WARN: Code duplicated, block: B:130:0x0242  */
    /* JADX WARN: Code duplicated, block: B:131:0x0245  */
    /* JADX WARN: Code duplicated, block: B:133:0x0249  */
    /* JADX WARN: Code duplicated, block: B:135:0x024d  */
    /* JADX WARN: Code duplicated, block: B:137:0x0253  */
    /* JADX WARN: Code duplicated, block: B:145:0x0280  */
    /* JADX WARN: Code duplicated, block: B:147:0x0283  */
    /* JADX WARN: Code duplicated, block: B:149:0x0287  */
    /* JADX WARN: Code duplicated, block: B:152:0x0292  */
    /* JADX WARN: Code duplicated, block: B:153:0x0297  */
    /* JADX WARN: Code duplicated, block: B:155:0x029b  */
    /* JADX WARN: Code duplicated, block: B:156:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:158:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:159:0x02ae  */
    @Override // flm.afw
    public void c(agf agfVar, agk agkVar) {
        boolean z;
        View viewD;
        boolean z2;
        boolean z3;
        int iB;
        int iA;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int iE;
        int iE2;
        int i7;
        View viewA;
        int iA2;
        if ((this.d != null || this.w != -1) && agkVar.a() == 0) {
            b(agfVar);
            return;
        }
        if (this.d != null && this.d.a()) {
            this.w = this.d.a;
        }
        l();
        this.r.a = false;
        u();
        View viewT = t();
        if (!this.y.e || this.w != -1 || this.d != null) {
            this.y.a();
            this.y.d = this.c;
            ael aelVar = this.y;
            if (agkVar.g || this.w == -1) {
                z = false;
            } else if (this.w < 0 || this.w >= agkVar.a()) {
                this.w = -1;
                this.x = Integer.MIN_VALUE;
                z = false;
            } else {
                aelVar.b = this.w;
                if (this.d != null && this.d.a()) {
                    aelVar.d = this.d.c;
                    if (aelVar.d) {
                        aelVar.c = this.b.c() - this.d.b;
                    } else {
                        aelVar.c = this.b.b() + this.d.b;
                    }
                    z = true;
                } else if (this.x == Integer.MIN_VALUE) {
                    View viewA2 = a(this.w);
                    if (viewA2 != null) {
                        if (this.b.e(viewA2) > this.b.e()) {
                            aelVar.b();
                            z = true;
                        } else if (this.b.a(viewA2) - this.b.b() < 0) {
                            aelVar.c = this.b.b();
                            aelVar.d = false;
                            z = true;
                        } else if (this.b.c() - this.b.b(viewA2) < 0) {
                            aelVar.c = this.b.c();
                            aelVar.d = true;
                            z = true;
                        } else {
                            if (aelVar.d) {
                                iA = this.b.b(viewA2) + this.b.a();
                            } else {
                                iA = this.b.a(viewA2);
                            }
                            aelVar.c = iA;
                        }
                    } else {
                        if (o() > 0) {
                            aelVar.d = (this.w < a(e(0))) == this.c;
                        }
                        aelVar.b();
                    }
                    z = true;
                } else {
                    aelVar.d = this.c;
                    if (this.c) {
                        aelVar.c = this.b.c() - this.x;
                    } else {
                        aelVar.c = this.b.b() + this.x;
                    }
                    z = true;
                }
            }
            if (!z) {
                if (o() == 0) {
                    z2 = false;
                } else {
                    View viewT2 = t();
                    if (viewT2 != null) {
                        aga agaVar = (aga) viewT2.getLayoutParams();
                        if (!agaVar.c.m() && agaVar.c.c() >= 0 && agaVar.c.c() < agkVar.a()) {
                            aelVar.a(viewT2, a(viewT2));
                            z2 = true;
                        } else if (this.s) {
                            z2 = false;
                        } else {
                            if (aelVar.d) {
                                if (this.c) {
                                    viewD = d(agfVar, agkVar);
                                } else {
                                    viewD = e(agfVar, agkVar);
                                }
                            } else if (this.c) {
                                viewD = e(agfVar, agkVar);
                            } else {
                                viewD = d(agfVar, agkVar);
                            }
                            if (viewD != null) {
                                aelVar.b(viewD, a(viewD));
                                if (!agkVar.g && f()) {
                                    if (this.b.a(viewD) < this.b.c() || this.b.b(viewD) < this.b.b()) {
                                        z3 = true;
                                    } else {
                                        z3 = false;
                                    }
                                    if (z3) {
                                        if (aelVar.d) {
                                            iB = this.b.c();
                                        } else {
                                            iB = this.b.b();
                                        }
                                        aelVar.c = iB;
                                    }
                                }
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                        }
                    } else if (this.s) {
                        z2 = false;
                    } else {
                        if (aelVar.d) {
                            if (this.c) {
                                viewD = d(agfVar, agkVar);
                            } else {
                                viewD = e(agfVar, agkVar);
                            }
                        } else if (this.c) {
                            viewD = e(agfVar, agkVar);
                        } else {
                            viewD = d(agfVar, agkVar);
                        }
                        if (viewD != null) {
                            aelVar.b(viewD, a(viewD));
                            if (!agkVar.g) {
                                if (this.b.a(viewD) < this.b.c()) {
                                    z3 = true;
                                } else {
                                    z3 = true;
                                }
                                if (z3) {
                                    if (aelVar.d) {
                                        iB = this.b.c();
                                    } else {
                                        iB = this.b.b();
                                    }
                                    aelVar.c = iB;
                                }
                            }
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                    }
                }
                if (!z2) {
                    aelVar.b();
                    aelVar.b = 0;
                }
            }
            this.y.e = true;
        } else if (viewT != null && (this.b.a(viewT) >= this.b.c() || this.b.b(viewT) <= this.b.b())) {
            this.y.a(viewT, a(viewT));
        }
        int iH = h(agkVar);
        if (this.r.i >= 0) {
            i = 0;
        } else {
            i = iH;
            iH = 0;
        }
        int iB2 = i + this.b.b();
        int iF = iH + this.b.f();
        if (agkVar.g && this.w != -1 && this.x != Integer.MIN_VALUE && (viewA = a(this.w)) != null) {
            if (this.c) {
                iA2 = (this.b.c() - this.b.b(viewA)) - this.x;
            } else {
                iA2 = this.x - (this.b.a(viewA) - this.b.b());
            }
            if (iA2 > 0) {
                iB2 += iA2;
            } else {
                iF -= iA2;
            }
        }
        if (this.y.d) {
            i2 = this.c ? 1 : -1;
        } else {
            i2 = this.c ? -1 : 1;
        }
        a(agfVar, agkVar, this.y, i2);
        for (int iO = o() - 1; iO >= 0; iO--) {
            View viewE = e(iO);
            agm agmVarC = RecyclerView.c(viewE);
            if (!agmVarC.b()) {
                if (agmVarC.j() && !agmVarC.m() && !this.f.j.b) {
                    c(iO);
                    agfVar.a(agmVarC);
                } else {
                    d(iO);
                    agfVar.c(viewE);
                    this.f.g.c(agmVarC);
                }
            }
        }
        this.r.k = v();
        if (this.y.d) {
            b(this.y);
            this.r.h = iB2;
            a(agfVar, this.r, agkVar, false);
            int i8 = this.r.b;
            int i9 = this.r.d;
            if (this.r.c > 0) {
                iF += this.r.c;
            }
            a(this.y);
            this.r.h = iF;
            this.r.d += this.r.e;
            a(agfVar, this.r, agkVar, false);
            int i10 = this.r.b;
            if (this.r.c > 0) {
                int i11 = this.r.c;
                f(i9, i8);
                this.r.h = i11;
                a(agfVar, this.r, agkVar, false);
                i7 = this.r.b;
            } else {
                i7 = i8;
            }
            i4 = i7;
            i3 = i10;
        } else {
            a(this.y);
            this.r.h = iF;
            a(agfVar, this.r, agkVar, false);
            i3 = this.r.b;
            int i12 = this.r.d;
            if (this.r.c > 0) {
                iB2 += this.r.c;
            }
            b(this.y);
            this.r.h = iB2;
            this.r.d += this.r.e;
            a(agfVar, this.r, agkVar, false);
            i4 = this.r.b;
            if (this.r.c > 0) {
                int i13 = this.r.c;
                e(i12, i3);
                this.r.h = i13;
                a(agfVar, this.r, agkVar, false);
                i3 = this.r.b;
            }
        }
        if (o() <= 0) {
            i5 = i4;
            i6 = i3;
        } else if (this.c) {
            int iA3 = a(i3, agfVar, agkVar, true);
            int i14 = i4 + iA3;
            int i15 = i3 + iA3;
            int iB3 = b(i14, agfVar, agkVar, false);
            int i16 = i15 + iB3;
            i5 = i14 + iB3;
            i6 = i16;
        } else {
            int iB4 = b(i4, agfVar, agkVar, true);
            int i17 = i4 + iB4;
            int i18 = i3 + iB4;
            int iA4 = a(i18, agfVar, agkVar, false);
            int i19 = i18 + iA4;
            i5 = i17 + iA4;
            i6 = i19;
        }
        if (agkVar.k && o() != 0 && !agkVar.g && f()) {
            int i20 = 0;
            int i21 = 0;
            List list = agfVar.d;
            int size = list.size();
            int iA5 = a(e(0));
            int i22 = 0;
            while (i22 < size) {
                agm agmVar = (agm) list.get(i22);
                if (agmVar.m()) {
                    iE = i21;
                    iE2 = i20;
                } else if (((agmVar.c() < iA5) != this.c ? (byte) -1 : (byte) 1) == -1) {
                    iE2 = this.b.e(agmVar.a) + i20;
                    iE = i21;
                } else {
                    iE = this.b.e(agmVar.a) + i21;
                    iE2 = i20;
                }
                i22++;
                i20 = iE2;
                i21 = iE;
            }
            this.r.j = list;
            if (i20 > 0) {
                f(a(w()), i5);
                this.r.h = i20;
                this.r.c = 0;
                this.r.a((View) null);
                a(agfVar, this.r, agkVar, false);
            }
            if (i21 > 0) {
                e(a(x()), i6);
                this.r.h = i21;
                this.r.c = 0;
                this.r.a((View) null);
                a(agfVar, this.r, agkVar, false);
            }
            this.r.j = null;
        }
        if (!agkVar.g) {
            afd afdVar = this.b;
            afdVar.b = afdVar.e();
        } else {
            this.y.a();
        }
        this.s = false;
    }

    @Override // flm.afw
    public void a(agk agkVar) {
        super.a(agkVar);
        this.d = null;
        this.w = -1;
        this.x = Integer.MIN_VALUE;
        this.y.a();
    }

    void a(agf agfVar, agk agkVar, ael aelVar, int i) {
    }

    private final int a(int i, agf agfVar, agk agkVar, boolean z) {
        int iC;
        int iC2 = this.b.c() - i;
        if (iC2 > 0) {
            int i2 = -c(-iC2, agfVar, agkVar);
            int i3 = i + i2;
            if (z && (iC = this.b.c() - i3) > 0) {
                this.b.a(iC);
                return i2 + iC;
            }
            return i2;
        }
        return 0;
    }

    private final int b(int i, agf agfVar, agk agkVar, boolean z) {
        int iB;
        int iB2 = i - this.b.b();
        if (iB2 > 0) {
            int i2 = -c(iB2, agfVar, agkVar);
            int i3 = i + i2;
            if (z && (iB = i3 - this.b.b()) > 0) {
                this.b.a(-iB);
                return i2 - iB;
            }
            return i2;
        }
        return 0;
    }

    private final void a(ael aelVar) {
        e(aelVar.b, aelVar.c);
    }

    private final void e(int i, int i2) {
        this.r.c = this.b.c() - i2;
        this.r.e = this.c ? -1 : 1;
        this.r.d = i;
        this.r.f = 1;
        this.r.b = i2;
        this.r.g = Integer.MIN_VALUE;
    }

    private final void b(ael aelVar) {
        f(aelVar.b, aelVar.c);
    }

    private final void f(int i, int i2) {
        this.r.c = i2 - this.b.b();
        this.r.d = i;
        this.r.e = this.c ? 1 : -1;
        this.r.f = -1;
        this.r.b = i2;
        this.r.g = Integer.MIN_VALUE;
    }

    protected final boolean k() {
        return ti.f(this.f) == 1;
    }

    final void l() {
        if (this.r == null) {
            this.r = new aen();
        }
    }

    @Override // flm.afw
    public int a(int i, agf agfVar, agk agkVar) {
        if (this.a == 1) {
            return 0;
        }
        return c(i, agfVar, agkVar);
    }

    @Override // flm.afw
    public int b(int i, agf agfVar, agk agkVar) {
        if (this.a == 0) {
            return 0;
        }
        return c(i, agfVar, agkVar);
    }

    @Override // flm.afw
    public final int b(agk agkVar) {
        return i(agkVar);
    }

    @Override // flm.afw
    public final int c(agk agkVar) {
        return i(agkVar);
    }

    @Override // flm.afw
    public final int d(agk agkVar) {
        return j(agkVar);
    }

    @Override // flm.afw
    public final int e(agk agkVar) {
        return j(agkVar);
    }

    @Override // flm.afw
    public final int f(agk agkVar) {
        return k(agkVar);
    }

    @Override // flm.afw
    public final int g(agk agkVar) {
        return k(agkVar);
    }

    private final int i(agk agkVar) {
        int iMax;
        if (o() == 0) {
            return 0;
        }
        l();
        afd afdVar = this.b;
        View viewA = a(!this.v, true);
        View viewB = b(!this.v, true);
        boolean z = this.v;
        boolean z2 = this.c;
        if (o() == 0 || agkVar.a() == 0 || viewA == null || viewB == null) {
            return 0;
        }
        int iMin = Math.min(afw.a(viewA), afw.a(viewB));
        int iMax2 = Math.max(afw.a(viewA), afw.a(viewB));
        if (z2) {
            iMax = Math.max(0, (agkVar.a() - iMax2) - 1);
        } else {
            iMax = Math.max(0, iMin);
        }
        if (z) {
            return Math.round(((Math.abs(afdVar.b(viewB) - afdVar.a(viewA)) / (Math.abs(afw.a(viewA) - afw.a(viewB)) + 1)) * iMax) + (afdVar.b() - afdVar.a(viewA)));
        }
        return iMax;
    }

    private final int j(agk agkVar) {
        if (o() == 0) {
            return 0;
        }
        l();
        afd afdVar = this.b;
        View viewA = a(!this.v, true);
        View viewB = b(!this.v, true);
        boolean z = this.v;
        if (o() == 0 || agkVar.a() == 0 || viewA == null || viewB == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(afw.a(viewA) - afw.a(viewB)) + 1;
        }
        return Math.min(afdVar.e(), afdVar.b(viewB) - afdVar.a(viewA));
    }

    private final int k(agk agkVar) {
        if (o() == 0) {
            return 0;
        }
        l();
        afd afdVar = this.b;
        View viewA = a(!this.v, true);
        View viewB = b(!this.v, true);
        boolean z = this.v;
        if (o() == 0 || agkVar.a() == 0 || viewA == null || viewB == null) {
            return 0;
        }
        if (!z) {
            return agkVar.a();
        }
        return (int) (((afdVar.b(viewB) - afdVar.a(viewA)) / (Math.abs(afw.a(viewA) - afw.a(viewB)) + 1)) * agkVar.a());
    }

    private final void a(int i, int i2, boolean z, agk agkVar) {
        int iB;
        this.r.k = v();
        this.r.h = h(agkVar);
        this.r.f = i;
        if (i == 1) {
            this.r.h += this.b.f();
            View viewX = x();
            this.r.e = this.c ? -1 : 1;
            this.r.d = a(viewX) + this.r.e;
            this.r.b = this.b.b(viewX);
            iB = this.b.b(viewX) - this.b.c();
        } else {
            View viewW = w();
            this.r.h += this.b.b();
            this.r.e = this.c ? 1 : -1;
            this.r.d = a(viewW) + this.r.e;
            this.r.b = this.b.a(viewW);
            iB = (-this.b.a(viewW)) + this.b.b();
        }
        this.r.c = i2;
        if (z) {
            this.r.c -= iB;
        }
        this.r.g = iB;
    }

    private final boolean v() {
        return this.b.g() == 0 && this.b.d() == 0;
    }

    void a(agk agkVar, aen aenVar, afz afzVar) {
        int i = aenVar.d;
        if (i >= 0 && i < agkVar.a()) {
            afzVar.a(i, Math.max(0, aenVar.g));
        }
    }

    @Override // flm.afw
    public final void a(int i, afz afzVar) {
        int i2;
        boolean z;
        if (this.d != null && this.d.a()) {
            z = this.d.c;
            i2 = this.d.a;
        } else {
            u();
            boolean z2 = this.c;
            if (this.w == -1) {
                i2 = z2 ? i - 1 : 0;
                z = z2;
            } else {
                i2 = this.w;
                z = z2;
            }
        }
        int i3 = z ? -1 : 1;
        for (int i4 = 0; i4 < this.A && i2 >= 0 && i2 < i; i4++) {
            afzVar.a(i2, 0);
            i2 += i3;
        }
    }

    @Override // flm.afw
    public final void a(int i, int i2, agk agkVar, afz afzVar) {
        if (this.a != 0) {
            i = i2;
        }
        if (o() != 0 && i != 0) {
            l();
            a(i > 0 ? 1 : -1, Math.abs(i), true, agkVar);
            a(agkVar, this.r, afzVar);
        }
    }

    private final int c(int i, agf agfVar, agk agkVar) {
        if (o() == 0 || i == 0) {
            return 0;
        }
        this.r.a = true;
        l();
        int i2 = i > 0 ? 1 : -1;
        int iAbs = Math.abs(i);
        a(i2, iAbs, true, agkVar);
        int iA = this.r.g + a(agfVar, this.r, agkVar, false);
        if (iA < 0) {
            return 0;
        }
        if (iAbs > iA) {
            i = i2 * iA;
        }
        this.b.a(-i);
        this.r.i = i;
        return i;
    }

    @Override // flm.afw
    public final void a(String str) {
        if (this.d == null) {
            super.a(str);
        }
    }

    private final void a(agf agfVar, int i, int i2) {
        if (i != i2) {
            if (i2 > i) {
                for (int i3 = i2 - 1; i3 >= i; i3--) {
                    a(i3, agfVar);
                }
                return;
            }
            while (i > i2) {
                a(i, agfVar);
                i--;
            }
        }
    }

    private final void a(agf agfVar, aen aenVar) {
        if (aenVar.a && !aenVar.k) {
            if (aenVar.f == -1) {
                int i = aenVar.g;
                int iO = o();
                if (i >= 0) {
                    int iD = this.b.d() - i;
                    if (this.c) {
                        for (int i2 = 0; i2 < iO; i2++) {
                            View viewE = e(i2);
                            if (this.b.a(viewE) < iD || this.b.d(viewE) < iD) {
                                a(agfVar, 0, i2);
                                return;
                            }
                        }
                        return;
                    }
                    for (int i3 = iO - 1; i3 >= 0; i3--) {
                        View viewE2 = e(i3);
                        if (this.b.a(viewE2) < iD || this.b.d(viewE2) < iD) {
                            a(agfVar, iO - 1, i3);
                            return;
                        }
                    }
                    return;
                }
                return;
            }
            int i4 = aenVar.g;
            if (i4 >= 0) {
                int iO2 = o();
                if (this.c) {
                    for (int i5 = iO2 - 1; i5 >= 0; i5--) {
                        View viewE3 = e(i5);
                        if (this.b.b(viewE3) > i4 || this.b.c(viewE3) > i4) {
                            a(agfVar, iO2 - 1, i5);
                            return;
                        }
                    }
                    return;
                }
                for (int i6 = 0; i6 < iO2; i6++) {
                    View viewE4 = e(i6);
                    if (this.b.b(viewE4) > i4 || this.b.c(viewE4) > i4) {
                        a(agfVar, 0, i6);
                        return;
                    }
                }
            }
        }
    }

    private final int a(agf agfVar, aen aenVar, agk agkVar, boolean z) {
        int i = aenVar.c;
        if (aenVar.g != Integer.MIN_VALUE) {
            if (aenVar.c < 0) {
                aenVar.g += aenVar.c;
            }
            a(agfVar, aenVar);
        }
        int i2 = aenVar.c + aenVar.h;
        aem aemVar = this.z;
        while (true) {
            if ((!aenVar.k && i2 <= 0) || !aenVar.a(agkVar)) {
                break;
            }
            aemVar.a = 0;
            aemVar.b = false;
            aemVar.c = false;
            aemVar.d = false;
            a(agfVar, agkVar, aenVar, aemVar);
            if (!aemVar.b) {
                aenVar.b += aemVar.a * aenVar.f;
                if (!aemVar.c || this.r.j != null || !agkVar.g) {
                    aenVar.c -= aemVar.a;
                    i2 -= aemVar.a;
                }
                if (aenVar.g != Integer.MIN_VALUE) {
                    aenVar.g += aemVar.a;
                    if (aenVar.c < 0) {
                        aenVar.g += aenVar.c;
                    }
                    a(agfVar, aenVar);
                }
                if (z && aemVar.d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i - aenVar.c;
    }

    void a(agf agfVar, agk agkVar, aen aenVar, aem aemVar) {
        int iQ;
        int iF;
        int i;
        int i2;
        int iP;
        int iF2;
        View viewA = aenVar.a(agfVar);
        if (viewA == null) {
            aemVar.b = true;
            return;
        }
        aga agaVar = (aga) viewA.getLayoutParams();
        if (aenVar.j == null) {
            if (this.c == (aenVar.f == -1)) {
                super.a(viewA, -1, false);
            } else {
                super.a(viewA, 0, false);
            }
        } else {
            if (this.c == (aenVar.f == -1)) {
                super.a(viewA, -1, true);
            } else {
                super.a(viewA, 0, true);
            }
        }
        aga agaVar2 = (aga) viewA.getLayoutParams();
        Rect rectD = this.f.d(viewA);
        int i3 = rectD.left + rectD.right + 0;
        int i4 = rectD.bottom + rectD.top + 0;
        int iA = afw.a(this.p, this.n, i3 + p() + r() + agaVar2.leftMargin + agaVar2.rightMargin, agaVar2.width, i());
        int iA2 = afw.a(this.q, this.o, i4 + q() + s() + agaVar2.topMargin + agaVar2.bottomMargin, agaVar2.height, j());
        if (a(viewA, iA, iA2, agaVar2)) {
            viewA.measure(iA, iA2);
        }
        aemVar.a = this.b.e(viewA);
        if (this.a == 1) {
            if (k()) {
                iF2 = this.p - r();
                iP = iF2 - this.b.f(viewA);
            } else {
                iP = p();
                iF2 = this.b.f(viewA) + iP;
            }
            if (aenVar.f == -1) {
                int i5 = aenVar.b;
                iQ = aenVar.b - aemVar.a;
                i = iP;
                i2 = iF2;
                iF = i5;
            } else {
                iQ = aenVar.b;
                i = iP;
                i2 = iF2;
                iF = aenVar.b + aemVar.a;
            }
        } else {
            iQ = q();
            iF = this.b.f(viewA) + iQ;
            if (aenVar.f == -1) {
                i2 = aenVar.b;
                i = aenVar.b - aemVar.a;
            } else {
                i = aenVar.b;
                i2 = aenVar.b + aemVar.a;
            }
        }
        a(viewA, i, iQ, i2, iF);
        if (agaVar.c.m() || agaVar.c.s()) {
            aemVar.c = true;
        }
        aemVar.d = viewA.hasFocusable();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // flm.afw
    public final boolean m() {
        boolean z;
        if (this.o != 1073741824 && this.n != 1073741824) {
            int iO = o();
            int i = 0;
            while (true) {
                if (i >= iO) {
                    z = false;
                    break;
                }
                ViewGroup.LayoutParams layoutParams = e(i).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    z = true;
                    break;
                }
                i++;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    final int b(int i) {
        switch (i) {
            case 1:
                return (this.a == 1 || !k()) ? -1 : 1;
            case 2:
                return (this.a != 1 && k()) ? -1 : 1;
            case 17:
                return this.a != 0 ? Integer.MIN_VALUE : -1;
            case 33:
                return this.a != 1 ? Integer.MIN_VALUE : -1;
            case 66:
                return this.a == 0 ? 1 : Integer.MIN_VALUE;
            case 130:
                return this.a == 1 ? 1 : Integer.MIN_VALUE;
            default:
                return Integer.MIN_VALUE;
        }
    }

    private final View w() {
        return e(this.c ? o() - 1 : 0);
    }

    private final View x() {
        return e(this.c ? 0 : o() - 1);
    }

    private final View a(boolean z, boolean z2) {
        return this.c ? a(o() - 1, -1, z, true) : a(0, o(), z, true);
    }

    private final View b(boolean z, boolean z2) {
        return this.c ? a(0, o(), z, true) : a(o() - 1, -1, z, true);
    }

    private final View d(agf agfVar, agk agkVar) {
        return a(agfVar, agkVar, 0, o(), agkVar.a());
    }

    private final View e(agf agfVar, agk agkVar) {
        return a(agfVar, agkVar, o() - 1, -1, agkVar.a());
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0056  */
    View a(agf agfVar, agk agkVar, int i, int i2, int i3) {
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
            if (iA < 0 || iA >= i3) {
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

    private final View y() {
        return g(0, o());
    }

    private final View z() {
        return g(o() - 1, -1);
    }

    private final View a(int i, int i2, boolean z, boolean z2) {
        l();
        int i3 = z ? 24579 : 320;
        int i4 = z2 ? 320 : 0;
        if (this.a == 0) {
            return this.g.a(i, i2, i3, i4);
        }
        return this.h.a(i, i2, i3, i4);
    }

    private final View g(int i, int i2) {
        byte b;
        int i3;
        int i4;
        l();
        if (i2 > i) {
            b = 1;
        } else {
            b = i2 < i ? (byte) -1 : (byte) 0;
        }
        if (b == 0) {
            return e(i);
        }
        if (this.b.a(e(i)) < this.b.b()) {
            i3 = 16644;
            i4 = 16388;
        } else {
            i3 = 4161;
            i4 = 4097;
        }
        if (this.a == 0) {
            return this.g.a(i, i2, i3, i4);
        }
        return this.h.a(i, i2, i3, i4);
    }

    @Override // flm.afw
    public View a(View view, int i, agf agfVar, agk agkVar) {
        int iB;
        View viewY;
        View viewX;
        u();
        if (o() != 0 && (iB = b(i)) != Integer.MIN_VALUE) {
            l();
            l();
            a(iB, (int) (0.33333334f * this.b.e()), false, agkVar);
            this.r.g = Integer.MIN_VALUE;
            this.r.a = false;
            a(agfVar, this.r, agkVar, true);
            if (iB == -1) {
                viewY = this.c ? z() : y();
            } else {
                viewY = this.c ? y() : z();
            }
            if (iB == -1) {
                viewX = w();
            } else {
                viewX = x();
            }
            if (!viewX.hasFocusable()) {
                return viewY;
            }
            if (viewY == null) {
                return null;
            }
            return viewX;
        }
        return null;
    }

    @Override // flm.afw
    public boolean f() {
        return this.d == null && !this.s;
    }
}

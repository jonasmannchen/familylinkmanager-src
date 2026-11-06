package flm;

import android.os.Trace;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class agf {
    public final /* synthetic */ RecyclerView e;
    private agd h;
    public final ArrayList a = new ArrayList();
    public ArrayList b = null;
    public final ArrayList c = new ArrayList();
    public final List d = Collections.unmodifiableList(this.a);
    private int f = 2;
    private int g = 2;

    public agf(RecyclerView recyclerView) {
        this.e = recyclerView;
    }

    public final void a() {
        this.a.clear();
        c();
    }

    public final void b() {
        this.g = (this.e.k != null ? this.e.k.l : 0) + this.f;
        for (int size = this.c.size() - 1; size >= 0 && this.c.size() > this.g; size--) {
            b(size);
        }
    }

    public final int a(int i) {
        if (i < 0 || i >= this.e.C.a()) {
            throw new IndexOutOfBoundsException("invalid position " + i + ". State item count is " + this.e.C.a() + this.e.a());
        }
        if (this.e.C.g) {
            return this.e.e.a(i, 0);
        }
        return i;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0253  */
    /* JADX WARN: Code duplicated, block: B:102:0x025d  */
    /* JADX WARN: Code duplicated, block: B:233:0x04e1  */
    /* JADX WARN: Code duplicated, block: B:235:0x04eb  */
    /* JADX WARN: Code duplicated, block: B:238:0x050f  */
    /* JADX WARN: Code duplicated, block: B:241:0x0534  */
    /* JADX WARN: Code duplicated, block: B:243:0x053c  */
    /* JADX WARN: Code duplicated, block: B:246:0x0546  */
    /* JADX WARN: Code duplicated, block: B:249:0x055c  */
    /* JADX WARN: Code duplicated, block: B:277:0x027f A[SYNTHETIC] */
    final agm a(int i, boolean z, long j) {
        afm afmVar;
        ViewGroup.LayoutParams layoutParams;
        boolean z2;
        View view;
        boolean z3;
        aga agaVar;
        RecyclerView recyclerViewE;
        int size;
        int i2;
        agm agmVar;
        View view2;
        boolean z4;
        int size2;
        int iA;
        if (i < 0 || i >= this.e.C.a()) {
            throw new IndexOutOfBoundsException("Invalid item position " + i + "(" + i + "). Item count:" + this.e.C.a() + this.e.a());
        }
        boolean z5 = false;
        agm agmVarB = null;
        if (this.e.C.g) {
            if (this.b == null || (size2 = this.b.size()) == 0) {
                agmVarB = null;
            } else {
                int i3 = 0;
                while (true) {
                    if (i3 < size2) {
                        agm agmVar2 = (agm) this.b.get(i3);
                        if (!agmVar2.g() && agmVar2.c() == i) {
                            agmVar2.b(32);
                            agmVarB = agmVar2;
                            break;
                        }
                        i3++;
                    } else if (this.e.j.b && (iA = this.e.e.a(i, 0)) > 0 && iA < this.e.j.a()) {
                        long jB = this.e.j.b(iA);
                        int i4 = 0;
                        while (true) {
                            if (i4 < size2) {
                                agm agmVar3 = (agm) this.b.get(i4);
                                if (!agmVar3.g() && agmVar3.e == jB) {
                                    agmVar3.b(32);
                                    agmVarB = agmVar3;
                                    break;
                                }
                                i4++;
                            } else {
                                agmVarB = null;
                                break;
                            }
                        }
                    } else {
                        agmVarB = null;
                        break;
                    }
                }
            }
            z5 = agmVarB != null;
        }
        if (agmVarB == null) {
            int size3 = this.a.size();
            int i5 = 0;
            while (true) {
                if (i5 < size3) {
                    agm agmVar4 = (agm) this.a.get(i5);
                    if (!agmVar4.g() && agmVar4.c() == i && !agmVar4.j() && (this.e.C.g || !agmVar4.m())) {
                        agmVar4.b(32);
                        agmVarB = agmVar4;
                        break;
                    }
                    i5++;
                } else if (!z) {
                    acw acwVar = this.e.f;
                    int size4 = acwVar.c.size();
                    int i6 = 0;
                    while (true) {
                        if (i6 < size4) {
                            View view3 = (View) acwVar.c.get(i6);
                            agm agmVarB2 = acwVar.a.b(view3);
                            if (agmVarB2.c() == i && !agmVarB2.j() && !agmVarB2.m()) {
                                view2 = view3;
                                break;
                            }
                            i6++;
                        } else {
                            view2 = null;
                            break;
                        }
                    }
                    if (view2 != null) {
                        agm agmVarC = RecyclerView.c(view2);
                        acw acwVar2 = this.e.f;
                        int iA2 = acwVar2.a.a(view2);
                        if (iA2 < 0) {
                            throw new IllegalArgumentException("view is not a child, cannot hide " + view2);
                        }
                        if (!acwVar2.b.c(iA2)) {
                            throw new RuntimeException("trying to unhide a view that was not hidden" + view2);
                        }
                        acwVar2.b.b(iA2);
                        acwVar2.b(view2);
                        int iC = this.e.f.c(view2);
                        if (iC == -1) {
                            throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + agmVarC + this.e.a());
                        }
                        this.e.f.d(iC);
                        c(view2);
                        agmVarC.b(8224);
                        agmVarB = agmVarC;
                        break;
                    }
                    size = this.c.size();
                    i2 = 0;
                    while (true) {
                        if (i2 < size) {
                            agmVar = (agm) this.c.get(i2);
                            if (agmVar.j() && agmVar.c() == i) {
                                if (!z) {
                                    this.c.remove(i2);
                                }
                                agmVarB = agmVar;
                                break;
                            }
                            i2++;
                        } else {
                            agmVarB = null;
                            break;
                        }
                    }
                } else {
                    size = this.c.size();
                    i2 = 0;
                    while (true) {
                        if (i2 < size) {
                            agmVar = (agm) this.c.get(i2);
                            if (agmVar.j()) {
                            }
                            i2++;
                        } else {
                            agmVarB = null;
                            break;
                        }
                    }
                }
            }
            if (agmVarB != null) {
                if (agmVarB.m()) {
                    z4 = this.e.C.g;
                } else {
                    if (agmVarB.c < 0 || agmVarB.c >= this.e.j.a()) {
                        throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + agmVarB + this.e.a());
                    }
                    if (!this.e.C.g && this.e.j.a(agmVarB.c) != agmVarB.f) {
                        z4 = false;
                    } else {
                        z4 = !this.e.j.b || agmVarB.e == this.e.j.b(agmVarB.c);
                    }
                }
                if (!z4) {
                    if (!z) {
                        agmVarB.b(4);
                        if (agmVarB.e()) {
                            this.e.removeDetachedView(agmVarB.a, false);
                            agmVarB.f();
                        } else if (agmVarB.g()) {
                            agmVarB.h();
                        }
                        a(agmVarB);
                    }
                    agmVarB = null;
                } else {
                    z5 = true;
                }
            }
        }
        if (agmVarB == null) {
            int iA3 = this.e.e.a(i, 0);
            if (iA3 < 0 || iA3 >= this.e.j.a()) {
                throw new IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + i + "(offset:" + iA3 + ").state:" + this.e.C.a() + this.e.a());
            }
            int iA4 = this.e.j.a(iA3);
            if (this.e.j.b) {
                long jB2 = this.e.j.b(iA3);
                int size5 = this.a.size() - 1;
                while (true) {
                    if (size5 >= 0) {
                        agm agmVar5 = (agm) this.a.get(size5);
                        if (agmVar5.e == jB2 && !agmVar5.g()) {
                            if (iA4 == agmVar5.f) {
                                agmVar5.b(32);
                                if (agmVar5.m() && !this.e.C.g) {
                                    agmVar5.a(2, 14);
                                }
                                agmVarB = agmVar5;
                                break;
                            }
                            if (!z) {
                                this.a.remove(size5);
                                this.e.removeDetachedView(agmVar5.a, false);
                                b(agmVar5.a);
                            }
                        }
                        size5--;
                    } else {
                        int size6 = this.c.size() - 1;
                        while (true) {
                            if (size6 >= 0) {
                                agm agmVar6 = (agm) this.c.get(size6);
                                if (agmVar6.e == jB2) {
                                    if (iA4 == agmVar6.f) {
                                        if (!z) {
                                            this.c.remove(size6);
                                        }
                                        agmVarB = agmVar6;
                                        break;
                                    }
                                    if (!z) {
                                        b(size6);
                                        agmVarB = null;
                                        break;
                                    }
                                }
                                size6--;
                            } else {
                                agmVarB = null;
                                break;
                            }
                        }
                    }
                }
                if (agmVarB != null) {
                    agmVarB.c = iA3;
                    z5 = true;
                }
            }
            if (agmVarB == null) {
                age ageVar = (age) d().a.get(iA4);
                if (ageVar != null && !ageVar.a.isEmpty()) {
                    ArrayList arrayList = ageVar.a;
                    agmVarB = (agm) arrayList.remove(arrayList.size() - 1);
                } else {
                    agmVarB = null;
                }
                if (agmVarB != null) {
                    agmVarB.q();
                }
            }
            if (agmVarB == null) {
                long jO = RecyclerView.o();
                if (j != Long.MAX_VALUE) {
                    long j2 = this.h.a(iA4).c;
                    if (!(j2 == 0 || j2 + jO < j)) {
                        return null;
                    }
                }
                agmVarB = this.e.j.b(this.e, iA4);
                if (RecyclerView.c && (recyclerViewE = RecyclerView.e(agmVarB.a)) != null) {
                    agmVarB.b = new WeakReference(recyclerViewE);
                }
                long jO2 = RecyclerView.o();
                age ageVarA = this.h.a(iA4);
                ageVarA.c = agd.a(ageVarA.c, jO2 - jO);
            }
        }
        boolean z6 = z5;
        if (z6 && !this.e.C.g && agmVarB.a(8192)) {
            agmVarB.a(0, 8192);
            if (this.e.C.j) {
                afq.e(agmVarB);
                afq afqVar = this.e.y;
                agk agkVar = this.e.C;
                agmVarB.p();
                this.e.a(agmVarB, afqVar.d(agmVarB));
            }
        }
        if (this.e.C.g && agmVarB.l()) {
            agmVarB.g = i;
            z3 = false;
        } else if (agmVarB.l() && !agmVarB.k() && !agmVarB.j()) {
            z3 = false;
        } else {
            int iA5 = this.e.e.a(i, 0);
            agmVarB.o = this.e;
            int i7 = agmVarB.f;
            long jO3 = RecyclerView.o();
            if (j != Long.MAX_VALUE) {
                long j3 = this.h.a(i7).d;
                if (!(j3 == 0 || j3 + jO3 < j)) {
                    z2 = false;
                } else {
                    afmVar = this.e.j;
                    agmVarB.c = iA5;
                    if (afmVar.b) {
                        agmVarB.e = afmVar.b(iA5);
                    }
                    agmVarB.a(1, 519);
                    qs.a("RV OnBindView");
                    agmVarB.p();
                    afmVar.a(agmVarB, iA5);
                    agmVarB.o();
                    layoutParams = agmVarB.a.getLayoutParams();
                    if (layoutParams instanceof aga) {
                        ((aga) layoutParams).e = true;
                    }
                    Trace.endSection();
                    long jO4 = RecyclerView.o() - jO3;
                    age ageVarA2 = this.h.a(agmVarB.f);
                    ageVarA2.d = agd.a(ageVarA2.d, jO4);
                    if (this.e.j()) {
                        view = agmVarB.a;
                        if (ti.e(view) == 0) {
                            ti.b(view, 1);
                        }
                        if (!ti.b(view)) {
                            agmVarB.b(16384);
                            ti.a(view, this.e.I.c);
                        }
                    }
                    if (this.e.C.g) {
                        agmVarB.g = i;
                    }
                    z2 = true;
                }
            } else {
                afmVar = this.e.j;
                agmVarB.c = iA5;
                if (afmVar.b) {
                    agmVarB.e = afmVar.b(iA5);
                }
                agmVarB.a(1, 519);
                qs.a("RV OnBindView");
                agmVarB.p();
                afmVar.a(agmVarB, iA5);
                agmVarB.o();
                layoutParams = agmVarB.a.getLayoutParams();
                if (layoutParams instanceof aga) {
                    ((aga) layoutParams).e = true;
                }
                Trace.endSection();
                long jO5 = RecyclerView.o() - jO3;
                age ageVarA3 = this.h.a(agmVarB.f);
                ageVarA3.d = agd.a(ageVarA3.d, jO5);
                if (this.e.j()) {
                    view = agmVarB.a;
                    if (ti.e(view) == 0) {
                        ti.b(view, 1);
                    }
                    if (!ti.b(view)) {
                        agmVarB.b(16384);
                        ti.a(view, this.e.I.c);
                    }
                }
                if (this.e.C.g) {
                    agmVarB.g = i;
                }
                z2 = true;
            }
            z3 = z2;
        }
        ViewGroup.LayoutParams layoutParams2 = agmVarB.a.getLayoutParams();
        if (layoutParams2 == null) {
            agaVar = (aga) this.e.generateDefaultLayoutParams();
            agmVarB.a.setLayoutParams(agaVar);
        } else if (!this.e.checkLayoutParams(layoutParams2)) {
            agaVar = (aga) this.e.generateLayoutParams(layoutParams2);
            agmVarB.a.setLayoutParams(agaVar);
        } else {
            agaVar = (aga) layoutParams2;
        }
        agaVar.c = agmVarB;
        agaVar.f = z6 && z3;
        return agmVarB;
    }

    public final void a(View view) {
        agm agmVarC = RecyclerView.c(view);
        if (agmVarC.n()) {
            this.e.removeDetachedView(view, false);
        }
        if (agmVarC.e()) {
            agmVarC.f();
        } else if (agmVarC.g()) {
            agmVarC.h();
        }
        a(agmVarC);
    }

    public final void c() {
        for (int size = this.c.size() - 1; size >= 0; size--) {
            b(size);
        }
        this.c.clear();
        if (RecyclerView.c) {
            this.e.B.a();
        }
    }

    public final void b(int i) {
        a((agm) this.c.get(i), true);
        this.c.remove(i);
    }

    final void a(agm agmVar) {
        boolean z;
        boolean z2 = false;
        if (agmVar.e() || agmVar.a.getParent() != null) {
            throw new IllegalArgumentException("Scrapped or attached views may not be recycled. isScrap:" + agmVar.e() + " isAttached:" + (agmVar.a.getParent() != null) + this.e.a());
        }
        if (agmVar.n()) {
            throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + agmVar + this.e.a());
        }
        if (agmVar.b()) {
            throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle." + this.e.a());
        }
        boolean z3 = (agmVar.j & 16) == 0 && ti.c(agmVar.a);
        if (this.e.j != null && z3) {
            afm afmVar = this.e.j;
        }
        if (agmVar.r()) {
            if (this.g <= 0 || agmVar.a(526)) {
                z = false;
            } else {
                int size = this.c.size();
                if (size >= this.g && size > 0) {
                    b(0);
                    size--;
                }
                if (RecyclerView.c && size > 0 && !this.e.B.a(agmVar.c)) {
                    int i = size - 1;
                    while (i >= 0) {
                        if (!this.e.B.a(((agm) this.c.get(i)).c)) {
                            break;
                        } else {
                            i--;
                        }
                    }
                    size = i + 1;
                }
                this.c.add(size, agmVar);
                z = true;
            }
            if (!z) {
                a(agmVar, true);
                z2 = true;
            }
        } else {
            z = false;
        }
        this.e.g.d(agmVar);
        if (!z && !z2 && z3) {
            agmVar.o = null;
        }
    }

    final void a(agm agmVar, boolean z) {
        RecyclerView.b(agmVar);
        if (agmVar.a(16384)) {
            agmVar.a(0, 16384);
            ti.a(agmVar.a, (su) null);
        }
        if (z) {
            agg aggVar = this.e.l;
            if (this.e.j != null) {
                afm afmVar = this.e.j;
            }
            if (this.e.C != null) {
                this.e.g.d(agmVar);
            }
        }
        agmVar.o = null;
        agd agdVarD = d();
        int i = agmVar.f;
        ArrayList arrayList = agdVarD.a(i).a;
        if (((age) agdVarD.a.get(i)).b > arrayList.size()) {
            agmVar.q();
            arrayList.add(agmVar);
        }
    }

    final void b(View view) {
        agm agmVarC = RecyclerView.c(view);
        agmVarC.k = null;
        agmVarC.l = false;
        agmVarC.h();
        a(agmVarC);
    }

    final void c(View view) {
        agm agmVarC = RecyclerView.c(view);
        if (!agmVarC.a(12) && agmVarC.s()) {
            RecyclerView recyclerView = this.e;
            if (!(recyclerView.y == null || recyclerView.y.a(agmVarC, agmVarC.p()))) {
                if (this.b == null) {
                    this.b = new ArrayList();
                }
                agmVarC.a(this, true);
                this.b.add(agmVarC);
                return;
            }
        }
        if (agmVarC.j() && !agmVarC.m() && !this.e.j.b) {
            throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + this.e.a());
        }
        agmVarC.a(this, false);
        this.a.add(agmVarC);
    }

    public final void b(agm agmVar) {
        if (agmVar.l) {
            this.b.remove(agmVar);
        } else {
            this.a.remove(agmVar);
        }
        agmVar.k = null;
        agmVar.l = false;
        agmVar.h();
    }

    public final agd d() {
        if (this.h == null) {
            this.h = new agd();
        }
        return this.h;
    }
}

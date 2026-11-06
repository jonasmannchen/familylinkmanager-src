package flm;

import android.animation.Animator;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class jz implements View.OnAttachStateChangeListener, ViewTreeObserver.OnPreDrawListener {
    public ViewGroup a;
    private jq b;

    jz(jq jqVar, ViewGroup viewGroup) {
        this.b = jqVar;
        this.a = viewGroup;
    }

    private final void a() {
        this.a.getViewTreeObserver().removeOnPreDrawListener(this);
        this.a.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        a();
        jy.b.remove(this.a);
        ArrayList arrayList = (ArrayList) jy.a().get(this.a);
        if (arrayList != null && arrayList.size() > 0) {
            ArrayList arrayList2 = arrayList;
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList2.get(i);
                i++;
                ((jq) obj).e(this.a);
            }
        }
        this.b.a(true);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ArrayList arrayList;
        ArrayList arrayList2;
        ju juVar;
        View view;
        View view2;
        View view3;
        kg kgVar;
        a();
        if (!jy.b.remove(this.a)) {
            return true;
        }
        rt rtVarA = jy.a();
        ArrayList arrayList3 = (ArrayList) rtVarA.get(this.a);
        if (arrayList3 == null) {
            ArrayList arrayList4 = new ArrayList();
            rtVarA.put(this.a, arrayList4);
            arrayList = arrayList4;
            arrayList2 = null;
        } else if (arrayList3.size() <= 0) {
            arrayList = arrayList3;
            arrayList2 = null;
        } else {
            arrayList = arrayList3;
            arrayList2 = new ArrayList(arrayList3);
        }
        arrayList.add(this.b);
        this.b.a(new ka(this, rtVarA));
        this.b.a(this.a, false);
        if (arrayList2 != null) {
            ArrayList arrayList5 = arrayList2;
            int size = arrayList5.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList5.get(i);
                i++;
                ((jq) obj).e(this.a);
            }
        }
        jq jqVar = this.b;
        ViewGroup viewGroup = this.a;
        jqVar.j = new ArrayList();
        jqVar.k = new ArrayList();
        kh khVar = jqVar.f;
        kh khVar2 = jqVar.g;
        rt rtVar = new rt(khVar.a);
        rt rtVar2 = new rt(khVar2.a);
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 < jqVar.i.length) {
                switch (jqVar.i[i3]) {
                    case 1:
                        for (int size2 = rtVar.size() - 1; size2 >= 0; size2--) {
                            View view4 = (View) rtVar.b(size2);
                            if (view4 != null && jqVar.a(view4) && (kgVar = (kg) rtVar2.remove(view4)) != null && kgVar.b != null && jqVar.a(kgVar.b)) {
                                jqVar.j.add((kg) rtVar.d(size2));
                                jqVar.k.add(kgVar);
                            }
                        }
                        break;
                    case 2:
                        rt rtVar3 = khVar.d;
                        rt rtVar4 = khVar2.d;
                        int size3 = rtVar3.size();
                        int i4 = 0;
                        while (true) {
                            int i5 = i4;
                            if (i5 < size3) {
                                View view5 = (View) rtVar3.c(i5);
                                if (view5 != null && jqVar.a(view5) && (view3 = (View) rtVar4.get(rtVar3.b(i5))) != null && jqVar.a(view3)) {
                                    kg kgVar2 = (kg) rtVar.get(view5);
                                    kg kgVar3 = (kg) rtVar2.get(view3);
                                    if (kgVar2 != null && kgVar3 != null) {
                                        jqVar.j.add(kgVar2);
                                        jqVar.k.add(kgVar3);
                                        rtVar.remove(view5);
                                        rtVar2.remove(view3);
                                    }
                                }
                                i4 = i5 + 1;
                            }
                        }
                        break;
                    case 3:
                        SparseArray sparseArray = khVar.b;
                        SparseArray sparseArray2 = khVar2.b;
                        int size4 = sparseArray.size();
                        int i6 = 0;
                        while (true) {
                            int i7 = i6;
                            if (i7 < size4) {
                                View view6 = (View) sparseArray.valueAt(i7);
                                if (view6 != null && jqVar.a(view6) && (view2 = (View) sparseArray2.get(sparseArray.keyAt(i7))) != null && jqVar.a(view2)) {
                                    kg kgVar4 = (kg) rtVar.get(view6);
                                    kg kgVar5 = (kg) rtVar2.get(view2);
                                    if (kgVar4 != null && kgVar5 != null) {
                                        jqVar.j.add(kgVar4);
                                        jqVar.k.add(kgVar5);
                                        rtVar.remove(view6);
                                        rtVar2.remove(view2);
                                    }
                                }
                                i6 = i7 + 1;
                            }
                        }
                        break;
                    case 4:
                        sa saVar = khVar.c;
                        sa saVar2 = khVar2.c;
                        int iC = saVar.c();
                        int i8 = 0;
                        while (true) {
                            int i9 = i8;
                            if (i9 < iC) {
                                View view7 = (View) saVar.b(i9);
                                if (view7 != null && jqVar.a(view7) && (view = (View) saVar2.a(saVar.a(i9), null)) != null && jqVar.a(view)) {
                                    kg kgVar6 = (kg) rtVar.get(view7);
                                    kg kgVar7 = (kg) rtVar2.get(view);
                                    if (kgVar6 != null && kgVar7 != null) {
                                        jqVar.j.add(kgVar6);
                                        jqVar.k.add(kgVar7);
                                        rtVar.remove(view7);
                                        rtVar2.remove(view);
                                    }
                                }
                                i8 = i9 + 1;
                            }
                        }
                        break;
                }
                i2 = i3 + 1;
            } else {
                int i10 = 0;
                while (true) {
                    int i11 = i10;
                    if (i11 < rtVar.size()) {
                        kg kgVar8 = (kg) rtVar.c(i11);
                        if (jqVar.a(kgVar8.b)) {
                            jqVar.j.add(kgVar8);
                            jqVar.k.add(null);
                        }
                        i10 = i11 + 1;
                    } else {
                        int i12 = 0;
                        while (true) {
                            int i13 = i12;
                            if (i13 < rtVar2.size()) {
                                kg kgVar9 = (kg) rtVar2.c(i13);
                                if (jqVar.a(kgVar9.b)) {
                                    jqVar.k.add(kgVar9);
                                    jqVar.j.add(null);
                                }
                                i12 = i13 + 1;
                            } else {
                                rt rtVarB = jq.b();
                                int size5 = rtVarB.size();
                                ky kyVarA = km.a(viewGroup);
                                for (int i14 = size5 - 1; i14 >= 0; i14--) {
                                    Animator animator = (Animator) rtVarB.b(i14);
                                    if (animator != null && (juVar = (ju) rtVarB.get(animator)) != null && juVar.a != null && kyVarA.equals(juVar.d)) {
                                        kg kgVar10 = juVar.c;
                                        View view8 = juVar.a;
                                        kg kgVarA = jqVar.a(view8, true);
                                        kg kgVarB = jqVar.b(view8, true);
                                        if (!(kgVarA == null && kgVarB == null) && juVar.e.a(kgVar10, kgVarB)) {
                                            if (animator.isRunning() || animator.isStarted()) {
                                                animator.cancel();
                                            } else {
                                                rtVarB.remove(animator);
                                            }
                                        }
                                    }
                                }
                                jqVar.a(viewGroup, jqVar.f, jqVar.g, jqVar.j, jqVar.k);
                                jqVar.c();
                                return true;
                            }
                        }
                    }
                }
            }
        }
    }
}

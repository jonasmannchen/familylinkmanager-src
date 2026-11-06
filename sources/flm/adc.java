package flm;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class adc extends agx {
    private static TimeInterpolator m;
    private ArrayList n = new ArrayList();
    private ArrayList o = new ArrayList();
    private ArrayList p = new ArrayList();
    private ArrayList q = new ArrayList();
    public ArrayList a = new ArrayList();
    public ArrayList b = new ArrayList();
    public ArrayList c = new ArrayList();
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public ArrayList f = new ArrayList();
    public ArrayList g = new ArrayList();

    @Override // flm.afq
    public final void a() {
        long j;
        long j2;
        long j3;
        boolean z = !this.n.isEmpty();
        boolean z2 = !this.p.isEmpty();
        boolean z3 = !this.q.isEmpty();
        boolean z4 = !this.o.isEmpty();
        if (z || z2 || z4 || z3) {
            ArrayList arrayList = this.n;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                agm agmVar = (agm) obj;
                View view = agmVar.a;
                ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
                this.f.add(agmVar);
                viewPropertyAnimatorAnimate.setDuration(this.j).alpha(0.0f).setListener(new adg(this, agmVar, viewPropertyAnimatorAnimate, view)).start();
            }
            this.n.clear();
            if (z2) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(this.p);
                this.b.add(arrayList2);
                this.p.clear();
                add addVar = new add(this, arrayList2);
                if (z) {
                    ti.a(((adm) arrayList2.get(0)).a.a, addVar, this.j);
                } else {
                    addVar.run();
                }
            }
            if (z3) {
                ArrayList arrayList3 = new ArrayList();
                arrayList3.addAll(this.q);
                this.c.add(arrayList3);
                this.q.clear();
                ade adeVar = new ade(this, arrayList3);
                if (z) {
                    ti.a(((adl) arrayList3.get(0)).a.a, adeVar, this.j);
                } else {
                    adeVar.run();
                }
            }
            if (z4) {
                ArrayList arrayList4 = new ArrayList();
                arrayList4.addAll(this.o);
                this.a.add(arrayList4);
                this.o.clear();
                adf adfVar = new adf(this, arrayList4);
                if (z || z2 || z3) {
                    if (z) {
                        j = this.j;
                    } else {
                        j = 0;
                    }
                    if (z2) {
                        j2 = this.k;
                    } else {
                        j2 = 0;
                    }
                    if (z3) {
                        j3 = this.l;
                    } else {
                        j3 = 0;
                    }
                    ti.a(((agm) arrayList4.get(0)).a, adfVar, j + Math.max(j2, j3));
                    return;
                }
                adfVar.run();
            }
        }
    }

    @Override // flm.agx
    public final boolean a(agm agmVar) {
        h(agmVar);
        this.n.add(agmVar);
        return true;
    }

    @Override // flm.agx
    public final boolean b(agm agmVar) {
        h(agmVar);
        agmVar.a.setAlpha(0.0f);
        this.o.add(agmVar);
        return true;
    }

    @Override // flm.agx
    public final boolean a(agm agmVar, int i, int i2, int i3, int i4) {
        View view = agmVar.a;
        int translationX = i + ((int) agmVar.a.getTranslationX());
        int translationY = i2 + ((int) agmVar.a.getTranslationY());
        h(agmVar);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0 && i6 == 0) {
            f(agmVar);
            return false;
        }
        if (i5 != 0) {
            view.setTranslationX(-i5);
        }
        if (i6 != 0) {
            view.setTranslationY(-i6);
        }
        this.p.add(new adm(agmVar, translationX, translationY, i3, i4));
        return true;
    }

    @Override // flm.agx
    public final boolean a(agm agmVar, agm agmVar2, int i, int i2, int i3, int i4) {
        if (agmVar == agmVar2) {
            return a(agmVar, i, i2, i3, i4);
        }
        float translationX = agmVar.a.getTranslationX();
        float translationY = agmVar.a.getTranslationY();
        float alpha = agmVar.a.getAlpha();
        h(agmVar);
        int i5 = (int) ((i3 - i) - translationX);
        int i6 = (int) ((i4 - i2) - translationY);
        agmVar.a.setTranslationX(translationX);
        agmVar.a.setTranslationY(translationY);
        agmVar.a.setAlpha(alpha);
        if (agmVar2 != null) {
            h(agmVar2);
            agmVar2.a.setTranslationX(-i5);
            agmVar2.a.setTranslationY(-i6);
            agmVar2.a.setAlpha(0.0f);
        }
        this.q.add(new adl(agmVar, agmVar2, i, i2, i3, i4));
        return true;
    }

    private final void a(List list, agm agmVar) {
        for (int size = list.size() - 1; size >= 0; size--) {
            adl adlVar = (adl) list.get(size);
            if (a(adlVar, agmVar) && adlVar.a == null && adlVar.b == null) {
                list.remove(adlVar);
            }
        }
    }

    private final void a(adl adlVar) {
        if (adlVar.a != null) {
            a(adlVar, adlVar.a);
        }
        if (adlVar.b != null) {
            a(adlVar, adlVar.b);
        }
    }

    private final boolean a(adl adlVar, agm agmVar) {
        if (adlVar.b == agmVar) {
            adlVar.b = null;
        } else if (adlVar.a == agmVar) {
            adlVar.a = null;
        } else {
            return false;
        }
        agmVar.a.setAlpha(1.0f);
        agmVar.a.setTranslationX(0.0f);
        agmVar.a.setTranslationY(0.0f);
        f(agmVar);
        return true;
    }

    @Override // flm.afq
    public final void c(agm agmVar) {
        View view = agmVar.a;
        view.animate().cancel();
        for (int size = this.p.size() - 1; size >= 0; size--) {
            if (((adm) this.p.get(size)).a == agmVar) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                f(agmVar);
                this.p.remove(size);
            }
        }
        a(this.q, agmVar);
        if (this.n.remove(agmVar)) {
            view.setAlpha(1.0f);
            f(agmVar);
        }
        if (this.o.remove(agmVar)) {
            view.setAlpha(1.0f);
            f(agmVar);
        }
        for (int size2 = this.c.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList = (ArrayList) this.c.get(size2);
            a(arrayList, agmVar);
            if (arrayList.isEmpty()) {
                this.c.remove(size2);
            }
        }
        for (int size3 = this.b.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList2 = (ArrayList) this.b.get(size3);
            for (int size4 = arrayList2.size() - 1; size4 >= 0; size4--) {
                if (((adm) arrayList2.get(size4)).a == agmVar) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    f(agmVar);
                    arrayList2.remove(size4);
                    if (!arrayList2.isEmpty()) {
                        break;
                    }
                    this.b.remove(size3);
                    break;
                }
            }
        }
        for (int size5 = this.a.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList3 = (ArrayList) this.a.get(size5);
            if (arrayList3.remove(agmVar)) {
                view.setAlpha(1.0f);
                f(agmVar);
                if (arrayList3.isEmpty()) {
                    this.a.remove(size5);
                }
            }
        }
        this.f.remove(agmVar);
        this.d.remove(agmVar);
        this.g.remove(agmVar);
        this.e.remove(agmVar);
        c();
    }

    private final void h(agm agmVar) {
        if (m == null) {
            m = new ValueAnimator().getInterpolator();
        }
        agmVar.a.animate().setInterpolator(m);
        c(agmVar);
    }

    @Override // flm.afq
    public final boolean b() {
        return (this.o.isEmpty() && this.q.isEmpty() && this.p.isEmpty() && this.n.isEmpty() && this.e.isEmpty() && this.f.isEmpty() && this.d.isEmpty() && this.g.isEmpty() && this.b.isEmpty() && this.a.isEmpty() && this.c.isEmpty()) ? false : true;
    }

    final void c() {
        if (!b()) {
            e();
        }
    }

    @Override // flm.afq
    public final void d() {
        for (int size = this.p.size() - 1; size >= 0; size--) {
            adm admVar = (adm) this.p.get(size);
            View view = admVar.a.a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            f(admVar.a);
            this.p.remove(size);
        }
        for (int size2 = this.n.size() - 1; size2 >= 0; size2--) {
            f((agm) this.n.get(size2));
            this.n.remove(size2);
        }
        for (int size3 = this.o.size() - 1; size3 >= 0; size3--) {
            agm agmVar = (agm) this.o.get(size3);
            agmVar.a.setAlpha(1.0f);
            f(agmVar);
            this.o.remove(size3);
        }
        for (int size4 = this.q.size() - 1; size4 >= 0; size4--) {
            a((adl) this.q.get(size4));
        }
        this.q.clear();
        if (b()) {
            for (int size5 = this.b.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList = (ArrayList) this.b.get(size5);
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    adm admVar2 = (adm) arrayList.get(size6);
                    View view2 = admVar2.a.a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    f(admVar2.a);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.b.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.a.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList2 = (ArrayList) this.a.get(size7);
                for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                    agm agmVar2 = (agm) arrayList2.get(size8);
                    agmVar2.a.setAlpha(1.0f);
                    f(agmVar2);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.a.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.c.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList3 = (ArrayList) this.c.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    a((adl) arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.c.remove(arrayList3);
                    }
                }
            }
            a(this.f);
            a(this.e);
            a(this.d);
            a(this.g);
            e();
        }
    }

    private static void a(List list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            ((agm) list.get(size)).a.animate().cancel();
        }
    }

    @Override // flm.afq
    public final boolean a(agm agmVar, List list) {
        return !list.isEmpty() || super.a(agmVar, list);
    }
}

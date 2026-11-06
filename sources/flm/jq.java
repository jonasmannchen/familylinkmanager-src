package flm;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class jq implements Cloneable {
    public ArrayList j;
    public ArrayList k;
    public kb n;
    public jv o;
    private static final int[] q = {2, 1, 3, 4};
    private static final jn r = new jr();
    private static ThreadLocal C = new ThreadLocal();
    private String s = getClass().getName();
    public long a = -1;
    public long b = -1;
    public TimeInterpolator c = null;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    private ArrayList t = null;
    private ArrayList u = null;
    private ArrayList v = null;
    private ArrayList w = null;
    private ArrayList x = null;
    private ArrayList y = null;
    private ArrayList z = null;
    private ArrayList A = null;
    private ArrayList B = null;
    public kh f = new kh();
    public kh g = new kh();
    public kc h = null;
    public int[] i = q;
    public boolean l = false;
    public ArrayList m = new ArrayList();
    private int D = 0;
    private boolean E = false;
    private boolean F = false;
    private ArrayList G = null;
    private ArrayList H = new ArrayList();
    public jn p = r;

    public abstract void a(kg kgVar);

    public abstract void b(kg kgVar);

    public jq a(long j) {
        this.b = j;
        return this;
    }

    public jq b(long j) {
        this.a = j;
        return this;
    }

    public jq a(TimeInterpolator timeInterpolator) {
        this.c = timeInterpolator;
        return this;
    }

    public String[] a() {
        return null;
    }

    public Animator a(ViewGroup viewGroup, kg kgVar, kg kgVar2) {
        return null;
    }

    protected void a(ViewGroup viewGroup, kh khVar, kh khVar2, ArrayList arrayList, ArrayList arrayList2) {
        Animator animatorA;
        View view;
        kg kgVar;
        Animator animator;
        rt rtVarB = b();
        long jMin = Long.MAX_VALUE;
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            kg kgVar2 = (kg) arrayList.get(i);
            kg kgVar3 = (kg) arrayList2.get(i);
            kg kgVar4 = (kgVar2 == null || kgVar2.c.contains(this)) ? kgVar2 : null;
            if (kgVar3 != null && !kgVar3.c.contains(this)) {
                kgVar3 = null;
            }
            if (kgVar4 != null || kgVar3 != null) {
                if ((kgVar4 == null || kgVar3 == null || a(kgVar4, kgVar3)) && (animatorA = a(viewGroup, kgVar4, kgVar3)) != null) {
                    kg kgVar5 = null;
                    if (kgVar3 != null) {
                        View view2 = kgVar3.b;
                        String[] strArrA = a();
                        if (view2 == null || strArrA == null || strArrA.length <= 0) {
                            kgVar = kgVar5;
                            view = view2;
                            animator = animatorA;
                            break;
                        }
                        kg kgVar6 = new kg();
                        kgVar6.b = view2;
                        kg kgVar7 = (kg) khVar2.a.get(view2);
                        if (kgVar7 != null) {
                            for (int i2 = 0; i2 < strArrA.length; i2++) {
                                kgVar6.a.put(strArrA[i2], kgVar7.a.get(strArrA[i2]));
                            }
                        }
                        int size2 = rtVarB.size();
                        int i3 = 0;
                        while (true) {
                            if (i3 >= size2) {
                                kgVar5 = kgVar6;
                                kgVar = kgVar5;
                                view = view2;
                                animator = animatorA;
                                break;
                            }
                            ju juVar = (ju) rtVarB.get((Animator) rtVarB.b(i3));
                            if (juVar.c != null && juVar.a == view2 && juVar.b.equals(this.s) && juVar.c.equals(kgVar6)) {
                                kgVar = kgVar6;
                                view = view2;
                                animator = null;
                                break;
                            }
                            i3++;
                        }
                    } else {
                        view = kgVar4.b;
                        kgVar = null;
                        animator = animatorA;
                    }
                    if (animator != null) {
                        if (this.n != null) {
                            long jA = this.n.a();
                            sparseIntArray.put(this.H.size(), (int) jA);
                            jMin = Math.min(jA, jMin);
                        }
                        rtVarB.put(animator, new ju(view, this.s, this, km.a(viewGroup), kgVar));
                        this.H.add(animator);
                    }
                }
            }
        }
        if (jMin != 0) {
            int i4 = 0;
            while (true) {
                int i5 = i4;
                if (i5 < sparseIntArray.size()) {
                    Animator animator2 = (Animator) this.H.get(sparseIntArray.keyAt(i5));
                    animator2.setStartDelay((((long) sparseIntArray.valueAt(i5)) - jMin) + animator2.getStartDelay());
                    i4 = i5 + 1;
                } else {
                    return;
                }
            }
        }
    }

    final boolean a(View view) {
        return (this.d.size() == 0 && this.e.size() == 0) || this.d.contains(Integer.valueOf(view.getId())) || this.e.contains(view);
    }

    static rt b() {
        rt rtVar = (rt) C.get();
        if (rtVar == null) {
            rt rtVar2 = new rt();
            C.set(rtVar2);
            return rtVar2;
        }
        return rtVar;
    }

    protected void c() {
        d();
        rt rtVarB = b();
        ArrayList arrayList = this.H;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            Animator animator = (Animator) obj;
            if (rtVarB.containsKey(animator)) {
                d();
                if (animator != null) {
                    animator.addListener(new js(this, rtVarB));
                    if (animator == null) {
                        e();
                    } else {
                        if (this.b >= 0) {
                            animator.setDuration(this.b);
                        }
                        if (this.a >= 0) {
                            animator.setStartDelay(this.a);
                        }
                        if (this.c != null) {
                            animator.setInterpolator(this.c);
                        }
                        animator.addListener(new jt(this));
                        animator.start();
                    }
                }
            }
        }
        this.H.clear();
        e();
    }

    public jq b(View view) {
        this.e.add(view);
        return this;
    }

    public jq c(View view) {
        this.e.remove(view);
        return this;
    }

    final void a(ViewGroup viewGroup, boolean z) {
        a(z);
        if (this.d.size() > 0 || this.e.size() > 0) {
            for (int i = 0; i < this.d.size(); i++) {
                View viewFindViewById = viewGroup.findViewById(((Integer) this.d.get(i)).intValue());
                if (viewFindViewById != null) {
                    kg kgVar = new kg();
                    kgVar.b = viewFindViewById;
                    if (z) {
                        a(kgVar);
                    } else {
                        b(kgVar);
                    }
                    kgVar.c.add(this);
                    c(kgVar);
                    if (z) {
                        a(this.f, viewFindViewById, kgVar);
                    } else {
                        a(this.g, viewFindViewById, kgVar);
                    }
                }
            }
            for (int i2 = 0; i2 < this.e.size(); i2++) {
                View view = (View) this.e.get(i2);
                kg kgVar2 = new kg();
                kgVar2.b = view;
                if (z) {
                    a(kgVar2);
                } else {
                    b(kgVar2);
                }
                kgVar2.c.add(this);
                c(kgVar2);
                if (z) {
                    a(this.f, view, kgVar2);
                } else {
                    a(this.g, view, kgVar2);
                }
            }
            return;
        }
        c(viewGroup, z);
    }

    private static void a(kh khVar, View view, kg kgVar) {
        khVar.a.put(view, kgVar);
        int id = view.getId();
        if (id >= 0) {
            if (khVar.b.indexOfKey(id) >= 0) {
                khVar.b.put(id, null);
            } else {
                khVar.b.put(id, view);
            }
        }
        String strM = ti.m(view);
        if (strM != null) {
            if (khVar.d.containsKey(strM)) {
                khVar.d.put(strM, null);
            } else {
                khVar.d.put(strM, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                sa saVar = khVar.c;
                if (saVar.b) {
                    saVar.b();
                }
                if (rx.a(saVar.c, saVar.e, itemIdAtPosition) >= 0) {
                    View view2 = (View) khVar.c.a(itemIdAtPosition, null);
                    if (view2 != null) {
                        ti.a(view2, false);
                        khVar.c.b(itemIdAtPosition, null);
                        return;
                    }
                    return;
                }
                ti.a(view, true);
                khVar.c.b(itemIdAtPosition, view);
            }
        }
    }

    final void a(boolean z) {
        if (z) {
            this.f.a.clear();
            this.f.b.clear();
            this.f.c.d();
        } else {
            this.g.a.clear();
            this.g.b.clear();
            this.g.c.d();
        }
    }

    private final void c(View view, boolean z) {
        if (view != null) {
            view.getId();
            if (view.getParent() instanceof ViewGroup) {
                kg kgVar = new kg();
                kgVar.b = view;
                if (z) {
                    a(kgVar);
                } else {
                    b(kgVar);
                }
                kgVar.c.add(this);
                c(kgVar);
                if (z) {
                    a(this.f, view, kgVar);
                } else {
                    a(this.g, view, kgVar);
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    c(viewGroup.getChildAt(i), z);
                }
            }
        }
    }

    public final kg a(View view, boolean z) {
        while (this.h != null) {
            this = this.h;
        }
        return (kg) (z ? this.f : this.g).a.get(view);
    }

    final kg b(View view, boolean z) {
        kg kgVar;
        while (this.h != null) {
            this = this.h;
        }
        ArrayList arrayList = z ? this.j : this.k;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            }
            kg kgVar2 = (kg) arrayList.get(i);
            if (kgVar2 == null) {
                return null;
            }
            if (kgVar2.b == view) {
                break;
            }
            i++;
        }
        if (i >= 0) {
            kgVar = (kg) (z ? this.k : this.j).get(i);
        } else {
            kgVar = null;
        }
        return kgVar;
    }

    public void d(View view) {
        if (!this.F) {
            rt rtVarB = b();
            int size = rtVarB.size();
            ky kyVarA = km.a(view);
            for (int i = size - 1; i >= 0; i--) {
                ju juVar = (ju) rtVarB.c(i);
                if (juVar.a != null && kyVarA.equals(juVar.d)) {
                    ((Animator) rtVarB.b(i)).pause();
                }
            }
            if (this.G != null && this.G.size() > 0) {
                ArrayList arrayList = (ArrayList) this.G.clone();
                int size2 = arrayList.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    ((jw) arrayList.get(i2)).a();
                }
            }
            this.E = true;
        }
    }

    public void e(View view) {
        if (this.E) {
            if (!this.F) {
                rt rtVarB = b();
                int size = rtVarB.size();
                ky kyVarA = km.a(view);
                for (int i = size - 1; i >= 0; i--) {
                    ju juVar = (ju) rtVarB.c(i);
                    if (juVar.a != null && kyVarA.equals(juVar.d)) {
                        ((Animator) rtVarB.b(i)).resume();
                    }
                }
                if (this.G != null && this.G.size() > 0) {
                    ArrayList arrayList = (ArrayList) this.G.clone();
                    int size2 = arrayList.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        ((jw) arrayList.get(i2)).b();
                    }
                }
            }
            this.E = false;
        }
    }

    public boolean a(kg kgVar, kg kgVar2) {
        if (kgVar != null && kgVar2 != null) {
            String[] strArrA = a();
            if (strArrA != null) {
                for (String str : strArrA) {
                    if (a(kgVar, kgVar2, str)) {
                        return true;
                    }
                }
                return false;
            }
            Iterator it = kgVar.a.keySet().iterator();
            while (it.hasNext()) {
                if (a(kgVar, kgVar2, (String) it.next())) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean a(kg kgVar, kg kgVar2, String str) {
        Object obj = kgVar.a.get(str);
        Object obj2 = kgVar2.a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        return obj == null || obj2 == null || !obj.equals(obj2);
    }

    protected final void d() {
        if (this.D == 0) {
            if (this.G != null && this.G.size() > 0) {
                ArrayList arrayList = (ArrayList) this.G.clone();
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((jw) arrayList.get(i)).c();
                }
            }
            this.F = false;
        }
        this.D++;
    }

    protected final void e() {
        this.D--;
        if (this.D == 0) {
            if (this.G != null && this.G.size() > 0) {
                ArrayList arrayList = (ArrayList) this.G.clone();
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((jw) arrayList.get(i)).a(this);
                }
            }
            for (int i2 = 0; i2 < this.f.c.c(); i2++) {
                View view = (View) this.f.c.b(i2);
                if (view != null) {
                    ti.a(view, false);
                }
            }
            for (int i3 = 0; i3 < this.g.c.c(); i3++) {
                View view2 = (View) this.g.c.b(i3);
                if (view2 != null) {
                    ti.a(view2, false);
                }
            }
            this.F = true;
        }
    }

    public jq a(jw jwVar) {
        if (this.G == null) {
            this.G = new ArrayList();
        }
        this.G.add(jwVar);
        return this;
    }

    public jq b(jw jwVar) {
        if (this.G != null) {
            this.G.remove(jwVar);
            if (this.G.size() == 0) {
                this.G = null;
            }
        }
        return this;
    }

    public void a(jn jnVar) {
        if (jnVar == null) {
            this.p = r;
        } else {
            this.p = jnVar;
        }
    }

    public void a(jv jvVar) {
        this.o = jvVar;
    }

    public void a(kb kbVar) {
        this.n = kbVar;
    }

    void c(kg kgVar) {
        String[] strArrC;
        boolean z = false;
        if (this.n != null && !kgVar.a.isEmpty() && (strArrC = this.n.c()) != null) {
            int i = 0;
            while (true) {
                if (i >= strArrC.length) {
                    z = true;
                    break;
                } else if (!kgVar.a.containsKey(strArrC[i])) {
                    break;
                } else {
                    i++;
                }
            }
            if (!z) {
                this.n.b();
            }
        }
    }

    public String toString() {
        return a("");
    }

    @Override // 
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public jq clone() {
        try {
            jq jqVar = (jq) super.clone();
            jqVar.H = new ArrayList();
            jqVar.f = new kh();
            jqVar.g = new kh();
            jqVar.j = null;
            jqVar.k = null;
            return jqVar;
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    String a(String str) {
        String str2;
        String str3 = str + getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) + ": ";
        if (this.b != -1) {
            str3 = str3 + "dur(" + this.b + ") ";
        }
        if (this.a != -1) {
            str3 = str3 + "dly(" + this.a + ") ";
        }
        if (this.c != null) {
            str3 = str3 + "interp(" + this.c + ") ";
        }
        if (this.d.size() > 0 || this.e.size() > 0) {
            String str4 = str3 + "tgts(";
            if (this.d.size() > 0) {
                str2 = str4;
                for (int i = 0; i < this.d.size(); i++) {
                    if (i > 0) {
                        str2 = str2 + ", ";
                    }
                    str2 = str2 + this.d.get(i);
                }
            } else {
                str2 = str4;
            }
            if (this.e.size() > 0) {
                for (int i2 = 0; i2 < this.e.size(); i2++) {
                    if (i2 > 0) {
                        str2 = str2 + ", ";
                    }
                    str2 = str2 + this.e.get(i2);
                }
            }
            return str2 + ")";
        }
        return str3;
    }
}

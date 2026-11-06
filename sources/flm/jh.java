package flm;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.chimeraresources.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class jh extends ne {
    @Override // flm.ne
    public final boolean a(Object obj) {
        return obj instanceof jq;
    }

    @Override // flm.ne
    public final Object b(Object obj) {
        if (obj == null) {
            return null;
        }
        return (jq) ((jq) obj).clone();
    }

    @Override // flm.ne
    public final Object c(Object obj) {
        if (obj == null) {
            return null;
        }
        kc kcVar = new kc();
        kcVar.a((jq) obj);
        return kcVar;
    }

    @Override // flm.ne
    public final void a(Object obj, View view, ArrayList arrayList) {
        kc kcVar = (kc) obj;
        ArrayList arrayList2 = kcVar.e;
        arrayList2.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            a((List) arrayList2, (View) arrayList.get(i));
        }
        arrayList2.add(view);
        arrayList.add(view);
        a(kcVar, arrayList);
    }

    @Override // flm.ne
    public final void a(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            a(view, rect);
            ((jq) obj).a(new ji(this, rect));
        }
    }

    @Override // flm.ne
    public final void a(Object obj, ArrayList arrayList) {
        jq jqVar = (jq) obj;
        if (jqVar != null) {
            if (jqVar instanceof kc) {
                kc kcVar = (kc) jqVar;
                int size = kcVar.q.size();
                for (int i = 0; i < size; i++) {
                    a(kcVar.a(i), arrayList);
                }
                return;
            }
            if (!a(jqVar) && a((List) jqVar.e)) {
                int size2 = arrayList.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    jqVar.b((View) arrayList.get(i2));
                }
            }
        }
    }

    private static boolean a(jq jqVar) {
        return (a((List) jqVar.d) && a((List) null) && a((List) null)) ? false : true;
    }

    @Override // flm.ne
    public final Object a(Object obj, Object obj2, Object obj3) {
        kc kcVar = new kc();
        if (obj != null) {
            kcVar.a((jq) obj);
        }
        if (obj2 != null) {
            kcVar.a((jq) obj2);
        }
        if (obj3 != null) {
            kcVar.a((jq) obj3);
        }
        return kcVar;
    }

    @Override // flm.ne
    public final void b(Object obj, View view, ArrayList arrayList) {
        ((jq) obj).a(new jj(this, view, arrayList));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // flm.ne
    public final Object b(Object obj, Object obj2, Object obj3) {
        kc kcVarA = 0;
        jq jqVar = (jq) obj;
        jq jqVar2 = (jq) obj2;
        jq jqVar3 = (jq) obj3;
        if (jqVar != null && jqVar2 != null) {
            kcVarA = new kc().a(jqVar).a(jqVar2);
            kcVarA.r = false;
        } else if (jqVar != null) {
            kcVarA = jqVar;
        } else if (jqVar2 != null) {
            kcVarA = jqVar2;
        }
        if (jqVar3 == null) {
            return kcVarA;
        }
        kc kcVar = new kc();
        if (kcVarA != 0) {
            kcVar.a(kcVarA);
        }
        kcVar.a(jqVar3);
        return kcVar;
    }

    @Override // flm.ne
    public final void a(ViewGroup viewGroup, Object obj) {
        jq jqVar = (jq) obj;
        if (!jy.b.contains(viewGroup) && ti.w(viewGroup)) {
            jy.b.add(viewGroup);
            if (jqVar == null) {
                jqVar = jy.a;
            }
            jq jqVar2 = (jq) jqVar.clone();
            ArrayList arrayList = (ArrayList) jy.a().get(viewGroup);
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = arrayList;
                int size = arrayList2.size();
                int i = 0;
                while (i < size) {
                    Object obj2 = arrayList2.get(i);
                    i++;
                    ((jq) obj2).d(viewGroup);
                }
            }
            if (jqVar2 != null) {
                jqVar2.a(viewGroup, true);
            }
            if (((jp) viewGroup.getTag(R.id.transition_current_scene)) != null) {
                throw new NoSuchMethodError();
            }
            viewGroup.setTag(R.id.transition_current_scene, null);
            jy.a(viewGroup, jqVar2);
        }
    }

    @Override // flm.ne
    public final void a(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2, Object obj4, ArrayList arrayList3) {
        ((jq) obj).a(new jk(this, obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override // flm.ne
    public final void a(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        kc kcVar = (kc) obj;
        if (kcVar != null) {
            kcVar.e.clear();
            kcVar.e.addAll(arrayList2);
            b((Object) kcVar, arrayList, arrayList2);
        }
    }

    @Override // flm.ne
    public final void b(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        jq jqVar = (jq) obj;
        if (jqVar instanceof kc) {
            kc kcVar = (kc) jqVar;
            int size = kcVar.q.size();
            for (int i = 0; i < size; i++) {
                b((Object) kcVar.a(i), arrayList, arrayList2);
            }
            return;
        }
        if (!a(jqVar)) {
            ArrayList arrayList3 = jqVar.e;
            if (arrayList3.size() == arrayList.size() && arrayList3.containsAll(arrayList)) {
                int size2 = arrayList2 == null ? 0 : arrayList2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    jqVar.b((View) arrayList2.get(i2));
                }
                for (int size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                    jqVar.c((View) arrayList.get(size3));
                }
            }
        }
    }

    @Override // flm.ne
    public final void b(Object obj, View view) {
        if (obj != null) {
            ((jq) obj).b(view);
        }
    }

    @Override // flm.ne
    public final void c(Object obj, View view) {
        if (obj != null) {
            ((jq) obj).c(view);
        }
    }

    @Override // flm.ne
    public final void a(Object obj, Rect rect) {
        if (obj != null) {
            ((jq) obj).a(new jl(this, rect));
        }
    }
}

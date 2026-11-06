package flm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class fjq extends fjp {
    private static final Class c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    fjq() {
    }

    @Override // flm.fjp
    final List a(Object obj, long j) {
        return a(obj, j, 10);
    }

    @Override // flm.fjp
    final void b(Object obj, long j) {
        Object objUnmodifiableList;
        List list = (List) flw.f(obj, j);
        if (list instanceof fjo) {
            objUnmodifiableList = ((fjo) list).e();
        } else if (!c.isAssignableFrom(list.getClass())) {
            if ((list instanceof fkp) && (list instanceof fjf)) {
                if (((fjf) list).a()) {
                    ((fjf) list).b();
                    return;
                }
                return;
            }
            objUnmodifiableList = Collections.unmodifiableList(list);
        } else {
            return;
        }
        flw.a(obj, j, objUnmodifiableList);
    }

    private static List a(Object obj, long j, int i) {
        List arrayList;
        List listC = c(obj, j);
        if (listC.isEmpty()) {
            if (listC instanceof fjo) {
                arrayList = new fjn(i);
            } else if ((listC instanceof fkp) && (listC instanceof fjf)) {
                arrayList = ((fjf) listC).a(i);
            } else {
                arrayList = new ArrayList(i);
            }
            flw.a(obj, j, arrayList);
            return arrayList;
        }
        if (c.isAssignableFrom(listC.getClass())) {
            ArrayList arrayList2 = new ArrayList(listC.size() + i);
            arrayList2.addAll(listC);
            flw.a(obj, j, arrayList2);
            return arrayList2;
        }
        if (listC instanceof flt) {
            fjn fjnVar = new fjn(listC.size() + i);
            fjnVar.addAll((flt) listC);
            flw.a(obj, j, fjnVar);
            return fjnVar;
        }
        if ((listC instanceof fkp) && (listC instanceof fjf) && !((fjf) listC).a()) {
            fjf fjfVarA = ((fjf) listC).a(listC.size() + i);
            flw.a(obj, j, fjfVarA);
            return fjfVarA;
        }
        return listC;
    }

    @Override // flm.fjp
    final void a(Object obj, Object obj2, long j) {
        List listC = c(obj2, j);
        List listA = a(obj, j, listC.size());
        int size = listA.size();
        int size2 = listC.size();
        if (size > 0 && size2 > 0) {
            listA.addAll(listC);
        }
        if (size <= 0) {
            listA = listC;
        }
        flw.a(obj, j, listA);
    }

    private static List c(Object obj, long j) {
        return (List) flw.f(obj, j);
    }
}

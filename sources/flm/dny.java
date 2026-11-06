package flm;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dny {
    public static void a(dok dokVar, dok dokVar2) {
        dom domVarB = dokVar.b();
        while (domVarB.a()) {
            ((dnt) domVarB.b).n = false;
        }
        dom domVarB2 = dokVar2.b();
        while (domVarB2.a()) {
            ((dnp) domVarB2.b).n = false;
        }
    }

    public static void a(dod dodVar, dof dofVar) {
        a(dodVar, dofVar.b, dofVar.a, a(dofVar.c), new dnz());
    }

    public static void a(dod dodVar, dok dokVar, dok dokVar2, Deque deque, dob dobVar) {
        while (!deque.isEmpty()) {
            dnt dntVar = (dnt) deque.removeFirst();
            int iA = dntVar.a(dodVar);
            for (int i = 0; i < iA; i++) {
                int iA2 = dntVar.a(dodVar, i);
                dnt dntVar2 = (dnt) dokVar.b(iA2);
                if (dntVar2 == null) {
                    dntVar2 = (dnt) dokVar2.b(iA2);
                }
                if (dntVar2 != null) {
                    if (!dntVar2.n && !dnt.b(dntVar2) && !dnt.a(dntVar2)) {
                        deque.addLast(dntVar2);
                    }
                    dntVar2.n = true;
                    dobVar.a(dntVar, dntVar2);
                }
            }
        }
    }

    public static Deque a(List list) {
        ArrayDeque arrayDeque = new ArrayDeque();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            dnt dntVar = (dnt) it.next();
            if (!dnt.a(dntVar)) {
                arrayDeque.addLast(dntVar);
            }
        }
        return arrayDeque;
    }
}

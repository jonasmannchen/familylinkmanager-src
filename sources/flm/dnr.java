package flm;

import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dnr implements aif {
    private final dod a;
    private final dof b;

    public static dnr a(dod dodVar, dof dofVar) {
        return new dnr(dodVar, dofVar);
    }

    private dnr(dod dodVar, dof dofVar) {
        this.a = (dod) dse.a(dodVar);
        this.b = (dof) dse.a(dofVar);
    }

    @Override // flm.aif
    public final /* synthetic */ void b(Object obj, Object obj2) {
        ((aik) obj).a((aik) obj2);
    }

    @Override // flm.aif
    public final /* synthetic */ Iterable b(Object obj) {
        aik aikVar = (aik) obj;
        if (aikVar instanceof doh) {
            return aikVar.b();
        }
        if (aikVar instanceof dnt) {
            dnt dntVar = (dnt) aikVar;
            int iA = dntVar.a(this.a);
            ArrayList arrayList = new ArrayList(iA);
            for (int i = 0; i < iA; i++) {
                int iA2 = dntVar.a(this.a, i);
                dnt dntVar2 = (dnt) this.b.b.b(iA2);
                if (dntVar2 == null) {
                    dntVar2 = (dnt) this.b.a.b(iA2);
                }
                if (dntVar2 != null && !dnt.a(dntVar)) {
                    arrayList.add(dntVar2);
                }
            }
            return arrayList;
        }
        return Collections.emptyList();
    }

    @Override // flm.aif
    public final /* synthetic */ Object a(Object obj) {
        return ((aik) obj).a();
    }

    @Override // flm.aif
    public final /* synthetic */ void a(Object obj, Object obj2) {
        ((aik) obj).a(obj2);
    }
}

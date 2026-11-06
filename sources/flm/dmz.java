package flm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class dmz {
    dmz() {
    }

    abstract fke a(fke fkeVar, fke fkeVar2);

    abstract fke a(String str, Object obj);

    abstract String a(fke fkeVar);

    public final List a(List list, List list2) {
        fke fkeVar;
        if (list.isEmpty()) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            fke fkeVar2 = (fke) it.next();
            String strA = a(fkeVar2);
            Iterator it2 = list2.iterator();
            do {
                if (!it2.hasNext()) {
                    fkeVar = null;
                    break;
                }
                fkeVar = (fke) it2.next();
            } while (!strA.equals(a(fkeVar)));
            fke fkeVarA = a(fkeVar2, fkeVar);
            if (fkeVarA != null) {
                arrayList.add(fkeVarA);
            }
        }
        return arrayList;
    }

    final List a(Map map) {
        fke fkeVarA;
        if (map == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getValue() != null && (fkeVarA = a((String) entry.getKey(), entry.getValue())) != null) {
                arrayList.add(fkeVarA);
            }
        }
        return arrayList;
    }
}

package flm;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class p {
    public final Map a = new HashMap();
    public final Map b;

    p(Map map) {
        this.b = map;
        for (Map.Entry entry : map.entrySet()) {
            y yVar = (y) entry.getValue();
            List arrayList = (List) this.a.get(yVar);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.a.put(yVar, arrayList);
            }
            arrayList.add(entry.getKey());
        }
    }

    static void a(List list, af afVar, y yVar, Object obj) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                q qVar = (q) list.get(size);
                try {
                    switch (qVar.a) {
                        case bbx.MSG_UNBIND_SERVICE /* 0 */:
                            qVar.b.invoke(obj, new Object[0]);
                            break;
                        case 1:
                            qVar.b.invoke(obj, afVar);
                            break;
                        case 2:
                            qVar.b.invoke(obj, afVar, yVar);
                            break;
                    }
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                } catch (InvocationTargetException e2) {
                    throw new RuntimeException("Failed to call observer method", e2.getCause());
                }
            }
        }
    }
}

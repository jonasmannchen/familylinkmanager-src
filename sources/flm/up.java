package flm;

import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class up {
    public final sk a = new sl(10);
    public final so b = new so();
    public final ArrayList c = new ArrayList();
    public final HashSet d = new HashSet();

    public final void a(Object obj) {
        if (!this.b.containsKey(obj)) {
            this.b.put(obj, null);
        }
    }

    public final void a(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (!arrayList.contains(obj)) {
            if (hashSet.contains(obj)) {
                throw new RuntimeException("This graph contains cyclic dependencies");
            }
            hashSet.add(obj);
            ArrayList arrayList2 = (ArrayList) this.b.get(obj);
            if (arrayList2 != null) {
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    a(arrayList2.get(i), arrayList, hashSet);
                }
            }
            hashSet.remove(obj);
            arrayList.add(obj);
        }
    }
}

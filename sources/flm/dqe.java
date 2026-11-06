package flm;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dqe implements dqb {
    private final List a;
    private final List b;

    public dqe(List list, List list2) {
        this.a = new ArrayList(list);
        this.b = new ArrayList(list2);
    }

    @Override // flm.dqb
    public final dpz a() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            arrayList.add(((dqb) it.next()).a());
        }
        arrayList.addAll(this.b);
        return arrayList.size() == 1 ? (dpz) arrayList.get(0) : new dqg(arrayList);
    }
}

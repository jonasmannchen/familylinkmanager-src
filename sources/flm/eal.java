package flm;

import java.io.Serializable;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class eal extends dwo implements Serializable {
    public final NavigableMap a;
    private transient Set b;
    private transient dzs c;

    public static eal c() {
        return new eal(new TreeMap());
    }

    eal(NavigableMap navigableMap) {
        this.a = navigableMap;
    }

    @Override // flm.dzs
    public final Set a() {
        Set set = this.b;
        if (set != null) {
            return set;
        }
        eam eamVar = new eam(this.a.values());
        this.b = eamVar;
        return eamVar;
    }

    @Override // flm.dwo, flm.dzs
    public final dzq b(Comparable comparable) {
        dvl.a(comparable);
        Map.Entry entryFloorEntry = this.a.floorEntry(dws.b(comparable));
        if (entryFloorEntry == null || !((dzq) entryFloorEntry.getValue()).a(comparable)) {
            return null;
        }
        return (dzq) entryFloorEntry.getValue();
    }

    @Override // flm.dwo, flm.dzs
    public void a(dzq dzqVar) {
        dvl.a(dzqVar);
        if (!dzqVar.c()) {
            dws dwsVar = dzqVar.b;
            dws dwsVar2 = dzqVar.c;
            Map.Entry entryLowerEntry = this.a.lowerEntry(dwsVar);
            if (entryLowerEntry != null) {
                dzq dzqVar2 = (dzq) entryLowerEntry.getValue();
                if (dzqVar2.c.compareTo(dwsVar) >= 0) {
                    if (dzqVar2.c.compareTo(dwsVar2) >= 0) {
                        dwsVar2 = dzqVar2.c;
                    }
                    dwsVar = dzqVar2.b;
                }
            }
            Map.Entry entryFloorEntry = this.a.floorEntry(dwsVar2);
            if (entryFloorEntry != null) {
                dzq dzqVar3 = (dzq) entryFloorEntry.getValue();
                if (dzqVar3.c.compareTo(dwsVar2) >= 0) {
                    dwsVar2 = dzqVar3.c;
                }
            }
            this.a.subMap(dwsVar, dwsVar2).clear();
            c(dzq.a(dwsVar, dwsVar2));
        }
    }

    @Override // flm.dwo
    public void b(dzq dzqVar) {
        dvl.a(dzqVar);
        if (!dzqVar.c()) {
            Map.Entry entryLowerEntry = this.a.lowerEntry(dzqVar.b);
            if (entryLowerEntry != null) {
                dzq dzqVar2 = (dzq) entryLowerEntry.getValue();
                if (dzqVar2.c.compareTo(dzqVar.b) >= 0) {
                    if (dzqVar.b() && dzqVar2.c.compareTo(dzqVar.c) >= 0) {
                        c(dzq.a(dzqVar.c, dzqVar2.c));
                    }
                    c(dzq.a(dzqVar2.b, dzqVar.b));
                }
            }
            Map.Entry entryFloorEntry = this.a.floorEntry(dzqVar.c);
            if (entryFloorEntry != null) {
                dzq dzqVar3 = (dzq) entryFloorEntry.getValue();
                if (dzqVar.b() && dzqVar3.c.compareTo(dzqVar.c) >= 0) {
                    c(dzq.a(dzqVar.c, dzqVar3.c));
                }
            }
            this.a.subMap(dzqVar.b, dzqVar.c).clear();
        }
    }

    private final void c(dzq dzqVar) {
        if (dzqVar.c()) {
            this.a.remove(dzqVar.b);
        } else {
            this.a.put(dzqVar.b, dzqVar);
        }
    }

    @Override // flm.dzs
    public dzs b() {
        dzs dzsVar = this.c;
        if (dzsVar != null) {
            return dzsVar;
        }
        ean eanVar = new ean(this);
        this.c = eanVar;
        return eanVar;
    }

    @Override // flm.dwo
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // flm.dwo, flm.dzs
    public final /* bridge */ /* synthetic */ void a(Iterable iterable) {
        super.a(iterable);
    }

    @Override // flm.dwo, flm.dzs
    public final /* bridge */ /* synthetic */ void a(dzs dzsVar) {
        super.a(dzsVar);
    }

    @Override // flm.dwo, flm.dzs
    public /* bridge */ /* synthetic */ boolean a(Comparable comparable) {
        return super.a(comparable);
    }
}

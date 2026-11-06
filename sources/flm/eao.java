package flm;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class eao extends dwm {
    public final dzq a;
    private final NavigableMap b;
    private final NavigableMap c;

    eao(NavigableMap navigableMap) {
        this(navigableMap, dzq.a);
    }

    private eao(NavigableMap navigableMap, dzq dzqVar) {
        this.b = navigableMap;
        this.c = new ear(navigableMap);
        this.a = dzqVar;
    }

    private final NavigableMap a(dzq dzqVar) {
        if (!this.a.a(dzqVar)) {
            return dya.a;
        }
        return new eao(this.b, dzqVar.b(this.a));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.NavigableMap
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final NavigableMap tailMap(dws dwsVar, boolean z) {
        return a(dzq.b((Comparable) dwsVar, dwp.a(z)));
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return dzm.a;
    }

    @Override // flm.dzf
    final Iterator b() {
        Collection collectionValues;
        dws dwsVar;
        if (this.a.a()) {
            collectionValues = this.c.tailMap((dws) this.a.b.c(), this.a.b.a() == dwp.CLOSED).values();
        } else {
            collectionValues = this.c.values();
        }
        dzp dzpVarC = dyn.c(collectionValues.iterator());
        if (this.a.a((Comparable) dwv.b) && (!dzpVarC.hasNext() || ((dzq) dzpVarC.a()).b != dwv.b)) {
            dwsVar = dwv.b;
        } else if (dzpVarC.hasNext()) {
            dwsVar = ((dzq) dzpVarC.next()).c;
        } else {
            return dyr.a;
        }
        return new eap(this, dwsVar, dzpVarC);
    }

    @Override // flm.dwm
    final Iterator a() {
        dws dwsVar;
        dws dwsVar2;
        if (this.a.b()) {
            dwsVar = (dws) this.a.c.c();
        } else {
            dwsVar = dwt.b;
        }
        dzp dzpVarC = dyn.c(this.c.headMap(dwsVar, this.a.b() && this.a.c.b() == dwp.CLOSED).descendingMap().values().iterator());
        if (dzpVarC.hasNext()) {
            if (((dzq) dzpVarC.a()).c == dwt.b) {
                dwsVar2 = ((dzq) dzpVarC.next()).b;
            } else {
                dwsVar2 = (dws) this.b.higherKey(((dzq) dzpVarC.a()).c);
            }
        } else {
            if (!this.a.a((Comparable) dwv.b) || this.b.containsKey(dwv.b)) {
                return dyr.a;
            }
            dwsVar2 = (dws) this.b.higherKey(dwv.b);
        }
        return new eaq(this, (dws) dve.a(dwsVar2, dwt.b), dzpVarC);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return dyn.a(b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final dzq get(Object obj) {
        if (obj instanceof dws) {
            try {
                dws dwsVar = (dws) obj;
                Map.Entry entryFirstEntry = tailMap(dwsVar, true).firstEntry();
                if (entryFirstEntry != null && ((dws) entryFirstEntry.getKey()).equals(dwsVar)) {
                    return (dzq) entryFirstEntry.getValue();
                }
            } catch (ClassCastException e) {
                return null;
            }
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return ((dzq) get(obj)) != null;
    }

    @Override // java.util.NavigableMap
    public final /* synthetic */ NavigableMap headMap(Object obj, boolean z) {
        return a(dzq.a((Comparable) obj, dwp.a(z)));
    }

    @Override // java.util.NavigableMap
    public final /* synthetic */ NavigableMap subMap(Object obj, boolean z, Object obj2, boolean z2) {
        return a(dzq.a((dws) obj, dwp.a(z), (dws) obj2, dwp.a(z2)));
    }
}

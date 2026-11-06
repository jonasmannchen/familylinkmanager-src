package flm;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ear extends dwm {
    public final dzq a;
    private final NavigableMap b;

    ear(NavigableMap navigableMap) {
        this.b = navigableMap;
        this.a = dzq.a;
    }

    private ear(NavigableMap navigableMap, dzq dzqVar) {
        this.b = navigableMap;
        this.a = dzqVar;
    }

    private final NavigableMap a(dzq dzqVar) {
        if (dzqVar.a(this.a)) {
            return new ear(this.b, dzqVar.b(this.a));
        }
        return dya.a;
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return dzm.a;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return ((dzq) get(obj)) != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final dzq get(Object obj) {
        if (obj instanceof dws) {
            try {
                dws dwsVar = (dws) obj;
                if (!this.a.a((Comparable) dwsVar)) {
                    return null;
                }
                Map.Entry entryLowerEntry = this.b.lowerEntry(dwsVar);
                if (entryLowerEntry != null && ((dzq) entryLowerEntry.getValue()).c.equals(dwsVar)) {
                    return (dzq) entryLowerEntry.getValue();
                }
            } catch (ClassCastException e) {
                return null;
            }
        }
        return null;
    }

    @Override // flm.dzf
    final Iterator b() {
        Map.Entry entryLowerEntry;
        Iterator it;
        if (!this.a.a() || (entryLowerEntry = this.b.lowerEntry((dws) this.a.b.c())) == null) {
            it = this.b.values().iterator();
        } else if (this.a.b.a((Comparable) ((dzq) entryLowerEntry.getValue()).c)) {
            it = this.b.tailMap((dws) entryLowerEntry.getKey(), true).values().iterator();
        } else {
            it = this.b.tailMap((dws) this.a.b.c(), true).values().iterator();
        }
        return new eas(this, it);
    }

    @Override // flm.dwm
    final Iterator a() {
        Collection collectionValues;
        if (this.a.b()) {
            collectionValues = this.b.headMap((dws) this.a.c.c(), false).descendingMap().values();
        } else {
            collectionValues = this.b.descendingMap().values();
        }
        dzp dzpVarC = dyn.c(collectionValues.iterator());
        if (dzpVarC.hasNext() && this.a.c.a((Comparable) ((dzq) dzpVarC.a()).c)) {
            dzpVarC.next();
        }
        return new eat(this, dzpVarC);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.a.equals(dzq.a) ? this.b.size() : dyn.a(b());
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        if (this.a.equals(dzq.a)) {
            return this.b.isEmpty();
        }
        return !b().hasNext();
    }

    @Override // java.util.NavigableMap
    public final /* synthetic */ NavigableMap tailMap(Object obj, boolean z) {
        return a(dzq.b((Comparable) obj, dwp.a(z)));
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

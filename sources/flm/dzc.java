package flm;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
abstract class dzc extends dxc implements NavigableMap {
    private transient Comparator a;
    private transient Set b;
    private transient NavigableSet c;

    dzc() {
    }

    abstract NavigableMap a();

    abstract Iterator k_();

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.dxc
    /* JADX INFO: renamed from: c */
    public final Map b() {
        return a();
    }

    @Override // java.util.SortedMap
    public Comparator comparator() {
        Comparator comparator = this.a;
        if (comparator == null) {
            Comparator comparator2 = a().comparator();
            if (comparator2 == null) {
                comparator2 = dzm.a;
            }
            dzo dzoVarA = dzo.a(comparator2).a();
            this.a = dzoVarA;
            return dzoVarA;
        }
        return comparator;
    }

    @Override // java.util.SortedMap
    public Object firstKey() {
        return a().lastKey();
    }

    @Override // java.util.SortedMap
    public Object lastKey() {
        return a().firstKey();
    }

    @Override // java.util.NavigableMap
    public Map.Entry lowerEntry(Object obj) {
        return a().higherEntry(obj);
    }

    @Override // java.util.NavigableMap
    public Object lowerKey(Object obj) {
        return a().higherKey(obj);
    }

    @Override // java.util.NavigableMap
    public Map.Entry floorEntry(Object obj) {
        return a().ceilingEntry(obj);
    }

    @Override // java.util.NavigableMap
    public Object floorKey(Object obj) {
        return a().ceilingKey(obj);
    }

    @Override // java.util.NavigableMap
    public Map.Entry ceilingEntry(Object obj) {
        return a().floorEntry(obj);
    }

    @Override // java.util.NavigableMap
    public Object ceilingKey(Object obj) {
        return a().floorKey(obj);
    }

    @Override // java.util.NavigableMap
    public Map.Entry higherEntry(Object obj) {
        return a().lowerEntry(obj);
    }

    @Override // java.util.NavigableMap
    public Object higherKey(Object obj) {
        return a().lowerKey(obj);
    }

    @Override // java.util.NavigableMap
    public Map.Entry firstEntry() {
        return a().lastEntry();
    }

    @Override // java.util.NavigableMap
    public Map.Entry lastEntry() {
        return a().firstEntry();
    }

    @Override // java.util.NavigableMap
    public Map.Entry pollFirstEntry() {
        return a().pollLastEntry();
    }

    @Override // java.util.NavigableMap
    public Map.Entry pollLastEntry() {
        return a().pollFirstEntry();
    }

    @Override // java.util.NavigableMap
    public NavigableMap descendingMap() {
        return a();
    }

    @Override // flm.dxc, java.util.Map
    public Set entrySet() {
        Set set = this.b;
        if (set != null) {
            return set;
        }
        dzd dzdVar = new dzd(this);
        this.b = dzdVar;
        return dzdVar;
    }

    @Override // flm.dxc, java.util.Map
    public Set keySet() {
        return navigableKeySet();
    }

    @Override // java.util.NavigableMap
    public NavigableSet navigableKeySet() {
        NavigableSet navigableSet = this.c;
        if (navigableSet != null) {
            return navigableSet;
        }
        dzi dziVar = new dzi(this);
        this.c = dziVar;
        return dziVar;
    }

    @Override // java.util.NavigableMap
    public NavigableSet descendingKeySet() {
        return a().navigableKeySet();
    }

    @Override // java.util.NavigableMap
    public NavigableMap subMap(Object obj, boolean z, Object obj2, boolean z2) {
        return a().subMap(obj2, z2, obj, z).descendingMap();
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public SortedMap subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    @Override // java.util.NavigableMap
    public NavigableMap headMap(Object obj, boolean z) {
        return a().tailMap(obj, z).descendingMap();
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public SortedMap headMap(Object obj) {
        return headMap(obj, false);
    }

    @Override // java.util.NavigableMap
    public NavigableMap tailMap(Object obj, boolean z) {
        return a().headMap(obj, z).descendingMap();
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public SortedMap tailMap(Object obj) {
        return tailMap(obj, true);
    }

    @Override // flm.dxc, java.util.Map
    public Collection values() {
        return new dzk(this);
    }

    @Override // flm.dxd
    public String toString() {
        return dyz.a(this);
    }

    @Override // flm.dxc, flm.dxd
    protected final /* synthetic */ Object b() {
        return b();
    }
}

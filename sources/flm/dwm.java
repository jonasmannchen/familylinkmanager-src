package flm;

import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
abstract class dwm extends dzf implements NavigableMap {
    dwm() {
    }

    abstract Iterator a();

    @Override // java.util.NavigableMap
    public Map.Entry firstEntry() {
        return (Map.Entry) dyn.a(b(), (Object) null);
    }

    @Override // java.util.NavigableMap
    public Map.Entry lastEntry() {
        return (Map.Entry) dyn.a(a(), (Object) null);
    }

    @Override // java.util.NavigableMap
    public Map.Entry pollFirstEntry() {
        return (Map.Entry) dyn.b(b());
    }

    @Override // java.util.NavigableMap
    public Map.Entry pollLastEntry() {
        return (Map.Entry) dyn.b(a());
    }

    @Override // java.util.SortedMap
    public Object firstKey() {
        Map.Entry entryFirstEntry = firstEntry();
        if (entryFirstEntry == null) {
            throw new NoSuchElementException();
        }
        return entryFirstEntry.getKey();
    }

    @Override // java.util.SortedMap
    public Object lastKey() {
        Map.Entry entryLastEntry = lastEntry();
        if (entryLastEntry == null) {
            throw new NoSuchElementException();
        }
        return entryLastEntry.getKey();
    }

    @Override // java.util.NavigableMap
    public Map.Entry lowerEntry(Object obj) {
        return headMap(obj, false).lastEntry();
    }

    @Override // java.util.NavigableMap
    public Map.Entry floorEntry(Object obj) {
        return headMap(obj, true).lastEntry();
    }

    @Override // java.util.NavigableMap
    public Map.Entry ceilingEntry(Object obj) {
        return tailMap(obj, true).firstEntry();
    }

    @Override // java.util.NavigableMap
    public Map.Entry higherEntry(Object obj) {
        return tailMap(obj, false).firstEntry();
    }

    @Override // java.util.NavigableMap
    public Object lowerKey(Object obj) {
        return dyz.a(lowerEntry(obj));
    }

    @Override // java.util.NavigableMap
    public Object floorKey(Object obj) {
        return dyz.a(floorEntry(obj));
    }

    @Override // java.util.NavigableMap
    public Object ceilingKey(Object obj) {
        return dyz.a(ceilingEntry(obj));
    }

    @Override // java.util.NavigableMap
    public Object higherKey(Object obj) {
        return dyz.a(higherEntry(obj));
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public SortedMap subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public SortedMap headMap(Object obj) {
        return headMap(obj, false);
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public SortedMap tailMap(Object obj) {
        return tailMap(obj, true);
    }

    @Override // java.util.NavigableMap
    public NavigableSet navigableKeySet() {
        return new dzi(this);
    }

    @Override // java.util.AbstractMap, java.util.Map, java.util.SortedMap
    public Set keySet() {
        return navigableKeySet();
    }

    @Override // java.util.NavigableMap
    public NavigableSet descendingKeySet() {
        return descendingMap().navigableKeySet();
    }

    @Override // java.util.NavigableMap
    public NavigableMap descendingMap() {
        return new dwn(this);
    }
}

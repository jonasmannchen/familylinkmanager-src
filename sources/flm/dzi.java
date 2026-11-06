package flm;

import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dzi extends dzj implements NavigableSet {
    dzi(NavigableMap navigableMap) {
        super(navigableMap);
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object obj) {
        return ((NavigableMap) this.a).lowerKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        return ((NavigableMap) this.a).floorKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        return ((NavigableMap) this.a).ceilingKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        return ((NavigableMap) this.a).higherKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        return dyz.a(((NavigableMap) this.a).pollFirstEntry());
    }

    @Override // java.util.NavigableSet
    public final Object pollLast() {
        return dyz.a(((NavigableMap) this.a).pollLastEntry());
    }

    @Override // java.util.NavigableSet
    public final NavigableSet descendingSet() {
        return ((NavigableMap) this.a).descendingKeySet();
    }

    @Override // java.util.NavigableSet
    public final Iterator descendingIterator() {
        return descendingSet().iterator();
    }

    @Override // java.util.NavigableSet
    public final NavigableSet subSet(Object obj, boolean z, Object obj2, boolean z2) {
        return ((NavigableMap) this.a).subMap(obj, z, obj2, z2).navigableKeySet();
    }

    @Override // flm.dzj, java.util.SortedSet, java.util.NavigableSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z) {
        return ((NavigableMap) this.a).headMap(obj, z).navigableKeySet();
    }

    @Override // flm.dzj, java.util.SortedSet, java.util.NavigableSet
    public final SortedSet headSet(Object obj) {
        return headSet(obj, false);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z) {
        return ((NavigableMap) this.a).tailMap(obj, z).navigableKeySet();
    }

    @Override // flm.dzj, java.util.SortedSet, java.util.NavigableSet
    public final SortedSet tailSet(Object obj) {
        return tailSet(obj, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // flm.dzj
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ SortedMap a() {
        return (NavigableMap) this.a;
    }

    @Override // flm.dzj, flm.dzh
    final /* synthetic */ Map a() {
        return (NavigableMap) this.a;
    }
}

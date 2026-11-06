package flm;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
class dzj extends dzh implements SortedSet {
    dzj(SortedMap sortedMap) {
        super(sortedMap);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // flm.dzh
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public SortedMap a() {
        return (SortedMap) super.a();
    }

    @Override // java.util.SortedSet
    public Comparator comparator() {
        return a().comparator();
    }

    public SortedSet subSet(Object obj, Object obj2) {
        return new dzj(a().subMap(obj, obj2));
    }

    public SortedSet headSet(Object obj) {
        return new dzj(a().headMap(obj));
    }

    public SortedSet tailSet(Object obj) {
        return new dzj(a().tailMap(obj));
    }

    @Override // java.util.SortedSet
    public Object first() {
        return a().firstKey();
    }

    @Override // java.util.SortedSet
    public Object last() {
        return a().lastKey();
    }
}

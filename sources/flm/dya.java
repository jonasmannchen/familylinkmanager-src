package flm;

import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dya extends dyf implements NavigableMap {
    public static final dya a = new dya(dyg.a((Comparator) dzm.a), dxm.g());
    public static final long serialVersionUID = 0;
    public final transient eab b;
    public final transient dxm c;
    private transient dya d;

    static dya a(Comparator comparator) {
        return dzm.a.equals(comparator) ? a : new dya(dyg.a(comparator), dxm.g());
    }

    dya(eab eabVar, dxm dxmVar) {
        this(eabVar, dxmVar, null);
    }

    private dya(eab eabVar, dxm dxmVar, dya dyaVar) {
        this.b = eabVar;
        this.c = dxmVar;
        this.d = dyaVar;
    }

    @Override // java.util.Map
    public final int size() {
        return this.c.size();
    }

    @Override // flm.dxs, java.util.Map
    public final Object get(Object obj) {
        int iA = this.b.a(obj);
        if (iA == -1) {
            return null;
        }
        return this.c.get(iA);
    }

    @Override // flm.dxs
    final boolean h() {
        return this.b.f() || this.c.f();
    }

    @Override // flm.dxs
    final dxx e() {
        return isEmpty() ? eaa.a : new dyb(this);
    }

    @Override // flm.dxs
    final dxx g() {
        throw new AssertionError("should never be called");
    }

    @Override // flm.dxs
    /* JADX INFO: renamed from: c */
    public final dxi values() {
        return this.c;
    }

    @Override // flm.dxs
    final dxi b() {
        throw new AssertionError("should never be called");
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return ((dyg) keySet()).comparator();
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return ((dyg) keySet()).first();
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return ((dyg) keySet()).last();
    }

    private final dya a(int i, int i2) {
        if (i != 0 || i2 != size()) {
            if (i == i2) {
                return a(comparator());
            }
            return new dya(this.b.a(i, i2), (dxm) this.c.subList(i, i2));
        }
        return this;
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lowerEntry(Object obj) {
        return ((dya) headMap(obj, false)).lastEntry();
    }

    @Override // java.util.NavigableMap
    public final Object lowerKey(Object obj) {
        return dyz.a(lowerEntry(obj));
    }

    @Override // java.util.NavigableMap
    public final Map.Entry floorEntry(Object obj) {
        return ((dya) headMap(obj, true)).lastEntry();
    }

    @Override // java.util.NavigableMap
    public final Object floorKey(Object obj) {
        return dyz.a(floorEntry(obj));
    }

    @Override // java.util.NavigableMap
    public final Map.Entry ceilingEntry(Object obj) {
        return ((dya) tailMap(obj, true)).firstEntry();
    }

    @Override // java.util.NavigableMap
    public final Object ceilingKey(Object obj) {
        return dyz.a(ceilingEntry(obj));
    }

    @Override // java.util.NavigableMap
    public final Map.Entry higherEntry(Object obj) {
        return ((dya) tailMap(obj, false)).firstEntry();
    }

    @Override // java.util.NavigableMap
    public final Object higherKey(Object obj) {
        return dyz.a(higherEntry(obj));
    }

    @Override // java.util.NavigableMap
    public final Map.Entry firstEntry() {
        if (isEmpty()) {
            return null;
        }
        return (Map.Entry) ((dxx) entrySet()).e().get(0);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lastEntry() {
        if (isEmpty()) {
            return null;
        }
        return (Map.Entry) ((dxx) entrySet()).e().get(size() - 1);
    }

    @Override // java.util.NavigableMap
    @Deprecated
    public final Map.Entry pollFirstEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableMap
    @Deprecated
    public final Map.Entry pollLastEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // flm.dxs
    final Object writeReplace() {
        return new dye(this);
    }

    @Override // flm.dxs
    /* JADX INFO: renamed from: f */
    public final /* synthetic */ dxx keySet() {
        return (dyg) keySet();
    }

    @Override // flm.dxs, java.util.Map
    public final /* synthetic */ Set entrySet() {
        return entrySet();
    }

    @Override // flm.dxs, java.util.Map
    public final /* synthetic */ Collection values() {
        return values();
    }

    @Override // flm.dxs, java.util.Map
    public final /* synthetic */ Set keySet() {
        return this.b;
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final /* synthetic */ SortedMap tailMap(Object obj) {
        return (dya) tailMap(obj, true);
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final /* synthetic */ SortedMap headMap(Object obj) {
        return (dya) headMap(obj, false);
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final /* synthetic */ SortedMap subMap(Object obj, Object obj2) {
        return (dya) subMap(obj, true, obj2, false);
    }

    @Override // java.util.NavigableMap
    public final /* synthetic */ NavigableMap tailMap(Object obj, boolean z) {
        return a(this.b.d(dvl.a(obj), z), size());
    }

    @Override // java.util.NavigableMap
    public final /* synthetic */ NavigableMap headMap(Object obj, boolean z) {
        return a(0, this.b.c(dvl.a(obj), z));
    }

    @Override // java.util.NavigableMap
    public final /* synthetic */ NavigableMap subMap(Object obj, boolean z, Object obj2, boolean z2) {
        dvl.a(obj);
        dvl.a(obj2);
        dvl.a(comparator().compare(obj, obj2) <= 0, "expected fromKey <= toKey but %s > %s", obj, obj2);
        return (dya) ((dya) headMap(obj2, z2)).tailMap(obj, z);
    }

    @Override // java.util.NavigableMap
    public final /* synthetic */ NavigableSet descendingKeySet() {
        return (dyg) this.b.descendingSet();
    }

    @Override // java.util.NavigableMap
    public final /* synthetic */ NavigableSet navigableKeySet() {
        return this.b;
    }

    @Override // java.util.NavigableMap
    public final /* synthetic */ NavigableMap descendingMap() {
        dya dyaVar = this.d;
        if (dyaVar == null) {
            if (isEmpty()) {
                return a(dzo.a(comparator()).a());
            }
            return new dya((eab) ((dyg) this.b.descendingSet()), this.c.h(), this);
        }
        return dyaVar;
    }
}

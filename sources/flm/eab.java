package flm;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class eab extends dyg {
    public static final eab b = new eab(dxm.g(), dzm.a);
    private final transient dxm c;

    eab(dxm dxmVar, Comparator comparator) {
        super(comparator);
        this.c = dxmVar;
    }

    @Override // flm.dxi
    final Object[] b() {
        return this.c.b();
    }

    @Override // flm.dxi
    final int c() {
        return this.c.c();
    }

    @Override // flm.dxi
    final int d() {
        return this.c.d();
    }

    @Override // flm.dxi
    /* JADX INFO: renamed from: a */
    public final eau iterator() {
        return (eau) this.c.iterator();
    }

    @Override // flm.dyg
    /* JADX INFO: renamed from: j */
    public final eau descendingIterator() {
        return (eau) this.c.h().iterator();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.c.size();
    }

    @Override // flm.dxi, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return Collections.binarySearch(this.c, obj, this.a) >= 0;
        } catch (ClassCastException e) {
            return false;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        if (collection instanceof dzl) {
            collection = ((dzl) collection).a();
        }
        if (!eai.a(comparator(), collection) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        eau eauVar = (eau) iterator();
        Iterator it = collection.iterator();
        if (!eauVar.hasNext()) {
            return false;
        }
        Object next = it.next();
        Object next2 = eauVar.next();
        while (true) {
            try {
                int iA = a(next2, next);
                if (iA < 0) {
                    if (!eauVar.hasNext()) {
                        return false;
                    }
                    next2 = eauVar.next();
                } else if (iA == 0) {
                    if (!it.hasNext()) {
                        return true;
                    }
                    next = it.next();
                } else if (iA > 0) {
                    return false;
                }
            } catch (ClassCastException | NullPointerException e) {
                return false;
            }
        }
    }

    @Override // flm.dxi
    final boolean f() {
        return this.c.f();
    }

    @Override // flm.dxi
    final int a(Object[] objArr, int i) {
        return this.c.a(objArr, i);
    }

    @Override // flm.dxx, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        if (size() != set.size()) {
            return false;
        }
        if (isEmpty()) {
            return true;
        }
        if (eai.a(this.a, set)) {
            Iterator it = set.iterator();
            try {
                eau eauVar = (eau) iterator();
                while (eauVar.hasNext()) {
                    Object next = eauVar.next();
                    Object next2 = it.next();
                    if (next2 == null || a(next, next2) != 0) {
                        return false;
                    }
                }
                return true;
            } catch (ClassCastException e) {
                return false;
            } catch (NoSuchElementException e2) {
                return false;
            }
        }
        return containsAll(set);
    }

    @Override // flm.dyg, java.util.SortedSet
    public final Object first() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.c.get(0);
    }

    @Override // flm.dyg, java.util.SortedSet
    public final Object last() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.c.get(size() - 1);
    }

    @Override // flm.dyg, java.util.NavigableSet
    public final Object lower(Object obj) {
        int iC = c(obj, false) - 1;
        if (iC == -1) {
            return null;
        }
        return this.c.get(iC);
    }

    @Override // flm.dyg, java.util.NavigableSet
    public final Object floor(Object obj) {
        int iC = c(obj, true) - 1;
        if (iC == -1) {
            return null;
        }
        return this.c.get(iC);
    }

    @Override // flm.dyg, java.util.NavigableSet
    public final Object ceiling(Object obj) {
        int iD = d(obj, true);
        if (iD == size()) {
            return null;
        }
        return this.c.get(iD);
    }

    @Override // flm.dyg, java.util.NavigableSet
    public final Object higher(Object obj) {
        int iD = d(obj, false);
        if (iD == size()) {
            return null;
        }
        return this.c.get(iD);
    }

    @Override // flm.dyg
    final dyg a(Object obj, boolean z) {
        return a(0, c(obj, z));
    }

    final int c(Object obj, boolean z) {
        int iBinarySearch = Collections.binarySearch(this.c, dvl.a(obj), comparator());
        if (iBinarySearch >= 0) {
            return z ? iBinarySearch + 1 : iBinarySearch;
        }
        return iBinarySearch ^ (-1);
    }

    @Override // flm.dyg
    final dyg a(Object obj, boolean z, Object obj2, boolean z2) {
        return b(obj, z).a(obj2, z2);
    }

    @Override // flm.dyg
    final dyg b(Object obj, boolean z) {
        return a(d(obj, z), size());
    }

    final int d(Object obj, boolean z) {
        int iBinarySearch = Collections.binarySearch(this.c, dvl.a(obj), comparator());
        if (iBinarySearch >= 0) {
            if (!z) {
                return iBinarySearch + 1;
            }
            return iBinarySearch;
        }
        return iBinarySearch ^ (-1);
    }

    final eab a(int i, int i2) {
        if (i != 0 || i2 != size()) {
            if (i < i2) {
                return new eab((dxm) this.c.subList(i, i2), this.a);
            }
            return a(this.a);
        }
        return this;
    }

    @Override // flm.dyg
    final int a(Object obj) {
        if (obj == null) {
            return -1;
        }
        try {
            int iBinarySearch = Collections.binarySearch(this.c, obj, this.a);
            if (iBinarySearch >= 0) {
                return iBinarySearch;
            }
            return -1;
        } catch (ClassCastException e) {
            return -1;
        }
    }

    @Override // flm.dxx, flm.dxi
    public final dxm e() {
        return this.c;
    }

    @Override // flm.dyg
    final dyg g() {
        Comparator comparatorReverseOrder = Collections.reverseOrder(this.a);
        if (isEmpty()) {
            return a(comparatorReverseOrder);
        }
        return new eab(this.c.h(), comparatorReverseOrder);
    }

    @Override // flm.dyg, java.util.NavigableSet
    public final /* synthetic */ Iterator descendingIterator() {
        return descendingIterator();
    }

    @Override // flm.dyg, flm.dxx, flm.dxi, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return iterator();
    }
}

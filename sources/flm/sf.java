package flm;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class sf implements Set {
    private final /* synthetic */ sc a;

    sf(sc scVar) {
        this.a = scVar;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.a.c();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.a.a(obj) >= 0;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Map mapB = this.a.b();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!mapB.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.a.a() == 0;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new sd(this.a, 0);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        int iA = this.a.a(obj);
        if (iA < 0) {
            return false;
        }
        this.a.a(iA);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        Map mapB = this.a.b();
        int size = mapB.size();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            mapB.remove(it.next());
        }
        return size != mapB.size();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        return sc.a(this.a.b(), collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.a.a();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return this.a.b(0);
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return this.a.a(objArr, 0);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        return sc.a((Set) this, obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        int iHashCode = 0;
        for (int iA = this.a.a() - 1; iA >= 0; iA--) {
            Object objA = this.a.a(iA, 0);
            iHashCode += objA == null ? 0 : objA.hashCode();
        }
        return iHashCode;
    }
}

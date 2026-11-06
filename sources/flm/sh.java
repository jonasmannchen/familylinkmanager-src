package flm;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class sh implements Collection {
    private final /* synthetic */ sc a;

    sh(sc scVar) {
        this.a = scVar;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final void clear() {
        this.a.c();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.a.b(obj) >= 0;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.a.a() == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new sd(this.a, 1);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        int iB = this.a.b(obj);
        if (iB < 0) {
            return false;
        }
        this.a.a(iB);
        return true;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i = 0;
        int iA = this.a.a();
        boolean z = false;
        while (i < iA) {
            if (collection.contains(this.a.a(i, 1))) {
                this.a.a(i);
                i--;
                iA--;
                z = true;
            }
            i++;
        }
        return z;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i = 0;
        int iA = this.a.a();
        boolean z = false;
        while (i < iA) {
            if (!collection.contains(this.a.a(i, 1))) {
                this.a.a(i);
                i--;
                iA--;
                z = true;
            }
            i++;
        }
        return z;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.a.a();
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return this.a.b(1);
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return this.a.a(objArr, 1);
    }
}

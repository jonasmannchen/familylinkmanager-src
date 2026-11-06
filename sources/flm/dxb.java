package flm;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class dxb extends dxd implements Collection {
    protected dxb() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.dxd
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public abstract Collection b();

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return b().iterator();
    }

    @Override // java.util.Collection
    public int size() {
        return b().size();
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection collection) {
        return b().removeAll(collection);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return b().isEmpty();
    }

    @Override // java.util.Collection
    public boolean contains(Object obj) {
        return b().contains(obj);
    }

    @Override // java.util.Collection
    public boolean add(Object obj) {
        return b().add(obj);
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        return b().remove(obj);
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection collection) {
        return b().containsAll(collection);
    }

    @Override // java.util.Collection
    public boolean addAll(Collection collection) {
        return b().addAll(collection);
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection collection) {
        return b().retainAll(collection);
    }

    @Override // java.util.Collection
    public void clear() {
        b().clear();
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return b().toArray();
    }

    @Override // java.util.Collection
    public Object[] toArray(Object[] objArr) {
        return b().toArray(objArr);
    }
}

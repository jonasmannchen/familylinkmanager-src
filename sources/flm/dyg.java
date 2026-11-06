package flm;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.SortedSet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class dyg extends dyj implements eah, NavigableSet {
    public final transient Comparator a;
    private transient dyg b;

    static eab a(Comparator comparator) {
        return dzm.a.equals(comparator) ? eab.b : new eab(dxm.g(), comparator);
    }

    abstract int a(Object obj);

    abstract dyg a(Object obj, boolean z);

    abstract dyg a(Object obj, boolean z, Object obj2, boolean z2);

    abstract dyg b(Object obj, boolean z);

    abstract dyg g();

    @Override // java.util.NavigableSet
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public abstract eau descendingIterator();

    final int a(Object obj, Object obj2) {
        return this.a.compare(obj, obj2);
    }

    dyg(Comparator comparator) {
        this.a = comparator;
    }

    @Override // flm.eah, java.util.SortedSet
    public Comparator comparator() {
        return this.a;
    }

    @Override // java.util.NavigableSet
    public Object lower(Object obj) {
        return dyn.a((eau) ((dyg) headSet(obj, false)).descendingIterator(), (Object) null);
    }

    @Override // java.util.NavigableSet
    public Object floor(Object obj) {
        return dyn.a((eau) ((dyg) headSet(obj, true)).descendingIterator(), (Object) null);
    }

    @Override // java.util.NavigableSet
    public Object ceiling(Object obj) {
        return dyk.a((dyg) tailSet(obj, true), (Object) null);
    }

    @Override // java.util.NavigableSet
    public Object higher(Object obj) {
        return dyk.a((dyg) tailSet(obj, false), (Object) null);
    }

    @Override // java.util.SortedSet
    public Object first() {
        return ((eau) iterator()).next();
    }

    @Override // java.util.SortedSet
    public Object last() {
        return ((eau) descendingIterator()).next();
    }

    @Override // java.util.NavigableSet
    @Deprecated
    public final Object pollFirst() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    @Deprecated
    public final Object pollLast() {
        throw new UnsupportedOperationException();
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // flm.dxx, flm.dxi
    Object writeReplace() {
        return new dyi(this.a, toArray());
    }

    @Override // flm.dxx, flm.dxi, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public /* synthetic */ Iterator iterator() {
        return iterator();
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public /* synthetic */ SortedSet tailSet(Object obj) {
        return (dyg) tailSet(obj, true);
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public /* synthetic */ SortedSet headSet(Object obj) {
        return (dyg) headSet(obj, false);
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public /* synthetic */ SortedSet subSet(Object obj, Object obj2) {
        return (dyg) subSet(obj, true, obj2, false);
    }

    @Override // java.util.NavigableSet
    public /* synthetic */ NavigableSet tailSet(Object obj, boolean z) {
        return b(dvl.a(obj), z);
    }

    @Override // java.util.NavigableSet
    public /* synthetic */ NavigableSet headSet(Object obj, boolean z) {
        return a(dvl.a(obj), z);
    }

    @Override // java.util.NavigableSet
    public /* synthetic */ NavigableSet subSet(Object obj, boolean z, Object obj2, boolean z2) {
        dvl.a(obj);
        dvl.a(obj2);
        dvl.a(this.a.compare(obj, obj2) <= 0);
        return a(obj, z, obj2, z2);
    }

    @Override // java.util.NavigableSet
    public /* synthetic */ NavigableSet descendingSet() {
        dyg dygVar = this.b;
        if (dygVar == null) {
            dyg dygVarG = g();
            this.b = dygVarG;
            dygVarG.b = this;
            return dygVarG;
        }
        return dygVar;
    }
}

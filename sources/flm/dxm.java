package flm;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class dxm extends dxi implements List, RandomAccess {
    private static final eav a = new dxo(dzu.a, 0);

    public static dxm g() {
        return dzu.a;
    }

    public static dxm a(Object obj) {
        Object[] objArr = {obj};
        Object[] objArrA = dzn.a(objArr, objArr.length);
        return b(objArrA, objArrA.length);
    }

    public static dxm a(Iterable iterable) {
        dvl.a(iterable);
        if (iterable instanceof Collection) {
            return a((Collection) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return dzu.a;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return a(next);
        }
        return ((dxn) ((dxn) new dxn().b(next)).a(it)).a();
    }

    public static dxm a(Collection collection) {
        if (collection instanceof dxi) {
            dxm dxmVarE = ((dxi) collection).e();
            if (dxmVarE.f()) {
                Object[] array = dxmVarE.toArray();
                return b(array, array.length);
            }
            return dxmVarE;
        }
        Object[] array2 = collection.toArray();
        Object[] objArrA = dzn.a(array2, array2.length);
        return b(objArrA, objArrA.length);
    }

    public static dxm a(Object[] objArr) {
        if (objArr.length == 0) {
            return dzu.a;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        Object[] objArrA = dzn.a(objArr2, objArr2.length);
        return b(objArrA, objArrA.length);
    }

    public static dxm a(Comparator comparator, Iterable iterable) {
        Collection arrayList;
        dvl.a(comparator);
        if (iterable instanceof Collection) {
            arrayList = (Collection) iterable;
        } else {
            Iterator it = iterable.iterator();
            arrayList = new ArrayList();
            dyn.a(arrayList, it);
        }
        Object[] array = arrayList.toArray();
        dzn.a(array, array.length);
        Arrays.sort(array, comparator);
        return b(array, array.length);
    }

    static dxm b(Object[] objArr) {
        return b(objArr, objArr.length);
    }

    static dxm b(Object[] objArr, int i) {
        return i == 0 ? dzu.a : new dzu(objArr, i);
    }

    dxm() {
    }

    @Override // flm.dxi
    /* JADX INFO: renamed from: a */
    public final eau iterator() {
        return (eav) listIterator();
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        int i = 0;
        if (obj == null) {
            return -1;
        }
        if (this instanceof RandomAccess) {
            int size = size();
            if (obj == null) {
                while (i < size) {
                    if (get(i) != null) {
                        i++;
                    }
                }
                return -1;
            }
            while (i < size) {
                if (!obj.equals(get(i))) {
                    i++;
                }
            }
            return -1;
        }
        ListIterator listIterator = listIterator();
        while (listIterator.hasNext()) {
            if (dvh.a(obj, listIterator.next())) {
                return listIterator.previousIndex();
            }
        }
        i = -1;
        return i;
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        int size;
        if (obj == null) {
            return -1;
        }
        if (this instanceof RandomAccess) {
            if (obj == null) {
                size = size() - 1;
                while (size >= 0) {
                    if (get(size) != null) {
                        size--;
                    }
                }
                return -1;
            }
            size = size() - 1;
            while (size >= 0) {
                if (!obj.equals(get(size))) {
                    size--;
                }
            }
            return -1;
        }
        ListIterator listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (dvh.a(obj, listIterator.previous())) {
                return listIterator.nextIndex();
            }
        }
        size = -1;
        return size;
    }

    @Override // flm.dxi, java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public dxm subList(int i, int i2) {
        dvl.a(i, i2, size());
        int i3 = i2 - i;
        if (i3 != size()) {
            if (i3 == 0) {
                return dzu.a;
            }
            return new dxr(this, i, i2 - i);
        }
        return this;
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // flm.dxi
    public final dxm e() {
        return this;
    }

    @Override // flm.dxi
    int a(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    public dxm h() {
        return size() <= 1 ? this : new dxp(this);
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (obj == dvl.a(this)) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        List list = (List) obj;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        if ((this instanceof RandomAccess) && (list instanceof RandomAccess)) {
            for (int i = 0; i < size; i++) {
                if (!dvh.a(get(i), list.get(i))) {
                    return false;
                }
            }
            return true;
        }
        Iterator it = iterator();
        Iterator it2 = list.iterator();
        while (it.hasNext()) {
            if (it2.hasNext() && dvh.a(it.next(), it2.next())) {
            }
            return false;
        }
        return !it2.hasNext();
    }

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        int iHashCode = 1;
        int size = size();
        for (int i = 0; i < size; i++) {
            iHashCode = (((iHashCode * 31) + get(i).hashCode()) ^ (-1)) ^ (-1);
        }
        return iHashCode;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // flm.dxi
    Object writeReplace() {
        return new dxq(toArray());
    }

    public static dxn i() {
        return new dxn();
    }

    @Override // flm.dxi, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public /* synthetic */ Iterator iterator() {
        return iterator();
    }

    @Override // java.util.List
    public /* synthetic */ ListIterator listIterator(int i) {
        dvl.b(i, size());
        if (isEmpty()) {
            return a;
        }
        return new dxo(this, i);
    }

    @Override // java.util.List
    public /* synthetic */ ListIterator listIterator() {
        return (eav) listIterator(0);
    }
}

package flm;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class sc {
    public se a;
    public sh b;
    private sf c;

    sc() {
    }

    protected abstract int a();

    protected abstract int a(Object obj);

    protected abstract Object a(int i, int i2);

    protected abstract Object a(int i, Object obj);

    protected abstract void a(int i);

    protected abstract void a(Object obj, Object obj2);

    protected abstract int b(Object obj);

    protected abstract Map b();

    protected abstract void c();

    public static boolean a(Map map, Collection collection) {
        int size = map.size();
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    public final Object[] b(int i) {
        int iA = a();
        Object[] objArr = new Object[iA];
        for (int i2 = 0; i2 < iA; i2++) {
            objArr[i2] = a(i2, i);
        }
        return objArr;
    }

    public final Object[] a(Object[] objArr, int i) {
        int iA = a();
        Object[] objArr2 = objArr.length < iA ? (Object[]) Array.newInstance(objArr.getClass().getComponentType(), iA) : objArr;
        for (int i2 = 0; i2 < iA; i2++) {
            objArr2[i2] = a(i2, i);
        }
        if (objArr2.length > iA) {
            objArr2[iA] = null;
        }
        return objArr2;
    }

    public static boolean a(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set2 = (Set) obj;
        try {
            return set.size() == set2.size() && set.containsAll(set2);
        } catch (ClassCastException e) {
            return false;
        } catch (NullPointerException e2) {
            return false;
        }
    }

    public final Set d() {
        if (this.c == null) {
            this.c = new sf(this);
        }
        return this.c;
    }
}

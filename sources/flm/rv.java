package flm;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class rv implements Collection, Set {
    private static final int[] c = new int[0];
    private static final Object[] d = new Object[0];
    private static Object[] e;
    private static int f;
    private static Object[] g;
    private static int h;
    public Object[] a;
    public int b;
    private int[] i;
    private sc j;

    private final int a(Object obj, int i) {
        int i2 = this.b;
        if (i2 == 0) {
            return -1;
        }
        int iA = rx.a(this.i, i2, i);
        if (iA < 0 || obj.equals(this.a[iA])) {
            return iA;
        }
        int i3 = iA + 1;
        while (i3 < i2 && this.i[i3] == i) {
            if (obj.equals(this.a[i3])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = iA - 1; i4 >= 0 && this.i[i4] == i; i4--) {
            if (obj.equals(this.a[i4])) {
                return i4;
            }
        }
        return i3 ^ (-1);
    }

    private final int a() {
        int i = this.b;
        if (i == 0) {
            return -1;
        }
        int iA = rx.a(this.i, i, 0);
        if (iA >= 0 && this.a[iA] != null) {
            int i2 = iA + 1;
            while (i2 < i && this.i[i2] == 0) {
                if (this.a[i2] == null) {
                    return i2;
                }
                i2++;
            }
            for (int i3 = iA - 1; i3 >= 0 && this.i[i3] == 0; i3--) {
                if (this.a[i3] == null) {
                    return i3;
                }
            }
            return i2 ^ (-1);
        }
        return iA;
    }

    private final void b(int i) {
        if (i == 8) {
            synchronized (rv.class) {
                if (g != null) {
                    Object[] objArr = g;
                    this.a = objArr;
                    g = (Object[]) objArr[0];
                    this.i = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    h--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (rv.class) {
                if (e != null) {
                    Object[] objArr2 = e;
                    this.a = objArr2;
                    e = (Object[]) objArr2[0];
                    this.i = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f--;
                    return;
                }
            }
        }
        this.i = new int[i];
        this.a = new Object[i];
    }

    private static void a(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (rv.class) {
                if (h < 10) {
                    objArr[0] = g;
                    objArr[1] = iArr;
                    for (int i2 = i - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    g = objArr;
                    h++;
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (rv.class) {
                if (f < 10) {
                    objArr[0] = e;
                    objArr[1] = iArr;
                    for (int i3 = i - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    e = objArr;
                    f++;
                }
            }
        }
    }

    public rv() {
        this(0);
    }

    public rv(int i) {
        if (i == 0) {
            this.i = c;
            this.a = d;
        } else {
            b(i);
        }
        this.b = 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        if (this.b != 0) {
            a(this.i, this.a, this.b);
            this.i = c;
            this.a = d;
            this.b = 0;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return a(obj) >= 0;
    }

    public final int a(Object obj) {
        return obj == null ? a() : a(obj, obj.hashCode());
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.b <= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int iHashCode;
        int iA;
        int i = 8;
        if (obj == null) {
            iA = a();
            iHashCode = 0;
        } else {
            iHashCode = obj.hashCode();
            iA = a(obj, iHashCode);
        }
        if (iA >= 0) {
            return false;
        }
        int i2 = iA ^ (-1);
        if (this.b >= this.i.length) {
            if (this.b >= 8) {
                i = this.b + (this.b >> 1);
            } else if (this.b < 4) {
                i = 4;
            }
            int[] iArr = this.i;
            Object[] objArr = this.a;
            b(i);
            if (this.i.length > 0) {
                System.arraycopy(iArr, 0, this.i, 0, iArr.length);
                System.arraycopy(objArr, 0, this.a, 0, objArr.length);
            }
            a(iArr, objArr, this.b);
        }
        if (i2 < this.b) {
            System.arraycopy(this.i, i2, this.i, i2 + 1, this.b - i2);
            System.arraycopy(this.a, i2, this.a, i2 + 1, this.b - i2);
        }
        this.i[i2] = iHashCode;
        this.a[i2] = obj;
        this.b++;
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int iA = a(obj);
        if (iA < 0) {
            return false;
        }
        a(iA);
        return true;
    }

    public final Object a(int i) {
        Object obj = this.a[i];
        if (this.b <= 1) {
            a(this.i, this.a, this.b);
            this.i = c;
            this.a = d;
            this.b = 0;
        } else if (this.i.length > 8 && this.b < this.i.length / 3) {
            int i2 = this.b > 8 ? this.b + (this.b >> 1) : 8;
            int[] iArr = this.i;
            Object[] objArr = this.a;
            b(i2);
            this.b--;
            if (i > 0) {
                System.arraycopy(iArr, 0, this.i, 0, i);
                System.arraycopy(objArr, 0, this.a, 0, i);
            }
            if (i < this.b) {
                System.arraycopy(iArr, i + 1, this.i, i, this.b - i);
                System.arraycopy(objArr, i + 1, this.a, i, this.b - i);
            }
        } else {
            this.b--;
            if (i < this.b) {
                System.arraycopy(this.i, i + 1, this.i, i, this.b - i);
                System.arraycopy(this.a, i + 1, this.a, i, this.b - i);
            }
            this.a[this.b] = null;
        }
        return obj;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.b;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        Object[] objArr = new Object[this.b];
        System.arraycopy(this.a, 0, objArr, 0, this.b);
        return objArr;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        Object[] objArr2 = objArr.length < this.b ? (Object[]) Array.newInstance(objArr.getClass().getComponentType(), this.b) : objArr;
        System.arraycopy(this.a, 0, objArr2, 0, this.b);
        if (objArr2.length > this.b) {
            objArr2[this.b] = null;
        }
        return objArr2;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        if (size() != set.size()) {
            return false;
        }
        for (int i = 0; i < this.b; i++) {
            try {
                if (!set.contains(this.a[i])) {
                    return false;
                }
            } catch (ClassCastException e2) {
                return false;
            } catch (NullPointerException e3) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.i;
        int i = this.b;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.b * 14);
        sb.append('{');
        for (int i = 0; i < this.b; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            Object obj = this.a[i];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        if (this.j == null) {
            this.j = new rw(this);
        }
        return this.j.d().iterator();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        boolean zAdd = false;
        int size = this.b + collection.size();
        if (this.i.length < size) {
            int[] iArr = this.i;
            Object[] objArr = this.a;
            b(size);
            if (this.b > 0) {
                System.arraycopy(iArr, 0, this.i, 0, this.b);
                System.arraycopy(objArr, 0, this.a, 0, this.b);
            }
            a(iArr, objArr, this.b);
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        boolean zRemove = false;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        boolean z = false;
        for (int i = this.b - 1; i >= 0; i--) {
            if (!collection.contains(this.a[i])) {
                a(i);
                z = true;
            }
        }
        return z;
    }
}

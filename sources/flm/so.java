package flm;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class so {
    private static Object[] c;
    private static int d;
    private static Object[] e;
    private static int f;
    public Object[] a;
    public int b;
    private int[] g;

    private static int a(int[] iArr, int i, int i2) {
        try {
            return rx.a(iArr, i, i2);
        } catch (ArrayIndexOutOfBoundsException e2) {
            throw new ConcurrentModificationException();
        }
    }

    private final int a(Object obj, int i) {
        int i2 = this.b;
        if (i2 == 0) {
            return -1;
        }
        int iA = a(this.g, i2, i);
        if (iA >= 0 && !obj.equals(this.a[iA << 1])) {
            int i3 = iA + 1;
            while (i3 < i2 && this.g[i3] == i) {
                if (obj.equals(this.a[i3 << 1])) {
                    return i3;
                }
                i3++;
            }
            for (int i4 = iA - 1; i4 >= 0 && this.g[i4] == i; i4--) {
                if (obj.equals(this.a[i4 << 1])) {
                    return i4;
                }
            }
            return i3 ^ (-1);
        }
        return iA;
    }

    private final int a() {
        int i = this.b;
        if (i == 0) {
            return -1;
        }
        int iA = a(this.g, i, 0);
        if (iA >= 0 && this.a[iA << 1] != null) {
            int i2 = iA + 1;
            while (i2 < i && this.g[i2] == 0) {
                if (this.a[i2 << 1] == null) {
                    return i2;
                }
                i2++;
            }
            for (int i3 = iA - 1; i3 >= 0 && this.g[i3] == 0; i3--) {
                if (this.a[i3 << 1] == null) {
                    return i3;
                }
            }
            return i2 ^ (-1);
        }
        return iA;
    }

    private final void e(int i) {
        if (i == 8) {
            synchronized (rt.class) {
                if (e != null) {
                    Object[] objArr = e;
                    this.a = objArr;
                    e = (Object[]) objArr[0];
                    this.g = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (rt.class) {
                if (c != null) {
                    Object[] objArr2 = c;
                    this.a = objArr2;
                    c = (Object[]) objArr2[0];
                    this.g = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    d--;
                    return;
                }
            }
        }
        this.g = new int[i];
        this.a = new Object[i << 1];
    }

    private static void a(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (rt.class) {
                if (f < 10) {
                    objArr[0] = e;
                    objArr[1] = iArr;
                    for (int i2 = (i << 1) - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    e = objArr;
                    f++;
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (rt.class) {
                if (d < 10) {
                    objArr[0] = c;
                    objArr[1] = iArr;
                    for (int i3 = (i << 1) - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    c = objArr;
                    d++;
                }
            }
        }
    }

    public so() {
        this.g = rx.a;
        this.a = rx.c;
        this.b = 0;
    }

    public so(int i) {
        if (i == 0) {
            this.g = rx.a;
            this.a = rx.c;
        } else {
            e(i);
        }
        this.b = 0;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public so(so soVar) {
        this();
        if (soVar != null) {
            int i = soVar.b;
            a(this.b + i);
            if (this.b == 0) {
                if (i > 0) {
                    System.arraycopy(soVar.g, 0, this.g, 0, i);
                    System.arraycopy(soVar.a, 0, this.a, 0, i << 1);
                    this.b = i;
                    return;
                }
                return;
            }
            for (int i2 = 0; i2 < i; i2++) {
                put(soVar.b(i2), soVar.c(i2));
            }
        }
    }

    public void clear() {
        if (this.b > 0) {
            int[] iArr = this.g;
            Object[] objArr = this.a;
            int i = this.b;
            this.g = rx.a;
            this.a = rx.c;
            this.b = 0;
            a(iArr, objArr, i);
        }
        if (this.b > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public final void a(int i) {
        int i2 = this.b;
        if (this.g.length < i) {
            int[] iArr = this.g;
            Object[] objArr = this.a;
            e(i);
            if (this.b > 0) {
                System.arraycopy(iArr, 0, this.g, 0, i2);
                System.arraycopy(objArr, 0, this.a, 0, i2 << 1);
            }
            a(iArr, objArr, i2);
        }
        if (this.b != i2) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return a(obj) >= 0;
    }

    public final int a(Object obj) {
        return obj == null ? a() : a(obj, obj.hashCode());
    }

    final int b(Object obj) {
        int i = 1;
        int i2 = this.b << 1;
        Object[] objArr = this.a;
        if (obj == null) {
            while (i < i2) {
                if (objArr[i] == null) {
                    return i >> 1;
                }
                i += 2;
            }
        } else {
            while (i < i2) {
                if (obj.equals(objArr[i])) {
                    return i >> 1;
                }
                i += 2;
            }
        }
        return -1;
    }

    public boolean containsValue(Object obj) {
        return b(obj) >= 0;
    }

    public Object get(Object obj) {
        int iA = a(obj);
        if (iA >= 0) {
            return this.a[(iA << 1) + 1];
        }
        return null;
    }

    public final Object b(int i) {
        return this.a[i << 1];
    }

    public final Object c(int i) {
        return this.a[(i << 1) + 1];
    }

    public boolean isEmpty() {
        return this.b <= 0;
    }

    public Object put(Object obj, Object obj2) {
        int iHashCode;
        int iA;
        int i = 8;
        int i2 = this.b;
        if (obj == null) {
            iA = a();
            iHashCode = 0;
        } else {
            iHashCode = obj.hashCode();
            iA = a(obj, iHashCode);
        }
        if (iA >= 0) {
            int i3 = (iA << 1) + 1;
            Object obj3 = this.a[i3];
            this.a[i3] = obj2;
            return obj3;
        }
        int i4 = iA ^ (-1);
        if (i2 >= this.g.length) {
            if (i2 >= 8) {
                i = (i2 >> 1) + i2;
            } else if (i2 < 4) {
                i = 4;
            }
            int[] iArr = this.g;
            Object[] objArr = this.a;
            e(i);
            if (i2 != this.b) {
                throw new ConcurrentModificationException();
            }
            if (this.g.length > 0) {
                System.arraycopy(iArr, 0, this.g, 0, iArr.length);
                System.arraycopy(objArr, 0, this.a, 0, objArr.length);
            }
            a(iArr, objArr, i2);
        }
        if (i4 < i2) {
            System.arraycopy(this.g, i4, this.g, i4 + 1, i2 - i4);
            System.arraycopy(this.a, i4 << 1, this.a, (i4 + 1) << 1, (this.b - i4) << 1);
        }
        if (i2 != this.b || i4 >= this.g.length) {
            throw new ConcurrentModificationException();
        }
        this.g[i4] = iHashCode;
        this.a[i4 << 1] = obj;
        this.a[(i4 << 1) + 1] = obj2;
        this.b++;
        return null;
    }

    public Object remove(Object obj) {
        int iA = a(obj);
        if (iA >= 0) {
            return d(iA);
        }
        return null;
    }

    public final Object d(int i) {
        int i2;
        Object obj = this.a[(i << 1) + 1];
        int i3 = this.b;
        if (i3 <= 1) {
            a(this.g, this.a, i3);
            this.g = rx.a;
            this.a = rx.c;
            i2 = 0;
        } else {
            int i4 = i3 - 1;
            if (this.g.length > 8 && this.b < this.g.length / 3) {
                int i5 = i3 > 8 ? (i3 >> 1) + i3 : 8;
                int[] iArr = this.g;
                Object[] objArr = this.a;
                e(i5);
                if (i3 != this.b) {
                    throw new ConcurrentModificationException();
                }
                if (i > 0) {
                    System.arraycopy(iArr, 0, this.g, 0, i);
                    System.arraycopy(objArr, 0, this.a, 0, i << 1);
                }
                if (i < i4) {
                    System.arraycopy(iArr, i + 1, this.g, i, i4 - i);
                    System.arraycopy(objArr, (i + 1) << 1, this.a, i << 1, (i4 - i) << 1);
                }
                i2 = i4;
            } else {
                if (i < i4) {
                    System.arraycopy(this.g, i + 1, this.g, i, i4 - i);
                    System.arraycopy(this.a, (i + 1) << 1, this.a, i << 1, (i4 - i) << 1);
                }
                this.a[i4 << 1] = null;
                this.a[(i4 << 1) + 1] = null;
                i2 = i4;
            }
        }
        if (i3 != this.b) {
            throw new ConcurrentModificationException();
        }
        this.b = i2;
        return obj;
    }

    public int size() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof so) {
            so soVar = (so) obj;
            if (size() != soVar.size()) {
                return false;
            }
            for (int i = 0; i < this.b; i++) {
                try {
                    Object objB = b(i);
                    Object objC = c(i);
                    Object obj2 = soVar.get(objB);
                    if (objC == null) {
                        if (obj2 != null || !soVar.containsKey(objB)) {
                            return false;
                        }
                    } else if (!objC.equals(obj2)) {
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
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (size() != map.size()) {
            return false;
        }
        for (int i2 = 0; i2 < this.b; i2++) {
            try {
                Object objB2 = b(i2);
                Object objC2 = c(i2);
                Object obj3 = map.get(objB2);
                if (objC2 == null) {
                    if (obj3 != null || !map.containsKey(objB2)) {
                        return false;
                    }
                } else if (!objC2.equals(obj3)) {
                    return false;
                }
            } catch (ClassCastException e4) {
                return false;
            } catch (NullPointerException e5) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int[] iArr = this.g;
        Object[] objArr = this.a;
        int i = this.b;
        int i2 = 1;
        int i3 = 0;
        int iHashCode = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            iHashCode += (obj == null ? 0 : obj.hashCode()) ^ iArr[i3];
            i3++;
            i2 += 2;
        }
        return iHashCode;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.b * 28);
        sb.append('{');
        for (int i = 0; i < this.b; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            Object objB = b(i);
            if (objB != this) {
                sb.append(objB);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object objC = c(i);
            if (objC != this) {
                sb.append(objC);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}

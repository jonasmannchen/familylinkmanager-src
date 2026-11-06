package flm;

import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dzv extends dxs {
    private static final dxs a = new dzv(null, new Object[0], 0);
    public static final long serialVersionUID = 0;
    private final transient int[] b;
    private final transient Object[] c;
    private final transient int d;

    static dzv a(int i, Object[] objArr) {
        if (i == 0) {
            return (dzv) a;
        }
        if (i == 1) {
            dwq.a(objArr[0], objArr[1]);
            return new dzv(null, objArr, 1);
        }
        dvl.b(i, objArr.length >> 1);
        return new dzv(a(objArr, i, dxx.a(i), 0), objArr, i);
    }

    static int[] a(Object[] objArr, int i, int i2, int i3) {
        int i4;
        if (i == 1) {
            dwq.a(objArr[i3], objArr[i3 ^ 1]);
            return null;
        }
        int i5 = i2 - 1;
        int[] iArr = new int[i2];
        Arrays.fill(iArr, -1);
        for (int i6 = 0; i6 < i; i6++) {
            Object obj = objArr[(i6 * 2) + i3];
            Object obj2 = objArr[(i6 * 2) + (i3 ^ 1)];
            dwq.a(obj, obj2);
            int iA = dxe.a(obj.hashCode());
            while (true) {
                i4 = iA & i5;
                int i7 = iArr[i4];
                if (i7 == -1) {
                    break;
                }
                if (objArr[i7].equals(obj)) {
                    String strValueOf = String.valueOf(obj);
                    String strValueOf2 = String.valueOf(obj2);
                    String strValueOf3 = String.valueOf(objArr[i7]);
                    String strValueOf4 = String.valueOf(objArr[i7 ^ 1]);
                    throw new IllegalArgumentException(new StringBuilder(String.valueOf(strValueOf).length() + 39 + String.valueOf(strValueOf2).length() + String.valueOf(strValueOf3).length() + String.valueOf(strValueOf4).length()).append("Multiple entries with same key: ").append(strValueOf).append("=").append(strValueOf2).append(" and ").append(strValueOf3).append("=").append(strValueOf4).toString());
                }
                iA = i4 + 1;
            }
            iArr[i4] = (i6 * 2) + i3;
        }
        return iArr;
    }

    private dzv(int[] iArr, Object[] objArr, int i) {
        this.b = iArr;
        this.c = objArr;
        this.d = i;
    }

    @Override // java.util.Map
    public final int size() {
        return this.d;
    }

    @Override // flm.dxs, java.util.Map
    public final Object get(Object obj) {
        return a(this.b, this.c, this.d, 0, obj);
    }

    static Object a(int[] iArr, Object[] objArr, int i, int i2, Object obj) {
        if (obj == null) {
            return null;
        }
        if (i == 1) {
            if (objArr[i2].equals(obj)) {
                return objArr[i2 ^ 1];
            }
            return null;
        }
        if (iArr == null) {
            return null;
        }
        int length = iArr.length - 1;
        int iA = dxe.a(obj.hashCode());
        while (true) {
            int i3 = iA & length;
            int i4 = iArr[i3];
            if (i4 == -1) {
                return null;
            }
            if (objArr[i4].equals(obj)) {
                return objArr[i4 ^ 1];
            }
            iA = i3 + 1;
        }
    }

    @Override // flm.dxs
    final dxx e() {
        return new dzw(this, this.c, 0, this.d);
    }

    @Override // flm.dxs
    final dxx g() {
        return new dzy(this, new dzz(this.c, 0, this.d));
    }

    @Override // flm.dxs
    final dxi b() {
        return new dzz(this.c, 1, this.d);
    }

    @Override // flm.dxs
    final boolean h() {
        return false;
    }
}

package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dok {
    public static final Object a = new Object();
    public int b;
    private int c;
    private int[] d;
    private Object[] e;

    public dok() {
        a();
    }

    public final void a() {
        this.c = 0;
        this.d = new int[doi.a[this.c]];
        this.e = new Object[doi.a[this.c]];
    }

    public final Object a(int i, Object obj) {
        dse.a(obj);
        int iD = d(i);
        if (this.e[iD] == null || this.e[iD] == a) {
            this.d[iD] = i;
            this.b++;
            this.e[iD] = obj;
            if (this.b > this.d.length / 2) {
                if (this.c < doi.a.length - 1) {
                    int[] iArr = this.d;
                    Object[] objArr = this.e;
                    this.c++;
                    this.d = new int[doi.a[this.c]];
                    this.e = new Object[doi.a[this.c]];
                    int i2 = this.b;
                    int length = iArr.length;
                    this.b = 0;
                    for (int i3 = 0; i3 < length; i3++) {
                        if (objArr[i3] != null && objArr[i3] != a) {
                            a(iArr[i3], objArr[i3]);
                        }
                    }
                    dse.b(i2 == this.b);
                } else {
                    throw new IllegalStateException("Too many items, you'd better use array map instead.");
                }
            }
            return null;
        }
        return this.e[iD];
    }

    public final Object a(int i) {
        int iD = d(i);
        if (this.e[iD] == null || this.e[iD] == a) {
            return null;
        }
        Object obj = this.e[iD];
        this.e[iD] = a;
        this.b--;
        return obj;
    }

    public final Object b(int i) {
        Object obj = this.e[d(i)];
        if (obj == a) {
            return null;
        }
        return obj;
    }

    private final int d(int i) {
        int length = this.d.length;
        boolean z = false;
        int iA = (doi.a(i) & Integer.MAX_VALUE) % length;
        int i2 = 0;
        while (true) {
            if (this.e[iA] == a) {
                if (!z) {
                    z = true;
                    i2 = iA;
                }
            } else {
                if (this.e[iA] == null) {
                    return z ? i2 : iA;
                }
                if (this.d[iA] == i) {
                    return iA;
                }
            }
            iA++;
            if (iA >= length) {
                iA = 0;
            }
        }
    }

    public final boolean c(int i) {
        Object objB = b(i);
        return (objB == null || objB == a) ? false : true;
    }

    public final dom b() {
        return new dom(this.d, this.e);
    }
}

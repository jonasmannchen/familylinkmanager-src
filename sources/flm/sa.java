package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class sa implements Cloneable {
    public static final Object a = new Object();
    public boolean b;
    public long[] c;
    public Object[] d;
    public int e;

    public sa() {
        this(10);
    }

    private sa(int i) {
        this.b = false;
        int iB = rx.b(10);
        this.c = new long[iB];
        this.d = new Object[iB];
        this.e = 0;
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final sa clone() {
        try {
            sa saVar = (sa) super.clone();
            saVar.c = (long[]) this.c.clone();
            saVar.d = (Object[]) this.d.clone();
            return saVar;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public final Object a(long j, Object obj) {
        int iA = rx.a(this.c, this.e, j);
        return (iA < 0 || this.d[iA] == a) ? obj : this.d[iA];
    }

    public final void b() {
        int i = this.e;
        long[] jArr = this.c;
        Object[] objArr = this.d;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != a) {
                if (i3 != i2) {
                    jArr[i2] = jArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.b = false;
        this.e = i2;
    }

    public final void b(long j, Object obj) {
        int iA = rx.a(this.c, this.e, j);
        if (iA >= 0) {
            this.d[iA] = obj;
            return;
        }
        int iA2 = iA ^ (-1);
        if (iA2 < this.e && this.d[iA2] == a) {
            this.c[iA2] = j;
            this.d[iA2] = obj;
            return;
        }
        if (this.b && this.e >= this.c.length) {
            b();
            iA2 = rx.a(this.c, this.e, j) ^ (-1);
        }
        if (this.e >= this.c.length) {
            int iB = rx.b(this.e + 1);
            long[] jArr = new long[iB];
            Object[] objArr = new Object[iB];
            System.arraycopy(this.c, 0, jArr, 0, this.c.length);
            System.arraycopy(this.d, 0, objArr, 0, this.d.length);
            this.c = jArr;
            this.d = objArr;
        }
        if (this.e - iA2 != 0) {
            System.arraycopy(this.c, iA2, this.c, iA2 + 1, this.e - iA2);
            System.arraycopy(this.d, iA2, this.d, iA2 + 1, this.e - iA2);
        }
        this.c[iA2] = j;
        this.d[iA2] = obj;
        this.e++;
    }

    public final int c() {
        if (this.b) {
            b();
        }
        return this.e;
    }

    public final long a(int i) {
        if (this.b) {
            b();
        }
        return this.c[i];
    }

    public final Object b(int i) {
        if (this.b) {
            b();
        }
        return this.d[i];
    }

    public final void d() {
        int i = this.e;
        Object[] objArr = this.d;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.e = 0;
        this.b = false;
    }

    public final void c(long j, Object obj) {
        if (this.e != 0 && j <= this.c[this.e - 1]) {
            b(j, obj);
            return;
        }
        if (this.b && this.e >= this.c.length) {
            b();
        }
        int i = this.e;
        if (i >= this.c.length) {
            int iB = rx.b(i + 1);
            long[] jArr = new long[iB];
            Object[] objArr = new Object[iB];
            System.arraycopy(this.c, 0, jArr, 0, this.c.length);
            System.arraycopy(this.d, 0, objArr, 0, this.d.length);
            this.c = jArr;
            this.d = objArr;
        }
        this.c[i] = j;
        this.d[i] = obj;
        this.e = i + 1;
    }

    public final String toString() {
        if (c() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.e * 28);
        sb.append('{');
        for (int i = 0; i < this.e; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(a(i));
            sb.append('=');
            Object objB = b(i);
            if (objB != this) {
                sb.append(objB);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}

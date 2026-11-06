package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class sp implements Cloneable {
    public static final Object a = new Object();
    public boolean b;
    public int[] c;
    public Object[] d;
    public int e;

    public sp() {
        this(10);
    }

    public sp(int i) {
        this.b = false;
        if (i == 0) {
            this.c = rx.a;
            this.d = rx.c;
        } else {
            int iA = rx.a(i);
            this.c = new int[iA];
            this.d = new Object[iA];
        }
        this.e = 0;
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final sp clone() {
        try {
            sp spVar = (sp) super.clone();
            spVar.c = (int[]) this.c.clone();
            spVar.d = (Object[]) this.d.clone();
            return spVar;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public final Object a(int i, Object obj) {
        int iA = rx.a(this.c, this.e, i);
        return (iA < 0 || this.d[iA] == a) ? obj : this.d[iA];
    }

    public final void b() {
        int i = this.e;
        int[] iArr = this.c;
        Object[] objArr = this.d;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != a) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.b = false;
        this.e = i2;
    }

    public final void b(int i, Object obj) {
        int iA = rx.a(this.c, this.e, i);
        if (iA >= 0) {
            this.d[iA] = obj;
            return;
        }
        int iA2 = iA ^ (-1);
        if (iA2 < this.e && this.d[iA2] == a) {
            this.c[iA2] = i;
            this.d[iA2] = obj;
            return;
        }
        if (this.b && this.e >= this.c.length) {
            b();
            iA2 = rx.a(this.c, this.e, i) ^ (-1);
        }
        if (this.e >= this.c.length) {
            int iA3 = rx.a(this.e + 1);
            int[] iArr = new int[iA3];
            Object[] objArr = new Object[iA3];
            System.arraycopy(this.c, 0, iArr, 0, this.c.length);
            System.arraycopy(this.d, 0, objArr, 0, this.d.length);
            this.c = iArr;
            this.d = objArr;
        }
        if (this.e - iA2 != 0) {
            System.arraycopy(this.c, iA2, this.c, iA2 + 1, this.e - iA2);
            System.arraycopy(this.d, iA2, this.d, iA2 + 1, this.e - iA2);
        }
        this.c[iA2] = i;
        this.d[iA2] = obj;
        this.e++;
    }

    public final int c() {
        if (this.b) {
            b();
        }
        return this.e;
    }

    public final int a(int i) {
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

    public final void c(int i, Object obj) {
        if (this.e != 0 && i <= this.c[this.e - 1]) {
            b(i, obj);
            return;
        }
        if (this.b && this.e >= this.c.length) {
            b();
        }
        int i2 = this.e;
        if (i2 >= this.c.length) {
            int iA = rx.a(i2 + 1);
            int[] iArr = new int[iA];
            Object[] objArr = new Object[iA];
            System.arraycopy(this.c, 0, iArr, 0, this.c.length);
            System.arraycopy(this.d, 0, objArr, 0, this.d.length);
            this.c = iArr;
            this.d = objArr;
        }
        this.c[i2] = i;
        this.d[i2] = obj;
        this.e = i2 + 1;
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

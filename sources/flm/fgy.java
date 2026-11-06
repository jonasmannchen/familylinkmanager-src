package flm;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class fgy implements Serializable, Iterable {
    public static final fgy a = new fhi(fiv.b);
    private static final fhe c;
    public int b = 0;

    fgy() {
    }

    public abstract byte a(int i);

    protected abstract int a(int i, int i2, int i3);

    public abstract fgy a(int i, int i2);

    protected abstract String a(Charset charset);

    abstract void a(fgx fgxVar);

    abstract byte b(int i);

    public abstract int b();

    protected abstract int b(int i, int i2, int i3);

    protected abstract void b(byte[] bArr, int i, int i2, int i3);

    public abstract boolean e();

    public abstract boolean equals(Object obj);

    protected abstract int f();

    protected abstract boolean g();

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public fhf iterator() {
        return new fgz(this);
    }

    static int a(byte b) {
        return b & 255;
    }

    public static fgy a(byte[] bArr, int i, int i2) {
        c(i, i + i2, bArr.length);
        return new fhi(c.a(bArr, i, i2));
    }

    public static fgy a(byte[] bArr) {
        return a(bArr, 0, bArr.length);
    }

    static fgy b(byte[] bArr) {
        return new fhi(bArr);
    }

    public static fgy a(String str) {
        return new fhi(str.getBytes(fiv.a));
    }

    public static fgy a(Iterable iterable) {
        int size = ((Collection) iterable).size();
        return size == 0 ? a : a(iterable.iterator(), size);
    }

    private static fgy a(Iterator it, int i) {
        if (i <= 0) {
            throw new IllegalArgumentException(String.format("length (%s) must be >= 1", Integer.valueOf(i)));
        }
        if (i == 1) {
            return (fgy) it.next();
        }
        int i2 = i >>> 1;
        fgy fgyVarA = a(it, i2);
        fgy fgyVarA2 = a(it, i - i2);
        if (Integer.MAX_VALUE - fgyVarA.b() < fgyVarA2.b()) {
            throw new IllegalArgumentException(new StringBuilder(53).append("ByteString would be too long: ").append(fgyVarA.b()).append("+").append(fgyVarA2.b()).toString());
        }
        return fku.a(fgyVarA, fgyVarA2);
    }

    @Deprecated
    public final void a(byte[] bArr, int i, int i2, int i3) {
        c(i, i + i3, b());
        c(i2, i2 + i3, bArr.length);
        if (i3 > 0) {
            b(bArr, i, i2, i3);
        }
    }

    public final byte[] c() {
        int iB = b();
        if (iB == 0) {
            return fiv.b;
        }
        byte[] bArr = new byte[iB];
        b(bArr, 0, 0, iB);
        return bArr;
    }

    public final String d() {
        return b() == 0 ? "" : a(fiv.a);
    }

    public final int hashCode() {
        int iB = this.b;
        if (iB == 0) {
            int iB2 = b();
            iB = b(iB2, 0, iB2);
            if (iB == 0) {
                iB = 1;
            }
            this.b = iB;
        }
        return iB;
    }

    static fhg c(int i) {
        return new fhg(i);
    }

    static void b(int i, int i2) {
        if (((i2 - (i + 1)) | i) < 0) {
            if (i < 0) {
                throw new ArrayIndexOutOfBoundsException(new StringBuilder(22).append("Index < 0: ").append(i).toString());
            }
            throw new ArrayIndexOutOfBoundsException(new StringBuilder(40).append("Index > length: ").append(i).append(", ").append(i2).toString());
        }
    }

    static int c(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) < 0) {
            if (i < 0) {
                throw new IndexOutOfBoundsException(new StringBuilder(32).append("Beginning index: ").append(i).append(" < 0").toString());
            }
            if (i2 < i) {
                throw new IndexOutOfBoundsException(new StringBuilder(66).append("Beginning index larger than ending index: ").append(i).append(", ").append(i2).toString());
            }
            throw new IndexOutOfBoundsException(new StringBuilder(37).append("End index: ").append(i2).append(" >= ").append(i3).toString());
        }
        return i4;
    }

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(b()));
    }

    static {
        fhe fhcVar;
        if (fgs.a()) {
            fhcVar = new fhj();
        } else {
            fhcVar = new fhc();
        }
        c = fhcVar;
        new fha();
    }
}

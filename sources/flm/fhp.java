package flm;

import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class fhp extends fgx {
    public fhx b;
    private static final Logger c = Logger.getLogger(fhp.class.getName());
    public static final boolean a = flw.c;

    public static int a(int i) {
        if (i > 4096) {
            return 4096;
        }
        return i;
    }

    public abstract void a(byte b);

    public abstract void a(int i, int i2);

    public abstract void a(int i, long j);

    public abstract void a(int i, fgy fgyVar);

    public abstract void a(int i, fke fkeVar);

    abstract void a(int i, fke fkeVar, fky fkyVar);

    public abstract void a(int i, String str);

    public abstract void a(int i, boolean z);

    public abstract void a(long j);

    public abstract void a(fgy fgyVar);

    public abstract void a(fke fkeVar);

    abstract void a(fke fkeVar, fky fkyVar);

    public abstract void a(String str);

    public abstract void b(int i);

    public abstract void b(int i, int i2);

    public abstract void b(int i, fgy fgyVar);

    public abstract void b(int i, fke fkeVar);

    public abstract void c(int i);

    public abstract void c(int i, int i2);

    public abstract void c(int i, long j);

    public abstract void c(long j);

    public abstract void c(byte[] bArr, int i, int i2);

    abstract void d(byte[] bArr, int i, int i2);

    public abstract void e(int i);

    public abstract void e(int i, int i2);

    public abstract void h();

    public abstract int i();

    public static fhp a(OutputStream outputStream, int i) {
        return new fhu(outputStream, i);
    }

    public static fhp a(byte[] bArr) {
        return b(bArr, 0, bArr.length);
    }

    public static fhp b(byte[] bArr, int i, int i2) {
        return new fhr(bArr, i, i2);
    }

    public static fhp a(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            return new fhs(byteBuffer);
        }
        if (byteBuffer.isDirect() && !byteBuffer.isReadOnly()) {
            if (flw.b) {
                return new fhw(byteBuffer);
            }
            return new fhv(byteBuffer);
        }
        throw new IllegalArgumentException("ByteBuffer is read-only");
    }

    fhp() {
    }

    public final void d(int i, int i2) {
        c(i, m(i2));
    }

    public final void b(int i, long j) {
        a(i, g(j));
    }

    public final void a(int i, float f) {
        e(i, Float.floatToRawIntBits(f));
    }

    public final void a(int i, double d) {
        c(i, Double.doubleToRawLongBits(d));
    }

    public final void d(int i) {
        c(m(i));
    }

    public final void b(long j) {
        a(g(j));
    }

    public final void a(float f) {
        e(Float.floatToRawIntBits(f));
    }

    public final void a(double d) {
        c(Double.doubleToRawLongBits(d));
    }

    public final void a(boolean z) {
        a((byte) (z ? 1 : 0));
    }

    public static int f(int i, int i2) {
        return f(i) + g(i2);
    }

    public static int g(int i, int i2) {
        return f(i) + h(i2);
    }

    public static int h(int i, int i2) {
        return f(i) + h(m(i2));
    }

    public static int i(int i, int i2) {
        return f(i) + 4;
    }

    public static int j(int i, int i2) {
        return f(i) + 4;
    }

    public static int d(int i, long j) {
        return f(i) + e(j);
    }

    public static int e(int i, long j) {
        return f(i) + e(j);
    }

    public static int f(int i, long j) {
        return f(i) + e(g(j));
    }

    public static int g(int i, long j) {
        return f(i) + 8;
    }

    public static int h(int i, long j) {
        return f(i) + 8;
    }

    public static int b(int i, float f) {
        return f(i) + 4;
    }

    public static int b(int i, double d) {
        return f(i) + 8;
    }

    public static int b(int i, boolean z) {
        return f(i) + 1;
    }

    public static int k(int i, int i2) {
        return f(i) + g(i2);
    }

    public static int b(int i, String str) {
        return f(i) + b(str);
    }

    public static int c(int i, fgy fgyVar) {
        int iF = f(i);
        int iB = fgyVar.b();
        return iF + iB + h(iB);
    }

    public static int a(int i, fjm fjmVar) {
        int iG;
        int iF = f(i);
        if (fjmVar.c != null) {
            iG = fjmVar.c.b();
        } else if (fjmVar.b != null) {
            iG = fjmVar.b.g();
        } else {
            iG = 0;
        }
        return iG + h(iG) + iF;
    }

    public static int c(int i, fke fkeVar) {
        return f(i) + b(fkeVar);
    }

    static int b(int i, fke fkeVar, fky fkyVar) {
        return f(i) + b(fkeVar, fkyVar);
    }

    public static int d(int i, fke fkeVar) {
        return (f(1) << 1) + g(2, i) + c(3, fkeVar);
    }

    public static int d(int i, fgy fgyVar) {
        return (f(1) << 1) + g(2, i) + c(3, fgyVar);
    }

    public static int b(int i, fjm fjmVar) {
        return (f(1) << 1) + g(2, i) + a(3, fjmVar);
    }

    public static int f(int i) {
        return h(0 | (i << 3));
    }

    public static int g(int i) {
        if (i >= 0) {
            return h(i);
        }
        return 10;
    }

    public static int h(int i) {
        if ((i & (-128)) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        if (((-268435456) & i) == 0) {
            return 4;
        }
        return 5;
    }

    public static int i(int i) {
        return h(m(i));
    }

    public static int a() {
        return 4;
    }

    public static int b() {
        return 4;
    }

    public static int d(long j) {
        return e(j);
    }

    public static int e(long j) {
        long j2;
        if (((-128) & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        int i = 2;
        if (((-34359738368L) & j) != 0) {
            i = 6;
            j2 = j >>> 28;
        } else {
            j2 = j;
        }
        if (((-2097152) & j2) != 0) {
            i += 2;
            j2 >>>= 14;
        }
        if ((j2 & (-16384)) != 0) {
            return i + 1;
        }
        return i;
    }

    public static int f(long j) {
        return e(g(j));
    }

    public static int c() {
        return 8;
    }

    public static int d() {
        return 8;
    }

    public static int e() {
        return 4;
    }

    public static int f() {
        return 8;
    }

    public static int g() {
        return 1;
    }

    public static int j(int i) {
        return g(i);
    }

    public static int b(String str) {
        int length;
        try {
            length = fmc.a(str);
        } catch (fmg e) {
            length = str.getBytes(fiv.a).length;
        }
        return length + h(length);
    }

    public static int a(fjm fjmVar) {
        int iG;
        if (fjmVar.c != null) {
            iG = fjmVar.c.b();
        } else if (fjmVar.b != null) {
            iG = fjmVar.b.g();
        } else {
            iG = 0;
        }
        return iG + h(iG);
    }

    public static int b(fgy fgyVar) {
        int iB = fgyVar.b();
        return iB + h(iB);
    }

    public static int b(byte[] bArr) {
        int length = bArr.length;
        return length + h(length);
    }

    public static int b(fke fkeVar) {
        int iG = fkeVar.g();
        return iG + h(iG);
    }

    static int b(fke fkeVar, fky fkyVar) {
        fgn fgnVar = (fgn) fkeVar;
        int iC = fgnVar.c();
        if (iC == -1) {
            iC = fkyVar.b(fgnVar);
            fgnVar.a(iC);
        }
        return iC + h(iC);
    }

    static int k(int i) {
        return h(i) + i;
    }

    private static int m(int i) {
        return (i << 1) ^ (i >> 31);
    }

    private static long g(long j) {
        return (j << 1) ^ (j >> 63);
    }

    public final void j() {
        if (i() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    final void a(String str, fmg fmgVar) throws fht {
        c.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) fmgVar);
        byte[] bytes = str.getBytes(fiv.a);
        try {
            c(bytes.length);
            a(bytes, 0, bytes.length);
        } catch (fht e) {
            throw e;
        } catch (IndexOutOfBoundsException e2) {
            throw new fht(e2);
        }
    }

    @Deprecated
    public static int e(int i, fke fkeVar) {
        return (f(i) << 1) + fkeVar.g();
    }

    @Deprecated
    static int c(int i, fke fkeVar, fky fkyVar) {
        int iF = f(i) << 1;
        fgn fgnVar = (fgn) fkeVar;
        int iC = fgnVar.c();
        if (iC == -1) {
            iC = fkyVar.b(fgnVar);
            fgnVar.a(iC);
        }
        return iC + iF;
    }

    @Deprecated
    public static int c(fke fkeVar) {
        return fkeVar.g();
    }

    @Deprecated
    public static int l(int i) {
        return h(i);
    }
}

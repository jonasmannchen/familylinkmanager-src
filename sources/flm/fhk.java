package flm;

import java.io.InputStream;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class fhk {
    public int a;
    public int b = 100;
    public int c = Integer.MAX_VALUE;
    public fho d;

    public abstract int a();

    public abstract fke a(int i, fko fkoVar, fib fibVar);

    public abstract fke a(fko fkoVar, fib fibVar);

    public abstract void a(int i);

    public abstract double b();

    public abstract boolean b(int i);

    public abstract float c();

    public abstract int c(int i);

    public abstract long d();

    public abstract void d(int i);

    public abstract long e();

    public abstract void e(int i);

    public abstract int f();

    public abstract long g();

    public abstract int h();

    public abstract boolean i();

    public abstract String j();

    public abstract String k();

    public abstract fgy l();

    public abstract int m();

    public abstract int n();

    public abstract int o();

    public abstract long p();

    public abstract int q();

    public abstract long r();

    abstract long s();

    public abstract boolean t();

    public abstract int u();

    public static fhk a(InputStream inputStream) {
        if (inputStream != null) {
            return new fhm(inputStream, 4096);
        }
        byte[] bArr = fiv.b;
        return a(bArr, 0, bArr.length, false);
    }

    public static fhk a(byte[] bArr) {
        return a(bArr, 0, bArr.length, false);
    }

    public static fhk a(byte[] bArr, int i, int i2, boolean z) {
        fhl fhlVar = new fhl(bArr, i, i2, z);
        try {
            fhlVar.c(i2);
            return fhlVar;
        } catch (fjg e) {
            throw new IllegalArgumentException(e);
        }
    }

    fhk() {
    }

    public static int f(int i) {
        return (i >>> 1) ^ (-(i & 1));
    }

    public static long a(long j) {
        return (j >>> 1) ^ (-(1 & j));
    }
}

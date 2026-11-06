package flm;

import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fms {
    public final byte[] a;
    public final int b;
    public int c;
    public int d;
    public int f;
    private final int h;
    private int i;
    private int j;
    private fhk k;
    public int e = Integer.MAX_VALUE;
    public int g = 64;

    public static fms a(byte[] bArr, int i, int i2) {
        return new fms(bArr, i, i2);
    }

    public final int a() throws fna {
        if (this.d == this.c) {
            this.j = 0;
            return 0;
        }
        this.j = d();
        if (this.j == 0) {
            throw new fna("Protocol message contained an invalid tag (zero).");
        }
        return this.j;
    }

    public final void a(int i) throws fna {
        if (this.j != i) {
            throw new fna("Protocol message end-group tag did not match expected tag.");
        }
    }

    public final boolean b(int i) throws fna {
        int iA;
        switch (i & 7) {
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
                d();
                return true;
            case 1:
                g();
                return true;
            case 2:
                f(d());
                return true;
            case 3:
                break;
            case 4:
                return false;
            case 5:
                f();
                return true;
            default:
                throw new fna("Protocol message tag had invalid wire type.");
        }
        do {
            iA = a();
            if (iA != 0) {
            }
            a(((i >>> 3) << 3) | 4);
            return true;
        } while (b(iA));
        a(((i >>> 3) << 3) | 4);
        return true;
    }

    public final boolean b() {
        return d() != 0;
    }

    public final String c() throws fna {
        int iD = d();
        if (iD < 0) {
            throw fna.b();
        }
        if (iD > this.c - this.d) {
            throw fna.a();
        }
        String str = new String(this.a, this.d, iD, fmz.a);
        this.d = iD + this.d;
        return str;
    }

    public final void a(fnb fnbVar) throws fna {
        int iD = d();
        if (this.f >= this.g) {
            throw fna.d();
        }
        int iC = c(iD);
        this.f++;
        fnbVar.a(this);
        a(0);
        this.f--;
        d(iC);
    }

    public final int d() throws fna {
        byte bL = l();
        if (bL < 0) {
            int i = bL & 127;
            byte bL2 = l();
            if (bL2 >= 0) {
                return i | (bL2 << 7);
            }
            int i2 = i | ((bL2 & 127) << 7);
            byte bL3 = l();
            if (bL3 >= 0) {
                return i2 | (bL3 << 14);
            }
            int i3 = i2 | ((bL3 & 127) << 14);
            byte bL4 = l();
            if (bL4 >= 0) {
                return i3 | (bL4 << 21);
            }
            int i4 = i3 | ((bL4 & 127) << 21);
            byte bL5 = l();
            int i5 = i4 | (bL5 << 28);
            if (bL5 < 0) {
                for (int i6 = 0; i6 < 5; i6++) {
                    if (l() >= 0) {
                        return i5;
                    }
                }
                throw fna.c();
            }
            return i5;
        }
        return bL;
    }

    public final long e() throws fna {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte bL = l();
            j |= ((long) (bL & 127)) << i;
            if ((bL & 128) == 0) {
                return j;
            }
        }
        throw fna.c();
    }

    public final int f() throws fna {
        return (l() & 255) | ((l() & 255) << 8) | ((l() & 255) << 16) | ((l() & 255) << 24);
    }

    public final long g() throws fna {
        byte bL = l();
        return ((((long) l()) & 255) << 8) | (((long) bL) & 255) | ((((long) l()) & 255) << 16) | ((((long) l()) & 255) << 24) | ((((long) l()) & 255) << 32) | ((((long) l()) & 255) << 40) | ((((long) l()) & 255) << 48) | ((((long) l()) & 255) << 56);
    }

    private fms(byte[] bArr, int i, int i2) {
        this.a = bArr;
        this.b = i;
        int i3 = i + i2;
        this.c = i3;
        this.h = i3;
        this.d = i;
    }

    private final fhk j() throws IOException {
        if (this.k == null) {
            this.k = fhk.a(this.a, this.b, this.h, false);
        }
        int iU = this.k.u();
        int i = this.d - this.b;
        if (iU > i) {
            throw new IOException(String.format("CodedInputStream read ahead of CodedInputByteBufferNano: %s > %s", Integer.valueOf(iU), Integer.valueOf(i)));
        }
        this.k.e(i - iU);
        fhk fhkVar = this.k;
        int i2 = this.g - this.f;
        if (i2 < 0) {
            throw new IllegalArgumentException(new StringBuilder(47).append("Recursion limit cannot be negative: ").append(i2).toString());
        }
        int i3 = fhkVar.b;
        fhkVar.b = i2;
        return this.k;
    }

    public final fin a(fko fkoVar) throws fna {
        try {
            fin finVar = (fin) j().a(fkoVar, fib.b());
            b(this.j);
            return finVar;
        } catch (fjg e) {
            throw new fna("", e);
        }
    }

    public final fin a(fko fkoVar, int i) throws fna {
        try {
            fin finVar = (fin) j().a(i, fkoVar, fib.b());
            b(this.j);
            return finVar;
        } catch (fjg e) {
            throw new fna("", e);
        }
    }

    public final int c(int i) throws fna {
        if (i < 0) {
            throw fna.b();
        }
        int i2 = this.d + i;
        int i3 = this.e;
        if (i2 > i3) {
            throw fna.a();
        }
        this.e = i2;
        k();
        return i3;
    }

    private final void k() {
        this.c += this.i;
        int i = this.c;
        if (i > this.e) {
            this.i = i - this.e;
            this.c -= this.i;
        } else {
            this.i = 0;
        }
    }

    public final void d(int i) {
        this.e = i;
        k();
    }

    public final int h() {
        if (this.e == Integer.MAX_VALUE) {
            return -1;
        }
        return this.e - this.d;
    }

    public final int i() {
        return this.d - this.b;
    }

    public final void e(int i) {
        a(i, this.j);
    }

    final void a(int i, int i2) {
        if (i > this.d - this.b) {
            throw new IllegalArgumentException(new StringBuilder(50).append("Position ").append(i).append(" is beyond current ").append(this.d - this.b).toString());
        }
        if (i < 0) {
            throw new IllegalArgumentException(new StringBuilder(24).append("Bad position ").append(i).toString());
        }
        this.d = this.b + i;
        this.j = i2;
    }

    private final byte l() throws fna {
        if (this.d == this.c) {
            throw fna.a();
        }
        byte[] bArr = this.a;
        int i = this.d;
        this.d = i + 1;
        return bArr[i];
    }

    public final void f(int i) throws fna {
        if (i < 0) {
            throw fna.b();
        }
        if (this.d + i > this.e) {
            f(this.e - this.d);
            throw fna.a();
        }
        if (i <= this.c - this.d) {
            this.d += i;
            return;
        }
        throw fna.a();
    }
}

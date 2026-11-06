package flm;

import java.io.EOFException;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class guc implements gud, gue, Cloneable {
    public static final byte[] a = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};
    public gum b;
    public long c;

    @Override // flm.gue
    public final guc a() {
        return this;
    }

    @Override // flm.gue
    public final boolean b() {
        return this.c == 0;
    }

    @Override // flm.gue
    public final void a(long j) throws EOFException {
        if (this.c < j) {
            throw new EOFException();
        }
    }

    @Override // flm.gue
    public final byte c() {
        if (this.c == 0) {
            throw new IllegalStateException("size == 0");
        }
        gum gumVar = this.b;
        int i = gumVar.b;
        int i2 = gumVar.c;
        int i3 = i + 1;
        byte b = gumVar.a[i];
        this.c--;
        if (i3 == i2) {
            this.b = gumVar.a();
            gun.a(gumVar);
        } else {
            gumVar.b = i3;
        }
        return b;
    }

    public final byte b(long j) {
        gut.a(this.c, j, 1L);
        gum gumVar = this.b;
        while (true) {
            int i = gumVar.c - gumVar.b;
            if (j < i) {
                return gumVar.a[gumVar.b + ((int) j)];
            }
            j -= (long) i;
            gumVar = gumVar.f;
        }
    }

    @Override // flm.gue
    public final short d() {
        if (this.c < 2) {
            throw new IllegalStateException("size < 2: " + this.c);
        }
        gum gumVar = this.b;
        int i = gumVar.b;
        int i2 = gumVar.c;
        if (i2 - i < 2) {
            return (short) (((c() & 255) << 8) | (c() & 255));
        }
        byte[] bArr = gumVar.a;
        int i3 = i + 1;
        int i4 = i3 + 1;
        int i5 = ((bArr[i] & 255) << 8) | (bArr[i3] & 255);
        this.c -= 2;
        if (i4 == i2) {
            this.b = gumVar.a();
            gun.a(gumVar);
        } else {
            gumVar.b = i4;
        }
        return (short) i5;
    }

    @Override // flm.gue
    public final int e() {
        if (this.c < 4) {
            throw new IllegalStateException("size < 4: " + this.c);
        }
        gum gumVar = this.b;
        int i = gumVar.b;
        int i2 = gumVar.c;
        if (i2 - i < 4) {
            return ((c() & 255) << 24) | ((c() & 255) << 16) | ((c() & 255) << 8) | (c() & 255);
        }
        byte[] bArr = gumVar.a;
        int i3 = i + 1;
        int i4 = i3 + 1;
        int i5 = ((bArr[i] & 255) << 24) | ((bArr[i3] & 255) << 16);
        int i6 = i4 + 1;
        int i7 = i5 | ((bArr[i4] & 255) << 8);
        int i8 = i6 + 1;
        int i9 = i7 | (bArr[i6] & 255);
        this.c -= 4;
        if (i8 == i2) {
            this.b = gumVar.a();
            gun.a(gumVar);
            return i9;
        }
        gumVar.b = i8;
        return i9;
    }

    public final guf f() {
        return new guf(h());
    }

    @Override // flm.gue
    public final guf c(long j) {
        return new guf(e(j));
    }

    public final String g() {
        try {
            return a(this.c, gut.a);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    private final String g(long j) {
        return a(j, gut.a);
    }

    private final String a(long j, Charset charset) {
        gut.a(this.c, 0L, j);
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        }
        if (j > 2147483647L) {
            throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + j);
        }
        if (j == 0) {
            return "";
        }
        gum gumVar = this.b;
        if (((long) gumVar.b) + j > gumVar.c) {
            return new String(e(j), charset);
        }
        String str = new String(gumVar.a, gumVar.b, (int) j, charset);
        gumVar.b = (int) (((long) gumVar.b) + j);
        this.c -= j;
        if (gumVar.b == gumVar.c) {
            this.b = gumVar.a();
            gun.a(gumVar);
            return str;
        }
        return str;
    }

    public final String d(long j) throws EOFException {
        if (j > 0 && b(j - 1) == 13) {
            String strG = g(j - 1);
            f(2L);
            return strG;
        }
        String strG2 = g(j);
        f(1L);
        return strG2;
    }

    public final byte[] h() {
        try {
            return e(this.c);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    @Override // flm.gue
    public final byte[] e(long j) throws EOFException {
        gut.a(this.c, 0L, j);
        if (j > 2147483647L) {
            throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + j);
        }
        byte[] bArr = new byte[(int) j];
        int i = 0;
        while (i < bArr.length) {
            int iA = a(bArr, i, bArr.length - i);
            if (iA == -1) {
                throw new EOFException();
            }
            i += iA;
        }
        return bArr;
    }

    public final int a(byte[] bArr, int i, int i2) {
        gut.a(bArr.length, i, i2);
        gum gumVar = this.b;
        if (gumVar == null) {
            return -1;
        }
        int iMin = Math.min(i2, gumVar.c - gumVar.b);
        System.arraycopy(gumVar.a, gumVar.b, bArr, i, iMin);
        gumVar.b += iMin;
        this.c -= (long) iMin;
        if (gumVar.b == gumVar.c) {
            this.b = gumVar.a();
            gun.a(gumVar);
            return iMin;
        }
        return iMin;
    }

    public final void i() {
        try {
            f(this.c);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    @Override // flm.gue
    public final void f(long j) throws EOFException {
        while (j > 0) {
            if (this.b == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j, this.b.c - this.b.b);
            this.c -= (long) iMin;
            j -= (long) iMin;
            gum gumVar = this.b;
            gumVar.b = iMin + gumVar.b;
            if (this.b.b == this.b.c) {
                gum gumVar2 = this.b;
                this.b = gumVar2.a();
                gun.a(gumVar2);
            }
        }
    }

    public final guc a(String str, int i, int i2) {
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        }
        if (i < 0) {
            throw new IllegalArgumentException("beginIndex < 0: " + i);
        }
        if (i2 < i) {
            throw new IllegalArgumentException("endIndex < beginIndex: " + i2 + " < " + i);
        }
        if (i2 > str.length()) {
            throw new IllegalArgumentException("endIndex > string.length: " + i2 + " > " + str.length());
        }
        while (i < i2) {
            char cCharAt = str.charAt(i);
            if (cCharAt < 128) {
                gum gumVarA = a(1);
                byte[] bArr = gumVarA.a;
                int i3 = gumVarA.c - i;
                int iMin = Math.min(i2, 8192 - i3);
                int i4 = i + 1;
                bArr[i3 + i] = (byte) cCharAt;
                while (i4 < iMin) {
                    char cCharAt2 = str.charAt(i4);
                    if (cCharAt2 >= 128) {
                        break;
                    }
                    bArr[i4 + i3] = (byte) cCharAt2;
                    i4++;
                }
                int i5 = (i4 + i3) - gumVarA.c;
                gumVarA.c += i5;
                this.c += (long) i5;
                i = i4;
            } else if (cCharAt < 2048) {
                gum gumVarA2 = a(1);
                byte[] bArr2 = gumVarA2.a;
                int i6 = gumVarA2.c;
                gumVarA2.c = i6 + 1;
                bArr2[i6] = (byte) ((cCharAt >> 6) | 192);
                this.c++;
                int i7 = (cCharAt & '?') | 128;
                gum gumVarA3 = a(1);
                byte[] bArr3 = gumVarA3.a;
                int i8 = gumVarA3.c;
                gumVarA3.c = i8 + 1;
                bArr3[i8] = (byte) i7;
                this.c++;
                i++;
            } else if (cCharAt < 55296 || cCharAt > 57343) {
                gum gumVarA4 = a(1);
                byte[] bArr4 = gumVarA4.a;
                int i9 = gumVarA4.c;
                gumVarA4.c = i9 + 1;
                bArr4[i9] = (byte) ((cCharAt >> '\f') | 224);
                this.c++;
                gum gumVarA5 = a(1);
                byte[] bArr5 = gumVarA5.a;
                int i10 = gumVarA5.c;
                gumVarA5.c = i10 + 1;
                bArr5[i10] = (byte) (((cCharAt >> 6) & 63) | 128);
                this.c++;
                int i11 = (cCharAt & '?') | 128;
                gum gumVarA6 = a(1);
                byte[] bArr6 = gumVarA6.a;
                int i12 = gumVarA6.c;
                gumVarA6.c = i12 + 1;
                bArr6[i12] = (byte) i11;
                this.c++;
                i++;
            } else {
                char cCharAt3 = i + 1 < i2 ? str.charAt(i + 1) : (char) 0;
                if (cCharAt > 56319 || cCharAt3 < 56320 || cCharAt3 > 57343) {
                    gum gumVarA7 = a(1);
                    byte[] bArr7 = gumVarA7.a;
                    int i13 = gumVarA7.c;
                    gumVarA7.c = i13 + 1;
                    bArr7[i13] = (byte) 63;
                    this.c++;
                    i++;
                } else {
                    int i14 = 65536 + ((cCharAt3 & (-56321)) | ((cCharAt & (-55297)) << 10));
                    gum gumVarA8 = a(1);
                    byte[] bArr8 = gumVarA8.a;
                    int i15 = gumVarA8.c;
                    gumVarA8.c = i15 + 1;
                    bArr8[i15] = (byte) ((i14 >> 18) | 240);
                    this.c++;
                    gum gumVarA9 = a(1);
                    byte[] bArr9 = gumVarA9.a;
                    int i16 = gumVarA9.c;
                    gumVarA9.c = i16 + 1;
                    bArr9[i16] = (byte) (((i14 >> 12) & 63) | 128);
                    this.c++;
                    gum gumVarA10 = a(1);
                    byte[] bArr10 = gumVarA10.a;
                    int i17 = gumVarA10.c;
                    gumVarA10.c = i17 + 1;
                    bArr10[i17] = (byte) (((i14 >> 6) & 63) | 128);
                    this.c++;
                    int i18 = (i14 & 63) | 128;
                    gum gumVarA11 = a(1);
                    byte[] bArr11 = gumVarA11.a;
                    int i19 = gumVarA11.c;
                    gumVarA11.c = i19 + 1;
                    bArr11[i19] = (byte) i18;
                    this.c++;
                    i += 2;
                }
            }
        }
        return this;
    }

    public final guc b(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            throw new IllegalArgumentException("source == null");
        }
        gut.a(bArr.length, i, i2);
        int i3 = i + i2;
        while (i < i3) {
            gum gumVarA = a(1);
            int iMin = Math.min(i3 - i, 8192 - gumVarA.c);
            System.arraycopy(bArr, i, gumVarA.a, gumVarA.c, iMin);
            i += iMin;
            gumVarA.c = iMin + gumVarA.c;
        }
        this.c += (long) i2;
        return this;
    }

    public final gum a(int i) {
        if (i <= 0 || i > 8192) {
            throw new IllegalArgumentException();
        }
        if (this.b == null) {
            this.b = gun.a();
            gum gumVar = this.b;
            gum gumVar2 = this.b;
            gum gumVar3 = this.b;
            gumVar2.g = gumVar3;
            gumVar.f = gumVar3;
            return gumVar3;
        }
        gum gumVar4 = this.b.g;
        if (gumVar4.c + i > 8192 || !gumVar4.e) {
            return gumVar4.a(gun.a());
        }
        return gumVar4;
    }

    @Override // flm.gup
    public final void a_(guc gucVar, long j) {
        gum gumVarA;
        if (gucVar == null) {
            throw new IllegalArgumentException("source == null");
        }
        if (gucVar == this) {
            throw new IllegalArgumentException("source == this");
        }
        gut.a(gucVar.c, 0L, j);
        while (j > 0) {
            if (j < gucVar.b.c - gucVar.b.b) {
                gum gumVar = this.b != null ? this.b.g : null;
                if (gumVar != null && gumVar.e) {
                    if ((((long) gumVar.c) + j) - ((long) (gumVar.d ? 0 : gumVar.b)) <= 8192) {
                        gucVar.b.a(gumVar, (int) j);
                        gucVar.c -= j;
                        this.c += j;
                        return;
                    }
                }
                gum gumVar2 = gucVar.b;
                int i = (int) j;
                if (i <= 0 || i > gumVar2.c - gumVar2.b) {
                    throw new IllegalArgumentException();
                }
                if (i >= 1024) {
                    gumVarA = new gum(gumVar2);
                } else {
                    gumVarA = gun.a();
                    System.arraycopy(gumVar2.a, gumVar2.b, gumVarA.a, 0, i);
                }
                gumVarA.c = gumVarA.b + i;
                gumVar2.b = i + gumVar2.b;
                gumVar2.g.a(gumVarA);
                gucVar.b = gumVarA;
            }
            gum gumVar3 = gucVar.b;
            long j2 = gumVar3.c - gumVar3.b;
            gucVar.b = gumVar3.a();
            if (this.b == null) {
                this.b = gumVar3;
                gum gumVar4 = this.b;
                gum gumVar5 = this.b;
                gum gumVar6 = this.b;
                gumVar5.g = gumVar6;
                gumVar4.f = gumVar6;
            } else {
                gum gumVarA2 = this.b.g.a(gumVar3);
                if (gumVarA2.g == gumVarA2) {
                    throw new IllegalStateException();
                }
                if (gumVarA2.g.e) {
                    int i2 = gumVarA2.c - gumVarA2.b;
                    if (i2 <= (gumVarA2.g.d ? 0 : gumVarA2.g.b) + (8192 - gumVarA2.g.c)) {
                        gumVarA2.a(gumVarA2.g, i2);
                        gumVarA2.a();
                        gun.a(gumVarA2);
                    }
                }
            }
            gucVar.c -= j2;
            this.c += j2;
            j -= j2;
        }
    }

    @Override // flm.guq
    public final long a(guc gucVar, long j) {
        if (gucVar == null) {
            throw new IllegalArgumentException("sink == null");
        }
        if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        }
        if (this.c == 0) {
            return -1L;
        }
        if (j > this.c) {
            j = this.c;
        }
        gucVar.a_(this, j);
        return j;
    }

    @Override // flm.gud, flm.gup, java.io.Flushable
    public final void flush() {
    }

    @Override // flm.gup, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    public final boolean equals(Object obj) {
        long j = 0;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof guc)) {
            return false;
        }
        guc gucVar = (guc) obj;
        if (this.c != gucVar.c) {
            return false;
        }
        if (this.c == 0) {
            return true;
        }
        gum gumVar = this.b;
        gum gumVar2 = gucVar.b;
        int i = gumVar.b;
        int i2 = gumVar2.b;
        while (j < this.c) {
            long jMin = Math.min(gumVar.c - i, gumVar2.c - i2);
            int i3 = 0;
            while (i3 < jMin) {
                int i4 = i + 1;
                byte b = gumVar.a[i];
                int i5 = i2 + 1;
                if (b != gumVar2.a[i2]) {
                    return false;
                }
                i3++;
                i2 = i5;
                i = i4;
            }
            if (i == gumVar.c) {
                gumVar = gumVar.f;
                i = gumVar.b;
            }
            if (i2 == gumVar2.c) {
                gumVar2 = gumVar2.f;
                i2 = gumVar2.b;
            }
            j += jMin;
        }
        return true;
    }

    public final int hashCode() {
        gum gumVar = this.b;
        if (gumVar == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = gumVar.b;
            int i3 = gumVar.c;
            while (i2 < i3) {
                int i4 = gumVar.a[i2] + (i * 31);
                i2++;
                i = i4;
            }
            gumVar = gumVar.f;
        } while (gumVar != this.b);
        return i;
    }

    public final String toString() {
        if (this.c > 2147483647L) {
            throw new IllegalArgumentException("size > Integer.MAX_VALUE: " + this.c);
        }
        int i = (int) this.c;
        return (i == 0 ? guf.a : new guo(this, i)).toString();
    }

    public final /* synthetic */ Object clone() {
        guc gucVar = new guc();
        if (this.c == 0) {
            return gucVar;
        }
        gucVar.b = new gum(this.b);
        gum gumVar = gucVar.b;
        gum gumVar2 = gucVar.b;
        gum gumVar3 = gucVar.b;
        gumVar2.g = gumVar3;
        gumVar.f = gumVar3;
        for (gum gumVar4 = this.b.f; gumVar4 != this.b; gumVar4 = gumVar4.f) {
            gucVar.b.g.a(new gum(gumVar4));
        }
        gucVar.c = this.c;
        return gucVar;
    }

    @Override // flm.gud
    public final /* synthetic */ gud b(int i) {
        gum gumVarA = a(4);
        byte[] bArr = gumVarA.a;
        int i2 = gumVarA.c;
        int i3 = i2 + 1;
        bArr[i2] = (byte) (i >>> 24);
        int i4 = i3 + 1;
        bArr[i3] = (byte) (i >>> 16);
        int i5 = i4 + 1;
        bArr[i4] = (byte) (i >>> 8);
        bArr[i5] = (byte) i;
        gumVarA.c = i5 + 1;
        this.c += 4;
        return this;
    }

    @Override // flm.gud
    public final /* synthetic */ gud c(int i) {
        gum gumVarA = a(2);
        byte[] bArr = gumVarA.a;
        int i2 = gumVarA.c;
        int i3 = i2 + 1;
        bArr[i2] = (byte) (i >>> 8);
        bArr[i3] = (byte) i;
        gumVarA.c = i3 + 1;
        this.c += 2;
        return this;
    }

    @Override // flm.gud
    public final /* synthetic */ gud d(int i) {
        gum gumVarA = a(1);
        byte[] bArr = gumVarA.a;
        int i2 = gumVarA.c;
        gumVarA.c = i2 + 1;
        bArr[i2] = (byte) i;
        this.c++;
        return this;
    }

    @Override // flm.gud
    public final /* synthetic */ gud a(String str) {
        return a(str, 0, str.length());
    }

    @Override // flm.gud
    public final /* synthetic */ gud a(byte[] bArr) {
        if (bArr == null) {
            throw new IllegalArgumentException("source == null");
        }
        return b(bArr, 0, bArr.length);
    }
}

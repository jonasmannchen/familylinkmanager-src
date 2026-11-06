package flm;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class fhm extends fhk {
    private final InputStream e;
    private final byte[] f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l = Integer.MAX_VALUE;
    private fhn m = null;

    fhm(InputStream inputStream, int i) {
        fiv.a((Object) inputStream, "input");
        this.e = inputStream;
        this.f = new byte[i];
        this.g = 0;
        this.i = 0;
        this.k = 0;
    }

    @Override // flm.fhk
    public final int a() throws fjg {
        if (t()) {
            this.j = 0;
            return 0;
        }
        this.j = v();
        if ((this.j >>> 3) == 0) {
            throw fjg.d();
        }
        return this.j;
    }

    @Override // flm.fhk
    public final void a(int i) throws fjg {
        if (this.j != i) {
            throw fjg.e();
        }
    }

    @Override // flm.fhk
    public final boolean b(int i) throws fjg {
        int iA;
        int i2 = 0;
        switch (i & 7) {
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
                if (this.g - this.i >= 10) {
                    while (i2 < 10) {
                        byte[] bArr = this.f;
                        int i3 = this.i;
                        this.i = i3 + 1;
                        if (bArr[i3] >= 0) {
                            return true;
                        }
                        i2++;
                    }
                    throw fjg.c();
                }
                while (i2 < 10) {
                    if (A() >= 0) {
                        return true;
                    }
                    i2++;
                }
                throw fjg.c();
            case 1:
                e(8);
                return true;
            case 2:
                e(v());
                return true;
            case 3:
                break;
            case 4:
                return false;
            case 5:
                e(4);
                return true;
            default:
                throw fjg.f();
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

    @Override // flm.fhk
    public final double b() {
        return Double.longBitsToDouble(y());
    }

    @Override // flm.fhk
    public final float c() {
        return Float.intBitsToFloat(x());
    }

    @Override // flm.fhk
    public final long d() {
        return w();
    }

    @Override // flm.fhk
    public final long e() {
        return w();
    }

    @Override // flm.fhk
    public final int f() {
        return v();
    }

    @Override // flm.fhk
    public final long g() {
        return y();
    }

    @Override // flm.fhk
    public final int h() {
        return x();
    }

    @Override // flm.fhk
    public final boolean i() {
        return w() != 0;
    }

    @Override // flm.fhk
    public final String j() throws fjg {
        int iV = v();
        if (iV > 0 && iV <= this.g - this.i) {
            String str = new String(this.f, this.i, iV, fiv.a);
            this.i = iV + this.i;
            return str;
        }
        if (iV == 0) {
            return "";
        }
        if (iV <= this.g) {
            g(iV);
            String str2 = new String(this.f, this.i, iV, fiv.a);
            this.i = iV + this.i;
            return str2;
        }
        return new String(i(iV), fiv.a);
    }

    @Override // flm.fhk
    public final String k() throws IOException {
        byte[] bArrI;
        int iV = v();
        int i = this.i;
        if (iV <= this.g - i && iV > 0) {
            bArrI = this.f;
            this.i = i + iV;
        } else {
            if (iV == 0) {
                return "";
            }
            if (iV <= this.g) {
                g(iV);
                byte[] bArr = this.f;
                this.i = iV + 0;
                bArrI = bArr;
                i = 0;
            } else {
                bArrI = i(iV);
                i = 0;
            }
        }
        return fmc.c(bArrI, i, iV);
    }

    @Override // flm.fhk
    public final fke a(int i, fko fkoVar, fib fibVar) throws fjg {
        if (this.a >= this.b) {
            throw fjg.g();
        }
        this.a++;
        fke fkeVar = (fke) fkoVar.b(this, fibVar);
        a(4 | (i << 3));
        this.a--;
        return fkeVar;
    }

    @Override // flm.fhk
    public final fke a(fko fkoVar, fib fibVar) throws fjg {
        int iV = v();
        if (this.a >= this.b) {
            throw fjg.g();
        }
        int iC = c(iV);
        this.a++;
        fke fkeVar = (fke) fkoVar.b(this, fibVar);
        a(0);
        this.a--;
        d(iC);
        return fkeVar;
    }

    @Override // flm.fhk
    public final fgy l() throws IOException {
        int iV = v();
        if (iV <= this.g - this.i && iV > 0) {
            fgy fgyVarA = fgy.a(this.f, this.i, iV);
            this.i = iV + this.i;
            return fgyVarA;
        }
        if (iV == 0) {
            return fgy.a;
        }
        byte[] bArrJ = j(iV);
        if (bArrJ != null) {
            return fgy.b(bArrJ);
        }
        int i = this.i;
        int i2 = this.g - this.i;
        this.k += this.g;
        this.i = 0;
        this.g = 0;
        List listK = k(iV - i2);
        ArrayList arrayList = new ArrayList(listK.size() + 1);
        arrayList.add(fgy.a(this.f, i, i2));
        Iterator it = listK.iterator();
        while (it.hasNext()) {
            arrayList.add(fgy.b((byte[]) it.next()));
        }
        return fgy.a(arrayList);
    }

    @Override // flm.fhk
    public final int m() {
        return v();
    }

    @Override // flm.fhk
    public final int n() {
        return v();
    }

    @Override // flm.fhk
    public final int o() {
        return x();
    }

    @Override // flm.fhk
    public final long p() {
        return y();
    }

    @Override // flm.fhk
    public final int q() {
        return f(v());
    }

    @Override // flm.fhk
    public final long r() {
        return a(w());
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0072 A[PHI: r2
  0x0072: PHI (r2v7 int) = (r2v6 int), (r2v9 int), (r2v11 int) binds: [B:21:0x004c, B:25:0x0058, B:29:0x0064] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006a, code lost:
    
        if (r3[r2] < 0) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int v() {
        /*
            r5 = this;
            int r0 = r5.i
            int r1 = r5.g
            if (r1 == r0) goto L6c
            byte[] r3 = r5.f
            int r2 = r0 + 1
            r0 = r3[r0]
            if (r0 < 0) goto L11
            r5.i = r2
        L10:
            return r0
        L11:
            int r1 = r5.g
            int r1 = r1 - r2
            r4 = 9
            if (r1 < r4) goto L6c
            int r1 = r2 + 1
            r2 = r3[r2]
            int r2 = r2 << 7
            r0 = r0 ^ r2
            if (r0 >= 0) goto L26
            r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
        L23:
            r5.i = r1
            goto L10
        L26:
            int r2 = r1 + 1
            r1 = r3[r1]
            int r1 = r1 << 14
            r0 = r0 ^ r1
            if (r0 < 0) goto L33
            r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            r1 = r2
            goto L23
        L33:
            int r1 = r2 + 1
            r2 = r3[r2]
            int r2 = r2 << 21
            r0 = r0 ^ r2
            if (r0 >= 0) goto L41
            r2 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r2
            goto L23
        L41:
            int r2 = r1 + 1
            r1 = r3[r1]
            int r4 = r1 << 28
            r0 = r0 ^ r4
            r4 = 266354560(0xfe03f80, float:2.2112565E-29)
            r0 = r0 ^ r4
            if (r1 >= 0) goto L72
            int r1 = r2 + 1
            r2 = r3[r2]
            if (r2 >= 0) goto L23
            int r2 = r1 + 1
            r1 = r3[r1]
            if (r1 >= 0) goto L72
            int r1 = r2 + 1
            r2 = r3[r2]
            if (r2 >= 0) goto L23
            int r2 = r1 + 1
            r1 = r3[r1]
            if (r1 >= 0) goto L72
            int r1 = r2 + 1
            r2 = r3[r2]
            if (r2 >= 0) goto L23
        L6c:
            long r0 = r5.s()
            int r0 = (int) r0
            goto L10
        L72:
            r1 = r2
            goto L23
        */
        throw new UnsupportedOperationException("Method not decompiled: flm.fhm.v():int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b2, code lost:
    
        if (r4[r3] < 0) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final long w() {
        /*
            r10 = this;
            r8 = 0
            int r0 = r10.i
            int r1 = r10.g
            if (r1 == r0) goto Lb4
            byte[] r4 = r10.f
            int r1 = r0 + 1
            r0 = r4[r0]
            if (r0 < 0) goto L14
            r10.i = r1
            long r0 = (long) r0
        L13:
            return r0
        L14:
            int r2 = r10.g
            int r2 = r2 - r1
            r3 = 9
            if (r2 < r3) goto Lb4
            int r2 = r1 + 1
            r1 = r4[r1]
            int r1 = r1 << 7
            r0 = r0 ^ r1
            if (r0 >= 0) goto L2a
            r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
            long r0 = (long) r0
        L27:
            r10.i = r2
            goto L13
        L2a:
            int r3 = r2 + 1
            r1 = r4[r2]
            int r1 = r1 << 14
            r0 = r0 ^ r1
            if (r0 < 0) goto L38
            r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            long r0 = (long) r0
            r2 = r3
            goto L27
        L38:
            int r2 = r3 + 1
            r1 = r4[r3]
            int r1 = r1 << 21
            r0 = r0 ^ r1
            if (r0 >= 0) goto L47
            r1 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r1
            long r0 = (long) r0
            goto L27
        L47:
            long r0 = (long) r0
            int r3 = r2 + 1
            r2 = r4[r2]
            long r6 = (long) r2
            r2 = 28
            long r6 = r6 << r2
            long r0 = r0 ^ r6
            int r2 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r2 < 0) goto L5b
            r4 = 266354560(0xfe03f80, double:1.315966377E-315)
            long r0 = r0 ^ r4
            r2 = r3
            goto L27
        L5b:
            int r2 = r3 + 1
            r3 = r4[r3]
            long r6 = (long) r3
            r3 = 35
            long r6 = r6 << r3
            long r0 = r0 ^ r6
            int r3 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r3 >= 0) goto L6f
            r4 = -34093383808(0xfffffff80fe03f80, double:NaN)
            long r0 = r0 ^ r4
            goto L27
        L6f:
            int r3 = r2 + 1
            r2 = r4[r2]
            long r6 = (long) r2
            r2 = 42
            long r6 = r6 << r2
            long r0 = r0 ^ r6
            int r2 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r2 < 0) goto L84
            r4 = 4363953127296(0x3f80fe03f80, double:2.1560793202584E-311)
            long r0 = r0 ^ r4
            r2 = r3
            goto L27
        L84:
            int r2 = r3 + 1
            r3 = r4[r3]
            long r6 = (long) r3
            r3 = 49
            long r6 = r6 << r3
            long r0 = r0 ^ r6
            int r3 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r3 >= 0) goto L98
            r4 = -558586000294016(0xfffe03f80fe03f80, double:NaN)
            long r0 = r0 ^ r4
            goto L27
        L98:
            int r3 = r2 + 1
            r2 = r4[r2]
            long r6 = (long) r2
            r2 = 56
            long r6 = r6 << r2
            long r0 = r0 ^ r6
            r6 = 71499008037633920(0xfe03f80fe03f80, double:6.838959413692434E-304)
            long r0 = r0 ^ r6
            int r2 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r2 >= 0) goto Lba
            int r2 = r3 + 1
            r3 = r4[r3]
            long r4 = (long) r3
            int r3 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r3 >= 0) goto L27
        Lb4:
            long r0 = r10.s()
            goto L13
        Lba:
            r2 = r3
            goto L27
        */
        throw new UnsupportedOperationException("Method not decompiled: flm.fhm.w():long");
    }

    @Override // flm.fhk
    final long s() throws fjg {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte bA = A();
            j |= ((long) (bA & 127)) << i;
            if ((bA & 128) == 0) {
                return j;
            }
        }
        throw fjg.c();
    }

    private final int x() throws fjg {
        int i = this.i;
        if (this.g - i < 4) {
            g(4);
            i = this.i;
        }
        byte[] bArr = this.f;
        this.i = i + 4;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    private final long y() throws fjg {
        int i = this.i;
        if (this.g - i < 8) {
            g(8);
            i = this.i;
        }
        byte[] bArr = this.f;
        this.i = i + 8;
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    @Override // flm.fhk
    public final int c(int i) throws fjg {
        if (i < 0) {
            throw fjg.b();
        }
        int i2 = this.k + this.i + i;
        int i3 = this.l;
        if (i2 > i3) {
            throw fjg.a();
        }
        this.l = i2;
        z();
        return i3;
    }

    private final void z() {
        this.g += this.h;
        int i = this.k + this.g;
        if (i > this.l) {
            this.h = i - this.l;
            this.g -= this.h;
        } else {
            this.h = 0;
        }
    }

    @Override // flm.fhk
    public final void d(int i) {
        this.l = i;
        z();
    }

    @Override // flm.fhk
    public final boolean t() {
        return this.i == this.g && !h(1);
    }

    @Override // flm.fhk
    public final int u() {
        return this.k + this.i;
    }

    private final void g(int i) throws fjg {
        if (!h(i)) {
            if (i > (this.c - this.k) - this.i) {
                throw fjg.h();
            }
            throw fjg.a();
        }
    }

    private final boolean h(int i) throws IOException {
        while (this.i + i > this.g) {
            if (i > (this.c - this.k) - this.i || this.k + this.i + i > this.l) {
                return false;
            }
            int i2 = this.i;
            if (i2 > 0) {
                if (this.g > i2) {
                    System.arraycopy(this.f, i2, this.f, 0, this.g - i2);
                }
                this.k += i2;
                this.g -= i2;
                this.i = 0;
            }
            int i3 = this.e.read(this.f, this.g, Math.min(this.f.length - this.g, (this.c - this.k) - this.g));
            if (i3 == 0 || i3 < -1 || i3 > this.f.length) {
                String strValueOf = String.valueOf(this.e.getClass());
                throw new IllegalStateException(new StringBuilder(String.valueOf(strValueOf).length() + 91).append(strValueOf).append("#read(byte[]) returned invalid result: ").append(i3).append("\nThe InputStream implementation is buggy.").toString());
            }
            if (i3 <= 0) {
                return false;
            }
            this.g = i3 + this.g;
            z();
            if (this.g >= i) {
                return true;
            }
        }
        throw new IllegalStateException(new StringBuilder(77).append("refillBuffer() called when ").append(i).append(" bytes were already available in buffer").toString());
    }

    private final byte A() throws fjg {
        if (this.i == this.g) {
            g(1);
        }
        byte[] bArr = this.f;
        int i = this.i;
        this.i = i + 1;
        return bArr[i];
    }

    private final byte[] i(int i) throws IOException {
        byte[] bArrJ = j(i);
        if (bArrJ == null) {
            int i2 = this.i;
            int length = this.g - this.i;
            this.k += this.g;
            this.i = 0;
            this.g = 0;
            List listK = k(i - length);
            byte[] bArr = new byte[i];
            System.arraycopy(this.f, i2, bArr, 0, length);
            Iterator it = listK.iterator();
            while (true) {
                int i3 = length;
                if (!it.hasNext()) {
                    return bArr;
                }
                byte[] bArr2 = (byte[]) it.next();
                System.arraycopy(bArr2, 0, bArr, i3, bArr2.length);
                length = bArr2.length + i3;
            }
        } else {
            return bArrJ;
        }
    }

    private final byte[] j(int i) throws IOException {
        if (i == 0) {
            return fiv.b;
        }
        if (i < 0) {
            throw fjg.b();
        }
        int i2 = this.k + this.i + i;
        if (i2 - this.c > 0) {
            throw fjg.h();
        }
        if (i2 > this.l) {
            e((this.l - this.k) - this.i);
            throw fjg.a();
        }
        int i3 = this.g - this.i;
        int i4 = i - i3;
        if (i4 < 4096 || i4 <= this.e.available()) {
            byte[] bArr = new byte[i];
            System.arraycopy(this.f, this.i, bArr, 0, i3);
            this.k += this.g;
            this.i = 0;
            this.g = 0;
            while (i3 < bArr.length) {
                int i5 = this.e.read(bArr, i3, i - i3);
                if (i5 == -1) {
                    throw fjg.a();
                }
                this.k += i5;
                i3 += i5;
            }
            return bArr;
        }
        return null;
    }

    private final List k(int i) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i > 0) {
            byte[] bArr = new byte[Math.min(i, 4096)];
            int i2 = 0;
            while (i2 < bArr.length) {
                int i3 = this.e.read(bArr, i2, bArr.length - i2);
                if (i3 == -1) {
                    throw fjg.a();
                }
                this.k += i3;
                i2 += i3;
            }
            i -= bArr.length;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    @Override // flm.fhk
    public final void e(int i) throws fjg {
        if (i <= this.g - this.i && i >= 0) {
            this.i += i;
            return;
        }
        if (i < 0) {
            throw fjg.b();
        }
        if (this.k + this.i + i > this.l) {
            e((this.l - this.k) - this.i);
            throw fjg.a();
        }
        this.k += this.i;
        int i2 = this.g - this.i;
        this.g = 0;
        this.i = 0;
        int i3 = i2;
        while (i3 < i) {
            int i4 = i - i3;
            try {
                long jSkip = this.e.skip(i4);
                if (jSkip < 0 || jSkip > i4) {
                    String strValueOf = String.valueOf(this.e.getClass());
                    throw new IllegalStateException(new StringBuilder(String.valueOf(strValueOf).length() + 92).append(strValueOf).append("#skip returned invalid result: ").append(jSkip).append("\nThe InputStream implementation is buggy.").toString());
                }
                i3 = ((int) jSkip) + i3;
            } catch (Throwable th) {
                this.k = i3 + this.k;
                z();
                throw th;
            }
        }
        this.k += i3;
        z();
    }
}

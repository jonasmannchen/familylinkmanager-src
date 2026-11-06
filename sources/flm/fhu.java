package flm;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class fhu extends fhq {
    private final OutputStream g;

    fhu(OutputStream outputStream, int i) {
        super(i);
        if (outputStream == null) {
            throw new NullPointerException("out");
        }
        this.g = outputStream;
    }

    @Override // flm.fhp
    public final void a(int i, int i2) {
        c((i << 3) | i2);
    }

    @Override // flm.fhp
    public final void b(int i, int i2) throws IOException {
        o(20);
        l(i, 0);
        if (i2 >= 0) {
            m(i2);
        } else {
            g(i2);
        }
    }

    @Override // flm.fhp
    public final void c(int i, int i2) throws IOException {
        o(20);
        l(i, 0);
        m(i2);
    }

    @Override // flm.fhp
    public final void e(int i, int i2) throws IOException {
        o(14);
        l(i, 5);
        n(i2);
    }

    @Override // flm.fhp
    public final void a(int i, long j) throws IOException {
        o(20);
        l(i, 0);
        g(j);
    }

    @Override // flm.fhp
    public final void c(int i, long j) throws IOException {
        o(18);
        l(i, 1);
        h(j);
    }

    @Override // flm.fhp
    public final void a(int i, boolean z) throws IOException {
        o(11);
        l(i, 0);
        b((byte) (z ? 1 : 0));
    }

    @Override // flm.fhp
    public final void a(int i, String str) {
        a(i, 2);
        a(str);
    }

    @Override // flm.fhp
    public final void a(int i, fgy fgyVar) {
        a(i, 2);
        a(fgyVar);
    }

    @Override // flm.fhp
    public final void a(fgy fgyVar) {
        c(fgyVar.b());
        fgyVar.a(this);
    }

    @Override // flm.fhp
    public final void d(byte[] bArr, int i, int i2) {
        c(i2);
        c(bArr, 0, i2);
    }

    @Override // flm.fhp
    public final void a(int i, fke fkeVar) {
        a(i, 2);
        a(fkeVar);
    }

    @Override // flm.fhp
    final void a(int i, fke fkeVar, fky fkyVar) {
        a(i, 2);
        a(fkeVar, fkyVar);
    }

    @Override // flm.fhp
    public final void b(int i, fke fkeVar) {
        a(1, 3);
        c(2, i);
        a(3, fkeVar);
        a(1, 4);
    }

    @Override // flm.fhp
    public final void b(int i, fgy fgyVar) {
        a(1, 3);
        c(2, i);
        a(3, fgyVar);
        a(1, 4);
    }

    @Override // flm.fhp
    public final void a(fke fkeVar) {
        c(fkeVar.g());
        fkeVar.a(this);
    }

    @Override // flm.fhp
    final void a(fke fkeVar, fky fkyVar) {
        fgn fgnVar = (fgn) fkeVar;
        int iC = fgnVar.c();
        if (iC == -1) {
            iC = fkyVar.b(fgnVar);
            fgnVar.a(iC);
        }
        c(iC);
        fkyVar.a((Object) fkeVar, this.b);
    }

    @Override // flm.fhp
    public final void a(byte b) throws IOException {
        if (this.e == this.d) {
            k();
        }
        b(b);
    }

    @Override // flm.fhp
    public final void b(int i) {
        if (i >= 0) {
            c(i);
        } else {
            a(i);
        }
    }

    @Override // flm.fhp
    public final void c(int i) throws IOException {
        o(10);
        m(i);
    }

    @Override // flm.fhp
    public final void e(int i) throws IOException {
        o(4);
        n(i);
    }

    @Override // flm.fhp
    public final void a(long j) throws IOException {
        o(10);
        g(j);
    }

    @Override // flm.fhp
    public final void c(long j) throws IOException {
        o(8);
        h(j);
    }

    @Override // flm.fhp
    public final void a(String str) throws IOException {
        int iA;
        try {
            int length = str.length() * 3;
            int iH = h(length);
            if (iH + length > this.d) {
                byte[] bArr = new byte[length];
                int iA2 = fmc.a(str, bArr, 0, length);
                c(iA2);
                a(bArr, 0, iA2);
                return;
            }
            if (length + iH > this.d - this.e) {
                k();
            }
            int iH2 = h(str.length());
            int i = this.e;
            try {
                if (iH2 == iH) {
                    this.e = i + iH2;
                    int iA3 = fmc.a(str, this.c, this.e, this.d - this.e);
                    this.e = i;
                    iA = (iA3 - i) - iH2;
                    m(iA);
                    this.e = iA3;
                } else {
                    iA = fmc.a(str);
                    m(iA);
                    this.e = fmc.a(str, this.c, this.e, iA);
                }
                this.f = iA + this.f;
            } catch (fmg e) {
                this.f -= this.e - i;
                this.e = i;
                throw e;
            } catch (ArrayIndexOutOfBoundsException e2) {
                throw new fht(e2);
            }
        } catch (fmg e3) {
            a(str, e3);
        }
    }

    @Override // flm.fhp
    public final void h() throws IOException {
        if (this.e > 0) {
            k();
        }
    }

    @Override // flm.fhp
    public final void c(byte[] bArr, int i, int i2) throws IOException {
        if (this.d - this.e >= i2) {
            System.arraycopy(bArr, i, this.c, this.e, i2);
            this.e += i2;
            this.f += i2;
            return;
        }
        int i3 = this.d - this.e;
        System.arraycopy(bArr, i, this.c, this.e, i3);
        int i4 = i + i3;
        int i5 = i2 - i3;
        this.e = this.d;
        this.f = i3 + this.f;
        k();
        if (i5 <= this.d) {
            System.arraycopy(bArr, i4, this.c, 0, i5);
            this.e = i5;
        } else {
            this.g.write(bArr, i4, i5);
        }
        this.f += i5;
    }

    @Override // flm.fgx
    public final void a(byte[] bArr, int i, int i2) {
        c(bArr, i, i2);
    }

    private final void o(int i) throws IOException {
        if (this.d - this.e < i) {
            k();
        }
    }

    private final void k() throws IOException {
        this.g.write(this.c, 0, this.e);
        this.e = 0;
    }
}

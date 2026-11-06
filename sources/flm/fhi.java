package flm;

import java.nio.charset.Charset;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
class fhi extends fhh {
    public static final long serialVersionUID = 1;
    public final byte[] c;

    fhi(byte[] bArr) {
        if (bArr == null) {
            throw new NullPointerException();
        }
        this.c = bArr;
    }

    @Override // flm.fgy
    public byte a(int i) {
        return this.c[i];
    }

    @Override // flm.fgy
    byte b(int i) {
        return this.c[i];
    }

    @Override // flm.fgy
    public int b() {
        return this.c.length;
    }

    @Override // flm.fgy
    public final fgy a(int i, int i2) {
        int iC = c(i, i2, b());
        return iC == 0 ? fgy.a : new fhd(this.c, h() + i, iC);
    }

    @Override // flm.fgy
    protected void b(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.c, i, bArr, i2, i3);
    }

    @Override // flm.fgy
    final void a(fgx fgxVar) {
        fgxVar.a(this.c, h(), b());
    }

    @Override // flm.fgy
    protected final String a(Charset charset) {
        return new String(this.c, h(), b(), charset);
    }

    @Override // flm.fgy
    public final boolean e() {
        int iH = h();
        return fmc.a(this.c, iH, b() + iH);
    }

    @Override // flm.fgy
    protected final int a(int i, int i2, int i3) {
        int iH = h() + i2;
        return fmc.a.a(i, this.c, iH, iH + i3);
    }

    @Override // flm.fgy
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof fgy) && b() == ((fgy) obj).b()) {
            if (b() == 0) {
                return true;
            }
            if (obj instanceof fhi) {
                int i = this.b;
                int i2 = ((fhi) obj).b;
                if (i == 0 || i2 == 0 || i == i2) {
                    return a((fhi) obj, 0, b());
                }
                return false;
            }
            return obj.equals(this);
        }
        return false;
    }

    @Override // flm.fhh
    final boolean a(fgy fgyVar, int i, int i2) {
        if (i2 > fgyVar.b()) {
            throw new IllegalArgumentException(new StringBuilder(40).append("Length too large: ").append(i2).append(b()).toString());
        }
        if (i + i2 > fgyVar.b()) {
            throw new IllegalArgumentException(new StringBuilder(59).append("Ran off end of other: ").append(i).append(", ").append(i2).append(", ").append(fgyVar.b()).toString());
        }
        if (fgyVar instanceof fhi) {
            fhi fhiVar = (fhi) fgyVar;
            byte[] bArr = this.c;
            byte[] bArr2 = fhiVar.c;
            int iH = h() + i2;
            int iH2 = h();
            int iH3 = fhiVar.h() + i;
            while (iH2 < iH) {
                if (bArr[iH2] != bArr2[iH3]) {
                    return false;
                }
                iH2++;
                iH3++;
            }
            return true;
        }
        return fgyVar.a(i, i + i2).equals(a(0, i2));
    }

    @Override // flm.fgy
    protected final int b(int i, int i2, int i3) {
        return fiv.a(i, this.c, h() + i2, i3);
    }

    protected int h() {
        return 0;
    }
}

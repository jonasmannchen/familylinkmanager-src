package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
class fhr extends fhp {
    public final int c;
    public int d;
    private final byte[] e;
    private final int f;

    fhr(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            throw new NullPointerException("buffer");
        }
        if ((i | i2 | (bArr.length - (i + i2))) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)));
        }
        this.e = bArr;
        this.c = i;
        this.d = i;
        this.f = i + i2;
    }

    @Override // flm.fhp
    public final void a(int i, int i2) {
        c((i << 3) | i2);
    }

    @Override // flm.fhp
    public final void b(int i, int i2) {
        a(i, 0);
        b(i2);
    }

    @Override // flm.fhp
    public final void c(int i, int i2) {
        a(i, 0);
        c(i2);
    }

    @Override // flm.fhp
    public final void e(int i, int i2) {
        a(i, 5);
        e(i2);
    }

    @Override // flm.fhp
    public final void a(int i, long j) {
        a(i, 0);
        a(j);
    }

    @Override // flm.fhp
    public final void c(int i, long j) {
        a(i, 1);
        c(j);
    }

    @Override // flm.fhp
    public final void a(int i, boolean z) {
        a(i, 0);
        a((byte) (z ? 1 : 0));
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
    public final void a(byte b) throws fht {
        try {
            byte[] bArr = this.e;
            int i = this.d;
            this.d = i + 1;
            bArr[i] = b;
        } catch (IndexOutOfBoundsException e) {
            throw new fht(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.d), Integer.valueOf(this.f), 1), e);
        }
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
    public final void c(int i) throws fht {
        if (fhp.a && i() >= 10) {
            while ((i & (-128)) != 0) {
                byte[] bArr = this.e;
                int i2 = this.d;
                this.d = i2 + 1;
                flw.a(bArr, i2, (byte) ((i & 127) | 128));
                i >>>= 7;
            }
            byte[] bArr2 = this.e;
            int i3 = this.d;
            this.d = i3 + 1;
            flw.a(bArr2, i3, (byte) i);
            return;
        }
        while ((i & (-128)) != 0) {
            try {
                byte[] bArr3 = this.e;
                int i4 = this.d;
                this.d = i4 + 1;
                bArr3[i4] = (byte) ((i & 127) | 128);
                i >>>= 7;
            } catch (IndexOutOfBoundsException e) {
                throw new fht(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.d), Integer.valueOf(this.f), 1), e);
            }
        }
        byte[] bArr4 = this.e;
        int i5 = this.d;
        this.d = i5 + 1;
        bArr4[i5] = (byte) i;
    }

    @Override // flm.fhp
    public final void e(int i) throws fht {
        try {
            byte[] bArr = this.e;
            int i2 = this.d;
            this.d = i2 + 1;
            bArr[i2] = (byte) i;
            byte[] bArr2 = this.e;
            int i3 = this.d;
            this.d = i3 + 1;
            bArr2[i3] = (byte) (i >> 8);
            byte[] bArr3 = this.e;
            int i4 = this.d;
            this.d = i4 + 1;
            bArr3[i4] = (byte) (i >> 16);
            byte[] bArr4 = this.e;
            int i5 = this.d;
            this.d = i5 + 1;
            bArr4[i5] = (byte) (i >>> 24);
        } catch (IndexOutOfBoundsException e) {
            throw new fht(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.d), Integer.valueOf(this.f), 1), e);
        }
    }

    @Override // flm.fhp
    public final void a(long j) throws fht {
        if (fhp.a && i() >= 10) {
            while ((j & (-128)) != 0) {
                byte[] bArr = this.e;
                int i = this.d;
                this.d = i + 1;
                flw.a(bArr, i, (byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
            byte[] bArr2 = this.e;
            int i2 = this.d;
            this.d = i2 + 1;
            flw.a(bArr2, i2, (byte) j);
            return;
        }
        while ((j & (-128)) != 0) {
            try {
                byte[] bArr3 = this.e;
                int i3 = this.d;
                this.d = i3 + 1;
                bArr3[i3] = (byte) ((((int) j) & 127) | 128);
                j >>>= 7;
            } catch (IndexOutOfBoundsException e) {
                throw new fht(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.d), Integer.valueOf(this.f), 1), e);
            }
        }
        byte[] bArr4 = this.e;
        int i4 = this.d;
        this.d = i4 + 1;
        bArr4[i4] = (byte) j;
    }

    @Override // flm.fhp
    public final void c(long j) throws fht {
        try {
            byte[] bArr = this.e;
            int i = this.d;
            this.d = i + 1;
            bArr[i] = (byte) j;
            byte[] bArr2 = this.e;
            int i2 = this.d;
            this.d = i2 + 1;
            bArr2[i2] = (byte) (j >> 8);
            byte[] bArr3 = this.e;
            int i3 = this.d;
            this.d = i3 + 1;
            bArr3[i3] = (byte) (j >> 16);
            byte[] bArr4 = this.e;
            int i4 = this.d;
            this.d = i4 + 1;
            bArr4[i4] = (byte) (j >> 24);
            byte[] bArr5 = this.e;
            int i5 = this.d;
            this.d = i5 + 1;
            bArr5[i5] = (byte) (j >> 32);
            byte[] bArr6 = this.e;
            int i6 = this.d;
            this.d = i6 + 1;
            bArr6[i6] = (byte) (j >> 40);
            byte[] bArr7 = this.e;
            int i7 = this.d;
            this.d = i7 + 1;
            bArr7[i7] = (byte) (j >> 48);
            byte[] bArr8 = this.e;
            int i8 = this.d;
            this.d = i8 + 1;
            bArr8[i8] = (byte) (j >> 56);
        } catch (IndexOutOfBoundsException e) {
            throw new fht(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.d), Integer.valueOf(this.f), 1), e);
        }
    }

    @Override // flm.fhp
    public final void c(byte[] bArr, int i, int i2) throws fht {
        try {
            System.arraycopy(bArr, i, this.e, this.d, i2);
            this.d += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new fht(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.d), Integer.valueOf(this.f), Integer.valueOf(i2)), e);
        }
    }

    @Override // flm.fgx
    public final void a(byte[] bArr, int i, int i2) {
        c(bArr, i, i2);
    }

    @Override // flm.fhp
    public final void a(String str) throws fht {
        int i = this.d;
        try {
            int iH = h(str.length() * 3);
            int iH2 = h(str.length());
            if (iH2 == iH) {
                this.d = i + iH2;
                int iA = fmc.a(str, this.e, this.d, i());
                this.d = i;
                c((iA - i) - iH2);
                this.d = iA;
            } else {
                c(fmc.a(str));
                this.d = fmc.a(str, this.e, this.d, i());
            }
        } catch (fmg e) {
            this.d = i;
            a(str, e);
        } catch (IndexOutOfBoundsException e2) {
            throw new fht(e2);
        }
    }

    @Override // flm.fhp
    public void h() {
    }

    @Override // flm.fhp
    public final int i() {
        return this.f - this.d;
    }
}

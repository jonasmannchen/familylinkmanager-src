package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
abstract class fhq extends fhp {
    public final byte[] c;
    public final int d;
    public int e;
    public int f;

    fhq(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }
        this.c = new byte[Math.max(i, 20)];
        this.d = this.c.length;
    }

    @Override // flm.fhp
    public final int i() {
        throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
    }

    final void b(byte b) {
        byte[] bArr = this.c;
        int i = this.e;
        this.e = i + 1;
        bArr[i] = b;
        this.f++;
    }

    final void l(int i, int i2) {
        m((i << 3) | i2);
    }

    final void m(int i) {
        if (fhp.a) {
            long j = this.e;
            while ((i & (-128)) != 0) {
                byte[] bArr = this.c;
                int i2 = this.e;
                this.e = i2 + 1;
                flw.a(bArr, i2, (byte) ((i & 127) | 128));
                i >>>= 7;
            }
            byte[] bArr2 = this.c;
            int i3 = this.e;
            this.e = i3 + 1;
            flw.a(bArr2, i3, (byte) i);
            this.f = ((int) (((long) this.e) - j)) + this.f;
            return;
        }
        while ((i & (-128)) != 0) {
            byte[] bArr3 = this.c;
            int i4 = this.e;
            this.e = i4 + 1;
            bArr3[i4] = (byte) ((i & 127) | 128);
            this.f++;
            i >>>= 7;
        }
        byte[] bArr4 = this.c;
        int i5 = this.e;
        this.e = i5 + 1;
        bArr4[i5] = (byte) i;
        this.f++;
    }

    final void g(long j) {
        if (fhp.a) {
            long j2 = this.e;
            while ((j & (-128)) != 0) {
                byte[] bArr = this.c;
                int i = this.e;
                this.e = i + 1;
                flw.a(bArr, i, (byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
            byte[] bArr2 = this.c;
            int i2 = this.e;
            this.e = i2 + 1;
            flw.a(bArr2, i2, (byte) j);
            this.f = ((int) (((long) this.e) - j2)) + this.f;
            return;
        }
        while ((j & (-128)) != 0) {
            byte[] bArr3 = this.c;
            int i3 = this.e;
            this.e = i3 + 1;
            bArr3[i3] = (byte) ((((int) j) & 127) | 128);
            this.f++;
            j >>>= 7;
        }
        byte[] bArr4 = this.c;
        int i4 = this.e;
        this.e = i4 + 1;
        bArr4[i4] = (byte) j;
        this.f++;
    }

    final void n(int i) {
        byte[] bArr = this.c;
        int i2 = this.e;
        this.e = i2 + 1;
        bArr[i2] = (byte) i;
        byte[] bArr2 = this.c;
        int i3 = this.e;
        this.e = i3 + 1;
        bArr2[i3] = (byte) (i >> 8);
        byte[] bArr3 = this.c;
        int i4 = this.e;
        this.e = i4 + 1;
        bArr3[i4] = (byte) (i >> 16);
        byte[] bArr4 = this.c;
        int i5 = this.e;
        this.e = i5 + 1;
        bArr4[i5] = (byte) (i >>> 24);
        this.f += 4;
    }

    final void h(long j) {
        byte[] bArr = this.c;
        int i = this.e;
        this.e = i + 1;
        bArr[i] = (byte) (j & 255);
        byte[] bArr2 = this.c;
        int i2 = this.e;
        this.e = i2 + 1;
        bArr2[i2] = (byte) ((j >> 8) & 255);
        byte[] bArr3 = this.c;
        int i3 = this.e;
        this.e = i3 + 1;
        bArr3[i3] = (byte) ((j >> 16) & 255);
        byte[] bArr4 = this.c;
        int i4 = this.e;
        this.e = i4 + 1;
        bArr4[i4] = (byte) ((j >> 24) & 255);
        byte[] bArr5 = this.c;
        int i5 = this.e;
        this.e = i5 + 1;
        bArr5[i5] = (byte) (j >> 32);
        byte[] bArr6 = this.c;
        int i6 = this.e;
        this.e = i6 + 1;
        bArr6[i6] = (byte) (j >> 40);
        byte[] bArr7 = this.c;
        int i7 = this.e;
        this.e = i7 + 1;
        bArr7[i7] = (byte) (j >> 48);
        byte[] bArr8 = this.c;
        int i8 = this.e;
        this.e = i8 + 1;
        bArr8[i8] = (byte) (j >> 56);
        this.f += 8;
    }
}

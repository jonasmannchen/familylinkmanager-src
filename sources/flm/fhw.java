package flm;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class fhw extends fhp {
    private final ByteBuffer c;
    private final ByteBuffer d;
    private final long e;
    private final long f;
    private final long g;
    private final long h;
    private long i;

    fhw(ByteBuffer byteBuffer) {
        this.c = byteBuffer;
        this.d = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
        this.e = flw.a(byteBuffer);
        this.f = this.e + ((long) byteBuffer.position());
        this.g = this.e + ((long) byteBuffer.limit());
        this.h = this.g - 10;
        this.i = this.f;
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
    public final void a(byte b) throws fht {
        if (this.i >= this.g) {
            throw new fht(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.i), Long.valueOf(this.g), 1));
        }
        long j = this.i;
        this.i = 1 + j;
        flw.a(j, b);
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
    public final void b(int i) {
        if (i >= 0) {
            c(i);
        } else {
            a(i);
        }
    }

    @Override // flm.fhp
    public final void c(int i) throws fht {
        if (this.i <= this.h) {
            while ((i & (-128)) != 0) {
                long j = this.i;
                this.i = j + 1;
                flw.a(j, (byte) ((i & 127) | 128));
                i >>>= 7;
            }
            long j2 = this.i;
            this.i = j2 + 1;
            flw.a(j2, (byte) i);
            return;
        }
        while (this.i < this.g) {
            if ((i & (-128)) == 0) {
                long j3 = this.i;
                this.i = j3 + 1;
                flw.a(j3, (byte) i);
                return;
            } else {
                long j4 = this.i;
                this.i = j4 + 1;
                flw.a(j4, (byte) ((i & 127) | 128));
                i >>>= 7;
            }
        }
        throw new fht(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.i), Long.valueOf(this.g), 1));
    }

    @Override // flm.fhp
    public final void e(int i) {
        this.d.putInt((int) (this.i - this.e), i);
        this.i += 4;
    }

    @Override // flm.fhp
    public final void a(long j) throws fht {
        if (this.i <= this.h) {
            while ((j & (-128)) != 0) {
                long j2 = this.i;
                this.i = j2 + 1;
                flw.a(j2, (byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
            long j3 = this.i;
            this.i = j3 + 1;
            flw.a(j3, (byte) j);
            return;
        }
        while (this.i < this.g) {
            if ((j & (-128)) == 0) {
                long j4 = this.i;
                this.i = j4 + 1;
                flw.a(j4, (byte) j);
                return;
            } else {
                long j5 = this.i;
                this.i = j5 + 1;
                flw.a(j5, (byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
        }
        throw new fht(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.i), Long.valueOf(this.g), 1));
    }

    @Override // flm.fhp
    public final void c(long j) {
        this.d.putLong((int) (this.i - this.e), j);
        this.i += 8;
    }

    @Override // flm.fhp
    public final void c(byte[] bArr, int i, int i2) throws fht {
        if (bArr == null || i < 0 || i2 < 0 || bArr.length - i2 < i || this.g - ((long) i2) < this.i) {
            if (bArr == null) {
                throw new NullPointerException("value");
            }
            throw new fht(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.i), Long.valueOf(this.g), Integer.valueOf(i2)));
        }
        flw.a.a(bArr, i, this.i, i2);
        this.i += (long) i2;
    }

    @Override // flm.fgx
    public final void a(byte[] bArr, int i, int i2) {
        c(bArr, i, i2);
    }

    @Override // flm.fhp
    public final void a(String str) throws fht {
        long j = this.i;
        try {
            int iH = h(str.length() * 3);
            int iH2 = h(str.length());
            if (iH2 == iH) {
                int i = ((int) (this.i - this.e)) + iH2;
                this.d.position(i);
                fmc.a(str, this.d);
                int iPosition = this.d.position() - i;
                c(iPosition);
                this.i = ((long) iPosition) + this.i;
            } else {
                int iA = fmc.a(str);
                c(iA);
                g(this.i);
                fmc.a(str, this.d);
                this.i = ((long) iA) + this.i;
            }
        } catch (fmg e) {
            this.i = j;
            g(this.i);
            a(str, e);
        } catch (IllegalArgumentException e2) {
            throw new fht(e2);
        } catch (IndexOutOfBoundsException e3) {
            throw new fht(e3);
        }
    }

    @Override // flm.fhp
    public final void h() {
        this.c.position((int) (this.i - this.e));
    }

    @Override // flm.fhp
    public final int i() {
        return (int) (this.g - this.i);
    }

    private final void g(long j) {
        this.d.position((int) (j - this.e));
    }
}

package flm;

import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class fhv extends fhp {
    private final ByteBuffer c;
    private final ByteBuffer d;

    fhv(ByteBuffer byteBuffer) {
        this.c = byteBuffer;
        this.d = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.position();
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
        try {
            this.d.put(b);
        } catch (BufferOverflowException e) {
            throw new fht(e);
        }
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
        while ((i & (-128)) != 0) {
            try {
                this.d.put((byte) ((i & 127) | 128));
                i >>>= 7;
            } catch (BufferOverflowException e) {
                throw new fht(e);
            }
        }
        this.d.put((byte) i);
    }

    @Override // flm.fhp
    public final void e(int i) throws fht {
        try {
            this.d.putInt(i);
        } catch (BufferOverflowException e) {
            throw new fht(e);
        }
    }

    @Override // flm.fhp
    public final void a(long j) throws fht {
        while (((-128) & j) != 0) {
            try {
                this.d.put((byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            } catch (BufferOverflowException e) {
                throw new fht(e);
            }
        }
        this.d.put((byte) j);
    }

    @Override // flm.fhp
    public final void c(long j) throws fht {
        try {
            this.d.putLong(j);
        } catch (BufferOverflowException e) {
            throw new fht(e);
        }
    }

    @Override // flm.fhp
    public final void c(byte[] bArr, int i, int i2) throws fht {
        try {
            this.d.put(bArr, i, i2);
        } catch (IndexOutOfBoundsException e) {
            throw new fht(e);
        } catch (BufferOverflowException e2) {
            throw new fht(e2);
        }
    }

    @Override // flm.fgx
    public final void a(byte[] bArr, int i, int i2) {
        c(bArr, i, i2);
    }

    @Override // flm.fhp
    public final void a(String str) throws fht {
        int iPosition = this.d.position();
        try {
            int iH = h(str.length() * 3);
            int iH2 = h(str.length());
            if (iH2 == iH) {
                int iPosition2 = this.d.position() + iH2;
                this.d.position(iPosition2);
                c(str);
                int iPosition3 = this.d.position();
                this.d.position(iPosition);
                c(iPosition3 - iPosition2);
                this.d.position(iPosition3);
            } else {
                c(fmc.a(str));
                c(str);
            }
        } catch (fmg e) {
            this.d.position(iPosition);
            a(str, e);
        } catch (IllegalArgumentException e2) {
            throw new fht(e2);
        }
    }

    @Override // flm.fhp
    public final void h() {
        this.c.position(this.d.position());
    }

    @Override // flm.fhp
    public final int i() {
        return this.d.remaining();
    }

    private final void c(String str) throws fht {
        try {
            fmc.a(str, this.d);
        } catch (IndexOutOfBoundsException e) {
            throw new fht(e);
        }
    }
}

package flm;

import libcore.io.Memory;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class fly extends fmb {
    fly(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // flm.fmb
    public final void a(long j, byte b) {
        Memory.pokeByte((int) ((-1) & j), b);
    }

    @Override // flm.fmb
    public final byte a(Object obj, long j) {
        if (flw.e) {
            return flw.g(obj, j);
        }
        return flw.h(obj, j);
    }

    @Override // flm.fmb
    public final void a(Object obj, long j, byte b) {
        if (flw.e) {
            flw.a(obj, j, b);
        } else {
            flw.b(obj, j, b);
        }
    }

    @Override // flm.fmb
    public final boolean b(Object obj, long j) {
        if (flw.e) {
            return flw.i(obj, j);
        }
        return flw.j(obj, j);
    }

    @Override // flm.fmb
    public final void a(Object obj, long j, boolean z) {
        if (flw.e) {
            flw.b(obj, j, z);
        } else {
            flw.c(obj, j, z);
        }
    }

    @Override // flm.fmb
    public final float c(Object obj, long j) {
        return Float.intBitsToFloat(e(obj, j));
    }

    @Override // flm.fmb
    public final void a(Object obj, long j, float f) {
        a(obj, j, Float.floatToIntBits(f));
    }

    @Override // flm.fmb
    public final double d(Object obj, long j) {
        return Double.longBitsToDouble(f(obj, j));
    }

    @Override // flm.fmb
    public final void a(Object obj, long j, double d) {
        a(obj, j, Double.doubleToLongBits(d));
    }

    @Override // flm.fmb
    public final void a(byte[] bArr, long j, long j2, long j3) {
        Memory.pokeByteArray((int) ((-1) & j2), bArr, (int) j, (int) j3);
    }
}

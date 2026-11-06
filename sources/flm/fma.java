package flm;

import sun.misc.Unsafe;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class fma extends fmb {
    fma(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // flm.fmb
    public final void a(long j, byte b) {
        this.a.putByte(j, b);
    }

    @Override // flm.fmb
    public final byte a(Object obj, long j) {
        return this.a.getByte(obj, j);
    }

    @Override // flm.fmb
    public final void a(Object obj, long j, byte b) {
        this.a.putByte(obj, j, b);
    }

    @Override // flm.fmb
    public final boolean b(Object obj, long j) {
        return this.a.getBoolean(obj, j);
    }

    @Override // flm.fmb
    public final void a(Object obj, long j, boolean z) {
        this.a.putBoolean(obj, j, z);
    }

    @Override // flm.fmb
    public final float c(Object obj, long j) {
        return this.a.getFloat(obj, j);
    }

    @Override // flm.fmb
    public final void a(Object obj, long j, float f) {
        this.a.putFloat(obj, j, f);
    }

    @Override // flm.fmb
    public final double d(Object obj, long j) {
        return this.a.getDouble(obj, j);
    }

    @Override // flm.fmb
    public final void a(Object obj, long j, double d) {
        this.a.putDouble(obj, j, d);
    }

    @Override // flm.fmb
    public final void a(byte[] bArr, long j, long j2, long j3) {
        this.a.copyMemory(bArr, flw.d + j, (Object) null, j2, j3);
    }
}

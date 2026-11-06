package flm;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class fhd extends fhi {
    public static final long serialVersionUID = 1;
    private final int d;
    private final int e;

    fhd(byte[] bArr, int i, int i2) {
        super(bArr);
        c(i, i + i2, bArr.length);
        this.d = i;
        this.e = i2;
    }

    @Override // flm.fhi, flm.fgy
    public final byte a(int i) {
        b(i, b());
        return this.c[this.d + i];
    }

    @Override // flm.fhi, flm.fgy
    final byte b(int i) {
        return this.c[this.d + i];
    }

    @Override // flm.fhi, flm.fgy
    public final int b() {
        return this.e;
    }

    @Override // flm.fhi
    protected final int h() {
        return this.d;
    }

    @Override // flm.fhi, flm.fgy
    protected final void b(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.c, h() + i, bArr, i2, i3);
    }

    final Object writeReplace() {
        return fgy.b(c());
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
    }
}

package flm;

import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
abstract class aqk extends aqi {
    private static final WeakReference b = new WeakReference(null);
    private WeakReference a;

    aqk(byte[] bArr) {
        super(bArr);
        this.a = b;
    }

    protected abstract byte[] b();

    @Override // flm.aqi
    final byte[] a() {
        byte[] bArrB;
        synchronized (this) {
            bArrB = (byte[]) this.a.get();
            if (bArrB == null) {
                bArrB = b();
                this.a = new WeakReference(bArrB);
            }
        }
        return bArrB;
    }
}

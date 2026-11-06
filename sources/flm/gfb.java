package flm;

import java.io.InputStream;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class gfb extends InputStream implements ftl {
    private final gez a;

    public gfb(gez gezVar) {
        this.a = (gez) dvl.a(gezVar, "buffer");
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.a.a();
    }

    @Override // java.io.InputStream
    public final int read() {
        if (this.a.a() == 0) {
            return -1;
        }
        return this.a.b();
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        if (this.a.a() == 0) {
            return -1;
        }
        int iMin = Math.min(this.a.a(), i2);
        this.a.a(bArr, i, iMin);
        return iMin;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }
}

package flm;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class fwi implements ghm {
    public final ByteBuffer a;

    public fwi(ByteBuffer byteBuffer) {
        this.a = (ByteBuffer) dvl.a(byteBuffer, "buffer");
    }

    @Override // flm.ghm
    public final void a(byte[] bArr, int i, int i2) {
        this.a.put(bArr, i, i2);
    }

    @Override // flm.ghm
    public final void a(byte b) {
        this.a.put(b);
    }

    @Override // flm.ghm
    public final int a() {
        return this.a.remaining();
    }

    @Override // flm.ghm
    public final int b() {
        return this.a.position();
    }

    @Override // flm.ghm
    public final void c() {
    }
}

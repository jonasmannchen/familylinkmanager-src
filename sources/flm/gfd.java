package flm;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class gfd extends fws {
    private final ByteBuffer a;

    gfd(ByteBuffer byteBuffer) {
        this.a = (ByteBuffer) dvl.a(byteBuffer, "bytes");
    }

    @Override // flm.gez
    public final int a() {
        return this.a.remaining();
    }

    @Override // flm.gez
    public final int b() {
        a(1);
        return this.a.get() & 255;
    }

    @Override // flm.gez
    public final void a(byte[] bArr, int i, int i2) {
        a(i2);
        this.a.get(bArr, i, i2);
    }

    @Override // flm.gez
    public final /* synthetic */ gez b(int i) {
        a(i);
        ByteBuffer byteBufferDuplicate = this.a.duplicate();
        byteBufferDuplicate.limit(this.a.position() + i);
        this.a.position(this.a.position() + i);
        return new gfd(byteBufferDuplicate);
    }
}

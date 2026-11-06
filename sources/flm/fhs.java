package flm;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class fhs extends fhr {
    private final ByteBuffer e;
    private int f;

    fhs(ByteBuffer byteBuffer) {
        super(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
        this.e = byteBuffer;
        this.f = byteBuffer.position();
    }

    @Override // flm.fhr, flm.fhp
    public final void h() {
        this.e.position(this.f + (this.d - this.c));
    }
}

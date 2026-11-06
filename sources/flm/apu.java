package flm;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class apu {
    private ara a;

    protected apu(ara araVar) {
        this.a = araVar;
    }

    public final boolean a(byte[] bArr) {
        ara araVar = this.a;
        bdi.checkArgument(bArr.length == 32);
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        long j = byteBufferWrap.getLong(0);
        for (int i = araVar.a[araVar.a(j)]; i < araVar.b.length && araVar.b[i] <= j; i += 4) {
            if (araVar.b[i] == j && araVar.b[i + 1] == byteBufferWrap.getLong(8) && araVar.b[i + 2] == byteBufferWrap.getLong(16) && araVar.b[i + 3] == byteBufferWrap.getLong(24)) {
                return true;
            }
        }
        return false;
    }
}

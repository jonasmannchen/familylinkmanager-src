package flm;

import java.io.OutputStream;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class gel extends OutputStream {
    private final /* synthetic */ gej a;

    gel(gej gejVar) {
        this.a = gejVar;
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        write(new byte[]{(byte) i}, 0, 1);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        this.a.a(bArr, i, i2);
    }
}

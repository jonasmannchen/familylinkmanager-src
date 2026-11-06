package flm;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class gek extends OutputStream {
    public final List a = new ArrayList();
    private ghm b;
    private final /* synthetic */ gej c;

    gek(gej gejVar) {
        this.c = gejVar;
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        if (this.b != null && this.b.a() > 0) {
            this.b.a((byte) i);
        } else {
            write(new byte[]{(byte) i}, 0, 1);
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        if (this.b == null) {
            this.b = this.c.a.a(i2);
            this.a.add(this.b);
        }
        while (i2 > 0) {
            int iMin = Math.min(i2, this.b.a());
            if (iMin == 0) {
                this.b = this.c.a.a(Math.max(i2, this.b.b() << 1));
                this.a.add(this.b);
            } else {
                this.b.a(bArr, i, iMin);
                i += iMin;
                i2 -= iMin;
            }
        }
    }
}

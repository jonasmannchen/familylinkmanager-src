package flm;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class gkm extends InputStream implements fsr, ftl {
    public fke a;
    public final fko b;
    private ByteArrayInputStream c;

    gkm(fke fkeVar, fko fkoVar) {
        this.a = fkeVar;
        this.b = fkoVar;
    }

    @Override // flm.fsr
    public final int a(OutputStream outputStream) {
        if (this.a != null) {
            int iG = this.a.g();
            this.a.a(outputStream);
            this.a = null;
            return iG;
        }
        if (this.c != null) {
            int iA = (int) gkn.a(this.c, outputStream);
            this.c = null;
            return iA;
        }
        return 0;
    }

    @Override // java.io.InputStream
    public final int read() {
        if (this.a != null) {
            this.c = new ByteArrayInputStream(this.a.b());
            this.a = null;
        }
        if (this.c != null) {
            return this.c.read();
        }
        return -1;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        if (this.a != null) {
            int iG = this.a.g();
            if (iG == 0) {
                this.a = null;
                this.c = null;
                return -1;
            }
            if (i2 >= iG) {
                fhp fhpVarB = fhp.b(bArr, i, iG);
                this.a.a(fhpVarB);
                fhpVarB.h();
                fhpVarB.j();
                this.a = null;
                this.c = null;
                return iG;
            }
            this.c = new ByteArrayInputStream(this.a.b());
            this.a = null;
        }
        if (this.c != null) {
            return this.c.read(bArr, i, i2);
        }
        return -1;
    }

    @Override // java.io.InputStream
    public final int available() {
        if (this.a != null) {
            return this.a.g();
        }
        if (this.c != null) {
            return this.c.available();
        }
        return 0;
    }
}

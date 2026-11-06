package flm;

import java.io.Closeable;
import java.util.zip.CRC32;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import java.util.zip.ZipException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class gbq implements Closeable {
    public int e;
    public int f;
    public Inflater g;
    public int j;
    public int k;
    private long o;
    public final fzf a = new fzf();
    public final CRC32 b = new CRC32();
    public final gbr c = new gbr(this);
    public final byte[] d = new byte[512];
    public gbs h = gbs.HEADER;
    public boolean i = false;
    public int l = 0;
    public int m = 0;
    public boolean n = true;

    gbq() {
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (!this.i) {
            this.i = true;
            this.a.close();
            if (this.g != null) {
                this.g.end();
                this.g = null;
            }
        }
    }

    final int a(byte[] bArr, int i, int i2) throws DataFormatException {
        dvl.b(this.g != null, "inflater is null");
        try {
            int totalIn = this.g.getTotalIn();
            int iInflate = this.g.inflate(bArr, i, i2);
            int totalIn2 = this.g.getTotalIn() - totalIn;
            this.l += totalIn2;
            this.m += totalIn2;
            this.e = totalIn2 + this.e;
            this.b.update(bArr, i, iInflate);
            if (this.g.finished()) {
                this.o = this.g.getBytesWritten() & 4294967295L;
                this.h = gbs.TRAILER;
            } else if (this.g.needsInput()) {
                this.h = gbs.INFLATER_NEEDS_INPUT;
            }
            return iInflate;
        } catch (DataFormatException e) {
            String strValueOf = String.valueOf(e.getMessage());
            throw new DataFormatException(strValueOf.length() != 0 ? "Inflater data format exception: ".concat(strValueOf) : new String("Inflater data format exception: "));
        }
    }

    final boolean a() throws ZipException {
        if (this.g != null && this.c.b() <= 18) {
            this.g.end();
            this.g = null;
        }
        if (this.c.b() < 8) {
            return false;
        }
        long value = this.b.getValue();
        gbr gbrVar = this.c;
        if (value == ((((long) gbrVar.c()) << 16) | ((long) gbrVar.c()))) {
            long j = this.o;
            gbr gbrVar2 = this.c;
            if (j == ((((long) gbrVar2.c()) << 16) | ((long) gbrVar2.c()))) {
                this.b.reset();
                this.h = gbs.HEADER;
                return true;
            }
        }
        throw new ZipException("Corrupt GZIP trailer");
    }

    static /* synthetic */ int a(gbq gbqVar, int i) {
        int i2 = gbqVar.e + i;
        gbqVar.e = i2;
        return i2;
    }

    static /* synthetic */ int b(gbq gbqVar, int i) {
        int i2 = gbqVar.l + i;
        gbqVar.l = i2;
        return i2;
    }
}

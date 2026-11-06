package flm;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class geh extends FilterInputStream {
    private final int a;
    private final ghd b;
    private long c;
    private long d;
    private long e;

    geh(InputStream inputStream, int i, ghd ghdVar) {
        super(inputStream);
        this.e = -1L;
        this.a = i;
        this.b = ghdVar;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        int i = this.in.read();
        if (i != -1) {
            this.d++;
        }
        b();
        a();
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.in.read(bArr, i, i2);
        if (i3 != -1) {
            this.d += (long) i3;
        }
        b();
        a();
        return i3;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) throws IOException {
        long jSkip = this.in.skip(j);
        this.d += jSkip;
        b();
        a();
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i) {
        this.in.mark(i);
        this.e = this.d;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        if (!this.in.markSupported()) {
            throw new IOException("Mark not supported");
        }
        if (this.e == -1) {
            throw new IOException("Mark not set");
        }
        this.in.reset();
        this.d = this.e;
    }

    private final void a() {
        if (this.d > this.c) {
            this.b.c(this.d - this.c);
            this.c = this.d;
        }
    }

    private final void b() {
        if (this.d > this.a) {
            throw fvc.h.a(String.format("Compressed gRPC message exceeds maximum size %d: %d bytes read", Integer.valueOf(this.a), Long.valueOf(this.d))).b();
        }
    }
}

package flm;

import java.io.IOException;
import java.util.logging.Level;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class gke implements guq {
    public int a;
    public byte b;
    public int c;
    public int d;
    public short e;
    private final gue f;

    public gke(gue gueVar) {
        this.f = gueVar;
    }

    @Override // flm.guq
    public final long a(guc gucVar, long j) throws IOException {
        while (this.d == 0) {
            this.f.f(this.e);
            this.e = (short) 0;
            if ((this.b & 4) != 0) {
                return -1L;
            }
            int i = this.c;
            int iA = gkd.a(this.f);
            this.d = iA;
            this.a = iA;
            byte bC = this.f.c();
            this.b = this.f.c();
            if (gkd.a.isLoggable(Level.FINE)) {
                gkd.a.logp(Level.FINE, "io.grpc.okhttp.internal.framed.Http2$ContinuationSource", "readContinuationHeader", gkf.a(true, this.c, this.a, bC, this.b));
            }
            this.c = this.f.e() & Integer.MAX_VALUE;
            if (bC != 9) {
                throw gkd.b("%s != TYPE_CONTINUATION", Byte.valueOf(bC));
            }
            if (this.c != i) {
                throw gkd.b("TYPE_CONTINUATION streamId changed", new Object[0]);
            }
        }
        long jA = this.f.a(gucVar, Math.min(j, this.d));
        if (jA == -1) {
            return -1L;
        }
        this.d -= (int) jA;
        return jA;
    }

    @Override // flm.guq, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}

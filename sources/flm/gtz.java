package flm;

import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class gtz implements guq {
    private final /* synthetic */ guq a;
    private final /* synthetic */ gtx b;

    gtz(gtx gtxVar, guq guqVar) {
        this.b = gtxVar;
        this.a = guqVar;
    }

    @Override // flm.guq
    public final long a(guc gucVar, long j) throws IOException {
        this.b.a();
        try {
            try {
                long jA = this.a.a(gucVar, j);
                this.b.a(true);
                return jA;
            } catch (IOException e) {
                throw this.b.a(e);
            }
        } catch (Throwable th) {
            this.b.a(false);
            throw th;
        }
    }

    @Override // flm.guq, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        try {
            try {
                this.a.close();
                this.b.a(true);
            } catch (IOException e) {
                throw this.b.a(e);
            }
        } catch (Throwable th) {
            this.b.a(false);
            throw th;
        }
    }

    public final String toString() {
        return "AsyncTimeout.source(" + this.a + ")";
    }
}

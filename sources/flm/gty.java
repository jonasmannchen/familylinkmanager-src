package flm;

import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class gty implements gup {
    private final /* synthetic */ gup a;
    private final /* synthetic */ gtx b;

    gty(gtx gtxVar, gup gupVar) {
        this.b = gtxVar;
        this.a = gupVar;
    }

    @Override // flm.gup
    public final void a_(guc gucVar, long j) throws IOException {
        gut.a(gucVar.c, 0L, j);
        long j2 = j;
        while (j2 > 0) {
            gum gumVar = gucVar.b;
            long j3 = 0;
            while (j3 < 65536) {
                j3 += (long) (gucVar.b.c - gucVar.b.b);
                if (j3 >= j2) {
                    j3 = j2;
                    break;
                }
            }
            this.b.a();
            try {
                try {
                    this.a.a_(gucVar, j3);
                    j2 -= j3;
                    this.b.a(true);
                } catch (IOException e) {
                    throw this.b.a(e);
                }
            } catch (Throwable th) {
                this.b.a(false);
                throw th;
            }
        }
    }

    @Override // flm.gup, java.io.Flushable
    public final void flush() throws IOException {
        this.b.a();
        try {
            try {
                this.a.flush();
                this.b.a(true);
            } catch (IOException e) {
                throw this.b.a(e);
            }
        } catch (Throwable th) {
            this.b.a(false);
            throw th;
        }
    }

    @Override // flm.gup, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.b.a();
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
        return "AsyncTimeout.sink(" + this.a + ")";
    }
}

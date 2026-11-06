package flm;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class gui implements guq {
    private final /* synthetic */ gur a;
    private final /* synthetic */ InputStream b;

    gui(gur gurVar, InputStream inputStream) {
        this.a = gurVar;
        this.b = inputStream;
    }

    @Override // flm.guq
    public final long a(guc gucVar, long j) throws IOException {
        if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        }
        if (j == 0) {
            return 0L;
        }
        try {
            this.a.d();
            gum gumVarA = gucVar.a(1);
            int i = this.b.read(gumVarA.a, gumVarA.c, (int) Math.min(j, 8192 - gumVarA.c));
            if (i == -1) {
                return -1L;
            }
            gumVarA.c += i;
            gucVar.c += (long) i;
            return i;
        } catch (AssertionError e) {
            if (gug.a(e)) {
                throw new IOException(e);
            }
            throw e;
        }
    }

    @Override // flm.guq, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.b.close();
    }

    public final String toString() {
        return "source(" + this.b + ")";
    }
}

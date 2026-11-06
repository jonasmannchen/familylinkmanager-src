package flm;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class guh implements gup {
    private final /* synthetic */ gur a;
    private final /* synthetic */ OutputStream b;

    guh(gur gurVar, OutputStream outputStream) {
        this.a = gurVar;
        this.b = outputStream;
    }

    @Override // flm.gup
    public final void a_(guc gucVar, long j) throws IOException {
        gut.a(gucVar.c, 0L, j);
        while (j > 0) {
            this.a.d();
            gum gumVar = gucVar.b;
            int iMin = (int) Math.min(j, gumVar.c - gumVar.b);
            this.b.write(gumVar.a, gumVar.b, iMin);
            gumVar.b += iMin;
            j -= (long) iMin;
            gucVar.c -= (long) iMin;
            if (gumVar.b == gumVar.c) {
                gucVar.b = gumVar.a();
                gun.a(gumVar);
            }
        }
    }

    @Override // flm.gup, java.io.Flushable
    public final void flush() throws IOException {
        this.b.flush();
    }

    @Override // flm.gup, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.b.close();
    }

    public final String toString() {
        return "sink(" + this.b + ")";
    }
}

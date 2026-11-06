package flm;

import java.io.PrintStream;
import java.io.PrintWriter;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ehn extends ehi {
    ehn() {
    }

    @Override // flm.ehi
    public final void a(Throwable th, Throwable th2) {
        th.addSuppressed(th2);
    }

    @Override // flm.ehi
    public final void a(Throwable th) {
        th.printStackTrace();
    }

    @Override // flm.ehi
    public final void a(Throwable th, PrintStream printStream) {
        th.printStackTrace(printStream);
    }

    @Override // flm.ehi
    public final void a(Throwable th, PrintWriter printWriter) {
        th.printStackTrace(printWriter);
    }
}

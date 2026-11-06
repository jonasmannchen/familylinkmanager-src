package flm;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ehl extends ehi {
    private final ehj a = new ehj();

    ehl() {
    }

    @Override // flm.ehi
    public final void a(Throwable th, Throwable th2) {
        if (th2 == th) {
            throw new IllegalArgumentException("Self suppression is not allowed.", th2);
        }
        if (th2 == null) {
            throw new NullPointerException("The suppressed exception cannot be null.");
        }
        this.a.a(th, true).add(th2);
    }

    @Override // flm.ehi
    public final void a(Throwable th) {
        th.printStackTrace();
        List<Throwable> listA = this.a.a(th, false);
        if (listA != null) {
            synchronized (listA) {
                for (Throwable th2 : listA) {
                    System.err.print("Suppressed: ");
                    th2.printStackTrace();
                }
            }
        }
    }

    @Override // flm.ehi
    public final void a(Throwable th, PrintStream printStream) {
        th.printStackTrace(printStream);
        List<Throwable> listA = this.a.a(th, false);
        if (listA != null) {
            synchronized (listA) {
                for (Throwable th2 : listA) {
                    printStream.print("Suppressed: ");
                    th2.printStackTrace(printStream);
                }
            }
        }
    }

    @Override // flm.ehi
    public final void a(Throwable th, PrintWriter printWriter) {
        th.printStackTrace(printWriter);
        List<Throwable> listA = this.a.a(th, false);
        if (listA != null) {
            synchronized (listA) {
                for (Throwable th2 : listA) {
                    printWriter.print("Suppressed: ");
                    th2.printStackTrace(printWriter);
                }
            }
        }
    }
}

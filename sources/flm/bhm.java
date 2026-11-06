package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class bhm implements Runnable {
    private final Runnable a;
    private final dte b;

    bhm(Runnable runnable, dte dteVar) {
        this.a = runnable;
        this.b = dteVar;
    }

    static dte a(Runnable runnable) {
        if (runnable instanceof bhm) {
            return ((bhm) runnable).b;
        }
        return null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.run();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bhm) {
            return this.a.equals(((bhm) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dud implements Runnable {
    private final /* synthetic */ dtq a;
    private final /* synthetic */ Runnable b;

    dud(dtq dtqVar, Runnable runnable) {
        this.a = dtqVar;
        this.b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dtq dtqVarB = duj.b();
        duj.a(this.a);
        try {
            this.b.run();
        } finally {
            duj.a(dtqVarB);
        }
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.b);
        return new StringBuilder(String.valueOf(strValueOf).length() + 14).append("propagating=[").append(strValueOf).append("]").toString();
    }
}

package flm;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class due implements Callable {
    private final /* synthetic */ dtq a;
    private final /* synthetic */ Callable b;

    due(dtq dtqVar, Callable callable) {
        this.a = dtqVar;
        this.b = callable;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        dtq dtqVarB = duj.b();
        duj.a(this.a);
        try {
            return this.b.call();
        } finally {
            duj.a(dtqVarB);
        }
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.b);
        return new StringBuilder(String.valueOf(strValueOf).length() + 14).append("propagating=[").append(strValueOf).append("]").toString();
    }
}

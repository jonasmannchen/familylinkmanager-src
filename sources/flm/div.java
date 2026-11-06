package flm;

import android.util.Log;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class div {
    private static final div b = new div(new din());
    private static volatile boolean c = true;
    private static volatile div d = b;
    public final diw a;

    private div(diw diwVar) {
        this.a = (diw) dse.a(diwVar);
    }

    public static synchronized div a(dfn dfnVar) {
        div divVar;
        synchronized (div.class) {
            if (d != b) {
                dkm.a(3, "Primes", "Primes.initialize() is called more than once. This call will be ignored.", new Object[0]);
                divVar = d;
            } else {
                divVar = new div(dfnVar.a());
                d = divVar;
            }
        }
        return divVar;
    }

    public static div a() {
        if (d == b && c) {
            c = false;
            Log.w("Primes", dkm.a("Primes not initialized, returning default (no-op) Primes instance which will ignore all calls. Please call Primes.initialize(...) before using any Primes API.", new Object[0]));
        }
        return d;
    }

    public final dme b() {
        return this.a.c();
    }

    @Deprecated
    public final void a(dme dmeVar, String str) {
        this.a.a(dmeVar, str, false, dp.M);
    }
}

package flm;

import android.content.Context;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dni implements dmb {
    private static final drf a;
    private final Context b;

    dni(Context context) {
        this.b = context;
    }

    @Override // flm.dmb
    public final /* synthetic */ Object a() {
        drf.b(this.b);
        return (Boolean) a.b();
    }

    static {
        drn drnVarB = new drn("primes-ph").b("ShutdownFeature__").a("primes::").b();
        a = drf.a(new drn(drnVarB.a, drnVarB.b, drnVarB.c, drnVarB.d, drnVarB.e, true, drnVarB.g), "shutdown_primes", false);
    }
}

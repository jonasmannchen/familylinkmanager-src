package flm;

import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fsk {
    public static fvc a(fsc fscVar) {
        dvl.a(fscVar, "context must not be null");
        if (!fscVar.d()) {
            return null;
        }
        Throwable thE = fscVar.e();
        if (thE == null) {
            return fvc.c.a("io.grpc.Context was cancelled without error");
        }
        if (thE instanceof TimeoutException) {
            return fvc.e.a(thE.getMessage()).b(thE);
        }
        fvc fvcVarA = fvc.a(thE);
        return (fvd.UNKNOWN.equals(fvcVarA.m) && fvcVarA.o == thE) ? fvc.c.a("Context cancelled").b(thE) : fvcVarA.b(thE);
    }
}

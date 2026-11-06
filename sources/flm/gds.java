package flm;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class gds implements Runnable {
    private final /* synthetic */ fvc a;
    private final /* synthetic */ gdr b;

    gds(gdr gdrVar, fvc fvcVar) {
        this.b = gdrVar;
        this.a = fvcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b.a != this.b.b.v) {
            return;
        }
        this.b.a.a.a(this.a);
        if (this.b.b.S == null) {
            if (this.b.b.U == null) {
                this.b.b.U = this.b.b.r.a();
            }
            long jA = this.b.b.U.a();
            if (gda.a.isLoggable(Level.FINE)) {
                gda.a.logp(Level.FINE, "io.grpc.internal.ManagedChannelImpl$NameResolverListenerImpl$1NameResolverErrorHandler", "run", "[{0}] Scheduling DNS resolution backoff for {1} ns", new Object[]{this.b.b.d, Long.valueOf(jA)});
            }
            this.b.b.T = new gdu(this.b.b);
            this.b.b.S = this.b.b.e.a().schedule(this.b.b.T, jA, TimeUnit.NANOSECONDS);
        }
    }
}

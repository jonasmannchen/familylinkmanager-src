package flm;

import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class fvx implements fzd {
    private final ScheduledExecutorService a;
    private final Executor b;
    private final int c;
    private final boolean d;
    private final fvy e;
    private final ghk f;
    private final boolean g;

    fvx(fvy fvyVar, Executor executor, ScheduledExecutorService scheduledExecutorService, int i, boolean z, ghk ghkVar) {
        this.g = scheduledExecutorService == null;
        this.a = this.g ? (ScheduledExecutorService) ggw.a.a(gbh.n) : scheduledExecutorService;
        this.c = i;
        this.d = z;
        this.e = fvyVar;
        this.b = (Executor) dvl.a(executor, "executor");
        this.f = (ghk) dvl.a(ghkVar, "transportTracer");
    }

    @Override // flm.fzd
    public final fzj a(SocketAddress socketAddress, fze fzeVar) {
        return new fwf(this.e, (InetSocketAddress) socketAddress, fzeVar.a, fzeVar.c, this.b, this.c, this.d, this.f);
    }

    @Override // flm.fzd
    public final ScheduledExecutorService a() {
        return this.a;
    }

    @Override // flm.fzd, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.g) {
            ggw.a(gbh.n, this.a);
        }
    }
}

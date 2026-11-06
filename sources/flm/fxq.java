package flm;

import java.net.SocketAddress;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class fxq implements fzd {
    public final Executor a;
    private final fzd b;

    fxq(fzd fzdVar, Executor executor) {
        this.b = (fzd) dvl.a(fzdVar, "delegate");
        this.a = (Executor) dvl.a(executor, "appExecutor");
    }

    @Override // flm.fzd
    public final fzj a(SocketAddress socketAddress, fze fzeVar) {
        return new fxr(this, this.b.a(socketAddress, fzeVar), fzeVar.a);
    }

    @Override // flm.fzd
    public final ScheduledExecutorService a() {
        return this.b.a();
    }

    @Override // flm.fzd, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.b.close();
    }
}

package flm;

import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class gih implements fzd {
    private final Executor a;
    private final boolean b;
    private final boolean c;
    private final ghl d;
    private final SSLSocketFactory e;
    private final HostnameVerifier f;
    private final gjf g;
    private final int h;
    private final boolean i;
    private final fxg j;
    private final long k;
    private final int l;
    private final boolean m;
    private final int n;
    private final ScheduledExecutorService o;
    private boolean p;

    gih(Executor executor, ScheduledExecutorService scheduledExecutorService, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, gjf gjfVar, int i, boolean z, long j, long j2, int i2, boolean z2, int i3, ghl ghlVar) {
        this.c = scheduledExecutorService == null;
        this.o = this.c ? (ScheduledExecutorService) ggw.a.a(gbh.n) : scheduledExecutorService;
        this.e = sSLSocketFactory;
        this.f = hostnameVerifier;
        this.g = gjfVar;
        this.h = i;
        this.i = z;
        this.j = new fxg("keepalive time nanos", j);
        this.k = j2;
        this.l = i2;
        this.m = z2;
        this.n = i3;
        this.b = executor == null;
        this.d = (ghl) dvl.a(ghlVar, "transportTracerFactory");
        if (this.b) {
            this.a = (Executor) ggw.a.a(gie.a);
        } else {
            this.a = executor;
        }
    }

    @Override // flm.fzd
    public final fzj a(SocketAddress socketAddress, fze fzeVar) {
        if (this.p) {
            throw new IllegalStateException("The transport factory is closed.");
        }
        fxg fxgVar = this.j;
        fxh fxhVar = new fxh(fxgVar, fxgVar.c.get());
        gin ginVar = new gin((InetSocketAddress) socketAddress, fzeVar.a, fzeVar.c, this.a, this.e, this.f, this.g, this.h, this.l, fzeVar.d, new gii(fxhVar), this.n, this.d.a());
        if (this.i) {
            long j = fxhVar.a;
            long j2 = this.k;
            boolean z = this.m;
            ginVar.w = true;
            ginVar.x = j;
            ginVar.y = j2;
            ginVar.z = z;
        }
        return ginVar;
    }

    @Override // flm.fzd
    public final ScheduledExecutorService a() {
        return this.o;
    }

    @Override // flm.fzd, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (!this.p) {
            this.p = true;
            if (this.c) {
                ggw.a(gbh.n, this.o);
            }
            if (this.b) {
                ggw.a(gie.a, (ExecutorService) this.a);
            }
        }
    }
}

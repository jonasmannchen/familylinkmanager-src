package flm;

import java.io.Closeable;
import java.net.SocketAddress;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public interface fzd extends Closeable {
    fzj a(SocketAddress socketAddress, fze fzeVar);

    ScheduledExecutorService a();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();
}

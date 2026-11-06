package flm;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class gbx {
    private static final Logger f = Logger.getLogger(gbx.class.getName());
    public final long a;
    public Map b = new LinkedHashMap();
    public boolean c;
    public Throwable d;
    public long e;
    private final dvw g;

    public gbx(long j, dvw dvwVar) {
        this.a = j;
        this.g = dvwVar;
    }

    public final boolean a() {
        synchronized (this) {
            if (this.c) {
                return false;
            }
            this.c = true;
            long jA = this.g.a(TimeUnit.NANOSECONDS);
            this.e = jA;
            Map map = this.b;
            this.b = null;
            for (Map.Entry entry : map.entrySet()) {
                a((Executor) entry.getValue(), a((fzc) entry.getKey(), jA));
            }
            return true;
        }
    }

    public static void a(fzc fzcVar, Executor executor, Throwable th) {
        a(executor, a(fzcVar, th));
    }

    public static void a(Executor executor, Runnable runnable) {
        try {
            executor.execute(runnable);
        } catch (Throwable th) {
            f.logp(Level.SEVERE, "io.grpc.internal.Http2Ping", "doExecute", "Failed to execute PingCallback", th);
        }
    }

    public static Runnable a(fzc fzcVar, long j) {
        return new gby(fzcVar, j);
    }

    public static Runnable a(fzc fzcVar, Throwable th) {
        return new gbz(fzcVar, th);
    }
}

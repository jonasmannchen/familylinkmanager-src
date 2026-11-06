package flm;

import java.net.Socket;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class gho implements gjy {
    public static final Logger a = Logger.getLogger(gin.class.getName());
    private static final Set g = Collections.unmodifiableSet(new HashSet(Arrays.asList("Socket closed")));
    public gjy b;
    public Socket c;
    public final gia d;
    public final AtomicLong e = new AtomicLong();
    private final ggl f;

    public gho(gia giaVar, ggl gglVar) {
        this.d = giaVar;
        this.f = gglVar;
    }

    final void a(gjy gjyVar, Socket socket) {
        dvl.b(this.b == null, "AsyncFrameWriter's setFrameWriter() should only be called once.");
        this.b = (gjy) dvl.a(gjyVar, "frameWriter");
        this.c = (Socket) dvl.a(socket, "socket");
    }

    @Override // flm.gjy
    public final void a() {
        this.f.execute(new ghp(this));
    }

    @Override // flm.gjy
    public final void a(gkk gkkVar) {
        this.f.execute(new ghv(this, gkkVar));
    }

    @Override // flm.gjy
    public final void b() {
        this.f.execute(new ghw(this, this.e.incrementAndGet()));
    }

    @Override // flm.gjy
    public final void a(boolean z, boolean z2, int i, int i2, List list) {
        this.f.execute(new ghx(this, z, z2, i, i2, list));
    }

    @Override // flm.gjy
    public final void a(int i, gjv gjvVar) {
        this.f.execute(new ghy(this, i, gjvVar));
    }

    @Override // flm.gjy
    public final void a(boolean z, int i, guc gucVar, int i2) {
        this.f.execute(new ghz(this, z, i, gucVar, i2));
    }

    @Override // flm.gjy
    public final void b(gkk gkkVar) {
        this.f.execute(new ghq(this, gkkVar));
    }

    @Override // flm.gjy
    public final void a(boolean z, int i, int i2) {
        this.f.execute(new ghr(this, z, i, i2));
    }

    @Override // flm.gjy
    public final void a(int i, gjv gjvVar, byte[] bArr) {
        this.f.execute(new ghs(this, i, gjvVar, bArr));
    }

    @Override // flm.gjy
    public final void a(int i, long j) {
        this.f.execute(new ght(this, i, j));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f.execute(new ghu(this));
    }

    static Level a(Throwable th) {
        return (th.getMessage() == null || !g.contains(th.getMessage())) ? Level.INFO : Level.FINE;
    }

    @Override // flm.gjy
    public final int c() {
        if (this.b == null) {
            return 16384;
        }
        return this.b.c();
    }
}

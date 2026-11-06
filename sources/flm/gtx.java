package flm;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class gtx extends gur {
    public static final long a = TimeUnit.SECONDS.toMillis(60);
    public static final long b = TimeUnit.MILLISECONDS.toNanos(a);
    public static gtx c;
    public gtx d;
    public long e;
    private boolean f;

    public final void a() {
        if (this.f) {
            throw new IllegalStateException("Unbalanced enter/exit");
        }
        if (0 == 0) {
            return;
        }
        this.f = true;
        a(this, 0L, false);
    }

    private static synchronized void a(gtx gtxVar, long j, boolean z) {
        if (c == null) {
            c = new gtx();
            new gua().start();
        }
        long jNanoTime = System.nanoTime();
        if (j != 0 && z) {
            gtxVar.e = Math.min(j, gtxVar.c() - jNanoTime) + jNanoTime;
        } else if (j != 0) {
            gtxVar.e = jNanoTime + j;
        } else if (z) {
            gtxVar.e = gtxVar.c();
        } else {
            throw new AssertionError();
        }
        long j2 = gtxVar.e - jNanoTime;
        gtx gtxVar2 = c;
        while (gtxVar2.d != null && j2 >= gtxVar2.d.e - jNanoTime) {
            gtxVar2 = gtxVar2.d;
        }
        gtxVar.d = gtxVar2.d;
        gtxVar2.d = gtxVar;
        if (gtxVar2 == c) {
            gtx.class.notify();
        }
    }

    private final boolean e() {
        if (!this.f) {
            return false;
        }
        this.f = false;
        return a(this);
    }

    private static synchronized boolean a(gtx gtxVar) {
        boolean z;
        for (gtx gtxVar2 = c; gtxVar2 != null; gtxVar2 = gtxVar2.d) {
            if (gtxVar2.d == gtxVar) {
                gtxVar2.d = gtxVar.d;
                gtxVar.d = null;
                z = false;
            }
        }
        z = true;
        return z;
    }

    protected void b() {
    }

    final void a(boolean z) throws IOException {
        if (e() && z) {
            throw b(null);
        }
    }

    final IOException a(IOException iOException) {
        return !e() ? iOException : b(iOException);
    }

    protected IOException b(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }
}

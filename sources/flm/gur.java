package flm;

import java.io.InterruptedIOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class gur {
    public final long c() {
        throw new IllegalStateException("No deadline");
    }

    public void d() throws InterruptedIOException {
        if (Thread.interrupted()) {
            throw new InterruptedIOException("thread interrupted");
        }
    }

    static {
        new gus();
    }
}

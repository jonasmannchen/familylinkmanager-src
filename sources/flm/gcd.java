package flm;

import java.util.logging.Level;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class gcd implements Runnable {
    private final /* synthetic */ gcb a;

    gcd(gcb gcbVar) {
        this.a = gcbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            try {
                synchronized (this.a.g) {
                    try {
                        this.a.l = null;
                        if (this.a.m) {
                            this.a.h.a();
                        } else {
                            this.a.a(fsa.CONNECTING);
                            this.a.c();
                            this.a.h.a();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                gcb.a.logp(Level.WARNING, "io.grpc.internal.InternalSubchannel$1EndOfCurrentBackoff", "run", "Exception handling end of backoff", th2);
                this.a.h.a();
            }
        } catch (Throwable th3) {
            this.a.h.a();
            throw th3;
        }
    }
}

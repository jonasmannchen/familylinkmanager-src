package flm;

import java.net.SocketAddress;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class gcm implements ged {
    private final fzj a;
    private final SocketAddress b;
    private final /* synthetic */ gcb c;

    gcm(gcb gcbVar, fzj fzjVar, SocketAddress socketAddress) {
        this.c = gcbVar;
        this.a = fzjVar;
        this.b = socketAddress;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x007b */
    @Override // flm.ged
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a() {
        /*
            r10 = this;
            r6 = 1
            r7 = 0
            java.util.logging.Logger r0 = flm.gcb.a
            java.util.logging.Level r1 = java.util.logging.Level.FINE
            boolean r0 = r0.isLoggable(r1)
            if (r0 == 0) goto L2f
            java.util.logging.Logger r0 = flm.gcb.a
            java.util.logging.Level r1 = java.util.logging.Level.FINE
            java.lang.String r2 = "io.grpc.internal.InternalSubchannel$TransportListener"
            java.lang.String r3 = "transportReady"
            java.lang.String r4 = "[{0}] {1} for {2} is ready"
            r5 = 3
            java.lang.Object[] r5 = new java.lang.Object[r5]
            flm.gcb r8 = r10.c
            flm.ftg r8 = r8.b
            r5[r7] = r8
            flm.fzj r8 = r10.a
            flm.ftg r8 = r8.b()
            r5[r6] = r8
            r8 = 2
            java.net.SocketAddress r9 = r10.b
            r5[r8] = r9
            r0.logp(r1, r2, r3, r4, r5)
        L2f:
            flm.gcb r0 = r10.c     // Catch: java.lang.Throwable -> L7b
            java.lang.Object r1 = r0.g     // Catch: java.lang.Throwable -> L7b
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L7b
            flm.gcb r0 = r10.c     // Catch: java.lang.Throwable -> L78
            flm.fvc r2 = r0.s     // Catch: java.lang.Throwable -> L78
            flm.gcb r0 = r10.c     // Catch: java.lang.Throwable -> L78
            r3 = 0
            r0.j = r3     // Catch: java.lang.Throwable -> L78
            if (r2 == 0) goto L5d
            flm.gcb r0 = r10.c     // Catch: java.lang.Throwable -> L78
            flm.gec r0 = r0.q     // Catch: java.lang.Throwable -> L78
            if (r0 != 0) goto L5b
            r0 = r6
        L46:
            java.lang.String r3 = "Unexpected non-null activeTransport"
            flm.dvl.b(r0, r3)     // Catch: java.lang.Throwable -> L78
        L4b:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L78
            flm.gcb r0 = r10.c
            flm.fyl r0 = r0.h
            r0.a()
            if (r2 == 0) goto L5a
            flm.fzj r0 = r10.a
            r0.a(r2)
        L5a:
            return
        L5b:
            r0 = r7
            goto L46
        L5d:
            flm.gcb r0 = r10.c     // Catch: java.lang.Throwable -> L78
            flm.fzj r0 = r0.p     // Catch: java.lang.Throwable -> L78
            flm.fzj r3 = r10.a     // Catch: java.lang.Throwable -> L78
            if (r0 != r3) goto L4b
            flm.gcb r0 = r10.c     // Catch: java.lang.Throwable -> L78
            flm.fsa r3 = flm.fsa.READY     // Catch: java.lang.Throwable -> L78
            r0.a(r3)     // Catch: java.lang.Throwable -> L78
            flm.gcb r0 = r10.c     // Catch: java.lang.Throwable -> L78
            flm.fzj r3 = r10.a     // Catch: java.lang.Throwable -> L78
            r0.q = r3     // Catch: java.lang.Throwable -> L78
            flm.gcb r0 = r10.c     // Catch: java.lang.Throwable -> L78
            r3 = 0
            r0.p = r3     // Catch: java.lang.Throwable -> L78
            goto L4b
        L78:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L78
            throw r0     // Catch: java.lang.Throwable -> L7b
        L7b:
            r0 = move-exception
            flm.gcb r1 = r10.c
            flm.fyl r1 = r1.h
            r1.a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: flm.gcm.a():void");
    }

    @Override // flm.ged
    public final void a(boolean z) {
        this.c.a(this.a, z);
    }

    @Override // flm.ged
    public final void a(fvc fvcVar) {
        if (gcb.a.isLoggable(Level.FINE)) {
            gcb.a.logp(Level.FINE, "io.grpc.internal.InternalSubchannel$TransportListener", "transportShutdown", "[{0}] {1} for {2} is being shutdown with status {3}", new Object[]{this.c.b, this.a.b(), this.b, fvcVar});
        }
        try {
            synchronized (this.c.g) {
                if (this.c.r.a == fsa.SHUTDOWN) {
                    this.c.h.a();
                    return;
                }
                if (this.c.q == this.a) {
                    this.c.a(fsa.IDLE);
                    this.c.q = null;
                    this.c.i.a();
                } else if (this.c.p == this.a) {
                    dvl.b(this.c.r.a == fsa.CONNECTING, "Expected state is CONNECTING, actual state is %s", this.c.r.a);
                    gcl gclVar = this.c.i;
                    fss fssVar = (fss) gclVar.a.get(gclVar.b);
                    gclVar.c++;
                    if (gclVar.c >= fssVar.a.size()) {
                        gclVar.b++;
                        gclVar.c = 0;
                    }
                    gcl gclVar2 = this.c.i;
                    if (!(gclVar2.b < gclVar2.a.size())) {
                        this.c.p = null;
                        this.c.i.a();
                        gcb gcbVar = this.c;
                        dvl.a(!fvcVar.a(), "The error status must not be OK");
                        gcbVar.a(new fsb(fsa.TRANSIENT_FAILURE, fvcVar));
                        if (gcbVar.j == null) {
                            gcbVar.j = gcbVar.c.a();
                        }
                        long jA = gcbVar.j.a() - gcbVar.k.a(TimeUnit.NANOSECONDS);
                        if (gcb.a.isLoggable(Level.FINE)) {
                            gcb.a.logp(Level.FINE, "io.grpc.internal.InternalSubchannel", "scheduleBackoff", "[{0}] Scheduling backoff for {1} ns", new Object[]{gcbVar.b, Long.valueOf(jA)});
                        }
                        dvl.b(gcbVar.l == null, "previous reconnectTask is not done");
                        gcbVar.m = false;
                        gcbVar.l = gcbVar.e.schedule(new gcx(new gcd(gcbVar)), jA, TimeUnit.NANOSECONDS);
                    } else {
                        this.c.c();
                    }
                }
                this.c.h.a();
            }
        } catch (Throwable th) {
            this.c.h.a();
            throw th;
        }
    }

    @Override // flm.ged
    public final void b() {
        if (gcb.a.isLoggable(Level.FINE)) {
            gcb.a.logp(Level.FINE, "io.grpc.internal.InternalSubchannel$TransportListener", "transportTerminated", "[{0}] {1} for {2} is terminated", new Object[]{this.c.b, this.a.b(), this.b});
        }
        fsz.b(this.c.f.e, this.a);
        this.c.a(this.a, false);
        try {
            synchronized (this.c.g) {
                this.c.n.remove(this.a);
                if (this.c.r.a == fsa.SHUTDOWN && this.c.n.isEmpty()) {
                    if (gcb.a.isLoggable(Level.FINE)) {
                        gcb.a.logp(Level.FINE, "io.grpc.internal.InternalSubchannel$TransportListener", "transportTerminated", "[{0}] Terminated in transportTerminated()", this.c.b);
                    }
                    this.c.d();
                }
            }
            this.c.h.a();
            dvl.b(this.c.q != this.a, "activeTransport still points to this transport. Seems transportShutdown() was not called.");
        } catch (Throwable th) {
            this.c.h.a();
            throw th;
        }
    }
}

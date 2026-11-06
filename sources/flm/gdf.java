package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class gdf implements Runnable {
    private final /* synthetic */ gda a;

    gdf(gda gdaVar) {
        this.a = gdaVar;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0061 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            r5 = this;
            flm.gda r0 = r5.a
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.C
            boolean r0 = r0.get()
            if (r0 == 0) goto Lb
        La:
            return
        Lb:
            flm.gda r0 = r5.a
            java.util.concurrent.ScheduledFuture r0 = r0.S
            if (r0 == 0) goto L26
            flm.gda r0 = r5.a
            boolean r0 = r0.u
            java.lang.String r1 = "name resolver must be started"
            flm.dvl.b(r0, r1)
            flm.gda r0 = r5.a
            r0.h()
            flm.gda r0 = r5.a
            flm.fui r0 = r0.t
            r0.c()
        L26:
            flm.gda r0 = r5.a
            java.util.Set r0 = r0.y
            java.util.Iterator r1 = r0.iterator()
        L2e:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L68
            java.lang.Object r0 = r1.next()
            flm.gcb r0 = (flm.gcb) r0
            java.lang.Object r2 = r0.g     // Catch: java.lang.Throwable -> L61
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L61
            flm.fsb r3 = r0.r     // Catch: java.lang.Throwable -> L5e
            flm.fsa r3 = r3.a     // Catch: java.lang.Throwable -> L5e
            flm.fsa r4 = flm.fsa.TRANSIENT_FAILURE     // Catch: java.lang.Throwable -> L5e
            if (r3 == r4) goto L4c
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L5e
            flm.fyl r0 = r0.h
            r0.a()
            goto L2e
        L4c:
            r0.e()     // Catch: java.lang.Throwable -> L5e
            flm.fsa r3 = flm.fsa.CONNECTING     // Catch: java.lang.Throwable -> L5e
            r0.a(r3)     // Catch: java.lang.Throwable -> L5e
            r0.c()     // Catch: java.lang.Throwable -> L5e
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L5e
            flm.fyl r0 = r0.h
            r0.a()
            goto L2e
        L5e:
            r1 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L5e
            throw r1     // Catch: java.lang.Throwable -> L61
        L61:
            r1 = move-exception
            flm.fyl r0 = r0.h
            r0.a()
            throw r1
        L68:
            flm.gda r0 = r5.a
            java.util.Set r0 = r0.z
            java.util.Iterator r1 = r0.iterator()
        L70:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto La
            java.lang.Object r0 = r1.next()
            flm.geq r0 = (flm.geq) r0
            r0.c()
            goto L70
        */
        throw new UnsupportedOperationException("Method not decompiled: flm.gdf.run():void");
    }
}

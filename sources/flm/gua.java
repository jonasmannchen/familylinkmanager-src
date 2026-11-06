package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class gua extends Thread {
    gua() {
        super("Okio Watchdog");
        setDaemon(true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0069, code lost:
    
        r0.b();
     */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            r12 = this;
            r10 = 1000000(0xf4240, double:4.940656E-318)
            r1 = 0
        L4:
            java.lang.Class<flm.gtx> r2 = flm.gtx.class
            monitor-enter(r2)     // Catch: java.lang.InterruptedException -> L33
            flm.gtx r0 = flm.gtx.c     // Catch: java.lang.Throwable -> L30
            flm.gtx r0 = r0.d     // Catch: java.lang.Throwable -> L30
            if (r0 != 0) goto L37
            long r4 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L30
            java.lang.Class<flm.gtx> r0 = flm.gtx.class
            long r6 = flm.gtx.a     // Catch: java.lang.Throwable -> L30
            r0.wait(r6)     // Catch: java.lang.Throwable -> L30
            flm.gtx r0 = flm.gtx.c     // Catch: java.lang.Throwable -> L30
            flm.gtx r0 = r0.d     // Catch: java.lang.Throwable -> L30
            if (r0 != 0) goto L35
            long r6 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L30
            long r4 = r6 - r4
            long r6 = flm.gtx.b     // Catch: java.lang.Throwable -> L30
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 < 0) goto L35
            flm.gtx r0 = flm.gtx.c     // Catch: java.lang.Throwable -> L30
        L2c:
            if (r0 != 0) goto L5f
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L30
            goto L4
        L30:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L30
            throw r0     // Catch: java.lang.InterruptedException -> L33
        L33:
            r0 = move-exception
            goto L4
        L35:
            r0 = r1
            goto L2c
        L37:
            long r4 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L30
            long r6 = r0.e     // Catch: java.lang.Throwable -> L30
            long r4 = r6 - r4
            r6 = 0
            int r3 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r3 <= 0) goto L55
            r6 = 1000000(0xf4240, double:4.940656E-318)
            long r6 = r4 / r6
            long r8 = r6 * r10
            long r4 = r4 - r8
            java.lang.Class<flm.gtx> r0 = flm.gtx.class
            int r3 = (int) r4     // Catch: java.lang.Throwable -> L30
            r0.wait(r6, r3)     // Catch: java.lang.Throwable -> L30
            r0 = r1
            goto L2c
        L55:
            flm.gtx r3 = flm.gtx.c     // Catch: java.lang.Throwable -> L30
            flm.gtx r4 = r0.d     // Catch: java.lang.Throwable -> L30
            r3.d = r4     // Catch: java.lang.Throwable -> L30
            r3 = 0
            r0.d = r3     // Catch: java.lang.Throwable -> L30
            goto L2c
        L5f:
            flm.gtx r3 = flm.gtx.c     // Catch: java.lang.Throwable -> L30
            if (r0 != r3) goto L68
            r0 = 0
            flm.gtx.c = r0     // Catch: java.lang.Throwable -> L30
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L30
            return
        L68:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L30
            r0.b()     // Catch: java.lang.InterruptedException -> L33
            goto L4
        */
        throw new UnsupportedOperationException("Method not decompiled: flm.gua.run():void");
    }
}

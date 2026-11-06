package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class fyt extends fzl {
    private final /* synthetic */ ghg a;
    private final /* synthetic */ fyr b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    fyt(fyr fyrVar, ghg ghgVar) {
        super(fyrVar.c.d);
        this.b = fyrVar;
        this.a = ghgVar;
    }

    /* JADX WARN: Bottom block not found for handler: Throwable -> 0x002b */
    /* JADX WARN: Code restructure failed: missing block: B:21:?, code lost:
    
        return;
     */
    @Override // flm.fzl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a() {
        /*
            r3 = this;
            flm.fyr r0 = r3.b
            boolean r0 = r0.b
            if (r0 == 0) goto Lc
            flm.ghg r0 = r3.a
            flm.gbh.a(r0)
        Lb:
            return
        Lc:
            flm.ghg r0 = r3.a     // Catch: java.lang.Throwable -> L2b
            java.io.InputStream r1 = r0.a()     // Catch: java.lang.Throwable -> L2b
            if (r1 == 0) goto Lb
            flm.fyr r0 = r3.b     // Catch: java.lang.Throwable -> L51
            flm.frn r0 = r0.a     // Catch: java.lang.Throwable -> L51
            flm.fyr r2 = r3.b     // Catch: java.lang.Throwable -> L51
            flm.fyo r2 = r2.c     // Catch: java.lang.Throwable -> L51
            flm.fuf r2 = r2.a     // Catch: java.lang.Throwable -> L51
            flm.fug r2 = r2.d     // Catch: java.lang.Throwable -> L51
            java.lang.Object r2 = r2.a(r1)     // Catch: java.lang.Throwable -> L51
            r0.a(r2)     // Catch: java.lang.Throwable -> L51
            r1.close()     // Catch: java.lang.Throwable -> L2b
            goto Lc
        L2b:
            r0 = move-exception
            flm.ghg r1 = r3.a
            flm.gbh.a(r1)
            flm.fvc r1 = flm.fvc.c
            flm.fvc r0 = r1.b(r0)
            java.lang.String r1 = "Failed to read message."
            flm.fvc r0 = r0.a(r1)
            flm.fyr r1 = r3.b
            flm.fyo r1 = r1.c
            flm.fyz r1 = r1.e
            r1.b(r0)
            flm.fyr r1 = r3.b
            flm.ftv r2 = new flm.ftv
            r2.<init>()
            r1.a(r0, r2)
            goto Lb
        L51:
            r0 = move-exception
            flm.gbh.a(r1)     // Catch: java.lang.Throwable -> L2b
            throw r0     // Catch: java.lang.Throwable -> L2b
        */
        throw new UnsupportedOperationException("Method not decompiled: flm.fyt.a():void");
    }
}

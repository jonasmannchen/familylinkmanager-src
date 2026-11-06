package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class fwh implements Runnable {
    public final fwa a;
    private final /* synthetic */ String b;
    private final /* synthetic */ ftv c;
    private final /* synthetic */ fuf d;
    private final /* synthetic */ ghd e;
    private final /* synthetic */ frj f;
    private final /* synthetic */ fwf g;

    fwh(fwf fwfVar, String str, ftv ftvVar, fuf fufVar, ghd ghdVar, frj frjVar) {
        this.g = fwfVar;
        this.b = str;
        this.c = ftvVar;
        this.d = fufVar;
        this.e = ghdVar;
        this.f = frjVar;
        this.a = new fwa(this.b, this.g.a, this.g.e, this.c, this.g, this, this.g.c, this.g.f, this.g.g, this.d, this.e, this.f, this.g.h);
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.g.c) {
            if (this.g.i) {
                this.a.n.b(this.g.j, true, new ftv());
            } else if (this.g.k) {
                fwf fwfVar = this.g;
                fwa fwaVar = this.a;
                fwfVar.d.add(fwaVar);
                fwaVar.n.h.o = fwfVar.l;
            } else {
                throw new AssertionError("Transport is not started");
            }
        }
    }
}

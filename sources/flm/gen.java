package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class gen extends fri {
    public boolean a;
    private final Object b = new Object();
    private fyz c;
    private fzu d;

    gen(fzb fzbVar, fuf fufVar, ftv ftvVar, frj frjVar) {
        fsc.a();
    }

    final void a(fyz fyzVar) {
        dvl.b(!this.a, "already finalized");
        this.a = true;
        synchronized (this.b) {
            if (this.c == null) {
                this.c = fyzVar;
            } else {
                dvl.b(this.d != null, "delayedStream is null");
                this.d.a(fyzVar);
            }
        }
    }

    final fyz a() {
        fyz fyzVar;
        synchronized (this.b) {
            if (this.c == null) {
                this.d = new fzu();
                fyzVar = this.d;
                this.c = fyzVar;
            } else {
                fyzVar = this.c;
            }
        }
        return fyzVar;
    }
}

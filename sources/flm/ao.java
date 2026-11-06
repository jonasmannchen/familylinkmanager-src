package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
abstract class ao {
    public final at a;
    public boolean b;
    public int c = -1;
    private final /* synthetic */ ak d;

    ao(ak akVar, at atVar) {
        this.d = akVar;
        this.a = atVar;
    }

    abstract boolean a();

    boolean a(af afVar) {
        return false;
    }

    void b() {
    }

    final void a(boolean z) {
        if (z != this.b) {
            this.b = z;
            boolean z2 = this.d.d == 0;
            ak akVar = this.d;
            akVar.d = (this.b ? 1 : -1) + akVar.d;
            if (z2 && this.b) {
                this.d.b();
            }
            if (this.d.d == 0 && !this.b) {
                this.d.c();
            }
            if (this.b) {
                this.d.a(this);
            }
        }
    }
}

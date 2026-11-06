package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gay extends geo {
    private boolean b;
    private final fvc c;
    private final int d;

    public gay(fvc fvcVar) {
        this(fvcVar, dp.aK);
    }

    public gay(fvc fvcVar, int i) {
        dvl.a(!fvcVar.a(), "error must not be OK");
        this.c = fvcVar;
        this.d = i;
    }

    @Override // flm.geo, flm.fyz
    public final void a(fza fzaVar) {
        dvl.b(!this.b, "already started");
        this.b = true;
        fzaVar.a(this.c, this.d, new ftv());
    }
}

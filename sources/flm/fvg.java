package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fvg extends Exception {
    public static final long serialVersionUID = -660954903976144640L;
    public final fvc a;
    private final boolean b;

    public fvg(fvc fvcVar) {
        this(fvcVar, null);
    }

    private fvg(fvc fvcVar, ftv ftvVar) {
        this(fvcVar, null, true);
    }

    private fvg(fvc fvcVar, ftv ftvVar, boolean z) {
        super(fvc.a(fvcVar), fvcVar.o);
        this.a = fvcVar;
        this.b = true;
        fillInStackTrace();
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        return this.b ? super.fillInStackTrace() : this;
    }
}

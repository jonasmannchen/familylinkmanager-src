package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fvh extends RuntimeException {
    public static final long serialVersionUID = 1950934672280720624L;
    public final fvc a;
    private final boolean b;

    public fvh(fvc fvcVar) {
        this(fvcVar, null);
    }

    private fvh(fvc fvcVar, ftv ftvVar) {
        this(fvcVar, null, true);
    }

    private fvh(fvc fvcVar, ftv ftvVar, boolean z) {
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

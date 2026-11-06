package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dao extends fmv {
    private static volatile dao[] a;
    private Boolean b = null;
    private Boolean c = null;
    private Boolean d = null;
    private Boolean e = null;

    public static dao[] b() {
        if (a == null) {
            synchronized (fmz.b) {
                if (a == null) {
                    a = new dao[0];
                }
            }
        }
        return a;
    }

    public dao() {
        this.g = null;
        this.h = -1;
    }

    @Override // flm.fmv, flm.fnb
    public final void a(fmt fmtVar) throws fmu {
        if (this.b != null) {
            fmtVar.a(1, this.b.booleanValue());
        }
        if (this.c != null) {
            fmtVar.a(2, this.c.booleanValue());
        }
        if (this.d != null) {
            fmtVar.a(3, this.d.booleanValue());
        }
        if (this.e != null) {
            fmtVar.a(4, this.e.booleanValue());
        }
        super.a(fmtVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.fmv, flm.fnb
    public final int a() {
        int iA = super.a();
        if (this.b != null) {
            this.b.booleanValue();
            iA += fmt.b(1) + 1;
        }
        if (this.c != null) {
            this.c.booleanValue();
            iA += fmt.b(2) + 1;
        }
        if (this.d != null) {
            this.d.booleanValue();
            iA += fmt.b(3) + 1;
        }
        if (this.e != null) {
            this.e.booleanValue();
            return iA + fmt.b(4) + 1;
        }
        return iA;
    }

    @Override // flm.fnb
    public final /* synthetic */ fnb a(fms fmsVar) throws fna {
        while (true) {
            int iA = fmsVar.a();
            switch (iA) {
                case bbx.MSG_UNBIND_SERVICE /* 0 */:
                    break;
                case 8:
                    this.b = Boolean.valueOf(fmsVar.b());
                    break;
                case 16:
                    this.c = Boolean.valueOf(fmsVar.b());
                    break;
                case 24:
                    this.d = Boolean.valueOf(fmsVar.b());
                    break;
                case 32:
                    this.e = Boolean.valueOf(fmsVar.b());
                    break;
                default:
                    if (!super.a(fmsVar, iA)) {
                    }
                    break;
            }
        }
        return this;
    }
}

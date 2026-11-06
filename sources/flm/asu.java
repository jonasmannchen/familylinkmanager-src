package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class asu extends fmv {
    private static volatile asu[] a;
    private String b = null;
    private Integer c = null;

    public static asu[] b() {
        if (a == null) {
            synchronized (fmz.b) {
                if (a == null) {
                    a = new asu[0];
                }
            }
        }
        return a;
    }

    public asu() {
        this.g = null;
        this.h = -1;
    }

    @Override // flm.fmv, flm.fnb
    public final void a(fmt fmtVar) throws fmu {
        if (this.b != null) {
            fmtVar.a(1, this.b);
        }
        if (this.c != null) {
            fmtVar.a(2, this.c.intValue());
        }
        super.a(fmtVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.fmv, flm.fnb
    public final int a() {
        int iA = super.a();
        if (this.b != null) {
            iA += fmt.b(1, this.b);
        }
        if (this.c != null) {
            return iA + fmt.b(2, this.c.intValue());
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
                case 10:
                    this.b = fmsVar.c();
                    break;
                case 16:
                    this.c = Integer.valueOf(fmsVar.d());
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

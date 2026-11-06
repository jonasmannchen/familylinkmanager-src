package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class asi extends fmv {
    private static volatile asi[] a;
    private String b = null;
    private aru c = null;
    private String d = null;
    private Long e = null;
    private asj f = null;

    public static asi[] b() {
        if (a == null) {
            synchronized (fmz.b) {
                if (a == null) {
                    a = new asi[0];
                }
            }
        }
        return a;
    }

    public asi() {
        this.g = null;
        this.h = -1;
    }

    @Override // flm.fmv, flm.fnb
    public final void a(fmt fmtVar) throws fmu {
        if (this.b != null) {
            fmtVar.a(1, this.b);
        }
        if (this.c != null && this.c != null) {
            fmtVar.a(2, this.c.a);
        }
        if (this.d != null) {
            fmtVar.a(3, this.d);
        }
        if (this.e != null) {
            long jLongValue = this.e.longValue();
            fmtVar.c(4, 0);
            fmtVar.a(jLongValue);
        }
        if (this.f != null) {
            fmtVar.a(5, this.f);
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
        if (this.c != null && this.c != null) {
            iA += fmt.b(2, this.c.a);
        }
        if (this.d != null) {
            iA += fmt.b(3, this.d);
        }
        if (this.e != null) {
            iA += fmt.b(4) + fmt.b(this.e.longValue());
        }
        if (this.f != null) {
            return iA + fmt.b(5, this.f);
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
                    int i = fmsVar.i();
                    int iD = fmsVar.d();
                    switch (iD) {
                        case bbx.MSG_UNBIND_SERVICE /* 0 */:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                            this.c = aru.a(iD);
                            break;
                        default:
                            fmsVar.e(i);
                            a(fmsVar, iA);
                            break;
                    }
                    break;
                case 26:
                    this.d = fmsVar.c();
                    break;
                case 32:
                    this.e = Long.valueOf(fmsVar.e());
                    break;
                case 42:
                    if (this.f == null) {
                        this.f = new asj();
                    }
                    fmsVar.a(this.f);
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

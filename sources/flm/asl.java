package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class asl extends fmv {
    private static volatile asl[] a;
    private Long b = null;
    private asb c = null;
    private String d = null;
    private String e = null;
    private String f = null;
    private String i = null;
    private String j = null;
    private Long k = null;
    private Long l = null;
    private Integer m = null;

    public static asl[] b() {
        if (a == null) {
            synchronized (fmz.b) {
                if (a == null) {
                    a = new asl[0];
                }
            }
        }
        return a;
    }

    public asl() {
        this.g = null;
        this.h = -1;
    }

    @Override // flm.fmv, flm.fnb
    public final void a(fmt fmtVar) throws fmu {
        if (this.b != null) {
            fmtVar.a(1, this.b.longValue());
        }
        if (this.c != null && this.c != null) {
            fmtVar.a(2, this.c.a);
        }
        if (this.d != null) {
            fmtVar.a(3, this.d);
        }
        if (this.e != null) {
            fmtVar.a(4, this.e);
        }
        if (this.f != null) {
            fmtVar.a(5, this.f);
        }
        if (this.i != null) {
            fmtVar.a(6, this.i);
        }
        if (this.j != null) {
            fmtVar.a(7, this.j);
        }
        if (this.k != null) {
            fmtVar.a(8, this.k.longValue());
        }
        if (this.m != null) {
            fmtVar.a(9, this.m.intValue());
        }
        if (this.l != null) {
            fmtVar.a(10, this.l.longValue());
        }
        super.a(fmtVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.fmv, flm.fnb
    public final int a() {
        int iA = super.a();
        if (this.b != null) {
            iA += fmt.b(1, this.b.longValue());
        }
        if (this.c != null && this.c != null) {
            iA += fmt.b(2, this.c.a);
        }
        if (this.d != null) {
            iA += fmt.b(3, this.d);
        }
        if (this.e != null) {
            iA += fmt.b(4, this.e);
        }
        if (this.f != null) {
            iA += fmt.b(5, this.f);
        }
        if (this.i != null) {
            iA += fmt.b(6, this.i);
        }
        if (this.j != null) {
            iA += fmt.b(7, this.j);
        }
        if (this.k != null) {
            iA += fmt.b(8, this.k.longValue());
        }
        if (this.m != null) {
            iA += fmt.b(9, this.m.intValue());
        }
        if (this.l != null) {
            return iA + fmt.b(10, this.l.longValue());
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
                    this.b = Long.valueOf(fmsVar.e());
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
                        case 5:
                        case 6:
                        case 7:
                            this.c = asb.a(iD);
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
                case 34:
                    this.e = fmsVar.c();
                    break;
                case 42:
                    this.f = fmsVar.c();
                    break;
                case 50:
                    this.i = fmsVar.c();
                    break;
                case 58:
                    this.j = fmsVar.c();
                    break;
                case 64:
                    this.k = Long.valueOf(fmsVar.e());
                    break;
                case 72:
                    this.m = Integer.valueOf(fmsVar.d());
                    break;
                case 80:
                    this.l = Long.valueOf(fmsVar.e());
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

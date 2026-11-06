package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dak extends fmv {
    private static volatile dak[] a;
    private dal b = null;
    private dal c = null;
    private Integer d = null;
    private String e = null;

    public static dak[] b() {
        if (a == null) {
            synchronized (fmz.b) {
                if (a == null) {
                    a = new dak[0];
                }
            }
        }
        return a;
    }

    public dak() {
        this.g = null;
        this.h = -1;
    }

    @Override // flm.fmv, flm.fnb
    public final void a(fmt fmtVar) throws fmu {
        if (this.b != null) {
            fmtVar.a(1, this.b);
        }
        if (this.c != null) {
            fmtVar.a(2, this.c);
        }
        if (this.d != null) {
            fmtVar.a(3, this.d.intValue());
        }
        if (this.e != null) {
            fmtVar.a(4, this.e);
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
            iA += fmt.b(2, this.c);
        }
        if (this.d != null) {
            iA += fmt.b(3, this.d.intValue());
        }
        if (this.e != null) {
            return iA + fmt.b(4, this.e);
        }
        return iA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // flm.fnb
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final dak a(fms fmsVar) throws fna {
        while (true) {
            int iA = fmsVar.a();
            switch (iA) {
                case bbx.MSG_UNBIND_SERVICE /* 0 */:
                    break;
                case 10:
                    if (this.b == null) {
                        this.b = new dal();
                    }
                    fmsVar.a(this.b);
                    break;
                case 18:
                    if (this.c == null) {
                        this.c = new dal();
                    }
                    fmsVar.a(this.c);
                    break;
                case 24:
                    int i = fmsVar.i();
                    try {
                        int iD = fmsVar.d();
                        if ((iD < 0 || iD > 1) && (iD < 15 || iD > 15)) {
                            throw new IllegalArgumentException(new StringBuilder(44).append(iD).append(" is not a valid enum AccountTypes").toString());
                        }
                        this.d = Integer.valueOf(iD);
                    } catch (IllegalArgumentException e) {
                        fmsVar.e(i);
                        a(fmsVar, iA);
                    }
                    break;
                case 34:
                    this.e = fmsVar.c();
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

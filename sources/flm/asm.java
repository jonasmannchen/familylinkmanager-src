package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class asm extends fmv {
    private Integer a = null;
    private String b = null;
    private Integer c = null;
    private String d = null;

    public asm() {
        this.g = null;
        this.h = -1;
    }

    @Override // flm.fmv, flm.fnb
    public final void a(fmt fmtVar) throws fmu {
        if (this.a != null) {
            fmtVar.a(1, this.a.intValue());
        }
        if (this.b != null) {
            fmtVar.a(2, this.b);
        }
        if (this.c != null) {
            fmtVar.a(3, this.c.intValue());
        }
        if (this.d != null) {
            fmtVar.a(4, this.d);
        }
        super.a(fmtVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.fmv, flm.fnb
    public final int a() {
        int iA = super.a();
        if (this.a != null) {
            iA += fmt.b(1, this.a.intValue());
        }
        if (this.b != null) {
            iA += fmt.b(2, this.b);
        }
        if (this.c != null) {
            iA += fmt.b(3, this.c.intValue());
        }
        if (this.d != null) {
            return iA + fmt.b(4, this.d);
        }
        return iA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // flm.fnb
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final asm a(fms fmsVar) throws fna {
        while (true) {
            int iA = fmsVar.a();
            switch (iA) {
                case bbx.MSG_UNBIND_SERVICE /* 0 */:
                    break;
                case 8:
                    int i = fmsVar.i();
                    try {
                        int iD = fmsVar.d();
                        if (iD < 0 || iD > 2) {
                            throw new IllegalArgumentException(new StringBuilder(41).append(iD).append(" is not a valid enum EventCode").toString());
                        }
                        this.a = Integer.valueOf(iD);
                    } catch (IllegalArgumentException e) {
                        fmsVar.e(i);
                        a(fmsVar, iA);
                    }
                    break;
                case 18:
                    this.b = fmsVar.c();
                    break;
                case 24:
                    this.c = Integer.valueOf(fmsVar.d());
                    break;
                case 34:
                    this.d = fmsVar.c();
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

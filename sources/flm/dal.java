package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dal extends fmv {
    private Integer a = null;
    private Integer b = null;

    public dal() {
        this.g = null;
        this.h = -1;
    }

    @Override // flm.fmv, flm.fnb
    public final void a(fmt fmtVar) throws fmu {
        if (this.a != null) {
            fmtVar.a(1, this.a.intValue());
        }
        if (this.b != null) {
            fmtVar.a(2, this.b.intValue());
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
            return iA + fmt.b(2, this.b.intValue());
        }
        return iA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // flm.fnb
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final dal a(fms fmsVar) throws fna {
        while (true) {
            int iA = fmsVar.a();
            switch (iA) {
                case bbx.MSG_UNBIND_SERVICE /* 0 */:
                    break;
                case 8:
                    int i = fmsVar.i();
                    try {
                        int iD = fmsVar.d();
                        if ((iD < 0 || iD > 0) && ((iD < 10 || iD > 10) && ((iD < 15 || iD > 15) && ((iD < 20 || iD > 20) && ((iD < 25 || iD > 25) && ((iD < 31 || iD > 31) && ((iD < 50 || iD > 50) && ((iD < 55 || iD > 55) && ((iD < 70 || iD > 70) && ((iD < 99 || iD > 100) && ((iD < 110 || iD > 110) && ((iD < 120 || iD > 120) && ((iD < 198 || iD > 200) && ((iD < 205 || iD > 205) && ((iD < 207 || iD > 207) && ((iD < 210 || iD > 210) && ((iD < 230 || iD > 230) && (iD < 254 || iD > 255)))))))))))))))))) {
                            throw new IllegalArgumentException(new StringBuilder(48).append(iD).append(" is not a valid enum AuthResultStatus").toString());
                        }
                        this.a = Integer.valueOf(iD);
                    } catch (IllegalArgumentException e) {
                        fmsVar.e(i);
                        a(fmsVar, iA);
                    }
                    break;
                case 16:
                    int i2 = fmsVar.i();
                    try {
                        int iD2 = fmsVar.d();
                        if ((iD2 < 0 || iD2 > 13) && (iD2 < 15 || iD2 > 15)) {
                            throw new IllegalArgumentException(new StringBuilder(44).append(iD2).append(" is not a valid enum AuthProgress").toString());
                        }
                        this.b = Integer.valueOf(iD2);
                    } catch (IllegalArgumentException e2) {
                        fmsVar.e(i2);
                        a(fmsVar, iA);
                    }
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

package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class asf extends fmv {
    private Integer a = null;
    private String b = null;
    private efe[] c = new efe[0];

    public asf() {
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
        if (this.c != null && this.c.length > 0) {
            for (int i = 0; i < this.c.length; i++) {
                efe efeVar = this.c[i];
                if (efeVar != null) {
                    fmtVar.a(3, efeVar);
                }
            }
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
        if (this.c != null && this.c.length > 0) {
            int iC = iA;
            for (int i = 0; i < this.c.length; i++) {
                efe efeVar = this.c[i];
                if (efeVar != null) {
                    iC += fhp.c(3, efeVar);
                }
            }
            return iC;
        }
        return iA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // flm.fnb
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final asf a(fms fmsVar) throws fna {
        while (true) {
            int iA = fmsVar.a();
            switch (iA) {
                case bbx.MSG_UNBIND_SERVICE /* 0 */:
                    break;
                case 8:
                    int i = fmsVar.i();
                    try {
                        int iD = fmsVar.d();
                        if (iD < 0 || iD > 59) {
                            throw new IllegalArgumentException(new StringBuilder(38).append(iD).append(" is not a valid enum Status").toString());
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
                case 26:
                    int iA2 = fne.a(fmsVar, 26);
                    int length = this.c == null ? 0 : this.c.length;
                    efe[] efeVarArr = new efe[iA2 + length];
                    if (length != 0) {
                        System.arraycopy(this.c, 0, efeVarArr, 0, length);
                    }
                    while (true) {
                        int i2 = length;
                        if (i2 < efeVarArr.length - 1) {
                            efeVarArr[i2] = (efe) fmsVar.a((fko) efe.a.a(dp.aw, (Object) null));
                            fmsVar.a();
                            length = i2 + 1;
                        } else {
                            efeVarArr[i2] = (efe) fmsVar.a((fko) efe.a.a(dp.aw, (Object) null));
                            this.c = efeVarArr;
                        }
                        break;
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

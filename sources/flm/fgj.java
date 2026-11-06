package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fgj extends fmv {
    private ffy[] a = new ffy[0];
    private fgb[] b = new fgb[0];

    public fgj() {
        this.h = -1;
    }

    @Override // flm.fmv, flm.fnb
    public final void a(fmt fmtVar) {
        if (this.a != null && this.a.length > 0) {
            for (int i = 0; i < this.a.length; i++) {
                ffy ffyVar = this.a[i];
                if (ffyVar != null) {
                    fmtVar.a(1, ffyVar);
                }
            }
        }
        if (this.b != null && this.b.length > 0) {
            for (int i2 = 0; i2 < this.b.length; i2++) {
                fgb fgbVar = this.b[i2];
                if (fgbVar != null) {
                    fmtVar.a(2, fgbVar);
                }
            }
        }
        super.a(fmtVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.fmv, flm.fnb
    public final int a() {
        int iA = super.a();
        if (this.a != null && this.a.length > 0) {
            int iC = iA;
            for (int i = 0; i < this.a.length; i++) {
                ffy ffyVar = this.a[i];
                if (ffyVar != null) {
                    iC += fhp.c(1, ffyVar);
                }
            }
            iA = iC;
        }
        if (this.b != null && this.b.length > 0) {
            for (int i2 = 0; i2 < this.b.length; i2++) {
                fgb fgbVar = this.b[i2];
                if (fgbVar != null) {
                    iA += fhp.c(2, fgbVar);
                }
            }
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
                    int iA2 = fne.a(fmsVar, 10);
                    int length = this.a == null ? 0 : this.a.length;
                    ffy[] ffyVarArr = new ffy[iA2 + length];
                    if (length != 0) {
                        System.arraycopy(this.a, 0, ffyVarArr, 0, length);
                    }
                    while (true) {
                        int i = length;
                        if (i < ffyVarArr.length - 1) {
                            ffyVarArr[i] = (ffy) fmsVar.a((fko) ffy.a.a(dp.aw, (Object) null));
                            fmsVar.a();
                            length = i + 1;
                        } else {
                            ffyVarArr[i] = (ffy) fmsVar.a((fko) ffy.a.a(dp.aw, (Object) null));
                            this.a = ffyVarArr;
                        }
                        break;
                    }
                    break;
                case 18:
                    int iA3 = fne.a(fmsVar, 18);
                    int length2 = this.b == null ? 0 : this.b.length;
                    fgb[] fgbVarArr = new fgb[iA3 + length2];
                    if (length2 != 0) {
                        System.arraycopy(this.b, 0, fgbVarArr, 0, length2);
                    }
                    while (true) {
                        int i2 = length2;
                        if (i2 < fgbVarArr.length - 1) {
                            fgbVarArr[i2] = (fgb) fmsVar.a((fko) fgb.a.a(dp.aw, (Object) null));
                            fmsVar.a();
                            length2 = i2 + 1;
                        } else {
                            fgbVarArr[i2] = (fgb) fmsVar.a((fko) fgb.a.a(dp.aw, (Object) null));
                            this.b = fgbVarArr;
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

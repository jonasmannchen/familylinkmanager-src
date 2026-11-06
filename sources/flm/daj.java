package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class daj extends fmv {
    private dak[] a = dak.b();

    public daj() {
        this.g = null;
        this.h = -1;
    }

    @Override // flm.fmv, flm.fnb
    public final void a(fmt fmtVar) throws fmu {
        if (this.a != null && this.a.length > 0) {
            for (int i = 0; i < this.a.length; i++) {
                dak dakVar = this.a[i];
                if (dakVar != null) {
                    fmtVar.a(1, dakVar);
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
            for (int i = 0; i < this.a.length; i++) {
                dak dakVar = this.a[i];
                if (dakVar != null) {
                    iA += fmt.b(1, dakVar);
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
                    dak[] dakVarArr = new dak[iA2 + length];
                    if (length != 0) {
                        System.arraycopy(this.a, 0, dakVarArr, 0, length);
                    }
                    while (length < dakVarArr.length - 1) {
                        dakVarArr[length] = new dak();
                        fmsVar.a(dakVarArr[length]);
                        fmsVar.a();
                        length++;
                    }
                    dakVarArr[length] = new dak();
                    fmsVar.a(dakVarArr[length]);
                    this.a = dakVarArr;
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

package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class asg extends fmv {
    private arr a = null;
    private ash b = null;
    private asi[] c = asi.b();

    public asg() {
        this.g = null;
        this.h = -1;
    }

    @Override // flm.fmv, flm.fnb
    public final void a(fmt fmtVar) throws fmu {
        if (this.a != null && this.a != null) {
            fmtVar.a(1, this.a.a);
        }
        if (this.b != null) {
            fmtVar.a(2, this.b);
        }
        if (this.c != null && this.c.length > 0) {
            for (int i = 0; i < this.c.length; i++) {
                asi asiVar = this.c[i];
                if (asiVar != null) {
                    fmtVar.a(3, asiVar);
                }
            }
        }
        super.a(fmtVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.fmv, flm.fnb
    public final int a() {
        int iA = super.a();
        if (this.a != null && this.a != null) {
            iA += fmt.b(1, this.a.a);
        }
        if (this.b != null) {
            iA += fmt.b(2, this.b);
        }
        if (this.c != null && this.c.length > 0) {
            int iB = iA;
            for (int i = 0; i < this.c.length; i++) {
                asi asiVar = this.c[i];
                if (asiVar != null) {
                    iB += fmt.b(3, asiVar);
                }
            }
            return iB;
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
                    int i = fmsVar.i();
                    int iD = fmsVar.d();
                    switch (iD) {
                        case bbx.MSG_UNBIND_SERVICE /* 0 */:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                            this.a = arr.a(iD);
                            break;
                        default:
                            fmsVar.e(i);
                            a(fmsVar, iA);
                            break;
                    }
                    break;
                case 18:
                    if (this.b == null) {
                        this.b = new ash();
                    }
                    fmsVar.a(this.b);
                    break;
                case 26:
                    int iA2 = fne.a(fmsVar, 26);
                    int length = this.c == null ? 0 : this.c.length;
                    asi[] asiVarArr = new asi[iA2 + length];
                    if (length != 0) {
                        System.arraycopy(this.c, 0, asiVarArr, 0, length);
                    }
                    while (length < asiVarArr.length - 1) {
                        asiVarArr[length] = new asi();
                        fmsVar.a(asiVarArr[length]);
                        fmsVar.a();
                        length++;
                    }
                    asiVarArr[length] = new asi();
                    fmsVar.a(asiVarArr[length]);
                    this.c = asiVarArr;
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

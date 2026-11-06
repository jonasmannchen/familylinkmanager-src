package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dan extends fmv {
    private Boolean a = null;
    private Boolean b = null;
    private dam c = null;
    private Boolean d = null;
    private daj e = null;
    private dao[] f = dao.b();

    public dan() {
        this.g = null;
        this.h = -1;
    }

    @Override // flm.fmv, flm.fnb
    public final void a(fmt fmtVar) throws fmu {
        if (this.a != null) {
            fmtVar.a(1, this.a.booleanValue());
        }
        if (this.b != null) {
            fmtVar.a(2, this.b.booleanValue());
        }
        if (this.c != null) {
            fmtVar.a(3, this.c);
        }
        if (this.d != null) {
            fmtVar.a(4, this.d.booleanValue());
        }
        if (this.e != null) {
            fmtVar.a(5, this.e);
        }
        if (this.f != null && this.f.length > 0) {
            for (int i = 0; i < this.f.length; i++) {
                dao daoVar = this.f[i];
                if (daoVar != null) {
                    fmtVar.a(6, daoVar);
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
            this.a.booleanValue();
            iA += fmt.b(1) + 1;
        }
        if (this.b != null) {
            this.b.booleanValue();
            iA += fmt.b(2) + 1;
        }
        if (this.c != null) {
            iA += fmt.b(3, this.c);
        }
        if (this.d != null) {
            this.d.booleanValue();
            iA += fmt.b(4) + 1;
        }
        if (this.e != null) {
            iA += fmt.b(5, this.e);
        }
        if (this.f != null && this.f.length > 0) {
            int iB = iA;
            for (int i = 0; i < this.f.length; i++) {
                dao daoVar = this.f[i];
                if (daoVar != null) {
                    iB += fmt.b(6, daoVar);
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
                    this.a = Boolean.valueOf(fmsVar.b());
                    break;
                case 16:
                    this.b = Boolean.valueOf(fmsVar.b());
                    break;
                case 26:
                    if (this.c == null) {
                        this.c = new dam();
                    }
                    fmsVar.a(this.c);
                    break;
                case 32:
                    this.d = Boolean.valueOf(fmsVar.b());
                    break;
                case 42:
                    if (this.e == null) {
                        this.e = new daj();
                    }
                    fmsVar.a(this.e);
                    break;
                case 50:
                    int iA2 = fne.a(fmsVar, 50);
                    int length = this.f == null ? 0 : this.f.length;
                    dao[] daoVarArr = new dao[iA2 + length];
                    if (length != 0) {
                        System.arraycopy(this.f, 0, daoVarArr, 0, length);
                    }
                    while (length < daoVarArr.length - 1) {
                        daoVarArr[length] = new dao();
                        fmsVar.a(daoVarArr[length]);
                        fmsVar.a();
                        length++;
                    }
                    daoVarArr[length] = new dao();
                    fmsVar.a(daoVarArr[length]);
                    this.f = daoVarArr;
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

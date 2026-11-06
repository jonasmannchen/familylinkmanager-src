package flm;

import com.google.android.gms.kids.aidl.IKidsInternalService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class asq extends fmv {
    private String a = null;
    private Long b = null;
    private Long c = null;
    private Long d = null;
    private Long e = null;
    private Long f = null;
    private String i = null;

    public asq() {
        this.g = null;
        this.h = -1;
    }

    @Override // flm.fmv, flm.fnb
    public final void a(fmt fmtVar) throws fmu {
        if (this.a != null) {
            fmtVar.a(1, this.a);
        }
        if (this.b != null) {
            fmtVar.a(2, this.b.longValue());
        }
        if (this.c != null) {
            fmtVar.a(3, this.c.longValue());
        }
        if (this.d != null) {
            fmtVar.a(4, this.d.longValue());
        }
        if (this.e != null) {
            fmtVar.a(5, this.e.longValue());
        }
        if (this.f != null) {
            fmtVar.a(6, this.f.longValue());
        }
        if (this.i != null) {
            fmtVar.a(7, this.i);
        }
        super.a(fmtVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.fmv, flm.fnb
    public final int a() {
        int iA = super.a();
        if (this.a != null) {
            iA += fmt.b(1, this.a);
        }
        if (this.b != null) {
            iA += fmt.b(2, this.b.longValue());
        }
        if (this.c != null) {
            iA += fmt.b(3, this.c.longValue());
        }
        if (this.d != null) {
            iA += fmt.b(4, this.d.longValue());
        }
        if (this.e != null) {
            iA += fmt.b(5, this.e.longValue());
        }
        if (this.f != null) {
            iA += fmt.b(6, this.f.longValue());
        }
        if (this.i != null) {
            return iA + fmt.b(7, this.i);
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
                    this.a = fmsVar.c();
                    break;
                case 16:
                    this.b = Long.valueOf(fmsVar.e());
                    break;
                case 24:
                    this.c = Long.valueOf(fmsVar.e());
                    break;
                case 32:
                    this.d = Long.valueOf(fmsVar.e());
                    break;
                case 40:
                    this.e = Long.valueOf(fmsVar.e());
                    break;
                case IKidsInternalService.Stub.TRANSACTION_getMemberSvExitState /* 48 */:
                    this.f = Long.valueOf(fmsVar.e());
                    break;
                case 58:
                    this.i = fmsVar.c();
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

package flm;

import com.google.android.gms.kids.aidl.IKidsInternalService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class asv extends fmv {
    private static volatile asv[] a;
    private Integer b = null;
    private Integer c = null;
    private Integer d = null;
    private Long e = null;
    private Long f = null;
    private Long i = null;
    private Long j = null;
    private Long k = null;
    private Double l = null;
    private Double m = null;
    private Double n = null;

    public static asv[] b() {
        if (a == null) {
            synchronized (fmz.b) {
                if (a == null) {
                    a = new asv[0];
                }
            }
        }
        return a;
    }

    public asv() {
        this.g = null;
        this.h = -1;
    }

    @Override // flm.fmv, flm.fnb
    public final void a(fmt fmtVar) throws fmu {
        if (this.b != null) {
            fmtVar.a(1, this.b.intValue());
        }
        if (this.c != null) {
            fmtVar.a(2, this.c.intValue());
        }
        if (this.d != null) {
            fmtVar.a(3, this.d.intValue());
        }
        if (this.e != null) {
            fmtVar.a(4, this.e.longValue());
        }
        if (this.f != null) {
            fmtVar.a(5, this.f.longValue());
        }
        if (this.i != null) {
            fmtVar.a(6, this.i.longValue());
        }
        if (this.j != null) {
            fmtVar.a(7, this.j.longValue());
        }
        if (this.k != null) {
            fmtVar.a(8, this.k.longValue());
        }
        if (this.l != null) {
            fmtVar.a(9, this.l.doubleValue());
        }
        if (this.m != null) {
            fmtVar.a(10, this.m.doubleValue());
        }
        if (this.n != null) {
            fmtVar.a(11, this.n.doubleValue());
        }
        super.a(fmtVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.fmv, flm.fnb
    public final int a() {
        int iA = super.a();
        if (this.b != null) {
            iA += fmt.b(1, this.b.intValue());
        }
        if (this.c != null) {
            iA += fmt.b(2, this.c.intValue());
        }
        if (this.d != null) {
            iA += fmt.b(3, this.d.intValue());
        }
        if (this.e != null) {
            iA += fmt.b(4, this.e.longValue());
        }
        if (this.f != null) {
            iA += fmt.b(5, this.f.longValue());
        }
        if (this.i != null) {
            iA += fmt.b(6, this.i.longValue());
        }
        if (this.j != null) {
            iA += fmt.b(7, this.j.longValue());
        }
        if (this.k != null) {
            iA += fmt.b(8, this.k.longValue());
        }
        if (this.l != null) {
            this.l.doubleValue();
            iA += fmt.b(9) + 8;
        }
        if (this.m != null) {
            this.m.doubleValue();
            iA += fmt.b(10) + 8;
        }
        if (this.n != null) {
            this.n.doubleValue();
            return iA + fmt.b(11) + 8;
        }
        return iA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // flm.fnb
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final asv a(fms fmsVar) throws fna {
        while (true) {
            int iA = fmsVar.a();
            switch (iA) {
                case bbx.MSG_UNBIND_SERVICE /* 0 */:
                    break;
                case 8:
                    this.b = Integer.valueOf(fmsVar.d());
                    break;
                case 16:
                    this.c = Integer.valueOf(fmsVar.d());
                    break;
                case 24:
                    int i = fmsVar.i();
                    try {
                        int iD = fmsVar.d();
                        if (iD < -1 || iD > 1) {
                            throw new IllegalArgumentException(new StringBuilder(43).append(iD).append(" is not a valid enum NetworkType").toString());
                        }
                        this.d = Integer.valueOf(iD);
                    } catch (IllegalArgumentException e) {
                        fmsVar.e(i);
                        a(fmsVar, iA);
                    }
                    break;
                case 32:
                    this.e = Long.valueOf(fmsVar.e());
                    break;
                case 40:
                    this.f = Long.valueOf(fmsVar.e());
                    break;
                case IKidsInternalService.Stub.TRANSACTION_getMemberSvExitState /* 48 */:
                    this.i = Long.valueOf(fmsVar.e());
                    break;
                case IKidsInternalService.Stub.TRANSACTION_setLockdownInfoForPermalock /* 56 */:
                    this.j = Long.valueOf(fmsVar.e());
                    break;
                case 64:
                    this.k = Long.valueOf(fmsVar.e());
                    break;
                case 73:
                    this.l = Double.valueOf(Double.longBitsToDouble(fmsVar.g()));
                    break;
                case 81:
                    this.m = Double.valueOf(Double.longBitsToDouble(fmsVar.g()));
                    break;
                case 89:
                    this.n = Double.valueOf(Double.longBitsToDouble(fmsVar.g()));
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

package flm;

import com.google.android.gms.kids.aidl.IKidsInternalService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class aso extends fmv {
    private static volatile aso[] a;
    private String b = null;
    private Integer c = null;
    private Integer d = null;
    private Long e = null;
    private Long f = null;
    private Long i = null;
    private Long j = null;
    private Long k = null;
    private Long l = null;
    private Long m = null;
    private Long n = null;
    private Integer o = null;
    private Integer p = null;
    private Long q = null;
    private Long r = null;
    private Long s = null;
    private Long t = null;

    public static aso[] b() {
        if (a == null) {
            synchronized (fmz.b) {
                if (a == null) {
                    a = new aso[0];
                }
            }
        }
        return a;
    }

    public aso() {
        this.g = null;
        this.h = -1;
    }

    @Override // flm.fmv, flm.fnb
    public final void a(fmt fmtVar) throws fmu {
        if (this.b != null) {
            fmtVar.a(1, this.b);
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
            fmtVar.a(9, this.l.longValue());
        }
        if (this.m != null) {
            fmtVar.a(10, this.m.longValue());
        }
        if (this.n != null) {
            fmtVar.a(11, this.n.longValue());
        }
        if (this.o != null) {
            fmtVar.a(12, this.o.intValue());
        }
        if (this.p != null) {
            fmtVar.a(13, this.p.intValue());
        }
        if (this.q != null) {
            fmtVar.a(14, this.q.longValue());
        }
        if (this.r != null) {
            fmtVar.a(15, this.r.longValue());
        }
        if (this.s != null) {
            fmtVar.a(16, this.s.longValue());
        }
        if (this.t != null) {
            fmtVar.a(17, this.t.longValue());
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
            iA += fmt.b(9, this.l.longValue());
        }
        if (this.m != null) {
            iA += fmt.b(10, this.m.longValue());
        }
        if (this.n != null) {
            iA += fmt.b(11, this.n.longValue());
        }
        if (this.o != null) {
            iA += fmt.b(12, this.o.intValue());
        }
        if (this.p != null) {
            iA += fmt.b(13, this.p.intValue());
        }
        if (this.q != null) {
            iA += fmt.b(14, this.q.longValue());
        }
        if (this.r != null) {
            iA += fmt.b(15, this.r.longValue());
        }
        if (this.s != null) {
            iA += fmt.b(16, this.s.longValue());
        }
        if (this.t != null) {
            return iA + fmt.b(17, this.t.longValue());
        }
        return iA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // flm.fnb
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final aso a(fms fmsVar) throws fna {
        while (true) {
            int iA = fmsVar.a();
            switch (iA) {
                case bbx.MSG_UNBIND_SERVICE /* 0 */:
                    break;
                case 10:
                    this.b = fmsVar.c();
                    break;
                case 16:
                    this.c = Integer.valueOf(fmsVar.d());
                    break;
                case 24:
                    this.d = Integer.valueOf(fmsVar.d());
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
                case 72:
                    this.l = Long.valueOf(fmsVar.e());
                    break;
                case 80:
                    this.m = Long.valueOf(fmsVar.e());
                    break;
                case 88:
                    this.n = Long.valueOf(fmsVar.e());
                    break;
                case 96:
                    this.o = Integer.valueOf(fmsVar.d());
                    break;
                case 104:
                    int i = fmsVar.i();
                    try {
                        int iD = fmsVar.d();
                        if (iD < -1 || iD > 4) {
                            throw new IllegalArgumentException(new StringBuilder(45).append(iD).append(" is not a valid enum TransportType").toString());
                        }
                        this.p = Integer.valueOf(iD);
                    } catch (IllegalArgumentException e) {
                        fmsVar.e(i);
                        a(fmsVar, iA);
                    }
                    break;
                case 112:
                    this.q = Long.valueOf(fmsVar.e());
                    break;
                case 120:
                    this.r = Long.valueOf(fmsVar.e());
                    break;
                case 128:
                    this.s = Long.valueOf(fmsVar.e());
                    break;
                case 136:
                    this.t = Long.valueOf(fmsVar.e());
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

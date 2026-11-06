package flm;

import com.google.android.gms.kids.aidl.IKidsInternalService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ase extends fmv {
    private static volatile ase[] a;
    private Long b = null;
    private ark c = null;
    private String d = null;
    private Long e = null;
    private Long f = null;
    private Long i = null;
    private String[] j = fne.c;
    private Integer k = null;
    private Long l = null;
    private String m = null;
    private Float n = null;

    public static ase[] b() {
        if (a == null) {
            synchronized (fmz.b) {
                if (a == null) {
                    a = new ase[0];
                }
            }
        }
        return a;
    }

    public ase() {
        this.g = null;
        this.h = -1;
    }

    @Override // flm.fmv, flm.fnb
    public final void a(fmt fmtVar) throws fmu {
        if (this.b != null) {
            fmtVar.a(1, this.b.longValue());
        }
        if (this.c != null && this.c != null) {
            fmtVar.a(2, this.c.a);
        }
        if (this.d != null) {
            fmtVar.a(3, this.d);
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
        if (this.j != null && this.j.length > 0) {
            for (int i = 0; i < this.j.length; i++) {
                String str = this.j[i];
                if (str != null) {
                    fmtVar.a(7, str);
                }
            }
        }
        if (this.k != null) {
            fmtVar.a(8, this.k.intValue());
        }
        if (this.l != null) {
            fmtVar.a(9, this.l.longValue());
        }
        if (this.m != null) {
            fmtVar.a(10, this.m);
        }
        if (this.n != null) {
            fmtVar.a(11, this.n.floatValue());
        }
        super.a(fmtVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.fmv, flm.fnb
    public final int a() {
        int iA = super.a();
        if (this.b != null) {
            iA += fmt.b(1, this.b.longValue());
        }
        if (this.c != null && this.c != null) {
            iA += fmt.b(2, this.c.a);
        }
        if (this.d != null) {
            iA += fmt.b(3, this.d);
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
        if (this.j != null && this.j.length > 0) {
            int iA2 = 0;
            int i = 0;
            for (int i2 = 0; i2 < this.j.length; i2++) {
                String str = this.j[i2];
                if (str != null) {
                    i++;
                    iA2 += fmt.a(str);
                }
            }
            iA = iA + iA2 + (i * 1);
        }
        if (this.k != null) {
            iA += fmt.b(8, this.k.intValue());
        }
        if (this.l != null) {
            iA += fmt.b(9, this.l.longValue());
        }
        if (this.m != null) {
            iA += fmt.b(10, this.m);
        }
        if (this.n != null) {
            this.n.floatValue();
            return iA + fmt.b(11) + 4;
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
                    this.b = Long.valueOf(fmsVar.e());
                    break;
                case 16:
                    int i = fmsVar.i();
                    int iD = fmsVar.d();
                    switch (iD) {
                        case bbx.MSG_UNBIND_SERVICE /* 0 */:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                            this.c = ark.a(iD);
                            break;
                        default:
                            fmsVar.e(i);
                            a(fmsVar, iA);
                            break;
                    }
                    break;
                case 26:
                    this.d = fmsVar.c();
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
                case 58:
                    int iA2 = fne.a(fmsVar, 58);
                    int length = this.j == null ? 0 : this.j.length;
                    String[] strArr = new String[iA2 + length];
                    if (length != 0) {
                        System.arraycopy(this.j, 0, strArr, 0, length);
                    }
                    while (length < strArr.length - 1) {
                        strArr[length] = fmsVar.c();
                        fmsVar.a();
                        length++;
                    }
                    strArr[length] = fmsVar.c();
                    this.j = strArr;
                    break;
                case 64:
                    this.k = Integer.valueOf(fmsVar.d());
                    break;
                case 72:
                    this.l = Long.valueOf(fmsVar.e());
                    break;
                case 82:
                    this.m = fmsVar.c();
                    break;
                case 93:
                    this.n = Float.valueOf(Float.intBitsToFloat(fmsVar.f()));
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

package flm;

import com.google.android.gms.kids.aidl.IKidsInternalService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fgk extends fmv {
    private fge d;
    public String a = "";
    private long[] b = fne.b;
    private fgj c = null;
    private String e = "";
    private int f = 0;
    private int i = 0;

    public fgk() {
        this.h = -1;
    }

    @Override // flm.fmv, flm.fnb
    public final void a(fmt fmtVar) throws fmu {
        if (this.a != null && !this.a.equals("")) {
            fmtVar.a(1, this.a);
        }
        if (this.b != null && this.b.length > 0) {
            for (int i = 0; i < this.b.length; i++) {
                fmtVar.a(2, this.b[i]);
            }
        }
        if (this.c != null) {
            fmtVar.a(3, this.c);
        }
        if (this.d != null) {
            fmtVar.a(4, this.d);
        }
        if (this.e != null && !this.e.equals("")) {
            fmtVar.a(5, this.e);
        }
        if (this.f != 0) {
            fmtVar.a(6, this.f);
        }
        if (this.i != 0) {
            fmtVar.a(7, this.i);
        }
        super.a(fmtVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.fmv, flm.fnb
    public final int a() {
        int iA = super.a();
        if (this.a != null && !this.a.equals("")) {
            iA += fmt.b(1, this.a);
        }
        if (this.b != null && this.b.length > 0) {
            int iB = 0;
            for (int i = 0; i < this.b.length; i++) {
                iB += fmt.b(this.b[i]);
            }
            iA = iA + iB + (this.b.length * 1);
        }
        if (this.c != null) {
            iA += fmt.b(3, this.c);
        }
        if (this.d != null) {
            iA += fhp.c(4, this.d);
        }
        if (this.e != null && !this.e.equals("")) {
            iA += fmt.b(5, this.e);
        }
        if (this.f != 0) {
            iA += fmt.b(6, this.f);
        }
        if (this.i != 0) {
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
                    int iA2 = fne.a(fmsVar, 16);
                    int length = this.b == null ? 0 : this.b.length;
                    long[] jArr = new long[iA2 + length];
                    if (length != 0) {
                        System.arraycopy(this.b, 0, jArr, 0, length);
                    }
                    while (length < jArr.length - 1) {
                        jArr[length] = fmsVar.e();
                        fmsVar.a();
                        length++;
                    }
                    jArr[length] = fmsVar.e();
                    this.b = jArr;
                    break;
                case 18:
                    int iC = fmsVar.c(fmsVar.d());
                    int i = fmsVar.i();
                    int i2 = 0;
                    while (fmsVar.h() > 0) {
                        fmsVar.e();
                        i2++;
                    }
                    fmsVar.e(i);
                    int length2 = this.b == null ? 0 : this.b.length;
                    long[] jArr2 = new long[i2 + length2];
                    if (length2 != 0) {
                        System.arraycopy(this.b, 0, jArr2, 0, length2);
                    }
                    while (length2 < jArr2.length) {
                        jArr2[length2] = fmsVar.e();
                        length2++;
                    }
                    this.b = jArr2;
                    fmsVar.d(iC);
                    break;
                case 26:
                    if (this.c == null) {
                        this.c = new fgj();
                    }
                    fmsVar.a(this.c);
                    break;
                case 34:
                    fge fgeVar = (fge) fmsVar.a((fko) fge.a.a(dp.aw, (Object) null));
                    if (this.d != null) {
                        fge fgeVar2 = this.d;
                        fio fioVar = (fio) fgeVar2.a(dp.au, (Object) null);
                        fioVar.a((fin) fgeVar2);
                        fgeVar = (fge) ((fin) ((fgf) ((fgf) fioVar).a((fin) fgeVar)).h());
                    }
                    this.d = fgeVar;
                    break;
                case 42:
                    this.e = fmsVar.c();
                    break;
                case IKidsInternalService.Stub.TRANSACTION_getMemberSvExitState /* 48 */:
                    this.f = fmsVar.d();
                    break;
                case IKidsInternalService.Stub.TRANSACTION_setLockdownInfoForPermalock /* 56 */:
                    this.i = fmsVar.d();
                    break;
                default:
                    if (!super.a(fmsVar, iA)) {
                    }
                    break;
            }
        }
        return this;
    }

    static {
        new fmw(11, fgk.class, 974987818, false);
    }
}

package flm;

import com.google.android.gms.kids.aidl.IKidsInternalService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class asr extends fmv {
    private static volatile asr[] i;
    public Integer a = null;
    public String b = null;
    public byte[] c = null;
    public Integer d = null;
    public Integer e = null;
    public Integer f = null;

    public static asr[] b() {
        if (i == null) {
            synchronized (fmz.b) {
                if (i == null) {
                    i = new asr[0];
                }
            }
        }
        return i;
    }

    public asr() {
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
        if (this.d != null) {
            fmtVar.a(4, this.d.intValue());
        }
        if (this.e != null) {
            fmtVar.a(5, this.e.intValue());
        }
        if (this.c != null) {
            byte[] bArr = this.c;
            fmtVar.c(6, 2);
            fmtVar.c(bArr.length);
            fmtVar.a(bArr);
        }
        if (this.f != null) {
            fmtVar.a(7, this.f.intValue());
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
        if (this.d != null) {
            iA += fmt.b(4, this.d.intValue());
        }
        if (this.e != null) {
            iA += fmt.b(5, this.e.intValue());
        }
        if (this.c != null) {
            byte[] bArr = this.c;
            iA += bArr.length + fmt.d(bArr.length) + fmt.b(6);
        }
        if (this.f != null) {
            return iA + fmt.b(7, this.f.intValue());
        }
        return iA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // flm.fnb
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final asr a(fms fmsVar) throws fna {
        byte[] bArr;
        while (true) {
            int iA = fmsVar.a();
            switch (iA) {
                case bbx.MSG_UNBIND_SERVICE /* 0 */:
                    break;
                case 8:
                    this.a = Integer.valueOf(fmsVar.d());
                    break;
                case 18:
                    this.b = fmsVar.c();
                    break;
                case 32:
                    this.d = Integer.valueOf(fmsVar.d());
                    break;
                case 40:
                    this.e = Integer.valueOf(fmsVar.d());
                    break;
                case 50:
                    int iD = fmsVar.d();
                    if (iD < 0) {
                        throw fna.b();
                    }
                    if (iD == 0) {
                        bArr = fne.d;
                    } else {
                        if (iD > fmsVar.c - fmsVar.d) {
                            throw fna.a();
                        }
                        bArr = new byte[iD];
                        System.arraycopy(fmsVar.a, fmsVar.d, bArr, 0, iD);
                        fmsVar.d = iD + fmsVar.d;
                    }
                    this.c = bArr;
                    break;
                    break;
                case IKidsInternalService.Stub.TRANSACTION_setLockdownInfoForPermalock /* 56 */:
                    int i2 = fmsVar.i();
                    try {
                        int iD2 = fmsVar.d();
                        if ((iD2 < 0 || iD2 > 52) && ((iD2 < 54 || iD2 > 91) && (iD2 < 93 || iD2 > 192))) {
                            throw new IllegalArgumentException(new StringBuilder(41).append(iD2).append(" is not a valid enum ServiceId").toString());
                        }
                        this.f = Integer.valueOf(iD2);
                    } catch (IllegalArgumentException e) {
                        fmsVar.e(i2);
                        a(fmsVar, iA);
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

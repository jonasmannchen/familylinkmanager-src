package flm;

import com.google.android.gms.kids.aidl.IKidsInternalService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dam extends fmv {
    private Boolean a = null;
    private Integer b = null;
    private Boolean c = null;
    private Boolean d = null;
    private Integer e = null;
    private Integer f = null;
    private Integer i = null;
    private Integer j = null;
    private Integer k = null;
    private Integer l = null;
    private Integer m = null;
    private Integer n = null;
    private Integer o = null;
    private Boolean p = null;
    private Boolean q = null;
    private int[] r = fne.a;
    private Boolean s = null;

    private static int a(int i) {
        if (i <= 0 || i > 2) {
            throw new IllegalArgumentException(new StringBuilder(48).append(i).append(" is not a valid enum SyncEnabledState").toString());
        }
        return i;
    }

    public dam() {
        this.g = null;
        this.h = -1;
    }

    @Override // flm.fmv, flm.fnb
    public final void a(fmt fmtVar) throws fmu {
        if (this.a != null) {
            fmtVar.a(1, this.a.booleanValue());
        }
        if (this.b != null) {
            fmtVar.a(2, this.b.intValue());
        }
        if (this.c != null) {
            fmtVar.a(3, this.c.booleanValue());
        }
        if (this.e != null) {
            fmtVar.a(4, this.e.intValue());
        }
        if (this.f != null) {
            fmtVar.a(5, this.f.intValue());
        }
        if (this.j != null) {
            fmtVar.a(6, this.j.intValue());
        }
        if (this.n != null) {
            fmtVar.a(7, this.n.intValue());
        }
        if (this.q != null) {
            fmtVar.a(8, this.q.booleanValue());
        }
        if (this.r != null && this.r.length > 0) {
            for (int i = 0; i < this.r.length; i++) {
                fmtVar.a(9, this.r[i]);
            }
        }
        if (this.l != null) {
            fmtVar.a(10, this.l.intValue());
        }
        if (this.p != null) {
            fmtVar.a(11, this.p.booleanValue());
        }
        if (this.m != null) {
            fmtVar.a(12, this.m.intValue());
        }
        if (this.i != null) {
            fmtVar.a(13, this.i.intValue());
        }
        if (this.k != null) {
            fmtVar.a(14, this.k.intValue());
        }
        if (this.d != null) {
            fmtVar.a(15, this.d.booleanValue());
        }
        if (this.o != null) {
            fmtVar.a(16, this.o.intValue());
        }
        if (this.s != null) {
            fmtVar.a(17, this.s.booleanValue());
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
            iA += fmt.b(2, this.b.intValue());
        }
        if (this.c != null) {
            this.c.booleanValue();
            iA += fmt.b(3) + 1;
        }
        if (this.e != null) {
            iA += fmt.b(4, this.e.intValue());
        }
        if (this.f != null) {
            iA += fmt.b(5, this.f.intValue());
        }
        if (this.j != null) {
            iA += fmt.b(6, this.j.intValue());
        }
        if (this.n != null) {
            iA += fmt.b(7, this.n.intValue());
        }
        if (this.q != null) {
            this.q.booleanValue();
            iA += fmt.b(8) + 1;
        }
        if (this.r != null && this.r.length > 0) {
            int iA2 = 0;
            for (int i = 0; i < this.r.length; i++) {
                iA2 += fmt.a(this.r[i]);
            }
            iA = iA + iA2 + (this.r.length * 1);
        }
        if (this.l != null) {
            iA += fmt.b(10, this.l.intValue());
        }
        if (this.p != null) {
            this.p.booleanValue();
            iA += fmt.b(11) + 1;
        }
        if (this.m != null) {
            iA += fmt.b(12, this.m.intValue());
        }
        if (this.i != null) {
            iA += fmt.b(13, this.i.intValue());
        }
        if (this.k != null) {
            iA += fmt.b(14, this.k.intValue());
        }
        if (this.d != null) {
            this.d.booleanValue();
            iA += fmt.b(15) + 1;
        }
        if (this.o != null) {
            iA += fmt.b(16, this.o.intValue());
        }
        if (this.s != null) {
            this.s.booleanValue();
            return iA + fmt.b(17) + 1;
        }
        return iA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // flm.fnb
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final dam a(fms fmsVar) throws fna {
        while (true) {
            int iA = fmsVar.a();
            switch (iA) {
                case bbx.MSG_UNBIND_SERVICE /* 0 */:
                    break;
                case 8:
                    this.a = Boolean.valueOf(fmsVar.b());
                    break;
                case 16:
                    int i = fmsVar.i();
                    try {
                        int iD = fmsVar.d();
                        if (iD < 0 || iD > 2) {
                            throw new IllegalArgumentException(new StringBuilder(40).append(iD).append(" is not a valid enum SyncMode").toString());
                        }
                        this.b = Integer.valueOf(iD);
                    } catch (IllegalArgumentException e) {
                        fmsVar.e(i);
                        a(fmsVar, iA);
                    }
                    break;
                case 24:
                    this.c = Boolean.valueOf(fmsVar.b());
                    break;
                case 32:
                    this.e = Integer.valueOf(fmsVar.d());
                    break;
                case 40:
                    this.f = Integer.valueOf(fmsVar.d());
                    break;
                case IKidsInternalService.Stub.TRANSACTION_getMemberSvExitState /* 48 */:
                    this.j = Integer.valueOf(fmsVar.d());
                    break;
                case IKidsInternalService.Stub.TRANSACTION_setLockdownInfoForPermalock /* 56 */:
                    this.n = Integer.valueOf(fmsVar.d());
                    break;
                case 64:
                    this.q = Boolean.valueOf(fmsVar.b());
                    break;
                case 72:
                    int iA2 = fne.a(fmsVar, 72);
                    int[] iArr = new int[iA2];
                    int i2 = 0;
                    for (int i3 = 0; i3 < iA2; i3++) {
                        if (i3 != 0) {
                            fmsVar.a();
                        }
                        int i4 = fmsVar.i();
                        try {
                            iArr[i2] = a(fmsVar.d());
                            i2++;
                        } catch (IllegalArgumentException e2) {
                            fmsVar.e(i4);
                            a(fmsVar, iA);
                        }
                    }
                    if (i2 != 0) {
                        int length = this.r == null ? 0 : this.r.length;
                        if (length == 0 && i2 == iArr.length) {
                            this.r = iArr;
                        } else {
                            int[] iArr2 = new int[length + i2];
                            if (length != 0) {
                                System.arraycopy(this.r, 0, iArr2, 0, length);
                            }
                            System.arraycopy(iArr, 0, iArr2, length, i2);
                            this.r = iArr2;
                        }
                    }
                    break;
                case 74:
                    int iC = fmsVar.c(fmsVar.d());
                    int i5 = fmsVar.i();
                    int i6 = 0;
                    while (fmsVar.h() > 0) {
                        try {
                            a(fmsVar.d());
                            i6++;
                        } catch (IllegalArgumentException e3) {
                        }
                    }
                    if (i6 != 0) {
                        fmsVar.e(i5);
                        int length2 = this.r == null ? 0 : this.r.length;
                        int[] iArr3 = new int[i6 + length2];
                        if (length2 != 0) {
                            System.arraycopy(this.r, 0, iArr3, 0, length2);
                        }
                        while (fmsVar.h() > 0) {
                            int i7 = fmsVar.i();
                            try {
                                iArr3[length2] = a(fmsVar.d());
                                length2++;
                            } catch (IllegalArgumentException e4) {
                                fmsVar.e(i7);
                                a(fmsVar, 72);
                            }
                        }
                        this.r = iArr3;
                    }
                    fmsVar.d(iC);
                    break;
                case 80:
                    this.l = Integer.valueOf(fmsVar.d());
                    break;
                case 88:
                    this.p = Boolean.valueOf(fmsVar.b());
                    break;
                case 96:
                    this.m = Integer.valueOf(fmsVar.d());
                    break;
                case 104:
                    this.i = Integer.valueOf(fmsVar.d());
                    break;
                case 112:
                    this.k = Integer.valueOf(fmsVar.d());
                    break;
                case 120:
                    this.d = Boolean.valueOf(fmsVar.b());
                    break;
                case 128:
                    this.o = Integer.valueOf(fmsVar.d());
                    break;
                case 136:
                    this.s = Boolean.valueOf(fmsVar.b());
                    break;
                default:
                    if (super.a(fmsVar, iA)) {
                    }
                    break;
            }
        }
        return this;
    }
}

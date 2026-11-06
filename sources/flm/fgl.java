package flm;

import com.google.android.gms.kids.aidl.IKidsInternalService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fgl extends fmv {
    public String a = "";
    public ffs b = null;
    private ffr d = ffr.UNKNOWN_CONTEXT_FAMILY;
    private int e = 0;
    private ffo f = ffo.UNKNOWN_SIGNAL_TYPE;
    private ffw i = null;
    public fgm c = null;
    private String[] j = fne.c;
    private ffu k = null;

    public fgl() {
        this.g = null;
        this.h = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof fgl)) {
            return false;
        }
        fgl fglVar = (fgl) obj;
        if (this.a == null) {
            if (fglVar.a != null) {
                return false;
            }
        } else if (!this.a.equals(fglVar.a)) {
            return false;
        }
        if (this.b == null) {
            if (fglVar.b != null) {
                return false;
            }
        } else if (!this.b.equals(fglVar.b)) {
            return false;
        }
        if (this.d == fglVar.d && this.e == fglVar.e && this.f == fglVar.f) {
            if (this.i == null) {
                if (fglVar.i != null) {
                    return false;
                }
            } else if (!this.i.equals(fglVar.i)) {
                return false;
            }
            if (this.c == null) {
                if (fglVar.c != null) {
                    return false;
                }
            } else if (!this.c.equals(fglVar.c)) {
                return false;
            }
            if (!fmz.a(this.j, fglVar.j)) {
                return false;
            }
            if (this.k == null) {
                if (fglVar.k != null) {
                    return false;
                }
            } else if (!this.k.equals(fglVar.k)) {
                return false;
            }
            if (this.g == null || this.g.a()) {
                return fglVar.g == null || fglVar.g.a();
            }
            return this.g.equals(fglVar.g);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = 0;
        int iHashCode2 = (this.a == null ? 0 : this.a.hashCode()) + ((getClass().getName().hashCode() + 527) * 31);
        ffs ffsVar = this.b;
        int iHashCode3 = (this.f == null ? 0 : this.f.hashCode()) + (((((this.d == null ? 0 : this.d.hashCode()) + (((ffsVar == null ? 0 : ffsVar.hashCode()) + (iHashCode2 * 31)) * 31)) * 31) + this.e) * 31);
        ffw ffwVar = this.i;
        int i = iHashCode3 * 31;
        int iHashCode4 = ffwVar == null ? 0 : ffwVar.hashCode();
        fgm fgmVar = this.c;
        int iHashCode5 = (((fgmVar == null ? 0 : fgmVar.hashCode()) + ((iHashCode4 + i) * 31)) * 31) + fmz.a(this.j);
        ffu ffuVar = this.k;
        int iHashCode6 = ((ffuVar == null ? 0 : ffuVar.hashCode()) + (iHashCode5 * 31)) * 31;
        if (this.g != null && !this.g.a()) {
            iHashCode = this.g.hashCode();
        }
        return iHashCode6 + iHashCode;
    }

    @Override // flm.fmv, flm.fnb
    public final void a(fmt fmtVar) throws fmu {
        if (this.a != null && !this.a.equals("")) {
            fmtVar.a(1, this.a);
        }
        if (this.b != null) {
            fmtVar.a(2, this.b);
        }
        if (this.d != ffr.UNKNOWN_CONTEXT_FAMILY && this.d != null) {
            fmtVar.a(4, this.d.b);
        }
        if (this.e != 0) {
            fmtVar.a(5, this.e);
        }
        if (this.f != ffo.UNKNOWN_SIGNAL_TYPE && this.f != null) {
            fmtVar.a(6, this.f.b);
        }
        if (this.i != null) {
            fmtVar.a(7, this.i);
        }
        if (this.c != null) {
            fmtVar.a(8, this.c);
        }
        if (this.j != null && this.j.length > 0) {
            for (int i = 0; i < this.j.length; i++) {
                String str = this.j[i];
                if (str != null) {
                    fmtVar.a(9, str);
                }
            }
        }
        if (this.k != null) {
            fmtVar.a(10, this.k);
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
        if (this.b != null) {
            iA += fhp.c(2, this.b);
        }
        if (this.d != ffr.UNKNOWN_CONTEXT_FAMILY && this.d != null) {
            iA += fmt.b(4, this.d.b);
        }
        if (this.e != 0) {
            iA += fmt.b(5, this.e);
        }
        if (this.f != ffo.UNKNOWN_SIGNAL_TYPE && this.f != null) {
            iA += fmt.b(6, this.f.b);
        }
        if (this.i != null) {
            iA += fhp.c(7, this.i);
        }
        if (this.c != null) {
            iA += fmt.b(8, this.c);
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
            return iA + fhp.c(10, this.k);
        }
        return iA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // flm.fnb
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final fgl a(fms fmsVar) throws fna {
        while (true) {
            int iA = fmsVar.a();
            switch (iA) {
                case bbx.MSG_UNBIND_SERVICE /* 0 */:
                    break;
                case 10:
                    this.a = fmsVar.c();
                    break;
                case 18:
                    ffs ffsVar = (ffs) fmsVar.a((fko) ffs.c.a(dp.aw, (Object) null));
                    if (this.b != null) {
                        ffs ffsVar2 = this.b;
                        fio fioVar = (fio) ffsVar2.a(dp.au, (Object) null);
                        fioVar.a((fin) ffsVar2);
                        ffsVar = (ffs) ((fin) ((fft) ((fft) fioVar).a((fin) ffsVar)).h());
                    }
                    this.b = ffsVar;
                    break;
                case 32:
                    int i = fmsVar.i();
                    int iD = fmsVar.d();
                    switch (iD) {
                        case bbx.MSG_UNBIND_SERVICE /* 0 */:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                            this.d = ffr.a(iD);
                            break;
                        default:
                            fmsVar.e(i);
                            a(fmsVar, iA);
                            break;
                    }
                    break;
                case 40:
                    int i2 = fmsVar.i();
                    try {
                        int iD2 = fmsVar.d();
                        if ((iD2 < 0 || iD2 > 32) && ((iD2 < 34 || iD2 > 78) && ((iD2 < 10000 || iD2 > 10009) && ((iD2 < 10999 || iD2 > 11009) && ((iD2 < 11999 || iD2 > 12009) && (iD2 < 99999 || iD2 > 100000)))))) {
                            throw new IllegalArgumentException(new StringBuilder(43).append(iD2).append(" is not a valid enum ContextName").toString());
                        }
                        this.e = iD2;
                    } catch (IllegalArgumentException e) {
                        fmsVar.e(i2);
                        a(fmsVar, iA);
                    }
                    break;
                case IKidsInternalService.Stub.TRANSACTION_getMemberSvExitState /* 48 */:
                    int i3 = fmsVar.i();
                    int iD3 = fmsVar.d();
                    switch (iD3) {
                        case bbx.MSG_UNBIND_SERVICE /* 0 */:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                            this.f = ffo.a(iD3);
                            break;
                        default:
                            fmsVar.e(i3);
                            a(fmsVar, iA);
                            break;
                    }
                    break;
                case 58:
                    ffw ffwVar = (ffw) fmsVar.a((fko) ffw.a.a(dp.aw, (Object) null));
                    if (this.i != null) {
                        ffw ffwVar2 = this.i;
                        fio fioVar2 = (fio) ffwVar2.a(dp.au, (Object) null);
                        fioVar2.a((fin) ffwVar2);
                        ffwVar = (ffw) ((fin) ((ffx) ((ffx) fioVar2).a((fin) ffwVar)).h());
                    }
                    this.i = ffwVar;
                    break;
                case 66:
                    if (this.c == null) {
                        this.c = new fgm();
                    }
                    fmsVar.a(this.c);
                    break;
                case 74:
                    int iA2 = fne.a(fmsVar, 74);
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
                case 82:
                    ffu ffuVar = (ffu) fmsVar.a((fko) ffu.a.a(dp.aw, (Object) null));
                    if (this.k != null) {
                        ffu ffuVar2 = this.k;
                        fio fioVar3 = (fio) ffuVar2.a(dp.au, (Object) null);
                        fioVar3.a((fin) ffuVar2);
                        ffuVar = (ffu) ((fin) ((ffv) ((ffv) fioVar3).a((fin) ffuVar)).h());
                    }
                    this.k = ffuVar;
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

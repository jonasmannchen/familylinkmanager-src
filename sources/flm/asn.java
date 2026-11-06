package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class asn extends fmv {
    private arx c = null;
    private dan d = null;
    private arv e = null;
    public asr[] a = asr.b();
    private asl[] f = asl.b();
    private ast[] i = ast.b();
    private aso[] j = aso.b();
    private ase[] k = ase.b();
    private Boolean l = null;
    private asf m = null;
    private Integer n = null;
    private asm o = null;
    private asg p = null;
    public ass b = null;
    private asp q = null;
    private asv[] r = asv.b();
    private asc[] s = new asc[0];

    public asn() {
        this.g = null;
        this.h = -1;
    }

    @Override // flm.fmv, flm.fnb
    public final void a(fmt fmtVar) throws fmu {
        if (this.c != null) {
            fmtVar.a(1, this.c);
        }
        if (this.d != null) {
            fmtVar.a(2, this.d);
        }
        if (this.e != null) {
            fmtVar.a(3, this.e);
        }
        if (this.a != null && this.a.length > 0) {
            for (int i = 0; i < this.a.length; i++) {
                asr asrVar = this.a[i];
                if (asrVar != null) {
                    fmtVar.a(4, asrVar);
                }
            }
        }
        if (this.f != null && this.f.length > 0) {
            for (int i2 = 0; i2 < this.f.length; i2++) {
                asl aslVar = this.f[i2];
                if (aslVar != null) {
                    fmtVar.a(5, aslVar);
                }
            }
        }
        if (this.i != null && this.i.length > 0) {
            for (int i3 = 0; i3 < this.i.length; i3++) {
                ast astVar = this.i[i3];
                if (astVar != null) {
                    fmtVar.a(6, astVar);
                }
            }
        }
        if (this.j != null && this.j.length > 0) {
            for (int i4 = 0; i4 < this.j.length; i4++) {
                aso asoVar = this.j[i4];
                if (asoVar != null) {
                    fmtVar.a(7, asoVar);
                }
            }
        }
        if (this.l != null) {
            fmtVar.a(8, this.l.booleanValue());
        }
        if (this.k != null && this.k.length > 0) {
            for (int i5 = 0; i5 < this.k.length; i5++) {
                ase aseVar = this.k[i5];
                if (aseVar != null) {
                    fmtVar.a(9, aseVar);
                }
            }
        }
        if (this.m != null) {
            fmtVar.a(10, this.m);
        }
        if (this.n != null) {
            fmtVar.a(11, this.n.intValue());
        }
        if (this.o != null) {
            fmtVar.a(12, this.o);
        }
        if (this.p != null) {
            fmtVar.a(13, this.p);
        }
        if (this.b != null) {
            fmtVar.a(14, this.b);
        }
        if (this.q != null) {
            fmtVar.a(16, this.q);
        }
        if (this.r != null && this.r.length > 0) {
            for (int i6 = 0; i6 < this.r.length; i6++) {
                asv asvVar = this.r[i6];
                if (asvVar != null) {
                    fmtVar.a(17, asvVar);
                }
            }
        }
        if (this.s != null && this.s.length > 0) {
            for (int i7 = 0; i7 < this.s.length; i7++) {
                asc ascVar = this.s[i7];
                if (ascVar != null) {
                    fmtVar.a(18, ascVar);
                }
            }
        }
        super.a(fmtVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.fmv, flm.fnb
    public final int a() {
        int iA = super.a();
        if (this.c != null) {
            iA += fhp.c(1, this.c);
        }
        if (this.d != null) {
            iA += fmt.b(2, this.d);
        }
        if (this.e != null) {
            iA += fhp.c(3, this.e);
        }
        if (this.a != null && this.a.length > 0) {
            int iB = iA;
            for (int i = 0; i < this.a.length; i++) {
                asr asrVar = this.a[i];
                if (asrVar != null) {
                    iB += fmt.b(4, asrVar);
                }
            }
            iA = iB;
        }
        if (this.f != null && this.f.length > 0) {
            int iB2 = iA;
            for (int i2 = 0; i2 < this.f.length; i2++) {
                asl aslVar = this.f[i2];
                if (aslVar != null) {
                    iB2 += fmt.b(5, aslVar);
                }
            }
            iA = iB2;
        }
        if (this.i != null && this.i.length > 0) {
            int iB3 = iA;
            for (int i3 = 0; i3 < this.i.length; i3++) {
                ast astVar = this.i[i3];
                if (astVar != null) {
                    iB3 += fmt.b(6, astVar);
                }
            }
            iA = iB3;
        }
        if (this.j != null && this.j.length > 0) {
            int iB4 = iA;
            for (int i4 = 0; i4 < this.j.length; i4++) {
                aso asoVar = this.j[i4];
                if (asoVar != null) {
                    iB4 += fmt.b(7, asoVar);
                }
            }
            iA = iB4;
        }
        if (this.l != null) {
            this.l.booleanValue();
            iA += fmt.b(8) + 1;
        }
        if (this.k != null && this.k.length > 0) {
            int iB5 = iA;
            for (int i5 = 0; i5 < this.k.length; i5++) {
                ase aseVar = this.k[i5];
                if (aseVar != null) {
                    iB5 += fmt.b(9, aseVar);
                }
            }
            iA = iB5;
        }
        if (this.m != null) {
            iA += fmt.b(10, this.m);
        }
        if (this.n != null) {
            iA += fmt.b(11, this.n.intValue());
        }
        if (this.o != null) {
            iA += fmt.b(12, this.o);
        }
        if (this.p != null) {
            iA += fmt.b(13, this.p);
        }
        if (this.b != null) {
            iA += fmt.b(14, this.b);
        }
        if (this.q != null) {
            iA += fmt.b(16, this.q);
        }
        if (this.r != null && this.r.length > 0) {
            int iB6 = iA;
            for (int i6 = 0; i6 < this.r.length; i6++) {
                asv asvVar = this.r[i6];
                if (asvVar != null) {
                    iB6 += fmt.b(17, asvVar);
                }
            }
            iA = iB6;
        }
        if (this.s != null && this.s.length > 0) {
            for (int i7 = 0; i7 < this.s.length; i7++) {
                asc ascVar = this.s[i7];
                if (ascVar != null) {
                    iA += fhp.c(18, ascVar);
                }
            }
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
                    arx arxVar = (arx) fmsVar.a((fko) arx.a.a(dp.aw, (Object) null));
                    if (this.c != null) {
                        arx arxVar2 = this.c;
                        fio fioVar = (fio) arxVar2.a(dp.au, (Object) null);
                        fioVar.a((fin) arxVar2);
                        arxVar = (arx) ((fin) ((ary) ((ary) fioVar).a((fin) arxVar)).h());
                    }
                    this.c = arxVar;
                    break;
                case 18:
                    if (this.d == null) {
                        this.d = new dan();
                    }
                    fmsVar.a(this.d);
                    break;
                case 26:
                    arv arvVar = (arv) fmsVar.a((fko) arv.a.a(dp.aw, (Object) null));
                    if (this.e != null) {
                        arv arvVar2 = this.e;
                        fio fioVar2 = (fio) arvVar2.a(dp.au, (Object) null);
                        fioVar2.a((fin) arvVar2);
                        arvVar = (arv) ((fin) ((arw) ((arw) fioVar2).a((fin) arvVar)).h());
                    }
                    this.e = arvVar;
                    break;
                case 34:
                    int iA2 = fne.a(fmsVar, 34);
                    int length = this.a == null ? 0 : this.a.length;
                    asr[] asrVarArr = new asr[iA2 + length];
                    if (length != 0) {
                        System.arraycopy(this.a, 0, asrVarArr, 0, length);
                    }
                    while (length < asrVarArr.length - 1) {
                        asrVarArr[length] = new asr();
                        fmsVar.a(asrVarArr[length]);
                        fmsVar.a();
                        length++;
                    }
                    asrVarArr[length] = new asr();
                    fmsVar.a(asrVarArr[length]);
                    this.a = asrVarArr;
                    break;
                case 42:
                    int iA3 = fne.a(fmsVar, 42);
                    int length2 = this.f == null ? 0 : this.f.length;
                    asl[] aslVarArr = new asl[iA3 + length2];
                    if (length2 != 0) {
                        System.arraycopy(this.f, 0, aslVarArr, 0, length2);
                    }
                    while (length2 < aslVarArr.length - 1) {
                        aslVarArr[length2] = new asl();
                        fmsVar.a(aslVarArr[length2]);
                        fmsVar.a();
                        length2++;
                    }
                    aslVarArr[length2] = new asl();
                    fmsVar.a(aslVarArr[length2]);
                    this.f = aslVarArr;
                    break;
                case 50:
                    int iA4 = fne.a(fmsVar, 50);
                    int length3 = this.i == null ? 0 : this.i.length;
                    ast[] astVarArr = new ast[iA4 + length3];
                    if (length3 != 0) {
                        System.arraycopy(this.i, 0, astVarArr, 0, length3);
                    }
                    while (length3 < astVarArr.length - 1) {
                        astVarArr[length3] = new ast();
                        fmsVar.a(astVarArr[length3]);
                        fmsVar.a();
                        length3++;
                    }
                    astVarArr[length3] = new ast();
                    fmsVar.a(astVarArr[length3]);
                    this.i = astVarArr;
                    break;
                case 58:
                    int iA5 = fne.a(fmsVar, 58);
                    int length4 = this.j == null ? 0 : this.j.length;
                    aso[] asoVarArr = new aso[iA5 + length4];
                    if (length4 != 0) {
                        System.arraycopy(this.j, 0, asoVarArr, 0, length4);
                    }
                    while (length4 < asoVarArr.length - 1) {
                        asoVarArr[length4] = new aso();
                        fmsVar.a(asoVarArr[length4]);
                        fmsVar.a();
                        length4++;
                    }
                    asoVarArr[length4] = new aso();
                    fmsVar.a(asoVarArr[length4]);
                    this.j = asoVarArr;
                    break;
                case 64:
                    this.l = Boolean.valueOf(fmsVar.b());
                    break;
                case 74:
                    int iA6 = fne.a(fmsVar, 74);
                    int length5 = this.k == null ? 0 : this.k.length;
                    ase[] aseVarArr = new ase[iA6 + length5];
                    if (length5 != 0) {
                        System.arraycopy(this.k, 0, aseVarArr, 0, length5);
                    }
                    while (length5 < aseVarArr.length - 1) {
                        aseVarArr[length5] = new ase();
                        fmsVar.a(aseVarArr[length5]);
                        fmsVar.a();
                        length5++;
                    }
                    aseVarArr[length5] = new ase();
                    fmsVar.a(aseVarArr[length5]);
                    this.k = aseVarArr;
                    break;
                case 82:
                    if (this.m == null) {
                        this.m = new asf();
                    }
                    fmsVar.a(this.m);
                    break;
                case 88:
                    this.n = Integer.valueOf(fmsVar.d());
                    break;
                case 98:
                    if (this.o == null) {
                        this.o = new asm();
                    }
                    fmsVar.a(this.o);
                    break;
                case 106:
                    if (this.p == null) {
                        this.p = new asg();
                    }
                    fmsVar.a(this.p);
                    break;
                case 114:
                    if (this.b == null) {
                        this.b = new ass();
                    }
                    fmsVar.a(this.b);
                    break;
                case 130:
                    if (this.q == null) {
                        this.q = new asp();
                    }
                    fmsVar.a(this.q);
                    break;
                case 138:
                    int iA7 = fne.a(fmsVar, 138);
                    int length6 = this.r == null ? 0 : this.r.length;
                    asv[] asvVarArr = new asv[iA7 + length6];
                    if (length6 != 0) {
                        System.arraycopy(this.r, 0, asvVarArr, 0, length6);
                    }
                    while (length6 < asvVarArr.length - 1) {
                        asvVarArr[length6] = new asv();
                        fmsVar.a(asvVarArr[length6]);
                        fmsVar.a();
                        length6++;
                    }
                    asvVarArr[length6] = new asv();
                    fmsVar.a(asvVarArr[length6]);
                    this.r = asvVarArr;
                    break;
                case 146:
                    int iA8 = fne.a(fmsVar, 146);
                    int length7 = this.s == null ? 0 : this.s.length;
                    asc[] ascVarArr = new asc[iA8 + length7];
                    if (length7 != 0) {
                        System.arraycopy(this.s, 0, ascVarArr, 0, length7);
                    }
                    while (true) {
                        int i = length7;
                        if (i < ascVarArr.length - 1) {
                            ascVarArr[i] = (asc) fmsVar.a((fko) asc.a.a(dp.aw, (Object) null));
                            fmsVar.a();
                            length7 = i + 1;
                        } else {
                            ascVarArr[i] = (asc) fmsVar.a((fko) asc.a.a(dp.aw, (Object) null));
                            this.s = ascVarArr;
                        }
                        break;
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

package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ast extends fmv {
    private static volatile ast[] a;
    private Long b = null;
    private Integer c = null;
    private Long d = null;
    private String e = null;
    private String f = null;
    private String i = null;
    private Long j = null;
    private String[] k = fne.c;
    private asu[] l = asu.b();
    private String m = null;
    private Long n = null;
    private Float o = null;
    private Boolean p = null;

    public static ast[] b() {
        if (a == null) {
            synchronized (fmz.b) {
                if (a == null) {
                    a = new ast[0];
                }
            }
        }
        return a;
    }

    public ast() {
        this.g = null;
        this.h = -1;
    }

    @Override // flm.fmv, flm.fnb
    public final void a(fmt fmtVar) throws fmu {
        if (this.b != null) {
            fmtVar.a(1, this.b.longValue());
        }
        if (this.c != null) {
            fmtVar.a(2, this.c.intValue());
        }
        if (this.d != null) {
            fmtVar.a(3, this.d.longValue());
        }
        if (this.e != null) {
            fmtVar.a(4, this.e);
        }
        if (this.j != null) {
            fmtVar.a(5, this.j.longValue());
        }
        if (this.k != null && this.k.length > 0) {
            for (int i = 0; i < this.k.length; i++) {
                String str = this.k[i];
                if (str != null) {
                    fmtVar.a(6, str);
                }
            }
        }
        if (this.f != null) {
            fmtVar.a(8, this.f);
        }
        if (this.m != null) {
            fmtVar.a(9, this.m);
        }
        if (this.n != null) {
            fmtVar.a(10, this.n.longValue());
        }
        if (this.o != null) {
            fmtVar.a(11, this.o.floatValue());
        }
        if (this.i != null) {
            fmtVar.a(12, this.i);
        }
        if (this.l != null && this.l.length > 0) {
            for (int i2 = 0; i2 < this.l.length; i2++) {
                asu asuVar = this.l[i2];
                if (asuVar != null) {
                    fmtVar.a(13, asuVar);
                }
            }
        }
        if (this.p != null) {
            fmtVar.a(14, this.p.booleanValue());
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
        if (this.c != null) {
            iA += fmt.b(2, this.c.intValue());
        }
        if (this.d != null) {
            iA += fmt.b(3, this.d.longValue());
        }
        if (this.e != null) {
            iA += fmt.b(4, this.e);
        }
        if (this.j != null) {
            iA += fmt.b(5, this.j.longValue());
        }
        if (this.k != null && this.k.length > 0) {
            int iA2 = 0;
            int i = 0;
            for (int i2 = 0; i2 < this.k.length; i2++) {
                String str = this.k[i2];
                if (str != null) {
                    i++;
                    iA2 += fmt.a(str);
                }
            }
            iA = iA + iA2 + (i * 1);
        }
        if (this.f != null) {
            iA += fmt.b(8, this.f);
        }
        if (this.m != null) {
            iA += fmt.b(9, this.m);
        }
        if (this.n != null) {
            iA += fmt.b(10, this.n.longValue());
        }
        if (this.o != null) {
            this.o.floatValue();
            iA += fmt.b(11) + 4;
        }
        if (this.i != null) {
            iA += fmt.b(12, this.i);
        }
        if (this.l != null && this.l.length > 0) {
            for (int i3 = 0; i3 < this.l.length; i3++) {
                asu asuVar = this.l[i3];
                if (asuVar != null) {
                    iA += fmt.b(13, asuVar);
                }
            }
        }
        if (this.p != null) {
            this.p.booleanValue();
            return iA + fmt.b(14) + 1;
        }
        return iA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // flm.fnb
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final ast a(fms fmsVar) throws fna {
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
                    try {
                        int iD = fmsVar.d();
                        if (iD < 0 || iD > 7) {
                            throw new IllegalArgumentException(new StringBuilder(41).append(iD).append(" is not a valid enum EventType").toString());
                        }
                        this.c = Integer.valueOf(iD);
                    } catch (IllegalArgumentException e) {
                        fmsVar.e(i);
                        a(fmsVar, iA);
                    }
                    break;
                case 24:
                    this.d = Long.valueOf(fmsVar.e());
                    break;
                case 34:
                    this.e = fmsVar.c();
                    break;
                case 40:
                    this.j = Long.valueOf(fmsVar.e());
                    break;
                case 50:
                    int iA2 = fne.a(fmsVar, 50);
                    int length = this.k == null ? 0 : this.k.length;
                    String[] strArr = new String[iA2 + length];
                    if (length != 0) {
                        System.arraycopy(this.k, 0, strArr, 0, length);
                    }
                    while (length < strArr.length - 1) {
                        strArr[length] = fmsVar.c();
                        fmsVar.a();
                        length++;
                    }
                    strArr[length] = fmsVar.c();
                    this.k = strArr;
                    break;
                case 66:
                    this.f = fmsVar.c();
                    break;
                case 74:
                    this.m = fmsVar.c();
                    break;
                case 80:
                    this.n = Long.valueOf(fmsVar.e());
                    break;
                case 93:
                    this.o = Float.valueOf(Float.intBitsToFloat(fmsVar.f()));
                    break;
                case 98:
                    this.i = fmsVar.c();
                    break;
                case 106:
                    int iA3 = fne.a(fmsVar, 106);
                    int length2 = this.l == null ? 0 : this.l.length;
                    asu[] asuVarArr = new asu[iA3 + length2];
                    if (length2 != 0) {
                        System.arraycopy(this.l, 0, asuVarArr, 0, length2);
                    }
                    while (length2 < asuVarArr.length - 1) {
                        asuVarArr[length2] = new asu();
                        fmsVar.a(asuVarArr[length2]);
                        fmsVar.a();
                        length2++;
                    }
                    asuVarArr[length2] = new asu();
                    fmsVar.a(asuVarArr[length2]);
                    this.l = asuVarArr;
                    break;
                case 112:
                    this.p = Boolean.valueOf(fmsVar.b());
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

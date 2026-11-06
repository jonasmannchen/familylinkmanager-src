package flm;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class fkj implements fky {
    private final fke a;
    private final flq b;
    private final boolean c;
    private final fid d;

    private fkj(flq flqVar, fid fidVar, fke fkeVar) {
        this.b = flqVar;
        this.c = fidVar.a(fkeVar);
        this.d = fidVar;
        this.a = fkeVar;
    }

    static fkj a(flq flqVar, fid fidVar, fke fkeVar) {
        return new fkj(flqVar, fidVar, fkeVar);
    }

    @Override // flm.fky
    public final Object a() {
        return this.a.l().g();
    }

    @Override // flm.fky
    public final boolean a(Object obj, Object obj2) {
        if (!this.b.b(obj).equals(this.b.b(obj2))) {
            return false;
        }
        if (this.c) {
            return this.d.a(obj).equals(this.d.a(obj2));
        }
        return true;
    }

    @Override // flm.fky
    public final int a(Object obj) {
        int iHashCode = this.b.b(obj).hashCode();
        if (this.c) {
            return (iHashCode * 53) + this.d.a(obj).hashCode();
        }
        return iHashCode;
    }

    @Override // flm.fky
    public final void b(Object obj, Object obj2) {
        fla.a(this.b, obj, obj2);
        if (this.c) {
            fla.a(this.d, obj, obj2);
        }
    }

    @Override // flm.fky
    public final void a(Object obj, fmp fmpVar) {
        Iterator itB = this.d.a(obj).b();
        while (itB.hasNext()) {
            Map.Entry entry = (Map.Entry) itB.next();
            fih fihVar = (fih) entry.getKey();
            if (fihVar.c() != fmo.MESSAGE || fihVar.d() || fihVar.e()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if (entry instanceof fjk) {
                fmpVar.a(fihVar.a(), (Object) ((fjj) ((fjk) entry).a.getValue()).b());
            } else {
                fmpVar.a(fihVar.a(), entry.getValue());
            }
        }
        flq flqVar = this.b;
        flqVar.b(flqVar.b(obj), fmpVar);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0049  */
    /* JADX WARN: Code duplicated, block: B:24:0x006a  */
    /* JADX WARN: Code duplicated, block: B:40:0x0068 A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:15:0x0042. Please report as an issue. */
    @Override // flm.fky
    public final void a(Object obj, byte[] bArr, int i, int i2, fgu fguVar) throws fjg {
        flr flrVar = ((fin) obj).E;
        if (flrVar == flr.a) {
            flrVar = new flr();
            ((fin) obj).E = flrVar;
        }
        while (i < i2) {
            int iA = fgt.a(bArr, i, fguVar);
            int i3 = fguVar.a;
            if (i3 != fmi.a) {
                if ((i3 & 7) == 2) {
                    i = fgt.a(i3, bArr, iA, i2, flrVar, fguVar);
                } else {
                    i = fgt.a(i3, bArr, iA, i2, fguVar);
                }
            } else {
                int iA2 = iA;
                int i4 = 0;
                fgy fgyVar = null;
                while (iA2 < i2) {
                    iA2 = fgt.a(bArr, iA2, fguVar);
                    int i5 = fguVar.a;
                    int i6 = i5 & 7;
                    switch (i5 >>> 3) {
                        case 2:
                            if (i6 == 0) {
                                iA2 = fgt.a(bArr, iA2, fguVar);
                                i4 = fguVar.a;
                            } else if (i5 != fmi.b) {
                                iA2 = fgt.a(i5, bArr, iA2, i2, fguVar);
                            }
                            break;
                        case 3:
                            if (i6 == 2) {
                                iA2 = fgt.e(bArr, iA2, fguVar);
                                fgyVar = (fgy) fguVar.c;
                            } else if (i5 != fmi.b) {
                                iA2 = fgt.a(i5, bArr, iA2, i2, fguVar);
                            }
                            break;
                        default:
                            if (i5 != fmi.b) {
                                iA2 = fgt.a(i5, bArr, iA2, i2, fguVar);
                            }
                            break;
                    }
                    if (fgyVar != null) {
                        flrVar.a((i4 << 3) | 2, fgyVar);
                    }
                    i = iA2;
                }
                if (fgyVar != null) {
                    flrVar.a((i4 << 3) | 2, fgyVar);
                }
                i = iA2;
            }
        }
        if (i != i2) {
            throw fjg.i();
        }
    }

    @Override // flm.fky
    public final void a(Object obj, fkt fktVar, fib fibVar) {
        boolean zC;
        flq flqVar = this.b;
        fid fidVar = this.d;
        Object objC = flqVar.c(obj);
        fig figVarB = fidVar.b(obj);
        while (fktVar.a() != Integer.MAX_VALUE) {
            try {
                int iB = fktVar.b();
                if (iB != fmi.a) {
                    if ((iB & 7) == 2) {
                        Object objA = fidVar.a(fibVar, this.a, iB >>> 3);
                        if (objA != null) {
                            fidVar.a(fktVar, objA, fibVar, figVarB);
                            zC = true;
                        } else {
                            zC = flqVar.a(objC, fktVar);
                        }
                    } else {
                        zC = fktVar.c();
                    }
                } else {
                    fgy fgyVarN = null;
                    int iO = 0;
                    Object objA2 = null;
                    while (fktVar.a() != Integer.MAX_VALUE) {
                        int iB2 = fktVar.b();
                        if (iB2 == fmi.c) {
                            iO = fktVar.o();
                            objA2 = fidVar.a(fibVar, this.a, iO);
                        } else if (iB2 == fmi.d) {
                            if (objA2 != null) {
                                fidVar.a(fktVar, objA2, fibVar, figVarB);
                            } else {
                                fgyVarN = fktVar.n();
                            }
                        } else if (!fktVar.c()) {
                            break;
                        }
                    }
                    if (fktVar.b() != fmi.b) {
                        throw fjg.e();
                    }
                    if (fgyVarN != null) {
                        if (objA2 != null) {
                            fidVar.a(fgyVarN, objA2, fibVar, figVarB);
                        } else {
                            flqVar.a(objC, iO, fgyVarN);
                        }
                    }
                    zC = true;
                }
                if (!zC) {
                    flqVar.b(obj, objC);
                    return;
                }
            } catch (Throwable th) {
                flqVar.b(obj, objC);
                throw th;
            }
        }
        flqVar.b(obj, objC);
    }

    @Override // flm.fky
    public final void c(Object obj) {
        this.b.d(obj);
        this.d.c(obj);
    }

    @Override // flm.fky
    public final boolean d(Object obj) {
        return this.d.a(obj).c();
    }

    @Override // flm.fky
    public final int b(Object obj) {
        flq flqVar = this.b;
        int iE = flqVar.e(flqVar.b(obj)) + 0;
        if (!this.c) {
            return iE;
        }
        fig figVarA = this.d.a(obj);
        int iB = 0;
        for (int i = 0; i < figVarA.a.b(); i++) {
            iB += fig.b(figVarA.a.b(i));
        }
        Iterator it = figVarA.a.c().iterator();
        while (it.hasNext()) {
            iB += fig.b((Map.Entry) it.next());
        }
        return iE + iB;
    }
}

package flm;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ds extends dx {
    private dv ah;
    private int ai;
    private int aj;
    private int ak;
    private int al;
    private int am;
    private int an;
    private dl ag = new dl();
    private int ao = 0;
    private int ap = 0;
    private dr[] aq = new dr[4];
    private dr[] ar = new dr[4];
    private dr[] as = new dr[4];
    public int ac = 2;
    private boolean[] at = new boolean[3];
    private dr[] au = new dr[4];
    public boolean ad = false;
    public boolean ae = false;

    @Override // flm.dx, flm.dr
    public final void a() {
        this.ag.a();
        this.ak = 0;
        this.am = 0;
        this.al = 0;
        this.an = 0;
        super.a();
    }

    private final boolean c(dl dlVar, int i) {
        boolean z;
        boolean z2;
        float f;
        int iF;
        float fC;
        int iC;
        float f2;
        float f3;
        float fC2;
        int i2;
        boolean z3;
        dr drVar;
        dr drVar2;
        dr drVar3;
        int iB;
        a(dlVar, Integer.MAX_VALUE);
        int size = this.af.size();
        if (this.ac == 2 || this.ac == 4) {
            int size2 = this.af.size();
            boolean z4 = false;
            for (int i3 = 0; i3 < size2; i3++) {
                dr drVar4 = (dr) this.af.get(i3);
                drVar4.a = -1;
                drVar4.b = -1;
                if (drVar4.G == dp.y || drVar4.H == dp.y) {
                    drVar4.a = 1;
                    drVar4.b = 1;
                }
            }
            int i4 = 0;
            int i5 = 0;
            while (!z4) {
                i5 = 0;
                i4 = 0;
                int i6 = 0;
                while (i6 < size2) {
                    dr drVar5 = (dr) this.af.get(i6);
                    if (drVar5.a == -1) {
                        if (this.G == dp.x || drVar5.G == dp.y) {
                            drVar5.a = 1;
                        } else if (this.G != dp.x && drVar5.G == dp.z) {
                            drVar5.i.h = dlVar.a(drVar5.i);
                            drVar5.k.h = dlVar.a(drVar5.k);
                            int i7 = drVar5.i.d;
                            int iC2 = c() - drVar5.k.d;
                            dlVar.a(drVar5.i.h, i7);
                            dlVar.a(drVar5.k.h, iC2);
                            drVar5.b(i7, iC2);
                            drVar5.a = 2;
                        } else if (drVar5.i.c != null && drVar5.k.c != null) {
                            if (drVar5.i.c.a == this && drVar5.k.c.a == this) {
                                int iB2 = drVar5.i.b();
                                int iB3 = drVar5.k.b();
                                if (this.G == dp.y) {
                                    iC = c() - iB3;
                                } else {
                                    iB2 += (int) (((((c() - iB2) - iB3) - drVar5.c()) * drVar5.E) + 0.5f);
                                    iC = drVar5.c() + iB2;
                                }
                                drVar5.i.h = dlVar.a(drVar5.i);
                                drVar5.k.h = dlVar.a(drVar5.k);
                                dlVar.a(drVar5.i.h, iB2);
                                dlVar.a(drVar5.k.h, iC);
                                drVar5.a = 2;
                                drVar5.b(iB2, iC);
                            } else {
                                drVar5.a = 1;
                            }
                        } else if (drVar5.i.c != null && drVar5.i.c.a == this) {
                            int iB4 = drVar5.i.b();
                            int iC3 = drVar5.c() + iB4;
                            drVar5.i.h = dlVar.a(drVar5.i);
                            drVar5.k.h = dlVar.a(drVar5.k);
                            dlVar.a(drVar5.i.h, iB4);
                            dlVar.a(drVar5.k.h, iC3);
                            drVar5.a = 2;
                            drVar5.b(iB4, iC3);
                        } else if (drVar5.k.c != null && drVar5.k.c.a == this) {
                            drVar5.i.h = dlVar.a(drVar5.i);
                            drVar5.k.h = dlVar.a(drVar5.k);
                            int iC4 = c() - drVar5.k.b();
                            int iC5 = iC4 - drVar5.c();
                            dlVar.a(drVar5.i.h, iC5);
                            dlVar.a(drVar5.k.h, iC4);
                            drVar5.a = 2;
                            drVar5.b(iC5, iC4);
                        } else if (drVar5.i.c != null && drVar5.i.c.a.a == 2) {
                            C0000do c0000do = drVar5.i.c.h;
                            drVar5.i.h = dlVar.a(drVar5.i);
                            drVar5.k.h = dlVar.a(drVar5.k);
                            int iB5 = (int) (c0000do.d + drVar5.i.b() + 0.5f);
                            int iC6 = drVar5.c() + iB5;
                            dlVar.a(drVar5.i.h, iB5);
                            dlVar.a(drVar5.k.h, iC6);
                            drVar5.a = 2;
                            drVar5.b(iB5, iC6);
                        } else if (drVar5.k.c != null && drVar5.k.c.a.a == 2) {
                            C0000do c0000do2 = drVar5.k.c.h;
                            drVar5.i.h = dlVar.a(drVar5.i);
                            drVar5.k.h = dlVar.a(drVar5.k);
                            int iB6 = (int) ((c0000do2.d - drVar5.k.b()) + 0.5f);
                            int iC7 = iB6 - drVar5.c();
                            dlVar.a(drVar5.i.h, iC7);
                            dlVar.a(drVar5.k.h, iB6);
                            drVar5.a = 2;
                            drVar5.b(iC7, iB6);
                        } else {
                            boolean z5 = drVar5.i.c != null;
                            boolean z6 = drVar5.k.c != null;
                            if (!z5 && !z6) {
                                if (drVar5 instanceof dt) {
                                    dt dtVar = (dt) drVar5;
                                    if (dtVar.af == 1) {
                                        drVar5.i.h = dlVar.a(drVar5.i);
                                        drVar5.k.h = dlVar.a(drVar5.k);
                                        if (dtVar.ad != -1) {
                                            fC = dtVar.ad;
                                        } else if (dtVar.ae != -1) {
                                            fC = c() - dtVar.ae;
                                        } else {
                                            fC = dtVar.ac * c();
                                        }
                                        int i8 = (int) (fC + 0.5f);
                                        dlVar.a(drVar5.i.h, i8);
                                        dlVar.a(drVar5.k.h, i8);
                                        drVar5.a = 2;
                                        drVar5.b = 2;
                                        drVar5.b(i8, i8);
                                        drVar5.c(0, f());
                                    }
                                } else {
                                    drVar5.i.h = dlVar.a(drVar5.i);
                                    drVar5.k.h = dlVar.a(drVar5.k);
                                    int i9 = drVar5.t;
                                    int iC8 = drVar5.c() + i9;
                                    dlVar.a(drVar5.i.h, i9);
                                    dlVar.a(drVar5.k.h, iC8);
                                    drVar5.a = 2;
                                }
                            }
                        }
                    }
                    if (drVar5.b == -1) {
                        if (this.H == dp.x || drVar5.H == dp.y) {
                            drVar5.b = 1;
                        } else if (this.H != dp.x && drVar5.H == dp.z) {
                            drVar5.j.h = dlVar.a(drVar5.j);
                            drVar5.l.h = dlVar.a(drVar5.l);
                            int i10 = drVar5.j.d;
                            int iF2 = f() - drVar5.l.d;
                            dlVar.a(drVar5.j.h, i10);
                            dlVar.a(drVar5.l.h, iF2);
                            if (drVar5.z > 0 || drVar5.J == 8) {
                                drVar5.m.h = dlVar.a(drVar5.m);
                                dlVar.a(drVar5.m.h, drVar5.z + i10);
                            }
                            drVar5.c(i10, iF2);
                            drVar5.b = 2;
                        } else if (drVar5.j.c != null && drVar5.l.c != null) {
                            if (drVar5.j.c.a == this && drVar5.l.c.a == this) {
                                int iB7 = drVar5.j.b();
                                int iB8 = drVar5.l.b();
                                if (this.H == dp.y) {
                                    iF = drVar5.f() + iB7;
                                } else {
                                    iB7 = (int) (((((f() - iB7) - iB8) - drVar5.f()) * drVar5.F) + iB7 + 0.5f);
                                    iF = drVar5.f() + iB7;
                                }
                                drVar5.j.h = dlVar.a(drVar5.j);
                                drVar5.l.h = dlVar.a(drVar5.l);
                                dlVar.a(drVar5.j.h, iB7);
                                dlVar.a(drVar5.l.h, iF);
                                if (drVar5.z > 0 || drVar5.J == 8) {
                                    drVar5.m.h = dlVar.a(drVar5.m);
                                    dlVar.a(drVar5.m.h, drVar5.z + iB7);
                                }
                                drVar5.b = 2;
                                drVar5.c(iB7, iF);
                            } else {
                                drVar5.b = 1;
                            }
                        } else if (drVar5.j.c != null && drVar5.j.c.a == this) {
                            int iB9 = drVar5.j.b();
                            int iF3 = drVar5.f() + iB9;
                            drVar5.j.h = dlVar.a(drVar5.j);
                            drVar5.l.h = dlVar.a(drVar5.l);
                            dlVar.a(drVar5.j.h, iB9);
                            dlVar.a(drVar5.l.h, iF3);
                            if (drVar5.z > 0 || drVar5.J == 8) {
                                drVar5.m.h = dlVar.a(drVar5.m);
                                dlVar.a(drVar5.m.h, drVar5.z + iB9);
                            }
                            drVar5.b = 2;
                            drVar5.c(iB9, iF3);
                        } else if (drVar5.l.c != null && drVar5.l.c.a == this) {
                            drVar5.j.h = dlVar.a(drVar5.j);
                            drVar5.l.h = dlVar.a(drVar5.l);
                            int iF4 = f() - drVar5.l.b();
                            int iF5 = iF4 - drVar5.f();
                            dlVar.a(drVar5.j.h, iF5);
                            dlVar.a(drVar5.l.h, iF4);
                            if (drVar5.z > 0 || drVar5.J == 8) {
                                drVar5.m.h = dlVar.a(drVar5.m);
                                dlVar.a(drVar5.m.h, drVar5.z + iF5);
                            }
                            drVar5.b = 2;
                            drVar5.c(iF5, iF4);
                        } else if (drVar5.j.c != null && drVar5.j.c.a.b == 2) {
                            C0000do c0000do3 = drVar5.j.c.h;
                            drVar5.j.h = dlVar.a(drVar5.j);
                            drVar5.l.h = dlVar.a(drVar5.l);
                            int iB10 = (int) (c0000do3.d + drVar5.j.b() + 0.5f);
                            int iF6 = drVar5.f() + iB10;
                            dlVar.a(drVar5.j.h, iB10);
                            dlVar.a(drVar5.l.h, iF6);
                            if (drVar5.z > 0 || drVar5.J == 8) {
                                drVar5.m.h = dlVar.a(drVar5.m);
                                dlVar.a(drVar5.m.h, drVar5.z + iB10);
                            }
                            drVar5.b = 2;
                            drVar5.c(iB10, iF6);
                        } else if (drVar5.l.c != null && drVar5.l.c.a.b == 2) {
                            C0000do c0000do4 = drVar5.l.c.h;
                            drVar5.j.h = dlVar.a(drVar5.j);
                            drVar5.l.h = dlVar.a(drVar5.l);
                            int iB11 = (int) ((c0000do4.d - drVar5.l.b()) + 0.5f);
                            int iF7 = iB11 - drVar5.f();
                            dlVar.a(drVar5.j.h, iF7);
                            dlVar.a(drVar5.l.h, iB11);
                            if (drVar5.z > 0 || drVar5.J == 8) {
                                drVar5.m.h = dlVar.a(drVar5.m);
                                dlVar.a(drVar5.m.h, drVar5.z + iF7);
                            }
                            drVar5.b = 2;
                            drVar5.c(iF7, iB11);
                        } else if (drVar5.m.c != null && drVar5.m.c.a.b == 2) {
                            C0000do c0000do5 = drVar5.m.c.h;
                            drVar5.j.h = dlVar.a(drVar5.j);
                            drVar5.l.h = dlVar.a(drVar5.l);
                            int i11 = (int) ((c0000do5.d - drVar5.z) + 0.5f);
                            int iF8 = drVar5.f() + i11;
                            dlVar.a(drVar5.j.h, i11);
                            dlVar.a(drVar5.l.h, iF8);
                            drVar5.m.h = dlVar.a(drVar5.m);
                            dlVar.a(drVar5.m.h, drVar5.z + i11);
                            drVar5.b = 2;
                            drVar5.c(i11, iF8);
                        } else {
                            boolean z7 = drVar5.m.c != null;
                            boolean z8 = drVar5.j.c != null;
                            boolean z9 = drVar5.l.c != null;
                            if (!z7 && !z8 && !z9) {
                                if (drVar5 instanceof dt) {
                                    dt dtVar2 = (dt) drVar5;
                                    if (dtVar2.af == 0) {
                                        drVar5.j.h = dlVar.a(drVar5.j);
                                        drVar5.l.h = dlVar.a(drVar5.l);
                                        if (dtVar2.ad != -1) {
                                            f = dtVar2.ad;
                                        } else if (dtVar2.ae != -1) {
                                            f = f() - dtVar2.ae;
                                        } else {
                                            f = dtVar2.ac * f();
                                        }
                                        int i12 = (int) (f + 0.5f);
                                        dlVar.a(drVar5.j.h, i12);
                                        dlVar.a(drVar5.l.h, i12);
                                        drVar5.b = 2;
                                        drVar5.a = 2;
                                        drVar5.c(i12, i12);
                                        drVar5.b(0, c());
                                    }
                                } else {
                                    drVar5.j.h = dlVar.a(drVar5.j);
                                    drVar5.l.h = dlVar.a(drVar5.l);
                                    int i13 = drVar5.u;
                                    int iF9 = drVar5.f() + i13;
                                    dlVar.a(drVar5.j.h, i13);
                                    dlVar.a(drVar5.l.h, iF9);
                                    if (drVar5.z > 0 || drVar5.J == 8) {
                                        drVar5.m.h = dlVar.a(drVar5.m);
                                        dlVar.a(drVar5.m.h, i13 + drVar5.z);
                                    }
                                    drVar5.b = 2;
                                }
                            }
                        }
                    }
                    int i14 = drVar5.b == -1 ? i5 + 1 : i5;
                    i6++;
                    i4 = drVar5.a == -1 ? i4 + 1 : i4;
                    i5 = i14;
                }
                if (i5 == 0 && i4 == 0) {
                    z4 = true;
                } else {
                    z4 = (i5 == i5 && i4 == i4) ? true : z4;
                }
            }
            int i15 = 0;
            int i16 = 0;
            int i17 = 0;
            while (i17 < size2) {
                dr drVar6 = (dr) this.af.get(i17);
                if (drVar6.a == 1 || drVar6.a == -1) {
                    i15++;
                }
                i17++;
                i16 = (drVar6.b == 1 || drVar6.b == -1) ? i16 + 1 : i16;
            }
            if (i15 == 0 && i16 == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                z2 = false;
            } else {
                return false;
            }
        } else {
            z2 = true;
        }
        for (int i18 = 0; i18 < size; i18++) {
            dr drVar7 = (dr) this.af.get(i18);
            if (drVar7 instanceof ds) {
                int i19 = drVar7.G;
                int i20 = drVar7.H;
                if (i19 == dp.x) {
                    drVar7.f(dp.w);
                }
                if (i20 == dp.x) {
                    drVar7.g(dp.w);
                }
                drVar7.a(dlVar, Integer.MAX_VALUE);
                if (i19 == dp.x) {
                    drVar7.f(i19);
                }
                if (i20 == dp.x) {
                    drVar7.g(i20);
                }
            } else {
                if (z2) {
                    if (this.G != dp.x && drVar7.G == dp.z) {
                        drVar7.i.h = dlVar.a(drVar7.i);
                        drVar7.k.h = dlVar.a(drVar7.k);
                        int i21 = drVar7.i.d;
                        int iC9 = c() - drVar7.k.d;
                        dlVar.a(drVar7.i.h, i21);
                        dlVar.a(drVar7.k.h, iC9);
                        drVar7.b(i21, iC9);
                        drVar7.a = 2;
                    }
                    if (this.H != dp.x && drVar7.H == dp.z) {
                        drVar7.j.h = dlVar.a(drVar7.j);
                        drVar7.l.h = dlVar.a(drVar7.l);
                        int i22 = drVar7.j.d;
                        int iF10 = f() - drVar7.l.d;
                        dlVar.a(drVar7.j.h, i22);
                        dlVar.a(drVar7.l.h, iF10);
                        if (drVar7.z > 0 || drVar7.J == 8) {
                            drVar7.m.h = dlVar.a(drVar7.m);
                            dlVar.a(drVar7.m.h, drVar7.z + i22);
                        }
                        drVar7.c(i22, iF10);
                        drVar7.b = 2;
                    }
                }
                drVar7.a(dlVar, Integer.MAX_VALUE);
            }
        }
        if (this.ao > 0) {
            int i23 = 0;
            while (true) {
                int i24 = i23;
                if (i24 >= this.ao) {
                    break;
                }
                dr drVar8 = this.as[i24];
                int iA = a(dlVar, this.au, this.as[i24], 0, this.at);
                dr drVar9 = this.au[2];
                if (drVar9 != null) {
                    if (this.at[1]) {
                        int iG = drVar8.g();
                        while (drVar9 != null) {
                            dlVar.a(drVar9.i.h, iG);
                            dr drVar10 = drVar9.aa;
                            iG += drVar9.i.b() + drVar9.c() + drVar9.k.b();
                            drVar9 = drVar10;
                        }
                    } else {
                        boolean z10 = drVar8.U == 0;
                        boolean z11 = drVar8.U == 2;
                        boolean z12 = this.G == dp.x;
                        if ((this.ac == 2 || this.ac == 8) && this.at[0] && drVar8.W && !z11 && !z12 && drVar8.U == 0) {
                            int iB12 = 0;
                            int i25 = 0;
                            float f4 = 0.0f;
                            dr drVar11 = null;
                            dr drVar12 = drVar8;
                            while (drVar12 != null) {
                                if (drVar12.J == 8) {
                                    i2 = i25;
                                } else {
                                    i2 = i25 + 1;
                                    if (drVar12.G != dp.y) {
                                        iB12 = (drVar12.k.c != null ? drVar12.k.b() : 0) + iB12 + drVar12.c() + (drVar12.i.c != null ? drVar12.i.b() : 0);
                                    } else {
                                        f4 = drVar12.Y + f4;
                                    }
                                }
                                dr drVar13 = drVar12.k.c != null ? drVar12.k.c.a : null;
                                if (drVar13 != null && (drVar13.i.c == null || (drVar13.i.c != null && drVar13.i.c.a != drVar12))) {
                                    drVar13 = null;
                                }
                                drVar11 = drVar12;
                                drVar12 = drVar13;
                                i25 = i2;
                            }
                            int i26 = 0;
                            if (drVar11 != null) {
                                if (drVar11.k.c != null) {
                                    i26 = drVar11.k.c.a.t;
                                } else {
                                    i26 = 0;
                                }
                                if (drVar11.k.c != null && drVar11.k.c.a == this) {
                                    i26 = i();
                                }
                            }
                            float f5 = i26 - iB12;
                            float f6 = f5 / (i25 + 1);
                            if (iA == 0) {
                                f2 = f6;
                            } else {
                                f2 = f5 / iA;
                                f6 = 0.0f;
                            }
                            while (drVar8 != null) {
                                int iB13 = drVar8.i.c != null ? drVar8.i.b() : 0;
                                int iB14 = drVar8.k.c != null ? drVar8.k.b() : 0;
                                if (drVar8.J != 8) {
                                    float f7 = f6 + iB13;
                                    dlVar.a(drVar8.i.h, (int) (0.5f + f7));
                                    if (drVar8.G != dp.y) {
                                        fC2 = drVar8.c() + f7;
                                    } else if (f4 == 0.0f) {
                                        fC2 = ((f2 - iB13) - iB14) + f7;
                                    } else {
                                        fC2 = ((((drVar8.Y * f5) / f4) - iB13) - iB14) + f7;
                                    }
                                    dlVar.a(drVar8.k.h, (int) (0.5f + fC2));
                                    if (iA == 0) {
                                        fC2 += f2;
                                    }
                                    f3 = fC2 + iB14;
                                } else {
                                    float f8 = f6 - (f2 / 2.0f);
                                    dlVar.a(drVar8.i.h, (int) (0.5f + f8));
                                    dlVar.a(drVar8.k.h, (int) (f8 + 0.5f));
                                    f3 = f6;
                                }
                                dr drVar14 = drVar8.k.c != null ? drVar8.k.c.a : null;
                                if (drVar14 != null && drVar14.i.c != null && drVar14.i.c.a != drVar8) {
                                    drVar14 = null;
                                }
                                if (drVar14 == this) {
                                    drVar14 = null;
                                }
                                f6 = f3;
                                drVar8 = drVar14;
                            }
                        } else if (iA == 0 || z11) {
                            dr drVar15 = null;
                            boolean z13 = false;
                            dr drVar16 = null;
                            dr drVar17 = drVar9;
                            while (drVar17 != null) {
                                dr drVar18 = drVar17.aa;
                                if (drVar18 == null) {
                                    z3 = true;
                                    drVar = this.au[1];
                                } else {
                                    z3 = z13;
                                    drVar = drVar15;
                                }
                                if (z11) {
                                    dq dqVar = drVar17.i;
                                    int iB15 = dqVar.b();
                                    int iB16 = drVar16 != null ? iB15 + drVar16.k.b() : iB15;
                                    int i27 = 1;
                                    if (drVar9 != drVar17) {
                                        i27 = 3;
                                    }
                                    dlVar.a(dqVar.h, dqVar.c.h, iB16, i27);
                                    if (drVar17.G == dp.y) {
                                        dq dqVar2 = drVar17.k;
                                        if (drVar17.c == 1) {
                                            dlVar.c(dqVar2.h, dqVar.h, Math.max(drVar17.e, drVar17.c()), 3);
                                            drVar3 = drVar18;
                                        } else {
                                            dlVar.a(dqVar.h, dqVar.c.h, dqVar.d, 3);
                                            dlVar.b(dqVar2.h, dqVar.h, drVar17.e, 3);
                                            drVar3 = drVar18;
                                        }
                                    } else {
                                        drVar3 = drVar18;
                                    }
                                } else if (!z10 && z3 && drVar16 != null) {
                                    if (drVar17.k.c == null) {
                                        dlVar.a(drVar17.k.h, drVar17.g() + drVar17.v);
                                        drVar3 = drVar18;
                                    } else {
                                        dlVar.c(drVar17.k.h, drVar.k.c.h, -drVar17.k.b(), 5);
                                        drVar3 = drVar18;
                                    }
                                } else if (!z10 && !z3 && drVar16 == null) {
                                    if (drVar17.i.c == null) {
                                        dlVar.a(drVar17.i.h, drVar17.g());
                                        drVar3 = drVar18;
                                    } else {
                                        dlVar.c(drVar17.i.h, drVar8.i.c.h, drVar17.i.b(), 5);
                                        drVar3 = drVar18;
                                    }
                                } else {
                                    dq dqVar3 = drVar17.i;
                                    dq dqVar4 = drVar17.k;
                                    int iB17 = dqVar3.b();
                                    int iB18 = dqVar4.b();
                                    dlVar.a(dqVar3.h, dqVar3.c.h, iB17, 1);
                                    dlVar.b(dqVar4.h, dqVar4.c.h, -iB18, 1);
                                    C0000do c0000do6 = dqVar3.c != null ? dqVar3.c.h : null;
                                    if (drVar16 == null) {
                                        c0000do6 = drVar8.i.c != null ? drVar8.i.c.h : null;
                                    }
                                    if (drVar18 == null) {
                                        drVar2 = drVar.k.c != null ? drVar.k.c.a : null;
                                    } else {
                                        drVar2 = drVar18;
                                    }
                                    if (drVar2 != null) {
                                        C0000do c0000do7 = drVar2.i.h;
                                        if (z3) {
                                            c0000do7 = drVar.k.c != null ? drVar.k.c.h : null;
                                        }
                                        if (c0000do6 != null && c0000do7 != null) {
                                            dlVar.a(dqVar3.h, c0000do6, iB17, 0.5f, c0000do7, dqVar4.h, iB18, 4);
                                        }
                                    }
                                    drVar3 = drVar2;
                                }
                                if (z3) {
                                    drVar3 = null;
                                }
                                drVar15 = drVar;
                                drVar16 = drVar17;
                                drVar17 = drVar3;
                                z13 = z3;
                            }
                            if (z11) {
                                dq dqVar5 = drVar9.i;
                                dq dqVar6 = drVar15.k;
                                int iB19 = dqVar5.b();
                                int iB20 = dqVar6.b();
                                C0000do c0000do8 = drVar8.i.c != null ? drVar8.i.c.h : null;
                                C0000do c0000do9 = drVar15.k.c != null ? drVar15.k.c.h : null;
                                if (c0000do8 != null && c0000do9 != null) {
                                    dlVar.b(dqVar6.h, c0000do9, -iB20, 1);
                                    dlVar.a(dqVar5.h, c0000do8, iB19, drVar8.E, c0000do9, dqVar6.h, iB20, 4);
                                }
                            }
                        } else {
                            float f9 = 0.0f;
                            dr drVar19 = null;
                            for (dr drVar20 = drVar9; drVar20 != null; drVar20 = drVar20.aa) {
                                if (drVar20.G != dp.y) {
                                    int iB21 = drVar20.i.b();
                                    if (drVar19 != null) {
                                        iB21 += drVar19.k.b();
                                    }
                                    int i28 = 3;
                                    if (drVar20.i.c.a.G == dp.y) {
                                        i28 = 2;
                                    }
                                    dlVar.a(drVar20.i.h, drVar20.i.c.h, iB21, i28);
                                    int iB22 = drVar20.k.b();
                                    if (drVar20.k.c.a.i.c != null && drVar20.k.c.a.i.c.a == drVar20) {
                                        iB22 += drVar20.k.c.a.i.b();
                                    }
                                    int i29 = 3;
                                    if (drVar20.k.c.a.G == dp.y) {
                                        i29 = 2;
                                    }
                                    dlVar.b(drVar20.k.h, drVar20.k.c.h, -iB22, i29);
                                } else {
                                    f9 += drVar20.Y;
                                    int iB23 = 0;
                                    if (drVar20.k.c != null) {
                                        iB23 = drVar20.k.b();
                                        if (drVar20 != this.au[3]) {
                                            iB23 += drVar20.k.c.a.i.b();
                                        }
                                    }
                                    dlVar.a(drVar20.k.h, drVar20.i.h, 0, 1);
                                    dlVar.b(drVar20.k.h, drVar20.k.c.h, -iB23, 1);
                                }
                                drVar19 = drVar20;
                            }
                            if (iA == 1) {
                                dr drVar21 = this.aq[0];
                                int iB24 = drVar21.i.b();
                                if (drVar21.i.c != null) {
                                    iB24 += drVar21.i.c.b();
                                }
                                int iB25 = drVar21.k.b();
                                if (drVar21.k.c != null) {
                                    iB25 += drVar21.k.c.b();
                                }
                                C0000do c0000do10 = drVar8.k.c.h;
                                if (drVar21 == this.au[3]) {
                                    c0000do10 = this.au[1].k.c.h;
                                }
                                if (drVar21.c == 1) {
                                    dlVar.a(drVar8.i.h, drVar8.i.c.h, iB24, 1);
                                    dlVar.b(drVar8.k.h, c0000do10, -iB25, 1);
                                    dlVar.c(drVar8.k.h, drVar8.i.h, drVar8.c(), 2);
                                } else {
                                    dlVar.c(drVar21.i.h, drVar21.i.c.h, iB24, 1);
                                    dlVar.c(drVar21.k.h, c0000do10, -iB25, 1);
                                }
                            } else {
                                int i30 = 0;
                                while (true) {
                                    int i31 = i30;
                                    if (i31 < iA - 1) {
                                        dr drVar22 = this.aq[i31];
                                        dr drVar23 = this.aq[i31 + 1];
                                        C0000do c0000do11 = drVar22.i.h;
                                        C0000do c0000do12 = drVar22.k.h;
                                        C0000do c0000do13 = drVar23.i.h;
                                        C0000do c0000do14 = drVar23.k.h;
                                        if (drVar23 == this.au[3]) {
                                            c0000do14 = this.au[1].k.h;
                                        }
                                        int iB26 = drVar22.i.b();
                                        if (drVar22.i.c != null && drVar22.i.c.a.k.c != null && drVar22.i.c.a.k.c.a == drVar22) {
                                            iB26 += drVar22.i.c.a.k.b();
                                        }
                                        dlVar.a(c0000do11, drVar22.i.c.h, iB26, 2);
                                        int iB27 = drVar22.k.b();
                                        if (drVar22.k.c == null || drVar22.aa == null) {
                                            iB = iB27;
                                        } else {
                                            iB = (drVar22.aa.i.c != null ? drVar22.aa.i.b() : 0) + iB27;
                                        }
                                        dlVar.b(c0000do12, drVar22.k.c.h, -iB, 2);
                                        if (i31 + 1 == iA - 1) {
                                            int iB28 = drVar23.i.b();
                                            if (drVar23.i.c != null && drVar23.i.c.a.k.c != null && drVar23.i.c.a.k.c.a == drVar23) {
                                                iB28 += drVar23.i.c.a.k.b();
                                            }
                                            dlVar.a(c0000do13, drVar23.i.c.h, iB28, 2);
                                            dq dqVar7 = drVar23.k;
                                            if (drVar23 == this.au[3]) {
                                                dqVar7 = this.au[1].k;
                                            }
                                            int iB29 = dqVar7.b();
                                            if (dqVar7.c != null && dqVar7.c.a.i.c != null && dqVar7.c.a.i.c.a == drVar23) {
                                                iB29 += dqVar7.c.a.i.b();
                                            }
                                            dlVar.b(c0000do14, dqVar7.c.h, -iB29, 2);
                                        }
                                        if (drVar8.f > 0) {
                                            dlVar.b(c0000do12, c0000do11, drVar8.f, 2);
                                        }
                                        di diVarB = dlVar.b();
                                        diVarB.a(drVar22.Y, f9, drVar23.Y, c0000do11, drVar22.i.b(), c0000do12, drVar22.k.b(), c0000do13, drVar23.i.b(), c0000do14, drVar23.k.b());
                                        dlVar.a(diVarB);
                                        i30 = i31 + 1;
                                    }
                                }
                            }
                        }
                    }
                }
                i23 = i24 + 1;
            }
        }
        if (this.ap > 0) {
            a(dlVar);
        }
        return true;
    }

    private final void a(dl dlVar) {
        float f;
        float f2;
        float f3;
        int i;
        boolean z;
        dr drVar;
        dr drVar2;
        dr drVar3;
        int iB;
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 < this.ap) {
                dr drVar4 = this.ar[i3];
                int iA = a(dlVar, this.au, this.ar[i3], 1, this.at);
                dr drVar5 = this.au[2];
                if (drVar5 != null) {
                    if (this.at[1]) {
                        int iH = drVar4.h();
                        while (drVar5 != null) {
                            dlVar.a(drVar5.j.h, iH);
                            dr drVar6 = drVar5.ab;
                            iH += drVar5.j.b() + drVar5.f() + drVar5.l.b();
                            drVar5 = drVar6;
                        }
                    } else {
                        boolean z2 = drVar4.V == 0;
                        boolean z3 = drVar4.V == 2;
                        boolean z4 = this.H == dp.x;
                        if ((this.ac == 2 || this.ac == 8) && this.at[0] && drVar4.X && !z3 && !z4 && drVar4.V == 0) {
                            int iB2 = 0;
                            int i4 = 0;
                            float f4 = 0.0f;
                            dr drVar7 = null;
                            dr drVar8 = drVar4;
                            while (drVar8 != null) {
                                if (drVar8.J == 8) {
                                    i = i4;
                                } else {
                                    i = i4 + 1;
                                    if (drVar8.H != dp.y) {
                                        iB2 = (drVar8.l.c != null ? drVar8.l.b() : 0) + iB2 + drVar8.f() + (drVar8.j.c != null ? drVar8.j.b() : 0);
                                    } else {
                                        f4 = drVar8.Z + f4;
                                    }
                                }
                                dr drVar9 = drVar8.l.c != null ? drVar8.l.c.a : null;
                                if (drVar9 != null && (drVar9.j.c == null || (drVar9.j.c != null && drVar9.j.c.a != drVar8))) {
                                    drVar9 = null;
                                }
                                drVar7 = drVar8;
                                drVar8 = drVar9;
                                i4 = i;
                            }
                            int iJ = 0;
                            if (drVar7 != null) {
                                if (drVar7.l.c != null) {
                                    iJ = drVar7.l.c.a.t;
                                } else {
                                    iJ = 0;
                                }
                                if (drVar7.l.c != null && drVar7.l.c.a == this) {
                                    iJ = j();
                                }
                            }
                            float f5 = iJ - iB2;
                            float f6 = f5 / (i4 + 1);
                            if (iA == 0) {
                                f = f6;
                            } else {
                                f = f5 / iA;
                                f6 = 0.0f;
                            }
                            while (drVar4 != null) {
                                int iB3 = drVar4.j.c != null ? drVar4.j.b() : 0;
                                int iB4 = drVar4.l.c != null ? drVar4.l.b() : 0;
                                if (drVar4.J != 8) {
                                    float f7 = f6 + iB3;
                                    dlVar.a(drVar4.j.h, (int) (0.5f + f7));
                                    if (drVar4.H != dp.y) {
                                        f3 = drVar4.f() + f7;
                                    } else if (f4 == 0.0f) {
                                        f3 = ((f - iB3) - iB4) + f7;
                                    } else {
                                        f3 = ((((drVar4.Z * f5) / f4) - iB3) - iB4) + f7;
                                    }
                                    dlVar.a(drVar4.l.h, (int) (0.5f + f3));
                                    if (iA == 0) {
                                        f3 += f;
                                    }
                                    f2 = f3 + iB4;
                                } else {
                                    float f8 = f6 - (f / 2.0f);
                                    dlVar.a(drVar4.j.h, (int) (0.5f + f8));
                                    dlVar.a(drVar4.l.h, (int) (f8 + 0.5f));
                                    f2 = f6;
                                }
                                dr drVar10 = drVar4.l.c != null ? drVar4.l.c.a : null;
                                if (drVar10 != null && drVar10.j.c != null && drVar10.j.c.a != drVar4) {
                                    drVar10 = null;
                                }
                                if (drVar10 == this) {
                                    drVar10 = null;
                                }
                                f6 = f2;
                                drVar4 = drVar10;
                            }
                        } else if (iA == 0 || z3) {
                            dr drVar11 = null;
                            boolean z5 = false;
                            dr drVar12 = null;
                            dr drVar13 = drVar5;
                            while (drVar13 != null) {
                                dr drVar14 = drVar13.ab;
                                if (drVar14 == null) {
                                    z = true;
                                    drVar = this.au[1];
                                } else {
                                    z = z5;
                                    drVar = drVar11;
                                }
                                if (z3) {
                                    dq dqVar = drVar13.j;
                                    int iB5 = dqVar.b();
                                    if (drVar12 != null) {
                                        iB5 += drVar12.l.b();
                                    }
                                    int i5 = 1;
                                    if (drVar5 != drVar13) {
                                        i5 = 3;
                                    }
                                    C0000do c0000do = null;
                                    C0000do c0000do2 = null;
                                    if (dqVar.c != null) {
                                        c0000do = dqVar.h;
                                        c0000do2 = dqVar.c.h;
                                    } else if (drVar13.m.c != null) {
                                        c0000do = drVar13.m.h;
                                        c0000do2 = drVar13.m.c.h;
                                        iB5 -= dqVar.b();
                                    }
                                    if (c0000do != null && c0000do2 != null) {
                                        dlVar.a(c0000do, c0000do2, iB5, i5);
                                    }
                                    if (drVar13.H == dp.y) {
                                        dq dqVar2 = drVar13.l;
                                        if (drVar13.d == 1) {
                                            dlVar.c(dqVar2.h, dqVar.h, Math.max(drVar13.g, drVar13.f()), 3);
                                            drVar3 = drVar14;
                                        } else {
                                            dlVar.a(dqVar.h, dqVar.c.h, dqVar.d, 3);
                                            dlVar.b(dqVar2.h, dqVar.h, drVar13.g, 3);
                                            drVar3 = drVar14;
                                        }
                                    } else {
                                        drVar3 = drVar14;
                                    }
                                } else if (!z2 && z && drVar12 != null) {
                                    if (drVar13.l.c == null) {
                                        dlVar.a(drVar13.l.h, drVar13.h() + drVar13.w);
                                        drVar3 = drVar14;
                                    } else {
                                        dlVar.c(drVar13.l.h, drVar.l.c.h, -drVar13.l.b(), 5);
                                        drVar3 = drVar14;
                                    }
                                } else if (!z2 && !z && drVar12 == null) {
                                    if (drVar13.j.c == null) {
                                        dlVar.a(drVar13.j.h, drVar13.h());
                                        drVar3 = drVar14;
                                    } else {
                                        dlVar.c(drVar13.j.h, drVar4.j.c.h, drVar13.j.b(), 5);
                                        drVar3 = drVar14;
                                    }
                                } else {
                                    dq dqVar3 = drVar13.j;
                                    dq dqVar4 = drVar13.l;
                                    int iB6 = dqVar3.b();
                                    int iB7 = dqVar4.b();
                                    dlVar.a(dqVar3.h, dqVar3.c.h, iB6, 1);
                                    dlVar.b(dqVar4.h, dqVar4.c.h, -iB7, 1);
                                    C0000do c0000do3 = dqVar3.c != null ? dqVar3.c.h : null;
                                    if (drVar12 == null) {
                                        c0000do3 = drVar4.j.c != null ? drVar4.j.c.h : null;
                                    }
                                    if (drVar14 == null) {
                                        drVar2 = drVar.l.c != null ? drVar.l.c.a : null;
                                    } else {
                                        drVar2 = drVar14;
                                    }
                                    if (drVar2 != null) {
                                        C0000do c0000do4 = drVar2.j.h;
                                        if (z) {
                                            c0000do4 = drVar.l.c != null ? drVar.l.c.h : null;
                                        }
                                        if (c0000do3 != null && c0000do4 != null) {
                                            dlVar.a(dqVar3.h, c0000do3, iB6, 0.5f, c0000do4, dqVar4.h, iB7, 4);
                                        }
                                    }
                                    drVar3 = drVar2;
                                }
                                if (z) {
                                    drVar3 = null;
                                }
                                drVar11 = drVar;
                                drVar12 = drVar13;
                                drVar13 = drVar3;
                                z5 = z;
                            }
                            if (z3) {
                                dq dqVar5 = drVar5.j;
                                dq dqVar6 = drVar11.l;
                                int iB8 = dqVar5.b();
                                int iB9 = dqVar6.b();
                                C0000do c0000do5 = drVar4.j.c != null ? drVar4.j.c.h : null;
                                C0000do c0000do6 = drVar11.l.c != null ? drVar11.l.c.h : null;
                                if (c0000do5 != null && c0000do6 != null) {
                                    dlVar.b(dqVar6.h, c0000do6, -iB9, 1);
                                    dlVar.a(dqVar5.h, c0000do5, iB8, drVar4.F, c0000do6, dqVar6.h, iB9, 4);
                                }
                            }
                        } else {
                            float f9 = 0.0f;
                            dr drVar15 = null;
                            for (dr drVar16 = drVar5; drVar16 != null; drVar16 = drVar16.ab) {
                                if (drVar16.H != dp.y) {
                                    int iB10 = drVar16.j.b();
                                    if (drVar15 != null) {
                                        iB10 += drVar15.l.b();
                                    }
                                    int i6 = 3;
                                    if (drVar16.j.c.a.H == dp.y) {
                                        i6 = 2;
                                    }
                                    dlVar.a(drVar16.j.h, drVar16.j.c.h, iB10, i6);
                                    int iB11 = drVar16.l.b();
                                    if (drVar16.l.c.a.j.c != null && drVar16.l.c.a.j.c.a == drVar16) {
                                        iB11 += drVar16.l.c.a.j.b();
                                    }
                                    int i7 = 3;
                                    if (drVar16.l.c.a.H == dp.y) {
                                        i7 = 2;
                                    }
                                    dlVar.b(drVar16.l.h, drVar16.l.c.h, -iB11, i7);
                                } else {
                                    f9 += drVar16.Z;
                                    int iB12 = 0;
                                    if (drVar16.l.c != null) {
                                        iB12 = drVar16.l.b();
                                        if (drVar16 != this.au[3]) {
                                            iB12 += drVar16.l.c.a.j.b();
                                        }
                                    }
                                    dlVar.a(drVar16.l.h, drVar16.j.h, 0, 1);
                                    dlVar.b(drVar16.l.h, drVar16.l.c.h, -iB12, 1);
                                }
                                drVar15 = drVar16;
                            }
                            if (iA == 1) {
                                dr drVar17 = this.aq[0];
                                int iB13 = drVar17.j.b();
                                if (drVar17.j.c != null) {
                                    iB13 += drVar17.j.c.b();
                                }
                                int iB14 = drVar17.l.b();
                                if (drVar17.l.c != null) {
                                    iB14 += drVar17.l.c.b();
                                }
                                C0000do c0000do7 = drVar4.l.c.h;
                                if (drVar17 == this.au[3]) {
                                    c0000do7 = this.au[1].l.c.h;
                                }
                                if (drVar17.d == 1) {
                                    dlVar.a(drVar4.j.h, drVar4.j.c.h, iB13, 1);
                                    dlVar.b(drVar4.l.h, c0000do7, -iB14, 1);
                                    dlVar.c(drVar4.l.h, drVar4.j.h, drVar4.f(), 2);
                                } else {
                                    dlVar.c(drVar17.j.h, drVar17.j.c.h, iB13, 1);
                                    dlVar.c(drVar17.l.h, c0000do7, -iB14, 1);
                                }
                            } else {
                                int i8 = 0;
                                while (true) {
                                    int i9 = i8;
                                    if (i9 < iA - 1) {
                                        dr drVar18 = this.aq[i9];
                                        dr drVar19 = this.aq[i9 + 1];
                                        C0000do c0000do8 = drVar18.j.h;
                                        C0000do c0000do9 = drVar18.l.h;
                                        C0000do c0000do10 = drVar19.j.h;
                                        C0000do c0000do11 = drVar19.l.h;
                                        if (drVar19 == this.au[3]) {
                                            c0000do11 = this.au[1].l.h;
                                        }
                                        int iB15 = drVar18.j.b();
                                        if (drVar18.j.c != null && drVar18.j.c.a.l.c != null && drVar18.j.c.a.l.c.a == drVar18) {
                                            iB15 += drVar18.j.c.a.l.b();
                                        }
                                        dlVar.a(c0000do8, drVar18.j.c.h, iB15, 2);
                                        int iB16 = drVar18.l.b();
                                        if (drVar18.l.c == null || drVar18.ab == null) {
                                            iB = iB16;
                                        } else {
                                            iB = (drVar18.ab.j.c != null ? drVar18.ab.j.b() : 0) + iB16;
                                        }
                                        dlVar.b(c0000do9, drVar18.l.c.h, -iB, 2);
                                        if (i9 + 1 == iA - 1) {
                                            int iB17 = drVar19.j.b();
                                            if (drVar19.j.c != null && drVar19.j.c.a.l.c != null && drVar19.j.c.a.l.c.a == drVar19) {
                                                iB17 += drVar19.j.c.a.l.b();
                                            }
                                            dlVar.a(c0000do10, drVar19.j.c.h, iB17, 2);
                                            dq dqVar7 = drVar19.l;
                                            if (drVar19 == this.au[3]) {
                                                dqVar7 = this.au[1].l;
                                            }
                                            int iB18 = dqVar7.b();
                                            if (dqVar7.c != null && dqVar7.c.a.j.c != null && dqVar7.c.a.j.c.a == drVar19) {
                                                iB18 += dqVar7.c.a.j.b();
                                            }
                                            dlVar.b(c0000do11, dqVar7.c.h, -iB18, 2);
                                        }
                                        if (drVar4.h > 0) {
                                            dlVar.b(c0000do9, c0000do8, drVar4.h, 2);
                                        }
                                        di diVarB = dlVar.b();
                                        diVarB.a(drVar18.Z, f9, drVar19.Z, c0000do8, drVar18.j.b(), c0000do9, drVar18.l.b(), c0000do10, drVar19.j.b(), c0000do11, drVar19.l.b());
                                        dlVar.a(diVarB);
                                        i8 = i9 + 1;
                                    }
                                }
                            }
                        }
                    }
                }
                i2 = i3 + 1;
            } else {
                return;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:84:0x02f8 A[PHI: r2
  0x02f8: PHI (r2v8 boolean) = (r2v7 boolean), (r2v123 boolean), (r2v123 boolean), (r2v123 boolean), (r2v7 boolean) binds: [B:19:0x00e9, B:61:0x0265, B:70:0x028d, B:83:0x02e7, B:23:0x00f9] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // flm.dx
    public final void n() {
        boolean z;
        ds dsVar;
        boolean z2;
        boolean z3;
        int iMax;
        int iMax2;
        int i = this.t;
        int i2 = this.u;
        int iMax3 = Math.max(0, c());
        int iMax4 = Math.max(0, f());
        this.ad = false;
        this.ae = false;
        if (this.o != null) {
            if (this.ah == null) {
                this.ah = new dv(this);
            }
            dv dvVar = this.ah;
            dvVar.a = this.t;
            dvVar.b = this.u;
            dvVar.c = c();
            dvVar.d = f();
            int size = dvVar.e.size();
            for (int i3 = 0; i3 < size; i3++) {
                dw dwVar = (dw) dvVar.e.get(i3);
                dwVar.a = e(dwVar.a.b);
                if (dwVar.a != null) {
                    dwVar.b = dwVar.a.c;
                    dwVar.c = dwVar.a.b();
                    dwVar.d = dwVar.a.e;
                    dwVar.e = dwVar.a.g;
                } else {
                    dwVar.b = null;
                    dwVar.c = 0;
                    dwVar.d = dp.i;
                    dwVar.e = 0;
                }
            }
            this.t = 0;
            this.u = 0;
            int size2 = this.n.size();
            for (int i4 = 0; i4 < size2; i4++) {
                ((dq) this.n.get(i4)).c();
            }
            a(this.ag.e);
        } else {
            this.t = 0;
            this.u = 0;
        }
        boolean z4 = false;
        int i5 = this.H;
        int i6 = this.G;
        if (this.ac == 2 && (this.H == dp.x || this.G == dp.x)) {
            ArrayList arrayList = this.af;
            boolean[] zArr = this.at;
            int iMax5 = 0;
            int iMax6 = 0;
            int iMax7 = 0;
            int iMax8 = 0;
            int i7 = 0;
            int i8 = 0;
            int size3 = arrayList.size();
            zArr[0] = true;
            int i9 = 0;
            while (true) {
                if (i9 < size3) {
                    dr drVar = (dr) arrayList.get(i9);
                    if (!drVar.b()) {
                        if (!drVar.S) {
                            a(drVar, zArr);
                        }
                        if (!drVar.T) {
                            b(drVar, zArr);
                        }
                        if (!zArr[0]) {
                            break;
                        }
                        int iC = (drVar.L + drVar.M) - drVar.c();
                        int iF = (drVar.K + drVar.N) - drVar.f();
                        if (drVar.G == dp.z) {
                            iC = drVar.c() + drVar.i.d + drVar.k.d;
                        }
                        if (drVar.H == dp.z) {
                            iF = drVar.f() + drVar.j.d + drVar.l.d;
                        }
                        if (drVar.J == 8) {
                            iC = 0;
                            iF = 0;
                        }
                        iMax6 = Math.max(iMax6, drVar.L);
                        iMax7 = Math.max(iMax7, drVar.M);
                        iMax8 = Math.max(iMax8, drVar.N);
                        iMax5 = Math.max(iMax5, drVar.K);
                        iMax2 = Math.max(i7, iC);
                        iMax = Math.max(i8, iF);
                    } else {
                        iMax = i8;
                        iMax2 = i7;
                    }
                    i9++;
                    iMax6 = iMax6;
                    iMax5 = iMax5;
                    iMax8 = iMax8;
                    iMax7 = iMax7;
                    i7 = iMax2;
                    i8 = iMax;
                } else {
                    this.ai = Math.max(this.A, Math.max(Math.max(iMax6, iMax7), i7));
                    this.aj = Math.max(this.B, Math.max(Math.max(iMax5, iMax8), i8));
                    int i10 = 0;
                    while (true) {
                        int i11 = i10;
                        if (i11 >= size3) {
                            break;
                        }
                        dr drVar2 = (dr) arrayList.get(i11);
                        drVar2.S = false;
                        drVar2.T = false;
                        drVar2.O = false;
                        drVar2.P = false;
                        drVar2.Q = false;
                        drVar2.R = false;
                        i10 = i11 + 1;
                    }
                }
            }
            z4 = this.at[0];
            if (iMax3 > 0 && iMax4 > 0 && (this.ai > iMax3 || this.aj > iMax4)) {
                z4 = false;
            }
            if (z4) {
                if (this.G == dp.x) {
                    this.G = dp.w;
                    if (iMax3 > 0 && iMax3 < this.ai) {
                        this.ad = true;
                        a(iMax3);
                    } else {
                        a(Math.max(this.A, this.ai));
                    }
                }
                if (this.H == dp.x) {
                    this.H = dp.w;
                    if (iMax4 > 0 && iMax4 < this.aj) {
                        this.ae = true;
                        b(iMax4);
                        z = z4;
                    } else {
                        b(Math.max(this.B, this.aj));
                        z = z4;
                    }
                } else {
                    z = z4;
                }
            } else {
                z = z4;
            }
        } else {
            z = z4;
        }
        this.ao = 0;
        this.ap = 0;
        int size4 = this.af.size();
        for (int i12 = 0; i12 < size4; i12++) {
            dr drVar3 = (dr) this.af.get(i12);
            if (drVar3 instanceof dx) {
                ((dx) drVar3).n();
            }
        }
        int i13 = 0;
        boolean z5 = z;
        boolean zC = true;
        while (zC) {
            int i14 = i13 + 1;
            try {
                this.ag.a();
                zC = c(this.ag, Integer.MAX_VALUE);
                if (zC) {
                    dl dlVar = this.ag;
                    dk dkVar = dlVar.a;
                    dkVar.a(dlVar);
                    dlVar.b(dkVar);
                    dlVar.a(dkVar);
                    for (int i15 = 0; i15 < dlVar.d; i15++) {
                        di diVar = dlVar.b[i15];
                        diVar.a.d = diVar.b;
                    }
                }
            } catch (Exception e) {
                ehh.a.a(e);
            }
            if (zC) {
                dl dlVar2 = this.ag;
                boolean[] zArr2 = this.at;
                zArr2[2] = false;
                b(dlVar2, Integer.MAX_VALUE);
                int size5 = this.af.size();
                for (int i16 = 0; i16 < size5; i16++) {
                    dr drVar4 = (dr) this.af.get(i16);
                    drVar4.b(dlVar2, Integer.MAX_VALUE);
                    if (drVar4.G == dp.y && drVar4.c() < drVar4.C) {
                        zArr2[2] = true;
                    }
                    if (drVar4.H == dp.y && drVar4.f() < drVar4.D) {
                        zArr2[2] = true;
                    }
                }
            } else {
                b(this.ag, Integer.MAX_VALUE);
                for (int i17 = 0; i17 < size4; i17++) {
                    dr drVar5 = (dr) this.af.get(i17);
                    if (drVar5.G == dp.y && drVar5.c() < drVar5.C) {
                        this.at[2] = true;
                        break;
                    } else {
                        if (drVar5.H == dp.y && drVar5.f() < drVar5.D) {
                            this.at[2] = true;
                            break;
                        }
                    }
                }
            }
            if (i14 >= 8 || !this.at[2]) {
                z2 = false;
                z3 = z5;
            } else {
                int iMax9 = 0;
                int iMax10 = 0;
                for (int i18 = 0; i18 < size4; i18++) {
                    dr drVar6 = (dr) this.af.get(i18);
                    iMax9 = Math.max(iMax9, drVar6.t + drVar6.c());
                    iMax10 = Math.max(iMax10, drVar6.f() + drVar6.u);
                }
                int iMax11 = Math.max(this.A, iMax9);
                int iMax12 = Math.max(this.B, iMax10);
                if (i6 != dp.x || c() >= iMax11) {
                    z2 = false;
                    z3 = z5;
                } else {
                    a(iMax11);
                    this.G = dp.x;
                    z3 = true;
                    z2 = true;
                }
                if (i5 == dp.x && f() < iMax12) {
                    b(iMax12);
                    this.H = dp.x;
                    z3 = true;
                    z2 = true;
                }
            }
            int iMax13 = Math.max(this.A, c());
            if (iMax13 > c()) {
                a(iMax13);
                this.G = dp.w;
                z3 = true;
                z2 = true;
            }
            int iMax14 = Math.max(this.B, f());
            if (iMax14 > f()) {
                b(iMax14);
                this.H = dp.w;
                z3 = true;
                z2 = true;
            }
            if (!z3) {
                if (this.G == dp.x && iMax3 > 0 && c() > iMax3) {
                    this.ad = true;
                    z3 = true;
                    this.G = dp.w;
                    a(iMax3);
                    z2 = true;
                }
                if (this.H == dp.x && iMax4 > 0 && f() > iMax4) {
                    this.ae = true;
                    z3 = true;
                    this.H = dp.w;
                    b(iMax4);
                    z2 = true;
                }
            }
            z5 = z3;
            zC = z2;
            i13 = i14;
        }
        if (this.o != null) {
            int iMax15 = Math.max(this.A, c());
            int iMax16 = Math.max(this.B, f());
            dv dvVar2 = this.ah;
            this.t = dvVar2.a;
            this.u = dvVar2.b;
            a(dvVar2.c);
            b(dvVar2.d);
            int size6 = dvVar2.e.size();
            for (int i19 = 0; i19 < size6; i19++) {
                dw dwVar2 = (dw) dvVar2.e.get(i19);
                e(dwVar2.a.b).a(dwVar2.b, dwVar2.c, -1, dwVar2.d, dwVar2.e, false);
            }
            a(iMax15);
            b(iMax16);
        } else {
            this.t = i;
            this.u = i2;
        }
        if (z5) {
            this.G = i6;
            this.H = i5;
        }
        a(this.ag.e);
        dr drVar7 = this.o;
        if (!(this instanceof ds)) {
            dsVar = null;
        } else {
            dsVar = this;
        }
        while (drVar7 != null) {
            drVar7 = drVar7.o;
            if (drVar7 instanceof ds) {
                dsVar = (ds) drVar7;
            }
        }
        if (this == dsVar) {
            m();
        }
    }

    private final void a(dr drVar, boolean[] zArr) {
        dr drVar2;
        int iD;
        int i;
        dr drVar3 = null;
        boolean z = false;
        int i2 = 0;
        z = false;
        z = false;
        if (drVar.G == dp.y && drVar.H == dp.y && drVar.r > 0.0f) {
            zArr[0] = false;
            return;
        }
        int iD2 = drVar.d();
        if (drVar.G == dp.y && drVar.H != dp.y && drVar.r > 0.0f) {
            zArr[0] = false;
            return;
        }
        drVar.S = true;
        if (drVar instanceof dt) {
            dt dtVar = (dt) drVar;
            if (dtVar.af != 1) {
                i = iD2;
                i2 = iD2;
            } else if (dtVar.ad != -1) {
                iD2 = dtVar.ad;
                iD = 0;
            } else if (dtVar.ae != -1) {
                int i3 = dtVar.ae;
                i = 0;
                i2 = i3;
            } else {
                i = 0;
            }
            iD2 = i;
            iD = i2;
        } else if (!drVar.k.d() && !drVar.i.d()) {
            iD = iD2;
            iD2 = drVar.t + iD2;
        } else {
            if (drVar.k.c != null && drVar.i.c != null && (drVar.k.c == drVar.i.c || (drVar.k.c.a == drVar.i.c.a && drVar.k.c.a != drVar.o))) {
                zArr[0] = false;
                return;
            }
            if (drVar.k.c != null) {
                drVar2 = drVar.k.c.a;
                iD = drVar.k.b() + iD2;
                if (!drVar2.b() && !drVar2.S) {
                    a(drVar2, zArr);
                }
            } else {
                drVar2 = null;
                iD = iD2;
            }
            if (drVar.i.c != null) {
                drVar3 = drVar.i.c.a;
                iD2 += drVar.i.b();
                if (!drVar3.b() && !drVar3.S) {
                    a(drVar3, zArr);
                }
            }
            if (drVar.k.c != null && !drVar2.b()) {
                if (drVar.k.c.b == dp.o) {
                    iD += drVar2.M - drVar2.d();
                } else if (drVar.k.c.b == dp.m) {
                    iD += drVar2.M;
                }
                drVar.P = drVar2.P || !(drVar2.i.c == null || drVar2.k.c == null || drVar2.G == dp.y);
                if (drVar.P && (drVar2.i.c == null || drVar2.i.c.a != drVar)) {
                    iD += iD - drVar2.M;
                }
            }
            if (drVar.i.c != null && !drVar3.b()) {
                if (drVar.i.c.b == dp.m) {
                    iD2 += drVar3.L - drVar3.d();
                } else if (drVar.i.c.b == dp.o) {
                    iD2 += drVar3.L;
                }
                if (drVar3.O || (drVar3.i.c != null && drVar3.k.c != null && drVar3.G != dp.y)) {
                    z = true;
                }
                drVar.O = z;
                if (drVar.O && (drVar3.k.c == null || drVar3.k.c.a != drVar)) {
                    iD2 += iD2 - drVar3.L;
                }
            }
        }
        if (drVar.J == 8) {
            iD2 -= drVar.p;
            iD -= drVar.p;
        }
        drVar.L = iD2;
        drVar.M = iD;
    }

    private final void b(dr drVar, boolean[] zArr) {
        dr drVar2;
        int iE;
        int i;
        dr drVar3 = null;
        boolean z = false;
        i = 0;
        int i2 = 0;
        z = false;
        z = false;
        z = false;
        z = false;
        if (drVar.H == dp.y && drVar.G != dp.y && drVar.r > 0.0f) {
            zArr[0] = false;
            return;
        }
        int iE2 = drVar.e();
        drVar.T = true;
        if (drVar instanceof dt) {
            dt dtVar = (dt) drVar;
            if (dtVar.af != 0) {
                i = iE2;
                i2 = iE2;
            } else if (dtVar.ad != -1) {
                iE = dtVar.ad;
                iE2 = 0;
            } else {
                i = dtVar.ae != -1 ? dtVar.ae : 0;
            }
            iE2 = i;
            iE = i2;
        } else if (drVar.m.c == null && drVar.j.c == null && drVar.l.c == null) {
            iE = iE2 + drVar.u;
        } else {
            if (drVar.l.c != null && drVar.j.c != null && (drVar.l.c == drVar.j.c || (drVar.l.c.a == drVar.j.c.a && drVar.l.c.a != drVar.o))) {
                zArr[0] = false;
                return;
            }
            if (drVar.m.d()) {
                dr drVar4 = drVar.m.c.a;
                if (!drVar4.T) {
                    b(drVar4, zArr);
                }
                int iMax = Math.max((drVar4.K - drVar4.q) + iE2, iE2);
                int iMax2 = Math.max((drVar4.N - drVar4.q) + iE2, iE2);
                if (drVar.J == 8) {
                    iMax -= drVar.q;
                    iMax2 -= drVar.q;
                }
                drVar.K = iMax;
                drVar.N = iMax2;
                return;
            }
            if (drVar.j.d()) {
                drVar2 = drVar.j.c.a;
                iE = drVar.j.b() + iE2;
                if (!drVar2.b() && !drVar2.T) {
                    b(drVar2, zArr);
                }
            } else {
                drVar2 = null;
                iE = iE2;
            }
            if (drVar.l.d()) {
                drVar3 = drVar.l.c.a;
                iE2 += drVar.l.b();
                if (!drVar3.b() && !drVar3.T) {
                    b(drVar3, zArr);
                }
            }
            if (drVar.j.c != null && !drVar2.b()) {
                if (drVar.j.c.b == dp.n) {
                    iE += drVar2.K - drVar2.e();
                } else if (drVar.j.c.b == dp.p) {
                    iE += drVar2.K;
                }
                drVar.Q = drVar2.Q || !(drVar2.j.c == null || drVar2.j.c.a == drVar || drVar2.l.c == null || drVar2.l.c.a == drVar || drVar2.H == dp.y);
                if (drVar.Q && (drVar2.l.c == null || drVar2.l.c.a != drVar)) {
                    iE += iE - drVar2.K;
                }
            }
            if (drVar.l.c != null && !drVar3.b()) {
                if (drVar.l.c.b == dp.p) {
                    iE2 += drVar3.N - drVar3.e();
                } else if (drVar.l.c.b == dp.n) {
                    iE2 += drVar3.N;
                }
                if (drVar3.R || (drVar3.j.c != null && drVar3.j.c.a != drVar && drVar3.l.c != null && drVar3.l.c.a != drVar && drVar3.H != dp.y)) {
                    z = true;
                }
                drVar.R = z;
                if (drVar.R && (drVar3.j.c == null || drVar3.j.c.a != drVar)) {
                    iE2 += iE2 - drVar3.N;
                }
            }
        }
        if (drVar.J == 8) {
            iE -= drVar.q;
            iE2 -= drVar.q;
        }
        drVar.K = iE;
        drVar.N = iE2;
    }

    final void a(dr drVar, int i) {
        int i2 = 0;
        if (i == 0) {
            while (drVar.i.c != null && drVar.i.c.a.k.c != null && drVar.i.c.a.k.c == drVar.i && drVar.i.c.a != drVar) {
                drVar = drVar.i.c.a;
            }
            while (i2 < this.ao) {
                if (this.as[i2] != drVar) {
                    i2++;
                } else {
                    return;
                }
            }
            if (this.ao + 1 >= this.as.length) {
                this.as = (dr[]) Arrays.copyOf(this.as, this.as.length << 1);
            }
            this.as[this.ao] = drVar;
            this.ao++;
            return;
        }
        if (i == 1) {
            while (drVar.j.c != null && drVar.j.c.a.l.c != null && drVar.j.c.a.l.c == drVar.j && drVar.j.c.a != drVar) {
                drVar = drVar.j.c.a;
            }
            while (i2 < this.ap) {
                if (this.ar[i2] != drVar) {
                    i2++;
                } else {
                    return;
                }
            }
            if (this.ap + 1 >= this.ar.length) {
                this.ar = (dr[]) Arrays.copyOf(this.ar, this.ar.length << 1);
            }
            this.ar[this.ap] = drVar;
            this.ap++;
        }
    }

    private final int a(dl dlVar, dr[] drVarArr, dr drVar, int i, boolean[] zArr) {
        boolean z;
        int i2;
        dr drVar2;
        dr drVar3;
        boolean z2;
        dr drVar4;
        dr drVar5;
        zArr[0] = true;
        zArr[1] = false;
        drVarArr[0] = null;
        drVarArr[2] = null;
        drVarArr[1] = null;
        drVarArr[3] = null;
        if (i == 0) {
            if (drVar.i.c == null || drVar.i.c.a == this) {
                z2 = true;
            } else {
                z2 = false;
            }
            drVar.aa = null;
            dr drVar6 = drVar.J != 8 ? drVar : null;
            dr drVar7 = null;
            i2 = 0;
            dr drVar8 = drVar;
            dr drVar9 = drVar6;
            while (true) {
                if (drVar8.k.c == null) {
                    drVar4 = drVar9;
                    drVar5 = drVar6;
                    break;
                }
                drVar8.aa = null;
                if (drVar8.J != 8) {
                    drVar4 = drVar9 == null ? drVar8 : drVar9;
                    if (drVar6 != null && drVar6 != drVar8) {
                        drVar6.aa = drVar8;
                    }
                    drVar5 = drVar8;
                } else {
                    dlVar.c(drVar8.i.h, drVar8.i.c.h, 0, 5);
                    dlVar.c(drVar8.k.h, drVar8.i.h, 0, 5);
                    drVar4 = drVar9;
                    drVar5 = drVar6;
                }
                if (drVar8.J != 8 && drVar8.G == dp.y) {
                    if (drVar8.H == dp.y) {
                        zArr[0] = false;
                    }
                    if (drVar8.r <= 0.0f) {
                        zArr[0] = false;
                        if (i2 + 1 >= this.aq.length) {
                            this.aq = (dr[]) Arrays.copyOf(this.aq, this.aq.length << 1);
                        }
                        this.aq[i2] = drVar8;
                        i2++;
                    }
                }
                if (drVar8.k.c.a.i.c == null || drVar8.k.c.a.i.c.a != drVar8 || drVar8.k.c.a == drVar8) {
                    break;
                }
                dr drVar10 = drVar8.k.c.a;
                drVar7 = drVar10;
                drVar8 = drVar10;
                drVar6 = drVar5;
                drVar9 = drVar4;
            }
            if (drVar8.k.c != null && drVar8.k.c.a != this) {
                z2 = false;
            }
            if (drVar.i.c == null || drVar7.k.c == null) {
                zArr[1] = true;
            }
            drVar.W = z2;
            drVar7.aa = null;
            drVarArr[0] = drVar;
            drVarArr[2] = drVar4;
            drVarArr[1] = drVar7;
            drVarArr[3] = drVar5;
        } else {
            if (drVar.j.c == null || drVar.j.c.a == this) {
                z = true;
            } else {
                z = false;
            }
            drVar.ab = null;
            dr drVar11 = drVar.J != 8 ? drVar : null;
            dr drVar12 = null;
            i2 = 0;
            dr drVar13 = drVar;
            dr drVar14 = drVar11;
            while (true) {
                if (drVar13.l.c == null) {
                    drVar2 = drVar14;
                    drVar3 = drVar11;
                    break;
                }
                drVar13.ab = null;
                if (drVar13.J != 8) {
                    drVar2 = drVar14 == null ? drVar13 : drVar14;
                    if (drVar11 != null && drVar11 != drVar13) {
                        drVar11.ab = drVar13;
                    }
                    drVar3 = drVar13;
                } else {
                    dlVar.c(drVar13.j.h, drVar13.j.c.h, 0, 5);
                    dlVar.c(drVar13.l.h, drVar13.j.h, 0, 5);
                    drVar2 = drVar14;
                    drVar3 = drVar11;
                }
                if (drVar13.J != 8 && drVar13.H == dp.y) {
                    if (drVar13.G == dp.y) {
                        zArr[0] = false;
                    }
                    if (drVar13.r <= 0.0f) {
                        zArr[0] = false;
                        if (i2 + 1 >= this.aq.length) {
                            this.aq = (dr[]) Arrays.copyOf(this.aq, this.aq.length << 1);
                        }
                        this.aq[i2] = drVar13;
                        i2++;
                    }
                }
                if (drVar13.l.c.a.j.c == null || drVar13.l.c.a.j.c.a != drVar13 || drVar13.l.c.a == drVar13) {
                    break;
                }
                dr drVar15 = drVar13.l.c.a;
                drVar12 = drVar15;
                drVar13 = drVar15;
                drVar11 = drVar3;
                drVar14 = drVar2;
            }
            if (drVar13.l.c != null && drVar13.l.c.a != this) {
                z = false;
            }
            if (drVar.j.c == null || drVar12.l.c == null) {
                zArr[1] = true;
            }
            drVar.X = z;
            drVar12.ab = null;
            drVarArr[0] = drVar;
            drVarArr[2] = drVar2;
            drVarArr[1] = drVar12;
            drVarArr[3] = drVar3;
        }
        return i2;
    }
}

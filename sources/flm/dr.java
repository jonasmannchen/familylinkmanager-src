package flm;

import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class dr {
    private static float al = 0.5f;
    public int A;
    public int B;
    public int C;
    public int D;
    public Object I;
    public int K;
    public int L;
    public int M;
    public int N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public boolean W;
    public boolean X;
    public int a = -1;
    public int b = -1;
    public int c = 0;
    public int d = 0;
    public int e = 0;
    public int f = 0;
    public int g = 0;
    public int h = 0;
    public dq i = new dq(this, dp.m);
    public dq j = new dq(this, dp.n);
    public dq k = new dq(this, dp.o);
    public dq l = new dq(this, dp.p);
    public dq m = new dq(this, dp.q);
    private dq ac = new dq(this, dp.s);
    private dq ad = new dq(this, dp.t);
    private dq ae = new dq(this, dp.r);
    public ArrayList n = new ArrayList();
    public dr o = null;
    public int p = 0;
    public int q = 0;
    public float r = 0.0f;
    public int s = -1;
    private int af = 0;
    private int ag = 0;
    private int ah = 0;
    private int ai = 0;
    public int t = 0;
    public int u = 0;
    private int aj = 0;
    private int ak = 0;
    public int v = 0;
    public int w = 0;
    public int x = 0;
    public int y = 0;
    public int z = 0;
    public float E = al;
    public float F = al;
    public int G = dp.w;
    public int H = dp.w;
    public int J = 0;
    private String am = null;
    private String an = null;
    public int U = 0;
    public int V = 0;
    public float Y = 0.0f;
    public float Z = 0.0f;
    public dr aa = null;
    public dr ab = null;

    public void a() {
        this.i.c();
        this.j.c();
        this.k.c();
        this.l.c();
        this.m.c();
        this.ac.c();
        this.ad.c();
        this.ae.c();
        this.o = null;
        this.p = 0;
        this.q = 0;
        this.r = 0.0f;
        this.s = -1;
        this.t = 0;
        this.u = 0;
        this.aj = 0;
        this.ak = 0;
        this.v = 0;
        this.w = 0;
        this.x = 0;
        this.y = 0;
        this.z = 0;
        this.A = 0;
        this.B = 0;
        this.C = 0;
        this.D = 0;
        this.E = al;
        this.F = al;
        this.G = dp.w;
        this.H = dp.w;
        this.I = null;
        this.J = 0;
        this.am = null;
        this.an = null;
        this.S = false;
        this.T = false;
        this.U = 0;
        this.V = 0;
        this.W = false;
        this.X = false;
        this.Y = 0.0f;
        this.Z = 0.0f;
        this.a = -1;
        this.b = -1;
    }

    public dr() {
        this.n.add(this.i);
        this.n.add(this.j);
        this.n.add(this.k);
        this.n.add(this.l);
        this.n.add(this.ac);
        this.n.add(this.ad);
        this.n.add(this.m);
    }

    public void a(dj djVar) {
        this.i.a();
        this.j.a();
        this.k.a();
        this.l.a();
        this.m.a();
        this.ae.a();
        this.ac.a();
        this.ad.a();
    }

    public final boolean b() {
        return this.o == null;
    }

    public String toString() {
        return "(" + this.t + ", " + this.u + ") - (" + this.p + " x " + this.q + ") wrap: (" + this.C + " x " + this.D + ")";
    }

    public final int c() {
        if (this.J == 8) {
            return 0;
        }
        return this.p;
    }

    public final int d() {
        int iMax;
        int i = this.p;
        if (this.G == dp.y) {
            if (this.c == 1) {
                iMax = Math.max(this.e, i);
            } else if (this.e > 0) {
                iMax = this.e;
                this.p = iMax;
            } else {
                iMax = 0;
            }
            if (this.f > 0 && this.f < iMax) {
                return this.f;
            }
            return iMax;
        }
        return i;
    }

    public final int e() {
        int iMax;
        int i = this.q;
        if (this.H == dp.y) {
            if (this.d == 1) {
                iMax = Math.max(this.g, i);
            } else if (this.g > 0) {
                iMax = this.g;
                this.q = iMax;
            } else {
                iMax = 0;
            }
            if (this.h > 0 && this.h < iMax) {
                return this.h;
            }
            return iMax;
        }
        return i;
    }

    public final int f() {
        if (this.J == 8) {
            return 0;
        }
        return this.q;
    }

    public final int g() {
        return this.aj + this.x;
    }

    public final int h() {
        return this.ak + this.y;
    }

    public final int i() {
        return this.t + this.p;
    }

    public final int j() {
        return this.u + this.q;
    }

    public final boolean k() {
        return this.z > 0;
    }

    public ArrayList l() {
        return this.n;
    }

    public void a(int i, int i2) {
        this.x = i;
        this.y = i2;
    }

    public void m() {
        int i = this.t;
        int i2 = this.u;
        int i3 = this.t + this.p;
        int i4 = this.u + this.q;
        this.aj = i;
        this.ak = i2;
        this.v = i3 - i;
        this.w = i4 - i2;
    }

    public final void a(int i) {
        this.p = i;
        if (this.p < this.A) {
            this.p = this.A;
        }
    }

    public final void b(int i) {
        this.q = i;
        if (this.q < this.B) {
            this.q = this.B;
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0084  */
    public final void a(String str) {
        float fAbs;
        int i = 0;
        if (str == null || str.length() == 0) {
            this.r = 0.0f;
            return;
        }
        int i2 = -1;
        int length = str.length();
        int iIndexOf = str.indexOf(44);
        if (iIndexOf > 0 && iIndexOf < length - 1) {
            String strSubstring = str.substring(0, iIndexOf);
            if (!strSubstring.equalsIgnoreCase("W")) {
                i = strSubstring.equalsIgnoreCase("H") ? 1 : -1;
            }
            i2 = i;
            i = iIndexOf + 1;
        }
        int iIndexOf2 = str.indexOf(58);
        if (iIndexOf2 >= 0 && iIndexOf2 < length - 1) {
            String strSubstring2 = str.substring(i, iIndexOf2);
            String strSubstring3 = str.substring(iIndexOf2 + 1);
            if (strSubstring2.length() <= 0 || strSubstring3.length() <= 0) {
                fAbs = 0.0f;
            } else {
                try {
                    float f = Float.parseFloat(strSubstring2);
                    float f2 = Float.parseFloat(strSubstring3);
                    if (f <= 0.0f || f2 <= 0.0f) {
                        fAbs = 0.0f;
                    } else if (i2 == 1) {
                        fAbs = Math.abs(f2 / f);
                    } else {
                        fAbs = Math.abs(f / f2);
                    }
                } catch (NumberFormatException e) {
                }
            }
        } else {
            String strSubstring4 = str.substring(i);
            if (strSubstring4.length() > 0) {
                try {
                    fAbs = Float.parseFloat(strSubstring4);
                } catch (NumberFormatException e2) {
                    fAbs = 0.0f;
                }
            } else {
                fAbs = 0.0f;
            }
        }
        if (fAbs > 0.0f) {
            this.r = fAbs;
            this.s = i2;
        }
    }

    public final void c(int i) {
        if (i < 0) {
            this.A = 0;
        } else {
            this.A = i;
        }
    }

    public final void d(int i) {
        if (i < 0) {
            this.B = 0;
        } else {
            this.B = i;
        }
    }

    private final void a(int i, int i2, int i3, int i4) {
        int i5 = i3 - i;
        int i6 = i4 - i2;
        this.t = i;
        this.u = i2;
        if (this.J == 8) {
            this.p = 0;
            this.q = 0;
            return;
        }
        if (this.G == dp.w && i5 < this.p) {
            i5 = this.p;
        }
        if (this.H == dp.w && i6 < this.q) {
            i6 = this.q;
        }
        this.p = i5;
        this.q = i6;
        if (this.q < this.B) {
            this.q = this.B;
        }
        if (this.p < this.A) {
            this.p = this.A;
        }
    }

    public final void b(int i, int i2) {
        this.t = i;
        this.p = i2 - i;
        if (this.p < this.A) {
            this.p = this.A;
        }
    }

    public final void c(int i, int i2) {
        this.u = i;
        this.q = i2 - i;
        if (this.q < this.B) {
            this.q = this.B;
        }
    }

    public final void a(int i, dr drVar, int i2, int i3, int i4) {
        e(i).a(drVar.e(i2), i3, i4, dp.i, 0, true);
    }

    public dq e(int i) {
        switch (i - 1) {
            case 1:
                return this.i;
            case 2:
                return this.j;
            case 3:
                return this.k;
            case 4:
                return this.l;
            case 5:
                return this.m;
            case 6:
                return this.ae;
            case 7:
                return this.ac;
            case 8:
                return this.ad;
            default:
                return null;
        }
    }

    public final void f(int i) {
        this.G = i;
        if (this.G == dp.x) {
            a(this.C);
        }
    }

    public final void g(int i) {
        this.H = i;
        if (this.H == dp.x) {
            b(this.D);
        }
    }

    /* JADX WARN: Code duplicated, block: B:270:0x0755 A[PHI: r8 r9
  0x0755: PHI (r8v6 int) = (r8v5 int), (r8v5 int), (r8v5 int), (r8v5 int), (r8v5 int), (r8v21 int) binds: [B:114:0x029a, B:116:0x02a2, B:186:0x044d, B:177:0x040b, B:178:0x040d, B:180:0x0415] A[DONT_GENERATE, DONT_INLINE]
  0x0755: PHI (r9v2 boolean) = (r9v1 boolean), (r9v1 boolean), (r9v1 boolean), (r9v14 boolean), (r9v14 boolean), (r9v14 boolean) binds: [B:114:0x029a, B:116:0x02a2, B:186:0x044d, B:177:0x040b, B:178:0x040d, B:180:0x0415] A[DONT_GENERATE, DONT_INLINE]] */
    public void a(dl dlVar, int i) {
        C0000do c0000doA;
        C0000do c0000doA2;
        C0000do c0000doA3;
        C0000do c0000doA4;
        C0000do c0000doA5;
        boolean z;
        boolean z2;
        float f;
        int i2;
        boolean z3;
        boolean z4;
        int i3;
        int i4;
        boolean z5;
        int i5;
        boolean z6;
        boolean z7;
        if (i != Integer.MAX_VALUE && this.i.i != i) {
            c0000doA = null;
        } else {
            c0000doA = dlVar.a(this.i);
        }
        if (i != Integer.MAX_VALUE && this.k.i != i) {
            c0000doA2 = null;
        } else {
            c0000doA2 = dlVar.a(this.k);
        }
        if (i != Integer.MAX_VALUE && this.j.i != i) {
            c0000doA3 = null;
        } else {
            c0000doA3 = dlVar.a(this.j);
        }
        if (i != Integer.MAX_VALUE && this.l.i != i) {
            c0000doA4 = null;
        } else {
            c0000doA4 = dlVar.a(this.l);
        }
        if (i != Integer.MAX_VALUE && this.m.i != i) {
            c0000doA5 = null;
        } else {
            c0000doA5 = dlVar.a(this.m);
        }
        if (this.o == null) {
            z = false;
            z2 = false;
        } else {
            if ((this.i.c == null || this.i.c.c != this.i) && (this.k.c == null || this.k.c.c != this.k)) {
                z6 = false;
            } else {
                ((ds) this.o).a(this, 0);
                z6 = true;
            }
            if ((this.j.c == null || this.j.c.c != this.j) && (this.l.c == null || this.l.c.c != this.l)) {
                z7 = false;
            } else {
                ((ds) this.o).a(this, 1);
                z7 = true;
            }
            if (this.o.G == dp.x && !z6) {
                if (this.i.c == null || this.i.c.a != this.o) {
                    C0000do c0000doA6 = dlVar.a(this.o.i);
                    di diVarB = dlVar.b();
                    diVarB.a(c0000doA, c0000doA6, dlVar.c(), 0);
                    dlVar.a(diVarB);
                } else if (this.i.c != null && this.i.c.a == this.o) {
                    this.i.f = dp.f;
                }
                if (this.k.c == null || this.k.c.a != this.o) {
                    C0000do c0000doA7 = dlVar.a(this.o.k);
                    di diVarB2 = dlVar.b();
                    diVarB2.a(c0000doA7, c0000doA2, dlVar.c(), 0);
                    dlVar.a(diVarB2);
                } else if (this.k.c != null && this.k.c.a == this.o) {
                    this.k.f = dp.f;
                }
            }
            if (this.o.H != dp.x || z7) {
                z = z7;
                z2 = z6;
            } else {
                if (this.j.c == null || this.j.c.a != this.o) {
                    C0000do c0000doA8 = dlVar.a(this.o.j);
                    di diVarB3 = dlVar.b();
                    diVarB3.a(c0000doA3, c0000doA8, dlVar.c(), 0);
                    dlVar.a(diVarB3);
                } else if (this.j.c != null && this.j.c.a == this.o) {
                    this.j.f = dp.f;
                }
                if (this.l.c == null || this.l.c.a != this.o) {
                    C0000do c0000doA9 = dlVar.a(this.o.l);
                    di diVarB4 = dlVar.b();
                    diVarB4.a(c0000doA9, c0000doA4, dlVar.c(), 0);
                    dlVar.a(diVarB4);
                    z = z7;
                    z2 = z6;
                } else {
                    if (this.l.c != null && this.l.c.a == this.o) {
                        this.l.f = dp.f;
                    }
                    z = z7;
                    z2 = z6;
                }
            }
        }
        int i6 = this.p;
        if (i6 < this.A) {
            i6 = this.A;
        }
        int i7 = this.q;
        if (i7 < this.B) {
            i7 = this.B;
        }
        boolean z8 = this.G != dp.y;
        boolean z9 = this.H != dp.y;
        boolean z10 = (z8 || this.i == null || this.k == null || !(this.i.c == null || this.k.c == null)) ? z8 : true;
        boolean z11 = (z9 || this.j == null || this.l == null || !(this.j.c == null || this.l.c == null) || (this.z != 0 && (this.m == null || !(this.j.c == null || this.m.c == null)))) ? z9 : true;
        boolean z12 = false;
        int i8 = this.s;
        float f2 = this.r;
        if (this.r <= 0.0f || this.J == 8) {
            f = f2;
            i2 = i8;
            z3 = z12;
            z4 = z11;
            i3 = i7;
            i4 = i6;
            z5 = z10;
        } else if (this.G == dp.y && this.H == dp.y) {
            z12 = true;
            if (z10 && !z11) {
                f = f2;
                i2 = 0;
                z3 = true;
                z4 = z11;
                i3 = i7;
                i4 = i6;
                z5 = z10;
            } else if (z10 || !z11) {
                f = f2;
                i2 = i8;
                z3 = z12;
                z4 = z11;
                i3 = i7;
                i4 = i6;
                z5 = z10;
            } else {
                i8 = 1;
                if (this.s == -1) {
                    f = 1.0f / f2;
                    i2 = 1;
                    z3 = true;
                    z4 = z11;
                    i3 = i7;
                    i4 = i6;
                    z5 = z10;
                } else {
                    f = f2;
                    i2 = i8;
                    z3 = z12;
                    z4 = z11;
                    i3 = i7;
                    i4 = i6;
                    z5 = z10;
                }
            }
        } else if (this.G == dp.y) {
            i4 = (int) (this.q * f2);
            f = f2;
            i2 = 0;
            z3 = false;
            z4 = z11;
            i3 = i7;
            z5 = true;
        } else if (this.H == dp.y) {
            float f3 = this.s == -1 ? 1.0f / f2 : f2;
            i3 = (int) (this.p * f3);
            f = f3;
            i2 = 1;
            z3 = false;
            z4 = true;
            i4 = i6;
            z5 = z10;
        } else {
            f = f2;
            i2 = i8;
            z3 = z12;
            z4 = z11;
            i3 = i7;
            i4 = i6;
            z5 = z10;
        }
        boolean z13 = z3 && (i2 == 0 || i2 == -1);
        boolean z14 = this.G == dp.x && (this instanceof ds);
        if (this.a != 2 && (i == Integer.MAX_VALUE || (this.i.i == i && this.k.i == i))) {
            if (z13 && this.i.c != null && this.k.c != null) {
                C0000do c0000doA10 = dlVar.a(this.i);
                C0000do c0000doA11 = dlVar.a(this.k);
                C0000do c0000doA12 = dlVar.a(this.i.c);
                C0000do c0000doA13 = dlVar.a(this.k.c);
                dlVar.a(c0000doA10, c0000doA12, this.i.b(), 3);
                dlVar.b(c0000doA11, c0000doA13, this.k.b() * (-1), 3);
                if (!z2) {
                    dlVar.a(c0000doA10, c0000doA12, this.i.b(), this.E, c0000doA13, c0000doA11, this.k.b(), 4);
                }
            } else {
                a(dlVar, z14, z5, this.i, this.k, this.t, this.t + i4, i4, this.A, this.E, z13, z2, this.c, this.e, this.f);
            }
        }
        if (this.b != 2) {
            boolean z15 = this.H == dp.x && (this instanceof ds);
            boolean z16 = z3 && (i2 == 1 || i2 == -1);
            if (this.z > 0) {
                dq dqVar = this.l;
                if (i == Integer.MAX_VALUE || (this.l.i == i && this.m.i == i)) {
                    dlVar.c(c0000doA5, c0000doA3, this.z, 5);
                }
                if (this.m.c != null) {
                    i5 = this.z;
                    dqVar = this.m;
                } else {
                    i5 = i3;
                }
                if (i == Integer.MAX_VALUE || (this.j.i == i && dqVar.i == i)) {
                    if (z16 && this.j.c != null && this.l.c != null) {
                        C0000do c0000doA14 = dlVar.a(this.j);
                        C0000do c0000doA15 = dlVar.a(this.l);
                        C0000do c0000doA16 = dlVar.a(this.j.c);
                        C0000do c0000doA17 = dlVar.a(this.l.c);
                        dlVar.a(c0000doA14, c0000doA16, this.j.b(), 3);
                        dlVar.b(c0000doA15, c0000doA17, this.l.b() * (-1), 3);
                        if (!z) {
                            dlVar.a(c0000doA14, c0000doA16, this.j.b(), this.F, c0000doA17, c0000doA15, this.l.b(), 4);
                        }
                    } else {
                        a(dlVar, z15, z4, this.j, dqVar, this.u, this.u + i5, i5, this.B, this.F, z16, z, this.d, this.g, this.h);
                        dlVar.c(c0000doA4, c0000doA3, i3, 5);
                    }
                }
            } else if (i == Integer.MAX_VALUE || (this.j.i == i && this.l.i == i)) {
                if (z16 && this.j.c != null && this.l.c != null) {
                    C0000do c0000doA18 = dlVar.a(this.j);
                    C0000do c0000doA19 = dlVar.a(this.l);
                    C0000do c0000doA20 = dlVar.a(this.j.c);
                    C0000do c0000doA21 = dlVar.a(this.l.c);
                    dlVar.a(c0000doA18, c0000doA20, this.j.b(), 3);
                    dlVar.b(c0000doA19, c0000doA21, this.l.b() * (-1), 3);
                    if (!z) {
                        dlVar.a(c0000doA18, c0000doA20, this.j.b(), this.F, c0000doA21, c0000doA19, this.l.b(), 4);
                    }
                } else {
                    a(dlVar, z15, z4, this.j, this.l, this.u, this.u + i3, i3, this.B, this.F, z16, z, this.d, this.g, this.h);
                }
            }
            if (z3) {
                di diVarB5 = dlVar.b();
                if (i == Integer.MAX_VALUE || (this.i.i == i && this.k.i == i)) {
                    if (i2 == 0) {
                        dlVar.a(diVarB5.a(c0000doA2, c0000doA, c0000doA4, c0000doA3, f));
                        return;
                    }
                    if (i2 == 1) {
                        dlVar.a(diVarB5.a(c0000doA4, c0000doA3, c0000doA2, c0000doA, f));
                        return;
                    }
                    if (this.e > 0) {
                        dlVar.a(c0000doA2, c0000doA, this.e, 3);
                    }
                    if (this.g > 0) {
                        dlVar.a(c0000doA4, c0000doA3, this.g, 3);
                    }
                    diVarB5.a(c0000doA2, c0000doA, c0000doA4, c0000doA3, f);
                    C0000do c0000doD = dlVar.d();
                    C0000do c0000doD2 = dlVar.d();
                    c0000doD.c = 4;
                    c0000doD2.c = 4;
                    diVarB5.a(c0000doD, c0000doD2);
                    dlVar.a(diVarB5);
                }
            }
        }
    }

    private final void a(dl dlVar, boolean z, boolean z2, dq dqVar, dq dqVar2, int i, int i2, int i3, int i4, float f, boolean z3, boolean z4, int i5, int i6, int i7) {
        int i8;
        C0000do c0000doA = dlVar.a(dqVar);
        C0000do c0000doA2 = dlVar.a(dqVar2);
        C0000do c0000doA3 = dlVar.a(dqVar.c);
        C0000do c0000doA4 = dlVar.a(dqVar2.c);
        int iB = dqVar.b();
        int iB2 = dqVar2.b();
        if (this.J == 8) {
            i8 = 0;
            z2 = true;
        } else {
            i8 = i3;
        }
        if (c0000doA3 == null && c0000doA4 == null) {
            dlVar.a(dlVar.b().a(c0000doA, i));
            if (!z3) {
                if (z) {
                    dlVar.a(dl.a(dlVar, c0000doA2, c0000doA, i4, true));
                    return;
                } else if (z2) {
                    dlVar.a(dl.a(dlVar, c0000doA2, c0000doA, i8, false));
                    return;
                } else {
                    dlVar.a(dlVar.b().a(c0000doA2, i2));
                    return;
                }
            }
            return;
        }
        if (c0000doA3 != null && c0000doA4 == null) {
            dlVar.a(dlVar.b().a(c0000doA, c0000doA3, iB));
            if (z) {
                dlVar.a(dl.a(dlVar, c0000doA2, c0000doA, i4, true));
                return;
            } else {
                if (!z3) {
                    if (z2) {
                        dlVar.a(dlVar.b().a(c0000doA2, c0000doA, i8));
                        return;
                    } else {
                        dlVar.a(dlVar.b().a(c0000doA2, i2));
                        return;
                    }
                }
                return;
            }
        }
        if (c0000doA3 == null && c0000doA4 != null) {
            dlVar.a(dlVar.b().a(c0000doA2, c0000doA4, iB2 * (-1)));
            if (z) {
                dlVar.a(dl.a(dlVar, c0000doA2, c0000doA, i4, true));
                return;
            } else {
                if (!z3) {
                    if (z2) {
                        dlVar.a(dlVar.b().a(c0000doA2, c0000doA, i8));
                        return;
                    } else {
                        dlVar.a(dlVar.b().a(c0000doA, i));
                        return;
                    }
                }
                return;
            }
        }
        if (z2) {
            if (z) {
                dlVar.a(dl.a(dlVar, c0000doA2, c0000doA, i4, true));
            } else {
                dlVar.a(dlVar.b().a(c0000doA2, c0000doA, i8));
            }
            if (dqVar.e != dqVar2.e) {
                if (dqVar.e == dp.i) {
                    dlVar.a(dlVar.b().a(c0000doA, c0000doA3, iB));
                    C0000do c0000doC = dlVar.c();
                    di diVarB = dlVar.b();
                    diVarB.b(c0000doA2, c0000doA4, c0000doC, iB2 * (-1));
                    dlVar.a(diVarB);
                    return;
                }
                C0000do c0000doC2 = dlVar.c();
                di diVarB2 = dlVar.b();
                diVarB2.a(c0000doA, c0000doA3, c0000doC2, iB);
                dlVar.a(diVarB2);
                dlVar.a(dlVar.b().a(c0000doA2, c0000doA4, iB2 * (-1)));
                return;
            }
            if (c0000doA3 == c0000doA4) {
                dlVar.a(dl.a(dlVar, c0000doA, c0000doA3, 0, 0.5f, c0000doA4, c0000doA2, 0, true));
                return;
            }
            if (!z4) {
                boolean z5 = dqVar.f != dp.f;
                C0000do c0000doC3 = dlVar.c();
                di diVarB3 = dlVar.b();
                diVarB3.a(c0000doA, c0000doA3, c0000doC3, iB);
                if (z5) {
                    dlVar.a(diVarB3, (int) (diVarB3.c.b(c0000doC3) * (-1.0f)));
                }
                dlVar.a(diVarB3);
                boolean z6 = dqVar2.f != dp.f;
                C0000do c0000doC4 = dlVar.c();
                di diVarB4 = dlVar.b();
                diVarB4.b(c0000doA2, c0000doA4, c0000doC4, iB2 * (-1));
                if (z6) {
                    dlVar.a(diVarB4, (int) (diVarB4.c.b(c0000doC4) * (-1.0f)));
                }
                dlVar.a(diVarB4);
                dlVar.a(dl.a(dlVar, c0000doA, c0000doA3, iB, f, c0000doA4, c0000doA2, iB2, false));
                return;
            }
            return;
        }
        if (z3) {
            dlVar.a(c0000doA, c0000doA3, iB, 3);
            dlVar.b(c0000doA2, c0000doA4, iB2 * (-1), 3);
            dlVar.a(dl.a(dlVar, c0000doA, c0000doA3, iB, f, c0000doA4, c0000doA2, iB2, true));
            return;
        }
        if (!z4) {
            if (i5 == 1) {
                if (i6 > i8) {
                    i8 = i6;
                }
                if (i7 <= 0) {
                    i7 = i8;
                } else if (i7 >= i8) {
                    dlVar.b(c0000doA2, c0000doA, i7, 3);
                    i7 = i8;
                }
                dlVar.c(c0000doA2, c0000doA, i7, 3);
                dlVar.a(c0000doA, c0000doA3, iB, 2);
                dlVar.b(c0000doA2, c0000doA4, -iB2, 2);
                dlVar.a(c0000doA, c0000doA3, iB, f, c0000doA4, c0000doA2, iB2, 4);
                return;
            }
            if (i6 == 0 && i7 == 0) {
                dlVar.a(dlVar.b().a(c0000doA, c0000doA3, iB));
                dlVar.a(dlVar.b().a(c0000doA2, c0000doA4, iB2 * (-1)));
                return;
            }
            if (i7 > 0) {
                dlVar.b(c0000doA2, c0000doA, i7, 3);
            }
            dlVar.a(c0000doA, c0000doA3, iB, 2);
            dlVar.b(c0000doA2, c0000doA4, -iB2, 2);
            dlVar.a(c0000doA, c0000doA3, iB, f, c0000doA4, c0000doA2, iB2, 4);
        }
    }

    public void b(dl dlVar, int i) {
        if (i == Integer.MAX_VALUE) {
            a(dl.b(this.i), dl.b(this.j), dl.b(this.k), dl.b(this.l));
            return;
        }
        if (i == -2) {
            a(this.af, this.ag, this.ah, this.ai);
            return;
        }
        if (this.i.i == i) {
            this.af = dl.b(this.i);
        }
        if (this.j.i == i) {
            this.ag = dl.b(this.j);
        }
        if (this.k.i == i) {
            this.ah = dl.b(this.k);
        }
        if (this.l.i == i) {
            this.ai = dl.b(this.l);
        }
    }
}

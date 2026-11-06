package flm;

import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dl {
    private static int f = 1000;
    public di[] b;
    public final dj e;
    private int g = 0;
    private HashMap h = null;
    public dk a = new dk();
    private int i = 32;
    private int j = this.i;
    private boolean[] k = new boolean[this.i];
    public int c = 1;
    public int d = 0;
    private int l = this.i;
    private C0000do[] m = new C0000do[f];
    private int n = 0;
    private di[] o = new di[this.i];

    public dl() {
        this.b = null;
        this.b = new di[this.i];
        f();
        this.e = new dj();
    }

    private final void e() {
        this.i <<= 1;
        this.b = (di[]) Arrays.copyOf(this.b, this.i);
        this.e.c = (C0000do[]) Arrays.copyOf(this.e.c, this.i);
        this.k = new boolean[this.i];
        this.j = this.i;
        this.l = this.i;
        this.a.a.clear();
    }

    private final void f() {
        for (int i = 0; i < this.b.length; i++) {
            di diVar = this.b[i];
            if (diVar != null) {
                this.e.a.a(diVar);
            }
            this.b[i] = null;
        }
    }

    public final void a() {
        for (int i = 0; i < this.e.c.length; i++) {
            C0000do c0000do = this.e.c[i];
            if (c0000do != null) {
                c0000do.a();
            }
        }
        this.e.b.a(this.m, this.n);
        this.n = 0;
        Arrays.fill(this.e.c, (Object) null);
        this.g = 0;
        this.a.a.clear();
        this.c = 1;
        f();
        this.d = 0;
    }

    public final C0000do a(Object obj) {
        C0000do c0000do = null;
        if (obj != null) {
            if (this.c + 1 >= this.j) {
                e();
            }
            if (obj instanceof dq) {
                c0000do = ((dq) obj).h;
                if (c0000do == null) {
                    ((dq) obj).a();
                    c0000do = ((dq) obj).h;
                }
                if (c0000do.a == -1 || c0000do.a > this.g || this.e.c[c0000do.a] == null) {
                    if (c0000do.a != -1) {
                        c0000do.a();
                    }
                    this.g++;
                    this.c++;
                    c0000do.a = this.g;
                    c0000do.f = dp.a;
                    this.e.c[this.g] = c0000do;
                }
            }
        }
        return c0000do;
    }

    public final di b() {
        di diVar = (di) this.e.a.a();
        if (diVar == null) {
            return new di(this.e);
        }
        diVar.a = null;
        dh dhVar = diVar.c;
        dhVar.f = -1;
        dhVar.g = -1;
        dhVar.h = false;
        dhVar.a = 0;
        diVar.b = 0.0f;
        diVar.d = false;
        return diVar;
    }

    public final C0000do c() {
        if (this.c + 1 >= this.j) {
            e();
        }
        C0000do c0000doA = a(dp.b);
        this.g++;
        this.c++;
        c0000doA.a = this.g;
        this.e.c[this.g] = c0000doA;
        return c0000doA;
    }

    public final void a(di diVar, int i) {
        diVar.c.a(d(), i);
    }

    public final C0000do d() {
        if (this.c + 1 >= this.j) {
            e();
        }
        C0000do c0000doA = a(dp.c);
        this.g++;
        this.c++;
        c0000doA.a = this.g;
        this.e.c[this.g] = c0000doA;
        return c0000doA;
    }

    private final C0000do a(int i) {
        C0000do c0000do;
        C0000do c0000do2 = (C0000do) this.e.b.a();
        if (c0000do2 == null) {
            c0000do = new C0000do(i);
        } else {
            c0000do2.a();
            c0000do2.f = i;
            c0000do = c0000do2;
        }
        if (this.n >= f) {
            f <<= 1;
            this.m = (C0000do[]) Arrays.copyOf(this.m, f);
        }
        C0000do[] c0000doArr = this.m;
        int i2 = this.n;
        this.n = i2 + 1;
        c0000doArr[i2] = c0000do;
        return c0000do;
    }

    public static int b(Object obj) {
        C0000do c0000do = ((dq) obj).h;
        if (c0000do != null) {
            return (int) (c0000do.d + 0.5f);
        }
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:106:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:107:0x01bf  */
    public final void a(di diVar) {
        C0000do c0000do;
        float f2;
        C0000do c0000do2;
        if (diVar != null) {
            if (this.d + 1 >= this.l || this.c + 1 >= this.j) {
                e();
            }
            if (!diVar.d) {
                if (this.d > 0) {
                    dh dhVar = diVar.c;
                    di[] diVarArr = this.b;
                    int i = dhVar.f;
                    int i2 = 0;
                    while (i != -1 && i2 < dhVar.a) {
                        C0000do c0000do3 = dhVar.b.c[dhVar.c[i]];
                        if (c0000do3.b != -1) {
                            float f3 = dhVar.e[i];
                            dhVar.a(c0000do3);
                            di diVar2 = diVarArr[c0000do3.b];
                            if (!diVar2.d) {
                                dh dhVar2 = diVar2.c;
                                int i3 = dhVar2.f;
                                for (int i4 = 0; i3 != -1 && i4 < dhVar2.a; i4++) {
                                    dhVar.b(dhVar.b.c[dhVar2.c[i3]], dhVar2.e[i3] * f3);
                                    i3 = dhVar2.d[i3];
                                }
                            }
                            diVar.b += diVar2.b * f3;
                            diVar2.a.a(diVar);
                            i = dhVar.f;
                            i2 = 0;
                        } else {
                            i = dhVar.d[i];
                            i2++;
                        }
                    }
                    if (diVar.c.a == 0) {
                        diVar.d = true;
                    }
                }
                if (diVar.b < 0.0f) {
                    diVar.b = -diVar.b;
                    dh dhVar3 = diVar.c;
                    int i5 = dhVar3.f;
                    for (int i6 = 0; i5 != -1 && i6 < dhVar3.a; i6++) {
                        float[] fArr = dhVar3.e;
                        fArr[i5] = -fArr[i5];
                        i5 = dhVar3.d[i5];
                    }
                }
                dh dhVar4 = diVar.c;
                int i7 = 0;
                int i8 = dhVar4.f;
                C0000do c0000do4 = null;
                C0000do c0000do5 = null;
                while (true) {
                    if (i8 != -1 && i7 < dhVar4.a) {
                        float f4 = dhVar4.e[i8];
                        if (f4 < 0.0f) {
                            if (f4 > -0.001f) {
                                dhVar4.e[i8] = 0.0f;
                                f2 = 0.0f;
                            } else {
                                f2 = f4;
                            }
                        } else if (f4 < 0.001f) {
                            dhVar4.e[i8] = 0.0f;
                            f2 = 0.0f;
                        } else {
                            f2 = f4;
                        }
                        if (f2 != 0.0f) {
                            c0000do = dhVar4.b.c[dhVar4.c[i8]];
                            if (c0000do.f == dp.a) {
                                if (f2 < 0.0f) {
                                    break;
                                }
                                if (c0000do4 == null) {
                                    c0000do2 = c0000do5;
                                } else {
                                    c0000do = c0000do4;
                                    c0000do2 = c0000do5;
                                }
                            } else if (f2 >= 0.0f || (c0000do5 != null && c0000do.c >= c0000do5.c)) {
                                c0000do = c0000do4;
                                c0000do2 = c0000do5;
                            } else {
                                C0000do c0000do6 = c0000do4;
                                c0000do2 = c0000do;
                                c0000do = c0000do6;
                            }
                        } else {
                            c0000do = c0000do4;
                            c0000do2 = c0000do5;
                        }
                        i7++;
                        i8 = dhVar4.d[i8];
                        c0000do5 = c0000do2;
                        c0000do4 = c0000do;
                    } else if (c0000do4 != null) {
                        c0000do = c0000do4;
                        break;
                    } else {
                        c0000do = c0000do5;
                        break;
                    }
                }
                if (c0000do != null) {
                    diVar.a(c0000do);
                }
                if (diVar.c.a == 0) {
                    diVar.d = true;
                }
                if (!(diVar.a != null && (diVar.a.f == dp.a || diVar.b >= 0.0f))) {
                    return;
                }
            }
            if (this.b[this.d] != null) {
                this.e.a.a(this.b[this.d]);
            }
            if (!diVar.d) {
                diVar.a();
            }
            this.b[this.d] = diVar;
            diVar.a.b = this.d;
            this.d++;
            int i9 = diVar.a.h;
            if (i9 > 0) {
                while (this.o.length < i9) {
                    this.o = new di[this.o.length << 1];
                }
                di[] diVarArr2 = this.o;
                for (int i10 = 0; i10 < i9; i10++) {
                    diVarArr2[i10] = diVar.a.g[i10];
                }
                for (int i11 = 0; i11 < i9; i11++) {
                    di diVar3 = diVarArr2[i11];
                    if (diVar3 != diVar) {
                        diVar3.c.a(diVar3, diVar);
                        diVar3.a();
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:72:0x0109  */
    public final int a(dk dkVar) {
        C0000do c0000do;
        boolean z;
        boolean z2;
        float f2;
        boolean z3;
        boolean z4 = false;
        for (int i = 0; i < this.c; i++) {
            this.k[i] = false;
        }
        int i2 = 0;
        int i3 = 0;
        while (!z4) {
            i3++;
            int size = dkVar.a.size();
            int i4 = 0;
            C0000do c0000do2 = null;
            int i5 = 0;
            while (i4 < size) {
                C0000do c0000do3 = (C0000do) dkVar.a.get(i4);
                C0000do c0000do4 = c0000do2;
                int i6 = i5;
                for (int i7 = 5; i7 >= 0; i7--) {
                    float f3 = c0000do3.e[i7];
                    if (c0000do4 == null && f3 < 0.0f && i7 >= i6) {
                        i6 = i7;
                        c0000do4 = c0000do3;
                    }
                    if (f3 > 0.0f && i7 > i6) {
                        c0000do4 = null;
                        i6 = i7;
                    }
                }
                i4++;
                i5 = i6;
                c0000do2 = c0000do4;
            }
            if (c0000do2 == null) {
                c0000do = c0000do2;
                i2 = i2;
                z = z4;
            } else if (this.k[c0000do2.a]) {
                c0000do = null;
                i2 = i2;
                z = z4;
            } else {
                this.k[c0000do2.a] = true;
                int i8 = i2 + 1;
                if (i8 >= this.c) {
                    z = true;
                    c0000do = c0000do2;
                    i2 = i8;
                } else {
                    c0000do = c0000do2;
                    i2 = i8;
                    z = z4;
                }
            }
            if (c0000do != null) {
                float f4 = Float.MAX_VALUE;
                int i9 = -1;
                int i10 = 0;
                while (i10 < this.d) {
                    di diVar = this.b[i10];
                    if (diVar.a.f != dp.a) {
                        dh dhVar = diVar.c;
                        if (dhVar.f == -1) {
                            z3 = false;
                        } else {
                            int i11 = dhVar.f;
                            int i12 = 0;
                            while (true) {
                                if (i11 != -1 && i12 < dhVar.a) {
                                    if (dhVar.c[i11] == c0000do.a) {
                                        z3 = true;
                                        break;
                                    }
                                    i11 = dhVar.d[i11];
                                    i12++;
                                } else {
                                    z3 = false;
                                    break;
                                }
                            }
                        }
                        if (z3) {
                            float fB = diVar.c.b(c0000do);
                            if (fB < 0.0f) {
                                f2 = (-diVar.b) / fB;
                                if (f2 < f4) {
                                    i9 = i10;
                                } else {
                                    f2 = f4;
                                }
                            } else {
                                f2 = f4;
                            }
                        } else {
                            f2 = f4;
                        }
                    } else {
                        f2 = f4;
                    }
                    i10++;
                    f4 = f2;
                }
                if (i9 >= 0) {
                    di diVar2 = this.b[i9];
                    diVar2.a.b = -1;
                    diVar2.a(c0000do);
                    diVar2.a.b = i9;
                    for (int i13 = 0; i13 < this.d; i13++) {
                        this.b[i13].a(diVar2);
                    }
                    dkVar.a(this);
                    try {
                        b(dkVar);
                        z2 = z;
                    } catch (Exception e) {
                        ehh.a.a(e);
                        z4 = z;
                    }
                } else {
                    z2 = true;
                }
                z4 = z2;
            } else {
                z = true;
            }
            z4 = z;
        }
        return i3;
    }

    public final int b(dk dkVar) {
        boolean z;
        int i;
        int i2 = 0;
        while (true) {
            if (i2 >= this.d) {
                z = false;
                break;
            }
            if (this.b[i2].a.f != dp.a && this.b[i2].b < 0.0f) {
                z = true;
                break;
            }
            i2++;
        }
        if (!z) {
            i = 0;
        } else {
            boolean z2 = false;
            i = 0;
            while (!z2) {
                i++;
                float f2 = Float.MAX_VALUE;
                int i3 = 0;
                int i4 = -1;
                int i5 = -1;
                for (int i6 = 0; i6 < this.d; i6++) {
                    di diVar = this.b[i6];
                    if (diVar.a.f != dp.a && diVar.b < 0.0f) {
                        float f3 = f2;
                        int i7 = i3;
                        int i8 = i4;
                        int i9 = i5;
                        for (int i10 = 1; i10 < this.c; i10++) {
                            C0000do c0000do = this.e.c[i10];
                            float fB = diVar.c.b(c0000do);
                            if (fB > 0.0f) {
                                float f4 = f3;
                                int i11 = 0;
                                while (i11 < 6) {
                                    float f5 = c0000do.e[i11] / fB;
                                    if ((f5 >= f4 || i11 != i7) && i11 <= i7) {
                                        f5 = f4;
                                    } else {
                                        i9 = i10;
                                        i8 = i6;
                                        i7 = i11;
                                    }
                                    i11++;
                                    f4 = f5;
                                }
                                f3 = f4;
                            }
                        }
                        i5 = i9;
                        i4 = i8;
                        i3 = i7;
                        f2 = f3;
                    }
                }
                if (i4 != -1) {
                    di diVar2 = this.b[i4];
                    diVar2.a.b = -1;
                    diVar2.a(this.e.c[i5]);
                    diVar2.a.b = i4;
                    for (int i12 = 0; i12 < this.d; i12++) {
                        this.b[i12].a(diVar2);
                    }
                    dkVar.a(this);
                } else {
                    z2 = true;
                }
            }
        }
        for (int i13 = 0; i13 < this.d && (this.b[i13].a.f == dp.a || this.b[i13].b >= 0.0f); i13++) {
        }
        return i;
    }

    public final void a(C0000do c0000do, C0000do c0000do2, int i, int i2) {
        di diVarB = b();
        C0000do c0000doC = c();
        c0000doC.c = i2;
        diVarB.a(c0000do, c0000do2, c0000doC, i);
        a(diVarB);
    }

    public final void b(C0000do c0000do, C0000do c0000do2, int i, int i2) {
        di diVarB = b();
        C0000do c0000doC = c();
        c0000doC.c = i2;
        diVarB.b(c0000do, c0000do2, c0000doC, i);
        a(diVarB);
    }

    public final void a(C0000do c0000do, C0000do c0000do2, int i, float f2, C0000do c0000do3, C0000do c0000do4, int i2, int i3) {
        di diVarB = b();
        diVarB.a(c0000do, c0000do2, i, f2, c0000do3, c0000do4, i2);
        C0000do c0000doD = d();
        C0000do c0000doD2 = d();
        c0000doD.c = 4;
        c0000doD2.c = 4;
        diVarB.a(c0000doD, c0000doD2);
        a(diVarB);
    }

    public final di c(C0000do c0000do, C0000do c0000do2, int i, int i2) {
        di diVarB = b();
        diVarB.a(c0000do, c0000do2, i);
        C0000do c0000doD = d();
        C0000do c0000doD2 = d();
        c0000doD.c = i2;
        c0000doD2.c = i2;
        diVarB.a(c0000doD, c0000doD2);
        a(diVarB);
        return diVarB;
    }

    public final void a(C0000do c0000do, int i) {
        int i2 = c0000do.b;
        if (c0000do.b != -1) {
            di diVar = this.b[i2];
            if (diVar.d) {
                diVar.b = i;
                return;
            }
            di diVarB = b();
            diVarB.a(c0000do, i);
            a(diVarB);
            return;
        }
        di diVarB2 = b();
        diVarB2.a = c0000do;
        c0000do.d = i;
        diVarB2.b = i;
        diVarB2.d = true;
        a(diVarB2);
    }

    public static di a(dl dlVar, C0000do c0000do, C0000do c0000do2, int i, boolean z) {
        di diVarB = dlVar.b();
        diVarB.a(c0000do, c0000do2, i);
        if (z) {
            dlVar.a(diVarB, 1);
        }
        return diVarB;
    }

    public static di a(dl dlVar, C0000do c0000do, C0000do c0000do2, int i, float f2, C0000do c0000do3, C0000do c0000do4, int i2, boolean z) {
        di diVarB = dlVar.b();
        diVarB.a(c0000do, c0000do2, i, f2, c0000do3, c0000do4, i2);
        if (z) {
            C0000do c0000doD = dlVar.d();
            C0000do c0000doD2 = dlVar.d();
            c0000doD.c = 4;
            c0000doD2.c = 4;
            diVarB.a(c0000doD, c0000doD2);
        }
        return diVarB;
    }
}

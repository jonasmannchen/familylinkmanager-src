package flm;

import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class di {
    public final dh c;
    public C0000do a = null;
    public float b = 0.0f;
    public boolean d = false;

    public di(dj djVar) {
        this.c = new dh(this, djVar);
    }

    final void a() {
        dh dhVar = this.c;
        int i = dhVar.f;
        for (int i2 = 0; i != -1 && i2 < dhVar.a; i2++) {
            C0000do c0000do = dhVar.b.c[dhVar.c[i]];
            int i3 = 0;
            while (true) {
                if (i3 < c0000do.h) {
                    if (c0000do.g[i3] == this) {
                        break;
                    } else {
                        i3++;
                    }
                } else {
                    if (c0000do.h >= c0000do.g.length) {
                        c0000do.g = (di[]) Arrays.copyOf(c0000do.g, c0000do.g.length << 1);
                    }
                    c0000do.g[c0000do.h] = this;
                    c0000do.h++;
                    break;
                }
            }
            i = dhVar.d[i];
        }
    }

    public final String toString() {
        String str;
        boolean z;
        float f;
        String str2;
        String str3 = (this.a == null ? "0" : "" + this.a) + " = ";
        if (this.b != 0.0f) {
            str = str3 + this.b;
            z = true;
        } else {
            str = str3;
            z = false;
        }
        int i = this.c.a;
        String str4 = str;
        for (int i2 = 0; i2 < i; i2++) {
            C0000do c0000doA = this.c.a(i2);
            if (c0000doA != null) {
                float fB = this.c.b(i2);
                String string = c0000doA.toString();
                if (z) {
                    if (fB > 0.0f) {
                        str4 = str4 + " + ";
                        f = fB;
                    } else {
                        str4 = str4 + " - ";
                        f = -fB;
                    }
                } else if (fB < 0.0f) {
                    str4 = str4 + "- ";
                    f = -fB;
                } else {
                    f = fB;
                }
                if (f == 1.0f) {
                    str2 = str4 + string;
                } else {
                    str2 = str4 + f + " " + string;
                }
                str4 = str2;
                z = true;
            }
        }
        if (!z) {
            return str4 + "0.0";
        }
        return str4;
    }

    public final di a(C0000do c0000do, int i) {
        if (i < 0) {
            this.b = i * (-1);
            this.c.a(c0000do, 1.0f);
        } else {
            this.b = i;
            this.c.a(c0000do, -1.0f);
        }
        return this;
    }

    public final di a(C0000do c0000do, C0000do c0000do2, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.b = i;
        }
        if (!z) {
            this.c.a(c0000do, -1.0f);
            this.c.a(c0000do2, 1.0f);
        } else {
            this.c.a(c0000do, 1.0f);
            this.c.a(c0000do2, -1.0f);
        }
        return this;
    }

    public final di a(C0000do c0000do, C0000do c0000do2, C0000do c0000do3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.b = i;
        }
        if (!z) {
            this.c.a(c0000do, -1.0f);
            this.c.a(c0000do2, 1.0f);
            this.c.a(c0000do3, 1.0f);
        } else {
            this.c.a(c0000do, 1.0f);
            this.c.a(c0000do2, -1.0f);
            this.c.a(c0000do3, -1.0f);
        }
        return this;
    }

    public final di b(C0000do c0000do, C0000do c0000do2, C0000do c0000do3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.b = i;
        }
        if (!z) {
            this.c.a(c0000do, -1.0f);
            this.c.a(c0000do2, 1.0f);
            this.c.a(c0000do3, -1.0f);
        } else {
            this.c.a(c0000do, 1.0f);
            this.c.a(c0000do2, -1.0f);
            this.c.a(c0000do3, 1.0f);
        }
        return this;
    }

    public final di a(float f, float f2, float f3, C0000do c0000do, int i, C0000do c0000do2, int i2, C0000do c0000do3, int i3, C0000do c0000do4, int i4) {
        if (f2 == 0.0f || f == f3) {
            this.b = ((-i) - i2) + i3 + i4;
            this.c.a(c0000do, 1.0f);
            this.c.a(c0000do2, -1.0f);
            this.c.a(c0000do4, 1.0f);
            this.c.a(c0000do3, -1.0f);
        } else {
            float f4 = (f / f2) / (f3 / f2);
            this.b = ((-i) - i2) + (i3 * f4) + (i4 * f4);
            this.c.a(c0000do, 1.0f);
            this.c.a(c0000do2, -1.0f);
            this.c.a(c0000do4, f4);
            this.c.a(c0000do3, -f4);
        }
        return this;
    }

    final di a(C0000do c0000do, C0000do c0000do2, int i, float f, C0000do c0000do3, C0000do c0000do4, int i2) {
        if (c0000do2 == c0000do3) {
            this.c.a(c0000do, 1.0f);
            this.c.a(c0000do4, 1.0f);
            this.c.a(c0000do2, -2.0f);
        } else if (f == 0.5f) {
            this.c.a(c0000do, 1.0f);
            this.c.a(c0000do2, -1.0f);
            this.c.a(c0000do3, -1.0f);
            this.c.a(c0000do4, 1.0f);
            if (i > 0 || i2 > 0) {
                this.b = (-i) + i2;
            }
        } else if (f <= 0.0f) {
            this.c.a(c0000do, -1.0f);
            this.c.a(c0000do2, 1.0f);
            this.b = i;
        } else if (f >= 1.0f) {
            this.c.a(c0000do3, -1.0f);
            this.c.a(c0000do4, 1.0f);
            this.b = i2;
        } else {
            this.c.a(c0000do, (1.0f - f) * 1.0f);
            this.c.a(c0000do2, (1.0f - f) * (-1.0f));
            this.c.a(c0000do3, (-1.0f) * f);
            this.c.a(c0000do4, f * 1.0f);
            if (i > 0 || i2 > 0) {
                this.b = ((-i) * (1.0f - f)) + (i2 * f);
            }
        }
        return this;
    }

    public final di a(C0000do c0000do, C0000do c0000do2) {
        this.c.a(c0000do, 1.0f);
        this.c.a(c0000do2, -1.0f);
        return this;
    }

    public final di a(C0000do c0000do, C0000do c0000do2, C0000do c0000do3, C0000do c0000do4, float f) {
        this.c.a(c0000do, -1.0f);
        this.c.a(c0000do2, 1.0f);
        this.c.a(c0000do3, f);
        this.c.a(c0000do4, -f);
        return this;
    }

    final boolean a(di diVar) {
        this.c.a(this, diVar);
        return true;
    }

    final void a(C0000do c0000do) {
        if (this.a != null) {
            this.c.a(this.a, -1.0f);
            this.a = null;
        }
        float f = -this.c.a(c0000do);
        this.a = c0000do;
        if (f != 1.0f) {
            this.b /= f;
            dh dhVar = this.c;
            int i = dhVar.f;
            for (int i2 = 0; i != -1 && i2 < dhVar.a; i2++) {
                float[] fArr = dhVar.e;
                fArr[i] = fArr[i] / f;
                i = dhVar.d[i];
            }
        }
    }
}

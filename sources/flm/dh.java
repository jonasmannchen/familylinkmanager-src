package flm;

import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dh {
    public final dj b;
    private final di i;
    public int a = 0;
    private int j = 8;
    private C0000do k = null;
    public int[] c = new int[this.j];
    public int[] d = new int[this.j];
    public float[] e = new float[this.j];
    public int f = -1;
    public int g = -1;
    public boolean h = false;

    dh(di diVar, dj djVar) {
        this.i = diVar;
        this.b = djVar;
    }

    public final void a(C0000do c0000do, float f) {
        if (f == 0.0f) {
            a(c0000do);
            return;
        }
        if (this.f == -1) {
            this.f = 0;
            this.e[this.f] = f;
            this.c[this.f] = c0000do.a;
            this.d[this.f] = -1;
            this.a++;
            if (!this.h) {
                this.g++;
                return;
            }
            return;
        }
        int i = this.f;
        int i2 = 0;
        int i3 = -1;
        while (i != -1 && i2 < this.a) {
            if (this.c[i] == c0000do.a) {
                this.e[i] = f;
                return;
            }
            if (this.c[i] < c0000do.a) {
                i3 = i;
            }
            i2++;
            i = this.d[i];
        }
        int length = this.g + 1;
        if (this.h) {
            if (this.c[this.g] == -1) {
                length = this.g;
            } else {
                length = this.c.length;
            }
        }
        if (length >= this.c.length && this.a < this.c.length) {
            for (int i4 = 0; i4 < this.c.length; i4++) {
                if (this.c[i4] == -1) {
                    length = i4;
                    break;
                }
            }
        }
        if (length >= this.c.length) {
            length = this.c.length;
            this.j <<= 1;
            this.h = false;
            this.g = length - 1;
            this.e = Arrays.copyOf(this.e, this.j);
            this.c = Arrays.copyOf(this.c, this.j);
            this.d = Arrays.copyOf(this.d, this.j);
        }
        this.c[length] = c0000do.a;
        this.e[length] = f;
        if (i3 != -1) {
            this.d[length] = this.d[i3];
            this.d[i3] = length;
        } else {
            this.d[length] = this.f;
            this.f = length;
        }
        this.a++;
        if (!this.h) {
            this.g++;
        }
        if (this.a >= this.c.length) {
            this.h = true;
        }
    }

    public final void b(C0000do c0000do, float f) {
        if (f != 0.0f) {
            if (this.f == -1) {
                this.f = 0;
                this.e[this.f] = f;
                this.c[this.f] = c0000do.a;
                this.d[this.f] = -1;
                this.a++;
                if (!this.h) {
                    this.g++;
                    return;
                }
                return;
            }
            int i = this.f;
            int i2 = 0;
            int i3 = -1;
            while (i != -1 && i2 < this.a) {
                int i4 = this.c[i];
                if (i4 == c0000do.a) {
                    float[] fArr = this.e;
                    fArr[i] = fArr[i] + f;
                    if (this.e[i] == 0.0f) {
                        if (i == this.f) {
                            this.f = this.d[i];
                        } else {
                            this.d[i3] = this.d[i];
                        }
                        this.b.c[i4].a(this.i);
                        if (this.h) {
                            this.g = i;
                        }
                        this.a--;
                        return;
                    }
                    return;
                }
                if (this.c[i] < c0000do.a) {
                    i3 = i;
                }
                i2++;
                i = this.d[i];
            }
            int length = this.g + 1;
            if (this.h) {
                if (this.c[this.g] == -1) {
                    length = this.g;
                } else {
                    length = this.c.length;
                }
            }
            if (length >= this.c.length && this.a < this.c.length) {
                for (int i5 = 0; i5 < this.c.length; i5++) {
                    if (this.c[i5] == -1) {
                        length = i5;
                        break;
                    }
                }
            }
            if (length >= this.c.length) {
                length = this.c.length;
                this.j <<= 1;
                this.h = false;
                this.g = length - 1;
                this.e = Arrays.copyOf(this.e, this.j);
                this.c = Arrays.copyOf(this.c, this.j);
                this.d = Arrays.copyOf(this.d, this.j);
            }
            this.c[length] = c0000do.a;
            this.e[length] = f;
            if (i3 != -1) {
                this.d[length] = this.d[i3];
                this.d[i3] = length;
            } else {
                this.d[length] = this.f;
                this.f = length;
            }
            this.a++;
            if (!this.h) {
                this.g++;
            }
            if (this.g >= this.c.length) {
                this.h = true;
                this.g = this.c.length - 1;
            }
        }
    }

    public final float a(C0000do c0000do) {
        if (c0000do == null) {
            this.k = null;
        }
        if (this.f == -1) {
            return 0.0f;
        }
        int i = this.f;
        int i2 = 0;
        int i3 = -1;
        while (i != -1 && i2 < this.a) {
            int i4 = this.c[i];
            if (i4 == c0000do.a) {
                if (i == this.f) {
                    this.f = this.d[i];
                } else {
                    this.d[i3] = this.d[i];
                }
                this.b.c[i4].a(this.i);
                this.a--;
                this.c[i] = -1;
                if (this.h) {
                    this.g = i;
                }
                return this.e[i];
            }
            i2++;
            int i5 = i;
            i = this.d[i];
            i3 = i5;
        }
        return 0.0f;
    }

    final void a(di diVar, di diVar2) {
        int i = this.f;
        int i2 = 0;
        while (i != -1 && i2 < this.a) {
            if (this.c[i] == diVar2.a.a) {
                float f = this.e[i];
                a(diVar2.a);
                dh dhVar = diVar2.c;
                int i3 = dhVar.f;
                for (int i4 = 0; i3 != -1 && i4 < dhVar.a; i4++) {
                    b(this.b.c[dhVar.c[i3]], dhVar.e[i3] * f);
                    i3 = dhVar.d[i3];
                }
                diVar.b += diVar2.b * f;
                diVar2.a.a(diVar);
                i = this.f;
                i2 = 0;
            } else {
                i = this.d[i];
                i2++;
            }
        }
    }

    final C0000do a(int i) {
        int i2 = this.f;
        for (int i3 = 0; i2 != -1 && i3 < this.a; i3++) {
            if (i3 == i) {
                return this.b.c[this.c[i2]];
            }
            i2 = this.d[i2];
        }
        return null;
    }

    final float b(int i) {
        int i2 = this.f;
        for (int i3 = 0; i2 != -1 && i3 < this.a; i3++) {
            if (i3 == i) {
                return this.e[i2];
            }
            i2 = this.d[i2];
        }
        return 0.0f;
    }

    public final float b(C0000do c0000do) {
        int i = this.f;
        for (int i2 = 0; i != -1 && i2 < this.a; i2++) {
            if (this.c[i] == c0000do.a) {
                return this.e[i];
            }
            i = this.d[i];
        }
        return 0.0f;
    }

    public final String toString() {
        String str = "";
        int i = this.f;
        for (int i2 = 0; i != -1 && i2 < this.a; i2++) {
            str = ((str + " -> ") + this.e[i] + " : ") + this.b.c[this.c[i]];
            i = this.d[i];
        }
        return str;
    }
}

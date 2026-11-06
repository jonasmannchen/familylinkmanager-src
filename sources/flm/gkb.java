package flm;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class gkb {
    public final gue b;
    public int c;
    public int d;
    public final List a = new ArrayList();
    public gjz[] e = new gjz[8];
    private int f = this.e.length - 1;
    private int g = 0;
    private int h = 0;

    gkb(int i, guq guqVar) {
        this.c = i;
        this.d = i;
        this.b = gug.a(guqVar);
    }

    final void a() {
        if (this.d < this.h) {
            if (this.d == 0) {
                c();
            } else {
                d(this.h - this.d);
            }
        }
    }

    private final void c() {
        Arrays.fill(this.e, (Object) null);
        this.f = this.e.length - 1;
        this.g = 0;
        this.h = 0;
    }

    private final int d(int i) {
        int i2 = 0;
        if (i > 0) {
            int length = this.e.length;
            while (true) {
                length--;
                if (length < this.f || i <= 0) {
                    break;
                }
                i -= this.e[length].h;
                this.h -= this.e[length].h;
                this.g--;
                i2++;
            }
            System.arraycopy(this.e, this.f + 1, this.e, this.f + 1 + i2, this.g);
            this.f += i2;
        }
        return i2;
    }

    final int a(int i) {
        return this.f + 1 + i;
    }

    final guf b(int i) {
        if (c(i)) {
            return gka.a[i].f;
        }
        return this.e[a(i - gka.a.length)].f;
    }

    static boolean c(int i) {
        return i >= 0 && i <= gka.a.length + (-1);
    }

    final void a(int i, gjz gjzVar) {
        this.a.add(gjzVar);
        int i2 = gjzVar.h;
        if (i2 > this.d) {
            c();
            return;
        }
        d((this.h + i2) - this.d);
        if (this.g + 1 > this.e.length) {
            gjz[] gjzVarArr = new gjz[this.e.length << 1];
            System.arraycopy(this.e, 0, gjzVarArr, this.e.length, this.e.length);
            this.f = this.e.length - 1;
            this.e = gjzVarArr;
        }
        int i3 = this.f;
        this.f = i3 - 1;
        this.e[i3] = gjzVar;
        this.g++;
        this.h = i2 + this.h;
    }

    private final int d() {
        return this.b.c() & 255;
    }

    final int a(int i, int i2) {
        int i3 = i & i2;
        if (i3 >= i2) {
            int i4 = 0;
            while (true) {
                int iD = d();
                if ((iD & 128) != 0) {
                    i2 += (iD & 127) << i4;
                    i4 += 7;
                } else {
                    return (iD << i4) + i2;
                }
            }
        } else {
            return i3;
        }
    }

    final guf b() {
        int iD = d();
        boolean z = (iD & 128) == 128;
        int iA = a(iD, 127);
        if (!z) {
            return this.b.c(iA);
        }
        gki gkiVar = gki.a;
        byte[] bArrE = this.b.e(iA);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i = 0;
        gkj gkjVar = gkiVar.b;
        int i2 = 0;
        for (byte b : bArrE) {
            i = (i << 8) | (b & 255);
            i2 += 8;
            while (i2 >= 8) {
                gkjVar = gkjVar.a[(i >>> (i2 - 8)) & 255];
                if (gkjVar.a == null) {
                    byteArrayOutputStream.write(gkjVar.b);
                    i2 -= gkjVar.c;
                    gkjVar = gkiVar.b;
                } else {
                    i2 -= 8;
                }
            }
        }
        while (i2 > 0) {
            gkj gkjVar2 = gkjVar.a[(i << (8 - i2)) & 255];
            if (gkjVar2.a != null || gkjVar2.c > i2) {
                break;
            }
            byteArrayOutputStream.write(gkjVar2.b);
            i2 -= gkjVar2.c;
            gkjVar = gkiVar.b;
        }
        return guf.a(byteArrayOutputStream.toByteArray());
    }
}

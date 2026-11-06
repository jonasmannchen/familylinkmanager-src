package flm;

import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class guo extends guf {
    private final transient byte[][] d;
    private final transient int[] e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    guo(guc gucVar, int i) {
        super(null);
        int i2 = 0;
        gut.a(gucVar.c, 0L, i);
        gum gumVar = gucVar.b;
        int i3 = 0;
        int i4 = 0;
        while (i4 < i) {
            if (gumVar.c == gumVar.b) {
                throw new AssertionError("s.limit == s.pos");
            }
            i4 += gumVar.c - gumVar.b;
            i3++;
            gumVar = gumVar.f;
        }
        this.d = new byte[i3][];
        this.e = new int[i3 << 1];
        gum gumVar2 = gucVar.b;
        int i5 = 0;
        while (i2 < i) {
            this.d[i5] = gumVar2.a;
            int i6 = (gumVar2.c - gumVar2.b) + i2;
            if (i6 > i) {
                i6 = i;
            }
            this.e[i5] = i6;
            this.e[this.d.length + i5] = gumVar2.b;
            gumVar2.d = true;
            i5++;
            gumVar2 = gumVar2.f;
            i2 = i6;
        }
    }

    @Override // flm.guf
    public final String a() {
        return g().a();
    }

    @Override // flm.guf
    public final String b() {
        return g().b();
    }

    @Override // flm.guf
    public final String c() {
        return g().c();
    }

    @Override // flm.guf
    public final guf d() {
        return g().d();
    }

    @Override // flm.guf
    public final guf a(int i, int i2) {
        return g().a(i, i2);
    }

    @Override // flm.guf
    public final byte a(int i) {
        gut.a(this.e[this.d.length - 1], i, 1L);
        int iB = b(i);
        return this.d[iB][(i - (iB == 0 ? 0 : this.e[iB - 1])) + this.e[this.d.length + iB]];
    }

    private final int b(int i) {
        int iBinarySearch = Arrays.binarySearch(this.e, 0, this.d.length, i + 1);
        return iBinarySearch >= 0 ? iBinarySearch : iBinarySearch ^ (-1);
    }

    @Override // flm.guf
    public final int e() {
        return this.e[this.d.length - 1];
    }

    @Override // flm.guf
    public final byte[] f() {
        int i = 0;
        byte[] bArr = new byte[this.e[this.d.length - 1]];
        int length = this.d.length;
        int i2 = 0;
        while (i < length) {
            int i3 = this.e[length + i];
            int i4 = this.e[i];
            System.arraycopy(this.d[i], i3, bArr, i2, i4 - i2);
            i++;
            i2 = i4;
        }
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // flm.guf
    public final void a(guc gucVar) {
        int i = 0;
        int length = this.d.length;
        int i2 = 0;
        while (i < length) {
            int i3 = this.e[length + i];
            int i4 = this.e[i];
            gum gumVar = new gum(this.d[i], i3, (i3 + i4) - i2);
            if (gucVar.b == null) {
                gumVar.g = gumVar;
                gumVar.f = gumVar;
                gucVar.b = gumVar;
            } else {
                gucVar.b.g.a(gumVar);
            }
            i++;
            i2 = i4;
        }
        gucVar.c = ((long) i2) + gucVar.c;
    }

    @Override // flm.guf
    public final boolean a(int i, guf gufVar, int i2, int i3) {
        if (e() - i3 < 0) {
            return false;
        }
        int iB = b(0);
        while (i3 > 0) {
            int i4 = iB == 0 ? 0 : this.e[iB - 1];
            int iMin = Math.min(i3, ((this.e[iB] - i4) + i4) - i);
            if (!gufVar.a(i2, this.d[iB], (i - i4) + this.e[this.d.length + iB], iMin)) {
                return false;
            }
            i += iMin;
            i2 += iMin;
            i3 -= iMin;
            iB++;
        }
        return true;
    }

    @Override // flm.guf
    public final boolean a(int i, byte[] bArr, int i2, int i3) {
        if (i < 0 || i > e() - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        }
        int iB = b(i);
        while (i3 > 0) {
            int i4 = iB == 0 ? 0 : this.e[iB - 1];
            int iMin = Math.min(i3, ((this.e[iB] - i4) + i4) - i);
            if (!gut.a(this.d[iB], (i - i4) + this.e[this.d.length + iB], bArr, i2, iMin)) {
                return false;
            }
            i += iMin;
            i2 += iMin;
            i3 -= iMin;
            iB++;
        }
        return true;
    }

    private final guf g() {
        return new guf(f());
    }

    @Override // flm.guf
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof guf) && ((guf) obj).e() == e() && a(0, (guf) obj, 0, e());
    }

    @Override // flm.guf
    public final int hashCode() {
        int i = this.c;
        if (i == 0) {
            i = 1;
            int length = this.d.length;
            int i2 = 0;
            int i3 = 0;
            while (i2 < length) {
                byte[] bArr = this.d[i2];
                int i4 = this.e[length + i2];
                int i5 = this.e[i2];
                int i6 = (i5 - i3) + i4;
                int i7 = i;
                for (int i8 = i4; i8 < i6; i8++) {
                    i7 = (i7 * 31) + bArr[i8];
                }
                i2++;
                i3 = i5;
                i = i7;
            }
            this.c = i;
        }
        return i;
    }

    @Override // flm.guf
    public final String toString() {
        return g().toString();
    }

    private final Object writeReplace() {
        return g();
    }
}

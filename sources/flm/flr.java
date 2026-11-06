package flm;

import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class flr {
    public static final flr a = new flr(0, new int[0], new Object[0], false);
    public int b;
    public int[] c;
    public Object[] d;
    public int e;
    public boolean f;

    static flr a(flr flrVar, flr flrVar2) {
        int i = flrVar.b + flrVar2.b;
        int[] iArrCopyOf = Arrays.copyOf(flrVar.c, i);
        System.arraycopy(flrVar2.c, 0, iArrCopyOf, flrVar.b, flrVar2.b);
        Object[] objArrCopyOf = Arrays.copyOf(flrVar.d, i);
        System.arraycopy(flrVar2.d, 0, objArrCopyOf, flrVar.b, flrVar2.b);
        return new flr(i, iArrCopyOf, objArrCopyOf, true);
    }

    flr() {
        this(0, new int[8], new Object[8], true);
    }

    private flr(int i, int[] iArr, Object[] objArr, boolean z) {
        this.e = -1;
        this.b = i;
        this.c = iArr;
        this.d = objArr;
        this.f = z;
    }

    public final void a(fmp fmpVar) {
        if (this.b != 0) {
            if (fmpVar.a() == dp.aB) {
                for (int i = 0; i < this.b; i++) {
                    a(this.c[i], this.d[i], fmpVar);
                }
                return;
            }
            for (int i2 = this.b - 1; i2 >= 0; i2--) {
                a(this.c[i2], this.d[i2], fmpVar);
            }
        }
    }

    private static void a(int i, Object obj, fmp fmpVar) {
        int i2 = i >>> 3;
        switch (i & 7) {
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
                fmpVar.a(i2, ((Long) obj).longValue());
                return;
            case 1:
                fmpVar.d(i2, ((Long) obj).longValue());
                return;
            case 2:
                fmpVar.a(i2, (fgy) obj);
                return;
            case 3:
                if (fmpVar.a() == dp.aB) {
                    fmpVar.a(i2);
                    ((flr) obj).a(fmpVar);
                    fmpVar.b(i2);
                    return;
                } else {
                    fmpVar.b(i2);
                    ((flr) obj).a(fmpVar);
                    fmpVar.a(i2);
                    return;
                }
            case 4:
            default:
                throw new RuntimeException(fjg.f());
            case 5:
                fmpVar.d(i2, ((Integer) obj).intValue());
                return;
        }
    }

    public final int a() {
        int iA;
        int i = this.e;
        if (i == -1) {
            i = 0;
            for (int i2 = 0; i2 < this.b; i2++) {
                int i3 = this.c[i2];
                int i4 = i3 >>> 3;
                switch (i3 & 7) {
                    case bbx.MSG_UNBIND_SERVICE /* 0 */:
                        iA = fhp.e(i4, ((Long) this.d[i2]).longValue());
                        break;
                    case 1:
                        iA = fhp.g(i4, ((Long) this.d[i2]).longValue());
                        break;
                    case 2:
                        iA = fhp.c(i4, (fgy) this.d[i2]);
                        break;
                    case 3:
                        iA = ((flr) this.d[i2]).a() + (fhp.f(i4) << 1);
                        break;
                    case 4:
                    default:
                        throw new IllegalStateException(fjg.f());
                    case 5:
                        iA = fhp.i(i4, ((Integer) this.d[i2]).intValue());
                        break;
                }
                i += iA;
            }
            this.e = i;
        }
        return i;
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof flr)) {
            flr flrVar = (flr) obj;
            if (this.b == flrVar.b) {
                int[] iArr = this.c;
                int[] iArr2 = flrVar.c;
                int i = this.b;
                int i2 = 0;
                while (true) {
                    if (i2 >= i) {
                        z = true;
                        break;
                    }
                    if (iArr[i2] != iArr2[i2]) {
                        z = false;
                        break;
                    }
                    i2++;
                }
                if (z) {
                    Object[] objArr = this.d;
                    Object[] objArr2 = flrVar.d;
                    int i3 = this.b;
                    int i4 = 0;
                    while (true) {
                        if (i4 >= i3) {
                            z2 = true;
                            break;
                        }
                        if (!objArr[i4].equals(objArr2[i4])) {
                            z2 = false;
                            break;
                        }
                        i4++;
                    }
                    if (z2) {
                        return true;
                    }
                }
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = 17;
        int i = (this.b + 527) * 31;
        int[] iArr = this.c;
        int i2 = this.b;
        int i3 = 17;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 = (i3 * 31) + iArr[i4];
        }
        int i5 = (i + i3) * 31;
        Object[] objArr = this.d;
        int i6 = this.b;
        for (int i7 = 0; i7 < i6; i7++) {
            iHashCode = (iHashCode * 31) + objArr[i7].hashCode();
        }
        return i5 + iHashCode;
    }

    final void a(int i, Object obj) {
        if (!this.f) {
            throw new UnsupportedOperationException();
        }
        if (this.b == this.c.length) {
            int i2 = (this.b < 4 ? 8 : this.b >> 1) + this.b;
            this.c = Arrays.copyOf(this.c, i2);
            this.d = Arrays.copyOf(this.d, i2);
        }
        this.c[this.b] = i;
        this.d[this.b] = obj;
        this.b++;
    }
}

package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fmx implements Cloneable {
    public static final fmy a = new fmy();
    public int[] b;
    public fmy[] c;
    public int d;
    private boolean e;

    fmx() {
        this(10);
    }

    private fmx(int i) {
        this.e = false;
        int iA = a(i);
        this.b = new int[iA];
        this.c = new fmy[iA];
        this.d = 0;
    }

    public final boolean a() {
        return this.d == 0;
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof fmx)) {
            return false;
        }
        fmx fmxVar = (fmx) obj;
        if (this.d != fmxVar.d) {
            return false;
        }
        int[] iArr = this.b;
        int[] iArr2 = fmxVar.b;
        int i = this.d;
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
            fmy[] fmyVarArr = this.c;
            fmy[] fmyVarArr2 = fmxVar.c;
            int i3 = this.d;
            int i4 = 0;
            while (true) {
                if (i4 >= i3) {
                    z2 = true;
                    break;
                }
                if (!fmyVarArr[i4].equals(fmyVarArr2[i4])) {
                    z2 = false;
                    break;
                }
                i4++;
            }
            if (z2) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = 17;
        for (int i = 0; i < this.d; i++) {
            iHashCode = (((iHashCode * 31) + this.b[i]) * 31) + this.c[i].hashCode();
        }
        return iHashCode;
    }

    final int a(int i) {
        int i2 = i << 2;
        for (int i3 = 4; i3 < 32; i3++) {
            if (i2 <= (1 << i3) - 12) {
                i2 = (1 << i3) - 12;
                break;
            }
        }
        return i2 / 4;
    }

    final int b(int i) {
        int i2 = 0;
        int i3 = this.d - 1;
        while (i2 <= i3) {
            int i4 = (i2 + i3) >>> 1;
            int i5 = this.b[i4];
            if (i5 < i) {
                i2 = i4 + 1;
            } else {
                if (i5 <= i) {
                    return i4;
                }
                i3 = i4 - 1;
            }
        }
        return i2 ^ (-1);
    }

    public final /* synthetic */ Object clone() {
        int i = this.d;
        fmx fmxVar = new fmx(i);
        System.arraycopy(this.b, 0, fmxVar.b, 0, i);
        for (int i2 = 0; i2 < i; i2++) {
            if (this.c[i2] != null) {
                fmxVar.c[i2] = (fmy) this.c[i2].clone();
            }
        }
        fmxVar.d = i;
        return fmxVar;
    }
}

package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ahx {
    public int a = 0;
    private int b;
    private int c;
    private int d;
    private int e;

    ahx() {
    }

    final void a(int i, int i2, int i3, int i4) {
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
    }

    final void a(int i) {
        this.a |= i;
    }

    private static int a(int i, int i2) {
        if (i > i2) {
            return 1;
        }
        if (i == i2) {
            return 2;
        }
        return 4;
    }

    final boolean a() {
        if ((this.a & 7) != 0 && (this.a & a(this.d, this.b)) == 0) {
            return false;
        }
        if ((this.a & 112) != 0 && (this.a & (a(this.d, this.c) << 4)) == 0) {
            return false;
        }
        if ((this.a & 1792) == 0 || (this.a & (a(this.e, this.b) << 8)) != 0) {
            return (this.a & 28672) == 0 || (this.a & (a(this.e, this.c) << 12)) != 0;
        }
        return false;
    }
}

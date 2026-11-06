package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class acx {
    private long a = 0;
    private acx b;

    acx() {
    }

    public final void a(int i) {
        if (i >= 64) {
            b();
            this.b.a(i - 64);
        } else {
            this.a |= 1 << i;
        }
    }

    private final void b() {
        if (this.b == null) {
            this.b = new acx();
        }
    }

    final void b(int i) {
        if (i >= 64) {
            if (this.b != null) {
                this.b.b(i - 64);
                return;
            }
            return;
        }
        this.a &= (1 << i) ^ (-1);
    }

    final boolean c(int i) {
        while (i >= 64) {
            this.b();
            this = this.b;
            i -= 64;
        }
        return (this.a & (1 << i)) != 0;
    }

    public final void a() {
        while (true) {
            this.a = 0L;
            if (this.b != null) {
                this = this.b;
            } else {
                return;
            }
        }
    }

    final void a(int i, boolean z) {
        while (i < 64) {
            boolean z2 = (this.a & Long.MIN_VALUE) != 0;
            long j = (1 << i) - 1;
            this.a = (((j ^ (-1)) & this.a) << 1) | (this.a & j);
            if (z) {
                this.a(i);
            } else {
                this.b(i);
            }
            if (z2 || this.b != null) {
                this.b();
                this = this.b;
                i = 0;
                z = z2;
            } else {
                return;
            }
        }
        this.b();
        this.b.a(i - 64, z);
    }

    final boolean d(int i) {
        while (i >= 64) {
            this.b();
            this = this.b;
            i -= 64;
        }
        long j = 1 << i;
        boolean z = (this.a & j) != 0;
        this.a &= j ^ (-1);
        long j2 = j - 1;
        this.a = Long.rotateRight((j2 ^ (-1)) & this.a, 1) | (this.a & j2);
        if (this.b != null) {
            if (this.b.c(0)) {
                this.a(63);
            }
            this.b.d(0);
        }
        return z;
    }

    final int e(int i) {
        if (this.b == null) {
            if (i >= 64) {
                return Long.bitCount(this.a);
            }
            return Long.bitCount(this.a & ((1 << i) - 1));
        }
        if (i < 64) {
            return Long.bitCount(this.a & ((1 << i) - 1));
        }
        return this.b.e(i - 64) + Long.bitCount(this.a);
    }

    public final String toString() {
        return this.b == null ? Long.toBinaryString(this.a) : this.b.toString() + "xx" + Long.toBinaryString(this.a);
    }
}

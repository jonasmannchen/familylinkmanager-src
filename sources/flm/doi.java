package flm;

import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class doi {
    public static final int[] a = {5, 11, 23, 47, 97, 197, 397, 797, 1597, 3203, 6421, 12853, 25717, 51437, 102877, 205759, 411527, 823117, 1646237, 3292489, 6584983, 13169977, 26339969, 52679969, 105359939, 210719881, 421439783, 842879579, 1685759167, 2147483629};
    public final int b;
    public int[] c;
    public int[] d;
    private int e;
    private int f;

    static int a(int i) {
        return (i << 1) - (i << 8);
    }

    public doi() {
        this(-1);
    }

    private doi(int i) {
        this.b = -1;
        a();
    }

    public final void a() {
        this.e = 0;
        this.c = new int[a[this.e]];
        this.d = new int[a[this.e]];
        Arrays.fill(this.d, this.b);
    }

    public final int a(int i, int i2) {
        dse.a(i2 != this.b, "Cannot add emptyValue to map");
        int iD = d(i);
        if (this.d[iD] == this.b) {
            this.c[iD] = i;
            this.f++;
            this.d[iD] = i2;
            if (this.f > this.c.length / 2) {
                if (this.e < a.length - 1) {
                    int[] iArr = this.c;
                    int[] iArr2 = this.d;
                    this.e++;
                    this.c = new int[a[this.e]];
                    this.d = new int[a[this.e]];
                    Arrays.fill(this.d, this.b);
                    int i3 = this.f;
                    int length = iArr.length;
                    this.f = 0;
                    for (int i4 = 0; i4 < length; i4++) {
                        if (iArr2[i4] != this.b) {
                            a(iArr[i4], iArr2[i4]);
                        }
                    }
                    dse.b(i3 == this.f);
                } else {
                    throw new IllegalStateException("Too many items, you'd better use array map instead.");
                }
            }
            return this.b;
        }
        return this.d[iD];
    }

    public final int b(int i) {
        return this.d[d(i)];
    }

    private final int d(int i) {
        int length = this.c.length;
        int iA = (a(i) & Integer.MAX_VALUE) % length;
        while (this.d[iA] != this.b && this.c[iA] != i) {
            iA++;
            if (iA >= length) {
                iA = 0;
            }
        }
        return iA;
    }

    public final boolean c(int i) {
        return b(i) != this.b;
    }
}

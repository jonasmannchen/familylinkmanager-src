package flm;

import android.util.SparseIntArray;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class aeh {
    public final SparseIntArray a = new SparseIntArray();
    private boolean b = false;

    public abstract int a();

    public int a(int i, int i2) {
        a();
        if (1 == i2) {
            return 0;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            a();
            i3++;
            if (i3 == i2) {
                i3 = 0;
            } else if (i3 > i2) {
                i3 = 1;
            }
        }
        if (i3 + 1 <= i2) {
            return i3;
        }
        return 0;
    }

    public final int b(int i, int i2) {
        a();
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            a();
            i4++;
            if (i4 == i2) {
                i3++;
                i4 = 0;
            } else if (i4 > i2) {
                i4 = 1;
                i3++;
            }
        }
        if (i4 + 1 > i2) {
            return i3 + 1;
        }
        return i3;
    }
}

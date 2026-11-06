package flm;

import android.util.SparseArray;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class agd {
    public SparseArray a = new SparseArray();
    public int b = 0;

    static long a(long j, long j2) {
        return j == 0 ? j2 : ((j / 4) * 3) + (j2 / 4);
    }

    final age a(int i) {
        age ageVar = (age) this.a.get(i);
        if (ageVar == null) {
            age ageVar2 = new age();
            this.a.put(i, ageVar2);
            return ageVar2;
        }
        return ageVar;
    }
}

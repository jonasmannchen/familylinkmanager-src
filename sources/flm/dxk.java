package flm;

import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class dxk {
    static int a(int i, int i2) {
        if (i2 < 0) {
            throw new AssertionError("cannot store more than MAX_VALUE elements");
        }
        int iHighestOneBit = (i >> 1) + i + 1;
        if (iHighestOneBit < i2) {
            iHighestOneBit = Integer.highestOneBit(i2 - 1) << 1;
        }
        if (iHighestOneBit < 0) {
            return Integer.MAX_VALUE;
        }
        return iHighestOneBit;
    }

    public abstract dxk b(Object obj);

    dxk() {
    }

    public dxk a(Object... objArr) {
        for (Object obj : objArr) {
            b(obj);
        }
        return this;
    }

    public dxk a(Iterator it) {
        while (it.hasNext()) {
            b(it.next());
        }
        return this;
    }
}

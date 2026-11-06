package flm;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dyi implements Serializable {
    public static final long serialVersionUID = 0;
    private final Comparator a;
    private final Object[] b;

    public dyi(Comparator comparator, Object[] objArr) {
        this.a = comparator;
        this.b = objArr;
    }

    final Object readResolve() {
        eab eabVar;
        int i;
        dyh dyhVar = (dyh) new dyh(this.a).a(this.b);
        Object[] objArr = dyhVar.a;
        Comparator comparator = dyhVar.d;
        int i2 = dyhVar.b;
        if (i2 == 0) {
            eabVar = dyg.a(comparator);
        } else {
            dzn.a(objArr, i2);
            Arrays.sort(objArr, 0, i2, comparator);
            int i3 = 1;
            int i4 = 1;
            while (i3 < i2) {
                Object obj = objArr[i3];
                if (comparator.compare(obj, objArr[i4 - 1]) != 0) {
                    i = i4 + 1;
                    objArr[i4] = obj;
                } else {
                    i = i4;
                }
                i3++;
                i4 = i;
            }
            Arrays.fill(objArr, i4, i2, (Object) null);
            eabVar = new eab(dxm.b(i4 < objArr.length / 2 ? Arrays.copyOf(objArr, i4) : objArr, i4), comparator);
        }
        dyhVar.b = eabVar.size();
        dyhVar.c = true;
        return eabVar;
    }
}

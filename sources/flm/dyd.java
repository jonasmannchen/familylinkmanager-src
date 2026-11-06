package flm;

import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dyd extends dxt {
    private transient Object[] d;
    private transient Object[] e;
    private final Comparator f;

    public dyd(Comparator comparator) {
        this(comparator, 4);
    }

    private dyd(Comparator comparator, int i) {
        this.f = (Comparator) dvl.a(comparator);
        this.d = new Object[4];
        this.e = new Object[4];
    }

    @Override // flm.dxt
    public final /* synthetic */ dxs a() {
        switch (this.b) {
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
                return dya.a(this.f);
            case 1:
                return new dya(new eab(dxm.a(this.d[0]), (Comparator) dvl.a(this.f)), dxm.a(this.e[0]));
            default:
                Object[] objArrCopyOf = Arrays.copyOf(this.d, this.b);
                Arrays.sort(objArrCopyOf, this.f);
                Object[] objArr = new Object[this.b];
                for (int i = 0; i < this.b; i++) {
                    if (i > 0 && this.f.compare(objArrCopyOf[i - 1], objArrCopyOf[i]) == 0) {
                        String strValueOf = String.valueOf(objArrCopyOf[i - 1]);
                        String strValueOf2 = String.valueOf(objArrCopyOf[i]);
                        throw new IllegalArgumentException(new StringBuilder(String.valueOf(strValueOf).length() + 57 + String.valueOf(strValueOf2).length()).append("keys required to be distinct but compared as equal: ").append(strValueOf).append(" and ").append(strValueOf2).toString());
                    }
                    objArr[Arrays.binarySearch(objArrCopyOf, this.d[i], this.f)] = this.e[i];
                }
                return new dya(new eab(dxm.b(objArrCopyOf), this.f), dxm.b(objArr));
        }
    }

    @Override // flm.dxt
    public final /* synthetic */ dxt a(Object obj, Object obj2) {
        int i = this.b + 1;
        if (i > this.d.length) {
            int iA = dxk.a(this.d.length, i);
            this.d = Arrays.copyOf(this.d, iA);
            this.e = Arrays.copyOf(this.e, iA);
        }
        dwq.a(obj, obj2);
        this.d[this.b] = obj;
        this.e[this.b] = obj2;
        this.b++;
        return this;
    }
}

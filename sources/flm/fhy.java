package flm;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class fhy extends fgr implements fix, fkp, RandomAccess {
    private static final fhy b;
    private double[] c;
    private int d;

    fhy() {
        this(new double[10], 0);
    }

    private fhy(double[] dArr, int i) {
        this.c = dArr;
        this.d = i;
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        c();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        System.arraycopy(this.c, i2, this.c, i, this.d - i2);
        this.d -= i2 - i;
        this.modCount++;
    }

    @Override // flm.fgr, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fhy)) {
            return super.equals(obj);
        }
        fhy fhyVar = (fhy) obj;
        if (this.d != fhyVar.d) {
            return false;
        }
        double[] dArr = fhyVar.c;
        for (int i = 0; i < this.d; i++) {
            if (Double.doubleToLongBits(this.c[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // flm.fgr, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iA = 1;
        for (int i = 0; i < this.d; i++) {
            iA = (iA * 31) + fiv.a(Double.doubleToLongBits(this.c[i]));
        }
        return iA;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }

    public final void a(double d) {
        a(this.d, d);
    }

    private final void a(int i, double d) {
        c();
        if (i < 0 || i > this.d) {
            throw new IndexOutOfBoundsException(c(i));
        }
        if (this.d < this.c.length) {
            System.arraycopy(this.c, i, this.c, i + 1, this.d - i);
        } else {
            double[] dArr = new double[((this.d * 3) / 2) + 1];
            System.arraycopy(this.c, 0, dArr, 0, i);
            System.arraycopy(this.c, i, dArr, i + 1, this.d - i);
            this.c = dArr;
        }
        this.c[i] = d;
        this.d++;
        this.modCount++;
    }

    @Override // flm.fgr, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        c();
        fiv.a(collection);
        if (!(collection instanceof fhy)) {
            return super.addAll(collection);
        }
        fhy fhyVar = (fhy) collection;
        if (fhyVar.d == 0) {
            return false;
        }
        if (Integer.MAX_VALUE - this.d < fhyVar.d) {
            throw new OutOfMemoryError();
        }
        int i = this.d + fhyVar.d;
        if (i > this.c.length) {
            this.c = Arrays.copyOf(this.c, i);
        }
        System.arraycopy(fhyVar.c, 0, this.c, this.d, fhyVar.d);
        this.d = i;
        this.modCount++;
        return true;
    }

    @Override // flm.fgr, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        c();
        for (int i = 0; i < this.d; i++) {
            if (obj.equals(Double.valueOf(this.c[i]))) {
                System.arraycopy(this.c, i + 1, this.c, i, this.d - i);
                this.d--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    private final void b(int i) {
        if (i < 0 || i >= this.d) {
            throw new IndexOutOfBoundsException(c(i));
        }
    }

    private final String c(int i) {
        return new StringBuilder(35).append("Index:").append(i).append(", Size:").append(this.d).toString();
    }

    @Override // flm.fgr, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i, Object obj) {
        double dDoubleValue = ((Double) obj).doubleValue();
        c();
        b(i);
        double d = this.c[i];
        this.c[i] = dDoubleValue;
        return Double.valueOf(d);
    }

    @Override // flm.fgr, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i) {
        c();
        b(i);
        double d = this.c[i];
        if (i < this.d - 1) {
            System.arraycopy(this.c, i + 1, this.c, i, this.d - i);
        }
        this.d--;
        this.modCount++;
        return Double.valueOf(d);
    }

    @Override // flm.fgr, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        a(i, ((Double) obj).doubleValue());
    }

    @Override // flm.fjf
    public final /* synthetic */ fjf a(int i) {
        if (i < this.d) {
            throw new IllegalArgumentException();
        }
        return new fhy(Arrays.copyOf(this.c, i), this.d);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        b(i);
        return Double.valueOf(this.c[i]);
    }

    static {
        fhy fhyVar = new fhy();
        b = fhyVar;
        fhyVar.a = false;
    }
}

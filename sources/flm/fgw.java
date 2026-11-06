package flm;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class fgw extends fgr implements fiw, fkp, RandomAccess {
    private static final fgw b;
    private boolean[] c;
    private int d;

    fgw() {
        this(new boolean[10], 0);
    }

    private fgw(boolean[] zArr, int i) {
        this.c = zArr;
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
        if (!(obj instanceof fgw)) {
            return super.equals(obj);
        }
        fgw fgwVar = (fgw) obj;
        if (this.d != fgwVar.d) {
            return false;
        }
        boolean[] zArr = fgwVar.c;
        for (int i = 0; i < this.d; i++) {
            if (this.c[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // flm.fgr, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iA = 1;
        for (int i = 0; i < this.d; i++) {
            iA = (iA * 31) + fiv.a(this.c[i]);
        }
        return iA;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }

    public final void a(boolean z) {
        a(this.d, z);
    }

    private final void a(int i, boolean z) {
        c();
        if (i < 0 || i > this.d) {
            throw new IndexOutOfBoundsException(c(i));
        }
        if (this.d < this.c.length) {
            System.arraycopy(this.c, i, this.c, i + 1, this.d - i);
        } else {
            boolean[] zArr = new boolean[((this.d * 3) / 2) + 1];
            System.arraycopy(this.c, 0, zArr, 0, i);
            System.arraycopy(this.c, i, zArr, i + 1, this.d - i);
            this.c = zArr;
        }
        this.c[i] = z;
        this.d++;
        this.modCount++;
    }

    @Override // flm.fgr, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        c();
        fiv.a(collection);
        if (!(collection instanceof fgw)) {
            return super.addAll(collection);
        }
        fgw fgwVar = (fgw) collection;
        if (fgwVar.d == 0) {
            return false;
        }
        if (Integer.MAX_VALUE - this.d < fgwVar.d) {
            throw new OutOfMemoryError();
        }
        int i = this.d + fgwVar.d;
        if (i > this.c.length) {
            this.c = Arrays.copyOf(this.c, i);
        }
        System.arraycopy(fgwVar.c, 0, this.c, this.d, fgwVar.d);
        this.d = i;
        this.modCount++;
        return true;
    }

    @Override // flm.fgr, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        c();
        for (int i = 0; i < this.d; i++) {
            if (obj.equals(Boolean.valueOf(this.c[i]))) {
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
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        c();
        b(i);
        boolean z = this.c[i];
        this.c[i] = zBooleanValue;
        return Boolean.valueOf(z);
    }

    @Override // flm.fgr, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i) {
        c();
        b(i);
        boolean z = this.c[i];
        if (i < this.d - 1) {
            System.arraycopy(this.c, i + 1, this.c, i, this.d - i);
        }
        this.d--;
        this.modCount++;
        return Boolean.valueOf(z);
    }

    @Override // flm.fgr, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        a(i, ((Boolean) obj).booleanValue());
    }

    @Override // flm.fjf
    public final /* synthetic */ fjf a(int i) {
        if (i < this.d) {
            throw new IllegalArgumentException();
        }
        return new fgw(Arrays.copyOf(this.c, i), this.d);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        b(i);
        return Boolean.valueOf(this.c[i]);
    }

    static {
        fgw fgwVar = new fgw();
        b = fgwVar;
        fgwVar.a = false;
    }
}

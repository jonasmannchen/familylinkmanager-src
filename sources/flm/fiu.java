package flm;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fiu extends fgr implements fjb, fkp, RandomAccess {
    public static final fiu b;
    private int[] c;
    private int d;

    fiu() {
        this(new int[10], 0);
    }

    private fiu(int[] iArr, int i) {
        this.c = iArr;
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
        if (!(obj instanceof fiu)) {
            return super.equals(obj);
        }
        fiu fiuVar = (fiu) obj;
        if (this.d != fiuVar.d) {
            return false;
        }
        int[] iArr = fiuVar.c;
        for (int i = 0; i < this.d; i++) {
            if (this.c[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // flm.fgr, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.d; i2++) {
            i = (i * 31) + this.c[i2];
        }
        return i;
    }

    @Override // flm.fjf
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final fjb a(int i) {
        if (i < this.d) {
            throw new IllegalArgumentException();
        }
        return new fiu(Arrays.copyOf(this.c, i), this.d);
    }

    public final int c(int i) {
        e(i);
        return this.c[i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }

    @Override // flm.fjb
    public final void d(int i) {
        a(this.d, i);
    }

    private final void a(int i, int i2) {
        c();
        if (i < 0 || i > this.d) {
            throw new IndexOutOfBoundsException(f(i));
        }
        if (this.d < this.c.length) {
            System.arraycopy(this.c, i, this.c, i + 1, this.d - i);
        } else {
            int[] iArr = new int[((this.d * 3) / 2) + 1];
            System.arraycopy(this.c, 0, iArr, 0, i);
            System.arraycopy(this.c, i, iArr, i + 1, this.d - i);
            this.c = iArr;
        }
        this.c[i] = i2;
        this.d++;
        this.modCount++;
    }

    @Override // flm.fgr, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        c();
        fiv.a(collection);
        if (!(collection instanceof fiu)) {
            return super.addAll(collection);
        }
        fiu fiuVar = (fiu) collection;
        if (fiuVar.d == 0) {
            return false;
        }
        if (Integer.MAX_VALUE - this.d < fiuVar.d) {
            throw new OutOfMemoryError();
        }
        int i = this.d + fiuVar.d;
        if (i > this.c.length) {
            this.c = Arrays.copyOf(this.c, i);
        }
        System.arraycopy(fiuVar.c, 0, this.c, this.d, fiuVar.d);
        this.d = i;
        this.modCount++;
        return true;
    }

    @Override // flm.fgr, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        c();
        for (int i = 0; i < this.d; i++) {
            if (obj.equals(Integer.valueOf(this.c[i]))) {
                System.arraycopy(this.c, i + 1, this.c, i, this.d - i);
                this.d--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    private final void e(int i) {
        if (i < 0 || i >= this.d) {
            throw new IndexOutOfBoundsException(f(i));
        }
    }

    private final String f(int i) {
        return new StringBuilder(35).append("Index:").append(i).append(", Size:").append(this.d).toString();
    }

    @Override // flm.fgr, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        c();
        e(i);
        int i2 = this.c[i];
        this.c[i] = iIntValue;
        return Integer.valueOf(i2);
    }

    @Override // flm.fgr, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i) {
        c();
        e(i);
        int i2 = this.c[i];
        if (i < this.d - 1) {
            System.arraycopy(this.c, i + 1, this.c, i, this.d - i);
        }
        this.d--;
        this.modCount++;
        return Integer.valueOf(i2);
    }

    @Override // flm.fgr, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        a(i, ((Integer) obj).intValue());
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        return Integer.valueOf(c(i));
    }

    static {
        fiu fiuVar = new fiu();
        b = fiuVar;
        fiuVar.a = false;
    }
}

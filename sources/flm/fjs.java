package flm;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fjs extends fgr implements fje, fkp, RandomAccess {
    public static final fjs b;
    private long[] c;
    private int d;

    fjs() {
        this(new long[10], 0);
    }

    private fjs(long[] jArr, int i) {
        this.c = jArr;
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
        if (!(obj instanceof fjs)) {
            return super.equals(obj);
        }
        fjs fjsVar = (fjs) obj;
        if (this.d != fjsVar.d) {
            return false;
        }
        long[] jArr = fjsVar.c;
        for (int i = 0; i < this.d; i++) {
            if (this.c[i] != jArr[i]) {
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

    @Override // flm.fjf
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final fje a(int i) {
        if (i < this.d) {
            throw new IllegalArgumentException();
        }
        return new fjs(Arrays.copyOf(this.c, i), this.d);
    }

    public final long c(int i) {
        d(i);
        return this.c[i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }

    @Override // flm.fje
    public final void a(long j) {
        a(this.d, j);
    }

    private final void a(int i, long j) {
        c();
        if (i < 0 || i > this.d) {
            throw new IndexOutOfBoundsException(e(i));
        }
        if (this.d < this.c.length) {
            System.arraycopy(this.c, i, this.c, i + 1, this.d - i);
        } else {
            long[] jArr = new long[((this.d * 3) / 2) + 1];
            System.arraycopy(this.c, 0, jArr, 0, i);
            System.arraycopy(this.c, i, jArr, i + 1, this.d - i);
            this.c = jArr;
        }
        this.c[i] = j;
        this.d++;
        this.modCount++;
    }

    @Override // flm.fgr, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        c();
        fiv.a(collection);
        if (!(collection instanceof fjs)) {
            return super.addAll(collection);
        }
        fjs fjsVar = (fjs) collection;
        if (fjsVar.d == 0) {
            return false;
        }
        if (Integer.MAX_VALUE - this.d < fjsVar.d) {
            throw new OutOfMemoryError();
        }
        int i = this.d + fjsVar.d;
        if (i > this.c.length) {
            this.c = Arrays.copyOf(this.c, i);
        }
        System.arraycopy(fjsVar.c, 0, this.c, this.d, fjsVar.d);
        this.d = i;
        this.modCount++;
        return true;
    }

    @Override // flm.fgr, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        c();
        for (int i = 0; i < this.d; i++) {
            if (obj.equals(Long.valueOf(this.c[i]))) {
                System.arraycopy(this.c, i + 1, this.c, i, this.d - i);
                this.d--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    private final void d(int i) {
        if (i < 0 || i >= this.d) {
            throw new IndexOutOfBoundsException(e(i));
        }
    }

    private final String e(int i) {
        return new StringBuilder(35).append("Index:").append(i).append(", Size:").append(this.d).toString();
    }

    @Override // flm.fgr, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i, Object obj) {
        long jLongValue = ((Long) obj).longValue();
        c();
        d(i);
        long j = this.c[i];
        this.c[i] = jLongValue;
        return Long.valueOf(j);
    }

    @Override // flm.fgr, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i) {
        c();
        d(i);
        long j = this.c[i];
        if (i < this.d - 1) {
            System.arraycopy(this.c, i + 1, this.c, i, this.d - i);
        }
        this.d--;
        this.modCount++;
        return Long.valueOf(j);
    }

    @Override // flm.fgr, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        a(i, ((Long) obj).longValue());
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        return Long.valueOf(c(i));
    }

    static {
        fjs fjsVar = new fjs();
        b = fjsVar;
        fjsVar.a = false;
    }
}

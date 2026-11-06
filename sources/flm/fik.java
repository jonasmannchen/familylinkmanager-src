package flm;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class fik extends fgr implements fja, fkp, RandomAccess {
    private static final fik b;
    private float[] c;
    private int d;

    fik() {
        this(new float[10], 0);
    }

    private fik(float[] fArr, int i) {
        this.c = fArr;
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
        if (!(obj instanceof fik)) {
            return super.equals(obj);
        }
        fik fikVar = (fik) obj;
        if (this.d != fikVar.d) {
            return false;
        }
        float[] fArr = fikVar.c;
        for (int i = 0; i < this.d; i++) {
            if (Float.floatToIntBits(this.c[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // flm.fgr, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iFloatToIntBits = 1;
        for (int i = 0; i < this.d; i++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.c[i]);
        }
        return iFloatToIntBits;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }

    public final void a(float f) {
        a(this.d, f);
    }

    private final void a(int i, float f) {
        c();
        if (i < 0 || i > this.d) {
            throw new IndexOutOfBoundsException(c(i));
        }
        if (this.d < this.c.length) {
            System.arraycopy(this.c, i, this.c, i + 1, this.d - i);
        } else {
            float[] fArr = new float[((this.d * 3) / 2) + 1];
            System.arraycopy(this.c, 0, fArr, 0, i);
            System.arraycopy(this.c, i, fArr, i + 1, this.d - i);
            this.c = fArr;
        }
        this.c[i] = f;
        this.d++;
        this.modCount++;
    }

    @Override // flm.fgr, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        c();
        fiv.a(collection);
        if (!(collection instanceof fik)) {
            return super.addAll(collection);
        }
        fik fikVar = (fik) collection;
        if (fikVar.d == 0) {
            return false;
        }
        if (Integer.MAX_VALUE - this.d < fikVar.d) {
            throw new OutOfMemoryError();
        }
        int i = this.d + fikVar.d;
        if (i > this.c.length) {
            this.c = Arrays.copyOf(this.c, i);
        }
        System.arraycopy(fikVar.c, 0, this.c, this.d, fikVar.d);
        this.d = i;
        this.modCount++;
        return true;
    }

    @Override // flm.fgr, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        c();
        for (int i = 0; i < this.d; i++) {
            if (obj.equals(Float.valueOf(this.c[i]))) {
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
        float fFloatValue = ((Float) obj).floatValue();
        c();
        b(i);
        float f = this.c[i];
        this.c[i] = fFloatValue;
        return Float.valueOf(f);
    }

    @Override // flm.fgr, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i) {
        c();
        b(i);
        float f = this.c[i];
        if (i < this.d - 1) {
            System.arraycopy(this.c, i + 1, this.c, i, this.d - i);
        }
        this.d--;
        this.modCount++;
        return Float.valueOf(f);
    }

    @Override // flm.fgr, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        a(i, ((Float) obj).floatValue());
    }

    @Override // flm.fjf
    public final /* synthetic */ fjf a(int i) {
        if (i < this.d) {
            throw new IllegalArgumentException();
        }
        return new fik(Arrays.copyOf(this.c, i), this.d);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        b(i);
        return Float.valueOf(this.c[i]);
    }

    static {
        fik fikVar = new fik();
        b = fikVar;
        fikVar.a = false;
    }
}

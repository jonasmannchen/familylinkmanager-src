package flm;

import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class eaa extends dxx {
    public static final eaa a = new eaa(new Object[0], 0, null, 0, 0);
    private final transient Object[] b;
    private final transient Object[] c;
    private final transient int d;
    private final transient int e;
    private final transient int f;

    eaa(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        this.b = objArr;
        this.c = objArr2;
        this.d = i2;
        this.e = i;
        this.f = i3;
    }

    @Override // flm.dxi, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        Object[] objArr = this.c;
        if (obj == null || objArr == null) {
            return false;
        }
        int iA = dxe.a(obj == null ? 0 : obj.hashCode());
        while (true) {
            int i = iA & this.d;
            Object obj2 = objArr[i];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            iA = i + 1;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f;
    }

    @Override // flm.dxi
    /* JADX INFO: renamed from: a */
    public final eau iterator() {
        return (eau) e().iterator();
    }

    @Override // flm.dxi
    final Object[] b() {
        return this.b;
    }

    @Override // flm.dxi
    final int c() {
        return 0;
    }

    @Override // flm.dxi
    final int d() {
        return this.f;
    }

    @Override // flm.dxi
    final int a(Object[] objArr, int i) {
        System.arraycopy(this.b, 0, objArr, i, this.f);
        return this.f + i;
    }

    @Override // flm.dxx
    final dxm i() {
        return dxm.b(this.b, this.f);
    }

    @Override // flm.dxi
    final boolean f() {
        return false;
    }

    @Override // flm.dxx, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.e;
    }

    @Override // flm.dxx
    final boolean h() {
        return true;
    }

    @Override // flm.dxx, flm.dxi, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return iterator();
    }
}

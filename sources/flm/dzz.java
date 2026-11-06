package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dzz extends dxm {
    private final transient Object[] a;
    private final transient int b;
    private final transient int c;

    dzz(Object[] objArr, int i, int i2) {
        this.a = objArr;
        this.b = i;
        this.c = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        dvl.a(i, this.c);
        return this.a[(i * 2) + this.b];
    }

    @Override // flm.dxi
    final boolean f() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c;
    }
}

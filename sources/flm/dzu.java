package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dzu extends dxm {
    public static final dxm a = new dzu(new Object[0], 0);
    private final transient Object[] b;
    private final transient int c;

    dzu(Object[] objArr, int i) {
        this.b = objArr;
        this.c = i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c;
    }

    @Override // flm.dxi
    final boolean f() {
        return false;
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
        return this.c;
    }

    @Override // flm.dxm, flm.dxi
    final int a(Object[] objArr, int i) {
        System.arraycopy(this.b, 0, objArr, i, this.c);
        return this.c + i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        dvl.a(i, this.c);
        return this.b[i];
    }
}

package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dzt extends dxf {
    public static final dzt a = new dzt();
    private final transient int[] b;
    private final transient Object[] c;
    private final transient int d;
    private final transient int e;
    private final transient dzt f;

    private dzt() {
        this.b = null;
        this.c = new Object[0];
        this.d = 0;
        this.e = 0;
        this.f = this;
    }

    dzt(Object[] objArr, int i) {
        this.c = objArr;
        this.e = i;
        this.d = 0;
        int iA = i >= 2 ? dxx.a(i) : 0;
        this.b = dzv.a(objArr, i, iA, 0);
        this.f = new dzt(dzv.a(objArr, i, iA, 1), objArr, i, this);
    }

    private dzt(int[] iArr, Object[] objArr, int i, dzt dztVar) {
        this.b = iArr;
        this.c = objArr;
        this.d = 1;
        this.e = i;
        this.f = dztVar;
    }

    @Override // java.util.Map
    public final int size() {
        return this.e;
    }

    @Override // flm.dxf
    public final dxf a() {
        return this.f;
    }

    @Override // flm.dxs, java.util.Map
    public final Object get(Object obj) {
        return dzv.a(this.b, this.c, this.e, this.d, obj);
    }

    @Override // flm.dxs
    final dxx e() {
        return new dzw(this, this.c, this.d, this.e);
    }

    @Override // flm.dxs
    final dxx g() {
        return new dzy(this, new dzz(this.c, this.d, this.e));
    }

    @Override // flm.dxs
    final boolean h() {
        return false;
    }
}

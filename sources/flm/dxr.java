package flm;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dxr extends dxm {
    private final transient int a;
    private final transient int b;
    private final /* synthetic */ dxm c;

    dxr(dxm dxmVar, int i, int i2) {
        this.c = dxmVar;
        this.a = i;
        this.b = i2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.b;
    }

    @Override // flm.dxi
    final Object[] b() {
        return this.c.b();
    }

    @Override // flm.dxi
    final int c() {
        return this.c.c() + this.a;
    }

    @Override // flm.dxi
    final int d() {
        return this.c.c() + this.a + this.b;
    }

    @Override // java.util.List
    public final Object get(int i) {
        dvl.a(i, this.b);
        return this.c.get(this.a + i);
    }

    @Override // flm.dxm
    /* JADX INFO: renamed from: a */
    public final dxm subList(int i, int i2) {
        dvl.a(i, i2, this.b);
        return (dxm) this.c.subList(this.a + i, this.a + i2);
    }

    @Override // flm.dxi
    final boolean f() {
        return true;
    }

    @Override // flm.dxm, java.util.List
    public final /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }
}

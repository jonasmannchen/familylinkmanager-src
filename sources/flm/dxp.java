package flm;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dxp extends dxm {
    private final transient dxm a;

    dxp(dxm dxmVar) {
        this.a = dxmVar;
    }

    private final int a(int i) {
        return (size() - 1) - i;
    }

    @Override // flm.dxm
    public final dxm h() {
        return this.a;
    }

    @Override // flm.dxm, flm.dxi, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.a.contains(obj);
    }

    @Override // flm.dxm, java.util.List
    public final int indexOf(Object obj) {
        int iLastIndexOf = this.a.lastIndexOf(obj);
        if (iLastIndexOf >= 0) {
            return a(iLastIndexOf);
        }
        return -1;
    }

    @Override // flm.dxm, java.util.List
    public final int lastIndexOf(Object obj) {
        int iIndexOf = this.a.indexOf(obj);
        if (iIndexOf >= 0) {
            return a(iIndexOf);
        }
        return -1;
    }

    @Override // flm.dxm
    /* JADX INFO: renamed from: a */
    public final dxm subList(int i, int i2) {
        dvl.a(i, i2, size());
        return ((dxm) this.a.subList(size() - i2, size() - i)).h();
    }

    @Override // java.util.List
    public final Object get(int i) {
        dvl.a(i, size());
        return this.a.get(a(i));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.size();
    }

    @Override // flm.dxi
    final boolean f() {
        return this.a.f();
    }

    @Override // flm.dxm, java.util.List
    public final /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }
}

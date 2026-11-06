package flm;

import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dzy extends dxx {
    private final transient dxs a;
    private final transient dxm b;

    dzy(dxs dxsVar, dxm dxmVar) {
        this.a = dxsVar;
        this.b = dxmVar;
    }

    @Override // flm.dxi
    /* JADX INFO: renamed from: a */
    public final eau iterator() {
        return (eau) e().iterator();
    }

    @Override // flm.dxi
    final int a(Object[] objArr, int i) {
        return e().a(objArr, i);
    }

    @Override // flm.dxx, flm.dxi
    public final dxm e() {
        return this.b;
    }

    @Override // flm.dxi, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.a.get(obj) != null;
    }

    @Override // flm.dxi
    final boolean f() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.size();
    }

    @Override // flm.dxx, flm.dxi, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return iterator();
    }
}

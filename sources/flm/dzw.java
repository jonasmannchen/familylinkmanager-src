package flm;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dzw extends dxx {
    public final transient Object[] a;
    public final transient int b;
    public final transient int c;
    private final transient dxs d;

    dzw(dxs dxsVar, Object[] objArr, int i, int i2) {
        this.d = dxsVar;
        this.a = objArr;
        this.b = i;
        this.c = i2;
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

    @Override // flm.dxx
    final dxm i() {
        return new dzx(this);
    }

    @Override // flm.dxi, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Object value = entry.getValue();
        return value != null && value.equals(this.d.get(key));
    }

    @Override // flm.dxi
    final boolean f() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.c;
    }

    @Override // flm.dxx, flm.dxi, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return iterator();
    }
}

package flm;

import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
abstract class dxv extends dxx {
    dxv() {
    }

    abstract dxs g();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return g().size();
    }

    @Override // flm.dxi, java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object obj2 = g().get(entry.getKey());
        return obj2 != null && obj2.equals(entry.getValue());
    }

    @Override // flm.dxi
    final boolean f() {
        return g().h();
    }

    @Override // flm.dxx
    final boolean h() {
        g();
        return false;
    }

    @Override // flm.dxx, java.util.Collection, java.util.Set
    public int hashCode() {
        return g().hashCode();
    }

    @Override // flm.dxx, flm.dxi
    Object writeReplace() {
        return new dxw(g());
    }
}

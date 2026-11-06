package flm;

import java.io.Serializable;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class dxs implements Serializable, Map {
    private transient dxx a;
    private transient dxx b;
    private transient dxi c;

    dxs() {
    }

    abstract dxi b();

    abstract dxx e();

    abstract dxx g();

    @Override // java.util.Map
    public abstract Object get(Object obj);

    abstract boolean h();

    @Override // java.util.Map
    @Deprecated
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return ((dxi) values()).contains(obj);
    }

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public dxx entrySet() {
        dxx dxxVar = this.a;
        if (dxxVar != null) {
            return dxxVar;
        }
        dxx dxxVarE = e();
        this.a = dxxVarE;
        return dxxVarE;
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public dxx keySet() {
        dxx dxxVar = this.b;
        if (dxxVar != null) {
            return dxxVar;
        }
        dxx dxxVarG = g();
        this.b = dxxVarG;
        return dxxVarG;
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public dxi values() {
        dxi dxiVar = this.c;
        if (dxiVar != null) {
            return dxiVar;
        }
        dxi dxiVarB = b();
        this.c = dxiVarB;
        return dxiVarB;
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    @Override // java.util.Map
    public int hashCode() {
        return eae.a((dxx) entrySet());
    }

    public String toString() {
        return dyz.a(this);
    }

    Object writeReplace() {
        return new dxu(this);
    }
}

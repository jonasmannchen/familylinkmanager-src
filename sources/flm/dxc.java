package flm;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class dxc extends dxd implements Map {
    protected dxc() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.dxd
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public abstract Map b();

    @Override // java.util.Map
    public int size() {
        return b().size();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return b().isEmpty();
    }

    @Override // java.util.Map
    public Object remove(Object obj) {
        return b().remove(obj);
    }

    @Override // java.util.Map
    public void clear() {
        b().clear();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return b().containsKey(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return b().containsValue(obj);
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        return b().get(obj);
    }

    @Override // java.util.Map
    public Object put(Object obj, Object obj2) {
        return b().put(obj, obj2);
    }

    @Override // java.util.Map
    public void putAll(Map map) {
        b().putAll(map);
    }

    @Override // java.util.Map
    public Set keySet() {
        return b().keySet();
    }

    @Override // java.util.Map
    public Collection values() {
        return b().values();
    }

    @Override // java.util.Map
    public Set entrySet() {
        return b().entrySet();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return obj == this || b().equals(obj);
    }

    @Override // java.util.Map
    public int hashCode() {
        return b().hashCode();
    }
}

package flm;

import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
abstract class dze extends eaf {
    dze() {
    }

    abstract Map a();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return a().size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        a().clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Object objA = dyz.a(a(), key);
        if (dvh.a(objA, entry.getValue())) {
            return objA != null || a().containsKey(key);
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return a().isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        if (contains(obj)) {
            return a().keySet().remove(((Map.Entry) obj).getKey());
        }
        return false;
    }

    @Override // flm.eaf, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection collection) {
        try {
            return super.removeAll((Collection) dvl.a(collection));
        } catch (UnsupportedOperationException e) {
            return eae.a((Set) this, collection.iterator());
        }
    }

    @Override // flm.eaf, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection collection) {
        int i;
        try {
            return super.retainAll((Collection) dvl.a(collection));
        } catch (UnsupportedOperationException e) {
            int size = collection.size();
            if (size < 3) {
                dwq.a(size, "expectedSize");
                i = size + 1;
            } else if (size < 1073741824) {
                i = (int) ((size / 0.75f) + 1.0f);
            } else {
                i = Integer.MAX_VALUE;
            }
            HashSet hashSet = new HashSet(i);
            for (Object obj : collection) {
                if (contains(obj)) {
                    hashSet.add(((Map.Entry) obj).getKey());
                }
            }
            return a().keySet().retainAll(hashSet);
        }
    }
}

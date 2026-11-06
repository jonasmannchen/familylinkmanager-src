package flm;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
abstract class eaf extends AbstractSet {
    eaf() {
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection collection) {
        dvl.a(collection);
        if (collection instanceof dzl) {
            collection = ((dzl) collection).a();
        }
        if ((collection instanceof Set) && collection.size() > size()) {
            Iterator<E> it = iterator();
            dvl.a(collection);
            boolean z = false;
            while (it.hasNext()) {
                if (collection.contains(it.next())) {
                    it.remove();
                    z = true;
                }
            }
            return z;
        }
        return eae.a((Set) this, collection.iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection collection) {
        return super.retainAll((Collection) dvl.a(collection));
    }
}

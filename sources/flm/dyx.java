package flm;

import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dyx extends AbstractSequentialList implements Serializable {
    public static final long serialVersionUID = 0;
    public final dvc a;
    private final List b;

    dyx(List list, dvc dvcVar) {
        this.b = (List) dvl.a(list);
        this.a = (dvc) dvl.a(dvcVar);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.b.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.b.size();
    }

    @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new dyy(this, this.b.listIterator(i));
    }
}

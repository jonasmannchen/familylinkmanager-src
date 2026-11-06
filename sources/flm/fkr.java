package flm;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fkr extends fgr {
    public static final fkr b;
    private final List c;

    fkr() {
        this(new ArrayList(10));
    }

    private fkr(List list) {
        this.c = list;
    }

    @Override // flm.fgr, java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        c();
        this.c.add(i, obj);
        this.modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return this.c.get(i);
    }

    @Override // flm.fgr, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        c();
        Object objRemove = this.c.remove(i);
        this.modCount++;
        return objRemove;
    }

    @Override // flm.fgr, java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        c();
        Object obj2 = this.c.set(i, obj);
        this.modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c.size();
    }

    @Override // flm.fjf
    public final /* synthetic */ fjf a(int i) {
        if (i < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i);
        arrayList.addAll(this.c);
        return new fkr(arrayList);
    }

    static {
        fkr fkrVar = new fkr();
        b = fkrVar;
        fkrVar.a = false;
    }
}

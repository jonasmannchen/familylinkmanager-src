package flm;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fjn extends fgr implements fjo, RandomAccess {
    private static final fjn b;
    private final List c;

    public fjn() {
        this(10);
    }

    public fjn(int i) {
        this(new ArrayList(i));
    }

    private fjn(ArrayList arrayList) {
        this.c = arrayList;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c.size();
    }

    @Override // flm.fgr, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }

    @Override // flm.fgr, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        c();
        if (collection instanceof fjo) {
            collection = ((fjo) collection).d();
        }
        boolean zAddAll = this.c.addAll(i, collection);
        this.modCount++;
        return zAddAll;
    }

    @Override // flm.fgr, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        c();
        this.c.clear();
        this.modCount++;
    }

    @Override // flm.fjo
    public final void a(fgy fgyVar) {
        c();
        this.c.add(fgyVar);
        this.modCount++;
    }

    @Override // flm.fjo
    public final Object b(int i) {
        return this.c.get(i);
    }

    private static String a(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof fgy) {
            return ((fgy) obj).d();
        }
        return fiv.b((byte[]) obj);
    }

    @Override // flm.fjo
    public final List d() {
        return Collections.unmodifiableList(this.c);
    }

    @Override // flm.fjo
    public final fjo e() {
        if (a()) {
            return new flt(this);
        }
        return this;
    }

    @Override // flm.fgr, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i, Object obj) {
        c();
        return a(this.c.set(i, (String) obj));
    }

    @Override // flm.fgr, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    @Override // flm.fgr, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    @Override // flm.fgr, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    @Override // flm.fgr, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i) {
        c();
        Object objRemove = this.c.remove(i);
        this.modCount++;
        return a(objRemove);
    }

    @Override // flm.fgr, flm.fjf
    public final /* bridge */ /* synthetic */ boolean a() {
        return super.a();
    }

    @Override // flm.fgr, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        c();
        this.c.add(i, (String) obj);
        this.modCount++;
    }

    @Override // flm.fgr, java.util.AbstractList, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // flm.fgr, java.util.AbstractList, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // flm.fjf
    public final /* synthetic */ fjf a(int i) {
        if (i < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i);
        arrayList.addAll(this.c);
        return new fjn(arrayList);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        Object obj = this.c.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof fgy) {
            fgy fgyVar = (fgy) obj;
            String strD = fgyVar.d();
            if (fgyVar.e()) {
                this.c.set(i, strD);
            }
            return strD;
        }
        byte[] bArr = (byte[]) obj;
        String strB = fiv.b(bArr);
        if (fiv.a(bArr)) {
            this.c.set(i, strB);
        }
        return strB;
    }

    static {
        fjn fjnVar = new fjn();
        b = fjnVar;
        fjnVar.a = false;
    }
}

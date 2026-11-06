package flm;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class flt extends AbstractList implements fjo, RandomAccess {
    public final fjo a;

    public flt(fjo fjoVar) {
        this.a = fjoVar;
    }

    @Override // flm.fjo
    public final Object b(int i) {
        return this.a.b(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.size();
    }

    @Override // flm.fjo
    public final void a(fgy fgyVar) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new flu(this, i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new flv(this);
    }

    @Override // flm.fjo
    public final List d() {
        return this.a.d();
    }

    @Override // flm.fjo
    public final fjo e() {
        return this;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        return (String) this.a.get(i);
    }
}

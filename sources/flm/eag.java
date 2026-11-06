package flm;

import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class eag extends dxx {
    private final transient Object a;
    private transient int b;

    eag(Object obj) {
        this.a = dvl.a(obj);
    }

    eag(Object obj, int i) {
        this.a = obj;
        this.b = i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // flm.dxi, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.a.equals(obj);
    }

    @Override // flm.dxi
    /* JADX INFO: renamed from: a */
    public final eau iterator() {
        return new dyq(this.a);
    }

    @Override // flm.dxx
    final dxm i() {
        return dxm.a(this.a);
    }

    @Override // flm.dxi
    final boolean f() {
        return false;
    }

    @Override // flm.dxi
    final int a(Object[] objArr, int i) {
        objArr[i] = this.a;
        return i + 1;
    }

    @Override // flm.dxx, java.util.Collection, java.util.Set
    public final int hashCode() {
        int i = this.b;
        if (i == 0) {
            int iHashCode = this.a.hashCode();
            this.b = iHashCode;
            return iHashCode;
        }
        return i;
    }

    @Override // flm.dxx
    final boolean h() {
        return this.b != 0;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        String string = this.a.toString();
        return new StringBuilder(String.valueOf(string).length() + 2).append('[').append(string).append(']').toString();
    }

    @Override // flm.dxx, flm.dxi, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return iterator();
    }
}

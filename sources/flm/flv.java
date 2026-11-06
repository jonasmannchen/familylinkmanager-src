package flm;

import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class flv implements Iterator {
    private Iterator a;
    private final /* synthetic */ flt b;

    flv(flt fltVar) {
        this.b = fltVar;
        this.a = this.b.a.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        return (String) this.a.next();
    }
}

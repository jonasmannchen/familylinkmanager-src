package flm;

import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dyt implements dzp {
    private final Iterator a;
    private boolean b;
    private Object c;

    public dyt(Iterator it) {
        this.a = (Iterator) dvl.a(it);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b || this.a.hasNext();
    }

    @Override // flm.dzp, java.util.Iterator
    public final Object next() {
        if (!this.b) {
            return this.a.next();
        }
        Object obj = this.c;
        this.b = false;
        this.c = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        dvl.b(!this.b, "Can't remove after you've peeked at next");
        this.a.remove();
    }

    @Override // flm.dzp
    public final Object a() {
        if (!this.b) {
            this.c = this.a.next();
            this.b = true;
        }
        return this.c;
    }
}

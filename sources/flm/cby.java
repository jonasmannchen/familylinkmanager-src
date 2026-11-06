package flm;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class cby implements Iterator {
    private int a = -1;
    private boolean b = false;
    private final /* synthetic */ cbx c;

    cby(cbx cbxVar) {
        this.c = cbxVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a + 1 < this.c.a.c();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.b) {
            throw new IllegalStateException("You must call next() before you can remove an element");
        }
        ((cbw) this.c.a.b(this.a)).d = null;
        sp spVar = this.c.a;
        int i = this.a;
        if (spVar.d[i] != sp.a) {
            spVar.d[i] = sp.a;
            spVar.b = true;
        }
        this.a--;
        this.b = false;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.b = true;
        sp spVar = this.c.a;
        int i = this.a + 1;
        this.a = i;
        return (cbw) spVar.b(i);
    }
}

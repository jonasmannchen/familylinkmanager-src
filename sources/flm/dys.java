package flm;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dys implements Iterator {
    private Iterator a;
    private Iterator b = dyr.a;
    private Iterator c;
    private Deque d;

    dys(Iterator it) {
        this.c = (Iterator) dvl.a(it);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        Iterator it;
        while (!((Iterator) dvl.a(this.b)).hasNext()) {
            while (true) {
                if (this.c == null || !this.c.hasNext()) {
                    if (this.d != null && !this.d.isEmpty()) {
                        this.c = (Iterator) this.d.removeFirst();
                    } else {
                        it = null;
                        break;
                    }
                } else {
                    it = this.c;
                    break;
                }
            }
            this.c = it;
            if (this.c == null) {
                return false;
            }
            this.b = (Iterator) this.c.next();
            if (this.b instanceof dys) {
                dys dysVar = (dys) this.b;
                this.b = dysVar.b;
                if (this.d == null) {
                    this.d = new ArrayDeque();
                }
                this.d.addFirst(this.c);
                if (dysVar.d != null) {
                    while (!dysVar.d.isEmpty()) {
                        this.d.addFirst((Iterator) dysVar.d.removeLast());
                    }
                }
                this.c = dysVar.c;
            }
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            this.a = this.b;
            return this.b.next();
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        dvl.b(this.a != null, "no calls to next() since the last call to remove()");
        this.a.remove();
        this.a = null;
    }
}

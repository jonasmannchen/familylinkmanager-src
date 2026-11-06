package flm;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class azv implements Iterator {
    private final azu a;
    private int b = -1;

    public azv(azu azuVar) {
        this.a = (azu) bdi.checkNotNull(azuVar);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b < this.a.b() + (-1);
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException(new StringBuilder(46).append("Cannot advance the iterator beyond ").append(this.b).toString());
        }
        azu azuVar = this.a;
        int i = this.b + 1;
        this.b = i;
        return azuVar.a(i);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Cannot remove elements from a DataBufferIterator");
    }
}

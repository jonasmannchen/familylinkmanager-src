package flm;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class fkx implements Iterator {
    private final ArrayDeque a = new ArrayDeque();
    private fhh b;

    fkx(fgy fgyVar) {
        this.b = a(fgyVar);
    }

    private final fhh a(fgy fgyVar) {
        fgy fgyVar2 = fgyVar;
        while (fgyVar2 instanceof fku) {
            fku fkuVar = (fku) fgyVar2;
            this.a.push(fkuVar);
            fgyVar2 = fkuVar.d;
        }
        return (fhh) fgyVar2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b != null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        fhh fhhVarA;
        if (this.b == null) {
            throw new NoSuchElementException();
        }
        fhh fhhVar = this.b;
        while (!this.a.isEmpty()) {
            fhhVarA = a(((fku) this.a.pop()).e);
            if (!(fhhVarA.b() == 0)) {
                this.b = fhhVarA;
                return fhhVar;
            }
        }
        fhhVarA = null;
        this.b = fhhVarA;
        return fhhVar;
    }
}

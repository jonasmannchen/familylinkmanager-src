package flm;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class fld implements Iterator {
    private int a;
    private Iterator b;
    private final /* synthetic */ flb c;

    fld(flb flbVar) {
        this.c = flbVar;
        this.a = this.c.a.size();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return (this.a > 0 && this.a <= this.c.a.size()) || a().hasNext();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    private final Iterator a() {
        if (this.b == null) {
            this.b = this.c.d.entrySet().iterator();
        }
        return this.b;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        if (a().hasNext()) {
            return (Map.Entry) a().next();
        }
        List list = this.c.a;
        int i = this.a - 1;
        this.a = i;
        return (Map.Entry) list.get(i);
    }
}

package flm;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class flj implements Iterator {
    private int a = -1;
    private boolean b;
    private Iterator c;
    private final /* synthetic */ flb d;

    flj(flb flbVar) {
        this.d = flbVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a + 1 < this.d.a.size() || (!this.d.b.isEmpty() && a().hasNext());
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.b) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.b = false;
        this.d.e();
        if (this.a < this.d.a.size()) {
            flb flbVar = this.d;
            int i = this.a;
            this.a = i - 1;
            flbVar.c(i);
            return;
        }
        a().remove();
    }

    private final Iterator a() {
        if (this.c == null) {
            this.c = this.d.b.entrySet().iterator();
        }
        return this.c;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        this.b = true;
        int i = this.a + 1;
        this.a = i;
        if (i < this.d.a.size()) {
            return (Map.Entry) this.d.a.get(this.a);
        }
        return (Map.Entry) a().next();
    }
}

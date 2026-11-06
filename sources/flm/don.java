package flm;

import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class don implements dol {
    private final Iterator a;
    private dol b = c();

    public don(Iterator it) {
        this.a = it;
    }

    @Override // flm.dol
    public final boolean a() {
        while (this.b != null && !this.b.a()) {
            this.b = c();
        }
        return this.b != null;
    }

    private final dol c() {
        if (this.a.hasNext()) {
            return (dol) this.a.next();
        }
        return null;
    }

    @Override // flm.dol
    public final Object b() {
        return this.b.b();
    }
}

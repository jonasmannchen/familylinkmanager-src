package flm;

import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class eas extends dwk {
    private final /* synthetic */ Iterator a;
    private final /* synthetic */ ear b;

    eas(ear earVar, Iterator it) {
        this.b = earVar;
        this.a = it;
    }

    @Override // flm.dwk
    protected final /* synthetic */ Object a() {
        if (!this.a.hasNext()) {
            b();
            return null;
        }
        dzq dzqVar = (dzq) this.a.next();
        if (this.b.a.c.a((Comparable) dzqVar.c)) {
            b();
            return null;
        }
        return dyz.a(dzqVar.c, dzqVar);
    }
}

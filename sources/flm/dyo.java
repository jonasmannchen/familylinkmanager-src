package flm;

import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dyo extends dwk {
    private final /* synthetic */ Iterator a;
    private final /* synthetic */ dvm b;

    dyo(Iterator it, dvm dvmVar) {
        this.a = it;
        this.b = dvmVar;
    }

    @Override // flm.dwk
    protected final Object a() {
        while (this.a.hasNext()) {
            Object next = this.a.next();
            if (this.b.a(next)) {
                return next;
            }
        }
        return b();
    }
}

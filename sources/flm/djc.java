package flm;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class djc implements dfu, dlx {
    public final List a = new ArrayList();
    public boolean b;
    private final dge c;

    djc(dge dgeVar) {
        this.c = dgeVar;
        dgeVar.a(this);
    }

    @Override // flm.dlx
    public final void g_() {
        this.c.b(this);
    }

    @Override // flm.dfu
    public final void b() {
        synchronized (this) {
            this.b = true;
        }
        this.c.b(this);
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((dkz) it.next()).f();
        }
    }
}

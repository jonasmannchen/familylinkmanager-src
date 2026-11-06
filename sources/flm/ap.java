package flm;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ap extends as {
    private g g = new g();

    public final void a(ak akVar, at atVar) {
        aq aqVar = new aq(akVar, atVar);
        aq aqVar2 = (aq) this.g.a(akVar, aqVar);
        if (aqVar2 != null && aqVar2.b != atVar) {
            throw new IllegalArgumentException("This source was already added with the different observer");
        }
        if (aqVar2 == null && d()) {
            aqVar.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.ak
    public final void b() {
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            ((aq) ((Map.Entry) it.next()).getValue()).a();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.ak
    public final void c() {
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            aq aqVar = (aq) ((Map.Entry) it.next()).getValue();
            aqVar.a.a((at) aqVar);
        }
    }
}

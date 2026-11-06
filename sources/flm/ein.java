package flm;

import java.util.Collection;
import java.util.Iterator;
import java.util.logging.Level;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ein extends ecy {
    private final Collection b;

    public ein(String str, Collection collection) {
        super(str);
        this.b = collection;
    }

    @Override // flm.ecg
    public final boolean a(Level level) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            if (((ecg) it.next()).a(level)) {
                return true;
            }
        }
        return false;
    }

    @Override // flm.ecg
    public final void a(ecf ecfVar) {
        for (ecg ecgVar : this.b) {
            if (ecfVar.k() || ecgVar.a(ecfVar.d())) {
                ecgVar.a(ecfVar);
            }
        }
    }
}

package flm;

import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bl {
    public final HashMap a = new HashMap();

    public final void a() {
        Iterator it = this.a.values().iterator();
        while (it.hasNext()) {
            ((bg) it.next()).a();
        }
        this.a.clear();
    }
}

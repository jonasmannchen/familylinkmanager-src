package flm;

import java.util.IdentityHashMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fre {
    private frd a;
    private Map b;

    fre(frd frdVar) {
        this.a = frdVar;
    }

    public final Map a(int i) {
        if (this.b == null) {
            this.b = new IdentityHashMap(i);
        }
        return this.b;
    }

    public final fre a(frf frfVar, Object obj) {
        a(1).put(frfVar, obj);
        return this;
    }

    public final frd a() {
        if (this.b != null) {
            for (Map.Entry entry : this.a.a.entrySet()) {
                if (!this.b.containsKey(entry.getKey())) {
                    this.b.put((frf) entry.getKey(), entry.getValue());
                }
            }
            this.a = new frd(this.b);
            this.b = null;
        }
        return this.a;
    }
}

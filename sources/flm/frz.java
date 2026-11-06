package flm;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class frz {
    public static final frz a = new frz(new frw(), frx.a);
    public final ConcurrentMap b = new ConcurrentHashMap();

    private frz(fry... fryVarArr) {
        for (fry fryVar : fryVarArr) {
            this.b.put(fryVar.a(), fryVar);
        }
    }
}

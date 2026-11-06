package flm;

import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class glv {
    protected abstract Iterator a();

    public String toString() {
        return "TagContext";
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof glv)) {
            return false;
        }
        Iterator itA = a();
        Iterator itA2 = ((glv) obj).a();
        HashMap map = new HashMap();
        while (itA != null && itA.hasNext()) {
            glu gluVar = (glu) itA.next();
            if (map.containsKey(gluVar)) {
                map.put(gluVar, Integer.valueOf(((Integer) map.get(gluVar)).intValue() + 1));
            } else {
                map.put(gluVar, 1);
            }
        }
        while (itA2 != null && itA2.hasNext()) {
            glu gluVar2 = (glu) itA2.next();
            if (!map.containsKey(gluVar2)) {
                return false;
            }
            int iIntValue = ((Integer) map.get(gluVar2)).intValue();
            if (iIntValue > 1) {
                map.put(gluVar2, Integer.valueOf(iIntValue - 1));
            } else {
                map.remove(gluVar2);
            }
        }
        return map.isEmpty();
    }

    public final int hashCode() {
        int iHashCode = 0;
        Iterator itA = a();
        if (itA == null) {
            return 0;
        }
        while (true) {
            int i = iHashCode;
            if (!itA.hasNext()) {
                return i;
            }
            glu gluVar = (glu) itA.next();
            iHashCode = gluVar != null ? gluVar.hashCode() + i : i;
        }
    }
}

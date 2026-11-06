package flm;

import java.util.Arrays;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class frd {
    public static final frd b = new frd(Collections.emptyMap());
    public final Map a;

    frd(Map map) {
        this.a = map;
    }

    public final Object a(frf frfVar) {
        return this.a.get(frfVar);
    }

    public static fre a() {
        return new fre(b);
    }

    public final String toString() {
        return this.a.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        frd frdVar = (frd) obj;
        if (this.a.size() != frdVar.a.size()) {
            return false;
        }
        for (Map.Entry entry : this.a.entrySet()) {
            if (frdVar.a.containsKey(entry.getKey()) && dvh.a(entry.getValue(), frdVar.a.get(entry.getKey()))) {
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int iHashCode = 0;
        for (Map.Entry entry : this.a.entrySet()) {
            iHashCode = Arrays.hashCode(new Object[]{entry.getKey(), entry.getValue()}) + iHashCode;
        }
        return iHashCode;
    }
}

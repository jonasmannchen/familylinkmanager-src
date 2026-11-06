package flm;

import java.io.Serializable;
import java.util.Comparator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dwr extends dzo implements Serializable {
    public static final long serialVersionUID = 0;
    private final Comparator a;

    dwr(Comparator comparator) {
        this.a = (Comparator) dvl.a(comparator);
    }

    @Override // flm.dzo, java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.a.compare(obj, obj2);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dwr) {
            return this.a.equals(((dwr) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }
}

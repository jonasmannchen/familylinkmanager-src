package flm;

import java.io.Serializable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ead extends dzo implements Serializable {
    public static final long serialVersionUID = 0;
    private final dzo a;

    ead(dzo dzoVar) {
        this.a = (dzo) dvl.a(dzoVar);
    }

    @Override // flm.dzo, java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.a.compare(obj2, obj);
    }

    @Override // flm.dzo
    public final dzo a() {
        return this.a;
    }

    public final int hashCode() {
        return -this.a.hashCode();
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ead) {
            return this.a.equals(((ead) obj).a);
        }
        return false;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.a);
        return new StringBuilder(String.valueOf(strValueOf).length() + 10).append(strValueOf).append(".reverse()").toString();
    }
}

package flm;

import java.io.Serializable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dzm extends dzo implements Serializable {
    public static final dzm a = new dzm();
    public static final long serialVersionUID = 0;

    @Override // flm.dzo
    public final dzo a() {
        return eac.a;
    }

    private final Object readResolve() {
        return a;
    }

    public final String toString() {
        return "Ordering.natural()";
    }

    private dzm() {
    }

    @Override // flm.dzo, java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        dvl.a(comparable);
        dvl.a(comparable2);
        return comparable.compareTo(comparable2);
    }
}

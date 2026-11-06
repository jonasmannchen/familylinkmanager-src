package flm;

import java.io.Serializable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class eac extends dzo implements Serializable {
    public static final eac a = new eac();
    public static final long serialVersionUID = 0;

    @Override // flm.dzo
    public final dzo a() {
        return dzm.a;
    }

    private final Object readResolve() {
        return a;
    }

    public final String toString() {
        return "Ordering.natural().reverse()";
    }

    private eac() {
    }

    @Override // flm.dzo, java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        dvl.a(comparable);
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }
}

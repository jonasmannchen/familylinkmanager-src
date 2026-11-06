package flm;

import java.util.Comparator;
import java.util.SortedSet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class eai {
    public static boolean a(Comparator comparator, Iterable iterable) {
        Comparator comparator2;
        dvl.a(comparator);
        dvl.a(iterable);
        if (iterable instanceof SortedSet) {
            comparator2 = ((SortedSet) iterable).comparator();
            if (comparator2 == null) {
                comparator2 = dzm.a;
            }
        } else {
            if (!(iterable instanceof eah)) {
                return false;
            }
            comparator2 = ((eah) iterable).comparator();
        }
        return comparator.equals(comparator2);
    }
}

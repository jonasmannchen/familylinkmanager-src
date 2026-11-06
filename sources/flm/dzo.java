package flm;

import java.util.Comparator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class dzo implements Comparator {
    public static dzo a(Comparator comparator) {
        return comparator instanceof dzo ? (dzo) comparator : new dwr(comparator);
    }

    @Override // java.util.Comparator
    public abstract int compare(Object obj, Object obj2);

    protected dzo() {
    }

    public dzo a() {
        return new ead(this);
    }
}

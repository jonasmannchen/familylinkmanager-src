package flm;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.TreeSet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ecq {
    public static final ecq a;
    public final SortedMap b;
    private Integer c = null;
    private String d = null;

    private ecq(SortedMap sortedMap) {
        this.b = sortedMap;
    }

    public final void a(ece eceVar) {
        for (Map.Entry entry : this.b.entrySet()) {
            String str = (String) entry.getKey();
            Set set = (Set) entry.getValue();
            if (!set.isEmpty()) {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    eceVar.a(str, it.next());
                }
            } else {
                eceVar.a(str, null);
            }
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ecq) && ((ecq) obj).b.equals(this.b);
    }

    public final int hashCode() {
        if (this.c == null) {
            this.c = Integer.valueOf(this.b.hashCode());
        }
        return this.c.intValue();
    }

    public final String toString() {
        if (this.d == null) {
            StringBuilder sb = new StringBuilder();
            ecd ecdVar = new ecd("[ ", " ]", sb);
            a(ecdVar);
            ecdVar.a();
            this.d = sb.toString();
        }
        return this.d;
    }

    static {
        new ecr();
        Collections.unmodifiableSortedSet(new TreeSet());
        a = new ecq(Collections.unmodifiableSortedMap(new TreeMap()));
    }
}

package flm;

import java.util.Collection;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ggb {
    public final boolean a;
    public final List b;
    public final Collection c;
    public final ggg d;
    public final boolean e;

    ggb(List list, Collection collection, ggg gggVar, boolean z, boolean z2) {
        this.b = list;
        this.c = (Collection) dvl.a(collection, "drainedSubstreams");
        this.d = gggVar;
        this.e = z;
        this.a = z2;
        dvl.b(!z2 || list == null, "passThrough should imply buffer is null");
        dvl.b((z2 && gggVar == null) ? false : true, "passThrough should imply winningSubstream != null");
        dvl.b(!z2 || (collection.size() == 1 && collection.contains(gggVar)) || (collection.size() == 0 && gggVar.b), "passThrough should imply winningSubstream is drained");
        dvl.b((z && gggVar == null) ? false : true, "cancelled should imply committed");
    }
}

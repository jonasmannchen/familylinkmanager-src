package flm;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ehj {
    private final ConcurrentHashMap a = new ConcurrentHashMap(16, 0.75f, 10);
    private final ReferenceQueue b = new ReferenceQueue();

    ehj() {
    }

    public final List a(Throwable th, boolean z) {
        Reference referencePoll = this.b.poll();
        while (referencePoll != null) {
            this.a.remove(referencePoll);
            referencePoll = this.b.poll();
        }
        List list = (List) this.a.get(new ehk(th, null));
        if (z && list == null) {
            Vector vector = new Vector(2);
            List list2 = (List) this.a.putIfAbsent(new ehk(th, this.b), vector);
            return list2 == null ? vector : list2;
        }
        return list;
    }
}

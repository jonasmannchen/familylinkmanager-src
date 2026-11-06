package flm;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dzg extends dze {
    private final /* synthetic */ dzf a;

    dzg(dzf dzfVar) {
        this.a = dzfVar;
    }

    @Override // flm.dze
    final Map a() {
        return this.a;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return this.a.b();
    }
}

package flm;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dzd extends dze {
    private final /* synthetic */ dzc a;

    dzd(dzc dzcVar) {
        this.a = dzcVar;
    }

    @Override // flm.dze
    final Map a() {
        return this.a;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return this.a.k_();
    }
}

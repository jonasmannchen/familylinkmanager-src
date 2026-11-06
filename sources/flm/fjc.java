package flm;

import java.util.AbstractList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fjc extends AbstractList {
    private final List a;
    private final fjd b;

    public fjc(List list, fjd fjdVar) {
        this.a = list;
        this.b = fjdVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return this.b.a(this.a.get(i));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.size();
    }
}

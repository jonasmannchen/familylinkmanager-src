package flm;

import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dwy extends dwx {
    private final /* synthetic */ Iterable a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    dwy(Iterable iterable, Iterable iterable2) {
        super(iterable);
        this.a = iterable2;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.a.iterator();
    }
}

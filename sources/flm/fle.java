package flm;

import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class fle extends flk {
    private final /* synthetic */ flb a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    fle(flb flbVar) {
        super(flbVar);
        this.a = flbVar;
    }

    @Override // flm.flk, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new fld(this.a);
    }
}

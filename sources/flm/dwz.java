package flm;

import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dwz extends dwx {
    public final /* synthetic */ Iterable[] a;

    dwz(Iterable[] iterableArr) {
        this.a = iterableArr;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new dys(new dxa(this, this.a.length));
    }
}

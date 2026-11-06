package flm;

import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dyl extends dwx {
    private final /* synthetic */ Iterable a;
    private final /* synthetic */ dvm b;

    dyl(Iterable iterable, dvm dvmVar) {
        this.a = iterable;
        this.b = dvmVar;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Iterator it = this.a.iterator();
        dvm dvmVar = this.b;
        dvl.a(it);
        dvl.a(dvmVar);
        return new dyo(it, dvmVar);
    }
}

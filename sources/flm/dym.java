package flm;

import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dym extends dwx {
    private final /* synthetic */ Iterable a;
    private final /* synthetic */ dvc b;

    dym(Iterable iterable, dvc dvcVar) {
        this.a = iterable;
        this.b = dvcVar;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Iterator it = this.a.iterator();
        dvc dvcVar = this.b;
        dvl.a(dvcVar);
        return new dyp(it, dvcVar);
    }
}

package flm;

import java.util.Collection;
import java.util.HashSet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class gdz {
    public final Object a = new Object();
    public Collection b = new HashSet();
    private final /* synthetic */ gda c;

    gdz(gda gdaVar) {
        this.c = gdaVar;
    }

    final fvc a(gfi gfiVar) {
        synchronized (this.a) {
            this.b.add(gfiVar);
        }
        return null;
    }
}

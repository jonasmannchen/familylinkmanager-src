package flm;

import java.util.Comparator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class fva implements Comparator {
    private final /* synthetic */ fvb a;

    fva(fvb fvbVar) {
        this.a = fvbVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.a.a(obj) - this.a.a(obj2);
    }
}

package flm;

import java.util.Comparator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class fha implements Comparator {
    fha() {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        fgy fgyVar = (fgy) obj;
        fgy fgyVar2 = (fgy) obj2;
        fhf fhfVar = (fhf) fgyVar.iterator();
        fhf fhfVar2 = (fhf) fgyVar2.iterator();
        while (fhfVar.hasNext() && fhfVar2.hasNext()) {
            int iCompare = Integer.compare(fgy.a(fhfVar.a()), fgy.a(fhfVar2.a()));
            if (iCompare != 0) {
                return iCompare;
            }
        }
        return Integer.compare(fgyVar.b(), fgyVar2.b());
    }
}

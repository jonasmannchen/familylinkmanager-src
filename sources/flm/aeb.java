package flm;

import java.util.Comparator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class aeb implements Comparator {
    aeb() {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        aed aedVar = (aed) obj;
        aed aedVar2 = (aed) obj2;
        if ((aedVar.d == null) != (aedVar2.d == null)) {
            return aedVar.d == null ? 1 : -1;
        }
        if (aedVar.a != aedVar2.a) {
            return aedVar.a ? -1 : 1;
        }
        int i = aedVar2.b - aedVar.b;
        if (i != 0) {
            return i;
        }
        int i2 = aedVar.c - aedVar2.c;
        if (i2 == 0) {
            return 0;
        }
        return i2;
    }
}

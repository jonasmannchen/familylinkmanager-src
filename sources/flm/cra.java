package flm;

import java.util.Comparator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class cra implements Comparator {
    cra() {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        cqz cqzVar = (cqz) obj;
        cqz cqzVar2 = (cqz) obj2;
        int iCompareTo = Integer.valueOf(cqzVar2.b).compareTo(Integer.valueOf(cqzVar.b));
        return iCompareTo == 0 ? Integer.valueOf(cqzVar.a()).compareTo(Integer.valueOf(cqzVar2.a())) : iCompareTo;
    }
}

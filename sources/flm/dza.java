package flm;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dza extends eaj {
    dza(Iterator it) {
        super(it);
    }

    @Override // flm.eaj
    final /* synthetic */ Object a(Object obj) {
        return ((Map.Entry) obj).getKey();
    }
}

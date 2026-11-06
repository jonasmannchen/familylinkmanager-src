package flm;

import java.util.AbstractMap;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
abstract class dzf extends AbstractMap {
    dzf() {
    }

    abstract Iterator b();

    @Override // java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        return new dzg(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        Iterator itB = b();
        dvl.a(itB);
        while (itB.hasNext()) {
            itB.next();
            itB.remove();
        }
    }
}

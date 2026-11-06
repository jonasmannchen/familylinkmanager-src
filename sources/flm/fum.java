package flm;

import java.net.URI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class fum extends fuj {
    private final List b;

    fum(List list) {
        this.b = Collections.unmodifiableList(new ArrayList(list));
    }

    @Override // flm.fuj
    public final fui a(URI uri, frd frdVar) {
        b();
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            fui fuiVarA = ((ful) it.next()).a(uri, frdVar);
            if (fuiVarA != null) {
                return fuiVarA;
            }
        }
        return null;
    }

    @Override // flm.fuj
    public final String a() {
        b();
        return ((ful) this.b.get(0)).a();
    }

    private final void b() {
        if (this.b.isEmpty()) {
            throw new RuntimeException("No NameResolverProviders found via ServiceLoader, including for DNS. This is probably due to a broken build. If using ProGuard, check your configuration");
        }
    }
}

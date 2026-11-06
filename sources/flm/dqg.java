package flm;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dqg implements dpz {
    private final List b;

    dqg(Collection collection) {
        this.b = new ArrayList(collection);
    }

    @Override // flm.dpz
    public final void a(gtr gtrVar) {
        if (this.b.size() == 1) {
            ((dpz) this.b.get(0)).a(gtrVar);
            return;
        }
        RuntimeException runtimeException = null;
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            try {
                ((dpz) it.next()).a(gtrVar);
            } catch (RuntimeException e) {
                e = e;
                dkm.b("CompositeTransmitter", "One transmitter failed to send message", e, new Object[0]);
                if (runtimeException != null) {
                    e = runtimeException;
                }
                runtimeException = e;
            }
        }
        if (runtimeException != null) {
            throw runtimeException;
        }
    }
}

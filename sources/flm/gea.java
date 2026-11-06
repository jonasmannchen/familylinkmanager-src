package flm;

import java.lang.ref.ReferenceQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Logger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class gea extends gbe {
    private static final ReferenceQueue b = new ReferenceQueue();
    private static final ConcurrentMap c = new ConcurrentHashMap();
    public static final Logger a = Logger.getLogger(gea.class.getName());

    gea(ftt fttVar) {
        this(fttVar, b, c);
    }

    private gea(ftt fttVar, ReferenceQueue referenceQueue, ConcurrentMap concurrentMap) {
        super(fttVar);
        new geb(this, fttVar, referenceQueue, concurrentMap);
    }
}

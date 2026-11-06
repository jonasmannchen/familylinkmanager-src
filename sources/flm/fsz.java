package flm;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.logging.Logger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fsz {
    public static final Logger a = Logger.getLogger(fsz.class.getName());
    public static final fsz b = new fsz();
    public final ConcurrentNavigableMap c;
    public final ConcurrentMap d;
    public final ConcurrentMap e;

    public fsz() {
        new ConcurrentSkipListMap();
        this.c = new ConcurrentSkipListMap();
        this.d = new ConcurrentHashMap();
        this.e = new ConcurrentHashMap();
        new ConcurrentHashMap();
    }

    public static void a(Map map, ftf ftfVar) {
        map.put(Long.valueOf(ftfVar.b().a), ftfVar);
    }

    public static void b(Map map, ftf ftfVar) {
        map.remove(Long.valueOf(ftfVar.b().a));
    }
}

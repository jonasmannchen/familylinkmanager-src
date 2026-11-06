package flm;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class gdt implements Runnable {
    private final /* synthetic */ Map a;
    private final /* synthetic */ frd b;
    private final /* synthetic */ List c;
    private final /* synthetic */ gdr d;

    gdt(gdr gdrVar, Map map, frd frdVar, List list) {
        this.d = gdrVar;
        this.a = map;
        this.b = frdVar;
        this.c = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.d.a != this.d.b.v) {
            return;
        }
        this.d.b.U = null;
        if (this.a != null) {
            try {
                ggp ggpVar = this.d.b.q;
                Map map = this.a;
                HashMap map2 = new HashMap();
                HashMap map3 = new HashMap();
                List<Map> listS = ggv.s(map);
                if (listS == null) {
                    ggp.a.logp(Level.FINE, "io.grpc.internal.ServiceConfigInterceptor", "handleUpdate", "No method configs found, skipping");
                    ggpVar.g = true;
                } else {
                    for (Map map4 : listS) {
                        ggu gguVar = new ggu(map4, ggpVar.d, ggpVar.e, ggpVar.f);
                        List<Map> listN = ggv.n(map4);
                        dvl.a((listN == null || listN.isEmpty()) ? false : true, "no names in method config %s", map4);
                        for (Map map5 : listN) {
                            String strJ = ggv.j(map5);
                            dvl.a(!dvj.a(strJ), "missing service name");
                            String strK = ggv.k(map5);
                            if (dvj.a(strK)) {
                                dvl.a(!map3.containsKey(strJ), "Duplicate service %s", strJ);
                                map3.put(strJ, gguVar);
                            } else {
                                String str = (String) dvl.a(strJ, "fullServiceName");
                                String str2 = (String) dvl.a(strK, "methodName");
                                String string = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length()).append(str).append("/").append(str2).toString();
                                dvl.a(!map2.containsKey(string), "Duplicate method name %s", string);
                                map2.put(string, gguVar);
                            }
                        }
                    }
                    ggpVar.b.set(Collections.unmodifiableMap(map2));
                    ggpVar.c.set(Collections.unmodifiableMap(map3));
                    ggpVar.g = true;
                }
                if (this.d.b.Q) {
                    this.d.b.N = gda.a(this.b);
                }
            } catch (RuntimeException e) {
                Logger logger = gda.a;
                Level level = Level.WARNING;
                String strValueOf = String.valueOf(this.d.b.d);
                logger.logp(level, "io.grpc.internal.ManagedChannelImpl$NameResolverListenerImpl$1NamesResolved", "run", new StringBuilder(String.valueOf(strValueOf).length() + 51).append("[").append(strValueOf).append("] Unexpected exception from parsing service config").toString(), (Throwable) e);
            }
        }
        this.d.a.a.a(this.c, this.b);
    }
}

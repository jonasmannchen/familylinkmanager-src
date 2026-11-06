package flm;

import java.util.IdentityHashMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ggw {
    public static final ggw a = new ggw(new ggx());
    public final IdentityHashMap b = new IdentityHashMap();
    public ScheduledExecutorService c;
    private final ghb d;

    private ggw(ghb ghbVar) {
        this.d = ghbVar;
    }

    public static Object a(gha ghaVar, Object obj) {
        return a.b(ghaVar, obj);
    }

    public final synchronized Object a(gha ghaVar) {
        ggz ggzVar;
        ggzVar = (ggz) this.b.get(ghaVar);
        if (ggzVar == null) {
            ggzVar = new ggz(ghaVar.a());
            this.b.put(ghaVar, ggzVar);
        }
        if (ggzVar.c != null) {
            ggzVar.c.cancel(false);
            ggzVar.c = null;
        }
        ggzVar.b++;
        return ggzVar.a;
    }

    private final synchronized Object b(gha ghaVar, Object obj) {
        synchronized (this) {
            ggz ggzVar = (ggz) this.b.get(ghaVar);
            if (ggzVar == null) {
                String strValueOf = String.valueOf(ghaVar);
                throw new IllegalArgumentException(new StringBuilder(String.valueOf(strValueOf).length() + 29).append("No cached instance found for ").append(strValueOf).toString());
            }
            dvl.a(obj == ggzVar.a, "Releasing the wrong instance");
            dvl.b(ggzVar.b > 0, "Refcount has already reached zero");
            ggzVar.b--;
            if (ggzVar.b == 0) {
                if (gbh.a) {
                    ghaVar.a(obj);
                    this.b.remove(ghaVar);
                } else {
                    dvl.b(ggzVar.c == null, "Destroy task already scheduled");
                    if (this.c == null) {
                        this.c = this.d.a();
                    }
                    ggzVar.c = this.c.schedule(new gcx(new ggy(this, ggzVar, ghaVar, obj)), 1L, TimeUnit.SECONDS);
                }
            }
        }
        return null;
    }
}

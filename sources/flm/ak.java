package flm;

import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class ak {
    public static final Object b = new Object();
    private boolean h;
    private boolean i;
    public final Object a = new Object();
    public g c = new g();
    public int d = 0;
    private volatile Object g = b;
    public volatile Object e = b;
    public int f = -1;
    private final Runnable j = new al(this);

    private final void b(ao aoVar) {
        if (aoVar.b) {
            if (!aoVar.a()) {
                aoVar.a(false);
            } else if (aoVar.c < this.f) {
                aoVar.c = this.f;
                aoVar.a.a(this.g);
            }
        }
    }

    final void a(ao aoVar) {
        if (this.h) {
            this.i = true;
            return;
        }
        this.h = true;
        do {
            this.i = false;
            if (aoVar != null) {
                b(aoVar);
                aoVar = null;
            } else {
                k kVarA = this.c.a();
                while (kVarA.hasNext()) {
                    b((ao) ((Map.Entry) kVarA.next()).getValue());
                    if (this.i) {
                        break;
                    }
                }
            }
        } while (this.i);
        this.h = false;
    }

    public final void a(af afVar, at atVar) {
        if (afVar.getLifecycle().a() != z.DESTROYED) {
            an anVar = new an(this, afVar, atVar);
            ao aoVar = (ao) this.c.a(atVar, anVar);
            if (aoVar != null && !aoVar.a(afVar)) {
                throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
            }
            if (aoVar == null) {
                afVar.getLifecycle().a(anVar);
            }
        }
    }

    public void a(at atVar) {
        a("removeObserver");
        ao aoVar = (ao) this.c.b(atVar);
        if (aoVar != null) {
            aoVar.b();
            aoVar.a(false);
        }
    }

    public void a(Object obj) {
        boolean z;
        synchronized (this.a) {
            z = this.e == b;
            this.e = obj;
        }
        if (z) {
            a.a().b(this.j);
        }
    }

    public void b(Object obj) {
        a("setValue");
        this.f++;
        this.g = obj;
        a((ao) null);
    }

    public final Object a() {
        Object obj = this.g;
        if (obj != b) {
            return obj;
        }
        return null;
    }

    public void b() {
    }

    public void c() {
    }

    public final boolean d() {
        return this.d > 0;
    }

    private static void a(String str) {
        if (!a.a().b()) {
            throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
        }
    }
}

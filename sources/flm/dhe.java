package flm;

import android.annotation.TargetApi;
import android.app.Application;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@TargetApi(24)
final class dhe extends dfm implements dgb, dkz {
    public final dhg c;
    public final Map d;
    public final boolean e;
    public final dot f;
    public final dhm g;
    private final dge h;
    private final int i;

    dhe(dpz dpzVar, Application application, dmb dmbVar, dmb dmbVar2, boolean z, int i, dot dotVar, dhm dhmVar) {
        super(dpzVar, application, dmbVar, dmbVar2, dp.K, i);
        this.d = new HashMap();
        this.h = dge.a(application);
        this.e = z;
        this.f = (dot) dse.a(dotVar);
        this.g = dhmVar;
        this.i = dpf.a(application);
        this.c = new dhg(new dhf(this, dhmVar), z);
        this.h.a(this.c);
    }

    @Override // flm.dkz
    public final void e() {
    }

    @Override // flm.dkz
    public final void f() {
    }

    @Override // flm.dgb
    public final void b() {
        synchronized (this.d) {
            this.d.clear();
        }
    }

    final void a(int i) {
        synchronized (this.d) {
            Iterator it = this.d.values().iterator();
            while (it.hasNext()) {
                ((dos) it.next()).a(i, this.i);
            }
        }
    }

    @Override // flm.dfm
    final void d() {
        this.h.b(this.c);
        dhg dhgVar = this.c;
        synchronized (dhgVar) {
            dhgVar.b();
            if (dhgVar.d != null) {
                dhgVar.c.quitSafely();
                dhgVar.c = null;
                dhgVar.d = null;
            }
        }
        synchronized (this.d) {
            this.d.clear();
        }
    }
}

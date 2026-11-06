package flm;

import android.app.Application;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
abstract class dfm implements dlx {
    public final Application a;
    public volatile boolean b;
    private final dic c;
    private final dmb d;

    protected dfm(dpz dpzVar, Application application, dmb dmbVar, dmb dmbVar2, int i) {
        this(dpzVar, application, dmbVar, dmbVar2, i, Integer.MAX_VALUE);
    }

    abstract void d();

    protected dfm(dpz dpzVar, Application application, dmb dmbVar, dmb dmbVar2, int i, int i2) {
        dse.a(dpzVar);
        dse.a(application);
        this.a = application;
        this.d = dmbVar2;
        this.c = new dic(dpzVar, dmbVar, dmbVar2, i, i2);
    }

    @Override // flm.dlx
    public final void g_() {
        this.b = true;
        d();
    }

    protected final boolean h_() {
        return !this.c.a.a();
    }

    protected final void a(String str, boolean z, gtr gtrVar, gpr gprVar) {
        a(str, z, gtrVar, gprVar, null);
    }

    protected final void a(gtr gtrVar) {
        a(null, true, gtrVar, null, null);
    }

    final void a(String str, boolean z, gtr gtrVar, gpr gprVar, String str2) {
        if (!this.b) {
            dic dicVar = this.c;
            if (dicVar.c == dp.J) {
                dicVar.a(str, z, gtrVar, gprVar, str2);
            } else {
                ((ScheduledExecutorService) dicVar.b.a()).submit(new did(dicVar, str, z, gtrVar, gprVar, str2));
            }
        }
    }

    final ScheduledExecutorService c() {
        return (ScheduledExecutorService) this.d.a();
    }
}

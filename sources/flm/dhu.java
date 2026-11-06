package flm;

import android.app.Application;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dhu extends dfm implements dgb, dgc, dkz {
    private boolean c;

    dhu(dpz dpzVar, Application application, dmb dmbVar, dmb dmbVar2) {
        super(dpzVar, application, dmbVar, dmbVar2, dp.J);
    }

    @Override // flm.dkz
    public final void e() {
        g();
    }

    @Override // flm.dkz
    public final void f() {
    }

    @Override // flm.dgb
    public final void b() {
        a(gsk.APP_TO_BACKGROUND);
        dkm.a(3, "MagicEyeLogService", "Logging APP_TO_BACKGROUND", new Object[0]);
    }

    @Override // flm.dgc
    public final void a() {
        a(gsk.APP_TO_FOREGROUND);
        dkm.a(3, "MagicEyeLogService", "Logging APP_TO_FOREGROUND", new Object[0]);
    }

    private final synchronized void g() {
        if (!this.c && !this.b) {
            dge.a(this.a).a(this);
            this.c = true;
        }
    }

    private final synchronized void h() {
        if (this.c) {
            dge.a(this.a).b(this);
            this.c = false;
        }
    }

    private final void a(gsk gskVar) {
        c().submit(new dhv(this, gskVar));
    }

    @Override // flm.dfm
    final void d() {
        h();
    }
}

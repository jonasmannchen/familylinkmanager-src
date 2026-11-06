package flm;

import android.app.Application;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
class dmj extends dfm {
    public final dpq c;
    public final int d;
    public final int e;

    static synchronized dmj a(dpz dpzVar, Application application, dmb dmbVar, dmb dmbVar2, dvi dviVar) {
        return new dmj(dpzVar, application, dmbVar, dmbVar2, ((dll) dviVar.a(dll.a().a())).c, 1.0f, 0, 0);
    }

    static synchronized dmj b(dpz dpzVar, Application application, dmb dmbVar, dmb dmbVar2, dvi dviVar) {
        dlp dlpVar;
        dlq dlqVar = new dlq();
        dse.b(true, "Probability shall be between 0 and 1.");
        dlqVar.a = 0.5f;
        dlqVar.b = 5;
        dlqVar.c = 1000;
        dlpVar = (dlp) dviVar.a(new dlp(false, dlqVar.a, dlqVar.b, dlqVar.c));
        return new dmj(dpzVar, application, dmbVar, dmbVar2, 10, dlpVar.b, dlpVar.c, dlpVar.d);
    }

    private dmj(dpz dpzVar, Application application, dmb dmbVar, dmb dmbVar2, int i, float f, int i2, int i3) {
        super(dpzVar, application, dmbVar, dmbVar2, dp.K, i);
        this.c = new dpq(f);
        this.d = i2;
        this.e = i3;
    }

    @Override // flm.dfm
    final void d() {
        dpy.b(dlo.a);
    }
}

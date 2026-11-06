package flm;

import android.app.Activity;
import android.app.Application;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dhw extends dfm implements dfv {
    public final Application a;
    public final dge c;
    public final dmb d;
    public final dox e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final AtomicLong i;
    public final AtomicBoolean j;
    public ScheduledFuture k;

    dhw(Application application, boolean z, boolean z2, dge dgeVar, dmb dmbVar, dmb dmbVar2, dox doxVar, dpz dpzVar) {
        super(dpzVar, application, dmbVar, dmbVar2, dp.K);
        this.i = new AtomicLong();
        this.j = new AtomicBoolean();
        this.a = (Application) dse.a(application);
        this.f = z;
        this.g = z2;
        this.c = (dge) dse.a(dgeVar);
        this.d = (dmb) dse.a(dmbVar2);
        this.e = (dox) dse.a(doxVar);
        this.e.b = new dhy(this);
        this.h = dog.a(application);
    }

    @Override // flm.dfm
    final void d() {
        this.c.b(this);
        this.e.b();
        e();
    }

    @Override // flm.dfv
    public final void a(Activity activity) {
        if (!this.b) {
            this.e.a(activity, activity.getClass().getName());
        }
    }

    final void e() {
        if (this.k != null) {
            if (!this.k.isDone()) {
                this.k.cancel(true);
            }
            this.k = null;
        }
    }
}

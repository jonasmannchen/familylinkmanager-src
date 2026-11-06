package flm;

import android.annotation.TargetApi;
import android.app.Application;
import android.os.StrictMode;
import android.os.strictmode.CustomViolation;
import android.os.strictmode.DiskReadViolation;
import android.os.strictmode.DiskWriteViolation;
import android.os.strictmode.Violation;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@TargetApi(28)
final class dly extends dfm implements StrictMode.OnThreadViolationListener, StrictMode.OnVmViolationListener, dkz {
    protected dly(dpz dpzVar, Application application, dmb dmbVar, dmb dmbVar2) {
        super(dpzVar, application, dmbVar, dmbVar2, dp.K);
    }

    @Override // flm.dkz
    public final void e() {
        StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder().detectAll().penaltyListener(c(), this).build());
        dsg.a(new Runnable(this) { // from class: flm.dlz
            private final dly a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                dly dlyVar = this.a;
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectAll().penaltyListener(dlyVar.c(), dlyVar).build());
            }
        });
    }

    @Override // flm.dkz
    public final void f() {
    }

    @Override // flm.dfm
    final void d() {
        StrictMode.setVmPolicy(StrictMode.VmPolicy.LAX);
        dsg.a(dma.a);
    }

    @Override // android.os.StrictMode.OnThreadViolationListener
    public final void onThreadViolation(Violation violation) {
        if (h_()) {
            gto gtoVar = (gto) ((fio) gtn.c.a(dp.au, (Object) null));
            if (violation instanceof DiskReadViolation) {
                gtoVar.a(gtp.DISK_READ);
            } else if (violation instanceof DiskWriteViolation) {
                gtoVar.a(gtp.DISK_WRITE);
            } else if (violation instanceof CustomViolation) {
                gtoVar.a(gtp.SLOW);
            } else {
                return;
            }
            gts gtsVar = (gts) ((fio) gtr.y.a(dp.au, (Object) null));
            gtsVar.c();
            gtr gtrVar = (gtr) gtsVar.a;
            gtrVar.x = (gtn) ((fin) gtoVar.h());
            gtrVar.a |= 33554432;
            a((gtr) ((fin) gtsVar.h()));
        }
    }

    @Override // android.os.StrictMode.OnVmViolationListener
    public final void onVmViolation(Violation violation) {
    }
}

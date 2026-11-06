package flm;

import android.app.KeyguardManager;
import android.content.Context;
import android.os.PowerManager;
import com.google.android.gms.kids.database.SupervisionDatabase;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bzb {
    private final ayt b = ayt.a();
    public final SupervisionDatabase a = SupervisionDatabase.h();
    private final PowerManager c = (PowerManager) this.b.getSystemService("power");
    private final KeyguardManager d = (KeyguardManager) this.b.getSystemService("keyguard");

    public final long a(long j) {
        long jA;
        synchronized (bzb.class) {
            jA = this.a.p().a(j, 3);
        }
        return jA;
    }

    final void b(long j) {
        btv.a("TimeLimit", "reset last usage reset time", new Object[0]);
        synchronized (bzb.class) {
            this.a.p().a("last_usage_reset_epoch_time", j);
        }
    }

    public final void a() {
        synchronized (bzb.class) {
            long jC = btj.c();
            if (b()) {
                this.a.p().a(jC, 1);
            } else {
                this.a.p().a(jC, 2);
            }
        }
    }

    final boolean b() {
        bwj bwjVarP = this.a.p();
        boolean zA = bis.a((Context) this.b).a();
        boolean zIsInteractive = this.c.isInteractive();
        boolean z = !this.d.isKeyguardLocked();
        boolean z2 = !bwjVarP.d("is_device_locked");
        boolean z3 = !bwjVarP.d("is_shutting_down");
        btv.a("TimeLimit", "status: foreground:%s, interactive:%s, noKeyguard:%s, noTimeLimit:%s, notShuttingDown:%s", Boolean.valueOf(zA), Boolean.valueOf(zIsInteractive), Boolean.valueOf(z), Boolean.valueOf(z2), Boolean.valueOf(z3));
        return zA && zIsInteractive && z && z2 && z3;
    }
}

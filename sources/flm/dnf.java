package flm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dnf extends BroadcastReceiver {
    public final dlw a;
    public final dmb b;
    private final dmb c;

    dnf(dlw dlwVar, dmb dmbVar, dmb dmbVar2) {
        this.a = dlwVar;
        this.b = dmbVar;
        this.c = dmbVar2;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        ScheduledExecutorService scheduledExecutorService;
        dkm.a(3, "PrimesShutdown", "BroadcastReceiver: action = %s", intent.getAction());
        if (this.a.a) {
            context.unregisterReceiver(this);
        } else if ("com.google.gservices.intent.action.GSERVICES_CHANGED".equals(intent.getAction()) && this.c != null && (scheduledExecutorService = (ScheduledExecutorService) this.c.a()) != null) {
            scheduledExecutorService.submit(new dng(this));
        }
    }
}

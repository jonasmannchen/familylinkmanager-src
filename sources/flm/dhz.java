package flm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dhz extends BroadcastReceiver {
    public final /* synthetic */ dhw a;

    dhz(dhw dhwVar) {
        this.a = dhwVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.intent.action.SCREEN_ON".equals(intent.getAction())) {
            if (this.a.j.get()) {
                this.a.e();
            }
        } else {
            this.a.e();
            this.a.k = ((ScheduledExecutorService) this.a.d.a()).schedule(new dia(this, context), 5L, TimeUnit.SECONDS);
        }
    }
}

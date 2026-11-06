package flm;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.kids.features.timelimit.UsageCheckingIntentOperation;
import com.google.android.gms.kids.operations.KidsSystemIntentOperation;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ccw extends bpo {
    public ccw() {
        super("kids");
    }

    @Override // flm.bpo
    public final void a(Context context, Intent intent) {
        btv.c("Persistent", "onReceive:%s", intent);
        String action = intent.getAction();
        if (action != null) {
            Intent intentA = bta.a(context, UsageCheckingIntentOperation.class, action);
            if (intentA != null) {
                context.startService(intentA);
            }
            Intent intentA2 = bta.a(context, KidsSystemIntentOperation.class, action);
            if (intentA2 != null) {
                context.startService(intentA2);
            }
        }
    }
}

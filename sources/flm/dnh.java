package flm;

import android.content.Context;
import android.content.IntentFilter;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dnh extends dlw {
    @Override // flm.dlw
    public final void a(Context context, dmb dmbVar) {
        dni dniVar = new dni(context);
        a(dniVar);
        if (this.a) {
            return;
        }
        context.registerReceiver(new dnf(this, dniVar, dmbVar), new IntentFilter("com.google.gservices.intent.action.GSERVICES_CHANGED"));
    }
}

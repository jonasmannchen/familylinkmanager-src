package flm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class axf extends BroadcastReceiver {
    public Context a;
    private final axg b;

    public axf(axg axgVar) {
        this.b = axgVar;
    }

    public final synchronized void a() {
        if (this.a != null) {
            this.a.unregisterReceiver(this);
        }
        this.a = null;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        String schemeSpecificPart = null;
        if (data != null) {
            schemeSpecificPart = data.getSchemeSpecificPart();
        }
        if ("com.google.android.gms".equals(schemeSpecificPart)) {
            this.b.a();
            a();
        }
    }
}

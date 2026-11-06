package flm;

import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.os.Build;
import android.util.Log;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class fvl extends ftt {
    public final ftt a;
    public final Context b;
    public final ConnectivityManager c;

    fvl(ftt fttVar, Context context) {
        new Object();
        this.a = fttVar;
        this.b = context;
        if (context == null) {
            this.c = null;
            return;
        }
        this.c = (ConnectivityManager) context.getSystemService("connectivity");
        try {
            if (Build.VERSION.SDK_INT < 24 || this.c == null) {
                fvp fvpVar = new fvp(this);
                this.b.registerReceiver(fvpVar, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                new fvn(this, fvpVar);
            } else {
                fvo fvoVar = new fvo(this);
                this.c.registerDefaultNetworkCallback(fvoVar);
                new fvm(this, fvoVar);
            }
        } catch (SecurityException e) {
            Log.w("AndroidChannelBuilder", "Failed to configure network monitoring. Does app have ACCESS_NETWORK_STATE permission?", e);
        }
    }

    @Override // flm.frl
    public final frm a(fuf fufVar, frj frjVar) {
        return this.a.a(fufVar, frjVar);
    }

    @Override // flm.frl
    public final String a() {
        return this.a.a();
    }

    @Override // flm.ftt
    public final void c() {
        this.a.c();
    }

    @Override // flm.ftt
    public final void d() {
        this.a.d();
    }
}

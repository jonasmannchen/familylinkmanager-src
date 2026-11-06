package flm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class fvp extends BroadcastReceiver {
    private boolean a = false;
    private final /* synthetic */ fvl b;

    fvp(fvl fvlVar) {
        this.b = fvlVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        boolean z = this.a;
        this.a = activeNetworkInfo != null && activeNetworkInfo.isConnected();
        if (this.a && !z) {
            this.b.a.c();
        }
    }
}

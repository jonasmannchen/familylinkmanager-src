package flm;

import android.annotation.TargetApi;
import android.net.ConnectivityManager;
import android.net.Network;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@TargetApi(24)
final class fvo extends ConnectivityManager.NetworkCallback {
    private boolean a = false;
    private final /* synthetic */ fvl b;

    fvo(fvl fvlVar) {
        this.b = fvlVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        if (this.a) {
            this.b.a.d();
        } else {
            this.b.a.c();
        }
        this.a = true;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        this.a = false;
    }
}

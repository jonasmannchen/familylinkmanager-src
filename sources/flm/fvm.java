package flm;

import android.annotation.TargetApi;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class fvm implements Runnable {
    private final /* synthetic */ fvo a;
    private final /* synthetic */ fvl b;

    fvm(fvl fvlVar, fvo fvoVar) {
        this.b = fvlVar;
        this.a = fvoVar;
    }

    @Override // java.lang.Runnable
    @TargetApi(21)
    public final void run() {
        this.b.c.unregisterNetworkCallback(this.a);
    }
}

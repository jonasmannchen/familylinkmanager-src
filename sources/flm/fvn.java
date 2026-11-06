package flm;

import android.annotation.TargetApi;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class fvn implements Runnable {
    private final /* synthetic */ fvp a;
    private final /* synthetic */ fvl b;

    fvn(fvl fvlVar, fvp fvpVar) {
        this.b = fvlVar;
        this.a = fvpVar;
    }

    @Override // java.lang.Runnable
    @TargetApi(21)
    public final void run() {
        this.b.b.unregisterReceiver(this.a);
    }
}

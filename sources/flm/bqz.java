package flm;

import android.util.Log;
import android.util.Pair;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class bqz implements Runnable {
    private final /* synthetic */ bqy a;

    bqz(bqy bqyVar) {
        this.a = bqyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a.a()) {
            Log.w("gH_GetSyncHelpPsd", "Getting sync help psd timed out.");
            new bqm(this.a.a).a(bih.a(1, Pair.create("gms:googlehelp:sync_help_psd_failure", "timeout")));
            this.a.b.a(this.a.a);
        }
    }
}

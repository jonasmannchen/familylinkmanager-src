package flm;

import android.os.Looper;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.googlehelp.GoogleHelp;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bqy implements Runnable {
    public final GoogleHelp a;
    public final bra b;
    private final bql c;
    private boolean d;

    public bqy(GoogleHelp googleHelp, bql bqlVar, bra braVar) {
        this.a = googleHelp;
        this.c = bqlVar;
        this.b = braVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.d = false;
        cqr cqrVar = new cqr(Looper.getMainLooper());
        bqz bqzVar = new bqz(this);
        cqrVar.postDelayed(bqzVar, new bqm(this.a).a.D);
        try {
            new bnr().a();
            throw new NoSuchMethodError();
        } catch (Exception e) {
            Log.w("gH_GetSyncHelpPsd", "Failed to get sync help psd.", e);
            List listA = bih.a(1, Pair.create("gms:googlehelp:sync_help_psd_failure", "exception"));
            if (a()) {
                cqrVar.removeCallbacks(bqzVar);
                new bqm(this.a).a(listA);
                this.b.a(this.a);
            }
        }
    }

    final synchronized boolean a() {
        boolean z = true;
        synchronized (this) {
            if (this.d) {
                z = false;
            } else {
                this.d = true;
            }
        }
        return z;
    }
}

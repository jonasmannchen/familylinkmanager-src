package flm;

import android.util.Log;
import java.util.Collections;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class axd implements Runnable {
    private final /* synthetic */ apx a;
    private final /* synthetic */ axc b;

    axd(axc axcVar, apx apxVar) {
        this.b = axcVar;
        this.a = apxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.a.b()) {
            ((awv) this.b.d.l.get(this.b.b)).a(this.a);
            return;
        }
        this.b.c = true;
        if (this.b.a.requiresSignIn()) {
            this.b.a();
            return;
        }
        try {
            this.b.a.getRemoteService(null, Collections.emptySet());
        } catch (SecurityException e) {
            Log.e("GoogleApiManager", "Failed to get service from broker. ", e);
            ((awv) this.b.d.l.get(this.b.b)).a(new apx(10));
        }
    }
}

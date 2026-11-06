package flm;

import android.util.Log;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class axc implements ayd, bao {
    public final ate a;
    public final aup b;
    public final /* synthetic */ awt d;
    private bcd e = null;
    private Set f = null;
    public boolean c = false;

    public axc(awt awtVar, ate ateVar, aup aupVar) {
        this.d = awtVar;
        this.a = ateVar;
        this.b = aupVar;
    }

    @Override // flm.bao
    public final void onReportServiceBinding(apx apxVar) {
        this.d.o.post(new axd(this, apxVar));
    }

    @Override // flm.ayd
    public final void a(apx apxVar) {
        awv awvVar = (awv) this.d.l.get(this.b);
        bdi.checkHandlerThread(awvVar.i.o);
        awvVar.b.disconnect();
        awvVar.a(apxVar);
    }

    @Override // flm.ayd
    public final void a(bcd bcdVar, Set set) {
        if (bcdVar == null || set == null) {
            Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
            a(new apx(4));
        } else {
            this.e = bcdVar;
            this.f = set;
            a();
        }
    }

    final void a() {
        if (this.c && this.e != null) {
            this.a.getRemoteService(this.e, this.f);
        }
    }
}

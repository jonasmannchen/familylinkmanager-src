package flm;

import android.content.Context;
import android.os.Looper;
import android.util.Log;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class csw extends csa {
    public final csq b;

    public csw(Context context, Looper looper, atr atrVar, ats atsVar, String str, bba bbaVar) {
        super(context, looper, atrVar, atsVar, str, bbaVar);
        this.b = new csq(context, this.a);
    }

    @Override // flm.bai, flm.ate
    public final void disconnect() {
        synchronized (this.b) {
            if (isConnected()) {
                try {
                    csq csqVar = this.b;
                    synchronized (csqVar.d) {
                        for (csv csvVar : csqVar.d.values()) {
                            if (csvVar != null) {
                                ((csn) csqVar.a.b()).a(new csz(2, null, csvVar.asBinder(), null, null, null));
                            }
                        }
                        csqVar.d.clear();
                    }
                    synchronized (csqVar.f) {
                        for (csr csrVar : csqVar.f.values()) {
                            if (csrVar != null) {
                                ((csn) csqVar.a.b()).a(csz.a(csrVar, null));
                            }
                        }
                        csqVar.f.clear();
                    }
                    synchronized (csqVar.e) {
                        for (csu csuVar : csqVar.e.values()) {
                            if (csuVar != null) {
                                ((csn) csqVar.a.b()).a(new cse(2, null, csuVar.asBinder(), null));
                            }
                        }
                        csqVar.e.clear();
                    }
                    csq csqVar2 = this.b;
                    if (csqVar2.c) {
                        csqVar2.a.a();
                        ((csn) csqVar2.a.b()).a(false);
                        csqVar2.c = false;
                    }
                } catch (Exception e) {
                    Log.e("LocationClientImpl", "Client disconnected before listeners could be cleaned up", e);
                }
            }
            super.disconnect();
        }
    }
}

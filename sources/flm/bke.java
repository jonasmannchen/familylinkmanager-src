package flm;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bke extends bkv {
    public static final alf a = new bkf();
    public bjq b;
    public Handler c;
    public final Object d = new Object();

    bke(bjq bjqVar, Looper looper) {
        this.b = (bjq) bdi.checkNotNull(bjqVar);
        Looper looper2 = (Looper) bdi.checkNotNull(looper);
        this.c = bki.a == null ? ala.a.a(looper2) : bki.a.a(looper2);
    }

    @Override // flm.bku
    public final void a(bjk bjkVar) {
        synchronized (this.d) {
            if (this.c != null && this.b != null) {
                this.c.post(new bkg(this, bjkVar));
            }
        }
    }
}

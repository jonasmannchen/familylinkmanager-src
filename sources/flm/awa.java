package flm;

import android.os.Looper;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class awa implements bao {
    public final boolean a;
    private final WeakReference b;
    private final asw c;

    public awa(avy avyVar, asw aswVar, boolean z) {
        this.b = new WeakReference(avyVar);
        this.c = aswVar;
        this.a = z;
    }

    @Override // flm.bao
    public final void onReportServiceBinding(apx apxVar) {
        avy avyVar = (avy) this.b.get();
        if (avyVar != null) {
            bdi.checkState(Looper.myLooper() == avyVar.a.m.a(), "onReportServiceBinding must be called on the GoogleApiClient handler thread");
            avyVar.b.lock();
            try {
                if (avyVar.b(0)) {
                    if (!apxVar.b()) {
                        avyVar.b(apxVar, this.c, this.a);
                    }
                    if (avyVar.d()) {
                        avyVar.e();
                    }
                }
            } finally {
                avyVar.b.unlock();
            }
        }
    }
}

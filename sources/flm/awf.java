package flm;

import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class awf extends czu {
    private final WeakReference a;

    awf(avy avyVar) {
        this.a = new WeakReference(avyVar);
    }

    @Override // flm.czu, flm.czv
    public final void a(dad dadVar) {
        avy avyVar = (avy) this.a.get();
        if (avyVar != null) {
            avyVar.a.a(new awg(avyVar, avyVar, dadVar));
        }
    }
}

package flm;

import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class awn extends axg {
    private WeakReference a;

    awn(awk awkVar) {
        this.a = new WeakReference(awkVar);
    }

    @Override // flm.axg
    public final void a() {
        awk awkVar = (awk) this.a.get();
        if (awkVar != null) {
            awkVar.e();
        }
    }
}

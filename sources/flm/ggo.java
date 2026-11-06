package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ggo extends ggm {
    ggo() {
    }

    @Override // flm.ggm
    public final boolean a(ggl gglVar, int i, int i2) {
        boolean z;
        synchronized (gglVar) {
            if (gglVar.a == 0) {
                gglVar.a = -1;
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    @Override // flm.ggm
    public final void a(ggl gglVar, int i) {
        synchronized (gglVar) {
            gglVar.a = 0;
        }
    }
}

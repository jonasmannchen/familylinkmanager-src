package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class xa implements zz {
    private boolean a;
    private final /* synthetic */ wx b;

    xa(wx wxVar) {
        this.b = wxVar;
    }

    @Override // flm.zz
    public final boolean a(zi ziVar) {
        if (this.b.c == null) {
            return false;
        }
        this.b.c.onMenuOpened(108, ziVar);
        return true;
    }

    @Override // flm.zz
    public final void a(zi ziVar, boolean z) {
        if (!this.a) {
            this.a = true;
            this.b.a.m();
            if (this.b.c != null) {
                this.b.c.onPanelClosed(108, ziVar);
            }
            this.a = false;
        }
    }
}

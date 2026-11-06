package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class we implements acz {
    private final /* synthetic */ wb a;

    we(wb wbVar) {
        this.a = wbVar;
    }

    @Override // flm.acz
    public final void a() {
    }

    @Override // flm.acz
    public final void b() {
        wb wbVar = this.a;
        if (wbVar.e != null) {
            wbVar.e.i();
        }
        if (wbVar.h != null) {
            wbVar.c.getDecorView().removeCallbacks(wbVar.i);
            if (wbVar.h.isShowing()) {
                try {
                    wbVar.h.dismiss();
                } catch (IllegalArgumentException e) {
                }
            }
            wbVar.h = null;
        }
        wbVar.m();
        wq wqVarD = wbVar.d(0);
        if (wqVarD != null && wqVarD.h != null) {
            wqVarD.h.close();
        }
    }
}

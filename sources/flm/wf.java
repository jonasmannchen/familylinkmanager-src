package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class wf implements Runnable {
    public final /* synthetic */ wb a;

    wf(wb wbVar) {
        this.a = wbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.h.showAtLocation(this.a.g, 55, 0, 0);
        this.a.m();
        if (!this.a.l()) {
            this.a.g.setAlpha(1.0f);
            this.a.g.setVisibility(0);
        } else {
            this.a.g.setAlpha(0.0f);
            this.a.j = ti.l(this.a.g).a(1.0f);
            this.a.j.a(new wg(this));
        }
    }
}

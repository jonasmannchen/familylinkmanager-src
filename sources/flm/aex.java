package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class aex implements Runnable {
    private final /* synthetic */ aeq a;

    aex(aeq aeqVar) {
        this.a = aeqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a.e != null && ti.z(this.a.e) && this.a.e.getCount() > this.a.e.getChildCount() && this.a.e.getChildCount() <= this.a.k) {
            this.a.s.setInputMethodMode(2);
            this.a.b();
        }
    }
}

package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dmc implements dmb {
    private volatile dmb a;
    private volatile Object b;

    public dmc(dmb dmbVar) {
        this.a = dmbVar;
    }

    @Override // flm.dmb
    public final Object a() {
        if (this.b == null) {
            synchronized (this) {
                if (this.b == null) {
                    this.b = this.a.a();
                    this.a = null;
                }
            }
        }
        return this.b;
    }
}

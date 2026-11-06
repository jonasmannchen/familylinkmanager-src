package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class sm extends sl {
    private final Object a;

    public sm(int i) {
        super(12);
        this.a = new Object();
    }

    @Override // flm.sl, flm.sk
    public final Object a() {
        Object objA;
        synchronized (this.a) {
            objA = super.a();
        }
        return objA;
    }

    @Override // flm.sl, flm.sk
    public final boolean a(Object obj) {
        boolean zA;
        synchronized (this.a) {
            zA = super.a(obj);
        }
        return zA;
    }
}

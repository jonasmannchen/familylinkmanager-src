package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dtl {
    private static final dtl d = new dtl(dp.aa, null, true);
    private static final dtl e = new dtl(dp.Z, null, true);
    public final int a;
    public boolean b;
    private final Object c;

    static dtl a(int i) {
        switch (i - 1) {
            case 1:
                return e;
            case 2:
                return d;
            default:
                throw new IllegalArgumentException();
        }
    }

    dtl(int i, Object obj, boolean z) {
        this.b = false;
        this.a = i;
        this.c = obj;
        this.b = z;
    }

    public final Object a() {
        if (!this.b || this.a != dp.Y) {
            throw new IllegalStateException("Calling get() without checking if the extra is present is an error");
        }
        return this.c;
    }

    public final boolean b() {
        this.b = true;
        return this.a == dp.Y;
    }
}

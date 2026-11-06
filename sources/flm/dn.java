package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dn implements dm {
    private final Object[] a = new Object[256];
    private int b;

    dn(int i) {
    }

    @Override // flm.dm
    public final Object a() {
        if (this.b <= 0) {
            return null;
        }
        int i = this.b - 1;
        Object obj = this.a[i];
        this.a[i] = null;
        this.b--;
        return obj;
    }

    @Override // flm.dm
    public final boolean a(Object obj) {
        if (this.b >= this.a.length) {
            return false;
        }
        this.a[this.b] = obj;
        this.b++;
        return true;
    }

    @Override // flm.dm
    public final void a(Object[] objArr, int i) {
        if (i > objArr.length) {
            i = objArr.length;
        }
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = objArr[i2];
            if (this.b < this.a.length) {
                this.a[this.b] = obj;
                this.b++;
            }
        }
    }
}

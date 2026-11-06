package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dom implements dol {
    public int a;
    public Object b;
    private final Object[] c;
    private final int[] d;
    private int e;

    dom(int[] iArr, Object[] objArr) {
        this.d = iArr;
        this.c = objArr;
    }

    @Override // flm.dol
    public final boolean a() {
        this.b = null;
        while (true) {
            if ((this.b != null && this.b != dok.a) || this.e >= this.c.length) {
                break;
            }
            Object[] objArr = this.c;
            int i = this.e;
            this.e = i + 1;
            this.b = objArr[i];
        }
        if (this.e > 0) {
            this.a = this.d[this.e - 1];
        }
        return (this.b == null || this.b == dok.a) ? false : true;
    }

    @Override // flm.dol
    public final Object b() {
        return this.b;
    }
}

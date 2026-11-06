package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gkk {
    public int a;
    public int b;
    public int c;
    public final int[] d = new int[10];

    public final boolean a(int i) {
        return ((1 << i) & this.a) != 0;
    }

    final int a() {
        if ((this.a & 2) != 0) {
            return this.d[1];
        }
        return -1;
    }
}

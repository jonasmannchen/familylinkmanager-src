package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class gkj {
    public final gkj[] a;
    public final int b;
    public final int c;

    gkj() {
        this.a = new gkj[256];
        this.b = 0;
        this.c = 0;
    }

    gkj(int i, int i2) {
        this.a = null;
        this.b = i;
        int i3 = i2 & 7;
        this.c = i3 == 0 ? 8 : i3;
    }
}

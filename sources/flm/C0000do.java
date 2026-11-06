package flm;

/* JADX INFO: renamed from: flm.do, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C0000do {
    public float d;
    public int f;
    private String i;
    public int a = -1;
    public int b = -1;
    public int c = 0;
    public float[] e = new float[6];
    public di[] g = new di[8];
    public int h = 0;

    public C0000do(int i) {
        this.f = i;
    }

    final void a(di diVar) {
        for (int i = 0; i < this.h; i++) {
            if (this.g[i] == diVar) {
                for (int i2 = 0; i2 < (this.h - i) - 1; i2++) {
                    this.g[i + i2] = this.g[i + i2 + 1];
                }
                this.h--;
                return;
            }
        }
    }

    public final void a() {
        this.i = null;
        this.f = dp.d;
        this.c = 0;
        this.a = -1;
        this.b = -1;
        this.d = 0.0f;
        this.h = 0;
    }

    public final String toString() {
        return "" + ((String) null);
    }
}

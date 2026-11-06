package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ul {
    public int a;
    public int b;
    public float c;
    public float d;
    public float j;
    public int k;
    public long e = Long.MIN_VALUE;
    public long i = -1;
    public long f = 0;
    public int g = 0;
    public int h = 0;

    ul() {
    }

    final float a(long j) {
        if (j < this.e) {
            return 0.0f;
        }
        if (this.i < 0 || j < this.i) {
            return uk.a((j - this.e) / this.a, 0.0f, 1.0f) * 0.5f;
        }
        return (uk.a((j - this.i) / this.k, 0.0f, 1.0f) * this.j) + (1.0f - this.j);
    }
}

package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class bes {
    private final dfh a;
    private final long b;
    private final long c;
    private long d;

    bes(dfh dfhVar, int i, int i2, int i3) {
        this.a = dfhVar;
        this.b = ((long) i) * 1000;
        this.c = ((long) i3) * this.b;
        this.d = dfhVar.b() + (((long) (1 - i2)) * this.b);
    }

    final boolean a() {
        synchronized (this) {
            long jB = this.a.b();
            if (jB < this.d) {
                return false;
            }
            this.d = Math.max(this.d, jB - this.c) + this.b;
            return true;
        }
    }
}

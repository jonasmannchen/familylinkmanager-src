package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class xd {
    public static xd a;
    public long b;
    public long c;
    public int d;

    xd() {
    }

    public final void a(long j, double d, double d2) {
        float f = (j - 946728000000L) / 8.64E7f;
        float f2 = 6.24006f + (0.01720197f * f);
        double dSin = ((double) f2) + (0.03341960161924362d * Math.sin(f2)) + (3.4906598739326E-4d * Math.sin(2.0f * f2)) + (5.236000106378924E-6d * Math.sin(3.0f * f2)) + 1.796593063d + 3.141592653589793d;
        double d3 = (-d2) / 360.0d;
        double dSin2 = (Math.sin(f2) * 0.0053d) + d3 + ((double) (Math.round(((double) (f - 9.0E-4f)) - d3) + 9.0E-4f)) + ((-0.0069d) * Math.sin(2.0d * dSin));
        double dAsin = Math.asin(Math.sin(dSin) * Math.sin(0.4092797040939331d));
        double d4 = 0.01745329238474369d * d;
        double dSin3 = (Math.sin(-0.10471975803375244d) - (Math.sin(d4) * Math.sin(dAsin))) / (Math.cos(dAsin) * Math.cos(d4));
        if (dSin3 >= 1.0d) {
            this.d = 1;
            this.b = -1L;
            this.c = -1L;
        } else {
            if (dSin3 <= -1.0d) {
                this.d = 0;
                this.b = -1L;
                this.c = -1L;
                return;
            }
            float fAcos = (float) (Math.acos(dSin3) / 6.283185307179586d);
            this.b = Math.round((((double) fAcos) + dSin2) * 8.64E7d) + 946728000000L;
            this.c = Math.round((dSin2 - ((double) fAcos)) * 8.64E7d) + 946728000000L;
            if (this.c >= j || this.b <= j) {
                this.d = 1;
            } else {
                this.d = 0;
            }
        }
    }
}

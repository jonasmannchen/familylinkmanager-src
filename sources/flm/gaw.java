package flm;

import java.util.Random;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gaw implements fxo {
    private Random a = new Random();
    private long b = TimeUnit.SECONDS.toNanos(1);
    private long c = TimeUnit.MINUTES.toNanos(2);
    private double d = 1.6d;
    private double e = 0.2d;
    private long f = this.b;

    @Override // flm.fxo
    public final long a() {
        long j = this.f;
        this.f = Math.min((long) (j * this.d), this.c);
        double d = j * (-this.e);
        double d2 = j * this.e;
        dvl.a(d2 >= d);
        return ((long) (((d2 - d) * this.a.nextDouble()) + d)) + j;
    }
}

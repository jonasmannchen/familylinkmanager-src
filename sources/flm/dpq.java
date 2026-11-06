package flm;

import android.os.SystemClock;
import java.util.Random;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dpq {
    private final float a;
    private final Random b;

    public dpq(float f) {
        this(f, new Random(SystemClock.elapsedRealtime()));
    }

    private dpq(float f, Random random) {
        dse.a(f >= 0.0f && f <= 1.0f, "Sampling rate should be a floating number >= 0 and <= 1.");
        this.a = f;
        this.b = random;
    }

    public final boolean a() {
        return this.b.nextFloat() < this.a;
    }
}

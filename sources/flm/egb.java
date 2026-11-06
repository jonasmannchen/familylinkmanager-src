package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class egb {
    public static final egb a;
    public static final egb b;
    public final boolean c;
    public final Throwable d;

    egb(boolean z, Throwable th) {
        this.c = z;
        this.d = th;
    }

    static {
        if (efz.a) {
            b = null;
            a = null;
        } else {
            b = new egb(false, null);
            a = new egb(true, null);
        }
    }
}

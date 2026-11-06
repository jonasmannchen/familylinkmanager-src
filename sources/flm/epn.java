package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class epn {
    public abstract boolean a();

    public abstract boolean b();

    public abstract long c();

    public static epn a(long j) {
        return new epj(true, true, j);
    }

    public static epn b(long j) {
        return new epj(false, true, j);
    }
}

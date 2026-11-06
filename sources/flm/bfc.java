package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bfc {
    private static bfe a;

    public static synchronized bfe a() {
        if (a == null) {
            a = new bfd();
        }
        return a;
    }
}

package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class btx {
    public static long a(long j, Long... lArr) {
        long jLongValue = j;
        for (Long l : lArr) {
            if (l != null && l.longValue() > jLongValue) {
                jLongValue = l.longValue();
            }
        }
        return jLongValue;
    }
}

package flm;

import java.util.TimeZone;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class aoj {
    public static long a(long j) {
        return TimeZone.getDefault().getOffset(j) / 1000;
    }
}

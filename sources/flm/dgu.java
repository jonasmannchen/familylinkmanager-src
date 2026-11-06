package flm;

import android.content.Context;
import android.provider.Settings;
import java.util.Objects;
import java.util.Random;
import java.util.TreeSet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dgu {
    public final dfh a;
    private final int b;
    private final double c;
    private final String d;
    private final String e;

    dgu(dfh dfhVar, double d, int i, String str, Context context) {
        this.a = dfhVar;
        this.c = d;
        this.b = i;
        this.d = str;
        this.e = Settings.Secure.getString(context.getContentResolver(), "android_id");
    }

    final Long a(long j) {
        int iMin;
        Long l;
        while (true) {
            Random random = new Random(Objects.hash(Long.valueOf(j), this.e, this.d));
            double dNextDouble = random.nextDouble();
            if (this.c >= 1.0d) {
                iMin = (int) Math.min(Math.round(dNextDouble * 2.0d * this.c), 2147483646L);
            } else if (dNextDouble < this.c) {
                iMin = 1;
            } else {
                iMin = 0;
            }
            long j2 = 31557600000L + j;
            long j3 = (j2 - j) - ((long) (this.b << 1));
            TreeSet treeSet = new TreeSet();
            while (treeSet.size() < iMin) {
                long jAbs = (Math.abs(Math.max(random.nextLong(), -9223372036854775807L)) % j3) + j;
                long j4 = ((long) this.b) << 1;
                if (treeSet.subSet(Long.valueOf(jAbs - j4), Long.valueOf(j4 + jAbs)).isEmpty()) {
                    treeSet.add(Long.valueOf(jAbs));
                }
            }
            l = (Long) treeSet.ceiling(Long.valueOf(this.a.a() + 100));
            if (l != null || j >= this.a.a()) {
                break;
            }
            j = j2;
        }
        return l;
    }
}

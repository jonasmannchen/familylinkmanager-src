package flm;

import java.util.HashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class glh extends gll {
    glh() {
        new HashMap();
    }

    static {
        if (0 < -315576000000L) {
            throw new IllegalArgumentException(new StringBuilder(68).append("'seconds' is less than minimum (-315576000000): 0").toString());
        }
        if (0 > 315576000000L) {
            throw new IllegalArgumentException(new StringBuilder(70).append("'seconds' is greater than maximum (315576000000): 0").toString());
        }
        new gkr(0L, 0);
    }
}

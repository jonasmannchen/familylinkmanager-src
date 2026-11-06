package flm;

import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fxg {
    public static final Logger a = Logger.getLogger(fxg.class.getName());
    public final String b;
    public final AtomicLong c = new AtomicLong();

    public fxg(String str, long j) {
        dvl.a(j > 0, "value must be positive");
        this.b = str;
        this.c.set(j);
    }
}

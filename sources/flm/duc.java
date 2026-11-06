package flm;

import java.util.Collections;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class duc {
    public static Runnable a(Runnable runnable) {
        return new dud(duj.c(), runnable);
    }

    public static Callable a(Callable callable) {
        return new due(duj.c(), callable);
    }

    static {
        new AtomicInteger();
        Collections.synchronizedMap(new HashMap());
    }
}

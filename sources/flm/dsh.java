package flm;

import java.lang.ref.ReferenceQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dsh {
    public static final ConcurrentHashMap a = new ConcurrentHashMap();
    public final ExecutorService c;
    public final ReferenceQueue b = new ReferenceQueue();
    public final AtomicBoolean d = new AtomicBoolean(false);

    public dsh(ExecutorService executorService) {
        this.c = executorService;
    }
}

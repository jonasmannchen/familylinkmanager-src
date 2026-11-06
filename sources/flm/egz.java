package flm;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public interface egz extends egy, ScheduledExecutorService {
    egx a(Runnable runnable, long j, TimeUnit timeUnit);

    egx a(Callable callable, long j, TimeUnit timeUnit);
}

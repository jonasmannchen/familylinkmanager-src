package flm;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class gbk implements gha {
    gbk() {
    }

    private static ScheduledExecutorService b() {
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, gbh.a("grpc-timer-%d", true));
        try {
            scheduledExecutorServiceNewScheduledThreadPool.getClass().getMethod("setRemoveOnCancelPolicy", Boolean.TYPE).invoke(scheduledExecutorServiceNewScheduledThreadPool, true);
        } catch (NoSuchMethodException e) {
        } catch (RuntimeException e2) {
            throw e2;
        } catch (Exception e3) {
            throw new RuntimeException(e3);
        }
        return scheduledExecutorServiceNewScheduledThreadPool;
    }

    @Override // flm.gha
    public final /* synthetic */ void a(Object obj) {
        ((ScheduledExecutorService) obj).shutdown();
    }

    @Override // flm.gha
    public final /* synthetic */ Object a() {
        return b();
    }
}

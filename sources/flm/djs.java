package flm;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class djs implements dmb {
    private final /* synthetic */ ScheduledExecutorService a;
    private final /* synthetic */ int b;
    private final /* synthetic */ int c;

    djs(ScheduledExecutorService scheduledExecutorService, int i, int i2) {
        this.a = scheduledExecutorService;
        this.b = i;
        this.c = i2;
    }

    @Override // flm.dmb
    public final /* synthetic */ Object a() {
        ScheduledExecutorService scheduledExecutorService;
        if (this.a != null) {
            scheduledExecutorService = this.a;
        } else {
            int i = this.b;
            int i2 = this.c;
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(i2, new djw(i), new dju());
            scheduledThreadPoolExecutor.setMaximumPoolSize(i2);
            scheduledExecutorService = scheduledThreadPoolExecutor;
        }
        return new dkv(scheduledExecutorService, new djt());
    }
}

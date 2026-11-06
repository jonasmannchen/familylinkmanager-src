package flm;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dlh {
    public final ScheduledExecutorService a;
    public final int b;
    public final int c;
    public final int d;
    public final dlk e;
    public final dli f;
    public final boolean g;

    dlh(ScheduledExecutorService scheduledExecutorService, int i, int i2, int i3, dlk dlkVar, dli dliVar, boolean z) {
        this.a = scheduledExecutorService;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = dlkVar;
        this.f = dliVar;
        this.g = z;
    }

    public static dlj a() {
        return new dlj();
    }
}

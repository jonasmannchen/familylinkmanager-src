package flm;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ggx implements ghb {
    ggx() {
    }

    @Override // flm.ghb
    public final ScheduledExecutorService a() {
        return Executors.newSingleThreadScheduledExecutor(gbh.a("grpc-shared-destroyer-%d", true));
    }
}

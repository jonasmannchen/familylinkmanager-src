package flm;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class gif implements gha {
    gif() {
    }

    @Override // flm.gha
    public final /* synthetic */ void a(Object obj) {
        ((ExecutorService) obj).shutdown();
    }

    @Override // flm.gha
    public final /* synthetic */ Object a() {
        return Executors.newCachedThreadPool(gbh.a("grpc-okhttp-%d", true));
    }
}

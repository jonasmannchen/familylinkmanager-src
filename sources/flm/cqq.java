package flm;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class cqq implements cqo {
    cqq() {
    }

    @Override // flm.cqo
    public final ExecutorService a(int i, ThreadFactory threadFactory) {
        return Executors.newFixedThreadPool(2, threadFactory);
    }
}

package flm;

import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dju implements RejectedExecutionHandler {
    dju() {
    }

    @Override // java.util.concurrent.RejectedExecutionHandler
    public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        String strValueOf = String.valueOf(runnable);
        dkm.a(3, "PrimesExecutors", new StringBuilder(String.valueOf(strValueOf).length() + 30).append("Service rejected execution of ").append(strValueOf).toString(), new Object[0]);
    }
}

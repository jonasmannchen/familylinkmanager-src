package com.google.android.gms.common.threads.internal;

import flm.bjg;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class GlobalExecutorsImpl {
    private static final ThreadPoolExecutor a = new ThreadPoolExecutor(4, Integer.MAX_VALUE, 10, TimeUnit.SECONDS, new SynchronousQueue(), new bjg("lowpool", 10));
    private static final ThreadPoolExecutor b = new ThreadPoolExecutor(4, Integer.MAX_VALUE, 10, TimeUnit.SECONDS, new SynchronousQueue(), new bjg("highpool", 9));

    public static ThreadPoolExecutor getPool(int i) {
        switch (i) {
            case 9:
                return b;
            case 10:
                return a;
            default:
                throw new IllegalArgumentException(new StringBuilder(31).append("Unexpected priority ").append(i).toString());
        }
    }

    private GlobalExecutorsImpl() {
    }
}

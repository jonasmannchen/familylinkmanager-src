package flm;

import android.net.NetworkInfo;
import android.net.TrafficStats;
import com.google.android.gms.common.stats.radio.NetworkActivityEvent;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bfj extends bhl {
    private int j;
    private int k;

    public bfj(int i, int i2) {
        super(Integer.MAX_VALUE, 10);
        this.j = i;
        this.k = i2;
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    protected final void beforeExecute(Thread thread, Runnable runnable) {
        int i = this.k;
        int i2 = this.j;
        TrafficStats.setThreadStatsTag(bfi.a(i));
        if (i2 == -1) {
            TrafficStats.clearThreadStatsUid();
        } else {
            TrafficStats.setThreadStatsUid(i2);
        }
        if (((fpn) fpm.a.a()).a()) {
            NetworkInfo networkInfoA = biu.a(bfi.a());
            bfi.a().getNetworkActivityLogger().logAsync(new NetworkActivityEvent(bij.a.a(), networkInfoA != null ? networkInfoA.getType() : -1, i, bfi.b(), biu.b(bfi.a())));
        }
        super.beforeExecute(thread, runnable);
    }
}

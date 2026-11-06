package flm;

import com.android.volley.CacheDispatcher;
import com.android.volley.Request;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ajr implements Runnable {
    private final /* synthetic */ Request a;
    private final /* synthetic */ CacheDispatcher b;

    public ajr(CacheDispatcher cacheDispatcher, Request request) {
        this.b = cacheDispatcher;
        this.a = request;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.b.a.put(this.a);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

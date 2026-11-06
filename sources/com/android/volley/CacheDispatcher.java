package com.android.volley;

import android.os.Process;
import flm.ajr;
import flm.ajs;
import java.util.concurrent.BlockingQueue;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class CacheDispatcher extends Thread {
    private static final boolean c = VolleyLog.DEBUG;
    public final BlockingQueue a;
    public final ResponseDelivery b;
    private final BlockingQueue d;
    private final Cache e;
    private volatile boolean f = false;
    private final ajs g = new ajs(this);

    public CacheDispatcher(BlockingQueue blockingQueue, BlockingQueue blockingQueue2, Cache cache, ResponseDelivery responseDelivery) {
        this.d = blockingQueue;
        this.a = blockingQueue2;
        this.e = cache;
        this.b = responseDelivery;
    }

    public void quit() {
        this.f = true;
        interrupt();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        if (c) {
            VolleyLog.v("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        this.e.initialize();
        while (true) {
            try {
                a();
            } catch (InterruptedException e) {
                if (this.f) {
                    Thread.currentThread().interrupt();
                    return;
                }
                VolleyLog.e("Ignoring spurious interrupt of CacheDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }

    private void a() throws InterruptedException {
        Request request = (Request) this.d.take();
        request.addMarker("cache-queue-take");
        if (request.isCanceled()) {
            request.a("cache-discard-canceled");
            return;
        }
        Cache.Entry entry = this.e.get(request.getCacheKey());
        if (entry == null) {
            request.addMarker("cache-miss");
            if (!this.g.b(request)) {
                this.a.put(request);
                return;
            }
            return;
        }
        if (entry.isExpired()) {
            request.addMarker("cache-hit-expired");
            request.setCacheEntry(entry);
            if (!this.g.b(request)) {
                this.a.put(request);
                return;
            }
            return;
        }
        request.addMarker("cache-hit");
        Response responseA = request.a(new NetworkResponse(entry.data, entry.responseHeaders));
        request.addMarker("cache-hit-parsed");
        if (!entry.refreshNeeded()) {
            this.b.postResponse(request, responseA);
            return;
        }
        request.addMarker("cache-hit-refresh-needed");
        request.setCacheEntry(entry);
        responseA.intermediate = true;
        if (!this.g.b(request)) {
            this.b.postResponse(request, responseA, new ajr(this, request));
        } else {
            this.b.postResponse(request, responseA);
        }
    }
}

package com.android.volley;

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.BlockingQueue;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class NetworkDispatcher extends Thread {
    private final BlockingQueue a;
    private final Network b;
    private final Cache c;
    private final ResponseDelivery d;
    private volatile boolean e = false;

    public NetworkDispatcher(BlockingQueue blockingQueue, Network network, Cache cache, ResponseDelivery responseDelivery) {
        this.a = blockingQueue;
        this.b = network;
        this.c = cache;
        this.d = responseDelivery;
    }

    public void quit() {
        this.e = true;
        interrupt();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                a();
            } catch (InterruptedException e) {
                if (this.e) {
                    Thread.currentThread().interrupt();
                    return;
                }
                VolleyLog.e("Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }

    private void a() {
        Request request = (Request) this.a.take();
        SystemClock.elapsedRealtime();
        try {
            request.addMarker("network-queue-take");
            if (request.isCanceled()) {
                request.a("network-discard-cancelled");
                request.a();
                return;
            }
            TrafficStats.setThreadStatsTag(request.getTrafficStatsTag());
            NetworkResponse networkResponsePerformRequest = this.b.performRequest(request);
            request.addMarker("network-http-complete");
            if (networkResponsePerformRequest.notModified && request.hasHadResponseDelivered()) {
                request.a("not-modified");
                request.a();
                return;
            }
            Response responseA = request.a(networkResponsePerformRequest);
            request.addMarker("network-parse-complete");
            if (request.shouldCache() && responseA.cacheEntry != null) {
                this.c.put(request.getCacheKey(), responseA.cacheEntry);
                request.addMarker("network-cache-written");
            }
            request.markDelivered();
            this.d.postResponse(request, responseA);
            request.a(responseA);
        } catch (VolleyError e) {
            SystemClock.elapsedRealtime();
            this.d.postError(request, e);
            request.a();
        } catch (Exception e2) {
            VolleyLog.e(e2, "Unhandled exception %s", e2.toString());
            VolleyError volleyError = new VolleyError(e2);
            SystemClock.elapsedRealtime();
            this.d.postError(request, volleyError);
            request.a();
        }
    }
}

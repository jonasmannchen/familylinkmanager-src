package com.android.volley;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class RequestQueue {
    public final Set a;
    public final List b;
    private final AtomicInteger c;
    private final PriorityBlockingQueue d;
    private final PriorityBlockingQueue e;
    private final Cache f;
    private final Network g;
    private final ResponseDelivery h;
    private final NetworkDispatcher[] i;
    private CacheDispatcher j;

    /* JADX INFO: compiled from: PG */
    public interface RequestFinishedListener {
        void onRequestFinished(Request request);
    }

    public RequestQueue(Cache cache, Network network, int i, ResponseDelivery responseDelivery) {
        this.c = new AtomicInteger();
        this.a = new HashSet();
        this.d = new PriorityBlockingQueue();
        this.e = new PriorityBlockingQueue();
        this.b = new ArrayList();
        this.f = cache;
        this.g = network;
        this.i = new NetworkDispatcher[i];
        this.h = responseDelivery;
    }

    public RequestQueue(Cache cache, Network network, int i) {
        this(cache, network, i, new ExecutorDelivery(new Handler(Looper.getMainLooper())));
    }

    public RequestQueue(Cache cache, Network network) {
        this(cache, network, 4);
    }

    public void start() {
        stop();
        this.j = new CacheDispatcher(this.d, this.e, this.f, this.h);
        this.j.start();
        for (int i = 0; i < this.i.length; i++) {
            NetworkDispatcher networkDispatcher = new NetworkDispatcher(this.e, this.g, this.f, this.h);
            this.i[i] = networkDispatcher;
            networkDispatcher.start();
        }
    }

    public void stop() {
        if (this.j != null) {
            this.j.quit();
        }
        for (NetworkDispatcher networkDispatcher : this.i) {
            if (networkDispatcher != null) {
                networkDispatcher.quit();
            }
        }
    }

    public int getSequenceNumber() {
        return this.c.incrementAndGet();
    }

    public Request add(Request request) {
        request.setRequestQueue(this);
        synchronized (this.a) {
            this.a.add(request);
        }
        request.setSequence(getSequenceNumber());
        request.addMarker("add-to-queue");
        if (!request.shouldCache()) {
            this.e.add(request);
        } else {
            this.d.add(request);
        }
        return request;
    }
}

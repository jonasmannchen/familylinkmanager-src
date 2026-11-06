package com.android.volley;

import android.os.Handler;
import flm.ajt;
import flm.aju;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class ExecutorDelivery implements ResponseDelivery {
    private final Executor a;

    public ExecutorDelivery(Handler handler) {
        this.a = new ajt(handler);
    }

    @Override // com.android.volley.ResponseDelivery
    public void postResponse(Request request, Response response) {
        postResponse(request, response, null);
    }

    @Override // com.android.volley.ResponseDelivery
    public void postResponse(Request request, Response response, Runnable runnable) {
        request.markDelivered();
        request.addMarker("post-response");
        this.a.execute(new aju(request, response, runnable));
    }

    @Override // com.android.volley.ResponseDelivery
    public void postError(Request request, VolleyError volleyError) {
        request.addMarker("post-error");
        this.a.execute(new aju(request, Response.error(volleyError), null));
    }
}

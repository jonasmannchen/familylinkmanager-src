package com.android.volley;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public interface ResponseDelivery {
    void postError(Request request, VolleyError volleyError);

    void postResponse(Request request, Response response);

    void postResponse(Request request, Response response, Runnable runnable);
}

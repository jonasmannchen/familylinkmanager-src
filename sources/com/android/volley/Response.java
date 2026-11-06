package com.android.volley;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class Response {
    public final Cache.Entry cacheEntry;
    public final VolleyError error;
    public boolean intermediate;
    public final Object result;

    /* JADX INFO: compiled from: PG */
    public interface ErrorListener {
        void onErrorResponse(VolleyError volleyError);
    }

    /* JADX INFO: compiled from: PG */
    public interface Listener {
        void onResponse(Object obj);
    }

    public static Response success(Object obj, Cache.Entry entry) {
        return new Response(obj, entry);
    }

    public static Response error(VolleyError volleyError) {
        return new Response(volleyError);
    }

    public boolean isSuccess() {
        return this.error == null;
    }

    private Response(Object obj, Cache.Entry entry) {
        this.intermediate = false;
        this.result = obj;
        this.cacheEntry = entry;
        this.error = null;
    }

    private Response(VolleyError volleyError) {
        this.intermediate = false;
        this.result = null;
        this.cacheEntry = null;
        this.error = volleyError;
    }
}

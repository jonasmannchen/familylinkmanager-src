package com.android.volley;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class VolleyError extends Exception {
    public final NetworkResponse networkResponse;

    public VolleyError() {
        this.networkResponse = null;
    }

    public VolleyError(NetworkResponse networkResponse) {
        this.networkResponse = networkResponse;
    }

    public VolleyError(Throwable th) {
        super(th);
        this.networkResponse = null;
    }
}

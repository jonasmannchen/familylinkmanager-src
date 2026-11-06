package com.android.volley.toolbox;

import com.android.volley.NetworkResponse;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyLog;
import java.io.UnsupportedEncodingException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class JsonRequest extends Request {
    private static final String d = String.format("application/json; charset=%s", "utf-8");
    private final Object e;
    private Response.Listener f;
    private final String g;

    public JsonRequest(int i, String str, String str2, Response.Listener listener, Response.ErrorListener errorListener) {
        super(i, str, errorListener);
        this.e = new Object();
        this.f = listener;
        this.g = str2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.android.volley.Request
    public abstract Response a(NetworkResponse networkResponse);

    @Override // com.android.volley.Request
    public void cancel() {
        super.cancel();
        synchronized (this.e) {
            this.f = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.android.volley.Request
    public final void a(Object obj) {
        Response.Listener listener;
        synchronized (this.e) {
            listener = this.f;
        }
        if (listener != null) {
            listener.onResponse(obj);
        }
    }

    @Override // com.android.volley.Request
    @Deprecated
    public byte[] getPostBody() {
        return getBody();
    }

    @Override // com.android.volley.Request
    public String getBodyContentType() {
        return d;
    }

    @Override // com.android.volley.Request
    public byte[] getBody() {
        try {
            if (this.g == null) {
                return null;
            }
            return this.g.getBytes("utf-8");
        } catch (UnsupportedEncodingException e) {
            VolleyLog.wtf("Unsupported Encoding while trying to get the bytes of %s using %s", this.g, "utf-8");
            return null;
        }
    }
}

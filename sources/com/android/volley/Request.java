package com.android.volley;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import flm.ajv;
import flm.ajw;
import flm.ajx;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class Request implements Comparable {
    public final ajx a;
    public final Object b;
    public ajw c;
    private final int d;
    private final String e;
    private final int f;
    private Response.ErrorListener g;
    private Integer h;
    private RequestQueue i;
    private boolean j;
    private boolean k;
    private boolean l;
    private boolean m;
    private RetryPolicy n;
    private Cache.Entry o;

    /* JADX INFO: compiled from: PG */
    public enum Priority {
        LOW,
        NORMAL,
        HIGH,
        IMMEDIATE
    }

    public Request(int i, String str, Response.ErrorListener errorListener) {
        Uri uri;
        String host;
        this.a = ajx.a ? new ajx() : null;
        this.b = new Object();
        this.j = true;
        this.k = false;
        this.l = false;
        this.m = false;
        this.o = null;
        this.d = i;
        this.e = str;
        this.g = errorListener;
        setRetryPolicy(new DefaultRetryPolicy());
        this.f = (TextUtils.isEmpty(str) || (uri = Uri.parse(str)) == null || (host = uri.getHost()) == null) ? 0 : host.hashCode();
    }

    public abstract Response a(NetworkResponse networkResponse);

    public abstract void a(Object obj);

    public int getMethod() {
        return this.d;
    }

    public int getTrafficStatsTag() {
        return this.f;
    }

    public Request setRetryPolicy(RetryPolicy retryPolicy) {
        this.n = retryPolicy;
        return this;
    }

    public void addMarker(String str) {
        if (ajx.a) {
            this.a.a(str, Thread.currentThread().getId());
        }
    }

    public final void a(String str) {
        if (this.i != null) {
            RequestQueue requestQueue = this.i;
            synchronized (requestQueue.a) {
                requestQueue.a.remove(this);
            }
            synchronized (requestQueue.b) {
                Iterator it = requestQueue.b.iterator();
                while (it.hasNext()) {
                    ((RequestQueue.RequestFinishedListener) it.next()).onRequestFinished(this);
                }
            }
        }
        if (ajx.a) {
            long id = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new ajv(this, str, id));
            } else {
                this.a.a(str, id);
                this.a.a(toString());
            }
        }
    }

    public Request setRequestQueue(RequestQueue requestQueue) {
        this.i = requestQueue;
        return this;
    }

    public final Request setSequence(int i) {
        this.h = Integer.valueOf(i);
        return this;
    }

    public String getUrl() {
        return this.e;
    }

    public String getCacheKey() {
        String url = getUrl();
        int method = getMethod();
        if (method == 0 || method == -1) {
            return url;
        }
        String string = Integer.toString(method);
        return new StringBuilder(String.valueOf(string).length() + 1 + String.valueOf(url).length()).append(string).append('-').append(url).toString();
    }

    public Request setCacheEntry(Cache.Entry entry) {
        this.o = entry;
        return this;
    }

    public Cache.Entry getCacheEntry() {
        return this.o;
    }

    public void cancel() {
        synchronized (this.b) {
            this.k = true;
            this.g = null;
        }
    }

    public boolean isCanceled() {
        boolean z;
        synchronized (this.b) {
            z = this.k;
        }
        return z;
    }

    public Map getHeaders() {
        return Collections.emptyMap();
    }

    @Deprecated
    public byte[] getPostBody() {
        Map map = null;
        if (0 == 0 || map.size() <= 0) {
            return null;
        }
        return a(null, "UTF-8");
    }

    public String getBodyContentType() {
        String strValueOf = String.valueOf("UTF-8");
        return strValueOf.length() != 0 ? "application/x-www-form-urlencoded; charset=".concat(strValueOf) : new String("application/x-www-form-urlencoded; charset=");
    }

    public byte[] getBody() {
        return null;
    }

    private static byte[] a(Map map, String str) {
        StringBuilder sb = new StringBuilder();
        try {
            for (Map.Entry entry : map.entrySet()) {
                if (entry.getKey() == null || entry.getValue() == null) {
                    throw new IllegalArgumentException(String.format("Request#getParams() or Request#getPostParams() returned a map containing a null key or value: (%s, %s). All keys and values must be non-null.", entry.getKey(), entry.getValue()));
                }
                sb.append(URLEncoder.encode((String) entry.getKey(), str));
                sb.append('=');
                sb.append(URLEncoder.encode((String) entry.getValue(), str));
                sb.append('&');
            }
            return sb.toString().getBytes(str);
        } catch (UnsupportedEncodingException e) {
            String strValueOf = String.valueOf(str);
            throw new RuntimeException(strValueOf.length() != 0 ? "Encoding not supported: ".concat(strValueOf) : new String("Encoding not supported: "), e);
        }
    }

    public final boolean shouldCache() {
        return this.j;
    }

    public final boolean shouldRetryServerErrors() {
        return false;
    }

    public Priority getPriority() {
        return Priority.NORMAL;
    }

    public final int getTimeoutMs() {
        return getRetryPolicy().getCurrentTimeout();
    }

    public RetryPolicy getRetryPolicy() {
        return this.n;
    }

    public void markDelivered() {
        synchronized (this.b) {
            this.l = true;
        }
    }

    public boolean hasHadResponseDelivered() {
        boolean z;
        synchronized (this.b) {
            z = this.l;
        }
        return z;
    }

    public void deliverError(VolleyError volleyError) {
        Response.ErrorListener errorListener;
        synchronized (this.b) {
            errorListener = this.g;
        }
        if (errorListener != null) {
            errorListener.onErrorResponse(volleyError);
        }
    }

    public final void a(ajw ajwVar) {
        synchronized (this.b) {
            this.c = ajwVar;
        }
    }

    final void a(Response response) {
        ajw ajwVar;
        synchronized (this.b) {
            ajwVar = this.c;
        }
        if (ajwVar != null) {
            ajwVar.a(this, response);
        }
    }

    final void a() {
        ajw ajwVar;
        synchronized (this.b) {
            ajwVar = this.c;
        }
        if (ajwVar != null) {
            ajwVar.a(this);
        }
    }

    @Override // java.lang.Comparable
    public int compareTo(Request request) {
        Priority priority = getPriority();
        Priority priority2 = request.getPriority();
        return priority == priority2 ? this.h.intValue() - request.h.intValue() : priority2.ordinal() - priority.ordinal();
    }

    public String toString() {
        String strValueOf = String.valueOf(Integer.toHexString(getTrafficStatsTag()));
        String strConcat = strValueOf.length() != 0 ? "0x".concat(strValueOf) : new String("0x");
        String str = isCanceled() ? "[X] " : "[ ] ";
        String url = getUrl();
        String strValueOf2 = String.valueOf(getPriority());
        String strValueOf3 = String.valueOf(this.h);
        return new StringBuilder(String.valueOf(str).length() + 3 + String.valueOf(url).length() + String.valueOf(strConcat).length() + String.valueOf(strValueOf2).length() + String.valueOf(strValueOf3).length()).append(str).append(url).append(" ").append(strConcat).append(" ").append(strValueOf2).append(" ").append(strValueOf3).toString();
    }
}

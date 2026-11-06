package com.android.volley.toolbox;

import android.os.SystemClock;
import com.android.volley.AuthFailureError;
import com.android.volley.Cache;
import com.android.volley.ClientError;
import com.android.volley.Header;
import com.android.volley.Network;
import com.android.volley.NetworkError;
import com.android.volley.NetworkResponse;
import com.android.volley.NoConnectionError;
import com.android.volley.Request;
import com.android.volley.RetryPolicy;
import com.android.volley.ServerError;
import com.android.volley.TimeoutError;
import com.android.volley.VolleyError;
import com.android.volley.VolleyLog;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class BasicNetwork implements Network {
    private static final boolean a = VolleyLog.DEBUG;
    private final BaseHttpStack b;
    private final ByteArrayPool c;

    public BasicNetwork(BaseHttpStack baseHttpStack) {
        this(baseHttpStack, new ByteArrayPool(4096));
    }

    public BasicNetwork(BaseHttpStack baseHttpStack, ByteArrayPool byteArrayPool) {
        this.b = baseHttpStack;
        this.c = byteArrayPool;
    }

    @Override // com.android.volley.Network
    public NetworkResponse performRequest(Request request) throws VolleyError {
        byte[] bArrA;
        Map map;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        while (true) {
            HttpResponse httpResponse = null;
            List listEmptyList = Collections.emptyList();
            try {
                try {
                    Cache.Entry cacheEntry = request.getCacheEntry();
                    if (cacheEntry == null) {
                        map = Collections.emptyMap();
                    } else {
                        map = new HashMap();
                        if (cacheEntry.etag != null) {
                            map.put("If-None-Match", cacheEntry.etag);
                        }
                        if (cacheEntry.lastModified > 0) {
                            map.put("If-Modified-Since", HttpHeaderParser.a().format(new Date(cacheEntry.lastModified)));
                        }
                    }
                    HttpResponse httpResponseExecuteRequest = this.b.executeRequest(request, map);
                    try {
                        int statusCode = httpResponseExecuteRequest.getStatusCode();
                        listEmptyList = httpResponseExecuteRequest.getHeaders();
                        if (statusCode == 304) {
                            Cache.Entry cacheEntry2 = request.getCacheEntry();
                            if (cacheEntry2 == null) {
                                return new NetworkResponse(304, (byte[]) null, true, SystemClock.elapsedRealtime() - jElapsedRealtime, listEmptyList);
                            }
                            TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
                            if (!listEmptyList.isEmpty()) {
                                Iterator it = listEmptyList.iterator();
                                while (it.hasNext()) {
                                    treeSet.add(((Header) it.next()).getName());
                                }
                            }
                            ArrayList arrayList = new ArrayList(listEmptyList);
                            if (cacheEntry2.allResponseHeaders != null) {
                                if (!cacheEntry2.allResponseHeaders.isEmpty()) {
                                    for (Header header : cacheEntry2.allResponseHeaders) {
                                        if (!treeSet.contains(header.getName())) {
                                            arrayList.add(header);
                                        }
                                    }
                                }
                            } else if (!cacheEntry2.responseHeaders.isEmpty()) {
                                for (Map.Entry entry : cacheEntry2.responseHeaders.entrySet()) {
                                    if (!treeSet.contains(entry.getKey())) {
                                        arrayList.add(new Header((String) entry.getKey(), (String) entry.getValue()));
                                    }
                                }
                            }
                            return new NetworkResponse(304, cacheEntry2.data, true, SystemClock.elapsedRealtime() - jElapsedRealtime, (List) arrayList);
                        }
                        InputStream content = httpResponseExecuteRequest.getContent();
                        if (content != null) {
                            bArrA = a(content, httpResponseExecuteRequest.getContentLength());
                        } else {
                            bArrA = new byte[0];
                        }
                        try {
                            long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                            if (a || jElapsedRealtime2 > 3000) {
                                Object[] objArr = new Object[5];
                                objArr[0] = request;
                                objArr[1] = Long.valueOf(jElapsedRealtime2);
                                objArr[2] = bArrA != null ? Integer.valueOf(bArrA.length) : "null";
                                objArr[3] = Integer.valueOf(statusCode);
                                objArr[4] = Integer.valueOf(request.getRetryPolicy().getCurrentRetryCount());
                                VolleyLog.d("HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]", objArr);
                            }
                            if (statusCode < 200 || statusCode > 299) {
                                throw new IOException();
                            }
                            return new NetworkResponse(statusCode, bArrA, false, SystemClock.elapsedRealtime() - jElapsedRealtime, listEmptyList);
                        } catch (IOException e) {
                            e = e;
                            httpResponse = httpResponseExecuteRequest;
                            if (httpResponse != null) {
                                int statusCode2 = httpResponse.getStatusCode();
                                VolleyLog.e("Unexpected response code %d for %s", Integer.valueOf(statusCode2), request.getUrl());
                                if (bArrA != null) {
                                    NetworkResponse networkResponse = new NetworkResponse(statusCode2, bArrA, false, SystemClock.elapsedRealtime() - jElapsedRealtime, listEmptyList);
                                    if (statusCode2 == 401 || statusCode2 == 403) {
                                        a("auth", request, new AuthFailureError(networkResponse));
                                    } else {
                                        if (statusCode2 >= 400 && statusCode2 <= 499) {
                                            throw new ClientError(networkResponse);
                                        }
                                        if (statusCode2 >= 500 && statusCode2 <= 599) {
                                            if (request.shouldRetryServerErrors()) {
                                                a("server", request, new ServerError(networkResponse));
                                            } else {
                                                throw new ServerError(networkResponse);
                                            }
                                        } else {
                                            throw new ServerError(networkResponse);
                                        }
                                    }
                                } else {
                                    a("network", request, new NetworkError());
                                }
                            } else {
                                throw new NoConnectionError(e);
                            }
                        }
                    } catch (IOException e2) {
                        e = e2;
                        bArrA = null;
                        httpResponse = httpResponseExecuteRequest;
                    }
                } catch (MalformedURLException e3) {
                    String strValueOf = String.valueOf(request.getUrl());
                    throw new RuntimeException(strValueOf.length() != 0 ? "Bad URL ".concat(strValueOf) : new String("Bad URL "), e3);
                } catch (SocketTimeoutException e4) {
                    a("socket", request, new TimeoutError());
                }
            } catch (IOException e5) {
                e = e5;
                bArrA = null;
            }
        }
    }

    private static void a(String str, Request request, VolleyError volleyError) throws VolleyError {
        RetryPolicy retryPolicy = request.getRetryPolicy();
        int timeoutMs = request.getTimeoutMs();
        try {
            retryPolicy.retry(volleyError);
            request.addMarker(String.format("%s-retry [timeout=%s]", str, Integer.valueOf(timeoutMs)));
        } catch (VolleyError e) {
            request.addMarker(String.format("%s-timeout-giveup [timeout=%s]", str, Integer.valueOf(timeoutMs)));
            throw e;
        }
    }

    private final byte[] a(InputStream inputStream, int i) throws IOException {
        PoolingByteArrayOutputStream poolingByteArrayOutputStream = new PoolingByteArrayOutputStream(this.c, i);
        try {
            if (inputStream == null) {
                throw new ServerError();
            }
            byte[] buf = this.c.getBuf(1024);
            while (true) {
                int i2 = inputStream.read(buf);
                if (i2 == -1) {
                    break;
                }
                poolingByteArrayOutputStream.write(buf, 0, i2);
            }
            byte[] byteArray = poolingByteArrayOutputStream.toByteArray();
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    VolleyLog.v("Error occurred when closing InputStream", new Object[0]);
                }
            }
            this.c.returnBuf(buf);
            poolingByteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e2) {
                    VolleyLog.v("Error occurred when closing InputStream", new Object[0]);
                }
            }
            this.c.returnBuf(null);
            poolingByteArrayOutputStream.close();
            throw th;
        }
    }
}

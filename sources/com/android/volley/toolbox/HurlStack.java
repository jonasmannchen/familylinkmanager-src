package com.android.volley.toolbox;

import com.android.volley.Header;
import com.android.volley.Request;
import flm.akc;
import flm.bbx;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class HurlStack extends BaseHttpStack {
    private final UrlRewriter a;
    private final SSLSocketFactory b;

    /* JADX INFO: compiled from: PG */
    public interface UrlRewriter {
        String rewriteUrl(String str);
    }

    public HurlStack() {
        this(null);
    }

    public HurlStack(UrlRewriter urlRewriter) {
        this(urlRewriter, null);
    }

    public HurlStack(UrlRewriter urlRewriter, SSLSocketFactory sSLSocketFactory) {
        this.a = urlRewriter;
        this.b = sSLSocketFactory;
    }

    @Override // com.android.volley.toolbox.BaseHttpStack
    public HttpResponse executeRequest(Request request, Map map) throws Throwable {
        String strRewriteUrl;
        boolean z;
        String url = request.getUrl();
        HashMap map2 = new HashMap();
        map2.putAll(map);
        map2.putAll(request.getHeaders());
        if (this.a != null) {
            strRewriteUrl = this.a.rewriteUrl(url);
            if (strRewriteUrl == null) {
                String strValueOf = String.valueOf(url);
                throw new IOException(strValueOf.length() != 0 ? "URL blocked by rewriter: ".concat(strValueOf) : new String("URL blocked by rewriter: "));
            }
        } else {
            strRewriteUrl = url;
        }
        URL url2 = new URL(strRewriteUrl);
        HttpURLConnection httpURLConnection = (HttpURLConnection) url2.openConnection();
        httpURLConnection.setInstanceFollowRedirects(HttpURLConnection.getFollowRedirects());
        int timeoutMs = request.getTimeoutMs();
        httpURLConnection.setConnectTimeout(timeoutMs);
        httpURLConnection.setReadTimeout(timeoutMs);
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setDoInput(true);
        if ("https".equals(url2.getProtocol()) && this.b != null) {
            ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(this.b);
        }
        try {
            for (String str : map2.keySet()) {
                httpURLConnection.setRequestProperty(str, (String) map2.get(str));
            }
            switch (request.getMethod()) {
                case -1:
                    byte[] postBody = request.getPostBody();
                    if (postBody != null) {
                        httpURLConnection.setRequestMethod("POST");
                        a(httpURLConnection, request, postBody);
                    }
                    break;
                case bbx.MSG_UNBIND_SERVICE /* 0 */:
                    httpURLConnection.setRequestMethod("GET");
                    break;
                case 1:
                    httpURLConnection.setRequestMethod("POST");
                    a(httpURLConnection, request);
                    break;
                case 2:
                    httpURLConnection.setRequestMethod("PUT");
                    a(httpURLConnection, request);
                    break;
                case 3:
                    httpURLConnection.setRequestMethod("DELETE");
                    break;
                case 4:
                    httpURLConnection.setRequestMethod("HEAD");
                    break;
                case 5:
                    httpURLConnection.setRequestMethod("OPTIONS");
                    break;
                case 6:
                    httpURLConnection.setRequestMethod("TRACE");
                    break;
                case 7:
                    httpURLConnection.setRequestMethod("PATCH");
                    a(httpURLConnection, request);
                    break;
                default:
                    throw new IllegalStateException("Unknown method type.");
            }
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == -1) {
                throw new IOException("Could not retrieve response code from HttpUrlConnection.");
            }
            if (!((request.getMethod() == 4 || (100 <= responseCode && responseCode < 200) || responseCode == 204 || responseCode == 304) ? false : true)) {
                HttpResponse httpResponse = new HttpResponse(responseCode, a(httpURLConnection.getHeaderFields()));
                httpURLConnection.disconnect();
                return httpResponse;
            }
            try {
                return new HttpResponse(responseCode, a(httpURLConnection.getHeaderFields()), httpURLConnection.getContentLength(), new akc(httpURLConnection));
            } catch (Throwable th) {
                th = th;
                z = true;
                if (!z) {
                    httpURLConnection.disconnect();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            z = false;
        }
    }

    private static List a(Map map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getKey() != null) {
                Iterator it = ((List) entry.getValue()).iterator();
                while (it.hasNext()) {
                    arrayList.add(new Header((String) entry.getKey(), (String) it.next()));
                }
            }
        }
        return arrayList;
    }

    public static InputStream a(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getInputStream();
        } catch (IOException e) {
            return httpURLConnection.getErrorStream();
        }
    }

    private static void a(HttpURLConnection httpURLConnection, Request request) {
        byte[] body = request.getBody();
        if (body != null) {
            a(httpURLConnection, request, body);
        }
    }

    private static void a(HttpURLConnection httpURLConnection, Request request, byte[] bArr) {
        httpURLConnection.setDoOutput(true);
        if (!httpURLConnection.getRequestProperties().containsKey("Content-Type")) {
            httpURLConnection.setRequestProperty("Content-Type", request.getBodyContentType());
        }
        DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
        dataOutputStream.write(bArr);
        dataOutputStream.close();
    }
}

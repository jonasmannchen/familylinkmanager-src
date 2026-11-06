package flm;

import com.android.volley.CacheDispatcher;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyLog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ajs implements ajw {
    private final Map a = new HashMap();
    private final CacheDispatcher b;

    public ajs(CacheDispatcher cacheDispatcher) {
        this.b = cacheDispatcher;
    }

    @Override // flm.ajw
    public final void a(Request request, Response response) {
        List list;
        if (response.cacheEntry == null || response.cacheEntry.isExpired()) {
            a(request);
            return;
        }
        String cacheKey = request.getCacheKey();
        synchronized (this) {
            list = (List) this.a.remove(cacheKey);
        }
        if (list != null) {
            if (VolleyLog.DEBUG) {
                VolleyLog.v("Releasing %d waiting requests for cacheKey=%s.", Integer.valueOf(list.size()), cacheKey);
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.b.b.postResponse((Request) it.next(), response);
            }
        }
    }

    @Override // flm.ajw
    public final synchronized void a(Request request) {
        String cacheKey = request.getCacheKey();
        List list = (List) this.a.remove(cacheKey);
        if (list != null && !list.isEmpty()) {
            if (VolleyLog.DEBUG) {
                VolleyLog.v("%d waiting requests for cacheKey=%s; resend to network", Integer.valueOf(list.size()), cacheKey);
            }
            Request request2 = (Request) list.remove(0);
            this.a.put(cacheKey, list);
            request2.a((ajw) this);
            try {
                this.b.a.put(request2);
            } catch (InterruptedException e) {
                VolleyLog.e("Couldn't add request to queue. %s", e.toString());
                Thread.currentThread().interrupt();
                this.b.quit();
            }
        }
    }

    public final synchronized boolean b(Request request) {
        boolean z = false;
        synchronized (this) {
            String cacheKey = request.getCacheKey();
            if (this.a.containsKey(cacheKey)) {
                List arrayList = (List) this.a.get(cacheKey);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                request.addMarker("waiting-for-response");
                arrayList.add(request);
                this.a.put(cacheKey, arrayList);
                if (VolleyLog.DEBUG) {
                    VolleyLog.d("Request for cacheKey=%s is in flight, putting on hold.", cacheKey);
                }
                z = true;
            } else {
                this.a.put(cacheKey, null);
                request.a((ajw) this);
                if (VolleyLog.DEBUG) {
                    VolleyLog.d("new request, sending to network %s", cacheKey);
                }
            }
        }
        return z;
    }
}

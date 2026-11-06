package flm;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import java.util.concurrent.Semaphore;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class bua implements Response.ErrorListener, Response.Listener {
    public Object b = null;
    public VolleyError c = null;
    public final Semaphore a = new Semaphore(1, true);

    public bua() throws InterruptedException {
        this.a.acquire();
    }

    @Override // com.android.volley.Response.Listener
    public final void onResponse(Object obj) {
        this.b = obj;
        this.a.release();
    }

    @Override // com.android.volley.Response.ErrorListener
    public final void onErrorResponse(VolleyError volleyError) {
        this.c = volleyError;
        this.a.release();
    }
}

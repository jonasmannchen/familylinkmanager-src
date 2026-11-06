package com.android.volley.toolbox;

import android.content.Context;
import com.android.volley.RequestQueue;
import java.io.File;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class Volley {
    public static RequestQueue newRequestQueue(Context context, BaseHttpStack baseHttpStack) {
        RequestQueue requestQueue = new RequestQueue(new DiskBasedCache(new File(context.getCacheDir(), "volley")), baseHttpStack == null ? new BasicNetwork(new HurlStack()) : new BasicNetwork(baseHttpStack));
        requestQueue.start();
        return requestQueue;
    }

    public static RequestQueue newRequestQueue(Context context) {
        return newRequestQueue(context, null);
    }
}

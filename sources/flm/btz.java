package flm;

import android.content.Context;
import android.net.Uri;
import android.util.Pair;
import com.android.volley.RequestQueue;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.Volley;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class btz {
    private static volatile boolean a = false;
    private static RequestQueue b;

    public static JSONObject a(Context context, String str, String str2, List list, List list2, JSONObject jSONObject) throws IOException {
        JSONObject jSONObject2;
        int i = 0;
        b(context);
        bua buaVar = new bua();
        switch (str2.trim().toUpperCase()) {
            case "GET":
                break;
            case "POST":
                i = 1;
                break;
            default:
                throw new UnsupportedOperationException();
        }
        Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                builderBuildUpon.appendQueryParameter((String) pair.first, (String) pair.second);
            }
        }
        String string = builderBuildUpon.toString();
        HashMap map = new HashMap();
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            Pair pair2 = (Pair) it2.next();
            map.put((String) pair2.first, (String) pair2.second);
        }
        b.add(new bub(i, string, jSONObject, buaVar, buaVar, map));
        if (!buaVar.a.tryAcquire(10L, TimeUnit.SECONDS)) {
            throw new IOException("Request timed out.");
        }
        try {
            VolleyError volleyError = buaVar.c;
            if (volleyError == null) {
                jSONObject2 = (JSONObject) buaVar.b;
                buaVar.a.release();
            } else {
                if (volleyError.networkResponse == null || volleyError.networkResponse.data == null) {
                    throw new IOException("Failed to send JSON request.", volleyError);
                }
                jSONObject2 = new JSONObject(StandardCharsets.UTF_8.newDecoder().decode(ByteBuffer.wrap(volleyError.networkResponse.data)).toString());
                buaVar.a.release();
            }
            return jSONObject2;
        } catch (Throwable th) {
            buaVar.a.release();
            throw th;
        }
    }

    public static RequestQueue a(Context context) {
        b(context);
        return b;
    }

    private static void b(Context context) {
        if (!a) {
            synchronized (btz.class) {
                if (!a) {
                    b = null;
                    try {
                        try {
                            if (context.getPackageName().equals("com.google.android.gms")) {
                                Class<?> cls = Class.forName("flm.ayt");
                                b = (RequestQueue) cls.getMethod("getRequestQueue", new Class[0]).invoke(cls.getMethod("getInstance", new Class[0]).invoke(null, new Object[0]), new Object[0]);
                            }
                            if (b == null) {
                                b = Volley.newRequestQueue(context.getApplicationContext());
                            }
                        } catch (Throwable th) {
                            btv.d("KidSetup", "Couldn't get the global request queue from GMS Core, creating a new one...", new Object[0]);
                            if (b == null) {
                                b = Volley.newRequestQueue(context.getApplicationContext());
                            }
                        }
                        a = true;
                    } catch (Throwable th2) {
                        if (b == null) {
                            b = Volley.newRequestQueue(context.getApplicationContext());
                        }
                        throw th2;
                    }
                }
            }
        }
    }

    private btz() {
    }
}

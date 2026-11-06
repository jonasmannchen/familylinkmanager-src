package flm;

import android.net.TrafficStats;
import com.android.volley.Response;
import com.android.volley.toolbox.JsonObjectRequest;
import com.google.android.gms.common.server.NetworkCallbacks;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class bub extends JsonObjectRequest implements NetworkCallbacks {
    private final HashMap d;

    public bub(int i, String str, JSONObject jSONObject, Response.Listener listener, Response.ErrorListener errorListener, HashMap map) {
        super(i, str, jSONObject, listener, errorListener);
        this.d = map;
    }

    public final void onPreNetworkDispatch() {
        TrafficStats.setThreadStatsTag(6656);
    }

    public final void onPostNetworkDispatch() {
    }

    @Override // com.android.volley.Request
    public final /* synthetic */ Map getHeaders() {
        return this.d;
    }
}

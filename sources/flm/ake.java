package flm;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.ImageLoader;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ake implements Response.ErrorListener {
    private final /* synthetic */ String a;
    private final /* synthetic */ ImageLoader b;

    public ake(ImageLoader imageLoader, String str) {
        this.b = imageLoader;
        this.a = str;
    }

    @Override // com.android.volley.Response.ErrorListener
    public final void onErrorResponse(VolleyError volleyError) {
        ImageLoader imageLoader = this.b;
        String str = this.a;
        akg akgVar = (akg) imageLoader.b.remove(str);
        if (akgVar != null) {
            akgVar.b = volleyError;
            imageLoader.a(str, akgVar);
        }
    }
}

package flm;

import android.graphics.Bitmap;
import com.android.volley.Response;
import com.android.volley.toolbox.ImageLoader;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class akd implements Response.Listener {
    private final /* synthetic */ String a;
    private final /* synthetic */ ImageLoader b;

    public akd(ImageLoader imageLoader, String str) {
        this.b = imageLoader;
        this.a = str;
    }

    @Override // com.android.volley.Response.Listener
    public final /* synthetic */ void onResponse(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        ImageLoader imageLoader = this.b;
        String str = this.a;
        imageLoader.a.putBitmap(str, bitmap);
        akg akgVar = (akg) imageLoader.b.remove(str);
        if (akgVar != null) {
            akgVar.a = bitmap;
            imageLoader.a(str, akgVar);
        }
    }
}

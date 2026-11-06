package flm;

import android.graphics.Bitmap;
import com.android.volley.Request;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.ImageLoader;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class akg {
    public Bitmap a;
    public VolleyError b;
    public final List c = new ArrayList();
    private final Request d;

    public akg(Request request, ImageLoader.ImageContainer imageContainer) {
        this.d = request;
        this.c.add(imageContainer);
    }

    public final boolean a(ImageLoader.ImageContainer imageContainer) {
        this.c.remove(imageContainer);
        if (this.c.size() != 0) {
            return false;
        }
        this.d.cancel();
        return true;
    }
}

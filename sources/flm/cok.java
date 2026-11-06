package flm;

import android.graphics.Bitmap;
import com.android.volley.toolbox.ImageLoader;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cok extends bac implements ImageLoader.ImageCache {
    cok() {
        super((int) Math.min(5242880L, Runtime.getRuntime().maxMemory() / 8));
    }

    @Override // com.android.volley.toolbox.ImageLoader.ImageCache
    public final void putBitmap(String str, Bitmap bitmap) {
        put(str, bitmap);
    }

    @Override // com.android.volley.toolbox.ImageLoader.ImageCache
    public final Bitmap getBitmap(String str) {
        return (Bitmap) get(str);
    }
}

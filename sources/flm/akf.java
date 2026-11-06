package flm;

import com.android.volley.toolbox.ImageLoader;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class akf implements Runnable {
    private final /* synthetic */ ImageLoader a;

    public akf(ImageLoader imageLoader) {
        this.a = imageLoader;
    }

    @Override // java.lang.Runnable
    public final void run() {
        for (akg akgVar : this.a.c.values()) {
            for (ImageLoader.ImageContainer imageContainer : akgVar.c) {
                if (imageContainer.b != null) {
                    if (akgVar.b == null) {
                        imageContainer.a = akgVar.a;
                        imageContainer.b.onResponse(imageContainer, false);
                    } else {
                        imageContainer.b.onErrorResponse(akgVar.b);
                    }
                }
            }
        }
        this.a.c.clear();
        this.a.d = null;
    }
}

package flm;

import com.android.volley.toolbox.ImageLoader;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class aki implements Runnable {
    private final /* synthetic */ ImageLoader.ImageContainer a;
    private final /* synthetic */ akh b;

    aki(akh akhVar, ImageLoader.ImageContainer imageContainer) {
        this.b = akhVar;
        this.a = imageContainer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.onResponse(this.a, false);
    }
}

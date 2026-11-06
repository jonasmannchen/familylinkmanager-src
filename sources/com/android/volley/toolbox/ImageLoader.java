package com.android.volley.toolbox;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.widget.ImageView;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import flm.akd;
import flm.ake;
import flm.akf;
import flm.akg;
import flm.akj;
import java.util.HashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class ImageLoader {
    public final ImageCache a;
    public Runnable d;
    private final RequestQueue e;
    private int f = 100;
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    private final Handler g = new Handler(Looper.getMainLooper());

    /* JADX INFO: compiled from: PG */
    public interface ImageCache {
        Bitmap getBitmap(String str);

        void putBitmap(String str, Bitmap bitmap);
    }

    /* JADX INFO: compiled from: PG */
    public interface ImageListener extends Response.ErrorListener {
        void onResponse(ImageContainer imageContainer, boolean z);
    }

    public ImageLoader(RequestQueue requestQueue, ImageCache imageCache) {
        this.e = requestQueue;
        this.a = imageCache;
    }

    /* JADX INFO: compiled from: PG */
    public class ImageContainer {
        public Bitmap a;
        public final ImageListener b;
        private final String c;
        private final String d;

        public ImageContainer(Bitmap bitmap, String str, String str2, ImageListener imageListener) {
            this.a = bitmap;
            this.d = str;
            this.c = str2;
            this.b = imageListener;
        }

        public void cancelRequest() {
            akj.a();
            if (this.b != null) {
                akg akgVar = (akg) ImageLoader.this.b.get(this.c);
                if (akgVar != null) {
                    if (akgVar.a(this)) {
                        ImageLoader.this.b.remove(this.c);
                        return;
                    }
                    return;
                }
                akg akgVar2 = (akg) ImageLoader.this.c.get(this.c);
                if (akgVar2 != null) {
                    akgVar2.a(this);
                    if (akgVar2.c.size() == 0) {
                        ImageLoader.this.c.remove(this.c);
                    }
                }
            }
        }

        public Bitmap getBitmap() {
            return this.a;
        }

        public String getRequestUrl() {
            return this.d;
        }
    }

    public ImageContainer get(String str, ImageListener imageListener, int i, int i2, ImageView.ScaleType scaleType) {
        akj.a();
        String string = new StringBuilder(str.length() + 12).append("#W").append(i).append("#H").append(i2).append("#S").append(scaleType.ordinal()).append(str).toString();
        Bitmap bitmap = this.a.getBitmap(string);
        if (bitmap != null) {
            ImageContainer imageContainer = new ImageContainer(bitmap, str, null, null);
            imageListener.onResponse(imageContainer, true);
            return imageContainer;
        }
        ImageContainer imageContainer2 = new ImageContainer(null, str, string, imageListener);
        imageListener.onResponse(imageContainer2, true);
        akg akgVar = (akg) this.b.get(string);
        if (akgVar == null) {
            akgVar = (akg) this.c.get(string);
        }
        if (akgVar != null) {
            akgVar.c.add(imageContainer2);
            return imageContainer2;
        }
        ImageRequest imageRequest = new ImageRequest(str, new akd(this, string), i, i2, scaleType, Bitmap.Config.RGB_565, new ake(this, string));
        this.e.add(imageRequest);
        this.b.put(string, new akg(imageRequest, imageContainer2));
        return imageContainer2;
    }

    public final void a(String str, akg akgVar) {
        this.c.put(str, akgVar);
        if (this.d == null) {
            this.d = new akf(this);
            this.g.postDelayed(this.d, this.f);
        }
    }
}

package com.android.volley.toolbox;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.ImageView;
import com.android.volley.DefaultRetryPolicy;
import com.android.volley.NetworkResponse;
import com.android.volley.ParseError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyLog;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class ImageRequest extends Request {
    private static final Object j = new Object();
    private final Object d;
    private Response.Listener e;
    private final Bitmap.Config f;
    private final int g;
    private final int h;
    private final ImageView.ScaleType i;

    public ImageRequest(String str, Response.Listener listener, int i, int i2, ImageView.ScaleType scaleType, Bitmap.Config config, Response.ErrorListener errorListener) {
        super(0, str, errorListener);
        this.d = new Object();
        setRetryPolicy(new DefaultRetryPolicy(1000, 2, 2.0f));
        this.e = listener;
        this.f = config;
        this.g = i;
        this.h = i2;
        this.i = scaleType;
    }

    @Override // com.android.volley.Request
    public Request.Priority getPriority() {
        return Request.Priority.LOW;
    }

    private static int a(int i, int i2, int i3, int i4, ImageView.ScaleType scaleType) {
        if (i == 0 && i2 == 0) {
            return i3;
        }
        if (scaleType == ImageView.ScaleType.FIT_XY) {
            return i == 0 ? i3 : i;
        }
        if (i == 0) {
            return (int) ((((double) i2) / ((double) i4)) * ((double) i3));
        }
        if (i2 != 0) {
            double d = ((double) i4) / ((double) i3);
            if (scaleType == ImageView.ScaleType.CENTER_CROP) {
                if (((double) i) * d < i2) {
                    return (int) (((double) i2) / d);
                }
                return i;
            }
            if (((double) i) * d > i2) {
                return (int) (((double) i2) / d);
            }
            return i;
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.android.volley.Request
    public final Response a(NetworkResponse networkResponse) {
        Response responseError;
        Bitmap bitmapCreateScaledBitmap;
        synchronized (j) {
            try {
                byte[] bArr = networkResponse.data;
                BitmapFactory.Options options = new BitmapFactory.Options();
                if (this.g == 0 && this.h == 0) {
                    options.inPreferredConfig = this.f;
                    bitmapCreateScaledBitmap = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
                } else {
                    options.inJustDecodeBounds = true;
                    BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
                    int i = options.outWidth;
                    int i2 = options.outHeight;
                    int iA = a(this.g, this.h, i, i2, this.i);
                    int iA2 = a(this.h, this.g, i2, i, this.i);
                    options.inJustDecodeBounds = false;
                    double dMin = Math.min(((double) i) / ((double) iA), ((double) i2) / ((double) iA2));
                    float f = 1.0f;
                    while (2.0f * f <= dMin) {
                        f *= 2.0f;
                    }
                    options.inSampleSize = (int) f;
                    Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
                    if (bitmapDecodeByteArray == null || (bitmapDecodeByteArray.getWidth() <= iA && bitmapDecodeByteArray.getHeight() <= iA2)) {
                        bitmapCreateScaledBitmap = bitmapDecodeByteArray;
                    } else {
                        bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapDecodeByteArray, iA, iA2, true);
                        bitmapDecodeByteArray.recycle();
                    }
                }
                if (bitmapCreateScaledBitmap == null) {
                    responseError = Response.error(new ParseError(networkResponse));
                } else {
                    responseError = Response.success(bitmapCreateScaledBitmap, HttpHeaderParser.parseCacheHeaders(networkResponse));
                }
            } catch (OutOfMemoryError e) {
                VolleyLog.e("Caught OOM for %d byte image, url=%s", Integer.valueOf(networkResponse.data.length), getUrl());
                responseError = Response.error(new ParseError(e));
            }
        }
        return responseError;
    }

    @Override // com.android.volley.Request
    public void cancel() {
        super.cancel();
        synchronized (this.d) {
            this.e = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.android.volley.Request
    public final /* synthetic */ void a(Object obj) {
        Response.Listener listener;
        Bitmap bitmap = (Bitmap) obj;
        synchronized (this.d) {
            listener = this.e;
        }
        if (listener != null) {
            listener.onResponse(bitmap);
        }
    }
}

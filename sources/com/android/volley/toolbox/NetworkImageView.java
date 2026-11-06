package com.android.volley.toolbox;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ImageView;
import flm.akh;
import flm.akj;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class NetworkImageView extends ImageView {
    public int a;
    public Bitmap b;
    private String c;
    private ImageLoader d;
    private ImageLoader.ImageContainer e;

    public NetworkImageView(Context context) {
        this(context, null);
    }

    public NetworkImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NetworkImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void setImageUrl(String str, ImageLoader imageLoader) {
        akj.a();
        this.c = str;
        this.d = imageLoader;
        a(false);
    }

    public void setDefaultImageResId(int i) {
        if (this.b != null) {
            throw new IllegalArgumentException("Can't have a default image resource ID and bitmap");
        }
        this.a = i;
    }

    public void setDefaultImageBitmap(Bitmap bitmap) {
        if (this.a != 0) {
            throw new IllegalArgumentException("Can't have a default image resource ID and bitmap");
        }
        this.b = bitmap;
    }

    private final void a(boolean z) {
        boolean z2;
        boolean z3;
        int width = getWidth();
        int height = getHeight();
        ImageView.ScaleType scaleType = getScaleType();
        if (getLayoutParams() != null) {
            z3 = getLayoutParams().width == -2;
            z2 = getLayoutParams().height == -2;
        } else {
            z2 = false;
            z3 = false;
        }
        boolean z4 = z3 && z2;
        if (width != 0 || height != 0 || z4) {
            if (TextUtils.isEmpty(this.c)) {
                if (this.e != null) {
                    this.e.cancelRequest();
                    this.e = null;
                }
                a();
                return;
            }
            if (this.e != null && this.e.getRequestUrl() != null) {
                if (!this.e.getRequestUrl().equals(this.c)) {
                    this.e.cancelRequest();
                    a();
                } else {
                    return;
                }
            }
            int i = z3 ? 0 : width;
            if (z2) {
                height = 0;
            }
            this.e = this.d.get(this.c, new akh(this, z), i, height, scaleType);
        }
    }

    private final void a() {
        if (this.a != 0) {
            setImageResource(this.a);
        } else if (this.b != null) {
            setImageBitmap(this.b);
        } else {
            setImageBitmap(null);
        }
    }

    @Override // android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        a(true);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
        if (this.e != null) {
            this.e.cancelRequest();
            setImageBitmap(null);
            this.e = null;
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        invalidate();
    }
}

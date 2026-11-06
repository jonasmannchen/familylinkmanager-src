package com.google.android.gms.kids.setup.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import com.android.volley.toolbox.NetworkImageView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class EnhancedNetworkImageView extends NetworkImageView {
    private Bitmap c;

    public EnhancedNetworkImageView(Context context) {
        this(context, null);
    }

    public EnhancedNetworkImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public EnhancedNetworkImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // com.android.volley.toolbox.NetworkImageView
    public void setDefaultImageResId(int i) {
        super.setDefaultImageResId(i);
        setImageResource(i);
    }

    @Override // com.android.volley.toolbox.NetworkImageView
    public void setDefaultImageBitmap(Bitmap bitmap) {
        this.c = bitmap;
        setImageBitmap(bitmap);
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        if (bitmap == null) {
            bitmap = this.c;
        }
        super.setImageBitmap(bitmap);
    }
}

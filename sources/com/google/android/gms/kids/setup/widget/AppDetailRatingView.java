package com.google.android.gms.kids.setup.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.chimeraresources.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class AppDetailRatingView extends LinearLayout {
    public final EnhancedNetworkImageView a;
    public final TextView b;
    public final TextView c;
    public final TextView d;

    public AppDetailRatingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOrientation(0);
        setGravity(17);
        View.inflate(context, R.layout.view_app_detail_rating, this);
        this.a = (EnhancedNetworkImageView) findViewById(R.id.kidsetup_app_detail_rating_icon);
        this.b = (TextView) findViewById(R.id.kidsetup_app_detail_rating_title);
        this.c = (TextView) findViewById(R.id.kidsetup_app_detail_rating_descriptors);
        this.d = (TextView) findViewById(R.id.kidsetup_app_detail_rating_interatcive_elements);
    }
}

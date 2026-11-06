package com.google.android.gms.kids.setup.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.TextView;
import com.google.android.chimeraresources.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class AppDetailDescriptionView extends LinearLayout {
    public final TextView a;
    public final Button b;
    public final LinearLayout c;
    public final LinearLayout d;
    public final TextView e;
    public final RatingBar f;
    public final TextView g;

    public AppDetailDescriptionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOrientation(1);
        View.inflate(context, R.layout.view_app_detail_description, this);
        this.a = (TextView) findViewById(R.id.kidsetup_app_detail_description_promotion);
        this.b = (Button) findViewById(R.id.kidsetup_app_detail_description_read_more);
        this.c = (LinearLayout) findViewById(R.id.kidsetup_app_detail_description_preview_image_container);
        this.d = (LinearLayout) findViewById(R.id.kidsetup_app_detail_description_rating_container);
        this.e = (TextView) findViewById(R.id.kidsetup_app_detail_description_rating);
        this.f = (RatingBar) findViewById(R.id.kidsetup_app_detail_description_rating_bar);
        this.g = (TextView) findViewById(R.id.kidsetup_app_detail_description_num_ratings);
    }
}

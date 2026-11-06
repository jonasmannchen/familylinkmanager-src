package com.google.android.gms.kids.setup.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.chimeraresources.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class AppDetailInfoView extends LinearLayout {
    public final TextView a;
    public final TextView b;
    public final TextView c;
    public final TextView d;
    public final TextView e;

    public AppDetailInfoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOrientation(0);
        setGravity(17);
        View.inflate(context, R.layout.view_app_detail_info, this);
        this.a = (TextView) findViewById(R.id.kidsetup_app_detail_info_downloads);
        this.b = (TextView) findViewById(R.id.kidsetup_app_detail_info_offered_by);
        this.c = (TextView) findViewById(R.id.kidsetup_app_detail_info_updated_on);
        this.d = (TextView) findViewById(R.id.kidsetup_app_detail_info_in_app_purchases_caption);
        this.e = (TextView) findViewById(R.id.kidsetup_app_detail_info_in_app_purchases);
    }
}

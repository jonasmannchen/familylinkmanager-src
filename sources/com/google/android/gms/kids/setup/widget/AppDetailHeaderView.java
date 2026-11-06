package com.google.android.gms.kids.setup.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;
import com.google.android.chimeraresources.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class AppDetailHeaderView extends LinearLayout {
    public final EnhancedNetworkImageView a;
    public final TextView b;
    public final TextView c;
    public final EnhancedNetworkImageView d;
    public final TextView e;
    public final ViewGroup f;
    public final Switch g;

    public AppDetailHeaderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOrientation(0);
        View.inflate(context, R.layout.view_app_detail_header, this);
        this.a = (EnhancedNetworkImageView) findViewById(R.id.kidsetup_app_detail_header_app_icon);
        this.b = (TextView) findViewById(R.id.kidsetup_app_detail_header_app_title);
        this.c = (TextView) findViewById(R.id.kidsetup_app_detail_header_app_developer);
        this.d = (EnhancedNetworkImageView) findViewById(R.id.kidsetup_app_detail_header_app_category_icon);
        this.e = (TextView) findViewById(R.id.kidsetup_app_detail_header_app_category_name);
        this.f = (ViewGroup) findViewById(R.id.kidsetup_app_detail_header_switch_container);
        this.g = (Switch) findViewById(R.id.kidsetup_app_detail_header_switch);
    }
}

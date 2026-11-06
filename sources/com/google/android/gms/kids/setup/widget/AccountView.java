package com.google.android.gms.kids.setup.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.chimeraresources.R;
import flm.coj;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class AccountView extends FrameLayout {
    private final EnhancedNetworkImageView a;
    private final TextView b;
    private final TextView c;

    public AccountView(Context context) {
        this(context, null);
    }

    public AccountView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        View.inflate(context, R.layout.view_generic_account, this);
        this.a = (EnhancedNetworkImageView) findViewById(R.id.generic_account_view_avatar);
        this.b = (TextView) findViewById(R.id.generic_account_view_name);
        this.c = (TextView) findViewById(R.id.generic_account_view_email);
    }

    public final void a(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2) || str.equals(str2)) {
            this.b.setText(str);
            this.c.setVisibility(8);
        } else {
            this.b.setText(str2);
            this.c.setText(str);
            this.c.setVisibility(0);
        }
        this.a.setDefaultImageResId(R.drawable.quantum_logo_avatar_circle_blue_color_192);
        coj.a(this.a, coj.a(str3));
    }
}
